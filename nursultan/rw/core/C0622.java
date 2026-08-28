package rw.core;

import KDFzREm.NNrm;
import KDFzREm.Ned;
import KDFzREm.Neo;
import com.google.common.collect.AbstractIterator;

class C0622 extends AbstractIterator<Ned> {
   final Neo f1000;
   int f2000;

   C0622(int var1, int var2, NNrm var3, int var4, int var5, int var6, int var7, int var8) {
      this.f3000 = var1;
      this.f4000 = var2;
      this.f5000 = var3;
      this.f6000 = var4;
      this.f7000 = var5;
      this.f8000 = var6;
      this.f9000 = var7;
      this.f10000 = var8;
      this.f1000 = new Neo();
      this.f2000 = this.f3000;
   }

   protected Ned m2000() {
      if (this.f2000 <= 0) {
         return (Ned)this.endOfData();
      } else {
         Neo var1 = this.f1000.N(this.f4000 + this.f5000.y(this.f6000), this.f7000 + this.f5000.y(this.f8000), this.f9000 + this.f5000.y(this.f10000));
         this.f2000--;
         return var1;
      }
   }
}
