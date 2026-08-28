package rw.data;

import KDFzREm.NCa;
import KDFzREm.NNNts;
import KDFzREm.Ned;
import KDFzREm.Nef;
import KDFzREm.NgS;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import rw.api.Iface0364;

record Rec0147() implements Iface0364 {
   private final Nef f1000;
   private final NCa f2000;
   private final Ned f3000;
   private final Ned f4000;
   private final int f5000;
   private final int f6000;

   public Ned m2000() {
      return this.f3000;
   }

   Rec0147(Nef var1, NCa var2, Ned var3, Ned var4, int var5, int var6) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0147,"direction;neighborState;pos;neighborPos;updateFlags;updateLimit",Rec0147::f1000,Rec0147::f2000,Rec0147::f3000,Rec0147::f4000,Rec0147::f5000,Rec0147::f6000>(
         this, var1
      );
   }

   public int m6000() {
      return this.f5000;
   }

   public Ned m8000() {
      return this.f4000;
   }

   public NCa m10000() {
      return this.f2000;
   }

   public boolean m12000(NgS var1) {
      NNNts.N(var1, this.f1000, this.f3000, this.f4000, this.f2000, this.f5000, this.f6000);
      return false;
   }

   public void m14000(Consumer<Ned> var1) {
      var1.accept(this.f3000);
   }

   public Nef m16000() {
      return this.f1000;
   }

   public int m18000() {
      return this.f6000;
   }
}
