package rw.core;

import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class C1228 implements Iface0667 {
   public Object[] f1000;

   public C1228(int var1) {
      this.m18000();
      Integer var6 = Integer.MIN_VALUE;
      this.f1000[1] = var6;
      Integer var7 = var1;
      this.f1000[0] = var7;
   }

   static {
      ntfClinit();
   }

   private void m18000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[0] = 0;
         var1[1] = 0;
      }
   }

   public void m20000(int var1) {
      if (var1 != (Integer)this.f1000[1]) {
         GL33.glUniform1i((Integer)this.f1000[0], var1);
         Integer var6 = var1;
         this.f1000[1] = var6;
      }
   }
}
