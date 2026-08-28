package rw.module;

import KDFzREm.kh;
import rw.Module;

public class Nametags extends Module {
   private static boolean[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static short[] f4000;

   public kh m4000() {
      this.m6000();
      return (kh)this.f2000[f4000[3]];
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[1]];
         Object[] var1 = this.f2000;
      }
   }

   public Nametags() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      short[] var128 = new short[4];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
   }

   private static void m4000() {
      f3000 = new Object[f1000[2]];
   }

   public static Nametags m8000(kh var0) {
      ((Nametags)f3000[f4000[0]]).f2000[f4000[1]] = var0;
      return (Nametags)f3000[f4000[2]];
   }

   private static void m12000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
   }
}
