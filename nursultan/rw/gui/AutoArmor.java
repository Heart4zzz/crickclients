package rw.gui;

import KDFzREm.NCW;
import KDFzREm.NCz;
import KDFzREm.NNKE;
import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNeZ;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NbL;
import KDFzREm.NkG;
import KDFzREm.Nkq;
import KDFzREm.wY;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomUtils;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0719;
import rw.core.C0892;
import rw.core.C0965;
import rw.core.C0979;
import rw.core.C0991;
import rw.core.C1004;
import rw.core.IljlItp;
import rw.core.OlpOnrlmr;
import rw.defs.Enum0055;
import rw.defs.Enum0092;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AutoArmor",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoArmor extends GuiWidget {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;

   private boolean m2000() {
      return (boolean)(((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).b == 0
            && !((NNYH)((NNuU)this.y[0]).v[3] instanceof NNKE)
         ? 1
         : 0);
   }

   public AutoArmor() {
      this.m8000();
      C1004 var5 = C0122.m10000(this, f3000[0], new C0979(f2000[0], f2000[1]), new C0979(f2000[2], f2000[3]), f2000[4]);
      this.f1000[0] = var5;
      C0991 var6 = C0122.m26000(this, f3000[1], false);
      this.f1000[1] = var6;
      C0991 var7 = C0122.m26000(this, f3000[2], false);
      this.f1000[2] = var7;
      C0965 var8 = new C0965();
      this.f1000[3] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new float[]{0.0F, 10.0F, 2.0F, 5.0F, 1.0F};
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var1 = this.f1000;
         var1[4] = false;
         var1[5] = 0;
      }
   }

   private void m10000() {
      this.m8000();
      Integer var5 = RandomUtils.insecure().randomInt((int)((C0979)((C1004)this.f1000[0]).i()).m32000(), (int)((C0979)((C1004)this.f1000[0]).i()).m2000());
      this.f1000[5] = var5;
   }

   private static void m12000() {
      f3000 = new String[]{"delay-in-ticks", "swap-only-while-standing", "swap-only-while-inventory-open"};
   }

   private void m6000(NCz var1) {
      this.m8000();
      if (var1.N() == 0) {
         if (var1.L().stream().anyMatch(var0 -> (boolean)(!var0.R() ? 1 : 0))) {
            Boolean var6 = true;
            this.f1000[4] = var6;
         }
      }
   }

   private void m8000(int var1, Enum0092 var2) {
      if (IljlItp.m32000(var1)) {
         C0892.m44000(var1);
         wY.N(NbL.field_5808);
         C0892.m20000();
      } else if (((NNNwS)((NNuU)this.y[0]).T[4]).method_6118(var2.m44000()).R()) {
         NursultanClient.m60000().m38000(0, var1, 0, Nkq.field_7794).m24000();
      } else {
         int var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().N() % 8 + 1;
         NursultanClient.m60000()
            .m38000(0, var1, var3, Nkq.field_7791)
            .m38000(0, var2.m50000(), var3, Nkq.field_7791)
            .m38000(0, var1, var3, Nkq.field_7791)
            .m24000();
      }
   }

   @Iface0642
   public void m14000(C0719 var1) {
      this.m8000();
      if (((NNNwS)((NNuU)this.y[0]).T[4]).field_6012 % 20 == 0) {
         Boolean var9 = true;
         this.f1000[4] = var9;
      }

      if ((Boolean)this.f1000[4] && this.m2000()) {
         if (!NursultanClient.m60000().m16000()) {
            if ((NNYH)((NNuU)this.y[0]).v[3] instanceof NNeZ || !(Boolean)((C0991)this.f1000[2]).i()) {
               if (!((NNNwS)((NNuU)this.y[0]).T[4]).k() || !(Boolean)((C0991)this.f1000[1]).i()) {
                  ArrayList var2 = new ArrayList<>(List.of(Enum0092.f6000[1], Enum0092.f6000[3], Enum0092.f6000[4]));
                  if (!IljlItp.m40000(NQa.sT)) {
                     var2.add((Enum0092)Enum0092.f6000[2]);
                  }

                  if (var2.stream().allMatch(var0 -> OlpOnrlmr.m28000(var0).isEmpty())) {
                     Boolean var10 = false;
                     this.f1000[4] = var10;
                  } else {
                     for (Enum0092 var4 : var2) {
                        if (((C0965)this.f1000[3]).m18000((Integer)this.f1000[5])) {
                           OlpOnrlmr.m28000(var4).ifPresent(var2x -> {
                              this.m8000();
                              this.m8000(var2x.m4000(), var4);
                              this.m10000();
                              ((C0965)this.f1000[3]).m16000();
                           });
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Iface0642
   private void m18000(rw.module.AutoAccept var1) {
      this.m8000();
      switch (var1.m6000()) {
         case NCz var4:
            this.m6000(var4);
            break;
         case NCW var5:
            Boolean var10 = true;
            this.f1000[4] = var10;
            break;
         default:
      }
   }
}
