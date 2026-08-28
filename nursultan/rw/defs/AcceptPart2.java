package rw.defs;

public enum AcceptPart2 {
   private static byte[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   public static Object[] f5000;
   private static byte[] f6000;
   private static String[] f7000;
   private static String[] f8000;
   private static byte[] f9000;
   private static boolean[] f10000;
   private static byte[] f11000;

   private static void m2000() {
      f2000 = new Object[f6000[1]];
      f5000 = new Object[f6000[1]];
   }

   static {
      ntfClinit();
   }

   public static AcceptPart2[] m10000() {
      return (AcceptPart2[])((AcceptPart2[])f5000[f3000[0]]).clone();
   }

   private static void m20000() {
      boolean[] var128 = new boolean[8];
      f10000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f10000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f10000[2] = (boolean)((0 | -0) >>> 31);
      f10000[3] = (boolean)((0 | -0) >>> 31);
      f10000[4] = (boolean)((1 | -1) >>> 31);
      f10000[5] = (boolean)((1 | -1) >>> 31);
      f10000[6] = (boolean)((0 | -0) >>> 31);
      f10000[7] = (boolean)((1 | -1) >>> 31);
   }

   private static void m30000() {
      byte[] var128 = new byte[7];
      f1000[(0 | -0) >>> 31] = 9;
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 3;
      f1000[3] = 4;
      f1000[4] = 5;
      f1000[5] = 6;
      f1000[6] = 7;
      byte[] var129 = new byte[6];
      f9000[(0 | -0) >>> 31] = 8;
      f9000[(1 | -1) >>> 31] = 2;
      f9000[2] = 2;
      f9000[3] = 3;
      f9000[4] = 3;
      f9000[5] = 4;
      byte[] var130 = new byte[8];
      f11000[(0 | -0) >>> 31] = 5;
      f11000[(1 | -1) >>> 31] = 6;
      f11000[2] = 2;
      f11000[3] = 7;
      f11000[4] = 3;
      f11000[5] = 8;
      f11000[6] = 4;
      f11000[7] = 5;
      byte[] var131 = new byte[2];
      f6000[(0 | -0) >>> 31] = 4;
      f6000[(1 | -1) >>> 31] = 6;
   }

   private static void m36000() {
      short[] var128 = new short[2];
      f3000[(0 | -0) >>> 31] = 5;
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[8];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((1 | -1) >>> 31);
      f4000[5] = 2;
      f4000[6] = 3;
      f4000[7] = 4;
   }

   private static void m42000() {
      f7000 = new String[6];
      f7000[(0 | -0) >>> 31] = "CREATE";
      f7000[(1 | -1) >>> 31] = "INVITE";
      f7000[2] = "KICK";
      f7000[3] = "LEAVE";
      f7000[4] = "DISBAND";
      f7000[5] = "JOIN_CODE";
      f8000 = new String[3];
      f8000[(0 | -0) >>> 31] = "ACCEPT_INVITE";
      f8000[(1 | -1) >>> 31] = "DECLINE_INVITES";
      f8000[2] = "INFO";
   }
}
