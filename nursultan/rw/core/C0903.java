package rw.core;

import rw.data.OliOkkns;
import rw.defs.Enum0071;

public class C0903 {
   private static short[] f1000;
   public static Object[] f2000;
   private static short[] f3000;
   private static byte[] f4000;
   public Object[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;

   public static C0903 m4000() {
      C0903 var10000 = (C0903)f2000[f1000[0]];
      Enum0071 var4 = (Enum0071)Enum0071.f3000[f1000[1]];
      var10000.f5000[f1000[2]] = var4;
      var10000 = (C0903)f2000[f1000[3]];
      Object var5 = null;
      var10000.f5000[f1000[4]] = var5;
      return (C0903)f2000[f8000[0]];
   }

   private static OliOkkns m6000(OliOkkns var0) {
      if (var0 == null) {
         throw new IllegalArgumentException(f7000[0]);
      } else {
         return var0;
      }
   }

   private void m8000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f4000[0]];
         Object[] var1 = this.f5000;
      }
   }

   private C0903() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 2;
   }

   private static void m12000() {
      short[] var128 = new short[7];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((1 | -1) >>> 31);
      f6000[3] = (short)((0 | -0) >>> 31);
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = (short)((0 | -0) >>> 31);
      f6000[6] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[5];
      f3000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[4];
      f8000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[2] = (short)((0 | -0) >>> 31);
      f8000[3] = (short)((1 | -1) >>> 31);
   }

   private static void m14000() {
      f2000 = new Object[f9000[3]];
   }

   private static void m18000() {
      f7000 = new String[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = "friend cannot be null";
   }

   public Enum0071 m22000() {
      return (Enum0071)this.f5000[f8000[3]];
   }

   public OliOkkns m24000() {
      return (OliOkkns)this.f5000[f8000[2]];
   }

   public static C0903 m26000(OliOkkns var0) {
      C0903 var10000 = (C0903)f2000[f6000[6]];
      Enum0071 var5 = (Enum0071)Enum0071.f3000[f3000[0]];
      var10000.f5000[f3000[1]] = var5;
      var10000 = (C0903)f2000[f3000[2]];
      OliOkkns var6 = m6000(var0);
      var10000.f5000[f3000[3]] = var6;
      return (C0903)f2000[f3000[4]];
   }

   public static C0903 m30000(OliOkkns var0) {
      C0903 var10000 = (C0903)f2000[f6000[0]];
      Enum0071 var5 = (Enum0071)Enum0071.f3000[f6000[1]];
      var10000.f5000[f6000[2]] = var5;
      var10000 = (C0903)f2000[f6000[3]];
      OliOkkns var6 = m6000(var0);
      var10000.f5000[f6000[4]] = var6;
      return (C0903)f2000[f6000[5]];
   }

   public boolean m34000() {
      return (OliOkkns)this.f5000[f8000[1]] != null ? f9000[0] : f9000[1];
   }

   private static void m38000() {
      boolean[] var128 = new boolean[4];
      f9000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[2] = (boolean)((0 | -0) >>> 31);
      f9000[3] = (boolean)((1 | -1) >>> 31);
   }
}
