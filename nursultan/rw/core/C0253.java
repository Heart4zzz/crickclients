package rw.core;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeInit;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AfterMouseScroll;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseRelease;
import net.minecraft.server.commands.TeamCommand;
import rw.defs.Enum0016;

public class C0253 implements ClientModInitializer {
   public void onInitializeClient() {
      TeamCommand.N();
      ScreenEvents.BEFORE_INIT.register((BeforeInit)(var0, var1, var2, var3) -> {
         ScreenMouseEvents.allowMouseClick(var1).register((AllowMouseClick)(var1x, var2x) -> {
            Enum0016 var3x = Enum0016.m6000(var2x.v());
            return var3x != null ? !TeamCommand.N(var1, var2x.n(), var2x.t(), var3x) : true;
         });
         ScreenMouseEvents.allowMouseRelease(var1).register((AllowMouseRelease)(var1x, var2x) -> {
            Enum0016 var3x = Enum0016.m6000(var2x.v());
            return var3x != null ? !TeamCommand.y(var1, var2x.n(), var2x.t(), var3x) : true;
         });
         ScreenMouseEvents.afterMouseScroll(var1).register((AfterMouseScroll)(var1x, var2x, var4, var6, var8, var10) -> TeamCommand.N(var1, var2x, var4, var8));
      });
   }
}
