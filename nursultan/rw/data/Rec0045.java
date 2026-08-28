package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import rw.api.PermittedSubclasses;
import rw.net.PacketBuf;

public non-sealed record Rec0045() implements PermittedSubclasses {
   public List<Rec0168> f1000;

   public Rec0045(List<Rec0168> var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0045,"entries",Rec0045::f1000>(this, var1);
   }

   public static Rec0045 m4000(PacketBuf var0) {
      int var1 = var0.m94000();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(Rec0168.m6000(var0));
      }

      return new Rec0045(var2);
   }

   public List<Rec0168> m10000() {
      return this.f1000;
   }

   public void m12000(PacketBuf var1) {
      var1.m56000(this.f1000.size());

      for (Rec0168 var3 : this.f1000) {
         var3.m10000(var1);
      }
   }
}
