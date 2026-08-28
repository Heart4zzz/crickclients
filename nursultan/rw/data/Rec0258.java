package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import rw.api.Iface0196;
import rw.core.C1013;

public record Rec0258() {
   public List<? extends C1013> f1000;
   public C1013 f2000;
   public Consumer<C1013> f3000;
   public Iface0196<Boolean> f4000;

   public List<? extends C1013> m2000() {
      return this.f1000;
   }

   public Rec0258(List<? extends C1013> var1, C1013 var2, Iface0196<Boolean> var3, Consumer<C1013> var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f4000 = var3;
      this.f3000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0258,"entries;selected;opened;onSelect",Rec0258::f1000,Rec0258::f2000,Rec0258::f4000,Rec0258::f3000>(
         this, var1
      );
   }

   public Iface0196<Boolean> m6000() {
      return this.f4000;
   }

   public Consumer<C1013> m8000() {
      return this.f3000;
   }

   public C1013 m10000() {
      return this.f2000;
   }
}
