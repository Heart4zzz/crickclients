package rw.module;

import KDFzREm.NbL;
import rw.Module;

public class OpenWalls extends Module {
   private static short[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   public static Object[] f4000;

   public NbL m4000() {
      this.m6000();
      return (NbL)this.f2000[f1000[3]];
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[1]];
         Object[] var1 = this.f2000;
      }
   }

   public OpenWalls() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f4000 = new Object[f3000[2]];
   }

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   public static OpenWalls m8000(NbL var0) {
      ((OpenWalls)f4000[f1000[0]]).f2000[f1000[1]] = var0;
      return (OpenWalls)f4000[f1000[2]];
   }

   private static void m10000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }
}
