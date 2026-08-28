package fun.crickclient.api.utils.music;

import fun.crickclient.CrickClient;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузка текстов песен из LRC-файлов.
 *
 * <p>Файл кладётся в {@code C:\CrickClient\crickclient\lyrics\}
 * с именем «Исполнитель-Название.lrc» (регистр не важен, пробелы — как в Spotify).
 * Формат строки: {@code [mm:ss.xx]текст}.
 *
 * <p>Если файла нет — возвращает null, и TextMusic работает в fallback-режиме
 * (караоке по названию трека).
 */
public final class LrcLoader {

    public static final class LyricLine {
        public long startMs;
        public long endMs;
        public String text;

        public LyricLine(long startMs, String text) {
            this.startMs = startMs;
            this.endMs = startMs;
            this.text = text;
        }
    }

    private static final Pattern TIME = Pattern.compile("^\\[(\\d{1,3}):([0-5]\\d(?:\\.\\d{1,2})?)\\](.*)$");
    private static final long NEGATIVE_CACHE_MS = 30_000L;

    private static final Map<String, List<LyricLine>> cache = new HashMap<>();
    private static final Map<String, Long> negativeCache = new HashMap<>();

    private LrcLoader() { }

    public static List<LyricLine> load(String artist, String title) {
        if (artist == null || title == null) return null;
        String key = (artist + "||" + title).toLowerCase(Locale.ROOT);

        Long negative = negativeCache.get(key);
        if (negative != null && System.currentTimeMillis() - negative < NEGATIVE_CACHE_MS) {
            return null;
        }

        List<LyricLine> cached = cache.get(key);
        if (cached != null) return cached;

        File file = resolveFile(artist, title);
        if (file == null || !file.exists() || !file.isFile()) {
            negativeCache.put(key, System.currentTimeMillis());
            return null;
        }

        try {
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            List<LyricLine> result = new ArrayList<>();
            long prevStart = -1L;

            for (String raw : lines) {
                Matcher matcher = TIME.matcher(raw.trim());
                if (!matcher.find()) continue;

                String text = matcher.group(3).trim();
                if (text.isEmpty()) continue;

                long startMs = parseTime(matcher.group(1), matcher.group(2));
                if (prevStart >= 0L && startMs <= prevStart) continue;
                prevStart = startMs;
                result.add(new LyricLine(startMs, text));
            }

            if (result.isEmpty()) {
                negativeCache.put(key, System.currentTimeMillis());
                return null;
            }

            for (int i = 0; i < result.size(); i++) {
                LyricLine current = result.get(i);
                LyricLine next = i + 1 < result.size() ? result.get(i + 1) : null;
                current.endMs = next != null ? next.startMs : current.startMs + 20_000L;
            }

            cache.put(key, result);
            return result;
        } catch (Exception e) {
            negativeCache.put(key, System.currentTimeMillis());
            return null;
        }
    }

    private static File resolveFile(String artist, String title) {
        File base = CrickClient.INSTANCE != null
                ? CrickClient.INSTANCE.globalsDir
                : new File("C:\\CrickClient", "crickclient");
        File dir = new File(base, "lyrics");
        if (!dir.exists() && !dir.mkdirs()) {
            return null;
        }

        String artistPart = sanitize(artist);
        String titlePart = sanitize(title);

        File primary = new File(dir, artistPart + "-" + titlePart + ".lrc");
        if (primary.exists()) return primary;

        // Частый случай: файл назван просто по названию трека.
        File fallback = new File(dir, titlePart + ".lrc");
        if (fallback.exists()) return fallback;

        return primary;
    }

    private static long parseTime(String minutes, String seconds) {
        long min = Long.parseLong(minutes);
        long sec;
        long frac = 0L;
        int dot = seconds.indexOf('.');
        if (dot >= 0) {
            sec = Long.parseLong(seconds.substring(0, dot));
            String fracPart = seconds.substring(dot + 1);
            frac = (long) (Float.parseFloat("0." + fracPart) * 1000F);
        } else {
            sec = Long.parseLong(seconds);
        }
        return min * 60_000L + sec * 1000L + frac;
    }

    private static String sanitize(String value) {
        if (value == null) return "";
        String clean = value.replaceAll("[\\\\/:*?\"<>|]", "-").trim();
        clean = clean.replaceAll("\\s+", " ");
        if (clean.length() > 80) clean = clean.substring(0, 80);
        return clean;
    }
}
