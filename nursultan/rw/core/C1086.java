package rw.core;

import java.util.Comparator;
import java.util.stream.Stream;
import rw.api.Iface0606;
import rw.data.Rec0208;

public class C1086 extends C1013 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C1086(String var1, boolean var2, Iface0606 var3) {
      super(var1, var2);
      this.m2000();
      this.f1000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public int m8000(Stream<Rec0208> var1) {
      return var1.sorted(Comparator.comparingInt(var0 -> var0.m6000().I() ? 0 : 1)).filter(var1x -> {
         this.m2000();
         return ((Iface0606)this.f1000[0]).test(var1x.m6000());
      }).map(Rec0208::m4000).findFirst().orElse(-1);
   }
}
