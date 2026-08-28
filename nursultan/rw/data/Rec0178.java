package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0672;
import rw.core.C0983;

public record Rec0178() {
   public C0672 f1000;
   public int f2000;
   public int f3000;
   public C0983 f4000;

   public int m2000() {
      return this.f3000;
   }

   Rec0178(int var1, C0983 var2, C0672 var3, int var4) {
      this.f2000 = var1;
      this.f4000 = var2;
      this.f1000 = var3;
      this.f3000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0178,"slot;rotation;entry;commitTick",Rec0178::f2000,Rec0178::f4000,Rec0178::f1000,Rec0178::f3000>(this, var1);
   }

   public int m6000() {
      return this.f2000;
   }

   public C0983 m8000() {
      return this.f4000;
   }

   public C0672 m10000() {
      return this.f1000;
   }
}
