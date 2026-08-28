package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base0680;
import rw.core.C0677;
import rw.core.C0681;
import rw.core.C0683;
import rw.core.C0685;
import rw.core.C0719;
import rw.core.C0983;
import rw.core.C0988;
import rw.core.C0989;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1006;
import rw.core.C1150;
import rw.core.C1157;
import rw.core.C1177;
import rw.core.C1183;
import rw.core.C1187;
import rw.defs.Enum0055;
import rw.module.OlpnniIl;
import rw.setting.C0122;

@AnnotationDefault(
   L = "ElytraTarget",
   y = Enum0055.MOVEMENT,
   N = Enum0070.BASE
)
public class ElytraTarget extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   public Object[] f5000;
   private static float[] f6000;
   private static String[] f7000;

   public ElytraTarget() {
      this.m10000();
      C0988 var5 = C0122.m12000(this, f7000[0], f3000[0], f3000[1], f3000[2], f3000[3]);
      this.f2000[0] = var5;
      C0991 var6 = C0122.m26000(this, f7000[1], true);
      this.f2000[1] = var6;
      C0988 var7 = (C0988)C0122.m12000(this, f1000[0], f6000[0], f6000[1], f6000[2], f6000[3]).N(var1 -> {
         this.m10000();
         return (Boolean)((C0991)this.f2000[1]).i();
      });
      this.f2000[2] = var7;
      C0683 var8 = new C0683(this, f1000[1], false);
      this.f5000[0] = var8;
      C0677 var9 = new C0677(this, f1000[2], false);
      this.f5000[1] = var9;
      C1000 var10 = C0122.m18000(this, f1000[3], new C0681(this, f1000[4], true), new C0685(this, f1000[5], false), (C0677)this.f5000[1], (C0683)this.f5000[0]);
      this.f5000[2] = var10;
      C0988 var11 = (C0988)C0122.m12000(this, f1000[6], f6000[4], f6000[5], f6000[6], f6000[7]).N(var1 -> {
         this.m10000();
         return ((C0683)this.f5000[0]).U();
      });
      this.f5000[3] = var11;
      C1006 var12 = (C1006)C0122.m14000(this, f1000[7], (PgUp)PgUp.f4000[0]).N(var1 -> {
         this.m10000();
         return ((C0677)this.f5000[1]).U();
      });
      this.f5000[4] = var12;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f7000 = new String[]{"chase-distance", "overtake"};
      f1000 = new String[]{
         "overtake-distance",
         "timing-firework-use",
         "bind-firework-use",
         "firework-use",
         "none-firework-use",
         "auto-firework-use",
         "delay-ticks",
         "manual-hotkey"
      };
   }

   private static void m8000() {
      f3000 = new float[]{50.0F, 10.0F, 200.0F, 5.0F};
      f6000 = new float[]{5.0F, 0.0F, 6.0F, 1.0F, 20.0F, 2.0F, 60.0F, 1.0F};
      f4000 = new float[]{-1.0F, 1.0F, -1.0F, 1.0F};
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
      }

      if (this.f5000 == null) {
         this.f5000 = new Object[6];
         Object[] var2 = this.f5000;
         var2[5] = false;
      }
   }

   public void m18000() {
      this.m10000();
      Boolean var5 = false;
      this.f5000[5] = var5;
      super.m6000();
   }

   @Iface0642
   public void m22000(C1150 var1) {
      this.m10000();
      if (C1187.m36000()) {
         var1.m22000((Float)((C0988)this.f2000[0]).i());
      }
   }

   @Iface0642
   public void m24000(C0719 var1) {
      this.m10000();
      AttackAura var2 = NursultanClient.m88000().m30000();
      if (var2.m60000()) {
         ((Base0680)((C1000)this.f5000[2]).i()).y(var1);
      }
   }

   @Iface0642
   public void m26000(C1157 var1) {
      this.m10000();
      if (C1187.m36000()) {
         NjL var2 = var1.m16000();
         C0983 var3 = C0989.m26000(C0989.m28000(), C1177.m80000(var2));
         if (!var1.m4000() && var2.method_6128() && (Boolean)((C0991)this.f2000[1]).i()) {
            NXi var4 = var2.method_73189();
            NXi var5 = var2.method_5720().u().L(((Float)((C0988)this.f2000[2]).i()).floatValue()).i(var4);
            var2.method_5814(var5.M, var5.B, var5.Z);
            var3 = C0989.m26000(C0989.m28000(), C1177.m80000(var2));
            var2.method_5814(var4.M, var4.B, var4.Z);
         }

         var1.m20000(C0989.m28000().m64000(var3.m38000() + C1183.m18000(f4000[0], f4000[1]), var3.m68000() + C1183.m18000(f4000[2], f4000[3])).m54000(true));
      }
   }

   @Iface0642(
      u = true
   )
   public void m28000(OlpnniIl var1) {
      this.m10000();
      if (((C1006)this.f5000[4]).m4000(var1) && ((NNNwS)((NNuU)this.y[0]).T[4]).method_6128()) {
         Boolean var6 = true;
         this.f5000[5] = var6;
      }
   }
}
