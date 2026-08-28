package rw.core;

import rw.api.Iface0178;
import rw.api.Iface0208;
import rw.data.Rec0067;
import rw.setting.Rec0036;

public final class C0255 implements Iface0178 {
   private static final float f1000 = 1.0E-4F;
   private static final float f2000 = 16.0F;
   private final Iface0208 f3000;
   private final float f4000;
   private final Rec0036 f5000;

   public C0255(Iface0208 var1) {
      this(var1, 16.0F, Rec0036.f4000);
   }

   public C0255(Iface0208 var1, float var2, Rec0036 var3) {
      this.f3000 = var1;
      this.f4000 = m6000(var2);
      this.f5000 = var3 == null ? Rec0036.f4000 : var3;
   }

   private float m2000(float var1) {
      return Float.isFinite(var1) && !(var1 <= 0.0F) ? var1 : this.f4000;
   }

   private Rec0036 m4000(Rec0036 var1) {
      return var1 == null ? this.f5000 : var1;
   }

   private static float m6000(float var0) {
      return Float.isFinite(var0) && !(var0 <= 0.0F) ? var0 : 16.0F;
   }

   public Rec0067 m8000(String var1, float var2, float var3, Rec0036 var4) {
      String var5 = var1 == null ? "" : var1;
      float var6 = this.m2000(var3);
      Rec0036 var7 = this.m4000(var4);
      if (var5.isEmpty()) {
         float var15 = this.f3000.m4000(var6, var7);
         return new Rec0067(0.0F, var15);
      } else if (Float.isInfinite(var2)) {
         return this.m12000(var5, var6, var7);
      } else {
         float var8 = this.f3000.m4000(var6, var7);
         if (var2 <= 1.0E-4F) {
            return new Rec0067(0.0F, var8 * var5.length());
         } else {
            int var9 = 1;
            float var10 = 0.0F;
            float var11 = 0.0F;

            for (int var12 = 0; var12 < var5.length(); var12++) {
               char var13 = var5.charAt(var12);
               if (var13 == '\n') {
                  var11 = Math.max(var11, var10);
                  var10 = 0.0F;
                  var9++;
               } else {
                  float var14 = this.f3000.m2000(var13, var6, var7);
                  if (var10 > 0.0F && var10 + var14 > var2) {
                     var11 = Math.max(var11, var10);
                     var10 = var14;
                     var9++;
                  } else {
                     var10 += var14;
                  }
               }
            }

            var11 = Math.max(var11, var10);
            return new Rec0067(Math.min(var11, var2), var9 * var8);
         }
      }
   }

   public Rec0067 m10000(String var1, float var2) {
      return this.m8000(var1, var2, this.f4000, this.f5000);
   }

   public Rec0067 m12000(String var1, float var2, Rec0036 var3) {
      String var4 = var1 == null ? "" : var1;
      float var5 = this.m2000(var2);
      Rec0036 var6 = this.m4000(var3);
      float var7 = this.f3000.m6000(var4, var5, var6);
      float var8 = this.f3000.m4000(var5, var6);
      return new Rec0067(var7, var8);
   }

   public Rec0067 m14000(String var1) {
      return this.m12000(var1, this.f4000, this.f5000);
   }
}
