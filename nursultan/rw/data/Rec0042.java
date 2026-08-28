package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0663;
import rw.net.PacketBuf;

public non-sealed record Rec0042() implements Iface0663 {
   public long f1000;

   public Rec0042(long var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0042,"presetId",Rec0042::f1000>(this, var1);
   }

   public static Rec0042 m4000(PacketBuf var0) {
      return new Rec0042(var0.m8000());
   }

   public long m6000() {
      return this.f1000;
   }

   public void m8000(PacketBuf var1) {
      var1.m84000(this.f1000);
   }
}
