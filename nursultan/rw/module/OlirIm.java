package rw.module;

import rw.Module;

public class OlirIm extends Module {
   public static Object[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static byte[] f4000;
   private static short[] f5000;

   public int m2000() {
      this.m2000();
      return (Integer)this.f2000[f5000[5]];
   }

   private static void m6000() {
      boolean[] var128 = new boolean[6];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((1 | -1) >>> 31);
   }

   public OlirIm() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[7];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = (short)((0 | -0) >>> 31);
      f5000[5] = (short)((0 | -0) >>> 31);
      f5000[6] = (short)((1 | -1) >>> 31);
   }

   private static void m10000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 2;
   }

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f4000[0]];
         Object[] var1 = this.f2000;
         var1[f3000[1]] = Integer.valueOf(f3000[2]);
         var1[f3000[3]] = Integer.valueOf(f3000[4]);
      }
   }

   public int m14000() {
      this.m2000();
      return (Integer)this.f2000[f5000[6]];
   }

   public static OlirIm m16000(int var0, int var1) {
      OlirIm var10000 = (OlirIm)f1000[f5000[0]];
      Integer var6 = var0;
      var10000.f2000[f5000[1]] = var6;
      var10000 = (OlirIm)f1000[f5000[2]];
      Integer var7 = var1;
      var10000.f2000[f5000[3]] = var7;
      return (OlirIm)f1000[f5000[4]];
   }

   private static void m18000() {
      f1000 = new Object[f3000[5]];
   }
}
