package rw.data;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.runtime.ObjectMethods;
import rw.api.Iface0668;

public record Rec0309() implements Iface0668 {
   public int f1000;
   public int f2000;
   public int f3000;
   public int f4000;
   public boolean f5000;
   public static Object[] f6000;

   public int m4000() {
      return this.f2000;
   }

   private static void m6000() {
      f6000 = new Object[]{null, null, null, null};
   }

   public Rec0309(boolean var1, int var2, int var3, int var4, int var5) {
      this.f5000 = var1;
      this.f4000 = var2;
      this.f1000 = var3;
      this.f3000 = var4;
      this.f2000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0309,"enabled;srcRGB;dstRGB;srcA;dstA",Rec0309::f5000,Rec0309::f4000,Rec0309::f1000,Rec0309::f3000,Rec0309::f2000>(
         this, var1
      );
   }

   public int m14000() {
      return this.f3000;
   }

   public int m20000() {
      return this.f1000;
   }

   public boolean m24000() {
      return this.f5000;
   }

   public void m26000() {
      if (this.f5000) {
         GlStateManager._enableBlend();
         GlStateManager._blendFuncSeparate(this.f4000, this.f1000, this.f3000, this.f2000);
      } else {
         GlStateManager._disableBlend();
      }
   }

   public int m30000() {
      return this.f4000;
   }
}
