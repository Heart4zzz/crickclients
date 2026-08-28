package rw.gui;

import KDFzREm.NGK;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0716;
import rw.core.C0876;
import rw.core.C0988;
import rw.core.OlrkjkIkk;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "SeeInvisible",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class SeeInvisible extends GuiWidget {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   private static void m4000() {
      f2000 = new float[]{0.5F, 0.1F, 1.0F, 0.1F, 255.0F};
   }

   public SeeInvisible() {
      this.m8000();
      C0988 var5 = C0122.m12000(this, f1000[0], f2000[0], f2000[1], f2000[2], f2000[3]);
      this.f3000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new String[]{"opacity"};
   }

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   @Iface0642
   public void m2000(OlrkjkIkk var1) {
      this.m8000();
      var1.m16000(C0876.m44000(255, (int)(f2000[4] * (Float)((C0988)this.f3000[0]).i())));
   }

   @Iface0642
   public void m4000(C0716 var1) {
      if (!(var1.m24000() instanceof NGK)) {
         var1.m20000((boolean)0);
      }
   }
}
