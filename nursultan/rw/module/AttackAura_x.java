package rw.module;

import KDFzREm.NbK;
import rw.Module;

public class AttackAura_x extends Module {
   private static short[] f1000;
   public static Object[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;

   public NbK m2000() {
      this.m2000();
      return (NbK)this.f4000[f1000[3]];
   }

   private static void m6000() {
      f2000 = new Object[f3000[2]];
   }

   public AttackAura_x() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[1]];
         Object[] var1 = this.f4000;
      }
   }

   private static void m4000() {
      short[] var128 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
   }

   public static AttackAura_x m8000(NbK var0) {
      ((AttackAura_x)f2000[f1000[0]]).f4000[f1000[1]] = var0;
      return (AttackAura_x)f2000[f1000[2]];
   }

   public AttackAura_x m10000(NbK var1) {
      this.m2000();
      this.f4000[f1000[4]] = var1;
      return this;
   }

   private static void m12000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }
}
