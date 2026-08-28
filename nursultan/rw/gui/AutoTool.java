package rw.gui;

import KDFzREm.NCa;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.Ned;
import KDFzREm.Ngj;
import KDFzREm.NkG;
import KDFzREm.NkS;
import KDFzREm.Nkq;
import java.util.Comparator;
import java.util.Optional;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0151;
import rw.core.C0719;
import rw.core.C0885;
import rw.core.C0892;
import rw.core.C0991;
import rw.core.C1193;
import rw.core.C1241;
import rw.core.IljlItp;
import rw.data.Rec0208;
import rw.defs.Enum0055;
import rw.module.AttackAura_x;
import rw.module.IlIsOrip;
import rw.module.IltlnIij;
import rw.module.Module043;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AutoTool",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoTool extends GuiWidget {
   public Object[] f1000;
   private static double[] f2000;
   private static String[] f3000;
   private static float[] f4000;

   public AutoTool() {
      this.m4000();
      C0885 var5 = new C0885();
      this.f1000[0] = var5;
      Integer var6 = -1;
      this.f1000[4] = var6;
      C0991 var7 = C0122.m26000(this, f3000[0], false);
      this.f1000[5] = var7;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var1 = this.f1000;
         var1[1] = false;
         var1[2] = false;
         var1[3] = 0;
         var1[4] = 0;
      }
   }

   private void m6000() {
      this.m4000();
      Integer var5 = NursultanClient.m74000().m10000();
      this.f1000[4] = var5;
      this.m24000((boolean)(NursultanClient.m74000().m10000() - this.f1000[3] > 0 ? 1 : 0), (Boolean)this.f1000[1], (boolean)0);
   }

   private static void m8000() {
      f3000 = new String[]{"hotbar-only"};
   }

   private static void m10000() {
      f4000 = new float[]{1.0F, 1.0F};
   }

   private static void m12000() {
      f2000 = new double[]{1.0, 0.0};
   }

   @Iface0642
   public void m8000(rw.module.NoInteract var1) {
      this.m6000();
   }

   @Iface0642
   public void m10000(IltlnIij var1) {
      this.m6000();
   }

   @Iface0642
   public void m16000(C0719 var1) {
      this.m4000();
      this.m24000((Boolean)this.f1000[1], (boolean)(NursultanClient.m74000().m10000() - this.f1000[3] > 10 ? 1 : 0), (boolean)1);
   }

   private Optional<Rec0208> m18000(Ned var1) {
      NCa var2 = ((NNNZg)((NNuU)this.y[0]).T[3]).method_8320(var1);
      return IljlItp.m6000(var2x -> (boolean)(this.m34000(var2x, var2) > f4000[1] ? 1 : 0))
         .max(
            Comparator.<Rec0208>comparingDouble(var1x -> var1x.m6000().y(var2) ? f2000[0] : f2000[1]).thenComparing(var2x -> this.m34000(var2x.m6000(), var2))
         );
   }

   @Iface0642
   public void m20000(Module043 var1) {
      this.m4000();
      if ((Boolean)this.f1000[1]) {
         C0892.m8000();
      }
   }

   private void m24000(boolean var1, boolean var2, boolean var3) {
      this.m4000();
      if (var1 && var2 && !(Boolean)this.f1000[2]) {
         if (!((C0885)this.f1000[0]).m14000()) {
            if ((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]
                  != (NkS)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[2]
               || NursultanClient.m60000().m16000()) {
               return;
            }

            C1241 var4 = NursultanClient.m60000();
            ((C0885)this.f1000[0]).m12000(var1x -> var4.m38000(0, var1x.m6000(), var1x.m4000(), Nkq.field_7791));
            var4.m24000();
         }

         if (var3) {
            C0892.m20000();
         } else {
            C0892.m34000();
         }

         Boolean var9 = false;
         this.f1000[1] = var9;
      }
   }

   @Iface0642
   public void m26000(C0151 var1) {
      this.m4000();
      ((C0885)this.f1000[0]).m12000(var0 -> {});
      Boolean var6 = false;
      this.f1000[1] = var6;
      Boolean var7 = false;
      this.f1000[2] = var7;
   }

   private float m34000(NQo var1, NCa var2) {
      float var3 = var1.N(var2);
      if (var3 > f4000[0]) {
         var3 += C1193.m42000(var1, Ngj.n);
      }

      return var3;
   }

   @Iface0642
   public void m36000(IlIsOrip var1) {
      this.m4000();
      if ((Integer)this.f1000[4] != NursultanClient.m74000().m10000()) {
         Integer var6 = NursultanClient.m74000().m10000();
         this.f1000[3] = var6;
         if ((Boolean)this.f1000[2]) {
            var1.N();
         } else {
            this.m18000(var1.m4000()).ifPresent(var2 -> {
               this.m4000();
               int var3 = var2.m4000();
               int var4 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().N();
               if (var3 != var4) {
                  if (IljlItp.m32000(var3)) {
                     C0892.m32000(var3);
                  } else if (!(Boolean)((C0991)this.f1000[5]).i()) {
                     var1.N();
                     Boolean var10 = true;
                     this.f1000[2] = var10;
                     ((C0885)this.f1000[0]).m16000(var4, var3);
                     NQo var5 = var2.m6000();
                     NursultanClient.m60000().m38000(0, var3, var4, Nkq.field_7791).m26000(var3x -> {
                        this.m4000();
                        Boolean var8 = false;
                        this.f1000[2] = var8;
                        if (!NQo.L(((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().method_5438(var4), var5)) {
                           ((C0885)this.f1000[0]).m20000();
                        }
                     }).m24000();
                  }

                  Boolean var11 = true;
                  this.f1000[1] = var11;
               }
            });
         }
      }
   }

   @Iface0642
   public void m38000(AttackAura_x var1) {
      this.m6000();
   }
}
