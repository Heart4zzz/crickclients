package rw.gui;

import KDFzREm.NNNYO;
import KDFzREm.NNde;
import KDFzREm.NNuU;
import org.joml.Vector2f;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1138;
import rw.core.C0710;
import rw.core.C0852;
import rw.core.C0860;
import rw.core.C1000;
import rw.core.OlilIkq;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.setting.C0122;

@AnnotationDefault(
   L = "FreeLook",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class FreeLook extends GuiWidget {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   private static void m4000() {
      f1000 = new String[]{"pov", "back", "front", "nothing"};
   }

   public FreeLook() {
      this.m10000();
      C1000 var5 = C0122.m18000(this, f1000[0], new C0860(f1000[1], true), new OlilIkq(f1000[2], false), new C0852(f1000[3], false));
      this.f3000[0] = var5;
      Vector2f var6 = new Vector2f(f2000[0], f2000[1]);
      this.f3000[1] = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m6000() {
      this.m10000();
      NNde var1 = ((NNNYO)((NNuU)this.y[0]).i[5]).s();
      Vector2f var6 = new Vector2f(var1.R(), var1.i());
      this.f3000[1] = var6;
      return super.m12000();
   }

   private void m10000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[2];
         Object[] var1 = this.f3000;
      }
   }

   private static void m12000() {
      f2000 = new float[]{0.0F, 0.0F, 0.15F, 0.15F};
   }

   @Iface0642
   public void m4000(C0710 var1) {
      this.m10000();
      ((Base1138)((C1000)this.f3000[0]).i()).y(var1);
   }

   @Iface0642(
      y = Enum0081.BEFORE
   )
   public void m6000(rw.module.AimAssist var1) {
      this.m10000();
      ((Vector2f)this.f3000[1]).x = ((Vector2f)this.f3000[1]).x + (float)var1.m18000() * f2000[2];
      ((Vector2f)this.f3000[1]).y = ((Vector2f)this.f3000[1]).y + (float)var1.m4000() * f2000[3];
      var1.N();
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public void m8000(rw.module.FreeCamera var1) {
      this.m10000();
      var1.m34000(((Vector2f)this.f3000[1]).x);
      var1.m28000(((Vector2f)this.f3000[1]).y);
   }
}
