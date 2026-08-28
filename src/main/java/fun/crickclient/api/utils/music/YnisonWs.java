package fun.crickclient.api.utils.music;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 * Минимальный WebSocket-клиент (RFC 6455) поверх raw-сокета — ровно то, что нужно
 * для ynison: TLS, HTTP/1.1 upgrade, текст-фреймы, ping/pong, close.
 *
 * <p>{@code java.net.http.WebSocket} для этой задачи не подходит: установка
 * заголовка Sec-WebSocket-Protocol запрещена (IllegalArgumentException "Illegal
 * header"), а валидация subprotocols по RFC-токенам отклоняет JSON устройства,
 * который ynison передаёт третьим subprotocol. Поэтому handshake выполняется
 * вручную, дальше идут обычные фреймы.
 *
 * <p>Односокетное использование: один поток читает (readText), тот же или другой
 * шлёт (sendText) — записи синхронизированы, чтение однопоточное.
 */
final class YnisonWs {

    private static final String WS_GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    private static final SecureRandom RAND = new SecureRandom();
    private static final int MAX_MESSAGE = 16 * 1024 * 1024;

    private final Socket socket;
    private final DataInputStream in;
    private final OutputStream out;
    private final AtomicBoolean closeSent = new AtomicBoolean();
    private volatile boolean closed;

    private YnisonWs(Socket socket, DataInputStream in, OutputStream out) {
        this.socket = socket;
        this.in = in;
        this.out = out;
    }

    /**
     * Подключение + upgrade-handshake.
     *
     * @param host             хост (без схемы)
     * @param port             порт (обычно 443)
     * @param path             путь запроса
     * @param headers          доп. заголовки, включая Sec-WebSocket-Protocol
     * @param connectTimeoutMs таймаут TCP-подключения
     * @param readTimeoutMs    таймаут ожидания данных (SocketTimeoutException при молчании)
     */
    static YnisonWs connect(String host, int port, String path,
                            Map<String, String> headers,
                            int connectTimeoutMs, int readTimeoutMs) throws IOException {
        Socket plain = new Socket();
        try {
            plain.connect(new InetSocketAddress(host, port), connectTimeoutMs);
            plain.setTcpNoDelay(true);
            plain.setKeepAlive(true);
            plain.setSoTimeout(readTimeoutMs);

            Socket sock;
            DataInputStream in;
            OutputStream out;
            if (port == 443) {
                SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                SSLSocket tls = (SSLSocket) factory.createSocket(plain, host, port, true);
                try {
                    // ynison говорит HTTP/1.1 Upgrade — не даём ALPN выбрать h2
                    SSLParameters p = tls.getSSLParameters();
                    p.setApplicationProtocols(new String[]{"http/1.1"});
                    tls.setSSLParameters(p);
                } catch (Exception ignored) {
                }
                tls.startHandshake();
                sock = tls;
                in = new DataInputStream(new BufferedInputStream(tls.getInputStream()));
                out = tls.getOutputStream();
            } else {
                sock = plain;
                in = new DataInputStream(new BufferedInputStream(plain.getInputStream()));
                out = plain.getOutputStream();
            }

            String key = Base64.getEncoder().encodeToString(randomBytes(16));
            StringBuilder req = new StringBuilder(512);
            req.append("GET ").append(path).append(" HTTP/1.1\r\n");
            req.append("Host: ").append(host).append("\r\n");
            req.append("Upgrade: websocket\r\n");
            req.append("Connection: Upgrade\r\n");
            req.append("Sec-WebSocket-Key: ").append(key).append("\r\n");
            req.append("Sec-WebSocket-Version: 13\r\n");
            for (Map.Entry<String, String> e : headers.entrySet()) {
                req.append(e.getKey()).append(": ").append(e.getValue()).append("\r\n");
            }
            req.append("\r\n");
            out.write(req.toString().getBytes(StandardCharsets.UTF_8));
            out.flush();

            String statusLine = readLine(in);
            int status = parseStatusCode(statusLine);
            Map<String, String> respHeaders = new LinkedHashMap<>();
            String line;
            while ((line = readLine(in)).length() > 0) {
                int idx = line.indexOf(':');
                if (idx > 0) {
                    respHeaders.put(line.substring(0, idx).trim().toLowerCase(),
                            line.substring(idx + 1).trim());
                }
            }
            if (status != 101) {
                throw new IOException("WebSocket handshake failed: " + statusLine);
            }
            String expected = Base64.getEncoder().encodeToString(sha1(key + WS_GUID));
            String accept = respHeaders.get("sec-websocket-accept");
            if (accept == null || !accept.equalsIgnoreCase(expected)) {
                throw new IOException("WebSocket handshake failed: bad Sec-WebSocket-Accept");
            }
            return new YnisonWs(sock, in, out);
        } catch (IOException e) {
            closeQuietly(plain);
            throw e;
        } catch (Exception e) {
            closeQuietly(plain);
            throw new IOException(e);
        }
    }

    /** Отправка текст-фрейма (маскируется, как требует RFC для клиента). */
    void sendText(String text) throws IOException {
        byte[] payload = text.getBytes(StandardCharsets.UTF_8);
        synchronized (out) {
            if (closed) throw new IOException("Socket closed");
            ByteArrayOutputStream b = new ByteArrayOutputStream(payload.length + 16);
            b.write(0x81);
            writeLength(b, payload.length, true);
            byte[] mask = new byte[4];
            RAND.nextBytes(mask);
            b.write(mask);
            for (int i = 0; i < payload.length; i++) {
                b.write(payload[i] ^ mask[i & 3]);
            }
            out.write(b.toByteArray());
            out.flush();
        }
    }

    /**
     * Читает одно текстовое сообщение (склейка фрагментов), отвечает на ping.
     *
     * @return текст, либо null, если сервер закрыл соединение
     * @throws java.net.SocketTimeoutException если сокет молчал readTimeout-миллисекунд
     */
    String readText() throws IOException {
        ByteArrayOutputStream msg = new ByteArrayOutputStream();
        while (true) {
            int b0 = in.read();
            int b1 = in.read();
            if (b0 < 0 || b1 < 0) throw new IOException("Connection closed");
            boolean fin = (b0 & 0x80) != 0;
            if ((b0 & 0x70) != 0) throw new IOException("Unexpected RSV bits");
            int opcode = b0 & 0x0F;
            boolean masked = (b1 & 0x80) != 0;
            long len = b1 & 0x7F;
            if (len == 126) {
                len = ((long) in.read() << 8) | in.read();
            } else if (len == 127) {
                len = 0;
                for (int i = 0; i < 8; i++) len = (len << 8) | in.read();
            }
            if (len > MAX_MESSAGE) throw new IOException("Message too large: " + len);
            byte[] mask = new byte[4];
            if (masked) in.readFully(mask);
            byte[] payload = new byte[(int) len];
            in.readFully(payload);

            if (opcode == 0x9) {           // ping → pong
                sendPong(payload);
                continue;
            }
            if (opcode == 0xA) {           // pong
                continue;
            }
            if (opcode == 0x8) {           // close
                closed = true;
                sendCloseFrame(1000);
                return null;
            }
            if (opcode == 0x1 || opcode == 0x0) {
                if (masked) unmask(payload, mask);
                msg.write(payload);
                if (msg.size() > MAX_MESSAGE) throw new IOException("Message too large");
                if (fin) return msg.toString(StandardCharsets.UTF_8);
                continue;
            }
            throw new IOException("Unexpected opcode: " + opcode);
        }
    }

    boolean isClosed() {
        return closed;
    }

    /** Close-фрейм (если не шло ещё) + закрытие сокета. */
    void close() {
        sendCloseFrame(1000);
        closeQuietly(socket);
    }

    // ===================== приватные =====================

    private void sendPong(byte[] payload) {
        synchronized (out) {
            try {
                if (closed) return;
                ByteArrayOutputStream b = new ByteArrayOutputStream(payload.length + 16);
                b.write(0x8A);
                writeLength(b, payload.length, true);
                byte[] mask = new byte[4];
                RAND.nextBytes(mask);
                b.write(mask);
                for (int i = 0; i < payload.length; i++) {
                    b.write(payload[i] ^ mask[i & 3]);
                }
                out.write(b.toByteArray());
                out.flush();
            } catch (IOException ignored) {
            }
        }
    }

    private void sendCloseFrame(int code) {
        synchronized (out) {
            if (!closeSent.compareAndSet(false, true)) return;
            closed = true;
            try {
                ByteArrayOutputStream b = new ByteArrayOutputStream(10);
                b.write(0x88);
                b.write(0x82);
                byte[] mask = new byte[4];
                RAND.nextBytes(mask);
                b.write(mask);
                b.write(((code >> 8) & 0xFF) ^ mask[0]);
                b.write((code & 0xFF) ^ mask[1]);
                out.write(b.toByteArray());
                out.flush();
            } catch (IOException ignored) {
            }
        }
    }

    /**
     * Длина фрейма в заголовке. {@code masked=true} выставляет бит MASK (0x80)
     * в первом байте — обязательно для маскированных фреймов (RFC 6455, §5.2).
     */
    private static void writeLength(ByteArrayOutputStream b, int len, boolean masked) {
        int top = masked ? 0x80 : 0;
        if (len < 126) {
            b.write(top | len);
        } else if (len <= 0xFFFF) {
            b.write(top | 126);
            b.write((len >> 8) & 0xFF);
            b.write(len & 0xFF);
        } else {
            b.write(top | 127);
            long l = len & 0xFFFFFFFFL;
            for (int i = 7; i >= 0; i--) {
                b.write((int) ((l >> (i * 8)) & 0xFF));
            }
        }
    }

    private static String readLine(InputStream in) throws IOException {
        ByteArrayOutputStream b = new ByteArrayOutputStream(64);
        int c;
        int n = 0;
        while ((c = in.read()) != -1) {
            if (c == '\n') break;
            if (c != '\r') b.write(c);
            if (++n > 16 * 1024) throw new IOException("Header line too long");
        }
        return b.toString(StandardCharsets.UTF_8);
    }

    private static int parseStatusCode(String statusLine) {
        String[] parts = statusLine.split(" ");
        if (parts.length >= 2) {
            try {
                return Integer.parseInt(parts[1]);
            } catch (NumberFormatException ignored) {
            }
        }
        return 0;
    }

    private static void unmask(byte[] payload, byte[] mask) {
        for (int i = 0; i < payload.length; i++) {
            payload[i] ^= mask[i & 3];
        }
    }

    private static byte[] randomBytes(int n) {
        byte[] b = new byte[n];
        RAND.nextBytes(b);
        return b;
    }

    private static byte[] sha1(String s) {
        try {
            return MessageDigest.getInstance("SHA-1").digest(s.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private static void closeQuietly(Socket s) {
        if (s == null) return;
        try {
            s.close();
        } catch (IOException ignored) {
        }
    }
}
