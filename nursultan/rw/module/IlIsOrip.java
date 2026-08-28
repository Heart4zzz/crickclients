package rw.module;

import KDFzREm.Ned;
import KDFzREm.Nef;
import rw.Module;

public class IlIsOrip extends Module {
   private static boolean[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   public Object[] f4000;
   private static byte[] f5000;

   public Ned m4000() {
      this.m8000();
      return (Ned)this.f4000[f2000[5]];
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 2;
   }

   public IlIsOrip() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f5000[0]];
         Object[] var1 = this.f4000;
      }
   }

   private static void m10000() {
      short[] var128 = new short[7];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((0 | -0) >>> 31);
      f2000[6] = (short)((1 | -1) >>> 31);
   }

   private static void m2000() {
      f3000 = new Object[f1000[1]];
   }

   public Nef m14000() {
      this.m8000();
      return (Nef)this.f4000[f2000[6]];
   }

   public static IlIsOrip m16000(Ned var0, Nef var1) {
      ((IlIsOrip)f3000[f2000[0]]).f4000[f2000[1]] = var0;
      ((IlIsOrip)f3000[f2000[2]]).f4000[f2000[3]] = var1;
      return (IlIsOrip)f3000[f2000[4]];
   }

   private static void m20000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
