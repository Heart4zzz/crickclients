package rw.defs;

import java.util.Map;

public enum Enum0082 {
   private static String[] f1000;
   private static byte[] f2000;
   private static byte[] f3000;
   public static Object[] f4000;
   private static byte[] f5000;
   private static String[] f6000;
   private static short[] f7000;
   private static byte[] f8000;
   private static byte[] f9000;
   private static byte[] f10000;
   private static byte[] f11000;
   private static byte[] f12000;
   private static String[] f13000;
   private static boolean[] f14000;
   private static short[] f15000;
   public static Object[] f16000;
   private static byte[] f17000;
   private static boolean[] f18000;
   private static String[] f19000;
   private static byte[] f20000;
   public Object[] f21000;
   private static short[] f22000;

   private static void m4000() {
      f4000 = new Object[f17000[2]];
      f16000 = new Object[f17000[3]];
   }

   private void m8000() {
      if (this.f21000 == null) {
         this.f21000 = new Object[f17000[1]];
         Object[] var1 = this.f21000;
         var1[f18000[3]] = Integer.valueOf(f18000[4]);
      }
   }

   private Enum0082(String var3, int var4) {
      this.m8000();
      this.f21000[f22000[1]] = var3;
      Integer var10 = var4;
      this.f21000[f22000[2]] = var10;
   }

   static {
      ntfClinit();
   }

   public static Enum0082[] m16000() {
      return (Enum0082[])((Enum0082[])f16000[f22000[0]]).clone();
   }

   private static void m18000() {
      short[] var128 = new short[8];
      f22000[(0 | -0) >>> 31] = 7;
      f22000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f22000[2] = (short)((1 | -1) >>> 31);
      f22000[3] = 6;
      f22000[4] = (short)((0 | -0) >>> 31);
      f22000[5] = (short)((1 | -1) >>> 31);
      f22000[6] = (short)((0 | -0) >>> 31);
      f22000[7] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[2];
      f7000[(0 | -0) >>> 31] = 2;
      f7000[(1 | -1) >>> 31] = 3;
      short[] var130 = new short[8];
      f15000[(0 | -0) >>> 31] = 4;
      f15000[(1 | -1) >>> 31] = 5;
      f15000[2] = (short)((0 | -0) >>> 31);
      f15000[3] = (short)((1 | -1) >>> 31);
      f15000[4] = 2;
      f15000[5] = 3;
      f15000[6] = 4;
      f15000[7] = 5;
   }

   private static void m26000() {
      byte[] var128 = new byte[4];
      f5000[(0 | -0) >>> 31] = 12;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 3;
      f5000[3] = 4;
      byte[] var129 = new byte[4];
      f3000[(0 | -0) >>> 31] = 5;
      f3000[(1 | -1) >>> 31] = 6;
      f3000[2] = 7;
      f3000[3] = 8;
      byte[] var130 = new byte[4];
      f8000[(0 | -0) >>> 31] = 9;
      f8000[(1 | -1) >>> 31] = 10;
      f8000[2] = 11;
      f8000[3] = 2;
      byte[] var131 = new byte[5];
      f20000[(0 | -0) >>> 31] = 2;
      f20000[(1 | -1) >>> 31] = 3;
      f20000[2] = 2;
      f20000[3] = 3;
      f20000[4] = 4;
      byte[] var132 = new byte[4];
      f9000[(0 | -0) >>> 31] = 3;
      f9000[(1 | -1) >>> 31] = 4;
      f9000[2] = 5;
      f9000[3] = 4;
      byte[] var133 = new byte[3];
      f10000[(0 | -0) >>> 31] = 5;
      f10000[(1 | -1) >>> 31] = 6;
      f10000[2] = 5;
      byte[] var134 = new byte[4];
      f11000[(0 | -0) >>> 31] = 6;
      f11000[(1 | -1) >>> 31] = 7;
      f11000[2] = 7;
      f11000[3] = 8;
      byte[] var135 = new byte[7];
      f12000[(0 | -0) >>> 31] = 8;
      f12000[(1 | -1) >>> 31] = 9;
      f12000[2] = 2;
      f12000[3] = 9;
      f12000[4] = 10;
      f12000[5] = 3;
      f12000[6] = 10;
      byte[] var136 = new byte[7];
      f2000[(0 | -0) >>> 31] = 11;
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = 11;
      f2000[3] = 12;
      f2000[4] = 5;
      f2000[5] = 7;
      f2000[6] = 6;
      byte[] var137 = new byte[4];
      f17000[(0 | -0) >>> 31] = 6;
      f17000[(1 | -1) >>> 31] = 2;
      f17000[2] = 6;
      f17000[3] = 8;
   }

   private static void m52000() {
      boolean[] var128 = new boolean[8];
      f14000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f14000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f14000[2] = (boolean)((0 | -0) >>> 31);
      f14000[3] = (boolean)((1 | -1) >>> 31);
      f14000[4] = (boolean)((0 | -0) >>> 31);
      f14000[5] = (boolean)((1 | -1) >>> 31);
      f14000[6] = (boolean)((1 | -1) >>> 31);
      f14000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f18000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f18000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f18000[2] = (boolean)((1 | -1) >>> 31);
      f18000[3] = (boolean)((1 | -1) >>> 31);
      f18000[4] = (boolean)((0 | -0) >>> 31);
   }

   public String m60000() {
      return (String)this.f21000[f22000[4]];
   }

   public int m66000() {
      return (Integer)this.f21000[f22000[5]];
   }

   public static Enum0082 m68000(int var0) {
      return (Enum0082)((Map)f16000[f22000[3]]).get(var0);
   }

   private static void m74000() {
      f1000 = new String[3];
      f1000[(0 | -0) >>> 31] = "CONFIG_NOT_FOUND";
      f1000[(1 | -1) >>> 31] = "preset.error.not-found";
      f1000[2] = "CONFIG_ALREADY_EXISTS";
      f19000 = new String[5];
      f19000[(0 | -0) >>> 31] = "preset.error.already-exists";
      f19000[(1 | -1) >>> 31] = "NAME_INVALID";
      f19000[2] = "preset.error.name-invalid";
      f19000[3] = "DATA_INVALID";
      f19000[4] = "preset.error.data-invalid";
      f6000 = new String[8];
      f6000[(0 | -0) >>> 31] = "DATA_TOO_LARGE";
      f6000[(1 | -1) >>> 31] = "preset.error.data-too-large";
      f6000[2] = "QUOTA_EXCEEDED";
      f6000[3] = "preset.error.quota-exceeded";
      f6000[4] = "RATE_LIMITED";
      f6000[5] = "preset.error.rate-limited";
      f6000[6] = "SHARE_NOT_FOUND";
      f6000[7] = "preset.error.share-not-found";
      f13000 = new String[8];
      f13000[(0 | -0) >>> 31] = "INTERNAL";
      f13000[(1 | -1) >>> 31] = "preset.error.internal";
      f13000[2] = "SHARE_EXPIRED";
      f13000[3] = "preset.error.share-expired";
      f13000[4] = "SHARE_LIMIT_REACHED";
      f13000[5] = "preset.error.share-limit-reached";
      f13000[6] = "SHARE_ALREADY_EXISTS";
      f13000[7] = "preset.error.share-already-exists";
   }
}
