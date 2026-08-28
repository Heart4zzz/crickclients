package rw.gui;

import KDFzREm.NNNBF;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNqi;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.Nhd;
import KDFzREm.Nhl;
import KDFzREm.Nkq;
import com.mojang.serialization.Lifecycle;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0606;
import rw.api.Iface0642;
import rw.core.Base1148;
import rw.core.C0704;
import rw.core.C0892;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1006;
import rw.core.C1086;
import rw.core.C1089;
import rw.core.C1193;
import rw.core.IljlItp;
import rw.data.Rec0208;
import rw.data.Rec0267;
import rw.data.Rec0276;
import rw.defs.Enum0055;
import rw.module.Module039;
import rw.module.OlpnniIl;
import rw.module.ShulkerPreview_x;
import rw.setting.C0122;
import rw.setting.UbNu;

@AnnotationDefault(
   L = "AutoSwap",
   y = Enum0055.COMBAT,
   N = Enum0070.BASE
)
public class AutoSwap extends GuiWidget {
   public Object[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;
   private static boolean[] f5000;
   private static String[] f6000;
   private static boolean[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   public Object[] f10000;
   private static String[] f11000;
   public Object[] f12000;

   private void m2000(int var1) {
      this.m6000();
      if (IljlItp.m32000(var1) && NursultanClient.m74000().m10000() - (Integer)this.f1000[0] > 15) {
         C0892.m44000(var1);
         ((NNNBF)((NNNwS)((NNuU)this.y[0]).T[4]).y[0]).M().method_10743(new Nhl(Nhd.field_12969, Ned.field_10980, Nef.field_11033));
         C0892.m4000();
         Integer var6 = NursultanClient.m74000().m10000();
         this.f1000[0] = var6;
      } else {
         NursultanClient.m60000().m38000(0, IljlItp.m4000(var1), 40, Nkq.field_7791).m24000();
      }
   }

   public AutoSwap() {
      this.m6000();
      C1006 var5 = C0122.m14000(this, f11000[0], (PgUp)PgUp.f4000[0]);
      this.f4000[0] = var5;
      UbNu var6 = new UbNu(this, f11000[1], false);
      this.f4000[1] = var6;
      C1000 var7 = C0122.m18000(this, f11000[2], new C1089(this, f11000[3], true), (UbNu)this.f4000[1]);
      this.f10000[0] = var7;
      Supplier var8 = () -> new C1086(f6000[7], true, Iface0606.m4000(NQa.lo));
      this.f10000[1] = var8;
      Supplier var9 = () -> new C1086(f6000[6], false, Iface0606.m4000(NQa.bV));
      this.f10000[2] = var9;
      Supplier var10 = () -> new C1086(f6000[5], false, C1193::m22000);
      this.f12000[0] = var10;
      Supplier var11 = () -> new C1086(f6000[4], false, Iface0606.m4000(NQa.la));
      this.f12000[1] = var11;
      Supplier var12 = () -> new C1086(f6000[3], false, Iface0606.m4000(NQa.GJ));
      this.f12000[2] = var12;
      Supplier var13 = () -> new C1086(f6000[2], false, var0 -> (boolean)((var0.B() == NQa.Go || var0.B() == NQa.lG) && var0.I() ? 1 : 0));
      this.f12000[3] = var13;
      Supplier var14 = () -> new C1086(f6000[0], false, var0 -> (boolean)(var0.B() != NQa.Gw || !var0.y().N(NNNNRZ.b) && !C1193.m64000(var0, f6000[1]) ? 0 : 1));
      this.f12000[4] = var14;
      C1000 var15 = (C1000)C0122.m18000(
            this,
            f11000[4],
            (C1086)((Supplier)this.f10000[1]).get(),
            (C1086)((Supplier)this.f12000[1]).get(),
            (C1086)((Supplier)this.f12000[2]).get(),
            (C1086)((Supplier)this.f12000[0]).get(),
            (C1086)((Supplier)this.f10000[2]).get(),
            (C1086)((Supplier)this.f12000[4]).get(),
            (C1086)((Supplier)this.f12000[3]).get()
         )
         .N(var1 -> {
            this.m6000();
            return (boolean)(!((UbNu)this.f4000[1]).U() ? 1 : 0);
         });
      this.f12000[5] = var15;
      C1000 var16 = (C1000)C0122.m18000(
            this,
            f11000[5],
            (C1086)((Supplier)this.f10000[1]).get(),
            (C1086)((Supplier)this.f12000[1]).get(),
            (C1086)((Supplier)this.f12000[2]).get(),
            (C1086)((Supplier)this.f12000[0]).get(),
            (C1086)((Supplier)this.f10000[2]).get(),
            (C1086)((Supplier)this.f12000[4]).get(),
            (C1086)((Supplier)this.f12000[3]).get()
         )
         .N(var1 -> {
            this.m6000();
            return (boolean)(!((UbNu)this.f4000[1]).U() ? 1 : 0);
         });
      this.f12000[6] = var16;
      C0991 var17 = C0122.m26000(this, f11000[6], false);
      this.f12000[7] = var17;
      NursultanClient.m36000()
         .m22000(
            var0 -> (boolean)((NNNZg)var0.T[3] != null
                  && ((NNNZg)var0.T[3]).method_30349().method_46759(NNNqi.yR).map(var0x -> var0x.R().equals(Lifecycle.experimental())).orElse(false)
               ? 1
               : 0),
            ((UbNu)this.f4000[1])::m72000
         );
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f11000 = new String[]{"swap-key", "multi", "mode", "default", "first-item", "second-item", "log-swapped-item"};
      f6000 = new String[]{"sphere", "sphereEffect", "sunrise-runes", "fireworks", "totem", "any-food", "g-apples", "shield"};
   }

   private void m6000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[2];
         Object[] var1 = this.f4000;
      }

      if (this.f10000 == null) {
         this.f10000 = new Object[3];
         Object[] var2 = this.f10000;
      }

      if (this.f12000 == null) {
         this.f12000 = new Object[8];
         Object[] var3 = this.f12000;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var4 = this.f1000;
         var4[0] = 0;
      }
   }

