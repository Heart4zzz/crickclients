package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.data.Rec0185;
import rw.data.Rec0186;
import rw.data.Rec0187;
import rw.data.Rec0188;
import rw.data.Rec0191;

public class OlkrOkjjj {
   private static double[] f1000;
   private static float[] f2000;
   public static Object[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   public Object[] f9000;

   private void m6000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[7];
         Object[] var1 = this.f9000;
      }
   }

   public OlkrOkjjj() {
      this.m6000();
      C0756 var5 = new C0756();
      this.f9000[0] = var5;
      C0751 var6 = new C0751();
      this.f9000[1] = var6;
      C0765 var7 = new C0765();
      this.f9000[2] = var7;
      C0766 var8 = new C0766();
      this.f9000[3] = var8;
      C0763 var9 = new C0763();
      this.f9000[4] = var9;
      OlmjiOqjr var10 = new OlmjiOqjr();
      this.f9000[5] = var10;
      C0762 var11 = new C0762();
      this.f9000[6] = var11;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new double[]{Double.MAX_VALUE, 0.88, 1.42};
   }

   private static void m10000() {
      f4000 = new float[]{2.4F, 1.15F, -90.0F, 90.0F, 7.0F, 1.6F, 8.0F};
      f7000 = new float[]{15.5F, 2.8F, 1.35F, 4.5F, 2.0F, 0.38F, 0.28F};
      f6000 = new float[]{-90.0F, 90.0F, 0.5F};
      f8000 = new float[]{0.54F, 0.5F, 0.5F, 0.74F};
      f2000 = new float[]{0.5F, 0.32F, 0.67F, 0.5F, 0.68F, 0.67F, 0.5F};
      f5000 = new float[]{1.2F, 1.15F, 0.62F, -90.0F, 90.0F, -90.0F, 90.0F};
   }

   private boolean m18000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7) {
      if (!var5) {
         return (boolean)0;
      } else {
         float var8 = Math.abs(var4.m68000() - var3.m68000());
         if (var7 && var8 > f5000[0]) {
            return (boolean)0;
         } else {
            C0983 var9 = new C0983(var4.m38000(), var3.m68000());
            if (var1.m36000(var2, var9)) {
               return (boolean)1;
            } else if (var6) {
               return (boolean)0;
            } else if (var8 > f5000[1]) {
               return (boolean)0;
            } else {
               float var10 = C0070.m12000(var3.m38000(), var4.m38000());
               C0983 var11 = new C0983(var3.m38000() + var10 * f5000[2], var3.m68000());
               return var1.m36000(var2, var11);
            }
         }
      }
   }

   public void m26000() {
      ((C0762)this.f9000[6]).m46000();
      ((C0756)this.f9000[0]).m32000();
      ((C0751)this.f9000[1]).m30000();
      ((C0765)this.f9000[2]).m28000();
      ((C0766)this.f9000[3]).m28000();
      ((C0763)this.f9000[4]).m26000();
      ((OlmjiOqjr)this.f9000[5]).m42000();
   }

   private double m28000(C0983 var1, C0983 var2) {
      float var3 = Math.abs(C0070.m12000(var1.m38000(), var2.m38000()));
      float var4 = Math.abs(var2.m68000() - var1.m68000());
      return var3 * f1000[1] + var4 * f1000[2];
   }

   private C0983 m30000(NXi var1) {
      C0983 var2 = C0070.m14000(var1);
      return new C0983(var2.m38000(), NNWE.N(var2.m68000(), f5000[3], f5000[4]));
   }

   private NXi m32000(NHS var1, float var2, float var3, float var4) {
      return new NXi(NNWE.u(var2, var1.N, var1.u), NNWE.u(var3, var1.y, var1.i), NNWE.u(var4, var1.L, var1.R));
   }

   public Rec0188 m34000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7) {
      boolean var12 = var1.m36000(var2, var3);
      boolean var13 = var1.m36000(var2, var4);
      NHS var14 = C0758.m12000(var2);
      NXi var15 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_33571();
      NXi var16 = this.m36000(var14, var2, var12, var5, var7);
      Rec0191 var17 = ((OlmjiOqjr)this.f9000[5]).m48000(var1, var2, var14, var16, var3, var12, var5, var6, var7);
      NXi var18 = var17.m8000();
      C0983 var19 = this.m30000(var18);
      Rec0185 var20 = var17.m16000()
         ? new Rec0185(var18, true, var17.m10000())
         : ((C0756)this.f9000[0]).m42000(var1, var2, var14, var18, var3, var19, var12, var5, var6);
      C0983 var21 = this.m30000(var20.m2000());
      C0983 var22 = var20.m8000() ? (var17.m16000() ? var17.m2000() : var21) : this.m38000(var1, var2, var3, var21, var14, var20.m2000(), var12);
      int var11 = var12 && !var20.m8000() && !var20.m12000() ? 1 : 0;
      if (var11 != 0) {
         var22 = ((C0763)this.f9000[4]).m24000(var1, var2, var3, var22, var12, var6, var5, false);
      }

      float var24 = Math.abs(C0070.m12000(var3.m38000(), var21.m38000()));
      float var25 = Math.abs(var21.m68000() - var3.m68000());
      byte var26 = 0;
      if (var11 == 0 && !var20.m8000() && var12 && var24 <= f4000[0] && var25 <= f4000[1] && !var6) {
         Rec0187 var27 = ((C0765)this.f9000[2]).m38000(var1, var2, var3, var22, var12, var5, var6, var7);
         var22 = var27.m4000();
         var26 = var27.m6000();
      }

      Rec0186 var10 = var11 != 0 ? Rec0186.m10000() : ((C0751)this.f9000[1]).m28000(var1, var2, var3, var22, var12, var5, var6, var20.m8000());
      if (var10.m16000()) {
         var22 = new C0983(var22.m38000() + var10.m14000(), NNWE.N(var22.m68000() + var10.m8000(), f4000[2], f4000[3]));
      }

      boolean var8;
      int var9 = !(var8 = var10.m2000()) && this.m18000(var1, var2, var3, var22, var12, var20.m8000(), var20.m12000()) ? 1 : 0;
      if (var9 != 0) {
         var22 = new C0983(var22.m38000(), var3.m68000());
      }

      var22 = ((C0766)this.f9000[3]).m24000(var1, var2, var3, var22, var6, var5 && var7, var20.m8000() || var8);
      var22 = ((C0763)this.f9000[4]).m24000(var1, var2, var3, var22, var12, var6, var5, var20.m8000() || var8);
      float var29 = Math.abs(C0070.m12000(var3.m38000(), var22.m38000()));
      float var30 = Math.abs(var22.m68000() - var3.m68000());
      double var31 = var15.R(var14.R());
      int var33 = !var20.m8000()
            && !var20.m12000()
            && !var17.m10000()
            && !var8
            && var12
            && !(var29 > NNWE.N(f4000[4] + (float)var31 * f4000[5], f4000[6], f7000[0]))
            && (!var7 || !var5 || !(var29 > f7000[1]) && !(var30 > f7000[2]))
         ? 0
         : 1;
      return new Rec0188(
         var22,
         var12,
         var13,
         (boolean)var33,
         (boolean)var9,
         var20.m8000() || var8 || var17.m16000(),
         (boolean)var26,
         var20.m12000() || var17.m10000(),
         var29,
         var30,
         var31
      );
   }

   private NXi m36000(NHS var1, NjL var2, boolean var3, boolean var4, boolean var5) {
      return ((C0762)this.f9000[6]).m30000(var1, var2, var3, var4, var5);
   }

   private C0983 m38000(C0768 var1, NjL var2, C0983 var3, C0983 var4, NHS var5, NXi var6, boolean var7) {
      if (var7 && var1.m36000(var2, var3)) {
         float var20 = Math.abs(C0070.m12000(var3.m38000(), var4.m38000()));
         float var21 = Math.abs(var4.m68000() - var3.m68000());
         if (var20 <= f7000[3] && var21 <= f7000[4]) {
            return var4;
         } else {
            C0983 var11 = new C0983(
               var3.m38000() + C0070.m12000(var3.m38000(), var4.m38000()) * f7000[5],
               NNWE.N(var3.m68000() + (var4.m68000() - var3.m68000()) * f7000[6], f6000[0], f6000[1])
            );
            if (var1.m36000(var2, var11)) {
               return var11;
            } else {
               C0983 var22 = new C0983(var4.m38000(), var3.m68000());
               if (var1.m36000(var2, var22)) {
                  return var22;
               } else {
                  return var1.m36000(var2, var4) ? var4 : var3;
               }
            }
         }
      } else {
         C0983 var9 = var1.m36000(var2, var4) ? var4 : null;
         double var10 = var9 == null ? f1000[0] : this.m28000(var3, var9);
         NXi var12 = C0758.m28000(var2, ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_33571());

         for (NXi var16 : new NXi[]{
            var6,
            var5.R(),
            var12,
            this.m32000(var5, f6000[2], f8000[0], f8000[1]),
            this.m32000(var5, f8000[2], f8000[3], f2000[0]),
            this.m32000(var5, f2000[1], f2000[2], f2000[3]),
            this.m32000(var5, f2000[4], f2000[5], f2000[6]),
            ((C0762)this.f9000[6]).m22000(var5),
            ((C0762)this.f9000[6]).m42000(var5)
         }) {
            C0983 var19 = this.m30000(var16);
            double var17;
            if (var1.m36000(var2, var19) && (var17 = this.m28000(var3, var19)) < var10) {
               var9 = var19;
               var10 = var17;
            }
         }

         return var9 == null ? var4 : var9;
      }
   }

   private static void m44000() {
      f3000 = new Object[]{-90.0F, 90.0F};
   }
}
