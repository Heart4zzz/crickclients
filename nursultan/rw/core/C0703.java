package rw.core;

public class C0703 {
   public static Object[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f4000[1]];
         Object[] var1 = this.f2000;
      }
   }

   public C0703() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[f4000[2]];
   }

   private static void m8000() {
      short[] var128 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
   }

   public static C0703 m10000(String var0) {
      ((C0703)f1000[f3000[0]]).f2000[f3000[1]] = var0;
      return (C0703)f1000[f3000[2]];
   }

   private static void m12000() {
      boolean[] var128 = new boolean[3];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
   }

   public C0703 m18000(String var1) {
      this.f2000[f3000[4]] = var1;
      return this;
   }

   public String m20000() {
      return (String)this.f2000[f3000[3]];
   }
}
