package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.data.Rec0191;
import rw.defs.OlsqOjlj;

public class OlmjiOqjr {
   private static float[] f1000;
   private static long[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   private static long[] f5000;
   private static long[] f6000;
   private static double[] f7000;
   private static double[] f8000;
   private static float[] f9000;
   private static double[] f10000;
   private static double[] f11000;
   public Object[] f12000;
   private static float[] f13000;
   private static float[] f14000;
   private static double[] f15000;
   private static double[] f16000;
   private static float[] f17000;

   private static void m2000() {
      f9000 = new float[]{0.0F, 1.0F, 1.0F, 1.0F, 4.8F, 2.35F};
      f14000 = new float[]{0.7F, 0.1F, 1.0F, -1.0F, 1.0F, -1.0F, 14.0F, 18.5F};
      f17000 = new float[]{23.0F, 28.5F, 34.0F, 41.0F};
      f13000 = new float[]{-16.0F, -22.0F, -30.0F, -38.0F, 0.0F, 3.5F, -3.5F, 6.5F};
      f4000 = new float[]{-6.5F, 10.0F, -10.0F, 14.0F, -14.0F};
      f1000 = new float[]{0.0F, -90.0F, 90.0F, 1.75F, 16.0F, -90.0F, 90.0F, 1.0F};
      f3000 = new float[]{1.0F};
   }

   public OlmjiOqjr() {
      this.m16000();
      OlsqOjlj var5 = (OlsqOjlj)OlsqOjlj.f2000[0];
      this.f12000[5] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f7000 = new double[]{85.0, 180.0, 145.0, 235.0, 0.34F, 0.0};
      f15000 = new double[]{Math.PI * 2, 0.08};
      f10000 = new double[]{0.5, 0.08, 0.5, 1.05, 1.85, 0.22, 0.18, 0.28};
      f11000 = new double[]{0.22, 145.0};
      f16000 = new double[]{245.0, 520.0, 1180.0};
      f8000 = new double[]{260.0, 680.0, 0.5, 0.5, 2.2, 0.38};
   }

   private void m16000() {
      if (this.f12000 == null) {
         this.f12000 = new Object[6];
         Object[] var1 = this.f12000;
         var1[0] = f6000[5];
         var1[1] = f6000[6];
         var1[2] = f6000[7];
      }
   }

   private static void m18000() {
      f5000 = new long[]{0L, 0L};
      f2000 = new long[]{0L, 1L};
      f6000 = new long[]{135L, 485L, 540L, 0L, 0L, 0L, 0L, 0L};
   }

   private float m20000(float var1) {
      return f1000[7] - (float)Math.pow(f3000[0] - var1, f8000[4]);
   }

   private void m26000(long var1, boolean var3) {
      OlsqOjlj var8 = (OlsqOjlj)OlsqOjlj.f2000[0];
      this.f12000[5] = var8;
      Long var9 = f6000[3];
      this.f12000[1] = var9;
      Long var10 = f6000[4];
      this.f12000[2] = var10;
      Object var11 = null;
      this.f12000[3] = var11;
      Object var12 = null;
      this.f12000[4] = var12;
      if (!var3 && var1 >= (Long)this.f12000[0]) {
         Long var13 = var1 + (long)C0052.m8000(f8000[0], f8000[1]);
         this.f12000[0] = var13;
      }
   }

   private boolean m28000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7) {
      if (var5 && !var6 && !var7 && var3 != null) {
         long var8 = var1.m24000().m12000();
         if (var8 >= f6000[0] && var8 <= f6000[1]) {
            float var10 = Math.abs(C0070.m12000(var3.m38000(), var4.m38000()));
            float var11 = Math.abs(var4.m68000() - var3.m68000());
            if (!(var10 > f9000[4]) && !(var11 > f9000[5])) {
               double var12 = ((NNNwS)((NNuU)C0768.f1000[0]).T[4]).method_33571().R(C0758.m20000(var2));
               if (var12 > var1.m38000(var2) + f14000[0]) {
                  return (boolean)0;
               } else {
                  return (boolean)(Math.random() < f7000[4] ? 1 : 0);
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

   private C0983 m30000(C0768 var1, NjL var2, C0983 var3, C0983 var4) {
      float var5 = var3 == null ? var4.m38000() : var3.m38000();
      float var6 = var3 == null ? var4.m68000() : var3.m68000();
      float var7 = C0070.m12000(var5, var4.m38000());
      float var8 = Math.abs(var7) > f14000[1] ? -Math.signum(var7) : (Math.random() > f8000[2] ? f14000[2] : f14000[3]);
      float var9 = Math.random() > f8000[3] ? f14000[4] : f14000[5];
      float[] var10 = new float[]{f14000[6], f14000[7], f17000[0], f17000[1], f17000[2], f17000[3], f13000[0], f13000[1], f13000[2], f13000[3]};
      float[] var11 = new float[]{f13000[4], f13000[5], f13000[6], f13000[7], f4000[0], f4000[1], f4000[2], f4000[3], f4000[4]};
      C0983 var12 = null;
      float var13 = f1000[0];

      for (float var17 : var10) {
         for (float var21 : var11) {
            C0983 var25 = new C0983(var5 + var8 * var17, NNWE.N(var6 + var9 * var21, f1000[1], f1000[2]));
            float var24;
            if (!var1.m36000(var2, var25)
               && (var24 = Math.abs(C0070.m12000(var4.m38000(), var25.m38000())) + Math.abs(var25.m68000() - var4.m68000()) * f1000[3]) >= f1000[4]
               && var24 > var13) {
               var12 = var25;
               var13 = var24;
            }
         }
      }

      return var12;
   }

   private C0983 m32000(C0983 var1, C0983 var2, float var3) {
      return var1 == null
         ? var2
         : new C0983(var1.m38000() + C0070.m12000(var1.m38000(), var2.m38000()) * var3, NNWE.N(NNWE.B(var3, var1.m68000(), var2.m68000()), f1000[5], f1000[6]));
   }

   private float m34000(float var1) {
      return (float)Math.pow(var1, f8000[5]);
   }

   private boolean m36000(C0768 var1, boolean var2, boolean var3, boolean var4) {
      return (boolean)(!var3 && (!var2 || !var4) && var1.m24000().m12000() <= f6000[2] ? 0 : 1);
   }

   public void m42000() {
      Long var5 = 0L;
      this.f12000[0] = var5;
      Long var6 = 0L;
      this.f12000[1] = var6;
      Long var7 = 0L;
      this.f12000[2] = var7;
      Object var8 = null;
      this.f12000[3] = var8;
      Object var9 = null;
      this.f12000[4] = var9;
      OlsqOjlj var10 = (OlsqOjlj)OlsqOjlj.f2000[0];
      this.f12000[5] = var10;
   }

   private boolean m44000(C0768 var1, NjL var2, long var3, NHS var5, NXi var6, C0983 var7, C0983 var8) {
      C0983 var23 = this.m30000(var1, var2, var7, var8);
      this.f12000[4] = var23;
      if ((C0983)this.f12000[4] == null) {
         return (boolean)0;
      } else {
         float var9 = C0052.m8000(f7000[5], f15000[0]);
         double var10 = Math.max(f15000[1], (var5.u - var5.N) * f10000[0]);
         double var12 = Math.max(f10000[1], (var5.R - var5.L) * f10000[2]);
         double var14 = C0052.m8000(f10000[3], f10000[4]);
         double var16 = C0052.m8000(-(var5.i - var5.y) * f10000[5], (var5.i - var5.y) * f10000[6]);
         NXi var18 = var5.R();
         NXi var24 = new NXi(
            var18.M + Math.cos(var9) * (var10 + var14),
            NNWE.N(var6.B + var16, var5.y - (var5.i - var5.y) * f10000[7], var5.i + (var5.i - var5.y) * f11000[0]),
            var18.Z + Math.sin(var9) * (var12 + var14)
         );
         this.f12000[3] = var24;
         OlsqOjlj var25 = (OlsqOjlj)OlsqOjlj.f2000[1];
         this.f12000[5] = var25;
         Long var26 = var3;
         this.f12000[1] = var26;
         Long var27 = var3 + (long)C0052.m8000(f11000[1], f16000[0]);
         this.f12000[2] = var27;
         Long var28 = var3 + (long)C0052.m8000(f16000[1], f16000[2]);
         this.f12000[0] = var28;
         return (boolean)1;
      }
   }

   private NXi m46000(NXi var1, NXi var2, float var3) {
      return var2 == null ? var1 : new NXi(NNWE.u(var3, var1.M, var2.M), NNWE.u(var3, var1.B, var2.B), NNWE.u(var3, var1.Z, var2.Z));
   }

   public Rec0191 m48000(C0768 var1, NjL var2, NHS var3, NXi var4, C0983 var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      long var10 = System.currentTimeMillis();
      if (this.m36000(var1, var7, var8, var9)) {
         this.m26000(var10, (boolean)0);
      }

      C0983 var12 = C0070.m14000(var4);
      if ((OlsqOjlj)this.f12000[5] == (OlsqOjlj)OlsqOjlj.f2000[0]
         && var10 >= (Long)this.f12000[0]
         && this.m28000(var1, var2, var5, var12, var6, var7, var8)
         && !this.m44000(var1, var2, var10, var3, var4, var5, var12)) {
         Long var21 = var10 + (long)C0052.m8000(f7000[0], f7000[1]);
         this.f12000[0] = var21;
      }

      if ((OlsqOjlj)this.f12000[5] == (OlsqOjlj)OlsqOjlj.f2000[0]) {
         return Rec0191.m14000(var4, var12);
      } else {
         if (var10 >= (Long)this.f12000[2]) {
            if ((OlsqOjlj)this.f12000[5] != (OlsqOjlj)OlsqOjlj.f2000[1]) {
               this.m26000(var10, (boolean)1);
               return Rec0191.m14000(var4, var12);
            }

            OlsqOjlj var22 = (OlsqOjlj)OlsqOjlj.f2000[2];
            this.f12000[5] = var22;
            Long var23 = var10;
            this.f12000[1] = var23;
            Long var24 = var10 + (long)C0052.m8000(f7000[2], f7000[3]);
            this.f12000[2] = var24;
         }

         float var13 = NNWE.N((float)(var10 - (Long)this.f12000[1]) / (float)Math.max(1L, (Long)this.f12000[2] - (Long)this.f12000[1]), f9000[0], f9000[1]);
         if ((OlsqOjlj)this.f12000[5] == (OlsqOjlj)OlsqOjlj.f2000[1]) {
            float var25 = this.m20000(var13);
            NXi var26 = this.m46000(var4, (NXi)this.f12000[3], var25);
            return new Rec0191(var26, (C0983)this.f12000[4], true, false);
         } else {
            float var14 = f9000[2] - this.m34000(var13);
            NXi var15 = this.m46000(var4, (NXi)this.f12000[3], var14);
            C0983 var16 = this.m32000((C0983)this.f12000[4], var12, f9000[3] - var14);
            return new Rec0191(var15, var16, true, true);
         }
      }
   }
}
