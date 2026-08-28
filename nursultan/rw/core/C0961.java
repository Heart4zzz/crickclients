package rw.core;

public class C0961 extends C0953 {
   private static byte[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;

   public boolean m2000() {
      return f3000[2];
   }

   public C0961(int var1, int var2, Runnable var3) {
      super(var1, var3);
      this.m6000();
      Integer var8 = var1;
      this.f2000[f4000[0]] = var8;
      Integer var9 = var2;
      this.f2000[f4000[1]] = var9;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      this.f2000 = new Object[f1000[(0 | -0) >>> 31]];
      this.f2000[f3000[3]] = Integer.valueOf(f3000[4]);
      this.f2000[f3000[5]] = Integer.valueOf(f3000[6]);
   }

   public boolean m10000() {
      this.m6000();
      int var10002 = (Integer)this.f2000[f4000[2]] - f3000[0];
      Integer var5 = var10002;
      this.f2000[f4000[3]] = var5;
      if (var10002 < 0 && super.m14000()) {
         Integer var6 = (Integer)this.f2000[f4000[4]];
         this.y[f4000[5]] = var6;
      }

      return f3000[1];
   }

   private static void m14000() {
      short[] var128 = new short[6];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
      f4000[5] = (short)((0 | -0) >>> 31);
   }

   private static void m16000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 2;
   }

   private static void m20000() {
      boolean[] var128 = new boolean[7];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
      f3000[6] = (boolean)((0 | -0) >>> 31);
   }
}
