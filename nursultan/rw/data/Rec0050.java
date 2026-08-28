package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0031;
import rw.net.PacketBuf;

public non-sealed record Rec0050() implements Iface0031 {
   public long f1000;
   public int f2000;

   public Rec0050(long var1, int var3) {
      this.f1000 = var1;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0050,"presetId;errorCode",Rec0050::f1000,Rec0050::f2000>(this, var1);
   }

   public long m4000() {
      return this.f1000;
   }

   public static Rec0050 m6000(PacketBuf var0) {
      return new Rec0050(var0.m8000(), var0.m94000());
   }

   public void m8000(PacketBuf var1) {
      var1.m84000(this.f1000);
      var1.m56000(this.f2000);
   }

   public int m10000() {
      return this.f2000;
   }
}
