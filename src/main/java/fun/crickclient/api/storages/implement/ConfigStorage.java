package fun.crickclient.api.storages.implement;

import com.google.gson.*;

import fun.crickclient.CrickClient;
import fun.crickclient.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.crickclient.api.utils.cmd.macro.Macro;
import fun.crickclient.api.utils.draggable.Draggable;
import fun.crickclient.api.utils.namespaced.FileUtils;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.Setting;
import fun.crickclient.client.modules.settings.implement.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConfigStorage {

    public String currentConfig = "default";
    private final String extension = ".crick";

    public ConfigStorage() {
        loadAll();
        Runtime.getRuntime().addShutdownHook(new Thread(this::saveAll));
    }

    
    private void loadAll() {
        try {
            loadGlobals();
            loadConfig(currentConfig);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    
    private void saveAll() {
        try {
            saveGlobals();
            saveConfig(currentConfig);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    
    public void saveConfig(String config) throws Exception {
        File file = new File(CrickClient.INSTANCE.configsDir, config + extension);

        JsonObject object = new JsonObject();
        object.add("config", new JsonPrimitive(config));
        object.add("theme", new JsonPrimitive(CrickClient.INSTANCE.themeStorage.getThemes().name()));
        object.add("language", new JsonPrimitive(CrickClient.INSTANCE.localizationStorage.getLanguage().name()));
        object.add("modules", serializeModules());
        object.add("draggables", serializeDraggables());
        object.add("hud", serializeHudState());

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file, false), StandardCharsets.UTF_8)) {
            writer.write(new GsonBuilder()
                    .setPrettyPrinting()
                    .create()
                    .toJson(object));
        }

        this.currentConfig = config;
    }

    
    public void loadConfig(String config) throws Exception {
        if (!FileUtils.exists(CrickClient.INSTANCE.configsDir + "/" + config + extension)) return;
        JsonObject object;
        try (InputStream stream = Files.newInputStream(Paths.get(CrickClient.INSTANCE.configsDir + "/" + config + extension));
             Reader reader = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
            object = JsonParser.parseReader(reader).getAsJsonObject();
        }

        if (object.has("theme")) {
            String themeName = object.get("theme").getAsString();
            for (ThemeStorage.Themes theme : ThemeStorage.Themes.values()) {
                if (theme.name().equals(themeName)) {
                    CrickClient.INSTANCE.themeStorage.setThemes(theme);
                    break;
                }
            }
        }

        if (object.has("language")) {
            try {
                CrickClient.INSTANCE.localizationStorage.setLanguage(LocalizationStorage.Language.valueOf(object.get("language").getAsString()));
            } catch (Exception ignored) {
            }
        }

        if (object.has("draggables")) {
            deserializeDraggables(object.get("draggables").getAsJsonObject());
        }

        if (object.has("modules")) {
            deserializeModules(object.get("modules").getAsJsonObject());
        }

        if (object.has("hud")) {
            deserializeHudState(object.get("hud").getAsJsonObject());
        }

        this.currentConfig = config;
    }

    
    public void saveGlobals() throws Exception {
        File file = new File(CrickClient.INSTANCE.globalsDir, "globals" + extension);
        JsonObject object = new JsonObject();
        object.add("config", new JsonPrimitive(currentConfig));

        object.add("theme", new JsonPrimitive(CrickClient.INSTANCE.themeStorage.getThemes().name()));
        object.add("language", new JsonPrimitive(CrickClient.INSTANCE.localizationStorage.getLanguage().name()));

        object.add("draggables", serializeDraggables());
        object.add("hud", serializeHudState());

        JsonArray friendsArray = new JsonArray();
        CrickClient.INSTANCE.friendStorage.getFriends().forEach(friendsArray::add);
        object.add("friends", friendsArray);

        JsonArray staffsArray = new JsonArray();
        CrickClient.INSTANCE.staffStorage.getStaffs().forEach(staffsArray::add);
        object.add("staffs", staffsArray);

        JsonArray macrosArray = new JsonArray();
        CrickClient.INSTANCE.macroStorage.getMacros().forEach(macro -> {
            JsonObject macroObject = new JsonObject();
            macroObject.addProperty("name", macro.getName());
            macroObject.addProperty("command", macro.getCommand());
            macroObject.addProperty("key", macro.getBind().getKey());
            macrosArray.add(macroObject);
        });
        object.add("macros", macrosArray);

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file, false), StandardCharsets.UTF_8)) {
            writer.write(new GsonBuilder().setPrettyPrinting().create().toJson(object));
        }
    }

    
    public void loadGlobals() throws Exception {
        if (!FileUtils.exists(CrickClient.INSTANCE.globalsDir + "/" + "globals" + extension)) return;
        JsonObject object;
        try (InputStream stream = Files.newInputStream(Paths.get(CrickClient.INSTANCE.globalsDir + "/" + "globals" + extension));
             Reader reader = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
            object = JsonParser.parseReader(reader).getAsJsonObject();
        }

        if (object.has("config")) currentConfig = object.get("config").getAsString();

        if (object.has("theme")) {
            String themeName = object.get("theme").getAsString();
            for (ThemeStorage.Themes theme : ThemeStorage.Themes.values()) {
                if (theme.name().equals(themeName)) {
                    CrickClient.INSTANCE.themeStorage.setThemes(theme);
                    break;
                }
            }
        }

        if (object.has("language")) {
            try {
                CrickClient.INSTANCE.localizationStorage.setLanguage(LocalizationStorage.Language.valueOf(object.get("language").getAsString()));
            } catch (Exception ignored) {
            }
        }

        if (object.has("draggables")) {
            deserializeDraggables(object.get("draggables").getAsJsonObject());
        }

        if (object.has("hud")) {
            deserializeHudState(object.get("hud").getAsJsonObject());
        }

        if (object.has("friends")) {
            for (JsonElement element : object.get("friends").getAsJsonArray()) {
                if (CrickClient.INSTANCE.friendStorage.isFriend(element.getAsString())) continue;
                CrickClient.INSTANCE.friendStorage.add(element.getAsString());
            }
        }

        if (object.has("staffs")) {
            for (JsonElement element : object.get("staffs").getAsJsonArray()) {
                if (CrickClient.INSTANCE.staffStorage.isStaff(element.getAsString())) continue;
                CrickClient.INSTANCE.staffStorage.add(element.getAsString());
            }
        }

        if (object.has("macros")) {
            for (JsonElement element : object.get("macros").getAsJsonArray()) {
                try {
                    String name;
                    String command;
                    int key;

                    if (element.isJsonObject()) {
                        JsonObject macroObject = element.getAsJsonObject();
                        name = macroObject.has("name") ? macroObject.get("name").getAsString() : "";
                        command = macroObject.has("command") ? macroObject.get("command").getAsString() : "";
                        key = macroObject.has("key") ? macroObject.get("key").getAsInt() : -1;
                    } else {
                        String[] split = element.getAsString().split(":", 3);
                        if (split.length < 3) continue;
                        name = split[0];
                        command = split[1];
                        key = Integer.parseInt(split[2]);
                    }

                    if (name.isBlank() || CrickClient.INSTANCE.macroStorage.getMacro(name) != null) {
                        continue;
                    }

                    CrickClient.INSTANCE.macroStorage.add(new Macro(name, command, new BindSetting("bind", key)));
                } catch (Exception ignored) {
                }
            }
        }
    }

    private JsonObject serializeModules() {
        JsonObject modules = new JsonObject();
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            try {
                JsonObject object = new JsonObject();
                object.add("toggled", new JsonPrimitive(module.isEnable()));
                object.add("bind", new JsonPrimitive(module.getKey()));

                JsonObject settings = new JsonObject();
                for (Setting s : module.getSettings()) {
                    try {
                        if (s instanceof BooleanSetting bool) {
                            settings.add(s.name(), new JsonPrimitive(bool.isState()));
                        } else if (s instanceof FloatSetting num) {
                            settings.add(s.name(), new JsonPrimitive(num.getValue().floatValue()));
                        } else if (s instanceof ModeSetting mode) {
                            settings.add(s.name(), new JsonPrimitive(mode.getCurrent()));
                        } else if (s instanceof TextSetting text) {
                            settings.add(s.name(), new JsonPrimitive(text.get()));
                        } else if (s instanceof BindSetting bind) {
                            settings.add(s.name(), new JsonPrimitive(bind.getKey()));
                        } else if (s instanceof ListSetting list) {
                            JsonObject listObj = new JsonObject();
                            for (BooleanSetting setting : list.getSettings()) {
                                listObj.add(setting.name(), new JsonPrimitive(setting.isState()));
                            }
                            settings.add(list.name(), listObj);
                        }
                    } catch (Exception ignored) {
                    }
                }

                object.add("settings", settings);
                modules.add(module.getName(), object);
            } catch (Exception ignored) {
            }
        }

        return modules;
    }

    private void deserializeModules(JsonObject modules) {
        Map<Module, Boolean> targetStates = new LinkedHashMap<>();

        for (Module module : ModuleClass.INSTANCE.getObject()) {
            try {
                JsonObject object = modules.has(module.getName())
                        ? modules.get(module.getName()).getAsJsonObject()
                        : null;

                boolean toggled = object != null
                        && object.has("toggled")
                        && object.get("toggled").getAsBoolean();

                targetStates.put(module, toggled);

                if (module.isEnable()) {
                    module.setEnabled(false);
                }
            } catch (Exception ignored) {
                targetStates.put(module, false);
            }
        }

        for (Module module : ModuleClass.INSTANCE.getObject()) {
            try {
                if (!modules.has(module.getName())) {
                    continue;
                }

                JsonObject object = modules.get(module.getName()).getAsJsonObject();

                if (object.has("bind")) {
                    module.setKey(object.get("bind").getAsInt());
                }

                if (object.has("settings")) {
                    JsonObject settings = object.get("settings").getAsJsonObject();

                    for (Setting s : module.getSettings()) {
                        try {
                            if (!settings.has(s.name())) continue;

                            JsonElement element = settings.get(s.name());

                            if (s instanceof BooleanSetting bool) {
                                bool.setState(element.getAsBoolean());
                            } else if (s instanceof FloatSetting num) {
                                num.setValue(element.getAsFloat());
                            } else if (s instanceof ModeSetting mode) {
                                mode.set(element.getAsString());
                            } else if (s instanceof TextSetting text) {
                                text.setText(element.getAsString());
                            } else if (s instanceof BindSetting bind) {
                                bind.setKey(element.getAsInt());
                            } else if (s instanceof ListSetting list) {
                                JsonObject listObj = element.getAsJsonObject();
                                for (BooleanSetting setting : list.getSettings()) {
                                    if (listObj.has(setting.name())) {
                                        setting.setState(listObj.get(setting.name()).getAsBoolean());
                                    }
                                }
                            }
                        } catch (Exception ignored) {
                        }
                    }
                }

            } catch (Exception ignored) {
            }
        }

        for (Map.Entry<Module, Boolean> entry : targetStates.entrySet()) {
            try {
                entry.getKey().setEnabled(entry.getValue());
            } catch (Exception ignored) {
            }
        }
    }

    /**
     * Позиции HUD-элементов хранятся в draggables, а их настройки — обычные настройки модуля Interface,
     * поэтому отдельная секция "hud" больше не нужна (оставлена для совместимости старых конфигов).
     */
    private JsonObject serializeHudState() {
        return new JsonObject();
    }

    private void deserializeHudState(JsonObject hud) {
    }

    private JsonObject serializeDraggables() {
        JsonObject draggables = new JsonObject();
        for (Draggable drag : DragStorage.draggables.values()) {
            JsonObject object = new JsonObject();
            object.add("x", new JsonPrimitive(drag.getX()));
            object.add("y", new JsonPrimitive(drag.getY()));
            draggables.add(drag.getName(), object);
        }
        return draggables;
    }

    private void deserializeDraggables(JsonObject draggables) {
        for (String name : draggables.keySet()) {
            Draggable drag = DragStorage.draggables.get(name);
            if (drag == null) continue;

            JsonObject object = draggables.get(name).getAsJsonObject();
            if (object.has("x")) {
                drag.setX(object.get("x").getAsFloat());
            }
            if (object.has("y")) {
                drag.setY(object.get("y").getAsFloat());
            }
        }
    }
}
