package rw.core;

public class C0701 {
   public Object[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   public C0701() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new Object[f3000[2]];
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[1]];
         Object[] var1 = this.f1000;
      }
   }

   public C0701 m10000(String var1) {
      this.f1000[f4000[4]] = var1;
      return this;
   }

   private static void m14000() {
      short[] var128 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
   }

   public String m18000() {
      return (String)this.f1000[f4000[3]];
   }

   public static C0701 m20000(String var0) {
      ((C0701)f2000[f4000[0]]).f1000[f4000[1]] = var0;
      return (C0701)f2000[f4000[2]];
   }
}
