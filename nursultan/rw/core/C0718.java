package rw.core;

public class C0718 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   public Object[] f4000;

   private static void m4000() {
      boolean[] var128 = new boolean[5];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
   }

   public C0718() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f1000[1]];
         Object[] var1 = this.f4000;
         var1[f1000[2]] = f1000[3];
      }
   }

   private static void m8000() {
      f2000 = new Object[f1000[4]];
   }

   private static void m10000() {
      short[] var128 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
   }

   public static C0718 m12000(boolean var0) {
      C0718 var10000 = (C0718)f2000[f3000[0]];
      Boolean var5 = var0;
      var10000.f4000[f3000[1]] = var5;
      return (C0718)f2000[f3000[2]];
   }

   public boolean m16000() {
      return (Boolean)this.f4000[f3000[3]];
   }

   public void m18000(boolean var1) {
      Boolean var6 = var1;
      this.f4000[f3000[4]] = var6;
   }
}
