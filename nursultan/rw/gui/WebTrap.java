package rw.gui;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NHS;
import KDFzREm.NKL;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NYo;
import KDFzREm.NbL;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.NjL;
import KDFzREm.Nwn;
import KDFzREm.wY;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0647;
import rw.core.C0719;
import rw.core.C0892;
import rw.core.C0983;
import rw.core.C0989;
import rw.core.C1006;
import rw.core.C1140;
import rw.core.IljlItp;
import rw.core.NuZz;
import rw.defs.Enum0055;
import rw.defs.Enum0074;
import rw.module.OlpnniIl;
import rw.setting.C0122;

@AnnotationDefault(
   L = "WebTrap",
   y = Enum0055.COMBAT,
   N = Enum0070.TOOLS
)
public class WebTrap extends GuiWidget {
   public static Object[] f1000;
   private static String[] f2000;
   private static double[] f3000;
   public Object[] f4000;

   private Ned m2000(NjL var1) {
      NXi var2 = this.m28000(var1);
      NXi var3 = new NXi(var2.M - var1.field_6014, f3000[2], var2.Z - var1.field_5969);
      NXi var4 = var2.i(var3.L(f3000[3]));
      NHS var5 = var1.method_5829().L(var4.u(var2));
      NXi var6 = this.m36000(var5).stream().min(Comparator.comparingDouble(var1x -> var1x.M(var4))).orElse(null);
      return var6 == null ? null : Ned.method_49638(var6);
   }

   private NjL m4000() {
      return (NjL)(NursultanClient.m88000().m30000().m96000() instanceof Nwn var1 && !C1140.m32000().test(var1)
         ? var1
         : ((NNNZg)((NNuU)this.y[0]).T[3])
            .N(
               Nwn.class,
               ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().M(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754() + f3000[4]),
               var1x -> (boolean)(var1x != (NNNwS)((NNuU)this.y[0]).T[4] && !C1140.m32000().test(var1x) ? 1 : 0)
            )
            .stream()
            .min(Comparator.comparingDouble(var1x -> var1x.method_73189().M(((NNNwS)((NNuU)this.y[0]).T[4]).method_73189())))
            .orElse(null));
   }

   public WebTrap() {
      this.m8000();
      C1006 var5 = C0122.m14000(this, f2000[0], (PgUp)PgUp.f4000[0]);
      this.f4000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      this.m8000();
      Integer var5 = 0;
      this.f4000[1] = var5;
      C0892.m20000();
   }

   private static void m6000() {
      f1000 = new Object[]{20, 6.0};
   }

   private static void m8000() {
      f3000 = new double[]{0.5, 0.0, 0.0, 6.0, 1.0, 0.5, 0.5, 6.0};
   }

