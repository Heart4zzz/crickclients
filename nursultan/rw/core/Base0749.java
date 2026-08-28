package rw.core;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NYO;
import KDFzREm.NYo;
import KDFzREm.NbL;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.Neo;
import KDFzREm.wY;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import rw.api.Iface0669;
import rw.data.Rec0181;
import rw.data.Rec0208;
import rw.gui.Scaffold;

public abstract class Base0749 extends C1013 {
   private static double[] f1000;
   private static double[] f2000;
   public Object[] f3000;

   public boolean m2000(NNty var1) {
      return (boolean)(var1.N() == NcZ.field_1333 ? 1 : 0);
   }

   public void m2000() {
      this.m6000();
      if ((Integer)this.f3000[2] >= 0) {
         Integer var16 = (Integer)this.f3000[2] - 1;
         this.f3000[2] = var16;
      }

      if (!this.m18000()) {
         this.m10000();
         Rec0181 var1 = this.m42000();
         if (var1 != null) {
            for (NbL var5 : NbL.values()) {
               if (this.m26000(((NNNwS)((NNuU)this.f3000[0]).T[4]).method_5998(var5))) {
                  NXi var6 = this.m52000(var1.m6000(), ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_73189().y(f2000[0], f2000[1], f2000[2]));
                  C0983 var7 = C0989.m28000();
                  C0983 var8 = C0989.m26000(var7, var6);
                  C0983 var9 = this.m50000(var1, var6, var8);
                  NNty var10 = this.m38000(var9.m38000(), var9.m68000(), var1);
                  NNty var11 = this.m38000(var7.m38000(), var7.m68000(), var1);
                  if (this.m30000(var10, var11)) {
                     var10 = var11;
                     var9 = var7;
                  }

                  if (this.m24000(var10, var5)) {
                     this.m40000(var10, var5);
                     this.m28000(var9, (boolean)1);
                  }

                  this.m28000(var9, (boolean)0);
                  break;
               }
            }
         }
      }
   }

