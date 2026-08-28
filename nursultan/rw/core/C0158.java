package rw.core;

public class C0158 {
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

   public C0158() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f1000[1]];
         Object[] var1 = this.f4000;
         var1[f1000[2]] = Integer.valueOf(f1000[3]);
      }
   }

   private static void m12000() {
      f2000 = new Object[f1000[4]];
   }

   public static C0158 m14000(int var0) {
      C0158 var10000 = (C0158)f2000[f3000[0]];
      Integer var5 = var0;
      var10000.f4000[f3000[1]] = var5;
      return (C0158)f2000[f3000[2]];
   }

   private static void m16000() {
      short[] var128 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
   }

   public C0158 m18000(int var1) {
      Integer var6 = var1;
      this.f4000[f3000[4]] = var6;
      return this;
   }

   public int m20000() {
      return (Integer)this.f4000[f3000[3]];
   }
}
