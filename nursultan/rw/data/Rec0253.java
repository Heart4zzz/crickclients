package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import rw.net.PacketBuf;

public record Rec0253() {
   private static byte[] f1000;
   public boolean f2000;
   public byte[] f3000;
   public int f4000;
   public int f5000;
   public long f6000;
   public UUID f7000;
   public long f8000;
   public long f9000;
   private static boolean[] f10000;

   public int m2000() {
      return this.f4000;
   }

   public long m4000() {
      return this.f8000;
   }

   public Rec0253(long var1, UUID var3, byte[] var4, long var5, int var7, int var8, long var9, boolean var11) {
      this.f9000 = var1;
      this.f7000 = var3;
      this.f3000 = var4;
      this.f6000 = var5;
      this.f5000 = var7;
      this.f4000 = var8;
      this.f8000 = var9;
      this.f2000 = var11;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0253,"presetId;presetClientId;token;expiresAtMillis;activationLimit;activationCount;createdAtMillis;stale",Rec0253::f9000,Rec0253::f7000,Rec0253::f3000,Rec0253::f6000,Rec0253::f5000,Rec0253::f4000,Rec0253::f8000,Rec0253::f2000>(
         this, var1
      );
   }

   public long m8000() {
      return this.f9000;
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f10000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public int m12000() {
      return this.f5000;
   }

   private static void m14000() {
      byte[] var128 = new byte[3];
      f1000[(0 | -0) >>> 31] = 64;
      f1000[(1 | -1) >>> 31] = 16;
      f1000[2] = 16;
   }

   public byte[] m16000() {
      return this.f3000;
   }

   public long m18000() {
      return this.f6000;
   }

   public void m22000(PacketBuf var1) {
      var1.m84000(this.f9000);
      var1.m78000(this.f7000);
      var1.m74000(this.f3000);
      var1.m84000(this.f6000);
      var1.m56000(this.f5000);
      var1.m56000(this.f4000);
      var1.m84000(this.f8000);
      if (var1.m42000() >= f1000[2]) {
         var1.m62000(this.f2000);
      }
   }

   public boolean m24000() {
      return this.f2000;
   }

   public static Rec0253 m28000(PacketBuf var0) {
      return new Rec0253(
         var0.m8000(),
         var0.m40000(),
         var0.m46000(f1000[0]),
         var0.m8000(),
         var0.m94000(),
         var0.m94000(),
         var0.m8000(),
         var0.m42000() >= f1000[1] && var0.m16000() ? f10000[0] : f10000[1]
      );
   }

   public UUID m30000() {
      return this.f7000;
   }
}
