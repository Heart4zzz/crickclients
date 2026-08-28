package rw.data;

import java.lang.runtime.ObjectMethods;
import org.joml.Vector3i;

public record OlmIqkn() {
   public Vector3i f1000;
   public Vector3i f2000;

   OlmIqkn(Vector3i var1, Vector3i var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OlmIqkn,"min;max",OlmIqkn::f1000,OlmIqkn::f2000>(this, var1);
   }

   public Vector3i m4000() {
      return this.f2000;
   }

   public Vector3i m6000() {
      return this.f1000;
   }
}
