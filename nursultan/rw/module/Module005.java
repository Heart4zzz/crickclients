package rw.module;

import KDFzREm.NCa;
import KDFzREm.Ned;
import rw.Module;

public class Module005 extends Module {
   private static boolean[] f1000;
   private static byte[] f2000;
   public static Object[] f3000;
   public Object[] f4000;
   private static short[] f5000;

   public Ned m4000() {
      this.m10000();
      return (Ned)this.f4000[f5000[6]];
   }

   private static void m6000() {
      f3000 = new Object[f1000[1]];
   }

   public Module005() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private void m10000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f2000[0]];
         Object[] var1 = this.f4000;
      }
   }

   private static void m2000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public NCa m14000() {
      this.m10000();
      return (NCa)this.f4000[f5000[5]];
   }

   public static Module005 m16000(NCa var0, Ned var1) {
      ((Module005)f3000[f5000[0]]).f4000[f5000[1]] = var0;
      ((Module005)f3000[f5000[2]]).f4000[f5000[3]] = var1;
      return (Module005)f3000[f5000[4]];
   }

   private static void m18000() {
      short[] var128 = new short[7];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = (short)((0 | -0) >>> 31);
      f5000[5] = (short)((0 | -0) >>> 31);
      f5000[6] = (short)((1 | -1) >>> 31);
   }
}
