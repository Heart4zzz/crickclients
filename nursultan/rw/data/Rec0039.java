package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import rw.api.Iface0031;
import rw.net.PacketBuf;

public non-sealed record Rec0039() implements Iface0031 {
   public List<Rec0253> f1000;

   public Rec0039(List<Rec0253> var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0039,"shares",Rec0039::f1000>(this, var1);
   }

   public static Rec0039 m4000(PacketBuf var0) {
      int var1 = var0.m94000();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(Rec0253.m28000(var0));
      }

      return new Rec0039(var2);
   }

   public void m8000(PacketBuf var1) {
      var1.m56000(this.f1000.size());

      for (Rec0253 var3 : this.f1000) {
         var3.m22000(var1);
      }
   }

   public List<Rec0253> m10000() {
      return this.f1000;
   }
}
