package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NjL;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0719;
import rw.core.C0877;
import rw.core.C0983;
import rw.core.C0988;
import rw.core.C0989;
import rw.core.C1140;
import rw.core.C1176;
import rw.core.C1177;
import rw.defs.Enum0055;
import rw.module.AttackAura_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AimAssist",
   y = Enum0055.COMBAT,
   N = Enum0070.FIGHTING
)
public class AimAssist extends GuiWidget {
   private static short[] f1000;
   private static double[] f2000;
   private static double[] f3000;
   private static double[] f4000;
   private static double[] f5000;
   private static short[] f6000;
   private static float[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static String[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static float[] f17000;
   private static short[] f18000;
   public Object[] f19000;
   private static double[] f20000;
   private static short[] f21000;
   private static double[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static float[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   public static Object[] f29000;

   private static void m4000() {
      f29000 = new Object[]{0.008333333333333333, 0.05};
   }

   public AimAssist() {
      this.m14000();
      C0988 var5 = C0122.m12000(this, f12000[0], f26000[0], f26000[1], f26000[2], f26000[3]);
      this.f19000[0] = var5;
      C0988 var6 = C0122.m12000(this, f12000[1], f7000[0], f7000[1], f7000[2], f7000[3]);
      this.f19000[1] = var6;
      C0988 var7 = C0122.m12000(this, f12000[2], f7000[4], f7000[5], f17000[0], f17000[1]);
      this.f19000[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f10000 = new short[]{0, 1, 2};
      f15000 = new short[]{3, 4, 5, 6};
      f24000 = new short[]{7, 3, 0};
      f18000 = new short[]{3, 3};
      f21000 = new short[]{4, 5};
      f1000 = new short[]{6, 7, 5, 5};
      f16000 = new short[]{5, 4, 4};
      f27000 = new short[]{6, 7};
      f25000 = new short[]{6, 7, 2, 6};
      f6000 = new short[]{6, 7, 7};
      f9000 = new short[]{6, 7};
      f13000 = new short[]{6, 6};
      f28000 = new short[]{7, 7, 4};
      f23000 = new short[]{4, 1, 0, 4, 0};
      f14000 = new short[]{4, 4, 4};
      f11000 = new short[]{4, 0, 0, 4, 0, 4};
      f8000 = new short[]{0, 0, 4, 0, 4, 1};
   }

   private static void m10000() {
      f12000 = new String[]{"fov", "aim-range", "speed"};
   }

   private static void m12000() {
      f4000 = new double[]{0.0, 0.0};
      f20000 = new double[]{0.0, 0.0, 0.008333333333333333, 1.0E9, 0.0, 0.05};
      f2000 = new double[]{0.008333333333333333, 1.0, 0.0, 0.0, 0.0, 0.0};
      f22000 = new double[]{5.0, 0.0, 0.0, 180.0F / (float)Math.PI};
      f5000 = new double[]{90.0, 0.5, 10.0, 0.1F, (float) (Math.PI / 180.0)};
      f3000 = new double[]{(float) (Math.PI / 180.0), 0.2, 0.21, 0.0, 0.0, 0.008333333333333333, 0.05};
   }

   private static void m8000() {
      f26000 = new float[]{180.0F, 1.0F, 180.0F, 1.0F};
      f7000 = new float[]{4.0F, 0.1F, 10.0F, 0.1F, 4.0F, 0.1F};
      f17000 = new float[]{10.0F, 0.1F, 180.0F};
   }

   private void m14000() {
      if (this.f19000 == null) {
         this.f19000 = new Object[8];
         Object[] var1 = this.f19000;
         var1[3] = 0;
         var1[5] = 0L;
         var1[6] = f3000[3];
         var1[7] = f3000[4];
      }
   }

   public void m20000() {
      this.m14000();
      Integer var5 = 0;
      this.f19000[3] = var5;
      Object var6 = null;
      this.f19000[4] = var6;
      Long var7 = 0L;
      this.f19000[5] = var7;
      Double var8 = f4000[0];
      this.f19000[6] = var8;
      Double var9 = f4000[1];
      this.f19000[7] = var9;
      super.m6000();
   }

   private boolean m12000(NjL var1) {
      this.m14000();
      if (!var1.method_5805()) {
         return (boolean)0;
      } else if (C1140.m32000().test(var1)) {
         return (boolean)0;
      } else {
         NXi var2 = C1177.m30000(var1, true, ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755());
         return (boolean)(var2.R(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571()) > ((Float)((C0988)this.f19000[1]).i()).floatValue() ? 0 : this.m26000(var1));
      }
   }

   @Iface0642
   public void m14000(C0719 var1) {
      this.m14000();
      this.m16000(((NNNZg)((NNuU)this.y[0]).T[3]).method_8469((Integer)this.f19000[3]));
   }

   private void m16000(NbK var1) {
      this.m14000();
      if (var1 instanceof NjL var2) {
         if (!this.m12000(var2)) {
            Object var10 = null;
            this.f19000[4] = var10;
         } else {
            C0983 var3 = C0989.m28000();
            TargetEsp.m28000(var2, 15);
            if (C1176.m62000(var3, ((Float)((C0988)this.f19000[1]).i()).floatValue(), var2.method_5829().B(f3000[1]))) {
               NXi var4 = C1177.m44000(var2, var3, true, ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755(), var0 -> var0.B(f3000[2]));
               if (!C1176.m46000(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571(), var4, NNnS.field_17559, NNnC.field_1348)) {
                  Object var11 = null;
                  this.f19000[4] = var11;
               } else {
                  C0983 var12 = C0989.m30000(var4);
                  this.f19000[4] = var12;
               }
            } else {
               Object var13 = null;
               this.f19000[4] = var13;
            }
         }
      } else {
         Object var9 = null;
         this.f19000[4] = var9;
      }
   }

   @Iface0642
   public void m18000(AttackAura_x var1) {
      this.m14000();
      Integer var6 = var1.m2000().method_5628();
      this.f19000[3] = var6;
   }

   @Iface0642
   public void m24000(rw.module.AimAssist var1) {
      this.m14000();
      if ((C0983)this.f19000[4] == null) {
         Long var33 = 0L;
         this.f19000[5] = var33;
         Double var34 = f20000[0];
         this.f19000[6] = var34;
         Double var35 = f20000[1];
         this.f19000[7] = var35;
      } else {
         long var2 = System.nanoTime();
         double var4 = this.f19000[5] == 0L ? f20000[2] : (var2 - (Long)this.f19000[5]) / f20000[3];
         Long var36 = var2;
         this.f19000[5] = var36;
         double var6 = NNWE.N(var4, f20000[4], f20000[5]) / f2000[0];
         C0983 var8 = C0989.m28000();
         float var9 = var8.m68000() - ((C0983)this.f19000[4]).m68000();
         float var10 = NNWE.R(var8.m38000() - ((C0983)this.f19000[4]).m38000());
         double var11 = Math.hypot(var9, var10);
         if (var11 < f2000[1]) {
            Double var37 = f2000[2];
            this.f19000[f27000[0]] = var37;
            Double var38 = f2000[3];
            this.f19000[f27000[1]] = var38;
         } else if (var1.m18000() == f2000[4] && var1.m4000() == f2000[5] && var11 > f22000[0]) {
            Double var39 = f22000[1];
            this.f19000[6] = var39;
            Double var40 = f22000[2];
            this.f19000[7] = var40;
         } else {
            double var13 = NNWE.u(var9, var10) * f22000[3] - f5000[0];
            double var15 = ((Float)((C0988)this.f19000[2]).i()).floatValue() * Math.max(f5000[1], Math.min(var11, f5000[2]) * f5000[3]) * var6;
            double var17 = Math.min(var15, (double)Math.abs(var10));
            double var19 = Math.min(var15, (double)Math.abs(var9));
            Double var41 = (Double)this.f19000[6] + Math.sin(var13 * f5000[4]) * var17;
            this.f19000[6] = var41;
            Double var42 = (Double)this.f19000[7] + -Math.cos(var13 * f3000[0]) * var19;
            this.f19000[7] = var42;
            double var21 = Math.round((Double)this.f19000[6]);
            double var23 = Math.round((Double)this.f19000[7]);
            Double var43 = (Double)this.f19000[6] - var21;
            this.f19000[6] = var43;
            Double var44 = (Double)this.f19000[7] - var23;
            this.f19000[7] = var44;
            double var25 = C0877.m26000(var1.m18000());
            double var27 = C0877.m26000(var1.m4000());
            var1.m22000(C0877.m16000(var25 + var21));
            var1.m20000(C0877.m16000(var27 + var23));
         }
      }
   }

   public boolean m26000(NjL var1) {
      this.m14000();
      if ((Float)((C0988)this.f19000[0]).i() == f17000[2]) {
         return (boolean)1;
      } else {
         C0983 var2 = C0989.m4000();
         return (boolean)(C1176.m60000(var2, ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755(), var1)
               && !(var2.m48000(C1177.m64000(var1, var2, false, ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755())) < ((C0988)this.f19000[0]).i())
            ? 0
            : 1);
      }
   }
}
