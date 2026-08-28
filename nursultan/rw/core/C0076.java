package rw.core;

import rw.data.Rec0130;

public class C0076 {
   private static byte[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static int[] f4000;
   public static Object[] f5000;
   private static float[] f6000;
   private static boolean[] f7000;
   private static float[] f8000;

   private static void m2000() {
      f4000 = new int[]{-7171438};
   }

   private C0076() {
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f7000 = new boolean[]{false, true, false, true};
   }

   private static void m10000() {
      f2000 = new short[]{1, 1, 1, 1};
   }

   private static void m14000() {
      f8000 = new float[]{0.1F, 0.35F, 18.0F, 4.0F, 0.0F, 100.0F, 100.0F, 100.0F};
      f6000 = new float[]{1.0F, 1.0F, 100.0F, 18.0F};
   }

   private static void m18000() {
      f1000 = new byte[]{3, 2, 3, 3, 2, 4, 16};
      f3000 = new byte[]{3, 4, 5};
   }

   public static Rec0130 m22000(float var0, float var1) {
      int var2 = C0248.m14000((Integer)C0077.f2000[f2000[0]], f8000[0]);
      int var3 = C0248.m14000((Integer)C0077.f2000[f2000[1]], f8000[1]);
      return new Rec0130(var0, var1, f8000[2], var2, var3, var3, (Integer)C0077.f2000[f2000[2]], (Integer)C0077.f2000[f2000[3]], f4000[0]);
   }

   private static void m26000() {
      f5000 = new Object[]{null, null, null, null, null};
   }
}
