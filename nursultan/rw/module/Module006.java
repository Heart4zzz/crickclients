package rw.module;

import KDFzREm.NCa;
import rw.Module;

public class Module006 extends Module {
   private static short[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;
   public static Object[] f4000;

   public NCa m2000() {
      this.m6000();
      return (NCa)this.f3000[f1000[3]];
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[1]];
         Object[] var1 = this.f3000;
      }
   }

   public Module006() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   public static Module006 m8000(NCa var0) {
      ((Module006)f4000[f1000[0]]).f3000[f1000[1]] = var0;
      return (Module006)f4000[f1000[2]];
   }

   private static void m10000() {
      f4000 = new Object[f2000[2]];
   }
}
