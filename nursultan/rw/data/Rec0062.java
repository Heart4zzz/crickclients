package rw.data;

import KDFzREm.NCU;

record Rec0062() {
   private final NCU f1000;
   private final NCU f2000;

   Rec0062(NCU var1, NCU var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public boolean m2000(Object var1) {
      return var1 instanceof Rec0062 var2 && this.f1000 == var2.f1000 && this.f2000 == var2.f2000;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this.f1000) * 31 + System.identityHashCode(this.f2000);
   }

   public NCU m4000() {
      return this.f2000;
   }

   public NCU m6000() {
      return this.f1000;
   }
}
