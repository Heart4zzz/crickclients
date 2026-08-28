package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NcZ;
import KDFzREm.NjL;
import rw.api.Iface0647;
import rw.data.Rec0009;
import rw.data.Rec0011;
import rw.data.Rec0028;
import rw.data.Rec0188;
import rw.gui.AttackAura;

public class HlPo extends Base0764 {
   public Object[] f1000;
   private static short[] f2000;
   private static double[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static double[] f7000;
   private static short[] f8000;
   private static double[] f9000;
   private static double[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   public Object[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static float[] f19000;
   private static double[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;

   private static void m4000() {
      f4000 = new short[]{2, 3, 0, 1, 2};
      f11000 = new short[]{3, 4};
      f17000 = new short[]{0, 0, 2, 0, 4};
      f24000 = new short[]{2, 2, 2, 0, 2};
      f5000 = new short[]{3, 1};
      f16000 = new short[]{1, 1, 0, 0};
      f29000 = new short[]{2, 1, 2};
      f2000 = new short[]{1, 1, 0, 0, 0, 0, 2, 0};
      f25000 = new short[]{0, 2, 0, 4};
      f12000 = new short[]{4, 4, 3};
      f22000 = new short[]{0, 1, 2, 3, 2, 4, 2, 2};
      f28000 = new short[]{0, 2};
      f6000 = new short[]{0, 2};
      f13000 = new short[]{0, 2};
      f30000 = new short[]{3, 2, 0, 4, 0, 4, 0, 2};
      f26000 = new short[]{1, 2, 2};
      f23000 = new short[]{2, 0, 4, 0, 4, 0, 3};
      f18000 = new short[]{0, 4};
      f21000 = new short[]{0, 3, 0, 4, 1, 4, 3, 0};
      f8000 = new short[]{1, 2, 3, 2, 4, 0, 4};
      f27000 = new short[]{3, 4, 4, 3, 4};
      f15000 = new short[]{3, 4, 0, 4, 4};
   }

   private void m2000() {
      if (this.f14000 == null) {
         this.f14000 = new Object[4];
         Object[] var1 = this.f14000;
         var1[0] = 0;
         var1[1] = 0;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var2 = this.f1000;
         var2[4] = 0;
      }
   }

   public HlPo(AttackAura var1, String var2) {
      super(var1, var2);
      this.m2000();
      C0768 var7 = new C0768();
      this.f14000[2] = var7;
      OlkrOkjjj var8 = new OlkrOkjjj();
      this.f14000[3] = var8;
      C0057 var9 = new C0057();
      this.f1000[0] = var9;
      C0058 var10 = new C0058();
      this.f1000[1] = var10;
      XxYy var11 = new XxYy();
      this.f1000[2] = var11;
      C0762 var12 = new C0762();
      this.f1000[3] = var12;
      Integer var13 = Integer.MIN_VALUE;
      this.f1000[4] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f19000 = new float[]{0.0F};
   }

   private static void m8000() {
      f7000 = new double[]{0.0, 0.1F, 0.0, 0.0, -0.5};
      f9000 = new double[]{0.0, 1.0, 1.0E-4, 0.5};
      f10000 = new double[]{0.5, 0.015, 0.18};
      f3000 = new double[]{0.015, 0.18, 0.28, 0.18, 0.38, 0.46};
      f20000 = new double[]{Double.MAX_VALUE, 0.0, 3.8, 0.86, 4.2, 0.01};
   }

   public void m14000(NjL var1) {
      this.m2000();
      super.m16000(var1);
      Integer var6 = (Integer)this.f14000[f5000[1]] + 1;
      this.f14000[1] = var6;
      ((AttackAura)this.y[1]).m122000(C1183.m24000(0, 2));
      NNuU var7 = (NNuU)this.y[0];
      C0768.f1000[0] = var7;
      ((C0768)this.f14000[2]).m44000((float)((AttackAura)this.y[1]).m76000());
   }

   public boolean m18000() {
      NHS var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().u(f7000[0], f7000[1], f7000[2]);
      NHS var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().u(f7000[3], f7000[4], f9000[0]);
      boolean var3 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8600((NNNwS)((NNuU)this.y[0]).T[4], var1).iterator().hasNext();
      boolean var4 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8600((NNNwS)((NNuU)this.y[0]).T[4], var2).iterator().hasNext();
      return (boolean)(var3 && var4 && this.m24000() == 13 ? 0 : super.m24000());
   }

   static boolean m4000(NjL var0, C0983 var1, float var2) {
      NNuU var3 = (NNuU)C0768.f1000[0];
      if ((NNNwS)var3.T[4] != null && (NNNZg)var3.T[3] != null && var0 != null && var1 != null && !(var2 <= f19000[0])) {
         NXi var4 = ((NNNwS)var3.T[4]).method_33571();
         NXi var5 = ((NNNwS)var3.T[4]).method_5631(var1.m68000(), var1.m38000());
         NXi var6 = var4.i(var5.L(var2));
         NHS var7 = new NHS(var4, var4).y(var5.L(var2)).M(f9000[1]);
         NbK var8 = null;
         double var9 = var2 * var2;

         for (NbK var12 : ((NNNZg)var3.T[3]).method_8333((NNNwS)var3.T[4], var7, var0x -> (boolean)(!var0x.method_7325() && var0x.method_5863() ? 1 : 0))) {
            NHS var13 = var12 == var0 ? C0758.m12000(var12) : C0758.m6000(var12).M(Math.max(f9000[2], (double)var12.method_5871()));
            NXi var14 = var13.u(var4) ? var4 : (NXi)var13.y(var4, var6).orElse(null);
            if (var14 != null) {
               double var15 = var4.M(var14);
               if (var8 == null || !(var15 >= var9)) {
                  var8 = var12;
                  var9 = var15;
               }
            }
         }

         NNty var17 = ((NNNZg)var3.T[3]).N(new NNnf(var4, var6, NNnS.field_17558, NNnC.field_1348, (NNNwS)var3.T[4]));
         int var18 = var17 != null && var17.N() == NcZ.field_1332 && var4.M(var17.y()) <= var9 ? 1 : 0;
         return (boolean)(var18 == 0 && var8 == var0 ? 1 : 0);
      } else {
         return (boolean)0;
      }
   }

   public C0983 m20000(NjL var1, boolean var2, double var3) {
      this.m2000();
      NNuU var20 = (NNuU)this.y[0];
      C0768.f1000[0] = var20;
      ((C0768)this.f14000[2]).m34000((float)var3, var2, (boolean)1);
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && var1 != null) {
         C0983 var23 = C0989.m28000();
         int var6 = this.f1000[4] != var1.method_5628() ? 1 : 0;
         if (var6 != 0) {
            Integer var21 = var1.method_5628();
            this.f1000[4] = var21;
            ((OlkrOkjjj)this.f14000[3]).m26000();
            ((C0057)this.f1000[0]).m44000();
            ((C0058)this.f1000[1]).m28000(var23);
            ((XxYy)this.f1000[2]).m44000(var23);
            ((C0762)this.f1000[3]).m46000();
            C0768 var10000 = (C0768)this.f14000[2];
            Long var22 = System.currentTimeMillis();
            var10000.f3000[4] = var22;
         }

         boolean var7 = ((C0768)this.f14000[2]).m40000();
         boolean var8 = ((C0757)((C0768)this.f14000[2]).f3000[0]).m24000((C0768)this.f14000[2], var1);
         int var9 = (NNNZZ)((NNuU)this.y[0]).T[2] != null && ((Iface0647)((NNNZZ)((NNuU)this.y[0]).T[2])).m2000() < 2 ? 1 : 0;
         Rec0188 var10 = ((OlkrOkjjj)this.f14000[3])
            .m34000(
               (C0768)this.f14000[2],
               var1,
               var23,
               new C0983(((NNNwS)((NNuU)this.y[0]).T[4]).field_5982, ((NNNwS)((NNuU)this.y[0]).T[4]).field_6004),
               var7,
               (boolean)var9,
               var8
            );
         Rec0028 var11 = ((C0057)this.f1000[0]).m32000((C0768)this.f14000[2], var23, var10, var7, (boolean)var9, var8);
         C0983 var12 = new C0983(var10.m20000().m38000() + var11.m10000(), var10.m20000().m68000() + var11.m14000());
         Rec0011 var13 = ((C0058)this.f1000[1])
            .m38000(
               (C0768)this.f14000[2],
               var1,
               var23,
               var12,
               var11.m8000(),
               var11.m12000(),
               var11.m6000(),
               var10.m22000(),
               var10.m16000() && !var10.m28000() && !var11.m2000()
            );
         Rec0009 var14 = ((XxYy)this.f1000[2])
            .m34000(
               (C0768)this.f14000[2],
               var1,
               var23,
               var13.m6000(),
               var13.m8000(),
               var13.m2000(),
               var7 && var8,
               (boolean)var9,
               var11.m6000(),
               var10.m22000(),
               var10.m16000(),
               var10.m4000() || var10.m28000() || var11.m2000()
            );
         C0983 var15 = var14.m2000();
         return var15.m54000(true).m32000(true);
      } else {
         C0983 var5 = C0989.m4000();
         this.m10000(var5);
         return var5;
      }
   }

   public void m22000(NjL var1) {
      Boolean var7 = this.u();
      this.y[2] = var7;
      C0983 var2 = this.y(var1, false, ((AttackAura)this.y[1]).m72000());
      if (this.L(var1) && !this.m32000(var1, var2)) {
         this.m14000(var1);
      }

      NuZz.m44000(var2.m40000(((AttackAura)this.y[1]).m58000()));
   }

   public int m24000() {
      this.m2000();
      return super.m32000() + (this.f14000[1] % 4 == 0 ? 3 : 0);
   }

   static NXi m6000(NjL var0, C0983 var1, float var2) {
      NNuU var3 = (NNuU)C0768.f1000[0];
      if ((NNNwS)var3.T[4] != null && var0 != null) {
         NHS var4 = C0758.m6000(var0);
         double var5 = (var4.N + var4.u) * f9000[3];
         double var7 = (var4.L + var4.R) * f10000[0];
         double var9 = Math.max(f10000[1], var4.y() * f10000[2]);
         double var11 = Math.max(f3000[0], var4.u() * f3000[1]);
         double var13 = var4.N + var9;
         double var15 = var4.u - var9;
         double var17 = var4.L + var11;
         double var19 = var4.R - var11;
         NXi var21 = C0758.m30000(var0);
         double var22 = NNWE.u(f3000[2], var4.y, var4.i);
         double var24 = NNWE.u(f3000[3], var4.y, var4.i);
         double var26 = NNWE.u(f3000[4], var4.y, var4.i);
         double var28 = NNWE.u(f3000[5], var4.y, var4.i);
         NXi[] var30 = new NXi[]{
            new NXi(var5, var22, var7),
            new NXi(NNWE.N(var21.M, var13, var15), NNWE.N(var21.B, var24, var26), NNWE.N(var21.Z, var17, var19)),
            new NXi(var13, var22, var7),
            new NXi(var15, var22, var7),
            new NXi(var5, var22, var17),
            new NXi(var5, var22, var19),
            new NXi(var5, var24, var7),
            new NXi(var5, var26, var7),
            new NXi(var5, var28, var7)
         };
         NXi var31 = var30[0];
         double var32 = f20000[0];
         NXi var34 = ((NNNwS)var3.T[4]).method_33571();

         for (NXi var38 : var30) {
            C0983 var39 = C0070.m14000(var38);
            if (m4000(var0, var39, var2)) {
               double var40 = Math.abs(C0070.m12000(var1.m38000(), var39.m38000()));
               double var42 = Math.abs(var1.m68000() - var39.m68000());
               double var44 = Math.max(f20000[1], var38.B - var26) * f20000[2];
               double var46 = var40 * f20000[3] + var42 * f20000[4] + var44 + var34.M(var38) * f20000[5];
               if (var46 < var32) {
                  var31 = var38;
                  var32 = var46;
               }
            }
         }

         return var31;
      } else {
         return null;
      }
   }

   @Override
   public NXi m30000(NjL var1, double var2) {
      this.m2000();
      NNuU var12 = (NNuU)this.y[0];
      C0768.f1000[0] = var12;
      ((C0768)this.f14000[2]).m34000((float)var2, (boolean)0, (boolean)0);
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && var1 != null) {
         C0983 var4 = C0989.m28000();
         boolean var5 = ((C0768)this.f14000[f24000[0]]).m36000(var1, var4);
         boolean var6 = ((C0768)this.f14000[f24000[1]]).m40000();
         boolean var7 = ((C0757)((C0768)this.f14000[f24000[2]]).f3000[f24000[3]]).m24000((C0768)this.f14000[f24000[4]], var1);
         return ((C0762)this.f1000[f5000[0]]).m30000(C0758.m12000(var1), var1, var5, var6, var7);
      } else {
         return var1 == null ? NXi.L : var1.method_33571();
      }
   }

   public boolean m32000(NjL var1, C0983 var2) {
      this.m2000();
      boolean var3 = super.m48000(var1, var2);
      if (var3) {
         Integer var8 = 0;
         this.f14000[0] = var8;
         return (boolean)1;
      } else {
         int var10002 = (Integer)this.f14000[0] + 1;
         Integer var9 = var10002;
         this.f14000[0] = var9;
         return (boolean)(var10002 < (((Iface0647)((NNNZZ)((NNuU)this.y[0]).T[2])).m2000() < 15 ? 3 : 4) ? 1 : 0);
      }
   }

   private void m10000(C0983 var1) {
      this.m2000();
      Integer var6 = Integer.MIN_VALUE;
      this.f1000[4] = var6;
      ((OlkrOkjjj)this.f14000[3]).m26000();
      ((C0057)this.f1000[0]).m44000();
      ((C0058)this.f1000[1]).m28000(var1);
      ((XxYy)this.f1000[2]).m44000(var1);
      ((C0762)this.f1000[3]).m46000();
      C0768 var10000 = (C0768)this.f14000[2];
      Long var7 = System.currentTimeMillis();
      var10000.f3000[4] = var7;
   }
}
