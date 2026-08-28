package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NjL;
import rw.data.Rec0186;

public class C0751 {
   private static boolean[] f1000;
   private static double[] f2000;
   private static double[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static double[] f6000;
   private static boolean[] f7000;
   private static boolean[] f8000;
   private static double[] f9000;
   public Object[] f10000;
   private static boolean[] f11000;
   private static double[] f12000;
   private static float[] f13000;
   private static float[] f14000;
   public Object[] f15000;
   private static float[] f16000;
   private static float[] f17000;
   private static float[] f18000;
   private static double[] f19000;
   private static float[] f20000;
   private static double[] f21000;

   private void m4000(long var1) {
      float var3 = Math.random() > f21000[2] ? f20000[5] : f20000[6];
      float var4 = Math.random() > f21000[3] ? f14000[0] : f14000[1];
      int var5 = Math.random() < f21000[4] ? 1 : 0;
      Float var10 = var3 * C0052.m8000(var5 != 0 ? f21000[5] : f6000[0], var5 != 0 ? f6000[1] : f6000[2]);
      this.f15000[0] = var10;
      Float var11 = var4 * C0052.m8000(f6000[3], var5 != 0 ? f6000[4] : f6000[5]);
      this.f10000[3] = var11;
      Float var12 = C0052.m8000(f3000[0], var5 != 0 ? f3000[1] : f2000[0]);
      this.f15000[1] = var12;
      Float var13 = C0052.m8000(f2000[1], f2000[2]);
      this.f15000[2] = var13;
      Float var14 = var3 * C0052.m8000(var5 != 0 ? f2000[3] : f2000[4], var5 != 0 ? f2000[5] : f19000[0]);
      this.f15000[3] = var14;
      Long var15 = var1;
      this.f10000[1] = var15;
      Long var16 = var1 + (long)C0052.m8000(var5 != 0 ? f19000[1] : f19000[2], var5 != 0 ? f9000[0] : f9000[1]);
      this.f10000[2] = var16;
      Long var17 = var1 + (long)C0052.m8000(var5 != 0 ? f9000[2] : f9000[3], var5 != 0 ? f9000[4] : f9000[5]);
      this.f10000[0] = var17;
      Boolean var18 = true;
      this.f15000[4] = var18;
   }

   public C0751() {
      this.m10000();
      Float var5 = f16000[0];
      this.f15000[1] = var5;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f10000 == null) {
         this.f10000 = new Object[4];
         Object[] var1 = this.f10000;
         var1[f7000[0]] = 0L;
         var1[f7000[1]] = 0L;
         var1[2] = 0L;
         var1[3] = f14000[2];
      }

      if (this.f15000 == null) {
         this.f15000 = new Object[5];
         Object[] var2 = this.f15000;
         var2[f7000[2]] = f14000[3];
         var2[f7000[3]] = f14000[4];
         var2[2] = f14000[5];
         var2[3] = f14000[6];
         var2[4] = f7000[4];
      }
   }

   private static void m14000() {
      f1000 = new boolean[]{false, false, false, true};
      f11000 = new boolean[]{false, true};
      f8000 = new boolean[]{false, false};
      f5000 = new boolean[]{false, false, true, false};
      f4000 = new boolean[]{true, false, true, false, true};
      f7000 = new boolean[]{false, true, false, true, false};
   }

