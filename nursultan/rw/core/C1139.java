package rw.core;

import rw.defs.Enum0082;

public class C1139 extends RuntimeException {
   public Object[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f2000[0]];
         Object[] var1 = this.f1000;
      }
   }

   public C1139(Enum0082 var1) {
      super(var1.name());
      this.m2000();
      this.f1000[f3000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      short[] var128 = new short[2];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public Enum0082 m10000() {
      return (Enum0082)this.f1000[f3000[1]];
   }
}
