package rw.core;

public class C1186 {
   private static String[] f1000;
   private static String[] f2000;
   private static byte[] f3000;
   private static String[] f4000;
   private static boolean[] f5000;
   private static byte[] f6000;
   private static String[] f7000;
   private static byte[] f8000;
   private static String[] f9000;
   private static byte[] f10000;
   private static byte[] f11000;
   private static byte[] f12000;
   private static int[] f13000;
   private static byte[] f14000;
   private static short[] f15000;
   private static byte[] f16000;
   private static byte[] f17000;
   public static Object[] f18000;
   private static byte[] f19000;

   private static void m8000() {
      boolean[] var128 = new boolean[4];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
   }

   private C1186() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m26000() {
      f18000 = new Object[f16000[(1 | -1) >>> 31]];
      f18000[f5000[2]] = f13000[4];
      f18000[f5000[3]] = Integer.valueOf(f15000[6]);
   }

   private static void m56000() {
      byte[] var128 = new byte[6];
      f14000[(0 | -0) >>> 31] = 2;
      f14000[(1 | -1) >>> 31] = 2;
      f14000[2] = 2;
      f14000[3] = 86;
      f14000[4] = 2;
      f14000[5] = 96;
      byte[] var129 = new byte[3];
      f6000[(0 | -0) >>> 31] = 2;
      f6000[(1 | -1) >>> 31] = 9;
      f6000[2] = 2;
      byte[] var130 = new byte[8];
      f11000[(0 | -0) >>> 31] = 2;
      f11000[(1 | -1) >>> 31] = 82;
      f11000[2] = 2;
      f11000[3] = 72;
      f11000[4] = 2;
      f11000[5] = 64;
      f11000[6] = 2;
      f11000[7] = 40;
      byte[] var131 = new byte[5];
      f19000[(0 | -0) >>> 31] = 2;
      f19000[(1 | -1) >>> 31] = 36;
      f19000[2] = 2;
      f19000[3] = 32;
      f19000[4] = 2;
      byte[] var132 = new byte[8];
      f17000[(0 | -0) >>> 31] = 22;
      f17000[(1 | -1) >>> 31] = 2;
      f17000[2] = 18;
      f17000[3] = 2;
      f17000[4] = 8;
      f17000[5] = 2;
      f17000[6] = 4;
      f17000[7] = 2;
      byte[] var133 = new byte[3];
      f3000[(0 | -0) >>> 31] = 68;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 55;
      byte[] var134 = new byte[5];
      f12000[(0 | -0) >>> 31] = 2;
      f12000[(1 | -1) >>> 31] = 54;
      f12000[2] = 2;
      f12000[3] = 5;
      f12000[4] = 2;
      byte[] var135 = new byte[6];
      f8000[(0 | -0) >>> 31] = 19;
      f8000[(1 | -1) >>> 31] = 2;
      f8000[2] = 23;
      f8000[3] = 2;
      f8000[4] = 33;
      f8000[5] = 2;
      byte[] var136 = new byte[8];
      f10000[(0 | -0) >>> 31] = 37;
      f10000[(1 | -1) >>> 31] = 2;
      f10000[2] = 41;
      f10000[3] = 2;
      f10000[4] = 2;
      f10000[5] = 2;
      f10000[6] = 65;
      f10000[7] = 2;
      byte[] var137 = new byte[2];
      f16000[(0 | -0) >>> 31] = 69;
      f16000[(1 | -1) >>> 31] = 3;
   }

   private static void m60000() {
      short[] var128 = new short[7];
      f15000[(0 | -0) >>> 31] = 320;
      f15000[(1 | -1) >>> 31] = 2;
      f15000[2] = 2;
      f15000[3] = 320;
      f15000[4] = 306;
      f15000[5] = 307;
      f15000[6] = 320;
   }

   public static String m68000(char var0) {
      int var1 = var0 - f13000[0];
      return var1 >= 0 && var1 < f15000[0] ? ((String[])f18000[f15000[1]])[var1] : null;
   }

   private static void m72000() {
      int[] var128 = new int[5];
      f13000[(0 | -0) >>> 31] = 42240;
      f13000[(1 | -1) >>> 31] = 42240;
      f13000[2] = 42559;
      f13000[3] = 42240;
      f13000[4] = 42240;
   }

   public static String m74000(int var0) {
      return var0 >= f13000[1] && var0 <= f13000[2] ? ((String[])f18000[f15000[2]])[var0 - f13000[3]] : null;
   }

   private static void m78000() {
      f1000 = new String[3];
      f1000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
      f1000[(1 | -1) >>> 31] = "ИГРОК";
      f1000[2] = "BUNNY";
      f9000 = new String[4];
      f9000[(0 | -0) >>> 31] = "D.HELPER";
      f9000[(1 | -1) >>> 31] = "HELPER";
      f9000[2] = "MEDIA";
      f9000[3] = "RABBIT";
      f7000 = new String[8];
      f7000[(0 | -0) >>> 31] = "COBRA";
      f7000[(1 | -1) >>> 31] = "HYDRA";
      f7000[2] = "DRAGON";
      f7000[3] = "IMPERATOR";
      f7000[4] = "MAGISTER";
      f7000[5] = "OVERLORD";
      f7000[6] = "AVENGER";
      f7000[7] = "TITAN";
      f2000 = new String[7];
      f2000[(0 | -0) >>> 31] = "HERO";
      f2000[(1 | -1) >>> 31] = "DRACULA";
      f2000[2] = "ADMIN";
      f2000[3] = "TIGER";
      f2000[4] = "YT";
      f2000[5] = "ML.MODER";
      f2000[6] = "MODER";
      f4000 = new String[7];
      f4000[(0 | -0) >>> 31] = "MODER+";
      f4000[(1 | -1) >>> 31] = "ST.MODER";
      f4000[2] = "GL.MODER";
      f4000[3] = "BULL";
      f4000[4] = "ML.ADMIN";
      f4000[5] = "GOD";
      f4000[6] = "VAMPIRE";
   }
}
