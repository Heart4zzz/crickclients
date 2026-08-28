package rw.core;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class C0804 implements Iface0667 {
   public Object[] f1000;

   public C0804(int var1) {
      this.m18000();
      Integer var6 = var1;
      this.f1000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static int m12000(FloatBuffer var0) {
      int var1 = 1;
      int var2 = var0.limit();

      for (int var3 = 0; var3 < var2; var3++) {
         var1 = 31 * var1 + Float.floatToIntBits(var0.get(var3));
      }

      return var1;
   }

   public void m16000(FloatBuffer var1) {
      int var2 = m12000(var1);
      if (!(Boolean)this.f1000[2] || var2 != (Integer)this.f1000[1]) {
         Integer var7 = var2;
         this.f1000[1] = var7;
         Boolean var8 = true;
         this.f1000[2] = var8;
         var1.position(0);
         GL33.glUniform1fv((Integer)this.f1000[0], var1);
      }
   }

   private void m18000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = false;
      }
   }
}
