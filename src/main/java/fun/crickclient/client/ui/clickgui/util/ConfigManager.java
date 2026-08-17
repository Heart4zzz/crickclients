package fun.crickclient.client.ui.clickgui.util;

import fun.crickclient.CrickClient;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Работа с конфигами для вкладки «Configs» в клик гуи.
 * Обёртка над {@code ConfigStorage} этого клиента (файлы {@code *.crick}).
 */
public final class ConfigManager {

    private static final String EXTENSION = ".crick";

    private ConfigManager() {
    }

    public static List<String> getUserConfigs() {
        List<String> result = new ArrayList<>();
        File dir = CrickClient.INSTANCE.configsDir;
        if (dir == null || !dir.exists() || !dir.isDirectory()) return result;

        File[] files = dir.listFiles((parent, name) -> name.toLowerCase().endsWith(EXTENSION));
        if (files == null) return result;

        for (File file : files) {
            String name = file.getName();
            result.add(name.substring(0, name.length() - EXTENSION.length()));
        }
        return result;
    }

    public static String getCurrentConfig() {
        return CrickClient.INSTANCE.configStorage == null ? "default" : CrickClient.INSTANCE.configStorage.currentConfig;
    }

    public static void save(String name) {
        if (name == null || name.isBlank()) return;
        try {
            CrickClient.INSTANCE.configStorage.saveConfig(name.trim());
        } catch (Exception ignored) {
        }
    }

    public static void load(String name) {
        if (name == null || name.isBlank()) return;
        try {
            CrickClient.INSTANCE.configStorage.loadConfig(name.trim());
            CrickClient.INSTANCE.configStorage.currentConfig = name.trim();
        } catch (Exception ignored) {
        }
    }

    public static boolean delete(String name) {
        if (name == null || name.isBlank()) return false;
        File dir = CrickClient.INSTANCE.configsDir;
        if (dir == null) return false;
        File file = new File(dir, name.trim() + EXTENSION);
        return file.exists() && file.delete();
    }
}
