package fun.crickclient.api.storages.implement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.crickclient.CrickClient;
import fun.crickclient.api.utils.client.ClientAccount;
import lombok.Getter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/**
 * Хранилище сохранённых аккаунтов (профилей) клиента.
 * <p>
 * Отвечает за модель данных и персистентность: список аккаунтов, текущий
 * выбранный профиль, добавление / удаление / переименование / выбор.
 * Файл — {@code accounts.json} рядом с конфигами клиента.
 * <p>
 * UI (Alt Manager, Main Menu) читает состояние отсюда и не хранит данные сам.
 */
public class AccountStorage {

    public static final int MAX_NAME_LENGTH = 16;
    public static final int MIN_NAME_LENGTH = 3;

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Getter
    private final List<ClientAccount> accounts = new ArrayList<>();

    private String selectedId;

    public AccountStorage() {
        load();
    }

    // ===================== Чтение состояния =====================

    public ClientAccount getSelected() {
        if (selectedId == null) {
            return null;
        }
        for (ClientAccount account : accounts) {
            if (account.getId() != null && account.getId().equals(selectedId)) {
                return account;
            }
        }
        return null;
    }

    public boolean isSelected(ClientAccount account) {
        return account != null && account.getId() != null && account.getId().equals(selectedId);
    }

    public boolean hasUsername(String username) {
        if (username == null) {
            return false;
        }
        String normalized = username.toLowerCase(Locale.ROOT);
        for (ClientAccount account : accounts) {
            if (account.getUsername() != null
                    && account.getUsername().toLowerCase(Locale.ROOT).equals(normalized)) {
                return true;
            }
        }
        return false;
    }

    // ===================== Изменение состояния =====================

    /**
     * Добавляет аккаунт. Возвращает {@code null}, если имя невалидно или уже занято.
     */
    public ClientAccount addAccount(String username) {
        String name = username == null ? "" : username.trim();
        if (!isValidName(name) || hasUsername(name)) {
            return null;
        }
        ClientAccount account = new ClientAccount(UUID.randomUUID().toString(), name, System.currentTimeMillis());
        accounts.add(account);
        save();
        return account;
    }

    /**
     * Удаляет аккаунт. Если удалён выбранный — выбор сбрасывается.
     */
    public boolean removeAccount(String id) {
        if (id == null) {
            return false;
        }
        boolean removed = accounts.removeIf(a -> id.equals(a.getId()));
        if (removed) {
            if (id.equals(selectedId)) {
                selectedId = null;
            }
            save();
        }
        return removed;
    }

    /**
     * Переименовывает аккаунт. Возвращает {@code false} при невалидном/занятом имени.
     */
    public boolean renameAccount(String id, String newUsername) {
        String name = newUsername == null ? "" : newUsername.trim();
        if (!isValidName(name)) {
            return false;
        }
        for (ClientAccount account : accounts) {
            if (id.equals(account.getId())) {
                if (account.getUsername().equals(name)) {
                    return true;
                }
                if (hasUsername(name)) {
                    return false;
                }
                account.setUsername(name);
                save();
                return true;
            }
        }
        return false;
    }

    /**
     * Выбирает аккаунт как текущий профиль. Выбор сохраняется между запусками.
     */
    public void selectAccount(String id) {
        if (id == null) {
            return;
        }
        if (id.equals(selectedId)) {
            return;
        }
        for (ClientAccount account : accounts) {
            if (id.equals(account.getId())) {
                selectedId = id;
                save();
                return;
            }
        }
    }

    // ===================== Валидация =====================

    /** Валидный ник Minecraft: 3–16 символов, только a–z, 0–9, «_». */
    public static boolean isValidName(String name) {
        if (name == null) {
            return false;
        }
        int length = name.length();
        if (length < MIN_NAME_LENGTH || length > MAX_NAME_LENGTH) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char c = name.charAt(i);
            boolean allowed = (c >= 'a' && c <= 'z')
                    || (c >= 'A' && c <= 'Z')
                    || (c >= '0' && c <= '9')
                    || c == '_';
            if (!allowed) {
                return false;
            }
        }
        return true;
    }

    // ===================== Персистентность =====================

    private File file() {
        return new File(CrickClient.INSTANCE.globalsDir, "accounts.json");
    }

    private void load() {
        try {
            File file = file();
            if (!file.exists()) {
                return;
            }
            try (Reader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
                JsonObject root = JsonParser.parseReader(reader).getAsJsonObject();
                if (root.has("selected")) {
                    selectedId = root.get("selected").getAsString();
                    if (selectedId.isEmpty()) {
                        selectedId = null;
                    }
                }
                if (root.has("accounts")) {
                    JsonArray array = root.getAsJsonArray("accounts");
                    for (JsonElement element : array) {
                        ClientAccount account = gson.fromJson(element, ClientAccount.class);
                        if (account != null && account.getId() != null && isValidName(account.getUsername())) {
                            accounts.add(account);
                        }
                    }
                }
            }
            // Ссылка на несуществующий аккаунт после повреждения/ручной правки — сброс.
            if (selectedId != null && getSelected() == null) {
                selectedId = null;
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    private void save() {
        try {
            JsonObject root = new JsonObject();
            root.addProperty("selected", selectedId == null ? "" : selectedId);
            JsonArray array = new JsonArray();
            for (ClientAccount account : accounts) {
                array.add(gson.toJsonTree(account));
            }
            root.add("accounts", array);

            File file = file();
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try (Writer writer = new OutputStreamWriter(new FileOutputStream(file, false), StandardCharsets.UTF_8)) {
                writer.write(gson.toJson(root));
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
