package rw.core;

import java.util.UUID;

public class IliIjtsr {
   public Object[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;

   private static void m4000() {
      short[] var128 = new short[6];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((1 | -1) >>> 31);
   }

   public IliIjtsr(UUID var1, boolean var2) {
      this.m6000();
      this.f1000[f2000[4]] = var1;
      Boolean var8 = var2;
      this.f1000[f2000[5]] = var8;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[0]];
         Object[] var1 = this.f1000;
         var1[f4000[0]] = f4000[1];
      }
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public UUID m12000() {
      return (UUID)this.f1000[f2000[0]];
   }

   public IliIjtsr m14000(UUID var1) {
      this.f1000[f2000[2]] = var1;
      return this;
   }

   public IliIjtsr m16000(boolean var1) {
      Boolean var6 = var1;
      this.f1000[f2000[3]] = var6;
      return this;
   }

   public boolean m20000() {
      return (Boolean)this.f1000[f2000[1]];
   }

   private static void m22000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }
}
