package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0031;
import rw.net.PacketBuf;

public non-sealed record Rec0055() implements Iface0031 {
   public Rec0253 f1000;

   public Rec0055(Rec0253 var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0055,"share",Rec0055::f1000>(this, var1);
   }

   public static Rec0055 m4000(PacketBuf var0) {
      return new Rec0055(Rec0253.m28000(var0));
   }

   public Rec0253 m6000() {
      return this.f1000;
   }

   public void m8000(PacketBuf var1) {
      this.f1000.m22000(var1);
   }
}
