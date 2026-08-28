package rw.core;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
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
import KDFzREm.wY;
import java.util.Comparator;
import java.util.Optional;
import rw.api.Iface0669;
import rw.data.Rec0208;
import rw.data.Rec0288;
import rw.gui.WallClimb;

public class DhSt extends Base1148<WallClimb> {
   public Object[] f1000;
   private static double[] f2000;
   private static float[] f3000;

   private static void m2000() {
      f2000 = new double[]{0.0, 0.5, 0.9, 0.1};
   }

   public DhSt(WallClimb var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m26000();
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f3000 = new float[]{360.0F};
   }

   public void m18000(Object var1) {
      this.m26000();
      if (!(var1 instanceof C0719)) {
         if (var1 instanceof WallClimb) {
            Object var17 = null;
            this.f1000[1] = var17;
            Integer var18 = 0;
            this.f1000[0] = var18;
            if ((NNNwS)((NNuU)this.N[0]).T[4] != null) {
               C0892.m20000();
            }
         }
      } else {
         Integer var15 = (Integer)this.f1000[0] - 1;
         this.f1000[0] = var15;
         if ((C0983)this.f1000[1] != null && (Integer)this.f1000[0] > 0) {
            NuZz.m44000((C0983)this.f1000[1]);
         } else if ((Integer)this.f1000[0] == 0) {
            Object var16 = null;
            this.f1000[1] = var16;
            C0892.m20000();
         }

         if (((NNNwS)((NNuU)this.N[0]).T[4]).method_18798().B > f2000[0] || ((NNNwS)((NNuU)this.N[0]).T[4]).method_24828()) {
            return;
         }

         NbL var2 = null;
         if (this.m32000(((NNNwS)((NNuU)this.N[0]).T[4]).method_6079())) {
            var2 = NbL.field_5810;
         } else {
            Optional var3 = IljlItp.m22000(this::m32000).min(Comparator.comparingInt(var1x -> {
               int var2x = ((NNNwS)((NNuU)this.N[0]).T[4]).method_31548().N();
               int var3x = Math.abs(var1x.m4000() - var2x);
               return var3x == 8 ? 1 : var3x;
            }));
            if (var3.isPresent()) {
               Rec0208 var4 = (Rec0208)var3.get();
               var2 = NbL.field_5808;
               C0892.m32000(var4.m4000());
            }
         }

         if (var2 == null) {
            return;
         }

         NQo var19 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_5998(var2);
         if (var19.B() instanceof NYO var20) {
            Rec0288 var21 = OljOitkn.m28000(1);
            NXi var6 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_33571();
            NXi var7 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_73189();

            for (int var8 = -1; var8 <= 0; var8++) {
               Ned[] var9 = this.m36000(Ned.method_49638(new NXi(var7.M, var7.B - var8 - f2000[1], var7.Z)));

               for (int var10 = 0; var10 < 2; var10++) {
                  if (this.m28000((Iface0669)var20, var9, new NXi(var7.M, Math.floor(var7.B) + f2000[2] - var8 - var10, var7.Z), var6, var2, var19, var21)) {
                     return;
                  }

                  if (this.m28000((Iface0669)var20, var9, new NXi(var7.M, Math.floor(var7.B) + f2000[3] - var8 - var10, var7.Z), var6, var2, var19, var21)) {
                     return;
                  }
               }
            }
         }
      }
   }

   private NNty m20000(C0983 var1, NXi var2, NCU var3, Ned var4) {
      NXi var5 = var2.i(var1.m28000().L(((NNNwS)((NNuU)this.N[0]).T[4]).method_55754()));
      return var3.method_1092(var2, var5, var4);
   }

   private boolean m22000(Iface0669 var1, NbL var2, NQo var3, NNty var4, Rec0288 var5) {
      NYo var6 = new NYo((NNNZg)((NNuU)this.N[0]).T[3], (NNNwS)((NNuU)this.N[0]).T[4], var2, var3, var4);
      if (!var6.N()) {
         return (boolean)0;
      } else {
         NCa var7 = var1.m2000(var6);
         if (var7 == null) {
            return (boolean)0;
         } else {
            NCU var8 = var7.M((NNNZg)((NNuU)this.N[0]).T[3], var6.method_8037());
            if (var8.method_1110()) {
               return (boolean)0;
            } else if (var8.method_1107().N(var6.method_8037()).L(var5.m12000().m6000().method_5829())) {
               wY.N(var2, var4);
               return (boolean)1;
            } else {
               return (boolean)0;
            }
         }
      }
   }

   private void m26000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   private boolean m28000(Iface0669 var1, Ned[] var2, NXi var3, NXi var4, NbL var5, NQo var6, Rec0288 var7) {
      this.m26000();

      for (Ned var11 : var2) {
         NCa var12 = ((NNNZg)((NNuU)this.N[0]).T[3]).method_8320(var11);
         NCU var13 = var12.R((NNNZg)((NNuU)this.N[0]).T[3], var11);
         Optional var14 = var13.method_66507(var11).method_33661(var3);
         if (!var14.isEmpty()) {
            C0983 var15 = C0989.m28000();
            C0983 var16 = C0989.m26000(var15, (NXi)var14.get());
            C0983 var17 = var15.m62000(var16).m54000(true).m32000(true);
            NNty var18 = this.m20000(var17, var4, var13, var11);
            if (var18 != null && var18.N() != NcZ.field_1333) {
               if ((C0983)this.f1000[1] != null) {
                  NNty var19 = this.m20000((C0983)this.f1000[1], var4, var13, var11);
                  if (var19 != null && var19.N() != NcZ.field_1333 && var19.u().equals(var18.u()) && var19.i().equals(var18.i())) {
                     var17 = (C0983)this.f1000[1];
                     var18 = var19;
                  }
               }

               if (this.m22000(var1, var5, var6, var18, var7)) {
                  NuZz.m44000(var17);
                  this.f1000[1] = var17;
                  Integer var25 = 10;
                  this.f1000[0] = var25;
                  return (boolean)1;
               }
            }
         }
      }

      return (boolean)0;
   }

   private boolean m32000(NQo var1) {
      return (boolean)(var1.B() instanceof NYO var2 && !var2.L().W().M((NNNZg)((NNuU)this.N[0]).T[3], Ned.field_10980).method_1110() ? 1 : 0);
   }

   private Ned[] m36000(Ned var1) {
      Ned[] var2 = new Ned[5];

      for (int var3 = 0; var3 < 4; var3++) {
         var2[var3] = var1.method_10093(Nef.N(((NNNwS)((NNuU)this.N[0]).T[4]).method_36454() % f3000[0] + var3 * 90));
      }

      var2[4] = var1;
      return var2;
   }
}
