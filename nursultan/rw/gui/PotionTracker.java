package rw.gui;

import KDFzREm.NAB;
import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NCq;
import KDFzREm.NHS;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNqi;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNWd;
import KDFzREm.NNag;
import KDFzREm.NNtL;
import KDFzREm.NNuU;
import KDFzREm.NOl;
import KDFzREm.NPh;
import KDFzREm.NQo;
import KDFzREm.NSY;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NbQ;
import KDFzREm.Nbw;
import KDFzREm.NcB;
import KDFzREm.NcZ;
import KDFzREm.NkL;
import KDFzREm.Nwn;
import KDFzREm.XB;
import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.List;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.core.C0777;
import rw.core.C0876;
import rw.core.C0910;
import rw.core.C0991;
import rw.data.Rec0195;
import rw.defs.Enum0055;
import rw.defs.Enum0059;
import rw.event.EventBus;
import rw.setting.C0106;
import rw.setting.C0122;
import rw.setting.C0135;
import rw.setting.C0160;

@AnnotationDefault(
   L = "PotionTracker",
   y = Enum0055.MISC,
   N = Enum0070.TRACKERS
)
public class PotionTracker extends GuiWidget {
   private static double[] f1000;
   private static String[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   private static double[] f5000;

   private void m2000(C0910 var1) {
      NursultanClient.m36000().m36000(() -> {
         this.m14000();
         this.m10000(var1);
         ((List)this.f3000[4]).clear();
      });
   }

   private static void m4000() {
      f1000 = new double[]{4.0, 2.0, 4.0, 100.0, 16.0, 0.0, 1.0};
      f5000 = new double[]{1.0, 4.0, 0.5};
   }

   private static void m6000() {
      f4000 = new float[]{100.0F, 0.33333334F, 1.0F, 1.0F};
   }

   public PotionTracker() {
      this.m14000();
      C0991 var6 = C0122.m26000(this, f2000[0], true);
      this.f3000[0] = var6;
      C0991 var7 = C0122.m26000(this, f2000[1], true);
      this.f3000[1] = var7;
      C0991 var8 = C0122.m26000(this, f2000[2], true);
      this.f3000[2] = var8;
      ArrayList var9 = new ArrayList();
      this.f3000[3] = var9;
      ArrayList var10 = new ArrayList();
      this.f3000[4] = var10;
      EventBus var1 = NursultanClient.m8000();
      var1.m54000(C0910.class, this::m2000);
      var1.m54000(rw.module.AutoAccept.class, this::m36000);
      NursultanClient.m36000()
         .m22000(
            var0 -> (boolean)((NNNZg)var0.T[3] != null
                  && ((NNNZg)var0.T[3]).method_30349().method_46759(NNNqi.yR).map(var0x -> var0x.R().equals(Lifecycle.experimental())).orElse(false)
               ? 1
               : 0),
            this::m12000
         );
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new String[]{"ignore-self", "ignore-common-splash-potions", "ft-bypass", " ", "\n● "};
   }

   private void m12000() {
      this.m14000();
      C0777.m30000((Enum0059)Enum0059.f8000[3]).stream().map(C0135::m36000).forEach(((List)this.f3000[3])::add);
   }

   private void m14000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[5];
         Object[] var1 = this.f3000;
      }
   }

   private void m10000(C0910 var1) {
      this.m14000();
      NcB var2 = var1.m22000();
      NbK var3 = var2.N() == NcZ.field_1331 ? ((NNtL)var2).L() : null;
      NkL var4 = var1.m16000();
      List var5 = this.m22000(var4.method_5829().L(f1000[0], f1000[1], f1000[2]));
      if (!var5.isEmpty()) {
         if ((Boolean)((C0991)this.f3000[2]).i() && C0160.m24000()) {
            for (Rec0195 var7 : (List)this.f3000[4]) {
               for (NQo var9 : (List)this.f3000[3]) {
                  NOl var10 = (NOl)var9.a_(NNNNRZ.h, NOl.N);
                  int var11 = C0876.m34000(C0876.m28000(var7.f1000), C0876.m58000(var7.f1000), C0876.m20000(var7.f1000), 255);
                  if (!var10.R().isEmpty() && C0876.m68000((Integer)var10.R().get(), var11, 10)) {
                     this.m14000(var5, var2.y(), var3, (boolean)1, var9);
                     break;
                  }
               }
            }
         } else {
            this.m14000(var5, var4.method_73189(), var3, (boolean)0, var4.L());
         }
      }
   }

   private void m14000(List<Nwn> var1, NXi var2, NbK var3, boolean var4, NQo var5) {
      this.m14000();
      NOl var6 = (NOl)var5.a_(NNNNRZ.h, NOl.N);
      Iterable var7 = var6.N();

      for (Nwn var9 : var1) {
         if (this.m24000(var9)) {
            double var10 = this.m20000(var2.M(var9.method_73189()), var9, var3);
            ArrayList var12 = new ArrayList();

            for (NbQ var14 : var7) {
               if (!((Nbw)var14.L().N()).N()) {
                  int var15 = var14.N(var2x -> (int)(var10 * var2x + f5000[2]));
                  if (var15 > 20) {
                     var12.add(this.m30000(var14, var15));
                  }
               }
            }

            if (!var12.isEmpty() && this.U() && (!(Boolean)((C0991)this.f3000[1]).i() || var4)) {
               int var16 = Math.clamp(Math.round(var10 * f1000[3]), 1, 100);
               this.m16000(var9, var5, var12, var16);
            }
         }
      }
   }

   private void m16000(Nwn var1, NQo var2, List<NAN> var3, int var4) {
      int var5 = NNWE.M(var4 / f4000[0] * f4000[1], f4000[2], f4000[3]);
      NNag var6 = NAN.y(" " + var4 + "%").L(NAd.N.N(var5));
      NNag var7 = var1.yZ().L().i(f2000[3]).y(var2.Y()).y(var6).L(NAd.N.N(new NAB(var2)));

      for (NAN var9 : var3) {
         var7.i(f2000[4]).y(var9);
      }

      C0106.m32000(var7.N(NPh.field_1080));
   }

   private double m20000(double var1, Nwn var3, NbK var4) {
      if (var1 >= f1000[4]) {
         return f1000[5];
      } else {
         return var3 == var4 ? f1000[6] : f5000[0] - Math.sqrt(var1) / f5000[1];
      }
   }

   private List<Nwn> m22000(NHS var1) {
      return ((NNNZg)((NNuU)this.y[0]).T[3]).N(Nwn.class, var1);
   }

   private boolean m24000(Nwn var1) {
      this.m14000();
      if (!var1.method_6086()) {
         return (boolean)0;
      } else {
         boolean var2 = this.U();
         if (!var2 && var1 == (NNNwS)((NNuU)this.y[0]).T[4]) {
            return (boolean)0;
         } else {
            return (boolean)(var2 && ((C0991)this.f3000[0]).i() && var1 == (NNNwS)((NNuU)this.y[0]).T[4] ? 0 : 1);
         }
      }
   }

   private NAN m30000(NbQ var1, int var2) {
      String var3 = XB.N(var1.z(), new Object[0]);
      if (var1.i() >= 1 && var1.i() <= 9) {
         var3 = var3 + " " + XB.N("enchantment.level." + (var1.i() + 1), new Object[0]);
      }

      String var4 = NNWd.N(var2, ((NNNZg)((NNuU)this.y[0]).T[3]).method_54719().R());
      NNag var5 = NAN.y(var3).N(NPh.field_1061);
      return NAN.i().y(var5).i(" " + var4);
   }

   private void m36000(rw.module.AutoAccept var1) {
      this.m14000();
      switch (var1.m6000()) {
         case NSY var4:
            ((NNuU)this.y[0]).execute(() -> var4.N().forEach(var1xx -> {
               if (((NNNZg)((NNuU)this.y[0]).T[3]).method_8469(var1xx) instanceof NkL var2) {
                  var2.method_5773();
               }
            }));
            break;
         case NCq var5:
            if (!(Boolean)((C0991)this.f3000[2]).i() || !C0160.m24000()) {
               return;
            }

            ((NNuU)this.y[0]).execute(() -> {
               this.m14000();
               if (var5.y() == 2002) {
                  ((List)this.f3000[4]).add(new Rec0195(var5.u(), var5.L()));
               }
            });
            return;
         case null:
         default:
      }
   }
}
