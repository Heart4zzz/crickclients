package rw.gui;

import KDFzREm.NCU;
import KDFzREm.NCa;
import KDFzREm.NHS;
import KDFzREm.NKi;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNiz;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NXi;
import KDFzREm.NbL;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import baritone.api.BaritoneAPI;
import baritone.api.selection.ISelection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0719;
import rw.core.C0979;
import rw.core.C0983;
import rw.core.C0989;
import rw.core.C0991;
import rw.core.C1004;
import rw.core.C1176;
import rw.core.C1188;
import rw.core.NuZz;
import rw.data.IlsOnqsqi;
import rw.defs.Enum0055;
import rw.setting.C0106;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Nuker",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class Nuker extends GuiWidget {
   public Object[] f1000;
   private static float[] f2000;
   private static double[] f3000;
   private static String[] f4000;

   public void m4000() {
      this.m8000();
      if (!((Set)this.f1000[3]).isEmpty()) {
         ((Set)this.f1000[3]).clear();
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((rw.defs.Nuker)rw.defs.Nuker.f1000[3]));
      }
   }

   public Nuker() {
      this.m8000();
      C0991 var5 = C0122.m26000(this, f4000[0], false);
      this.f1000[0] = var5;
      C0991 var6 = C0122.m26000(this, f4000[1], false);
      this.f1000[1] = var6;
      C1004 var7 = C0122.m10000(this, f4000[2], new C0979(f2000[0], f2000[1]), new C0979(f2000[2], f2000[3]), f2000[4]);
      this.f1000[2] = var7;
      HashSet var8 = new HashSet();
      this.f1000[3] = var8;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var1 = this.f1000;
         var1[4] = false;
      }
   }

   private static void m10000() {
      f2000 = new float[]{-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 90.0F, 4.5F, -1.0F};
   }

   public Set<NKi> m4000() {
      this.m8000();
      return (Set<NKi>)this.f1000[3];
   }

   private Ned m6000() {
      this.m8000();
      NXi var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();
      if (((NNiz)((NNuU)this.y[0]).i[7]).I.R()) {
         NNty var2 = C1176.m28000(
            new NNnf(
               var1,
               C0989.m4000().m28000().L(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754()).i(var1),
               NNnS.field_17559,
               NNnC.field_1348,
               (NNNwS)((NNuU)this.y[0]).T[4]
            )
         );
         if (var2.N() != NcZ.field_1333) {
            return var2.u();
         }
      }

      float var9 = f2000[6];
      C0979 var3 = (C0979)((C1004)this.f1000[2]).i();
      NXi var4 = new NXi(
         ((NNNwS)((NNuU)this.y[0]).T[4]).method_23317(),
         Math.ceil(((NNNwS)((NNuU)this.y[0]).T[4]).method_23318()),
         ((NNNwS)((NNuU)this.y[0]).T[4]).method_23321()
      );
      NHS var5 = new NHS(var4, var4).L(var9, var3.m2000(), var9).u(f3000[0], var3.m2000() + var3.m32000(), f3000[1]);
      HashSet var6 = new HashSet();

      for (Ned var8 : Ned.method_62671(var5)) {
         if (!this.m22000(var8)) {
            var6.add(var8.method_10062());
         }
      }

      Ned var10 = Ned.method_49638(var1);
      Ned var11 = Ned.method_49638(var4).method_10074();
      return var6.stream()
         .min(
            Comparator.<Ned>comparingDouble(var1x -> var1x.method_10264() > var11.method_10264() ? f3000[2] : f3000[3])
               .thenComparing(var1x -> var1x.method_10262(var10))
         )
         .orElse(null);
   }

   private static void m12000() {
      f3000 = new double[]{0.0, 0.0, 0.0, 1.0};
   }

   private static void m14000() {
      f4000 = new String[]{"break-only-allowed-blocks", "break-only-in-selection", "height-range", "nuker.allowed-blocks-empty"};
   }

   private boolean m8000(Ned var1) {
      this.m8000();
      if (!(Boolean)((C0991)this.f1000[1]).i()) {
         return (boolean)0;
      } else {
         ISelection[] var2 = BaritoneAPI.getProvider().getBaritoneForPlayer((NNNwS)((NNuU)this.y[0]).T[4]).getSelectionManager().getSelections();
         return Arrays.stream(var2).noneMatch(var1x -> var1x.aabb().y(var1));
      }
   }

   @Override
   public void m22000() {
      this.m8000();
      if (((Set)this.f1000[3]).isEmpty()) {
         C0106.m32000(C1188.m16000(f4000[3], (Character)rw.cmd.C0013.f1000[1]).N(NPh.field_1080));
      }

      Boolean var5 = false;
      this.f1000[4] = var5;
      Object var6 = null;
      this.f1000[5] = var6;
      super.m6000();
   }

   public boolean m12000(NKi var1) {
      this.m8000();
      if (((Set)this.f1000[3]).removeIf(var1x -> (boolean)(var1x == var1 ? 1 : 0))) {
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((rw.defs.Nuker)rw.defs.Nuker.f1000[3]));
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   @Iface0642
   public void m18000(C0719 var1) {
      this.m8000();
      Boolean var11 = false;
      this.f1000[4] = var11;
      if (!((NNNwS)((NNuU)this.y[0]).T[4]).method_6115()) {
         if (this.m22000((Ned)this.f1000[5])) {
            Ned var12;
            Ned var10000 = var12 = this.m6000();
            this.f1000[5] = var12;
            if (var10000 == null) {
               return;
            }
         }

         NCU var2 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320((Ned)this.f1000[5]).R((NNNZg)((NNuU)this.y[0]).T[3], (Ned)this.f1000[5]);
         NXi var3 = (NXi)var2.method_1096(((Ned)this.f1000[5]).method_10263(), ((Ned)this.f1000[5]).method_10264(), ((Ned)this.f1000[5]).method_10260())
            .method_33661(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571())
            .get();
         C0983 var4 = C0989.m28000().m62000(C0989.m26000(C0989.m28000(), var3)).m32000(true).m54000(true);
         if (Math.abs(var4.m68000()) == f2000[5]) {
            var4 = new C0983(((NNNwS)((NNuU)this.y[0]).T[4]).method_36454(), var4.m68000()).m32000(true).m54000(true);
         }

         NXi var5 = var4.m28000().L(((NNNwS)((NNuU)this.y[0]).T[4]).method_55754()).i(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571());
         NNty var6 = C1176.m28000(
            new NNnf(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571(), var5, NNnS.field_17559, NNnC.field_1348, (NNNwS)((NNuU)this.y[0]).T[4])
         );
         if (var6.N() != NcZ.field_1333) {
            NuZz.m44000(var4);
            if (((NNNZZ)((NNuU)this.y[0]).T[2]).y(var6.u(), var6.i())) {
               Boolean var13 = true;
               this.f1000[4] = var13;
               ((NNNwS)((NNuU)this.y[0]).T[4]).method_6104(NbL.field_5808);
            }
         }
      }
   }

   @Iface0642
   public void m20000(rw.module.Nuker var1) {
      this.m8000();
      if ((Boolean)this.f1000[4]) {
         var1.N();
      }
   }

   private boolean m22000(Ned var1) {
      this.m8000();
      if (var1 == null) {
         return (boolean)1;
      } else if (this.m8000(var1)) {
         return (boolean)1;
      } else {
         NCa var2 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var1);
         if (!var2.P() && var2.i((NNNZg)((NNuU)this.y[0]).T[3], var1) != f2000[7]) {
            if (((NNNwS)((NNuU)this.y[0]).T[4]).method_21701((NNNZg)((NNuU)this.y[0]).T[3], var1, ((NNNZZ)((NNuU)this.y[0]).T[2]).U())) {
               return (boolean)1;
            } else if ((Boolean)((C0991)this.f1000[0]).i() && !((Set)this.f1000[3]).contains(var2.i())) {
               return (boolean)1;
            } else {
               NCU var3 = var2.R((NNNZg)((NNuU)this.y[0]).T[3], var1);
               if (var3.method_1110()) {
                  return (boolean)1;
               } else {
                  Optional var4 = var3.method_1096(var1.method_10263(), var1.method_10264(), var1.method_10260())
                     .method_33661(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571());
                  return (boolean)(!var4.isEmpty()
                        && !(((NXi)var4.get()).R(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571()) > ((NNNwS)((NNuU)this.y[0]).T[4]).method_55754())
                     ? 0
                     : 1);
               }
            }
         } else {
            return (boolean)1;
         }
      }
   }

   public boolean m26000(NKi var1) {
      this.m8000();
      if (((Set)this.f1000[3]).add(var1)) {
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((rw.defs.Nuker)rw.defs.Nuker.f1000[3]));
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }
}
