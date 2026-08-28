package rw.core;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.client.gui.screens.Screen;

public class C0256 implements ModMenuApi {
   public ConfigScreenFactory<?> getModConfigScreenFactory() {
      return var0 -> new Screen(var0);
   }
}
