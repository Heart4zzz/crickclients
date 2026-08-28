package rw.defs;

import KDFzREm.Nbx;
import rw.api.Iface0606;

public enum Enum0092 {
   private static boolean[] f1000;
   private static byte[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   public static Object[] f6000;
   public Object[] f7000;
   private static byte[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static String[] f11000;

   public int m6000() {
      return (Integer)this.f7000[f9000[1]];
   }

   private static void m10000() {
      byte[] var128 = new byte[8];
      f3000[(0 | -0) >>> 31] = 5;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
      f3000[3] = 4;
      f3000[4] = 2;
      f3000[5] = 6;
      f3000[6] = 3;
      f3000[7] = 5;
      byte[] var129 = new byte[5];
      f8000[(0 | -0) >>> 31] = 2;
      f8000[(1 | -1) >>> 31] = 2;
      f8000[2] = 6;
      f8000[3] = 2;
      f8000[4] = 3;
      byte[] var130 = new byte[8];
      f2000[(0 | -0) >>> 31] = 7;
      f2000[(1 | -1) >>> 31] = 3;
      f2000[2] = 4;
      f2000[3] = 8;
      f2000[4] = 4;
      f2000[5] = 5;
      f2000[6] = 4;
      f2000[7] = 6;
   }

   private Enum0092(int var3, int var4, Nbx var5, Iface0606 var6) {
      this.m28000();
      Integer var11 = var3;
      this.f7000[f9000[5]] = var11;
      Integer var12 = var4;
      this.f7000[f9000[6]] = var12;
      this.f7000[f9000[7]] = var5;
      this.f7000[f10000[0]] = var6;
   }

   static {
      ntfClinit();
   }

   public static Enum0092[] m12000() {
      return (Enum0092[])((Enum0092[])f6000[f9000[0]]).clone();
   }

   private static void m14000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[7];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((0 | -0) >>> 31);
      f5000[4] = (boolean)((0 | -0) >>> 31);
      f5000[5] = (boolean)((1 | -1) >>> 31);
      f5000[6] = (boolean)((0 | -0) >>> 31);
   }

   private static void m16000() {
      f11000 = new String[5];
      f11000[(0 | -0) >>> 31] = "ELYTRA";
      f11000[(1 | -1) >>> 31] = "HELMET";
      f11000[2] = "CHESTPLATE";
      f11000[3] = "LEGGINGS";
      f11000[4] = "BOOTS";
   }

   private static void m22000() {
      f6000 = new Object[f2000[7]];
   }

   private void m28000() {
      this.f7000 = new Object[f2000[6]];
      this.f7000[f5000[3]] = Integer.valueOf(f5000[4]);
      this.f7000[f5000[5]] = Integer.valueOf(f5000[6]);
   }

   public Iface0606 m30000() {
      return (Iface0606)this.f7000[f9000[4]];
   }

   public Nbx m44000() {
      return (Nbx)this.f7000[f9000[3]];
   }

   public int m50000() {
      return (Integer)this.f7000[f9000[2]];
   }

   private static void m56000() {
      short[] var128 = new short[8];
      f9000[(0 | -0) >>> 31] = 5;
      f9000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[2] = (short)((1 | -1) >>> 31);
      f9000[3] = 2;
      f9000[4] = 3;
      f9000[5] = (short)((0 | -0) >>> 31);
      f9000[6] = (short)((1 | -1) >>> 31);
      f9000[7] = 2;
      short[] var129 = new short[6];
      f10000[(0 | -0) >>> 31] = 3;
      f10000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f10000[2] = (short)((1 | -1) >>> 31);
      f10000[3] = 2;
      f10000[4] = 3;
      f10000[5] = 4;
   }
}
