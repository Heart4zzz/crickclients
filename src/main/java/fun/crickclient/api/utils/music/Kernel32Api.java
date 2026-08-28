package fun.crickclient.api.utils.music;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.WString;
import com.sun.jna.ptr.IntByReference;

import java.util.Arrays;
import java.util.List;

/**
 * Минимальная JNA-обёртка над kernel32 для работы с именованными пайпами
 * Windows. Используется для чтения состояния локального Spotify
 * (пайп {@code \\.\pipe\spotipc-<uid>}).
 */
public final class Kernel32Api {

    /** false на не-Windows — чтобы загрузка класса не рвала клиент на других ОС. */
    public static final boolean AVAILABLE = isWindows();
    public static final Kernel32 INSTANCE = AVAILABLE ? Native.load("kernel32", Kernel32.class) : null;

    public static final long INVALID_HANDLE_VALUE = -1L;
    public static final int PIPE_ACCESS_DUPLEX = 0x3;
    public static final int FILE_SHARE_READ = 0x1;
    public static final int FILE_SHARE_WRITE = 0x2;
    public static final int OPEN_EXISTING = 3;

    private Kernel32Api() { }

    private static boolean isWindows() {
        String os = System.getProperty("os.name", "").toLowerCase(java.util.Locale.ROOT);
        return os.contains("windows");
    }

    public interface Kernel32 extends Library {
        long CreateFileW(String lpFileName, int dwDesiredAccess, int dwShareMode, Pointer lpSecurityAttributes,
                         int dwCreationDisposition, int dwFlagsAndAttributes, Pointer hTemplateFile);

        boolean WriteFile(long hFile, byte[] lpBuffer, int nNumberOfBytesToWrite,
                          IntByReference lpNumberOfBytesWritten, Pointer lpOverlapped);

        boolean ReadFile(long hFile, byte[] lpBuffer, int nNumberOfBytesToRead,
                         IntByReference lpNumberOfBytesRead, Pointer lpOverlapped);

        boolean CloseHandle(long hObject);

        long FindFirstFileW(String lpFileName, FindDataW lpFindFileData);

        boolean FindClose(long hFindFile);
    }

    /** WIN32_FIND_DATAW (то, что реально нужно). */
    public static final class FindDataW extends Structure {
        public int dwFileAttributes;
        public int ftCreationTimeLow;
        public int ftCreationTimeHigh;
        public int ftLastAccessTimeLow;
        public int ftLastAccessTimeHigh;
        public int ftLastWriteTimeLow;
        public int ftLastWriteTimeHigh;
        public int nFileSizeHigh;
        public int nFileSizeLow;
        public int dwReserved0;
        public int dwReserved1;
        public WString cFileName = new WString(260);
        public byte[] cAlternateFileName = new byte[28];

        @Override
        protected List<String> getFieldOrder() {
            return Arrays.asList("dwFileAttributes",
                    "ftCreationTimeLow", "ftCreationTimeHigh",
                    "ftLastAccessTimeLow", "ftLastAccessTimeHigh",
                    "ftLastWriteTimeLow", "ftLastWriteTimeHigh",
                    "nFileSizeHigh", "nFileSizeLow",
                    "dwReserved0", "dwReserved1",
                    "cFileName", "cAlternateFileName");
        }
    }
}
