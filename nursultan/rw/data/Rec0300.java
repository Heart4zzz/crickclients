package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0663;
import rw.net.PacketBuf;

public non-sealed record Rec0300() implements Iface0663 {
   public int f1000;
   public long f2000;
   public long f3000;

   public long m2000() {
      return this.f3000;
   }

   public Rec0300(long var1, long var3, int var5) {
      this.f3000 = var1;
      this.f2000 = var3;
      this.f1000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0300,"presetId;expiresAtMillis;activationLimit",Rec0300::f3000,Rec0300::f2000,Rec0300::f1000>(this, var1);
   }

   public static Rec0300 m6000(PacketBuf var0) {
      return new Rec0300(var0.m8000(), var0.m8000(), var0.m94000());
   }

   public int m8000() {
      return this.f1000;
   }

   public void m10000(PacketBuf var1) {
      var1.m84000(this.f3000);
      var1.m84000(this.f2000);
      var1.m56000(this.f1000);
   }

   public long m12000() {
      return this.f2000;
   }
}