   public boolean m4000() {
      C0892.m20000();
      return (boolean)1;
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[3];
         Object[] var1 = this.f3000;
         var1[2] = 0;
      }
   }

   public Base0749(Scaffold var1, String var2, boolean var3) {
      super(var2, var3);
      this.m6000();
      NNuU var8 = NNuU.Nq();
      this.f3000[0] = var8;
      this.f3000[1] = var1;
   }

   static {
      ntfClinit();
   }

   public void m10000() {
      this.m6000();
      NQo var1 = ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_6047();
      if (!this.m26000(var1)) {
         Optional var2 = IljlItp.m22000(this::m26000).max(Comparator.comparingInt(var0 -> var0.m6000().c()));
         if (!var2.isEmpty()) {
            C0892.m32000(((Rec0208)var2.get()).m4000());
         }
      }
   }

   public boolean m12000() {
      return (boolean)1;
   }

   private static void m16000() {
      f2000 = new double[]{0.0, -0.5, 0.0, 1.0, 1.0, 0.5};
      f1000 = new double[]{0.0, -0.15F, 0.0};
   }

   public boolean m18000() {
      return (boolean)0;
   }

   public boolean m22000(NNty var1) {
      this.m6000();
      if (!((Scaffold)this.f3000[1]).m4000()) {
         return (boolean)0;
      } else {
         return (boolean)(var1.i() == Nef.field_11036 && !this.m56000() && !((NNNwS)((NNuU)this.f3000[0]).T[4]).method_24828() ? 1 : 0);
      }
   }

   public boolean m24000(NNty var1, NbL var2) {
      this.m6000();
      if (this.m2000(var1)) {
         return (boolean)0;
      } else if (this.m22000(var1)) {
         return (boolean)0;
      } else {
         return (boolean)(!this.m36000(var1) ? 0 : this.m46000(((NNNwS)((NNuU)this.f3000[0]).T[4]).method_5998(var2), var1, var2));
      }
   }

   private boolean m26000(NQo var1) {
      this.m6000();
      if (!(var1.B() instanceof NYO var2)) {
         return (boolean)0;
      } else {
         NHS var4 = var2.L().W().R((NNNZg)((NNuU)this.f3000[0]).T[3], Ned.field_10980).method_1107();
         return (boolean)(var4.y() == f2000[3] && var4.u() == f2000[4] ? 1 : 0);
      }
   }

   public void m28000(C0983 var1, boolean var2) {
      NuZz.m44000(var1);
   }

   public boolean m30000(NNty var1, NNty var2) {
      if (var1.N() == NcZ.field_1333 || var2.N() == NcZ.field_1333) {
         return (boolean)0;
      } else if (!var1.u().equals(var2.u())) {
         return (boolean)0;
      } else {
         return (boolean)(var1.i() != Nef.field_11036 && var1.i() != var2.i() ? 0 : 1);
      }
   }

   public boolean m36000(NNty var1) {
      this.m6000();
      return (boolean)(this.f3000[2] <= 0 ? 1 : 0);
   }

   public NNty m38000(float var1, float var2, Rec0181 var3) {
      this.m6000();
      NXi var4 = ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_5631(var2, var1);
      NXi var5 = ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_33571();
      NXi var6 = var5.i(var4.L(((NNNwS)((NNuU)this.f3000[0]).T[4]).method_55754()));
      NCa var7 = ((NNNZg)((NNuU)this.f3000[0]).T[3]).method_8320(var3.m4000());
      NNty var8 = var7.R((NNNZg)((NNuU)this.f3000[0]).T[3], var3.m4000()).method_1092(var5, var6, var3.m4000());
      return var8 == null ? NNty.N(var5, Nef.field_11036, var3.m4000()) : var8;
   }

   public void m40000(NNty var1, NbL var2) {
      this.m6000();
      wY.N(var2, var1);
      C0979 var3 = ((Scaffold)this.f3000[1]).m12000();
      Integer var8 = C1183.m24000((int)var3.m32000(), (int)var3.m2000());
      this.f3000[2] = var8;
   }

   public Rec0181 m42000() {
      this.m6000();
      NXi var1 = ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_73189();
      NXi var2 = new NXi(
         ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_23317(),
         Math.floor(((NNNwS)((NNuU)this.f3000[0]).T[4]).method_23318()) - f2000[5],
         ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_23321()
      );
      double var3 = ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_55754();
      return this.m48000(var1, var3).stream().min(Comparator.comparingDouble(var3x -> this.m52000(var3x.m6000(), var1).M(var2))).orElse(null);
   }

   public boolean m46000(NQo var1, NNty var2, NbL var3) {
      this.m6000();
      if (var1.B() instanceof NYO var4) {
         NYo var6 = new NYo((NNNZg)((NNuU)this.f3000[0]).T[3], (NNNwS)((NNuU)this.f3000[0]).T[4], var3, var1, var2);
         if (!var6.N()) {
            return (boolean)0;
         } else if (((NNNZg)((NNuU)this.f3000[0]).T[3]).method_31606(var6.method_8037())) {
            return (boolean)0;
         } else {
            return (boolean)(((Iface0669)var4).m2000(var6) != null ? 1 : 0);
         }
      } else {
         return (boolean)0;
      }
   }

   public List<Rec0181> m48000(NXi var1, double var2) {
      this.m6000();
      Neo var4 = new Neo();
      ArrayList var5 = new ArrayList();

      for (int var6 = (int)(-var2); var6 <= (int)var2; var6++) {
         for (int var7 = (int)(-var2); var7 <= (int)var2; var7++) {
            for (int var8 = 0; var8 <= (int)var2 - ((NNNwS)((NNuU)this.f3000[0]).T[4]).method_18381(((NNNwS)((NNuU)this.f3000[0]).T[4]).method_18376()); var8++) {
               var4.N(var1.M + var6, var1.B - var8, var1.Z + var7);
               NCa var9 = ((NNNZg)((NNuU)this.f3000[0]).T[3]).method_8320(var4);
               NCU var10 = var9.R((NNNZg)((NNuU)this.f3000[0]).T[3], var4);
               if (!var10.method_1110()) {
                  var10 = var10.method_1096(var4.method_10263(), var4.method_10264(), var4.method_10260());
                  var5.add(new Rec0181(var4.method_10062(), var10));
               }
            }
         }
      }

      return var5;
   }

   public abstract C0983 m50000(Rec0181 var1, NXi var2, C0983 var3);

   public NXi m52000(NCU var1, NXi var2) {
      NXi var3 = null;

      for (NHS var5 : var1.method_1090()) {
         NHS var6 = var5.L(f1000[0], f1000[1], f1000[2]);
         double var7 = NNWE.N(var2.N(), var6.N, var6.u);
         double var9 = NNWE.N(var2.y(), var6.y, var6.i);
         double var11 = NNWE.N(var2.L(), var6.L, var6.R);
         if (var3 == null || var2.L(var7, var9, var11) < var2.M(var3)) {
            var3 = new NXi(var7, var9, var11);
         }
      }

      return var3 == null ? var2 : var3;
   }

   public boolean m56000() {
      this.m6000();
      return (boolean)(((NNNwS)((NNuU)this.f3000[0]).T[4]).k() && !((NNNwS)((NNuU)this.f3000[0]).T[4]).field_5976 ? 0 : 1);
   }
}
