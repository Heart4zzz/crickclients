package rw.core;

import KDFzREm.NGD;
import KDFzREm.NNGw;
import KDFzREm.NNTs;
import KDFzREm.Nbp;
import KDFzREm.NjD;
import KDFzREm.NjL;
import KDFzREm.Njx;
import java.util.EnumSet;

public class C0529 extends Njx {
   private final NNTs f1000;
   private final float f2000;
   public final NNGw f3000 = NNGw.y().N(8.0).u().i();

   public void m2000() {
      super.L();
      this.f1000.f().W();

      for (NNTs var3 : N(this.f1000).N(NNTs.class, this.f3000, this.f1000, this.f1000.method_5829().L(8.0, 8.0, 8.0))) {
         var3.y(this.f1000.T());
      }
   }

   public C0529(NGD var1, float var2) {
      this.f1000 = var1;
      this.f2000 = var2 * var2;
      this.N(EnumSet.of(NjD.field_18405, NjD.field_18406));
   }

   public boolean m4000() {
      return true;
   }

   public void m6000() {
      NjL var1 = this.f1000.T();
      if (var1 != null) {
         if (this.f1000.method_5858(var1) > this.f2000) {
            this.f1000.p().N(var1, 30.0F, 30.0F);
            if (NNTs.u(this.f1000).y(50) == 0) {
               this.f1000.D();
            }
         } else {
            this.f1000.R(true);
         }

         super.i();
      }
   }

   public void m8000() {
      super.u();
      NjL var1 = this.f1000.T();
      if (var1 != null) {
         for (NNTs var4 : N(this.f1000).N(NNTs.class, this.f3000, this.f1000, this.f1000.method_5829().L(8.0, 8.0, 8.0))) {
            var4.y(var1);
            var4.R(true);
         }

         this.f1000.R(true);
      }
   }

   public boolean m10000() {
      NjL var1 = this.f1000.method_6065();
      return this.f1000.K() == null && NNTs.L(this.f1000) && this.f1000.T() != null && !this.f1000.Nl() && (var1 == null || var1.method_5864() != Nbp.Ly);
   }
}
