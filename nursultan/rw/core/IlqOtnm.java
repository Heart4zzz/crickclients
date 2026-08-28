package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNaL;

public class IlqOtnm implements NNaL {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   private static float[] f4000;
   private static boolean[] f5000;

   float m4000() {
      return ((Integer)this.f2000[f1000[4]]).intValue() * (Float)this.f2000[f1000[5]];
   }

   IlqOtnm() {
      this.m12000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f5000 = new boolean[]{true, true, true, false, true, false};
   }

   public boolean m8000(int var1, NAd var2, int var3) {
      if (var3 == f3000[0]) {
         Integer var8 = (Integer)this.f2000[f1000[2]] + f5000[1];
         this.f2000[f1000[3]] = var8;
      }

      return f5000[2];
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[1]];
         Object[] var1 = this.f2000;
         var1[f5000[3]] = f4000[0];
         var1[f5000[4]] = Integer.valueOf(f5000[5]);
      }
   }

   private static void m14000() {
      f1000 = new short[]{0, 1, 1, 1, 1, 0};
   }

   void m20000(float var1) {
      Float var6 = var1;
      this.f2000[f1000[0]] = var6;
      Integer var7 = Integer.valueOf(f5000[0]);
      this.f2000[f1000[1]] = var7;
   }

   private static void m22000() {
      f3000 = new byte[]{10, 2};
   }

   private static void m24000() {
      f4000 = new float[]{0.0F};
   }
}
