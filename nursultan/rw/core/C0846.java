package rw.core;

import KDFzREm.NNBK;
import java.util.function.Consumer;
import rw.api.Iface0601;

public class C0846 extends C1013 implements Iface0601 {
   public Object[] f1000;

   public C0846(String var1, boolean var2, Iface0601 var3, Consumer<C1013> var4) {
      super(var1, var2, var4);
      this.m2000();
      this.f1000[0] = var3;
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m4000(NNBK var1, int var2, int var3, int var4) {
      this.m2000();
      ((Iface0601)this.f1000[0]).m2000(var1, var2, var3, var4);
   }
}
