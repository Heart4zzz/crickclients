package rw.data;

import java.lang.runtime.ObjectMethods;
import net.minecraft.client.gui.font.glyphs.SpecialGlyphs$PixelProvider;
import net.minecraft.client.gui.font.providers.UnihexProvider$IntContents;

record Rec0074() implements SpecialGlyphs$PixelProvider {
   private final Rec0077 f1000;
   private final UnihexProvider$IntContents f2000;
   private final UnihexProvider$IntContents f3000;
   private final int[][] f4000;

   public UnihexProvider$IntContents m2000() {
      return this.f3000;
   }

   Rec0074(Rec0077 var1, UnihexProvider$IntContents var2, UnihexProvider$IntContents var3, int[][] var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0074,"cov;c1;c2;adv",Rec0074::f1000,Rec0074::f2000,Rec0074::f3000,Rec0074::f4000>(this, var1);
   }

   public int[][] m6000() {
      return this.f4000;
   }

   public UnihexProvider$IntContents m8000() {
      return this.f2000;
   }

   public int m10000(int var1, int var2) {
      if (!this.f1000.m4000(var1)) {
         return Integer.MIN_VALUE;
      } else {
         int var3 = this.f2000.bitWidth(var1);
         int var4 = this.f3000.bitWidth(var2);
         return var3 < this.f4000.length && var4 < this.f4000[var3].length ? this.f4000[var3][var4] : 0;
      }
   }

   public Rec0077 m12000() {
      return this.f1000;
   }
}
