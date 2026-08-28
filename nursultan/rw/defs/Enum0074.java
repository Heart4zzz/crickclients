package rw.defs;

public enum Enum0074 {
   public Object[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static String[] f5000;
   private static boolean[] f6000;
   private static byte[] f7000;

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[3]];
         Object[] var1 = this.f1000;
         var1[f3000[4]] = Integer.valueOf(f3000[5]);
      }
   }

   private Enum0074(int var3) {
      this.m8000();
      Integer var8 = var3;
      this.f1000[f4000[2]] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0074[] m10000() {
      return (Enum0074[])((Enum0074[])f2000[f4000[0]]).clone();
   }

   private static void m12000() {
      byte[] var128 = new byte[6];
      f7000[(0 | -0) >>> 31] = 3;
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = 2;
      f7000[3] = 2;
      f7000[4] = 3;
      f7000[5] = 4;
   }

   private static void m14000() {
      short[] var128 = new short[8];
      f4000[(0 | -0) >>> 31] = 3;
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((1 | -1) >>> 31);
      f4000[5] = 2;
      f4000[6] = 200;
      f4000[7] = -200;
   }

   private static void m20000() {
      boolean[] var128 = new boolean[4];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((0 | -0) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[6];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((0 | -0) >>> 31);
   }

   private static void m22000() {
      f2000 = new Object[f7000[5]];
   }

   public int m32000() {
      return (Integer)this.f1000[f4000[1]];
   }

   private static void m34000() {
      f5000 = new String[3];
      f5000[(0 | -0) >>> 31] = "NOW";
      f5000[(1 | -1) >>> 31] = "DEFAULT";
      f5000[2] = "LATER";
   }
}