   @Iface0642(
      u = true
   )
   public void m50000(OlpnniIl var1) {
      this.m6000();
      ((Base1148)((C1000)this.f10000[0]).i()).y(var1);
   }

   @Iface0642
   public void m52000(ShulkerPreview_x var1) {
      this.m6000();
      ((Base1148)((C1000)this.f10000[0]).i()).y(var1);
   }

   @Iface0642
   public void m56000(C0704 var1) {
      this.m6000();
      ((Base1148)((C1000)this.f10000[0]).i()).y(var1);
   }

   public boolean m58000(Function<Stream<Rec0208>, Integer> var1) {
      this.m6000();
      int var2 = (Integer)var1.apply(IljlItp.m6000(var0 -> (boolean)(!var0.R() ? 1 : 0)));
      if (IljlItp.m36000(var2)) {
         return (boolean)0;
      } else {
         if ((Boolean)((C0991)this.f12000[7]).i()) {
            NQo var3 = (NQo)((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().u().get(var2);
            NursultanClient.m70000().m18000().m26000().m46000(new Rec0276(var3.t())).m34000(new Rec0267(var3.Y().L().getString())).m38000(1500L).m44000();
         }

         this.m2000(var2);
         return (boolean)1;
      }
   }

   @Iface0642
   public void m64000(Module039 var1) {
      this.m6000();
      ((Base1148)((C1000)this.f10000[0]).i()).y(var1);
   }

   private static void m72000() {
      f9000 = new boolean[]{false, false, true, true, false, true, false};
      f2000 = new boolean[]{true, false, false, true, false, true, false, false};
      f5000 = new boolean[]{true, false, true, false, true};
      f7000 = new boolean[]{false, false};
      f3000 = new boolean[]{true, false, false, true, false, false, false, false};
      f8000 = new boolean[]{false, true, true, false, false};
   }
}
