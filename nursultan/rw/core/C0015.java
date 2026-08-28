package rw.core;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;

public class C0015 extends C0145 {
   public C0015() {
      super(35345);
   }

   static {
      ntfClinit();
   }

   public void m2000(ByteBuffer var1, int var2, int var3) {
      this.N(var1, var3);
      this.m4000(var2);
   }

   public void m4000(int var1) {
      GL33.glBindBufferBase(35345, var1, (Integer)this.y[0]);
   }
}
