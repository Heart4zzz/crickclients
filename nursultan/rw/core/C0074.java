package rw.core;

import KDFzREm.FJ;
import KDFzREm.FY;
import KDFzREm.Fo;
import KDFzREm.NQo;
import org.jspecify.annotations.Nullable;

public class C0074 implements FY {
   private final FJ f1000;
   @Nullable
   private NQo f2000 = null;
   @Nullable
   private Fo f3000 = null;

   public C0074(FJ var1) {
      this.f1000 = var1;
   }

   public boolean m2000(NQo var1) {
      if (this.f2000 != null) {
         return NQo.N(this.f2000, var1);
      } else if (this.f3000 != null && this.f3000.N(var1, this.f1000)) {
         this.f2000 = var1.t();
         return true;
      } else {
         return false;
      }
   }

   public void m4000(C0074 var1) {
      this.f2000 = var1.f2000;
      this.f3000 = var1.f3000;
   }

   public void m6000(Fo var1) {
      this.f2000 = null;
      this.f3000 = var1;
   }

   public void m8000(NQo var1) {
      this.f2000 = var1.t();
      this.f3000 = null;
   }
}
