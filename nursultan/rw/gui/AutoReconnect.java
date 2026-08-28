package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNps;
import KDFzREm.NNuU;
import java.util.function.Supplier;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0916;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.OltlIpjm;
import rw.data.Rec0177;
import rw.defs.Enum0055;
import rw.setting.C0122;
import rw.setting.C0160;

@AnnotationDefault(
   L = "AutoReconnect",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoReconnect extends GuiWidget {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   public AutoReconnect() {
      this.m8000();
      C0988 var5 = C0122.m12000(this, f1000[0], f2000[0], f2000[1], f2000[2], f2000[3]).m34000((Supplier<String>)OltlIpjm.f2000[2]);
      this.f3000[0] = var5;
      C0991 var6 = C0122.m26000(this, f1000[1], true);
      this.f3000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f2000 = new float[]{10.0F, 10.0F, 300.0F, 1.0F, 20.0F};
   }

   private void m6000() {
      this.m8000();
      if ((Boolean)((C0991)this.f3000[1]).i()) {
         NursultanClient.m88000().m82000().N((boolean)1);
      }
   }

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[3];
         Object[] var1 = this.f3000;
      }
   }

   private static void m10000() {
      f1000 = new String[]{"delay", "auto-enable-auto-leave"};
   }

   public void m16000() {
      this.m8000();
      Object var5 = null;
      this.f3000[2] = var5;
      super.m6000();
   }

   @Iface0642
   public void m4000(rw.module.AutoAccept var1) {
      this.m8000();
      if (var1.m6000() instanceof NNNps) {
         if ((Rec0177)this.f3000[2] != null) {
            Object var7 = null;
            this.f3000[2] = var7;
            this.m6000();
         } else if ((NNNZg)((NNuU)this.y[0]).T[3] != null) {
            int var2 = C0160.m8000();
            if (var2 != -1) {
               Rec0177 var8 = new Rec0177("/an" + var2, NursultanClient.m74000().m10000());
               this.f3000[2] = var8;
            }
         }
      }
   }

   @Iface0642
   public void m6000(C0916 var1) {
      this.m8000();
      if ((Rec0177)this.f3000[2] != null) {
         int var2 = NursultanClient.m74000().m10000();
         if (var2 > ((Rec0177)this.f3000[2]).m4000() + (Float)((C0988)this.f3000[0]).i() * f2000[4]) {
            C0160.m70000(((Rec0177)this.f3000[2]).m6000());
            Rec0177 var7 = new Rec0177(((Rec0177)this.f3000[2]).m6000(), var2);
            this.f3000[2] = var7;
         }
      }
   }
}
