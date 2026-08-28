package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0663;
import rw.net.PacketBuf;

public non-sealed record OlIpmir() implements Iface0663 {
   private static byte[] f1000;
   public byte[] f2000;

   public OlIpmir(byte[] var1) {
      this.f2000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OlIpmir,"token",OlIpmir::f2000>(this, var1);
   }

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 64;
   }

   public static OlIpmir m6000(PacketBuf var0) {
      return new OlIpmir(var0.m46000(f1000[0]));
   }

   public void m10000(PacketBuf var1) {
      var1.m74000(this.f2000);
   }

   public byte[] m12000() {
      return this.f2000;
   }
}
