package rw.core;

import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class C1223 implements Iface0667 {
   private static float[] f1000;
   public Object[] f2000;

   public C1223(int var1) {
      this.m10000();
      Integer var6 = var1;
      this.f2000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
         var1[0] = 0;
         var1[1] = f1000[0];
         var1[2] = f1000[1];
      }
   }

   private static void m16000() {
      f1000 = new float[]{0.0F, 0.0F};
   }

   public void m18000(float var1, float var2) {
      if (var1 != (Float)this.f2000[1] || var2 != (Float)this.f2000[2]) {
         GL33.glUniform2f((Integer)this.f2000[0], var1, var2);
         Float var7 = var1;
         this.f2000[1] = var7;
         Float var8 = var2;
         this.f2000[2] = var8;
      }
   }
}
