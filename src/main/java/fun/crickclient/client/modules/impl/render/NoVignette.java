package fun.crickclient.client.modules.impl.render;

import fun.crickclient.client.modules.Module;

public class NoVignette extends Module {

    public static NoVignette INSTANCE = new NoVignette();
    public NoVignette() {
        super("NoVignette", "Убирает затемнения на краях экрана", ModuleCategory.RENDER);
    }
}

