package rw.core;

import java.util.List;
import net.minecraft.client.gui.font.glyphs.SpecialGlyphs$PixelProvider;

public final class C0270 {
   private static final int f1000 = 4;
   private final int f2000;
   private final List<List<SpecialGlyphs$PixelProvider>> f3000;

   C0270(int var1, List<List<SpecialGlyphs$PixelProvider>> var2) {
      this.f2000 = var1;
      this.f3000 = var2;
   }

   public int m2000() {
      return this.f2000;
   }

   public int m4000(int var1, int var2) {
      int var3 = 0;

      for (List var5 : this.f3000) {
         for (SpecialGlyphs$PixelProvider var7 : var5) {
            int var8 = var7.getColor(var1, var2);
            if (var8 != Integer.MIN_VALUE) {
               var3 += var8;
               break;
            }
         }
      }

      return var3;
   }

   public boolean m6000() {
      return this.f3000.isEmpty();
   }

   public static C0270 m8000(byte[] var0) {
      try {
         return new rw.setting.C0028(var0).m20000();
      } catch (RuntimeException var2) {
         return new C0270(1000, List.of());
      }
   }
}
