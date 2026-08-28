package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0031;
import rw.net.PacketBuf;

public non-sealed record Rec0046() implements Iface0031 {
   public Rec0253 f1000;

   public Rec0046(Rec0253 var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0046,"share",Rec0046::f1000>(this, var1);
   }

   public static Rec0046 m4000(PacketBuf var0) {
      return new Rec0046(Rec0253.m28000(var0));
   }

   public void m6000(PacketBuf var1) {
      this.f1000.m22000(var1);
   }

   public Rec0253 m8000() {
      return this.f1000;
   }
}
