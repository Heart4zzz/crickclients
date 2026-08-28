package rw.core;

public class C0922 {
   public static Object[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;

   private static void m2000() {
      short[] var128 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
   }

   public C0922() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[1]];
         Object[] var1 = this.f2000;
         var1[f3000[2]] = Integer.valueOf(f3000[3]);
      }
   }

   private static void m10000() {
      f1000 = new Object[f3000[4]];
   }

   private static void m14000() {
      boolean[] var128 = new boolean[5];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((1 | -1) >>> 31);
   }

   public C0922 m16000(int var1) {
      Integer var6 = var1;
      this.f2000[f4000[4]] = var6;
      return this;
   }

   public int m18000() {
      return (Integer)this.f2000[f4000[3]];
   }

   public static C0922 m20000(int var0) {
      C0922 var10000 = (C0922)f1000[f4000[0]];
      Integer var5 = var0;
      var10000.f2000[f4000[1]] = var5;
      return (C0922)f1000[f4000[2]];
   }
}
