package rw.core;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;
import org.lwjgl.system.MemoryUtil;

public class C0145 extends OlkriOrl {
   public Object[] f1000;

   public C0145(int var1) {
      super(GL33.glGenBuffers());
      this.m2000();
      Integer var6 = var1;
      this.f1000[0] = var6;
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[0] = 0;
         var1[1] = 0;
      }
   }

   public void m8000() {
      this.m2000();
      GL33.glBindBuffer((Integer)this.f1000[0], (Integer)this.y[0]);
   }

   public void m12000(ByteBuffer var1, int var2) {
      this.m2000();
      this.m8000();
      int var3 = var1.position();
      if (var3 > (Integer)this.f1000[1]) {
         int var4 = Math.max((Integer)this.f1000[1] * 2, var3);
         GL33.nglBufferData((Integer)this.f1000[0], var4, 0L, var2);
         Integer var9 = var4;
         this.f1000[1] = var9;
      }

      GL33.nglBufferSubData((Integer)this.f1000[0], 0L, var3, MemoryUtil.memAddress0(var1));
   }
}
