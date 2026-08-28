package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.PermittedSubclassesX;
import rw.net.PacketBuf;

public non-sealed record Rec0041() implements PermittedSubclassesX {
   private static int[] f1000;
   public int f2000;
   public Rec0256 f3000;
   public byte[] f4000;

   public byte[] m2000() {
      return this.f4000;
   }

   public Rec0041(Rec0256 var1, int var2, byte[] var3) {
      this.f3000 = var1;
      this.f2000 = var2;
      this.f4000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0041,"preset;formatVersion;data",Rec0041::f3000,Rec0041::f2000,Rec0041::f4000>(this, var1);
   }

   private static void m6000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 1048576;
   }

   public void m8000(PacketBuf var1) {
      this.f3000.m14000(var1);
      var1.m56000(this.f2000);
      var1.m74000(this.f4000);
   }

   public int m10000() {
      return this.f2000;
   }

   public static Rec0041 m12000(PacketBuf var0) {
      return new Rec0041(Rec0256.m12000(var0), var0.m94000(), var0.m46000(f1000[0]));
   }

   public Rec0256 m14000() {
      return this.f3000;
   }
}
