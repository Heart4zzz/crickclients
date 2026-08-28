package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NQo;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1148;
import rw.core.C0151;
import rw.core.C0703;
import rw.core.C0719;
import rw.core.C0778;
import rw.core.C0988;
import rw.core.C0999;
import rw.core.C1000;
import rw.core.C1010;
import rw.core.C1013;
import rw.core.C1188;
import rw.core.C1190;
import rw.core.IllOprm;
import rw.core.OltlIpjm;
import rw.data.ConfigFiles;
import rw.data.Rec0179;
import rw.data.Rec0213;
import rw.data.Rec0217;
import rw.data.Rec0286;
import rw.defs.Enum0055;
import rw.defs.Enum0090;
import rw.module.AttackAura_x_x;
import rw.net.Auto;
import rw.net.AutoBuyX;
import rw.setting.C0085;
import rw.setting.C0087;
import rw.setting.C0106;
import rw.setting.C0122;
import rw.setting.C0160;

@AnnotationDefault(
   L = "AutoBuy",
   y = Enum0055.MISC,
   N = Enum0070.BASE
)
public class AutoBuy extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   private static double[] f4000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[8];
         Object[] var1 = this.f2000;
      }
   }

   public AutoBuy() {
      this.m4000();
      Auto var5 = new Auto();
      this.f2000[0] = var5;
      AutoBuyX var6 = new AutoBuyX();
      this.f2000[1] = var6;
      C0778 var7 = new C0778();
      this.f2000[2] = var7;
      C0085 var8 = new C0085((Auto)this.f2000[0], this, f1000[0], true, this::m12000);
      this.f2000[3] = var8;
      C0087 var9 = new C0087((AutoBuyX)this.f2000[1], this, f1000[1], false, this::m24000);
      this.f2000[4] = var9;
      C1000 var10 = C0122.m18000(this, f1000[2], (C0085)this.f2000[3], (C0087)this.f2000[4]);
      this.f2000[5] = var10;
      C0988 var11 = C0122.m12000(this, f1000[3], f3000[0], f3000[1], f3000[2], f3000[3]).m34000((Supplier<String>)OltlIpjm.f2000[0]);
      this.f2000[6] = var11;
      C1010 var12 = C0122.m22000(this, f1000[4], this::m12000);
      this.f2000[7] = var12;
   }

   static {
      ntfClinit();
   }

   public boolean m6000() {
      this.m4000();
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null) {
         if (((C0087)this.f2000[4]).U()) {
            ((AutoBuyX)this.f2000[1]).m6000();
         } else if (((C0085)this.f2000[3]).U() && !((Auto)this.f2000[0]).m64000()) {
            ((Auto)this.f2000[0]).m52000();
         }

         return super.m12000();
      } else {
         return (boolean)0;
      }
   }

   public boolean m10000() {
      this.m4000();
      ((C0778)this.f2000[2]).m76000();
      if (((C0087)this.f2000[4]).U() && !((AutoBuyX)this.f2000[1]).m52000()) {
         ((AutoBuyX)this.f2000[1]).m46000();
      } else if (((C0085)this.f2000[3]).U() && ((Auto)this.f2000[0]).m64000()) {
         ((Auto)this.f2000[0]).m28000();
      }

      ((C0087)this.f2000[4]).m68000();
      return super.m14000();
   }

   private double m8000() {
      this.m4000();
      return ((Float)((C0988)this.f2000[6]).i()).floatValue() / f4000[0];
   }

   private void m12000() {
      this.m4000();
      if ((!((C0085)this.f2000[3]).U() || !((Auto)this.f2000[0]).m64000() || !((Auto)this.f2000[0]).m2000())
         && (!((C0087)this.f2000[4]).U() || !((AutoBuyX)this.f2000[1]).m58000().get())) {
         List var1 = NursultanClient.m52000().m76000().values().stream().filter(var0 -> (boolean)(var0.m6000() && var0.m60000().i() ? 1 : 0)).toList();
         ((C0778)this.f2000[2]).m74000(var1, var1x -> IllOprm.m28000(var1x, this.m8000())).thenAccept(var0 -> {
            C0106.m32000(C1188.m12000(f1000[5]).N(NPh.field_1080));
            ConfigFiles.m54000(C0999.class);
         });
      }
   }

   public void m14000() {
      int var1 = C0160.m8000();
      if (var1 != -1) {
         int[] var2 = C1190.m28000().filter(var0 -> (boolean)(var0.m10000() == (Enum0090)Enum0090.f5000[1] ? 1 : 0)).mapToInt(Rec0286::m8000).toArray();

         for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var2[var3];
            if (var1 == var4) {
               int var5 = var2[(var3 + 1) % var2.length];
               C0160.m70000("/an" + var5);
               break;
            }
         }
      }
   }

   private static void m16000() {
      f3000 = new float[]{40.0F, 0.0F, 90.0F, 1.0F};
   }

   private static void m18000() {
      f1000 = new String[]{"buyer", "checker", "mode", "decrease-prices", "auto-parser", "auto-parser.complete"};
   }

   private void m12000(C1013 var1) {
      this.m4000();
      ((C0085)var1).m48000();
      if (!var1.m14000()) {
         ((Auto)this.f2000[0]).m28000();
      } else {
         if (this.U()) {
            ((Auto)this.f2000[0]).m52000();
         }
      }
   }

   @Iface0642
   public void m14000(C0719 var1) {
      this.m4000();
      ((C0778)this.f2000[2]).m48000(var1);
      ((Base1148)((C1000)this.f2000[5]).i()).y(var1);
   }

   @Iface0642
   public void m18000(rw.module.AutoAccept var1) {
      this.m4000();
      ((C0778)this.f2000[2]).m48000(var1.m6000());
   }

   @Iface0642
   public void m22000(C0703 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[5]).i()).y(var1);
   }

   private void m24000(C1013 var1) {
      this.m4000();
      ((C0087)var1).m68000();
      if (!var1.m14000()) {
         ((AutoBuyX)this.f2000[1]).m46000();
      } else {
         if (this.U()) {
            ((AutoBuyX)this.f2000[1]).m6000();
         }
      }
   }

   @Iface0642
   public void m26000(AttackAura_x_x var1) {
      this.m4000();
      if ((NNYH)((NNuU)this.y[0]).v[3] != null) {
         if ((!((C0087)this.f2000[4]).U() || !((AutoBuyX)this.f2000[1]).m52000()) && (!((C0085)this.f2000[3]).U() || ((Auto)this.f2000[0]).m64000())) {
            var1.m10000((boolean)0);
            var1.m22000((boolean)0);
            var1.m2000((boolean)0);
            var1.m46000((boolean)0);
            var1.m16000((boolean)0);
            var1.m34000((boolean)0);
         }
      }
   }

   @Iface0642
   public void m30000(Rec0179 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[5]).i()).y(var1);
   }

   @Iface0642
   public void m32000(C0151 var1) {
      this.m4000();
      ((C0778)this.f2000[2]).m48000(var1);
   }

   @Iface0642
   public void m34000(rw.module.Blink var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[5]).i()).y(var1);
   }

   @Iface0642
   public void m36000(Rec0217 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[5]).i()).y(var1);
   }

   @Iface0642
   public void m38000(Rec0213 var1) {
      this.m4000();
      ((Base1148)((C1000)this.f2000[5]).i()).y(var1);
   }

   public static int m40000(NQo var0, long var1) {
      return Objects.hash(var0.Y().getString(), var0.B().z(), var1);
   }

   private static void m48000() {
      f4000 = new double[]{100.0};
   }
}
