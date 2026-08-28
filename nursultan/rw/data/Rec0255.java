package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import rw.api.Iface0651;

public record Rec0255() {
   public Consumer<Object>[] f1000;
   public Iface0651[] f2000;

   Rec0255(Iface0651[] var1, Consumer<Object>[] var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0255,"handlers;invokers",Rec0255::f2000,Rec0255::f1000>(this, var1);
   }

   public Iface0651[] m4000() {
      return this.f2000;
   }

   public Consumer<Object>[] m6000() {
      return this.f1000;
   }
}
