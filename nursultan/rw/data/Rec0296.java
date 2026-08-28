package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0665;
import rw.net.PacketBuf;

public non-sealed record Rec0296() implements Iface0665 {
   private static int[] f1000;
   public byte[] f2000;
   public int f3000;

   private static void m2000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 262144;
   }

   public Rec0296(int var1, byte[] var2) {
      this.f3000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0296,"kindId;data",Rec0296::f3000,Rec0296::f2000>(this, var1);
   }

   public static Rec0296 m6000(PacketBuf var0) {
      return new Rec0296(var0.m94000(), var0.m46000(f1000[0]));
   }

   public int m8000() {
      return this.f3000;
   }

   public void m10000(PacketBuf var1) {
      var1.m56000(this.f3000);
      var1.m74000(this.f2000);
   }

   public byte[] m14000() {
      return this.f2000;
   }
}
