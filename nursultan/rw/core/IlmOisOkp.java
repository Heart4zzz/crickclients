package rw.core;

import org.joml.Matrix3x2f;

public class IlmOisOkp {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   IlmOisOkp() {
      this.m2000();
      Matrix3x2f var5 = new Matrix3x2f();
      this.f1000[1] = var5;
   }

   static {
      ntfClinit();
   }
}
