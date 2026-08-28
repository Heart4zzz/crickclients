package rw.data;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.runtime.ObjectMethods;
import rw.api.Iface0668;

public record CriticalPartApi() implements Iface0668 {
   public boolean f1000;
   public static Object[] f2000;

   private static void m2000() {
      f2000 = new Object[]{null, null};
   }

   public CriticalPartApi(boolean var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",CriticalPartApi,"enabled",CriticalPartApi::f1000>(this, var1);
   }

   public boolean m12000() {
      return this.f1000;
   }

   public void m18000() {
      GlStateManager._depthMask(this.f1000);
   }
}
