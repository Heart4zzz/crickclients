package rw.data;

import KDFzREm.NNNEB;
import KDFzREm.NRd;
import KDFzREm.NhL;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record Rec0162() implements NRd {
   private final int f1000;
   private final int f2000;

   public int m2000() {
      return this.f2000;
   }

   public Rec0162(int var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0162,"bitsInMemory;bitsInStorage",Rec0162::f1000,Rec0162::f2000>(this, var1);
   }

   public int m6000() {
      return this.f1000;
   }

   public boolean m8000() {
      return true;
   }

   public <T> NhL<T> m10000(NNNEB<T> var1, List<T> var2) {
      return var1.L();
   }
}
