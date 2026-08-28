package rw.core;

import rw.api.Iface0178;
import rw.api.Iface0208;
import rw.data.Rec0067;
import rw.setting.Rec0036;

public class C1114 implements Iface0178 {
   public static Object[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   private static float[] f4000;

   private static void m2000() {
      f1000 = new Object[]{1.0E-4F};
   }

   public C1114(Iface0208 var1) {
      this.m6000();
      this.f2000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   private static void m14000() {
      f3000 = new float[]{0.0F, 1.0E-4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f4000 = new float[]{0.0F, 1.0E-4F};
   }

   public Rec0067 m18000(String var1, float var2, float var3, Rec0036 var4) {
      if (var1.isEmpty()) {
         float var14 = ((Iface0208)this.f2000[0]).m4000(var3, var4);
         return new Rec0067(f3000[0], var14);
      } else if (Float.isInfinite(var2)) {
         return this.m20000(var1, var3, var4);
      } else {
         float var5 = ((Iface0208)this.f2000[0]).m4000(var3, var4);
         if (var2 <= f3000[1]) {
            return new Rec0067(f3000[2], var5 * var1.length());
         } else {
            int var6 = 1;
            float var7 = f3000[3];
            float var8 = f3000[4];
            int var9 = -1;

            for (int var16 = 0; var16 < var1.length(); var16++) {
               int var11 = var1.codePointAt(var16);
               var16 += Character.charCount(var11);
               if (var11 == 10) {
                  var8 = Math.max(var8, var7);
                  var7 = f3000[5];
                  var6++;
                  var9 = -1;
               } else {
                  float var12 = var9 == -1 ? f3000[6] : ((Iface0208)this.f2000[0]).m8000(var9, var11, var3, var4);
                  float var13 = ((Iface0208)this.f2000[0]).m2000(var11, var3, var4) + var12;
                  if (var7 > f4000[0] && var7 + var13 > var2) {
                     var8 = Math.max(var8, var7);
                     var7 = var13;
                     var6++;
                     var9 = -1;
                  } else {
                     var7 += var13;
                     var9 = var11;
                  }
               }
            }

            var8 = Math.max(var8, var7);
            return new Rec0067(Math.round(Math.min(var8, var2)), var6 * var5);
         }
      }
   }

   public Rec0067 m20000(String var1, float var2, Rec0036 var3) {
      float var4 = ((Iface0208)this.f2000[0]).m6000(var1, var2, var3);
      float var5 = ((Iface0208)this.f2000[0]).m4000(var2, var3);
      return new Rec0067(var4, var5);
   }
}
