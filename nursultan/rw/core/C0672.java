package rw.core;

import KDFzREm.NNNwS;
import java.util.function.Predicate;
import rw.NursultanClient;
import rw.api.Iface0606;

public class C0672 extends C1013 {
   public Object[] f1000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[2] = 0;
      }
   }

   public C0672(String var1, boolean var2, Predicate<NNNwS> var3, Iface0606 var4) {
      super(var1, var2);
      this.m4000();
      this.f1000[0] = var3;
      this.f1000[1] = var4;
   }

   static {
      ntfClinit();
   }

   public void m4000(int var1) {
      this.m4000();
      Integer var6 = NursultanClient.m74000().m10000() + var1;
      this.f1000[2] = var6;
   }

   public boolean m6000() {
      this.m4000();
      return (boolean)(NursultanClient.m74000().m10000() < this.f1000[2] ? 1 : 0);
   }
}