   private void m8000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[2];
         Object[] var1 = this.f4000;
         var1[1] = 0;
      }
   }

   private static void m10000() {
      f2000 = new String[]{"place-key"};
   }

   private Supplier<List<Ned>> m12000(Ned var1) {
      return () -> List.of(var1.method_10084(), var1);
   }

   private void m14000(NjL var1) {
      this.m8000();
      Ned var2 = this.m2000(var1);
      if (var2 != null) {
         int var3 = IljlItp.m60000(NQa.Lf);
         int var4 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_6079().B() == NQa.Lf ? 1 : 0;
         if (!IljlItp.m36000(var3) || var4 != 0) {
            NbL var5 = var4 != 0 ? NbL.field_5810 : NbL.field_5808;
            if (var4 == 0 && ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().N() != var3) {
               C0892.m44000(var3);
            }

            NQo var6 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var5);

            for (Ned var8 : this.m12000(var2).get()) {
               if (this.m24000(var8, var5, var6)) {
                  Integer var13 = 0;
                  this.f4000[1] = var13;
                  break;
               }
            }
         }
      }
   }

   public void m18000() {
      this.m4000();
      super.m6000();
   }

   @Iface0642(
      u = true
   )
   public void m16000(OlpnniIl var1) {
      this.m8000();
      if (((C1006)this.f4000[0]).m4000(var1)) {
         Integer var6 = 20;
         this.f4000[1] = var6;
      }
   }

   private boolean m24000(Ned var1, NbL var2, NQo var3) {
      NCa var4 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var1);
      if (!var4.N(NKL.yw) && var4.d()) {
         if (((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().L(new NHS(var1))) {
            return (boolean)0;
         } else {
            NXi var5 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();
            double var6 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_55754();

            for (Nef var11 : Nef.values()) {
               Ned var12 = var1.method_10093(var11.b());
               NCa var13 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var12);
               NCU var14 = var13.R((NNNZg)((NNuU)this.y[0]).T[3], var12);
               if (!var14.method_1110()) {
                  NXi var15 = NXi.y(var12).i(NXi.N(var11.E()).L(f3000[0]));
                  if (!(var15.M(var5) > var6 * var6) && this.m26000(var5, var15, var11)) {
                     C0983 var16 = C0989.m28000();
                     C0983 var17 = var16.m62000(C0989.m26000(var16, var15)).m54000(true).m32000(true);
                     NNty var18 = this.m38000(var17, var5, var14, var12);
                     if (var18 != null && var18.N() != NcZ.field_1333 && var18.i() == var11) {
                        NNty var19 = this.m38000(var16, var5, var14, var12);
                        if (this.m32000(var19, var18)) {
                           var17 = var16;
                           var18 = var19;
                        }

                        NYo var20 = new NYo((NNNZg)((NNuU)this.y[0]).T[3], (NNNwS)((NNuU)this.y[0]).T[4], var2, var3, var18);
                        if (var20.N() && var20.method_8037().equals(var1)) {
                           wY.N(var2, var18);
                           NuZz.m44000(var17.m60000((Enum0074)Enum0074.f2000[0]));
                           return (boolean)1;
                        }
                     }
                  }
               }
            }

            return (boolean)0;
         }
      } else {
         return (boolean)0;
      }
   }

   private boolean m26000(NXi var1, NXi var2, Nef var3) {
      return (boolean)(var1.u(var2).y(NXi.N(var3.E())) > f3000[1] ? 1 : 0);
   }

   private NXi m28000(NjL var1) {
      return var1.method_73189();
   }

   private boolean m32000(NNty var1, NNty var2) {
      return (boolean)(var1 != null
            && var2 != null
            && var1.N() != NcZ.field_1333
            && var2.N() != NcZ.field_1333
            && var1.u().equals(var2.u())
            && var1.i() == var2.i()
         ? 1
         : 0);
   }

   @Iface0642(
      L = {AttackAura.class}
   )
   public void m34000(C0719 var1) {
      this.m8000();
      if ((Integer)this.f4000[1] > 0) {
         Integer var7 = (Integer)this.f4000[1] - 1;
         this.f4000[1] = var7;
         NjL var2 = this.m4000();
         if (var2 == null) {
            this.m4000();
         } else {
            if (((Iface0647)((NNNZZ)((NNuU)this.y[0]).T[2])).m2000() >= 3) {
               this.m14000(var2);
            }

            if ((Integer)this.f4000[1] <= 0) {
               this.m4000();
            }
         }
      }
   }

   private List<NXi> m36000(NHS var1) {
      ArrayList var2 = new ArrayList();
      int var3 = (int)Math.floor(var1.N);
      int var4 = (int)Math.floor(var1.u);
      int var5 = (int)Math.floor(var1.L);
      int var6 = (int)Math.floor(var1.R);

      for (int var7 = var3; var7 <= var4; var7++) {
         for (int var8 = var5; var8 <= var6; var8++) {
            var2.add(new NXi(var7 + f3000[5], var1.y, var8 + f3000[6]));
         }
      }

      return var2;
   }

   private NNty m38000(C0983 var1, NXi var2, NCU var3, Ned var4) {
      NXi var5 = var2.i(var1.m28000().L(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754()));
      return var3.method_1092(var2, var5, var4);
   }
}
