package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import rw.api.PermittedSubclassesX;
import rw.net.PacketBuf;

public non-sealed record Rec0047() implements PermittedSubclassesX {
   public List<Rec0256> f1000;

   public Rec0047(List<Rec0256> var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0047,"presets",Rec0047::f1000>(this, var1);
   }

   public void m4000(PacketBuf var1) {
      var1.m56000(this.f1000.size());

      for (Rec0256 var3 : this.f1000) {
         var3.m14000(var1);
      }
   }

   public static Rec0047 m8000(PacketBuf var0) {
      int var1 = var0.m94000();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(Rec0256.m12000(var0));
      }

      return new Rec0047(var2);
   }

   public List<Rec0256> m10000() {
      return this.f1000;
   }
}
