package rw.core;

import KDFzREm.NNuU;
import java.util.function.Consumer;

public class BvBn<T> extends C1013 {
   public Object[] f1000;

   public BvBn(T var1, String var2, boolean var3, Consumer<C1013> var4) {
      super(var2, var3, var4);
      this.m2000();
      NNuU var9 = NNuU.Nq();
      this.f1000[0] = var9;
      this.f1000[1] = var1;
   }

   public BvBn(T var1, String var2, boolean var3) {
      super(var2, var3);
      this.m2000();
      NNuU var8 = NNuU.Nq();
      this.f1000[0] = var8;
      this.f1000[1] = var1;
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }
}
