package rw.core;

import KDFzREm.NNIo;
import rw.gui.SwingAnimations;

public abstract class Base0940 extends C1013 {
   public Object[] f1000;

   public boolean m2000() {
      return (boolean)1;
   }

   public Base0940(SwingAnimations var1, String var2, boolean var3) {
      super(var2, var3);
      this.m2000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public boolean m4000() {
      return (boolean)1;
   }

   public abstract void m6000(NNIo var1, int var2, float var3, float var4, float var5, float var6, float var7);
}
