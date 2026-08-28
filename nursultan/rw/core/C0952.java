package rw.core;

public class C0952 extends C0953 {
   public Object[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static short[] f7000;
   private static byte[] f8000;

   @Override
   public boolean m4000() {
      this.m6000();
      if ((Boolean)this.f1000[f7000[1]]) {
         return f4000[0];
      } else {
         return this.f1000[f7000[2]] <= 0 && super.m4000() ? f4000[1] : f4000[2];
      }
   }

   public C0952(int var1, int var2, Runnable var3) {
      super(var1, var3);
      this.m6000();
      Integer var8 = var1;
      this.f1000[f2000[2]] = var8;
      Integer var9 = var2;
      this.f1000[f2000[3]] = var9;
   }

   public C0952(int var1, Runnable var2) {
      super(var1, var2);
      this.m6000();
      Integer var7 = Integer.valueOf(f5000[0]);
      this.f1000[f2000[0]] = var7;
      Integer var8 = Integer.valueOf(f5000[1]);
      this.f1000[f2000[1]] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      byte[] var128 = new byte[2];
      f8000[(0 | -0) >>> 31] = 3;
      f8000[(1 | -1) >>> 31] = 2;
   }

   public void m6000() {
      this.m6000();
      Boolean var5 = f5000[2];
      this.f1000[f2000[4]] = var5;
   }

   private static void m4000() {
      short[] var128 = new short[6];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = 2;
      f2000[5] = 2;
      short[] var129 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[6];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = (short)((0 | -0) >>> 31);
      f7000[3] = (short)((0 | -0) >>> 31);
      f7000[4] = (short)((1 | -1) >>> 31);
      f7000[5] = 2;
   }

   private void m6000() {
      this.f1000 = new Object[f8000[(0 | -0) >>> 31]];
      this.f1000[f4000[3]] = Integer.valueOf(f4000[4]);
      this.f1000[f4000[5]] = Integer.valueOf(f4000[6]);
      this.f1000[f8000[(1 | -1) >>> 31]] = f4000[7];
   }

   public boolean m10000() {
      this.m6000();
      if ((Boolean)this.f1000[f2000[5]]) {
         return f6000[0];
      } else if ((Integer)this.f1000[f3000[0]] <= 0) {
         return super.m14000();
      } else {
         int var10002 = (Integer)this.f1000[f3000[1]] - f6000[1];
         Integer var5 = var10002;
         this.f1000[f3000[2]] = var5;
         if (var10002 < 0 && super.m14000()) {
            Integer var6 = (Integer)this.f1000[f3000[3]];
            this.y[f7000[0]] = var6;
         }

         return f6000[2];
      }
   }

   public boolean m8000() {
      this.m6000();
      return (Boolean)this.f1000[f7000[5]];
   }

   private static void m10000() {
      boolean[] var128 = new boolean[3];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[3];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[8];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
      f4000[6] = (boolean)((0 | -0) >>> 31);
      f4000[7] = (boolean)((0 | -0) >>> 31);
   }

   public int m12000() {
      this.m6000();
      return (Integer)this.f1000[f7000[4]];
   }

   public int m16000() {
      this.m6000();
      return (Integer)this.f1000[f7000[3]];
   }
}
