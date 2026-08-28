package rw.module;

import KDFzREm.NXi;
import rw.Module;

public class Speed extends Module {
   public static Object[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;
   private static short[] f4000;

   public NXi m2000() {
      this.m4000();
      return (NXi)this.f3000[f4000[3]];
   }

   private static void m6000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }

   public Speed() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new Object[f2000[2]];
   }

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[1]];
         Object[] var1 = this.f3000;
      }
   }

   public static Speed m8000(NXi var0) {
      ((Speed)f1000[f4000[0]]).f3000[f4000[1]] = var0;
      return (Speed)f1000[f4000[2]];
   }

   public void m10000(NXi var1) {
      this.m4000();
      this.f3000[f4000[4]] = var1;
   }

   private static void m12000() {
      short[] var128 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((0 | -0) >>> 31);
   }
}
