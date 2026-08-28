package rw.module;

import KDFzREm.NGa;
import rw.Module;

public class Module024 extends Module {
   private static short[] f1000;
   private static boolean[] f2000;
   public static Object[] f3000;
   public Object[] f4000;

   public NGa m2000() {
      this.m2000();
      return (NGa)this.f4000[f1000[3]];
   }

   private static void m6000() {
      f3000 = new Object[f2000[2]];
   }

   public Module024() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f2000[1]];
         Object[] var1 = this.f4000;
      }
   }

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   public static Module024 m8000(NGa var0) {
      ((Module024)f3000[f1000[0]]).f4000[f1000[1]] = var0;
      return (Module024)f3000[f1000[2]];
   }

   private static void m12000() {
      boolean[] var128 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }
}
