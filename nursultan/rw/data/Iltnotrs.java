package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.PermittedSubclasses;
import rw.net.PacketBuf;

public non-sealed record Iltnotrs() implements PermittedSubclasses {
   public int f1000;
   private static int[] f2000;
   public long f3000;
   public byte[] f4000;

   public long m2000() {
      return this.f3000;
   }

   public Iltnotrs(int var1, long var2, byte[] var4) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f4000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Iltnotrs,"kindId;updatedAt;data",Iltnotrs::f1000,Iltnotrs::f3000,Iltnotrs::f4000>(this, var1);
   }

   private static void m6000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 262144;
   }

   public static Iltnotrs m8000(PacketBuf var0) {
      return new Iltnotrs(var0.m94000(), var0.m8000(), var0.m46000(f2000[0]));
   }

   public int m10000() {
      return this.f1000;
   }

   public void m14000(PacketBuf var1) {
      var1.m56000(this.f1000);
      var1.m84000(this.f3000);
      var1.m74000(this.f4000);
   }

   public byte[] m16000() {
      return this.f4000;
   }
}
