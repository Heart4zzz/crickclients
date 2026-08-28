package rw.core;

import rw.api.Iface0659;

public class C1182 {
   private static double[] f1000;
   private static byte[] f2000;
   private static double[] f3000;
   private static double[] f4000;
   private static byte[] f5000;
   private static byte[] f6000;
   private static byte[] f7000;
   private static byte[] f8000;
   private static double[] f9000;
   private static double[] f10000;
   private static double[] f11000;
   private static double[] f12000;
   private static double[] f13000;
   public static Object[] f14000;
   private static byte[] f15000;
   private static double[] f16000;
   private static byte[] f17000;
   private static double[] f18000;
   public static Object[] f19000;
   private static double[] f20000;
   private static double[] f21000;
   private static double[] f22000;
   private static double[] f23000;
   private static byte[] f24000;
   public static Object[] f25000;
   private static double[] f26000;
   private static double[] f27000;
   private static double[] f28000;
   private static double[] f29000;
   public static Object[] f30000;
   public static Object[] f31000;
   private static double[] f32000;
   private static double[] f33000;
   private static double[] f34000;
   private static double[] f35000;
   private static double[] f36000;
   private static double[] f37000;
   private static double[] f38000;
   public static Object[] f39000;
   private static double[] f40000;
   private static double[] f41000;
   private static double[] f42000;
   private static double[] f43000;
   private static double[] f44000;
   private static double[] f45000;
   private static double[] f46000;

   private static void m6000() {
      f32000 = new double[]{0.5, 2.0, 1.0};
      f13000 = new double[]{1.0, -2.0, 2.0, 2.0, 1.0, 1.0};
      f16000 = new double[]{0.5, 1.0, 1.0};
      f35000 = new double[]{2.0, 2.0, 1.0, 2.0, 1.0, 2.0};
      f3000 = new double[]{1.0, 1.0, 7.5625, 2.75, 1.0, 2.0};
      f45000 = new double[]{2.0, 1.5, 2.0, 0.75, 2.5, 2.25, 2.0};
      f26000 = new double[]{0.9375, 2.625};
      f42000 = new double[]{2.0, 0.984375, 0.5, 2.0, 2.0, 7.189819};
      f20000 = new double[]{2.5949095, 2.0, 2.0, 2.0, 2.0};
      f37000 = new double[]{3.5949095, 2.0, 2.0, 2.5949095, 2.0};
      f29000 = new double[]{2.0, 1.0, 2.70158};
      f22000 = new double[]{1.0, 3.0, 1.70158, 1.0, 2.0, 2.70158};
      f43000 = new double[]{3.0, 1.70158, 2.0};
      f11000 = new double[]{0.0, 1.0, 0.5, 2.0, 20.0};
      f44000 = new double[]{10.0, 2.0, 2.0, 2.0, -20.0, 10.0};
      f9000 = new double[]{2.0, 1.0, 1.0, 2.0, -10.0, 0.0};
      f21000 = new double[]{2.0, 10.0, 10.0};
      f27000 = new double[]{0.0, 1.0};
      f34000 = new double[]{0.5, 2.0, 20.0, 10.0, 20.0, 11.125, Math.PI * 4.0 / 9.0};
      f40000 = new double[]{2.0, 2.0, -20.0, 10.0, 20.0};
      f23000 = new double[]{11.125, Math.PI * 4.0 / 9.0, 2.0, 1.0};
      f18000 = new double[]{0.0, 1.0};
      f46000 = new double[]{2.0, -10.0, 10.0, 0.75, Math.PI * 2.0 / 3.0, 1.0};
      f12000 = new double[]{0.0, 1.0, -2.0, 10.0, 10.0};
      f10000 = new double[]{10.0, 10.75};
      f33000 = new double[]{Math.PI * 2.0 / 3.0, 0.5, 1.0, 1.0, 2.0};
      f4000 = new double[]{2.0, 2.0};
      f28000 = new double[]{1.0, -2.0, 2.0, 2.0, 1.0};
      f1000 = new double[]{2.0, 1.0, 1.0, 2.0, 1.0, 1.0};
      f38000 = new double[]{2.0, Math.PI, 1.0};
      f36000 = new double[]{2.0, Math.PI, 2.0, 1.0, Math.PI, 2.0, 2.0};
      f41000 = new double[]{3.0, 4.0, 5.0, 1.70158, 2.5949095, 2.70158, Math.PI * 2.0 / 3.0, Math.PI * 4.0 / 9.0};
   }

   public static Iface0659 m8000(double var0) {
      return var2 -> var2 < f32000[0]
         ? Math.pow(f32000[1], var0 - f32000[2]) * Math.pow(var2, var0)
         : f13000[0] - Math.pow(f13000[1] * var2 + f13000[2], var0) / f13000[3];
   }

   private C1182() {
   }

   static {
      ntfClinit();
   }

   private static void m24000() {
      f14000 = new Object[]{1.70158, 2.5949095, 2.70158, Math.PI * 2.0 / 3.0, Math.PI * 4.0 / 9.0, null, null};
      f25000 = new Object[]{null, null, null, null, null, null};
      f31000 = new Object[]{null, null};
      f30000 = new Object[]{null, null, null, null, null, null, null, null};
      f39000 = new Object[]{null, null, null, null, null, null, null, null};
      f19000 = new Object[]{null, null, null, null, null};
   }

   private static void m50000() {
      f24000 = new byte[]{5, 2};
      f8000 = new byte[]{6, 2, 3, 2, 3, 3};
      f7000 = new byte[]{4, 4, 5, 4, 5, 5, 2, 3};
      f6000 = new byte[]{4, 5, 6, 7, 2};
      f2000 = new byte[]{3, 4, 5};
      f15000 = new byte[]{6, 7};
      f17000 = new byte[]{2, 3, 4, 7, 2};
      f5000 = new byte[]{3, 4, 6, 2, 8, 8, 5};
   }

   public static Iface0659 m56000(int var0) {
      return m62000(var0);
   }

   public static Iface0659 m58000(double var0) {
      return var2 -> f13000[4] - Il0tlp0l<"hytkrqvv",557904881,1060047948,1060047947,1060047946,484481267>(f13000[5] - var2, var0);
   }

   public static Iface0659 m62000(double var0) {
      return var2 -> Il0tlp0l<"hytkrqvv",557904881,1060047948,1060047947,1060047946,484481267>(var2, var0);
   }

   public static Iface0659 m68000(int var0) {
      return m58000(var0);
   }
}
