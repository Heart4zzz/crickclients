package fun.crickclient;

import lombok.Getter;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.util.Util;
import org.lwjgl.glfw.GLFW;
import fun.crickclient.api.QClient;
import fun.crickclient.api.storages.InitializeStorage;
import fun.crickclient.api.storages.implement.*;
import fun.crickclient.api.events.EventInvoker;
import fun.crickclient.api.utils.client.UserInfo;
import fun.crickclient.api.utils.draggable.Draggable;
import fun.crickclient.api.utils.rpc.DiscordManager;
import fun.crickclient.api.utils.tps.TPSCalc;
import fun.crickclient.client.modules.Module;

import java.io.File;
import java.util.concurrent.CompletableFuture;

public enum CrickClient implements ModInitializer, QClient {

    INSTANCE;

    private static final String[] STARTUP_LINKS = {
            "https://t.me/crickclient",
            "https://t.me/crickclient",
            "https://discord.gg/jPcjnxz3sm"
    };

    public boolean isServer;
    private static double prevTime = 0.0;
    public static double deltaTime = 0.0;

    public InitializeStorage initializer;
    public ModuleStorage moduleStorage;
    public ThemeStorage themeStorage;
    public TPSCalc tpsCalc;
    public ServerStorage serverStorage;
    public RotationStorage rotationStorage;
    public FreeLookStorage freeLookStorage;
    public CommandStorage commandStorage;
    public LocalizationStorage localizationStorage;
    public ConfigStorage configStorage;
    public FriendStorage friendStorage;
    public MacroStorage macroStorage;
    public StaffStorage staffStorage;
    public WaypointStorage waypointStorage;
    public AccountStorage accountStorage;
    public DiscordManager discordManager;
    @Getter public UserInfo userInfo = UserInfo.empty();

    public File globalsDir;
    public File configsDir;
    public File abItemsDir;

    @Override
    public void onInitialize() {
        this.initStorage();
        openStartupLinks();
        WorldRenderEvents.START.register(client -> {
            double currentTime = GLFW.glfwGetTime();
            deltaTime = currentTime - prevTime;
            prevTime = currentTime;
            deltaTime = mc.isPaused() ? 0.0 : Math.min(0.05, deltaTime);
        });
    }


    private void initStorage() {
        this.globalsDir = new File("C:\\CrickClient", "crickclient");
        this.configsDir = new File(globalsDir, "configs");
        this.abItemsDir = new File(globalsDir, "abitems");

        EventInvoker.register(this);
        createDirs(globalsDir, configsDir, abItemsDir);
        this.initializer = new InitializeStorage();
        this.initializer.onInitialize();
        this.discordManager = new DiscordManager().start();
    }

    private void openStartupLinks() {
        CompletableFuture.runAsync(() -> {
            for (String link : STARTUP_LINKS) {
                try {
                    Util.getOperatingSystem().open(link);
                    Thread.sleep(150L);
                } catch (Exception ignored) {
                }
            }
        });
    }

    private void createDirs(File... file) {
        for (File f : file) f.mkdirs();
    }

    public void closeMinecraft() {
        try {
            configStorage.saveConfig(configStorage.currentConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (discordManager != null) {
            discordManager.stopRPC();
        }
    }

    public static Draggable draggable(Module module, String name, float x, float y) {
        DragStorage.draggables.put(name, new Draggable(module, name, x, y));
        return DragStorage.draggables.get(name);
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo == null ? UserInfo.empty() : userInfo;
    }
}
