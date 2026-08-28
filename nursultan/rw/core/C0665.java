package rw.core;

import KDFzREm.NNGw;
import KDFzREm.NjD;
import KDFzREm.NjL;
import KDFzREm.Njb;
import KDFzREm.NvD;
import java.util.EnumSet;

public class C0665 extends NvD {
   private final Njb f1000;
   private NjL f2000;
   private int f3000;

   public void m2000() {
      this.i.y(this.f2000);
      NjL var1 = this.f1000.L_();
      if (var1 != null) {
         this.f3000 = var1.method_6083();
      }

      super.L();
   }

   public C0665(Njb var1) {
      super(var1, false);
      this.f1000 = var1;
      this.N(EnumSet.of(NjD.field_18408));
   }

   public boolean m4000() {
      if (this.f1000.NQ() && !this.f1000.NJ()) {
         NjL var1 = this.f1000.L_();
         if (var1 == null) {
            return false;
         } else {
            this.f2000 = var1.method_6052();
            int var2 = var1.method_6083();
            return var2 != this.f3000 && this.N(this.f2000, NNGw.N) && this.f1000.N(this.f2000, var1);
         }
      } else {
         return false;
      }
   }
}
