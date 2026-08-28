package rw.core;

import org.lwjgl.opengl.GL33;

public class C0038 extends OlkriOrl {
   public C0038() {
      super(GL33.glGenVertexArrays());
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000() {
      GL33.glBindVertexArray((Integer)this.y[0]);
   }
}
