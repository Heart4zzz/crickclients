package rw.gui;

import KDFzREm.NCa;
import KDFzREm.NEj;
import KDFzREm.NHS;
import KDFzREm.NKL;
import KDFzREm.NKi;
import KDFzREm.NNHG;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NYO;
import KDFzREm.NbB;
import KDFzREm.NbK;
import KDFzREm.NbL;
import KDFzREm.NbZ;
import KDFzREm.Nbp;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0719;
import rw.core.C0892;
import rw.core.C0906;
import rw.core.C0983;
import rw.core.C0989;
import rw.core.C0991;
import rw.core.C1003;
import rw.core.C1013;
import rw.core.C1176;
import rw.core.C1177;
import rw.core.IljlItp;
import rw.core.NuZz;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AutoExplosion",
   y = Enum0055.COMBAT,
   N = Enum0070.FIGHTING
)
public class AutoExplosion extends GuiWidget {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   public Object[] f10000;
   private static short[] f11000;
   private static String[] f12000;
   private static short[] f13000;
   public Object[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static double[] f20000;
   private static short[] f21000;
   private static short[] f22000;

   private void m2000(Ned var1, C0983 var2) {
      this.m10000();
      if (this.m14000(var1)) {
         NuZz.m44000(var2);
         NNty var3 = this.m28000(var1, var2);
         if (var3 != null && var3.N() == NcZ.field_1332) {
            if (((NNNwS)((NNuU)this.y[0]).T[4]).method_6079().N(NQa.ln)) {
               this.m34000(var3, NbL.field_5810);
               NHS var9 = new NHS(var1.method_10084()).M(f20000[1]);
               this.f10000[2] = var9;
            } else {
               int var4 = IljlItp.m60000(NQa.ln);
               IljlItp.m50000(var4).ifPresent(var3x -> {
                  this.m10000();
                  C0892.m32000(var3x);
                  this.m30000(var3);
                  NHS var8 = new NHS(var1.method_10084()).M(f20000[5]);
                  this.f10000[2] = var8;
                  if ((Boolean)((C0991)this.f14000[4]).i()) {
                     C0892.m20000();
                  }
               });
            }
         }
      }
   }

   private void m4000() {
      this.m10000();
      C0983 var1 = C0989.m28000();

      for (NbK var3 : ((NNNZg)((NNuU)this.y[0]).T[3])
         .method_8333((NNNwS)((NNuU)this.y[0]).T[4], (NHS)this.f10000[2], var0 -> (boolean)(var0.method_5864() == Nbp.S ? 1 : 0))) {
         C0983 var4 = C0989.m26000(var1, C1177.m30000(var3, true, ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755()));
         C0983 var5 = var1.m62000(var4).m54000(true).m32000(true);
         if (!C1176.m60000(var5, ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755(), var3)) {
            ((NNNZZ)((NNuU)this.y[0]).T[2]).N((NNNwS)((NNuU)this.y[0]).T[4], var3);
            ((NNNwS)((NNuU)this.y[0]).T[4]).method_6104(NbL.field_5808);
            NuZz.m44000(var5);
            Object var10 = null;
            this.f10000[2] = var10;
            break;
         }
      }
   }

   private static void m6000() {
      f20000 = new double[]{0.5, 0.5, 1.0, 2.0, 1.0, 0.5};
   }

   public AutoExplosion() {
      this.m10000();
      C1013 var5 = new C1013(f12000[0], true);
      this.f14000[0] = var5;
      C1013 var6 = new C1013(f12000[1], true);
      this.f14000[1] = var6;
      C1003 var7 = C0122.m4000(this, f12000[2], (C1013)this.f14000[0], (C1013)this.f14000[1]);
      this.f14000[2] = var7;
      C0991 var8 = C0122.m26000(this, f12000[3], false);
      this.f14000[3] = var8;
      C0991 var9 = C0122.m26000(this, f12000[4], false);
      this.f14000[4] = var9;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f14000 == null) {
         this.f14000 = new Object[5];
         Object[] var1 = this.f14000;
      }

      if (this.f10000 == null) {
         this.f10000 = new Object[5];
         Object[] var2 = this.f10000;
      }
   }

   private static void m12000() {
      f12000 = new String[]{"crystals", "anchor", "triggers", "any-item-click", "reset-slot"};
   }

