package rw.gui;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NFB;
import KDFzREm.NHS;
import KDFzREm.NKL;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NYO;
import KDFzREm.NYo;
import KDFzREm.NbL;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.NxE;
import KDFzREm.wY;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0589;
import rw.api.Iface0642;
import rw.api.Iface0669;
import rw.core.C0719;
import rw.core.C0892;
import rw.core.C0983;
import rw.core.C0989;
import rw.core.IljlItp;
import rw.core.NuZz;
import rw.data.Rec0176;
import rw.defs.Enum0055;
import rw.module.AttackAura_x_x;

@AnnotationDefault(
   L = "AutoDripstone",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoDripstone extends GuiWidget {
   public Object[] f1000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[1] = 0;
      }
   }

   public AutoDripstone() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   public boolean m6000() {
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null) {
         C0892.m20000();
      }

      return super.m14000();
   }

   private Rec0176 m2000() {
      ArrayList var1 = new ArrayList();
      NHS var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().M(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754());

      for (Ned var4 : Ned.method_62671(var2)) {
         NCa var5 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var4);
         if (var5.i() instanceof NFB var6 && this.m6000(var4, var5, var6)) {
            var1.add(
               new Rec0176(
                  var5,
                  var5.R((NNNZg)((NNuU)this.y[0]).T[3], var4).method_1096(var4.method_10263(), var4.method_10264(), var4.method_10260()),
                  var4.method_10062(),
                  (Boolean)var5.L(NFB.y)
               )
            );
         }
      }

      NXi var8 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();
      return var1.stream().min(Comparator.comparingDouble(var1x -> var8.M(var1x.f2000.method_46558()))).orElse(null);
   }

   private void m8000() {
      if (!this.m10000(((NNNwS)((NNuU)this.y[0]).T[4]).method_6047())) {
         IljlItp.m50000(IljlItp.m60000(NQa.wC)).ifPresent(C0892::m32000);
      }
   }

   private boolean m6000(Ned var1, NCa var2, NFB var3) {
      if (!((Iface0589)var3).am_().L()) {
         return (boolean)0;
      } else if (var2.L(NFB.L) != NxE.field_12617) {
         return (boolean)0;
      } else {
         for (int var4 = 1; var4 <= 2; var4++) {
            NCa var5 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var1.method_10087(var4));
            if (!var5.P() && var5.i() != NKL.vp) {
               return (boolean)0;
            }
         }

         return (boolean)1;
      }
   }

   private void m8000(Rec0176 var1) {
      this.m4000();
      NXi var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();
      NXi var3 = var1.m10000().method_33661(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571()).orElse(var2);
      C0983 var4 = C0989.m28000().m62000(C0989.m26000(C0989.m28000(), var3)).m32000(true).m54000(true);
      NXi var5 = var4.m28000().L(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754()).i(var2);
      NNty var6 = var1.m8000().R((NNNZg)((NNuU)this.y[0]).T[3], var1.m2000()).method_1092(var2, var5, var1.m2000());
      if (var6 != null && var6.N() != NcZ.field_1333) {
         NuZz.m44000(var4);
         wY.N(NbL.field_5808, var6);
         Boolean var11 = false;
         this.f1000[0] = var11;
      }
   }

   private boolean m10000(NQo var1) {
      return var1.N(NQa.wC);
   }

   public boolean m12000(NQo var1, NNty var2, NbL var3) {
      if (var1.B() instanceof NYO var4) {
         NYo var6 = new NYo((NNNZg)((NNuU)this.y[0]).T[3], (NNNwS)((NNuU)this.y[0]).T[4], var3, var1, var2);
         if (!var6.N()) {
            return (boolean)0;
         } else if (((NNNZg)((NNuU)this.y[0]).T[3]).method_31606(var6.method_8037())) {
            return (boolean)0;
         } else {
            return (boolean)(((Iface0669)var4).m2000(var6) != null ? 1 : 0);
         }
      } else {
         return (boolean)0;
      }
   }

   @Iface0642
   public void m14000(C0719 var1) {
      this.m4000();
      Rec0176 var2 = this.m2000();
      if (var2 != null) {
         this.m8000();
         if (var2.m6000()) {
            this.m8000(var2);
         } else {
            NCa var3 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var2.m2000().method_10074());
            if (var3.i() == NKL.vp) {
               this.m8000(var2);
            } else if ((Integer)this.f1000[1] + 5 <= NursultanClient.m74000().m10000()) {
               for (NbL var7 : NbL.values()) {
                  if (this.m10000(((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var7))) {
                     this.m16000(var2, var7);
                     break;
                  }
               }
            }
         }
      }
   }

   private void m16000(Rec0176 var1, NbL var2) {
      this.m4000();
      NXi var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();

      for (Nef var5 : List.of(Nef.field_11043, Nef.field_11034, Nef.field_11039, Nef.field_11035, Nef.field_11036)) {
         Ned var6 = var1.m2000().method_10074();
         Ned var7 = var6.method_10093(var5);
         NCa var8 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var7);
         NCU var9 = var8.R((NNNZg)((NNuU)this.y[0]).T[3], var7);
         if (!var9.method_1110()) {
            NXi var10 = var6.method_46558();
            NXi var11 = var9.method_1096(var7.method_10263(), var7.method_10264(), var7.method_10260()).method_33661(var10).orElse(var10);
            C0983 var12 = C0989.m28000().m62000(C0989.m26000(C0989.m28000(), var11)).m32000(true).m54000(true);
            NXi var13 = var12.m28000().L(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754()).i(var3);
            NNty var14 = var9.method_1092(var3, var13, var7);
            if (var14 != null
               && var14.N() != NcZ.field_1333
               && var14.i() == var5.b()
               && this.m12000(((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var2), var14, var2)) {
               if (!((NNNwS)((NNuU)this.y[0]).T[4]).method_5715()) {
                  Boolean var19 = true;
                  this.f1000[0] = var19;
               } else {
                  NuZz.m44000(var12);
                  wY.N(var2, var14);
                  Integer var20 = NursultanClient.m74000().m10000();
                  this.f1000[1] = var20;
               }
               break;
            }
         }
      }
   }

   @Iface0642
   public void m18000(AttackAura_x_x var1) {
      this.m4000();
      if ((Boolean)this.f1000[0] != null) {
         var1.m36000((Boolean)this.f1000[0]);
         if ((Boolean)this.f1000[0] && ((NNNwS)((NNuU)this.y[0]).T[4]).method_31549().y) {
            var1.m22000((boolean)1);
         }

         Object var6 = null;
         this.f1000[0] = var6;
      }
   }
}
