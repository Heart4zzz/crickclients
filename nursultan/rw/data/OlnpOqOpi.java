package rw.data;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.runtime.ObjectMethods;
import rw.api.Iface0668;

public record OlnpOqOpi() implements Iface0668 {
   public static Object[] f1000;
   public boolean f2000;

   public OlnpOqOpi(boolean var1) {
      this.f2000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OlnpOqOpi,"enabled",OlnpOqOpi::f2000>(this, var1);
   }

   private static void m8000() {
      f1000 = new Object[]{null, null};
   }

   public boolean m12000() {
      return this.f2000;
   }

   public void m16000() {
      if (this.f2000) {
         GlStateManager._enableDepthTest();
      } else {
         GlStateManager._disableDepthTest();
      }
   }
}
