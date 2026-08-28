package rw.module;

import KDFzREm.NNty;
import KDFzREm.NbL;
import rw.Module;

public class NoInteract extends Module {
   private static short[] f1000;
   private static byte[] f2000;
   public Object[] f3000;
   private static boolean[] f4000;
   public static Object[] f5000;

   public NNty m2000() {
      this.m6000();
      return (NNty)this.f3000[f1000[6]];
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[0]];
         Object[] var1 = this.f3000;
      }
   }

   public NoInteract() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      short[] var128 = new short[7];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = (short)((1 | -1) >>> 31);
   }

   private static void m2000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public NbL m14000() {
      this.m6000();
      return (NbL)this.f3000[f1000[5]];
   }

   public static NoInteract m16000(NbL var0, NNty var1) {
      ((NoInteract)f5000[f1000[0]]).f3000[f1000[1]] = var0;
      ((NoInteract)f5000[f1000[2]]).f3000[f1000[3]] = var1;
      return (NoInteract)f5000[f1000[4]];
   }

   private static void m18000() {
      f5000 = new Object[f4000[1]];
   }
}
