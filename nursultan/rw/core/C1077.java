package rw.core;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class C1077 {
   static {
      try {
         f1000[QuadAtlas.BLOCK.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         f1000[QuadAtlas.ITEM.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}
