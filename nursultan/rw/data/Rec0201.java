package rw.data;

import KDFzREm.NNNBM;
import java.lang.runtime.ObjectMethods;
import org.joml.Matrix4f;

public record Rec0201() {
   public Matrix4f f1000;
   public float f2000;
   public NNNBM f3000;

   public NNNBM m2000() {
      return this.f3000;
   }

   public Rec0201(Matrix4f var1, NNNBM var2, float var3) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0201,"matrix;cuboid;volume",Rec0201::f1000,Rec0201::f3000,Rec0201::f2000>(this, var1);
   }

   public Matrix4f m6000() {
      return this.f1000;
   }

   public float m8000() {
      return this.f2000;
   }
}
