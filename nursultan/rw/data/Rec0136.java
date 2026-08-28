package rw.data;

import KDFzREm.NNNOQ;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record Rec0136<T>() {
   private final NNNOQ<T> f1000;
   private final T f2000;

   public Rec0136(NNNOQ<T> var1, T var2) {
      this.f1000 = var1;
      this.f2000 = (T)var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0136,"type;value",Rec0136::f1000,Rec0136::f2000>(this, var1);
   }

   public T m4000() {
      return this.f2000;
   }

   public NNNOQ<T> m6000() {
      return this.f1000;
   }

   public <U> Optional<U> m8000(NNNOQ<U> var1) {
      return var1 == this.f1000 ? Optional.of(this.f2000) : Optional.empty();
   }
}
