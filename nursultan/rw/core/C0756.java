package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.data.Rec0185;

public class C0756 {
   private static double[] f1000;
   private static double[] f2000;
   private static double[] f3000;
   private static byte[] f4000;
   private static double[] f5000;
   private static float[] f6000;
   private static double[] f7000;
   private static double[] f8000;
   private static double[] f9000;
   public Object[] f10000;
   private static double[] f11000;
   private static float[] f12000;
   public Object[] f13000;
   private static float[] f14000;
   private static float[] f15000;
   private static float[] f16000;

   private static void m2000() {
      f16000 = new float[]{1.0F, 1.0F, 0.0F, 0.0F, 0.16F, 0.0F};
      f6000 = new float[]{1.0F, 0.08F};
      f15000 = new float[]{5.8F, 2.65F, 3.6F, 0.0F, 1.0F, 5.8F, 5.8F};
      f12000 = new float[]{0.0F, 1.0F, 0.34F, 1.75F, 0.95F, 0.72F};
      f14000 = new float[]{4.2F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public C0756() {
      this.m22000();
      Float var5 = f16000[0];
      this.f13000[1] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f4000 = new byte[]{3, 2, 6, 2, 3, 4, 5};
   }

   private void m20000(long var1) {
      Long var7 = var1;
      this.f10000[2] = var7;
      Boolean var8 = true;
      this.f13000[5] = var8;
      Long var9 = var1 + (long)C0052.m8000(f8000[2], f8000[3]);
      this.f13000[0] = var9;
   }

   private void m22000() {
      if (this.f10000 == null) {
         this.f10000 = new Object[f4000[0]];
         Object[] var1 = this.f10000;
         var1[0] = 0L;
         var1[1] = 0L;
         var1[f4000[1]] = 0L;
      }

      if (this.f13000 == null) {
         this.f13000 = new Object[f4000[2]];
         Object[] var2 = this.f13000;
         var2[0] = 0L;
         var2[1] = f14000[2];
         var2[f4000[3]] = f14000[3];
         var2[f4000[4]] = f14000[4];
         var2[f4000[5]] = f14000[5];
         var2[f4000[6]] = false;
      }
   }

   private boolean m26000(C0768 var1, boolean var2, boolean var3) {
      return (boolean)(!var2 && !var3 && var1.m24000().m12000() <= 545L ? 0 : 1);
   }

   private boolean m30000(long var1, float var3, float var4, float var5, boolean var6, boolean var7) {
      if (!var6 && !var7 && !(var3 < f12000[2])) {
         int var8 = var4 <= f12000[3] && var5 <= f12000[4] ? 1 : 0;
         int var9 = var3 >= f12000[5] && var4 <= f14000[0] && var5 <= f14000[1] ? 1 : 0;
         return (boolean)(var8 == 0 && var9 == 0 && var1 < this.f10000[2] - 45L ? 0 : 1);
      } else {
         return (boolean)0;
      }
   }

   public void m32000() {
      Long var5 = 0L;
      this.f10000[0] = var5;
      Long var6 = 0L;
      this.f10000[1] = var6;
      Long var7 = 0L;
      this.f10000[2] = var7;
      Long var8 = 0L;
      this.f13000[0] = var8;
      Float var9 = f16000[1];
      this.f13000[1] = var9;
      Float var10 = f16000[2];
      this.f13000[2] = var10;
      Float var11 = f16000[3];
      this.f13000[3] = var11;
      Float var12 = f16000[4];
      this.f13000[4] = var12;
      Boolean var13 = false;
      this.f13000[5] = var13;
   }

   private boolean m34000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7) {
      long var8 = System.currentTimeMillis();
      if (var5 && !var6 && !var7 && var1.m24000().m12000() >= 120L) {
         float var10 = Math.abs(C0070.m12000(var3.m38000(), var4.m38000()));
         float var11 = Math.abs(var4.m68000() - var3.m68000());
         if (!(var10 > f15000[0]) && !(var11 > f15000[1])) {
            double var12 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_33571().R(C0758.m20000(var2));
            float var14 = NNWE.N((float)(f5000[0] - var12) / f15000[2], f15000[3], f15000[4]);
            float var15 = NNWE.N((f15000[5] - var10) / f15000[6], f12000[0], f12000[1]);
            double var16 = f5000[1] + var14 * f5000[2] + var15 * f11000[0];
            if (Math.random() > var16) {
               Long var24 = var8 + (long)C0052.m8000(f11000[1], f11000[2]);
               this.f10000[0] = var24;
               return (boolean)0;
            } else {
               return (boolean)1;
            }
         } else {
            Long var23 = var8 + (long)C0052.m8000(f3000[5], f3000[6]);
            this.f10000[0] = var23;
            return (boolean)0;
         }
      } else {
         Long var22 = var8 + (long)C0052.m8000(f3000[3], f3000[4]);
         this.f10000[0] = var22;
         return (boolean)0;
      }
   }

   private void m36000(long var1, NHS var3) {
      float var4 = C0052.m8000(f1000[0], f1000[1]);
      Float var12 = (float)Math.cos(var4);
      this.f13000[1] = var12;
      Float var13 = (float)Math.sin(var4);
      this.f13000[2] = var13;
      double var5 = var3.i - var3.y;
      int var7 = Math.random() < f1000[2] ? 1 : 0;
      Float var14 = C0052.m8000(-var5 * (var7 != 0 ? f2000[0] : f2000[1]), var5 * (var7 != 0 ? f2000[2] : f2000[3]));
      this.f13000[3] = var14;
      Float var15 = C0052.m8000(var7 != 0 ? f2000[4] : f2000[5], var7 != 0 ? f2000[6] : f2000[7]);
      this.f13000[4] = var15;
      Long var16 = var1;
      this.f10000[1] = var16;
      Long var17 = var1 + (long)C0052.m8000(var7 != 0 ? f7000[0] : f7000[1], var7 != 0 ? f7000[2] : f7000[3]);
      this.f10000[2] = var17;
      Long var18 = var1 + (long)C0052.m8000(var7 != 0 ? f7000[4] : f7000[5], var7 != 0 ? f8000[0] : f8000[1]);
      this.f10000[0] = var18;
      Boolean var19 = false;
      this.f13000[5] = var19;
      Long var20 = 0L;
      this.f13000[0] = var20;
   }

   private NXi m40000(NXi var1, NXi var2, double var3) {
      return new NXi(NNWE.u(var3, var1.M, var2.M), NNWE.u(var3, var1.B, var2.B), NNWE.u(var3, var1.Z, var2.Z));
   }

   public Rec0185 m42000(C0768 var1, NjL var2, NHS var3, NXi var4, C0983 var5, C0983 var6, boolean var7, boolean var8, boolean var9) {
      long var11 = System.currentTimeMillis();
      if (this.m26000(var1, var8, var9)) {
         Long var28 = var11;
         this.f10000[2] = var28;
         Boolean var29 = false;
         this.f13000[5] = var29;
      }

      if (var11 >= (Long)this.f10000[2] && var11 >= (Long)this.f10000[0] && this.m34000(var1, var2, var5, var6, var7, var8, var9)) {
         this.m36000(var11, var3);
      }

      if ((Boolean)this.f13000[5] && var11 < (Long)this.f13000[0]) {
         return new Rec0185(var4, false, true);
      } else {
         if (var11 >= (Long)this.f13000[0]) {
            Boolean var30 = false;
            this.f13000[5] = var30;
         }

         if (var11 >= (Long)this.f10000[2]) {
            return new Rec0185(var4, false);
         } else {
            float var13 = NNWE.N((float)(var11 - (Long)this.f10000[1]) / (float)Math.max(1L, (Long)this.f10000[2] - (Long)this.f10000[1]), f16000[5], f6000[0]);
            float var14 = (float)Math.sin(var13 * f9000[0]);
            if (var14 <= f6000[1]) {
               return new Rec0185(var4, false);
            } else {
               NXi var15 = var3.R();
               double var16 = Math.max(f9000[1], (var3.u - var3.N) * f9000[2]);
               double var18 = Math.max(f9000[3], (var3.R - var3.L) * f3000[0]);
               NXi var20 = new NXi(
                  var15.M + ((Float)this.f13000[1]).floatValue() * (var16 + ((Float)this.f13000[4]).floatValue()),
                  NNWE.N(var4.B + ((Float)this.f13000[3]).floatValue(), var3.y - (var3.i - var3.y) * f3000[1], var3.i + (var3.i - var3.y) * f3000[2]),
                  var15.Z + ((Float)this.f13000[2]).floatValue() * (var18 + ((Float)this.f13000[4]).floatValue())
               );
               NXi var21 = this.m40000(var4, var20, var14);
               C0983 var22 = C0070.m14000(var21);
               float var23 = Math.abs(C0070.m12000(var5.m38000(), var22.m38000()));
               if (this.m30000(var11, var13, var23, Math.abs(var22.m68000() - var5.m68000()), var8, var9)) {
                  this.m20000(var11);
                  return new Rec0185(var4, false, true);
               } else {
                  return new Rec0185(var21, true);
               }
            }
         }
      }
   }

   private static void m48000() {
      f9000 = new double[]{Math.PI, 0.08, 0.5, 0.08};
      f3000 = new double[]{0.5, 0.18, 0.16, 110.0, 260.0, 95.0, 210.0};
      f5000 = new double[]{3.6, 0.12, 0.12};
      f11000 = new double[]{0.16, 140.0, 360.0};
      f1000 = new double[]{0.0, Math.PI * 2, 0.36};
      f2000 = new double[]{0.22, 0.13, 0.24, 0.16, 0.2, 0.12, 0.42, 0.26};
      f7000 = new double[]{230.0, 190.0, 420.0, 340.0, 620.0, 460.0};
      f8000 = new double[]{1250.0, 980.0, 95.0, 165.0};
   }
}
