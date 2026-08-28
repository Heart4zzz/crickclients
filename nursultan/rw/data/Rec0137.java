package rw.data;

import KDFzREm.NNNOG;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;

public record Rec0137() implements NNNOG {
   private final Path f1000;

   public Rec0137(Path var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0137,"contents",Rec0137::f1000>(this, var1);
   }

   public Path m4000() {
      return this.f1000;
   }
}
