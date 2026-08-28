package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0088;

public record Rec0215() {
   public Enum0088 f1000;

   public Rec0215(Enum0088 var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0215,"sound",Rec0215::f1000>(this, var1);
   }

   public Enum0088 m4000() {
      return this.f1000;
   }
}
