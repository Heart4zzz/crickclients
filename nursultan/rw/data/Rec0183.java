package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0183() {
   public int[] f1000;
   public int[] f2000;
   private static boolean[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   Rec0183(int[] var1, int[] var2) {
      this.f2000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0183,"lines;cubes",Rec0183::f2000,Rec0183::f1000>(this, var1);
   }

   boolean m6000() {
      return this.f2000.length == 0 && this.f1000.length == 0 ? f3000[0] : f3000[1];
   }

   public int[] m8000() {
      return this.f2000;
   }

   public int[] m12000() {
      return this.f1000;
   }
}
