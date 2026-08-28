package rw.core;

public class OlrOjknp {
   private static short[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;

   private void m4000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[1]];
         Object[] var1 = this.f4000;
         var1[f3000[2]] = f3000[3];
      }
   }

   public OlrOjknp() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[3];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
   }

   private static void m8000() {
      boolean[] var128 = new boolean[5];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((1 | -1) >>> 31);
   }

   public boolean m12000() {
      return (Boolean)this.f4000[f1000[1]];
   }

   public static OlrOjknp m14000() {
      return (OlrOjknp)f2000[f1000[0]];
   }

   public OlrOjknp m16000(boolean var1) {
      Boolean var6 = var1;
      this.f4000[f1000[2]] = var6;
      return this;
   }

   private static void m20000() {
      f2000 = new Object[f3000[4]];
   }
}
