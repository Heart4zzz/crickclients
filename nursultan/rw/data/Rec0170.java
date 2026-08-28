package rw.data;

import KDFzREm.NuX;
import KDFzREm.Nuf;
import KDFzREm.Nuq;
import java.lang.runtime.ObjectMethods;

public record Rec0170() implements Nuq<Void, Void> {
   private final Nuf<Void, Void> f1000;
   private final NuX f2000;

   public Rec0170(Nuf<Void, Void> var1, NuX var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0170,"info;attributes",Rec0170::f1000,Rec0170::f2000>(this, var1);
   }

   public NuX m4000() {
      return this.f2000;
   }

   public Nuf<Void, Void> m6000() {
      return this.f1000;
   }
}
