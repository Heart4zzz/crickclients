package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0031;
import rw.net.PacketBuf;

public non-sealed record Rec0057() implements Iface0031 {
   public long f1000;

   public Rec0057(long var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0057,"presetId",Rec0057::f1000>(this, var1);
   }

   public static Rec0057 m4000(PacketBuf var0) {
      return new Rec0057(var0.m8000());
   }

   public void m6000(PacketBuf var1) {
      var1.m84000(this.f1000);
   }

   public long m8000() {
      return this.f1000;
   }
}
