package rw.core;

import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class C1250 implements Iface0667 {
   private static float[] f1000;
   public Object[] f2000;

   private static void m2000() {
      f1000 = new float[]{255.0F, 255.0F, 255.0F, 255.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public C1250(int var1) {
      this.m16000();
      Integer var6 = var1;
      this.f2000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private void m16000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[5];
         Object[] var1 = this.f2000;
         var1[0] = 0;
         var1[1] = f1000[4];
         var1[2] = f1000[5];
         var1[3] = f1000[6];
         var1[4] = f1000[7];
      }
   }

   public void m18000(float var1, float var2, float var3, float var4) {
      if (var1 != (Float)this.f2000[1] || var2 != (Float)this.f2000[2] || var3 != (Float)this.f2000[3] || var4 != (Float)this.f2000[4]) {
         GL33.glUniform4f((Integer)this.f2000[0], var1, var2, var3, var4);
         Float var9 = var1;
         this.f2000[1] = var9;
         Float var10 = var2;
         this.f2000[2] = var10;
         Float var11 = var3;
         this.f2000[3] = var11;
         Float var12 = var4;
         this.f2000[4] = var12;
      }
   }

   public void m22000(int var1) {
      this.m18000(C0876.m28000(var1) / f1000[0], C0876.m58000(var1) / f1000[1], C0876.m20000(var1) / f1000[2], C0876.m46000(var1) / f1000[3]);
   }
}
