package rw.core;

import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;

public class C0832 {
   public static Object[] f1000;
   public Object[] f2000;

   public C0832() {
      this.m10000();
      C0015 var5 = new C0015();
      this.f2000[0] = var5;
      ByteBuffer var6 = BufferUtils.createByteBuffer(128);
      this.f2000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   public void m18000(Matrix4f var1, Matrix4f var2) {
      ((ByteBuffer)this.f2000[1]).clear();
      var1.get(0, (ByteBuffer)this.f2000[1]);
      var2.get(64, (ByteBuffer)this.f2000[1]);
      ((ByteBuffer)this.f2000[1]).position(128);
      ((C0015)this.f2000[0]).m2000((ByteBuffer)this.f2000[1], 0, 35048);
   }

   private static void m20000() {
      f1000 = new Object[]{0, 0, 64, 128};
   }
}
