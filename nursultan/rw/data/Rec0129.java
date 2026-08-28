package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0368;
import rw.core.C0373;
import rw.defs.Enum0037;

public record Rec0129() {
   private final Enum0037 f1000;
   private final C0368 f2000;
   private final C0373 f3000;

   public C0373 m2000() {
      return this.f3000;
   }

   public Rec0129(Enum0037 var1, C0368 var2, C0373 var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0129,"state;slot;patch",Rec0129::f1000,Rec0129::f2000,Rec0129::f3000>(this, var1);
   }

   public C0368 m6000() {
      return this.f2000;
   }

   public Enum0037 m8000() {
      return this.f1000;
   }
}
