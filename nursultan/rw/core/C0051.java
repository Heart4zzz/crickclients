package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;

public class C0051 {
   private static float[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static short[] f4000;
   public Object[] f5000;
   private static float[] f6000;
   private static short[] f7000;
   private static double[] f8000;

   private static void m4000() {
      f7000 = new short[]{0, 1, 2, 2, 0, 1, 0, 1};
      f4000 = new short[]{0, 1, 0, 1, 2};
   }

   public C0051() {
      this.m14000();
   }

   static {
      ntfClinit();
   }

   private void m14000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[3];
         Object[] var1 = this.f5000;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = false;
      }
   }

   private static void m16000() {
      f8000 = new double[]{0.035F, 1.0E-5, 0.5};
   }

   private boolean m18000(int var1, int var2) {
      return (boolean)(var1 != this.f5000[0] && var2 != this.f5000[1] ? 0 : 1);
   }

   private int m22000(float var1, float var2) {
      return Math.abs(var1) <= f1000[3] ? 0 : Math.round(var1 / var2);
   }

   private float m24000(float var1, double var2) {
      if (!(Math.abs(var1) <= f1000[1]) && !(var2 <= f8000[1])) {
         int var4 = Math.round(var1 / (float)var2);
         if (var4 == 0) {
            var4 = var1 > f1000[2] ? 1 : -1;
         }

         return var4 * (float)var2;
      } else {
         return var1;
      }
   }

   private int[] m26000(boolean var1, int var2) {
      return !var1 ? new int[]{0} : new int[]{var2, -var2, var2 * 2, -var2 * 2, var2 * 3, -var2 * 3, var2 * 4, -var2 * 4};
   }

   public C0983 m28000(C0768 var1, NjL var2, C0983 var3, C0983 var4, C0983 var5, double var6, boolean var8, boolean var9) {
      if (var3 != null && var4 != null && var5 != null) {
         float var10 = (float)Math.max(var6, f8000[0]);
         int var11 = this.m22000(C0070.m12000(var3.m38000(), var5.m38000()), var10);
         int var12 = this.m22000(var5.m68000() - var3.m68000(), var10);
         if ((Boolean)this.f5000[2] && this.m18000(var11, var12)) {
            C0983 var13 = this.m34000(var1, var2, var3, var4, var6, var10, var8, var9, var11, var12);
            if (var13 != null) {
               var11 = this.m22000(C0070.m12000(var3.m38000(), var13.m38000()), var10);
               var12 = this.m22000(var13.m68000() - var3.m68000(), var10);
               this.m44000(var11, var12);
               return var13;
            } else {
               this.m44000(var11, var12);
               return var5;
            }
         } else {
            this.m44000(var11, var12);
            return var5;
         }
      } else {
         return var5;
      }
   }

   private float m30000(float var1, float var2, float var3, boolean var4) {
      float var5 = Math.abs(var2);
      float var6 = var4 ? f2000[0] : f2000[1];
      if (var5 <= var3 * var6) {
         return NNWE.N(var1, -var3 * (var4 ? f2000[2] : f3000[0]), var3 * (var4 ? f3000[1] : f3000[2]));
      } else {
         float var7 = Math.max(var3, Math.abs(var2) + var3 * (var4 ? f3000[3] : f1000[0]));
         return NNWE.N(var1, -var7, var7);
      }
   }

   private boolean m32000(C0768 var1, NjL var2, C0983 var3, boolean var4, boolean var5) {
      return (boolean)(var3 == null || var4 && !var5 && !var1.m36000(var2, var3) ? 0 : 1);
   }

   private C0983 m34000(C0768 var1, NjL var2, C0983 var3, C0983 var4, double var5, float var7, boolean var8, boolean var9, int var10, int var11) {
      int var13 = this.m48000(var10, C0070.m12000(var3.m38000(), var4.m38000()));
      int var14 = this.m48000(var11, var4.m68000() - var3.m68000());
      int[] var15 = this.m26000(var10 == (Integer)this.f5000[0], var13);

      for (int var19 : this.m26000(var11 == (Integer)this.f5000[1], var14)) {
         for (int var23 : var15) {
            int var24;
            int var25;
            C0983 var26;
            if ((var23 != 0 || var19 != 0)
               && this.m32000(var1, var2, var26 = this.m42000(var3, var4, var5, var7, var25 = var10 + var23, var24 = var11 + var19), var8, var9)
               && this.m36000(var26, var3, var7)) {
               return var26;
            }
         }
      }

      return null;
   }

   private boolean m36000(C0983 var1, C0983 var2, float var3) {
      int var4 = this.m22000(C0070.m12000(var2.m38000(), var1.m38000()), var3);
      int var5 = this.m22000(var1.m68000() - var2.m68000(), var3);
      return (boolean)(var4 != this.f5000[f4000[0]] && var5 != this.f5000[f4000[1]] ? 1 : 0);
   }

   private C0983 m42000(C0983 var1, C0983 var2, double var3, float var5, int var6, int var7) {
      float var8 = C0070.m12000(var1.m38000(), var2.m38000());
      float var9 = var2.m68000() - var1.m68000();
      float var10 = this.m30000(var6 * var5, var8, var5, true);
      float var11 = this.m30000(var7 * var5, var9, var5, false);
      return new C0983(var1.m38000() + this.m24000(var10, var3), NNWE.N(var1.m68000() + this.m24000(var11, var3), f6000[0], f6000[1]));
   }

   private void m44000(int var1, int var2) {
      Integer var7 = var1;
      this.f5000[f4000[2]] = var7;
      Integer var8 = var2;
      this.f5000[f4000[3]] = var8;
      Boolean var9 = true;
      this.f5000[f4000[4]] = var9;
   }

   public void m46000() {
      Integer var5 = 0;
      this.f5000[0] = var5;
      Integer var6 = 0;
      this.f5000[1] = var6;
      Boolean var7 = false;
      this.f5000[2] = var7;
   }

   private int m48000(int var1, float var2) {
      if (var1 != 0) {
         return var1 > 0 ? 1 : -1;
      } else if (Math.abs(var2) > f1000[4]) {
         return var2 > f1000[5] ? 1 : -1;
      } else {
         return Math.random() > f8000[2] ? 1 : -1;
      }
   }

   private static void m50000() {
      f6000 = new float[]{-90.0F, 90.0F};
      f2000 = new float[]{0.85F, 0.45F, 4.0F};
      f3000 = new float[]{2.0F, 4.0F, 2.0F, 1.6F};
      f1000 = new float[]{0.85F, 1.0E-4F, 0.0F, 1.0E-4F, 1.0E-4F, 0.0F};
   }
}
