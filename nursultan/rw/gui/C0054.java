package rw.gui;

import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0988;
import rw.core.IlpqIskrt;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Gamma",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class C0054 extends GuiWidget {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   public C0054() {
      this.m6000();
      C0988 var5 = C0122.m12000(this, f1000[0], f2000[0], f2000[1], f2000[2], f2000[3]);
      this.f3000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f2000 = new float[]{5.0F, 1.0F, 10.0F, 0.1F, 10.0F};
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   private static void m8000() {
      f1000 = new String[]{"gamma"};
   }

   @Iface0642
   public void m2000(IlpqIskrt var1) {
      this.m6000();
      var1.m16000((Float)((C0988)this.f3000[0]).i() / f2000[4]);
   }
}
