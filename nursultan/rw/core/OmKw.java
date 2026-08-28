package rw.core;

public class OmKw {
   public Object[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static byte[] f5000;
   private static short[] f6000;
   private static float[] f7000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f5000[0]];
         Object[] var1 = this.f1000;
         var1[f4000[2]] = f4000[3];
         var1[f4000[4]] = f7000[0];
      }
   }

   private static void m6000() {
      boolean[] var128 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
   }

   public OmKw() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 2;
   }

   private static void m16000() {
      short[] var128 = new short[2];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[7];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = (short)((0 | -0) >>> 31);
      f6000[4] = (short)((1 | -1) >>> 31);
      f6000[5] = (short)((0 | -0) >>> 31);
      f6000[6] = (short)((1 | -1) >>> 31);
   }

   public static OmKw m18000(float var0) {
      OmKw var10000 = (OmKw)f3000[f2000[0]];
      Float var5 = var0;
      var10000.f1000[f2000[1]] = var5;
      var10000 = (OmKw)f3000[f6000[0]];
      Boolean var6 = f4000[0];
      var10000.f1000[f6000[1]] = var6;
      return (OmKw)f3000[f6000[2]];
   }

   public float m20000() {
      return (Float)this.f1000[f6000[4]];
   }

   public OmKw m26000(float var1) {
      Float var6 = var1;
      this.f1000[f6000[6]] = var6;
      return this;
   }

   public OmKw m28000(boolean var1) {
      Boolean var6 = var1;
      this.f1000[f6000[5]] = var6;
      return this;
   }

   public boolean m30000() {
      return (Boolean)this.f1000[f6000[3]];
   }

   private static void m34000() {
      f3000 = new Object[f4000[5]];
   }
}
