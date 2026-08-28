package rw.core;

import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.Neo;
import com.google.common.collect.AbstractIterator;

class C0620 extends AbstractIterator<Neo> {
   private final Nef[] f1000;
   private final Neo f2000;
   private final int f3000;
   private int f4000;
   private int f5000;
   private int f6000;
   private int f7000;
   private int f8000;
   private int f9000;

   C0620(Nef var1, Nef var2, Ned var3, int var4) {
      this.f10000 = var1;
      this.f11000 = var2;
      this.f12000 = var3;
      this.f13000 = var4;
      this.f1000 = new Nef[]{this.f10000, this.f11000, this.f10000.b(), this.f11000.b()};
      this.f2000 = this.f12000.method_25503().N(this.f11000);
      this.f3000 = 4 * this.f13000;
      this.f4000 = -1;
      this.f7000 = this.f2000.method_10263();
      this.f8000 = this.f2000.method_10264();
      this.f9000 = this.f2000.method_10260();
   }

   protected Neo m2000() {
      this.f2000.N(this.f7000, this.f8000, this.f9000).N(this.f1000[(this.f4000 + 4) % 4]);
      this.f7000 = this.f2000.method_10263();
      this.f8000 = this.f2000.method_10264();
      this.f9000 = this.f2000.method_10260();
      if (this.f6000 >= this.f5000) {
         if (this.f4000 >= this.f3000) {
            return (Neo)this.endOfData();
         }

         this.f4000++;
         this.f6000 = 0;
         this.f5000 = this.f4000 / 2 + 1;
      }

      this.f6000++;
      return this.f2000;
   }
}
