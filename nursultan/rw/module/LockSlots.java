package rw.module;

import rw.Module;

public class LockSlots extends Module {
   private static boolean[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   public static Object[] f4000;

   public int m4000() {
      this.m4000();
      return (Integer)this.f3000[f2000[3]];
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
   }

   public LockSlots() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f4000 = new Object[f1000[4]];
   }

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f1000[1]];
         Object[] var1 = this.f3000;
         var1[f1000[2]] = Integer.valueOf(f1000[3]);
      }
   }

   public static LockSlots m10000(int var0) {
      LockSlots var10000 = (LockSlots)f4000[f2000[0]];
      Integer var5 = var0;
      var10000.f3000[f2000[1]] = var5;
      return (LockSlots)f4000[f2000[2]];
   }

   private static void m12000() {
      boolean[] var128 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
   }
}
