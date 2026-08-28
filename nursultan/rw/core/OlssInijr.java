package rw.core;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class OlssInijr implements Iface0667 {
   public Object[] f1000;
   public static Object[] f2000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }

   public OlssInijr(int var1) {
      this.m4000();
      Matrix4f var6 = new Matrix4f().zero();
      this.f1000[1] = var6;
      Integer var7 = var1;
      this.f1000[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f2000 = new Object[]{null};
   }

   public void m18000(Matrix4f var1) {
      if (!((Matrix4f)this.f1000[1]).equals(var1)) {
         ((Matrix4f)this.f1000[1]).set(var1);
         var1.get(((FloatBuffer)f2000[0]).position(0));
         GL33.glUniformMatrix4fv((Integer)this.f1000[0], (boolean)0, (FloatBuffer)f2000[0]);
      }
   }
}