   private boolean m20000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      if (var5 && !var6 && !var7 && !var8) {
         long var10 = var1.m24000().m12000();
         if (var10 >= 42L && var10 <= 500L) {
            float var12 = Math.abs(C0070.m12000(var3.m38000(), var4.m38000()));
            float var13 = Math.abs(var4.m68000() - var3.m68000());
            if (!(var12 > f13000[0]) && !(var13 > f13000[1])) {
               double var14 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_33571().R(C0758.m20000(var2));
               if (var14 > var1.m38000(var2) + f13000[2]) {
                  return (boolean)0;
               } else {
                  float var9 = var10 < 180L ? f20000[0] : f20000[1];
                  if (var12 < f20000[2] && var13 < f20000[3]) {
                     var9 += f20000[4];
                  }

                  return (boolean)(Math.random() < var9 ? 1 : 0);
               }
            } else {
               return (boolean)0;
            }
         } else {
            return (boolean)0;
         }
      } else {
         return (boolean)0;
      }
   }

   private static void m26000() {
      f12000 = new double[]{Math.PI, Math.PI, 2.0};
      f21000 = new double[]{Math.PI, 3.35F, 0.5, 0.5, 0.16, 0.72};
      f6000 = new double[]{0.32, 1.45, 0.92, 0.12, 0.82, 0.48};
      f3000 = new double[]{0.82, 1.32};
      f2000 = new double[]{1.12, 0.0, Math.PI * 2, 0.08, 0.035, 0.28};
      f19000 = new double[]{0.14, 135.0, 110.0};
      f9000 = new double[]{265.0, 225.0, 720.0, 560.0, 1750.0, 1350.0};
   }

   public Rec0186 m28000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      long var9 = System.currentTimeMillis();
      if (this.m34000(var1, var6, var7)) {
         Boolean var22 = false;
         this.f15000[4] = var22;
      }

      if (var9 >= (Long)this.f10000[2]) {
         Boolean var23 = false;
         this.f15000[4] = var23;
      }

      if (!(Boolean)this.f15000[4] && var9 >= (Long)this.f10000[0] && this.m20000(var1, var2, var3, var4, var5, var6, var7, var8)) {
         this.m4000(var9);
      }

      if (!(Boolean)this.f15000[4]) {
         return Rec0186.m10000();
      } else {
         float var11 = NNWE.N((float)(var9 - (Long)this.f10000[1]) / (float)Math.max(1L, (Long)this.f10000[2] - (Long)this.f10000[1]), f17000[4], f17000[5]);
         float var12 = (float)Math.sin(var11 * f12000[0]);
         float var13 = f18000[0] + (float)Math.sin(var11 * f12000[1] * f12000[2] + ((Float)this.f15000[2]).floatValue()) * f18000[1];
         float var14 = NNWE.N((float)Math.pow(var12, ((Float)this.f15000[1]).floatValue()) * var13, f18000[2], f18000[3]);
         float var15 = (Float)this.f10000[3] * var14;
         float var16 = (Float)this.f15000[0] * var14
            + (float)Math.sin(var11 * f21000[0] * f21000[1] + ((Float)this.f15000[2]).floatValue()) * (Float)this.f15000[3] * var14;
         int var17 = var14 > f18000[4] ? 1 : 0;
         return new Rec0186(true, var15, var16, (boolean)var17);
      }
   }

   public void m30000() {
      Long var5 = 0L;
      this.f10000[0] = var5;
      Long var6 = 0L;
      this.f10000[1] = var6;
      Long var7 = 0L;
      this.f10000[2] = var7;
      Float var8 = f16000[1];
      this.f10000[3] = var8;
      Float var9 = f17000[0];
      this.f15000[0] = var9;
      Float var10 = f17000[1];
      this.f15000[1] = var10;
      Float var11 = f17000[2];
      this.f15000[2] = var11;
      Float var12 = f17000[3];
      this.f15000[3] = var12;
      Boolean var13 = false;
      this.f15000[4] = var13;
   }

   private boolean m34000(C0768 var1, boolean var2, boolean var3) {
      return (boolean)(!var2 && !var3 && var1.m24000().m12000() <= 530L ? 0 : 1);
   }

   private static void m40000() {
      f16000 = new float[]{1.0F, 0.0F};
      f17000 = new float[]{0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      f18000 = new float[]{1.0F, 0.18F, 0.0F, 1.0F, 0.18F};
      f13000 = new float[]{4.5F, 2.35F, 0.9F};
      f20000 = new float[]{0.055F, 0.09F, 1.7F, 0.65F, 0.025F, 1.0F, -1.0F};
      f14000 = new float[]{1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }
}
