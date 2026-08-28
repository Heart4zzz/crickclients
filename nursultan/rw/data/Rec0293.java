package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0665;
import rw.net.PacketBuf;

public non-sealed record Rec0293() implements Iface0665 {
   public int f1000;

   public Rec0293(int var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0293,"kindId",Rec0293::f1000>(this, var1);
   }

   public static Rec0293 m4000(PacketBuf var0) {
      return new Rec0293(var0.m94000());
   }

   public int m6000() {
      return this.f1000;
   }

   public void m8000(PacketBuf var1) {
      var1.m56000(this.f1000);
   }
}
