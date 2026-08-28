package rw.module;

import KDFzREm.NbK;
import rw.Module;

public class NoEntityTrace extends Module {
   public Object[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;

   public NbK m4000() {
      this.m6000();
      return (NbK)this.f1000[f4000[3]];
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[1]];
         Object[] var1 = this.f1000;
      }
   }

   public NoEntityTrace() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m4000() {
      f2000 = new Object[f3000[2]];
   }

   public static NoEntityTrace m8000(NbK var0) {
      ((NoEntityTrace)f2000[f4000[0]]).f1000[f4000[1]] = var0;
      return (NoEntityTrace)f2000[f4000[2]];
   }

   private static void m10000() {
      short[] var128 = new short[4];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
   }
}
