package rw.defs;

public enum Enum0090 {
   private static String[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static byte[] f4000;
   public static Object[] f5000;
   private static boolean[] f6000;

   private static void m2000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
   }

   private void m8000() {
      this.f3000 = new Object[f6000[6]];
   }

   private Enum0090(String var3) {
      this.m8000();
      this.f3000[f2000[1]] = var3;
   }

   static {
      ntfClinit();
   }

   public static Enum0090[] m10000() {
      return (Enum0090[])((Enum0090[])f5000[f2000[0]]).clone();
   }

   private static void m20000() {
      f5000 = new Object[f4000[2]];
   }

   private static void m24000() {
      f1000 = new String[4];
      f1000[(0 | -0) >>> 31] = "_1_16";
      f1000[(1 | -1) >>> 31] = "/an";
      f1000[2] = "_1_21";
      f1000[3] = "/an";
   }

   private static void m32000() {
      boolean[] var128 = new boolean[7];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((0 | -0) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      f6000[4] = (boolean)((1 | -1) >>> 31);
      f6000[5] = (boolean)((1 | -1) >>> 31);
      f6000[6] = (boolean)((1 | -1) >>> 31);
   }

   private static void m38000() {
      byte[] var128 = new byte[3];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
   }
}
