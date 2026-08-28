package rw.core;

import java.util.function.Supplier;
import rw.api.Iface0029;
import rw.net.IlpOks;
import rw.net.PacketHandlers;

public class C1166 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C1166(Supplier<IlpOks> var1) {
      this.m2000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public void m12000(PacketHandlers<Iface0029> var1) {
      IlpOks var2 = (IlpOks)((Supplier)this.f1000[0]).get();
      if (var2 != null && var2.m42000()) {
         var2.m58000(var1);
      }
   }
}
