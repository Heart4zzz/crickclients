package rw.core;

import KDFzREm.NbK;
import java.util.function.Predicate;

public class C1149<T extends NbK> extends C1013 implements Predicate<T> {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C1149(Predicate<T> var1, String var2, boolean var3) {
      super(var2, var3);
      this.m2000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(T var1) {
      this.m2000();
      return (boolean)(!this.U() ? 0 : ((Predicate)this.f1000[0]).test(var1));
   }
}
