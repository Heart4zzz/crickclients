package rw.core;

import KDFzREm.AP;
import KDFzREm.Af;
import KDFzREm.Ax;
import KDFzREm.NNRc;
import KDFzREm.Ngq;
import KDFzREm.NjL;
import rw.api.Iface0002;

public class C0896 implements Iface0002 {
   private final NjL f1000;
   private final Af f2000;
   private final NNRc f3000;
   private Ngq f4000;

   public void m2000() {
      this.f3000.field_13987.method_14364(AP.N(this.f1000.method_5667(), this.f2000, this.f4000));
   }

   public C0896(NjL var1, Af var2, NNRc var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var1.method_31476();
   }

   public void m4000() {
      Ngq var1 = this.f1000.method_31476();
      if (var1.N(this.f4000) > 0) {
         this.f3000.field_13987.method_14364(AP.y(this.f1000.method_5667(), this.f2000, var1));
         this.f4000 = var1;
      }
   }

   public void m6000() {
      this.f3000.field_13987.method_14364(AP.N(this.f1000.method_5667()));
   }

   public boolean m8000() {
      return !Iface0002.super.m2000() && !Ax.N(this.f1000, this.f3000) ? Ax.N(this.f4000, this.f3000) : true;
   }

   public int m10000() {
      return this.f4000.N(this.f1000.method_31476());
   }
}
