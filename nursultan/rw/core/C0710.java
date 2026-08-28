package rw.core;

public class C0710 {
   private static byte[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   public static Object[] f4000;
   private static short[] f5000;
   public Object[] f6000;

   private static void m2000() {
      f4000 = new Object[f3000[5]];
   }

   private void m6000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f1000[0]];
         Object[] var1 = this.f6000;
         var1[f3000[1]] = f3000[2];
         var1[f3000[3]] = f3000[4];
      }
   }

   public C0710() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[6];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      short[] var128 = new short[5];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[4];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
   }

   public boolean m14000() {
      return (Boolean)this.f6000[f5000[0]];
   }

   public void m18000(boolean var1) {
      Boolean var6 = var1;
      this.f6000[f5000[3]] = var6;
   }

   public static C0710 m20000(boolean var0, boolean var1) {
      C0710 var10000 = (C0710)f4000[f2000[0]];
      Boolean var6 = var0;
      var10000.f6000[f2000[1]] = var6;
      var10000 = (C0710)f4000[f2000[2]];
      Boolean var7 = var1;
      var10000.f6000[f2000[3]] = var7;
      return (C0710)f4000[f2000[4]];
   }

   public boolean m22000() {
      return (Boolean)this.f6000[f5000[1]];
   }

   public void m26000(boolean var1) {
      Boolean var6 = var1;
      this.f6000[f5000[2]] = var6;
   }

   private static void m30000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 2;
   }
}
