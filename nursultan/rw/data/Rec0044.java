package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.PermittedSubclasses;
import rw.net.PacketBuf;

public non-sealed record Rec0044() implements PermittedSubclasses {
   public int f1000;
   public int f2000;

   public Rec0044(int var1, int var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0044,"kindId;errorCode",Rec0044::f2000,Rec0044::f1000>(this, var1);
   }

   public int m4000() {
      return this.f2000;
   }

   public static Rec0044 m6000(PacketBuf var0) {
      return new Rec0044(var0.m94000(), var0.m94000());
   }

   public void m8000(PacketBuf var1) {
      var1.m56000(this.f2000);
      var1.m56000(this.f1000);
   }

   public int m10000() {
      return this.f1000;
   }
}
