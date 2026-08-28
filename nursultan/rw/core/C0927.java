package rw.core;

import KDFzREm.NNUB;
import java.util.function.Predicate;
import rw.module.Particles;

public class C0927 extends C1013 implements Predicate<Particles> {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C0927(String var1, boolean var2, NNUB... var3) {
      super(var1, var2);
      this.m2000();
      this.f1000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Particles var1) {
      this.m2000();

      for (NNUB var5 : (NNUB[])this.f1000[0]) {
         if (var1.m14000() == var5) {
            return (boolean)1;
         }
      }

      return (boolean)0;
   }
}
