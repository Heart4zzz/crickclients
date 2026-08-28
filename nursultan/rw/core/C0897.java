package rw.core;

import KDFzREm.AP;
import KDFzREm.Af;
import KDFzREm.Ar;
import KDFzREm.Ax;
import KDFzREm.NNRc;
import KDFzREm.NNWE;
import KDFzREm.NXi;
import KDFzREm.NjL;

public class C0897 implements Ar {
   private final NjL f1000;
   private final Af f2000;
   private final NNRc f3000;
   private float f4000;

   public void m2000() {
      this.f3000.field_13987.method_14364(AP.N(this.f1000.method_5667(), this.f2000, this.f4000));
   }

   public C0897(NjL var1, Af var2, NNRc var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      NXi var4 = var3.method_73189().u(var1.method_73189()).U();
      this.f4000 = (float)NNWE.u(var4.L(), var4.N());
   }

   public void m4000() {
      NXi var1 = this.f3000.method_73189().u(this.f1000.method_73189()).U();
      float var2 = (float)NNWE.u(var1.L(), var1.N());
      if (NNWE.L(var2 - this.f4000) > 0.008726646F) {
         this.f3000.field_13987.method_14364(AP.y(this.f1000.method_5667(), this.f2000, var2));
         this.f4000 = var2;
      }
   }

   public void m6000() {
      this.f3000.field_13987.method_14364(AP.N(this.f1000.method_5667()));
   }

   public boolean m8000() {
      return Ax.N(this.f1000, this.f3000) || Ax.N(this.f1000.method_31476(), this.f3000) || !Ax.y(this.f1000, this.f3000);
   }
}
