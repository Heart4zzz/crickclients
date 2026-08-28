package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import rw.api.Iface0664;
import rw.net.PacketBuf;

public non-sealed record Rec0295() implements Iface0664 {
   public int f1000;
   public String f2000;
   public UUID f3000;
   public byte[] f4000;
   private static int[] f5000;

   public byte[] m2000() {
      return this.f4000;
   }

   public Rec0295(UUID var1, int var2, String var3, byte[] var4) {
      this.f3000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
      this.f4000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0295,"clientId;formatVersion;name;data",Rec0295::f3000,Rec0295::f1000,Rec0295::f2000,Rec0295::f4000>(
         this, var1
      );
   }

   private static void m6000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 1048576;
   }

   public UUID m8000() {
      return this.f3000;
   }

   public String m10000() {
      return this.f2000;
   }

   public static Rec0295 m12000(PacketBuf var0) {
      return new Rec0295(var0.m40000(), var0.m94000(), var0.m10000(), var0.m46000(f5000[0]));
   }

   public int m14000() {
      return this.f1000;
   }

   public void m16000(PacketBuf var1) {
      var1.m78000(this.f3000);
      var1.m56000(this.f1000);
      var1.m70000(this.f2000);
      var1.m74000(this.f4000);
   }
}
