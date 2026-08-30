package fun.crickclient.mixin;

import fun.crickclient.client.ui.menu.CrickMainMenu;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Полностью заменяет стандартный Main Menu Minecraft на кастомный
 * {@link CrickMainMenu}.
 * <p>
 * Обрабатывает каждый случай, когда Minecraft (или мод) делает
 * {@code setScreen(new TitleScreen(...))}: vanilla init отменяется, а вместо
 * титульного экрана открывается CrickMainMenu. Новый инстанс меню каждый раз,
 * поэтому повторный вход (из мира/мультиплеера) перезапускает входную анимацию.
 */
@Mixin(TitleScreen.class)
public class TitleScreenMixin {

    @Inject(method = "init", at = @At("HEAD"), cancellable = true)
    private void crickclient$replaceTitleScreen(CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null && client.currentScreen == (Object) this) {
            client.setScreen(new CrickMainMenu());
            ci.cancel();
        }
    }
}
