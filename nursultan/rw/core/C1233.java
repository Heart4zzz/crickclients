package rw.core;

import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class C1233 implements Iface0667 {
   public Object[] f1000;
   private static float[] f2000;

   public C1233(int var1) {
      this.m18000();
      Integer var6 = var1;
      this.f1000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new float[]{0.0F, 0.0F, 0.0F};
   }

   public void m16000(float var1, float var2, float var3) {
      if (var1 != (Float)this.f1000[1] || var2 != (Float)this.f1000[2] || var3 != (Float)this.f1000[3]) {
         GL33.glUniform3f((Integer)this.f1000[0], var1, var2, var3);
         Float var8 = var1;
         this.f1000[1] = var8;
         Float var9 = var2;
         this.f1000[2] = var9;
         Float var10 = var3;
         this.f1000[3] = var10;
      }
   }

   private void m18000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
         var1[0] = 0;
         var1[1] = f2000[0];
         var1[2] = f2000[1];
         var1[3] = f2000[2];
      }
   }
}
