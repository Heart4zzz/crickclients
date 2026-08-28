package rw.data;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.runtime.ObjectMethods;
import rw.api.Iface0668;

public record Rec0304() implements Iface0668 {
   public static Object[] f1000;
   public boolean f2000;

   public Rec0304(boolean var1) {
      this.f2000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0304,"enabled",Rec0304::f2000>(this, var1);
   }

   private static void m10000() {
      f1000 = new Object[]{null, null};
   }

   public boolean m12000() {
      return this.f2000;
   }

   public void m18000() {
      if (this.f2000) {
         GlStateManager._enableCull();
      } else {
         GlStateManager._disableCull();
      }
   }
}
