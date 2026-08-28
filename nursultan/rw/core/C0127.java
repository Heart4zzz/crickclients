package rw.core;

public class C0127 {
   private static short[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f4000[1]];
         Object[] var1 = this.f2000;
         var1[f4000[2]] = f4000[3];
      }
   }

   public C0127() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[5];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
   }

   private static void m8000() {
      short[] var128 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
   }

   public static C0127 m10000(boolean var0) {
      C0127 var10000 = (C0127)f3000[f1000[0]];
      Boolean var5 = var0;
      var10000.f2000[f1000[1]] = var5;
      return (C0127)f3000[f1000[2]];
   }

   private static void m14000() {
      f3000 = new Object[f4000[4]];
   }

   public void m16000(boolean var1) {
      Boolean var6 = var1;
      this.f2000[f1000[3]] = var6;
   }

   public boolean m18000() {
      return (Boolean)this.f2000[f1000[4]];
   }
}
