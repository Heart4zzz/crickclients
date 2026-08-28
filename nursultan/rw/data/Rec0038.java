package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0031;
import rw.defs.Enum0083;
import rw.net.PacketBuf;

public non-sealed record Rec0038() implements Iface0031 {
   public int f1000;
   private static short[] f2000;
   private static byte[] f3000;
   public String f4000;
   public String f5000;

   public int m2000() {
      return this.f1000;
   }

   public Rec0038(int var1, String var2, String var3) {
      this.f1000 = var1;
      this.f4000 = var2;
      this.f5000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0038,"outcome;presetName;creator",Rec0038::f1000,Rec0038::f4000,Rec0038::f5000>(this, var1);
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 16;
   }

   private static void m8000() {
      short[] var128 = new short[2];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
   }

   public String m10000() {
      return this.f5000;
   }

   public static Rec0038 m14000(PacketBuf var0) {
      return new Rec0038(var0.m94000(), var0.m10000(), var0.m10000());
   }

   private int m16000(short var1) {
      return var1 < f3000[0] && this.f1000 == ((Enum0083)Enum0083.f1000[f2000[0]]).m30000() ? ((Enum0083)Enum0083.f1000[f2000[1]]).m30000() : this.f1000;
   }

   public String m18000() {
      return this.f4000;
   }

   public void m22000(PacketBuf var1) {
      var1.m56000(this.m16000(var1.m42000()));
      var1.m70000(this.f4000);
      var1.m70000(this.f5000);
   }
}
