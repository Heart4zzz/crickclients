package rw.gui;

import KDFzREm.NNNNRZ;
import KDFzREm.NNNwS;
import KDFzREm.NNNww;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nbx;
import KDFzREm.Nkq;
import KDFzREm.wY;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0719;
import rw.core.C0892;
import rw.core.C1000;
import rw.core.C1006;
import rw.core.C1013;
import rw.core.C1187;
import rw.core.IljlItp;
import rw.core.OlpOnrlmr;
import rw.defs.Enum0055;
import rw.defs.Enum0092;
import rw.module.AttackAura_x_x;
import rw.module.Module031;
import rw.module.OlpnniIl;
import rw.setting.C0122;

@AnnotationDefault(
   L = "ElytraHelper",
   y = Enum0055.MISC,
   N = Enum0070.HELPER
)
public class ElytraHelper extends GuiWidget {
   public Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[6];
         Object[] var2 = this.f2000;
         var2[1] = 0;
         var2[2] = false;
         var2[3] = false;
         var2[4] = false;
         var2[5] = false;
      }
   }

   private static void m6000() {
      f3000 = new String[]{"swap-key", "firework-key", "disabled", "only-space", "always", "auto-launch"};
   }

   public ElytraHelper() {
      this.m4000();
      C1006 var5 = C0122.m14000(this, f3000[0], (PgUp)PgUp.f4000[0]);
      this.f1000[0] = var5;
      C1006 var6 = C0122.m14000(this, f3000[1], (PgUp)PgUp.f4000[0]);
      this.f1000[1] = var6;
      C1013 var7 = new C1013(f3000[2], true);
      this.f1000[2] = var7;
      C1013 var8 = new C1013(f3000[3], false);
      this.f1000[3] = var8;
      C1013 var9 = new C1013(f3000[4], false);
      this.f1000[4] = var9;
      C1000 var10 = C0122.m18000(this, f3000[5], (C1013)this.f1000[2], (C1013)this.f1000[3], (C1013)this.f1000[4]);
      this.f2000[0] = var10;
   }

   static {
      ntfClinit();
   }

   public boolean m10000() {
      this.m4000();
      return (boolean)(NursultanClient.m74000().m10000() < this.f2000[1] ? 1 : 0);
   }

   private void m12000() {
      NQo var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_6118(Nbx.field_6174);
      int var2 = var1.B() == NQa.sT ? 1 : 0;
      int var3 = !var1.R() ? 1 : 0;
      if (var2 != 0) {
         OlpOnrlmr.m28000((Enum0092)Enum0092.f6000[2]).ifPresent(var1x -> this.m20000(var1x.m4000()));
      } else if (var3 != 0) {
         OlpOnrlmr.m28000((Enum0092)Enum0092.f6000[0]).ifPresent(var1x -> this.m20000(var1x.m4000()));
      } else {
         OlpOnrlmr.m28000((Enum0092)Enum0092.f6000[2])
            .ifPresentOrElse(
               var1x -> this.m20000(var1x.m4000()), () -> OlpOnrlmr.m28000((Enum0092)Enum0092.f6000[0]).ifPresent(var1x -> this.m20000(var1x.m4000()))
            );
      }
   }

   private void m16000(int var1, int var2) {
      NursultanClient.m36000().m14000(4, () -> NursultanClient.m60000().m38000(0, var1, var2, Nkq.field_7791).m24000());
   }

   public void m18000() {
      this.m4000();
      Boolean var5 = false;
      this.f2000[5] = var5;
      Boolean var6 = false;
      this.f2000[3] = var6;
      Boolean var7 = false;
      this.f2000[2] = var7;
      super.m6000();
   }

   private void m20000(int var1) {
      if (IljlItp.m32000(var1)) {
         C0892.m44000(var1);
         wY.N(NbL.field_5808);
         C0892.m20000();
      } else {
         int var2 = ((Enum0092)Enum0092.f6000[2]).m50000();
         int var3 = IljlItp.m4000(var1);
         NursultanClient.m60000().m38000(0, var3, 0, Nkq.field_7791).m38000(0, var2, 0, Nkq.field_7791).m38000(0, var3, 0, Nkq.field_7791).m24000();
      }
   }

   @Iface0642
   public void m22000(AttackAura_x_x var1) {
      this.m4000();
      C1013 var2 = (C1013)((C1000)this.f2000[0]).i();
      if (var2 != (C1013)this.f1000[2]
         && !((NNNwS)((NNuU)this.y[0]).T[4]).method_6128()
         && !((NNNwS)((NNuU)this.y[0]).T[4]).method_31549().y
         && IljlItp.m34000(var0 -> var0.L(NNNNRZ.K))
         && (Integer)((NNNwS)((NNuU)this.y[0]).T[4]).fields_17fa3311b0e9d3e9b883d09222919bf5a[1] == 0) {
         if (var2 == (C1013)this.f1000[3]) {
            if (!(Boolean)((NNNwS)((NNuU)this.y[0]).T[4]).R[3] && (Boolean)this.f2000[4]) {
               var1.m22000((boolean)0);
            }
         } else if ((Boolean)((NNNwS)((NNuU)this.y[0]).T[4]).R[3]) {
            var1.m22000((boolean)1);
         } else {
            Boolean var7 = !(Boolean)this.f2000[5];
            this.f2000[5] = var7;
            var1.m22000((Boolean)this.f2000[5]);
         }
      }
   }

   @Iface0642
   public void m26000(Module031 var1) {
      if (NursultanClient.m60000().m16000()) {
         var1.N();
      }
   }

   @Iface0642
   public void m30000(C0719 var1) {
      this.m4000();
      Boolean var6 = ((NNNww)((NNNwS)((NNuU)this.y[0]).T[4]).L[1]).field_54155.i();
      this.f2000[4] = var6;
      if ((Boolean)this.f2000[2] && !NursultanClient.m60000().m16000()) {
         this.m40000();
         Boolean var7 = false;
         this.f2000[2] = var7;
      }

      if ((Boolean)this.f2000[3] && !NursultanClient.m60000().m16000()) {
         this.m12000();
         Boolean var8 = false;
         this.f2000[3] = var8;
      }
   }

   @Iface0642(
      u = true
   )
   public void m32000(OlpnniIl var1) {
      this.m4000();
      if (((C1006)this.f1000[0]).m4000(var1)) {
         Boolean var6 = true;
         this.f2000[3] = var6;
      }

      if (((C1006)this.f1000[1]).m4000(var1)) {
         Boolean var7 = true;
         this.f2000[2] = var7;
      }
   }

   public void m34000(int var1) {
      this.m4000();
      Integer var6 = NursultanClient.m74000().m10000() + var1;
      this.f2000[1] = var6;
   }

   private void m40000() {
      if (!this.m10000()) {
         C1187.m42000(this::m12000, this::m16000);
      }
   }
}
