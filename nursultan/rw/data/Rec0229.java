package rw.data;

import KDFzREm.NYj;

public record Rec0229() {
   public long f1000;
   private static boolean[] f2000;
   public NYj f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[4];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
   }

   public Rec0229(NYj var1, long var2) {
      this.f3000 = var1;
      this.f1000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      if (this == var1) {
         return f2000[0];
      } else if (var1 instanceof Rec0229 var2) {
         return this.f3000.u == var2.f3000.u ? f2000[2] : f2000[3];
      } else {
         return f2000[1];
      }
   }

   public NYj m6000() {
      return this.f3000;
   }

   public long m10000() {
      return this.f1000;
   }
}
