package rw.data;

import KDFzREm.NXi;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record Rec0167() {
   final NXi f1000;
   final NXi f2000;
   private final Optional<NXi> f3000;

   public Optional<NXi> m2000() {
      return this.f3000;
   }

   public Rec0167(NXi var1, NXi var2, NXi var3) {
      this(var1, var2, Optional.of(var3));
   }

   public Rec0167(NXi var1, NXi var2, Optional<NXi> var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public Rec0167(NXi var1, NXi var2) {
      this(var1, var2, Optional.empty());
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0167,"from;to;axisDependentOriginalMovement",Rec0167::f1000,Rec0167::f2000,Rec0167::f3000>(this, var1);
   }

   public NXi m6000() {
      return this.f2000;
   }

   public NXi m8000() {
      return this.f1000;
   }
}
