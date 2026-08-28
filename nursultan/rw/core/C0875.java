package rw.core;

public class C0875 implements AutoCloseable {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   public Object[] f4000;

   private static void m2000() {
      boolean[] var128 = new boolean[7];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((0 | -0) >>> 31);
      f1000[6] = (boolean)((1 | -1) >>> 31);
   }

   private static void m6000() {
      short[] var128 = new short[6];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
      f3000[5] = (short)((0 | -0) >>> 31);
   }

   private C0875() {
      this.m8000();
      Boolean var5 = (Boolean)((ThreadLocal)f2000[f3000[0]]).get();
      this.f4000[f3000[1]] = var5;
      ((ThreadLocal)f2000[f3000[2]]).set(f1000[0]);
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f1000[3]];
         Object[] var1 = this.f4000;
         var1[f1000[4]] = f1000[5];
      }
   }

   public void m10000() {
      ((ThreadLocal)f2000[f3000[4]]).set((Boolean)this.f4000[f3000[5]]);
   }

   public static boolean m16000() {
      return (Boolean)((ThreadLocal)f2000[f3000[3]]).get();
   }

   public static C0875 m18000() {
      return new C0875();
   }

   private static void m22000() {
      f2000 = new Object[f1000[6]];
   }
}
