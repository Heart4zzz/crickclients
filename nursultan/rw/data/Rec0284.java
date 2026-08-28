package rw.data;

import java.lang.runtime.ObjectMethods;
import org.joml.Vector2f;

public record Rec0284() {
   public boolean f1000;
   public Vector2f f2000;

   public Rec0284(Vector2f var1, boolean var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0284,"pos;inFront",Rec0284::f2000,Rec0284::f1000>(this, var1);
   }

   public boolean m4000() {
      return this.f1000;
   }

   public Vector2f m6000() {
      return this.f2000;
   }
}
