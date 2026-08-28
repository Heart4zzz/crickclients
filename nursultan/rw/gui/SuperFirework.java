package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0988;
import rw.core.IlsOjlqjr;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "SuperFirework",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class SuperFirework extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;
   private static float[] f3000;

   public SuperFirework() {
      this.m6000();
      C0988 var5 = C0122.m12000(this, f2000[0], f3000[0], f3000[1], f3000[2], f3000[3]);
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f3000 = new float[]{1.5F, 1.5F, 2.0F, 0.01F};
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static void m8000() {
      f2000 = new String[]{"speed"};
   }

   @Iface0642
   public void m2000(IlsOjlqjr var1) {
      this.m6000();
      var1.m24000(((Float)((C0988)this.f1000[0]).i()).floatValue());
   }
}
