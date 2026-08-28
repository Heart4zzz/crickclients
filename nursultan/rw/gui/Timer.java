package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0988;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Timer",
   y = Enum0055.MOVEMENT,
   N = Enum0070.BASE
)
public class Timer extends GuiWidget {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;

   private static void m4000() {
      f3000 = new String[]{"timer"};
   }

   private static void m6000() {
      f2000 = new float[]{1.0F, 0.1F, 10.0F, 0.05F};
   }

   public Timer() {
      this.m8000();
      C0988 var5 = C0122.m12000(this, f3000[0], f2000[0], f2000[1], f2000[2], f2000[3]);
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   @Iface0642
   public void m2000(rw.core.C0147 var1) {
      this.m8000();
      var1.m20000((Float)((C0988)this.f1000[0]).i());
   }
}