   private int m8000() {
      int var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().N();
      if (this.m26000(((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().method_5438(var1))) {
         return var1;
      } else {
         int var2 = IljlItp.m38000(this::m26000);
         return IljlItp.m36000(var2) ? IljlItp.m38000(var0 -> (boolean)(!var0.N(NQa.Mu) ? 1 : 0)) : var2;
      }
   }

   private static void m14000() {
      f9000 = new short[]{0, 1, 0, 1, 2, 3, 4};
      f7000 = new short[]{0, 0, 1, 1, 3, 4, 0, 3};
      f6000 = new short[]{0, 4, 0};
      f8000 = new short[]{2, 3, 0, 1};
      f2000 = new short[]{1, 3, 3};
      f5000 = new short[]{4, 0, 1, 0, 1, 0, 1};
      f1000 = new short[]{2, 3, 4, 3};
      f21000 = new short[]{4, 3, 4, 0, 4, 2, 0, 3};
      f16000 = new short[]{0, 4, 2};
      f22000 = new short[]{0, 4, 0, 4};
      f11000 = new short[]{0, 2};
      f19000 = new short[]{0, 4, 0, 4};
      f4000 = new short[]{2, 0, 3, 0, 3, 0};
      f17000 = new short[]{4, 4, 0, 4, 0, 4, 0, 3};
      f3000 = new short[]{0, 3};
      f18000 = new short[]{0, 3, 0, 4, 0};
      f13000 = new short[]{4, 0, 3, 0, 3, 0};
      f15000 = new short[]{2, 0, 4, 0, 4, 2, 4};
   }

   private void m12000(Ned var1, C0983 var2) {
      this.m10000();
      if (!(Boolean)((NNNZg)((NNuU)this.y[0]).T[3]).method_75728().N(NEj.O, var1)) {
         NCa var3 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var1);
         if (var3.i() == NKL.TE) {
            int var4 = (Integer)var3.L(NNHG.u);
            if (!((NNNwS)((NNuU)this.y[0]).T[4]).method_6079().N(NQa.Mu) || var4 >= 4) {
               NuZz.m44000(var2);
               NNty var5 = this.m28000(var1, var2);
               if (var5 != null && var5.N() == NcZ.field_1332) {
                  int var6 = this.m8000();
                  if (!IljlItp.m36000(var6)) {
                     if (var4 == 0) {
                        int var7 = IljlItp.m60000(NQa.Mu);
                        if (IljlItp.m36000(var7)) {
                           return;
                        }

                        C0892.m32000(var7);
                        this.m30000(var5);
                     }

                     C0892.m32000(var6);
                     this.m30000(var5);
                     if ((Boolean)((C0991)this.f14000[4]).i()) {
                        C0892.m20000();
                     }
                  }
               }
            }
         }
      }
   }

   private boolean m14000(Ned var1) {
      NCa var2 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var1);
      if (!var2.N(NKL.LV) && !var2.N(NKL.q)) {
         return (boolean)0;
      } else {
         Ned var3 = var1.method_10084();
         if (!((NNNZg)((NNuU)this.y[0]).T[3]).R(var3)) {
            return (boolean)0;
         } else {
            double var4 = var3.method_10263();
            double var6 = var3.method_10264();
            double var8 = var3.method_10260();
            return ((NNNZg)((NNuU)this.y[0]).T[3]).N(null, new NHS(var4, var6, var8, var4 + f20000[2], var6 + f20000[3], var8 + f20000[4])).isEmpty();
         }
      }
   }

   @Iface0642
   public void m16000(C0906 var1) {
      this.m10000();
      NKi var2 = var1.m20000().i();
      if (((C1013)this.f14000[0]).m14000() && var2 == NKL.LV) {
         Ned var7 = var1.m16000();
         this.f10000[0] = var7;
         C0983 var8 = C0989.m4000();
         this.f10000[1] = var8;
      } else if (((C1013)this.f14000[1]).m14000() && var2 == NKL.TE) {
         Ned var9 = var1.m16000();
         this.f10000[3] = var9;
         C0983 var10 = C0989.m4000();
         this.f10000[4] = var10;
      }
   }

   @Iface0642
   public void m20000(rw.module.NoInteract var1) {
      this.m10000();
      Ned var2 = var1.m2000().u();
      NKi var3 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var2).i();
      NQo var4 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var1.m14000());
      if (((C1013)this.f14000[0]).m14000() && (var3 == NKL.LV || var3 == NKL.q)) {
         if (var4.N(NQa.ln) && this.m14000(var2)) {
            NHS var9 = new NHS(var2.method_10084()).M(f20000[0]);
            this.f10000[2] = var9;
         } else if ((Boolean)((C0991)this.f14000[3]).i()) {
            this.f10000[0] = var2;
            C0983 var11 = C0989.m4000();
            this.f10000[1] = var11;
         }
      } else if (((C1013)this.f14000[1]).m14000() && var3 == NKL.TE && (var4.N(NQa.Mu) || (Boolean)((C0991)this.f14000[3]).i())) {
         this.f10000[3] = var2;
         C0983 var13 = C0989.m4000();
         this.f10000[4] = var13;
      }
   }

   @Iface0642
   public void m24000(C0719 var1) {
      this.m10000();
      if ((Ned)this.f10000[0] != null && (C0983)this.f10000[1] != null) {
         this.m2000((Ned)this.f10000[0], (C0983)this.f10000[1]);
         Object var6 = null;
         this.f10000[0] = var6;
         Object var7 = null;
         this.f10000[1] = var7;
      } else if ((NHS)this.f10000[2] != null) {
         this.m4000();
      } else if ((Ned)this.f10000[3] != null && (C0983)this.f10000[4] != null) {
         this.m12000((Ned)this.f10000[3], (C0983)this.f10000[4]);
         Object var8 = null;
         this.f10000[3] = var8;
         Object var9 = null;
         this.f10000[4] = var9;
      }
   }

   private boolean m26000(NQo var1) {
      return (boolean)(!var1.N(NQa.Mu) && !(var1.B() instanceof NYO) ? 1 : 0);
   }

   private NNty m28000(Ned var1, C0983 var2) {
      NXi var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();
      NXi var4 = var3.i(var2.m28000().L(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754()));
      return ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var1).R((NNNZg)((NNuU)this.y[0]).T[3], var1).method_1092(var3, var4, var1);
   }

   private void m30000(NNty var1) {
      this.m34000(var1, NbL.field_5808);
   }

   private void m34000(NNty var1, NbL var2) {
      if (((NNNZZ)((NNuU)this.y[0]).T[2]).N((NNNwS)((NNuU)this.y[0]).T[4], var2, var1) instanceof NbB var4 && var4.i() == NbZ.field_52427) {
         ((NNNwS)((NNuU)this.y[0]).T[4]).method_6104(var2);
      }
   }
}
