package rw.data;

import KDFzREm.NNNxM;
import java.lang.runtime.ObjectMethods;

public record Rec0154() implements NNNxM {
   private final String f1000;
   private final int f2000;

   public Rec0154(String var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public String m2000() {
      return "." + this.f1000 + "[" + this.f2000 + "]";
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0154,"name;index",Rec0154::f1000,Rec0154::f2000>(this, var1);
   }

   public int m6000() {
      return this.f2000;
   }

   public String m8000() {
      return this.f1000;
   }
}
