package rw.core;

import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class C0821 implements Iface0667 {
   public Object[] f1000;
   private static float[] f2000;

   public C0821(int var1) {
      this.m14000();
      Integer var6 = var1;
      this.f1000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new float[]{0.0F};
   }

   private void m14000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[0] = 0;
         var1[1] = f2000[0];
      }
   }

   public void m20000(float var1) {
      if (var1 != (Float)this.f1000[1]) {
         GL33.glUniform1f((Integer)this.f1000[0], var1);
         Float var6 = var1;
         this.f1000[1] = var6;
      }
   }
}
