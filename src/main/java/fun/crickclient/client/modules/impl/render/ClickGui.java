package fun.crickclient.client.modules.impl.render;

import fun.crickclient.api.utils.client.ClientSoundPlayer;
import fun.crickclient.client.modules.Module;
import fun.crickclient.client.modules.settings.implement.FloatSetting;
import fun.crickclient.client.ui.clickgui.ClickGuiFrame;
import org.lwjgl.glfw.GLFW;

/**
 * Графическое меню настройки модулей.
 * Модуль сам себя выключает — он нужен только как «кнопка открытия» и хранилище размера окна.
 */
public class ClickGui extends Module {

    public static ClickGui INSTANCE = new ClickGui();

    public final FloatSetting size = new FloatSetting("Размер", 0.80f, 0.7f, 1.4f, 0.05f);

    private ClickGuiFrame clickGuiFrame;

    public ClickGui() {
        super("ClickGui", "Графическое меню настройки модулей", ModuleCategory.RENDER);
        addSettings(size);
        setKey(GLFW.GLFW_KEY_RIGHT_SHIFT);
    }

    /** Открывает окно клик гуи (используется биндом и хоткеем RIGHT_SHIFT). */
    public void openScreen() {
        if (clickGuiFrame == null) clickGuiFrame = new ClickGuiFrame();
        ClientSoundPlayer.playSound("opengui.wav", 0.6, 1.0f);
        mc.setScreen(clickGuiFrame);
        clickGuiFrame.playOpenAnimation();
    }

    @Override
    public void onEnable() {
        openScreen();
        setEnable(false);
    }
}
