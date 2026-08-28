package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.PermittedSubclasses;
import rw.net.PacketBuf;

public non-sealed record Rec0051() implements PermittedSubclasses {
   public int f1000;
   public long f2000;

   public Rec0051(int var1, long var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0051,"kindId;updatedAt",Rec0051::f1000,Rec0051::f2000>(this, var1);
   }

   public int m4000() {
      return this.f1000;
   }

   public static Rec0051 m6000(PacketBuf var0) {
      return new Rec0051(var0.m94000(), var0.m8000());
   }

   public void m8000(PacketBuf var1) {
      var1.m56000(this.f1000);
      var1.m84000(this.f2000);
   }

   public long m10000() {
      return this.f2000;
   }
}
