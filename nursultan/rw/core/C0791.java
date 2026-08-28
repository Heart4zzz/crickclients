package rw.core;

import rw.defs.Enum0090;

public class C0791 extends C1013 {
   public Object[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;

   private static void m2000() {
      short[] var128 = new short[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
   }

   public C0791(Enum0090 var1, String var2, boolean var3) {
      super(var2, var3);
      this.m4000();
      this.f1000[f2000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[0]];
         Object[] var1 = this.f1000;
      }
   }

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
