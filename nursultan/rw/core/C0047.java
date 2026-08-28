package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;
import rw.data.Rec0021;
import rw.data.Rec0023;

public class C0047 {
   private static float[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static double[] f5000;
   public Object[] f6000;
   private static long[] f7000;

   public C0047() {
      this.m44000();
      WjMl var5 = new WjMl();
      this.f6000[0] = var5;
      Integer var6 = Integer.MIN_VALUE;
      this.f6000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new float[]{0.38273627F, 0.7637284F, 0.32736284F};
      f4000 = new float[]{0.0F, 0.0F, 1.0F};
      f3000 = new float[]{0.0F, 0.78372836F, 0.5273628F, 0.2927363F, 0.13726372F, -90.0F};
      f1000 = new float[]{90.0F, 1.0E-4F, 0.0F};
   }

   private static void m12000() {
      f5000 = new double[]{1.0E-5};
   }

   private static void m16000() {
      f7000 = new long[]{90L, 90L};
   }

   public Rec0023 m28000(
      C0768 var1,
      NjL var2,
      C0983 var3,
      C0983 var4,
      C0983 var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      float var11,
      float var12,
      boolean var13,
      float var14,
      boolean var15
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && var5 != null) {
         long var16 = System.currentTimeMillis();
         this.m30000(var1, var3, var4, var5, var6, var11, var12, var13, var14, var15, var16);
         if (!((WjMl)this.f6000[0]).m42000(var16)) {
            return Rec0023.m16000(var5, var11, var12);
         } else {
            Rec0021 var18 = ((WjMl)this.f6000[0]).m46000(var3, var4, var5, var6, var8, var11, var12, var16);
            if (!var18.m16000()) {
               return Rec0023.m16000(var5, var11, var12);
            } else {
               C0983 var19 = this.m36000(var1, var2, var5, var18.m10000(), var18.m22000(), var18.m2000(), var6, var9, var10);
               return new Rec0023(var19, var18.m12000(), var18.m24000(), true);
            }
         }
      } else {
         return Rec0023.m16000(var5, var11, var12);
      }
   }

   private void m30000(
      C0768 var1, C0983 var2, C0983 var3, C0983 var4, double var5, float var7, float var8, boolean var9, float var10, boolean var11, long var12
   ) {
      int var14 = var1.m22000();
      if ((Integer)this.f6000[1] == Integer.MIN_VALUE) {
         Integer var20 = var14;
         this.f6000[1] = var20;
         if (var14 <= 0 || var1.m24000().m12000() > f7000[0]) {
            return;
         }
      } else {
         if (var14 == (Integer)this.f6000[1]) {
            return;
         }

         Integer var21 = var14;
         this.f6000[1] = var21;
      }

      if (var1.m24000().m12000() <= f7000[1]) {
         float var15 = var9 ? NNWE.N(f2000[0] + var10 * f2000[1] + (var11 ? f2000[2] : f4000[0]), f4000[1], f4000[2]) : f3000[0];
         ((WjMl)this.f6000[0]).m40000(var12, var2, var3, var4, var5, var7, var8, var9, var15, var11);
      }
   }

   public void m32000() {
      Integer var5 = Integer.MIN_VALUE;
      this.f6000[1] = var5;
      ((WjMl)this.f6000[0]).m54000();
   }

   private float m34000(float var1, double var2) {
      if (!(Math.abs(var1) <= f1000[1]) && !(var2 <= f5000[0])) {
         int var4 = Math.round(var1 / (float)var2);
         if (var4 == 0) {
            var4 = var1 > f1000[2] ? 1 : -1;
         }

         return var4 * (float)var2;
      } else {
         return var1;
      }
   }

   private C0983 m36000(C0768 var1, NjL var2, C0983 var3, C0983 var4, float var5, float var6, double var7, boolean var9, boolean var10) {
      if (var9 && !var10 && !var1.m36000(var2, var4)) {
         float[] var11 = new float[]{f3000[1], f3000[2], f3000[3], f3000[4]};

         for (float var15 : var11) {
            C0983 var16 = new C0983(
               var3.m38000() + this.m34000(var5 * var15, var7), NNWE.N(var3.m68000() + this.m34000(var6 * var15, var7), f3000[5], f1000[0])
            );
            if (var1.m36000(var2, var16)) {
               return var16;
            }
         }

         return var3;
      } else {
         return var4;
      }
   }

   private void m44000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[2];
         Object[] var1 = this.f6000;
         var1[1] = 0;
      }
   }
}
