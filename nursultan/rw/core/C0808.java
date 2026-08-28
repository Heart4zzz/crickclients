package rw.core;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class C0808 {
   public Object[] f1000;

   public ByteBuffer m2000() {
      ((ByteBuffer)this.f1000[0]).flip();
      return (ByteBuffer)this.f1000[0];
   }

   public C0808(int var1) {
      this.m26000();
      ByteBuffer var6 = MemoryUtil.memAlloc(var1);
      this.f1000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private ByteBuffer m14000(int var1) {
      if (((ByteBuffer)this.f1000[0]).position() + var1 > ((ByteBuffer)this.f1000[0]).capacity()) {
         this.m28000(var1);
      }

      return (ByteBuffer)this.f1000[0];
   }

   public C0808 m18000(int var1) {
      this.m24000(var1);
      this.m24000(var1 + 1);
      this.m24000(var1 + 3);
      this.m24000(var1 + 1);
      this.m24000(var1 + 2);
      this.m24000(var1 + 3);
      return this;
   }

   public void m20000() {
      ((ByteBuffer)this.f1000[0]).position(0);
   }

   public ByteBuffer m22000() {
      return (ByteBuffer)this.f1000[0];
   }

   public C0808 m24000(int var1) {
      this.m14000(4).putInt(var1);
      return this;
   }

   private void m26000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private void m28000(int var1) {
      int var2 = ((ByteBuffer)this.f1000[0]).capacity();

      while (((ByteBuffer)this.f1000[0]).position() + var1 > var2) {
         var2 += var2 >> 1;
      }

      int var3 = ((ByteBuffer)this.f1000[0]).position();
      ByteBuffer var8 = MemoryUtil.memRealloc((ByteBuffer)this.f1000[0], var2);
      this.f1000[0] = var8;
      ((ByteBuffer)this.f1000[0]).position(var3);
   }
}
