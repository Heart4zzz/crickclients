package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.Map;
import net.minecraft.client.gui.font.glyphs.SpecialGlyphs$PixelProvider;

record Rec0082() implements SpecialGlyphs$PixelProvider {
   private final Map<Long, Integer> f1000;

   Rec0082(Map<Long, Integer> var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0082,"pairs",Rec0082::f1000>(this, var1);
   }

   public int m4000(int var1, int var2) {
      Integer var3 = this.f1000.get((long)var1 << 32 | var2 & 4294967295L);
      return var3 == null ? Integer.MIN_VALUE : var3;
   }

   public Map<Long, Integer> m6000() {
      return this.f1000;
   }
}
