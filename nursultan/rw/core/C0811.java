package rw.core;

import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class C0811 {
   public static Object[] f1000;
   public Object[] f2000;

   public ByteBuffer m4000() {
      ((ByteBuffer)this.f2000[0]).flip();
      return (ByteBuffer)this.f2000[0];
   }

   private void m6000(int var1) {
      int var2 = ((ByteBuffer)this.f2000[0]).capacity();

      while (((ByteBuffer)this.f2000[0]).position() + var1 > var2) {
         var2 += var2 >> 1;
      }

      int var3 = ((ByteBuffer)this.f2000[0]).position();
      ByteBuffer var8 = MemoryUtil.memRealloc((ByteBuffer)this.f2000[0], var2);
      this.f2000[0] = var8;
      ((ByteBuffer)this.f2000[0]).position(var3);
   }

   private static void m8000() {
      f1000 = new Object[]{null};
   }

   public C0811(int var1) {
      this.m14000();
      ByteBuffer var6 = MemoryUtil.memAlloc(var1);
      this.f2000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private void m14000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
         var1[1] = 0;
      }
   }

   public int m16000() {
      return (Integer)this.f2000[1];
   }

   public ByteBuffer m22000() {
      return (ByteBuffer)this.f2000[0];
   }

   private ByteBuffer m24000(int var1) {
      if (((ByteBuffer)this.f2000[0]).position() + var1 > ((ByteBuffer)this.f2000[0]).capacity()) {
         this.m6000(var1);
      }

      return (ByteBuffer)this.f2000[0];
   }

   public C0811 m26000(int var1) {
      this.m24000(4).putInt(var1);
      return this;
   }

   public int m28000() {
      int var10002 = (Integer)this.f2000[1];
      Integer var5 = var10002 + 1;
      this.f2000[1] = var5;
      return var10002;
   }

   public C0811 m30000(float var1) {
      this.m24000(4).putFloat(var1);
      return this;
   }

   public C0811 m32000(float var1, float var2) {
      this.m24000(8).putFloat(var1).putFloat(var2);
      return this;
   }

   public void m34000() {
      ((ByteBuffer)this.f2000[0]).position(0);
      Integer var5 = 0;
      this.f2000[1] = var5;
   }

   public C0811 m36000(int var1) {
      this.m24000(4).putInt(var1);
      return this;
   }

   public C0811 m38000(byte var1) {
      this.m24000(1).put(var1);
      return this;
   }

   public C0811 m40000(float var1, float var2, float var3) {
      this.m24000(12).putFloat(var1).putFloat(var2).putFloat(var3);
      return this;
   }

   public C0811 m42000(Matrix4f var1, float var2, float var3, float var4) {
      Vector3f var5 = ((Vector3f)f1000[0]).set(var2, var3, var4);
      var1.transformPosition(var5);
      this.m24000(12).putFloat(var5.x).putFloat(var5.y).putFloat(var5.z);
      return this;
   }
}
