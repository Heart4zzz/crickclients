package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;

public class C0766 {
   private static float[] f1000;
   private static boolean[] f2000;
   private static float[] f3000;
   private static double[] f4000;
   private static boolean[] f5000;
   private static double[] f6000;
   private static boolean[] f7000;
   private static float[] f8000;
   private static double[] f9000;
   private static float[] f10000;
   private static float[] f11000;
   private static float[] f12000;
   private static float[] f13000;
   private static double[] f14000;
   private static boolean[] f15000;
   public Object[] f16000;

   private void m6000() {
      if (this.f16000 == null) {
         this.f16000 = new Object[3];
         Object[] var1 = this.f16000;
         var1[0] = 0L;
         var1[1] = f13000[3];
         var1[2] = f13000[4];
      }
   }

   public C0766() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f4000 = new double[]{95.0, 210.0, 310.0, -0.22F, 0.26F, -0.46F};
      f9000 = new double[]{0.52F, -1.05F, 1.12F};
      f14000 = new double[]{-0.08F, 0.08F, -0.22F, 0.22F, -0.42F, 0.46F};
      f6000 = new double[]{-1.38F, 1.46F, -0.28F, 0.32F};
   }

   private static void m20000() {
      f12000 = new float[]{0.0F, 0.0F, 0.55F, 0.28F};
      f11000 = new float[]{6.4F, 3.1F, 1.0F, 0.0F, -0.42F, 0.22F, 0.52F, 0.28F};
      f1000 = new float[]{-0.18F, 0.08F, 0.22F, 0.1F, 0.22F, -0.88F, 0.94F};
      f8000 = new float[]{0.16F, -0.38F, 0.42F, -90.0F};
      f10000 = new float[]{90.0F, 0.16F, -0.54F, 0.56F, 1.0F, 0.0F};
      f3000 = new float[]{-0.72F, 0.22F, 0.82F, 0.28F, -0.34F, 0.08F, 0.34F};
      f13000 = new float[]{0.1F, -90.0F, 90.0F, 0.0F, 0.0F};
   }

   public C0983 m24000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7) {
      if (var1.m36000(var2, var3) && !var5 && !var7) {
         float var9 = C0070.m12000(var3.m38000(), var4.m38000());
         float var10 = var4.m68000() - var3.m68000();
         float var11 = Math.abs(var9);
         float var12 = Math.abs(var10);
         if (var11 <= f12000[2] && var12 <= f12000[3]) {
            C0983 var24 = this.m32000(var1, var2, var3, var6);
            return var24 == null ? var4 : var24;
         } else if (!(var11 > f11000[0]) && !(var12 > f11000[1])) {
            long var13 = System.currentTimeMillis();
            if (var13 >= (Long)this.f16000[0]) {
               float var15 = var6 ? f11000[2] : f11000[3];
               Float var21 = C0052.m8000(f11000[4] - var15 * f11000[5], f11000[6] + var15 * f11000[7]);
               this.f16000[1] = var21;
               Float var22 = C0052.m8000(f1000[0] - var15 * f1000[1], f1000[2] + var15 * f1000[3]);
               this.f16000[2] = var22;
               Long var23 = var13 + (long)C0052.m8000(f4000[0], var6 ? f4000[1] : f4000[2]);
               this.f16000[0] = var23;
            }

            C0983 var8;
            if (var1.m36000(
               var2,
               var8 = new C0983(
                  var3.m38000() + NNWE.N(var9 * f1000[4] + (Float)this.f16000[1], f1000[5], f1000[6]),
                  NNWE.N(var3.m68000() + NNWE.N(var10 * f8000[0] + (Float)this.f16000[2], f8000[1], f8000[2]), f8000[3], f10000[0])
               )
            )) {
               return var8;
            } else {
               C0983 var25 = new C0983(var3.m38000() + NNWE.N(var9 * f10000[1], f10000[2], f10000[3]), var3.m68000());
               if (var1.m36000(var2, var25)) {
                  return var25;
               } else {
                  C0983 var16 = this.m32000(var1, var2, var3, var6);
                  return var16 == null ? var4 : var16;
               }
            }
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public void m28000() {
      Long var5 = 0L;
      this.f16000[0] = var5;
      Float var6 = f12000[0];
      this.f16000[1] = var6;
      Float var7 = f12000[1];
      this.f16000[2] = var7;
   }

   private C0983 m32000(C0768 var1, NjL var2, C0983 var3, boolean var4) {
      float var6 = var4 ? f10000[4] : f10000[5];
      float[][] var10000 = new float[5][];
      float[] var10003 = new float[]{C0052.m8000(f3000[0] - var6 * f3000[1], f3000[2] + var6 * f3000[3]), 0.0F};
      var10003[f7000[0]] = C0052.m8000(f4000[3], f4000[4]);
      var10000[0] = var10003;
      byte var10002 = f7000[1];
      var10003 = new float[2];
      var10003[f7000[2]] = C0052.m8000(f4000[5], f9000[0]);
      var10003[f7000[3]] = C0052.m8000(f3000[4] - var6 * f3000[5], f3000[6] + var6 * f13000[0]);
      var10000[var10002] = var10003;
      var10003 = new float[2];
      var10003[f7000[4]] = C0052.m8000(f9000[1], f9000[2]);
      var10003[f7000[5]] = C0052.m8000(f14000[0], f14000[1]);
      var10000[2] = var10003;
      var10000[3] = new float[]{C0052.m8000(f14000[2], f14000[3]), C0052.m8000(f14000[4], f14000[5])};
      var10000[4] = new float[]{C0052.m8000(f6000[0], f6000[1]), C0052.m8000(f6000[2], f6000[3])};
      float[][] var7 = var10000;
      int var8 = var7.length;

      for (int var9 = 0; var9 < var8; var9++) {
         float[] var10 = var7[var9];
         C0983 var11 = new C0983(var3.m38000() + var10[0], NNWE.N(var3.m68000() + var10[1], f13000[1], f13000[2]));
         if (var1.m36000(var2, var11)) {
            return var11;
         }
      }

      return null;
   }

   private static void m38000() {
      f2000 = new boolean[]{false, false};
      f7000 = new boolean[]{true, true, false, true, false, true};
      f5000 = new boolean[]{false, true, false, true, false, false, true};
      f15000 = new boolean[]{false, true};
   }
}
