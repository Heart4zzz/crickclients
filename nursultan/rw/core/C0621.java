package rw.core;

import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.Neo;
import com.google.common.collect.AbstractIterator;

class C0621 extends AbstractIterator<Ned> {
   private final Neo f1000;
   private int f2000;
   private int f3000;
   private int f4000;
   private boolean f5000;
   private final int f6000;
   private final int f7000;
   private final int f8000;
   private final int f9000;
   private final int f10000;
   private final int f11000;
   private final int f12000;
   private final int f13000;
   private final int f14000;

   C0621(Nef var1, Nef var2, Nef var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.f15000 = var1;
      this.f16000 = var2;
      this.f17000 = var3;
      this.f18000 = var4;
      this.f19000 = var5;
      this.f20000 = var6;
      this.f21000 = var7;
      this.f22000 = var8;
      this.f23000 = var9;
      this.f1000 = new Neo();
      this.f6000 = this.f15000.P();
      this.f7000 = this.f15000.s();
      this.f8000 = this.f15000.T();
      this.f9000 = this.f16000.P();
      this.f10000 = this.f16000.s();
      this.f11000 = this.f16000.T();
      this.f12000 = this.f17000.P();
      this.f13000 = this.f17000.s();
      this.f14000 = this.f17000.T();
   }

   protected Ned m2000() {
      if (this.f5000) {
         return (Ned)this.endOfData();
      } else {
         this.f1000
            .N(
               this.f18000 + this.f6000 * this.f2000 + this.f9000 * this.f3000 + this.f12000 * this.f4000,
               this.f19000 + this.f7000 * this.f2000 + this.f10000 * this.f3000 + this.f13000 * this.f4000,
               this.f20000 + this.f8000 * this.f2000 + this.f11000 * this.f3000 + this.f14000 * this.f4000
            );
         if (this.f4000 < this.f21000) {
            this.f4000++;
         } else if (this.f3000 < this.f22000) {
            this.f3000++;
            this.f4000 = 0;
         } else if (this.f2000 < this.f23000) {
            this.f2000++;
            this.f4000 = 0;
            this.f3000 = 0;
         } else {
            this.f5000 = true;
         }

         return this.f1000;
      }
   }
}
