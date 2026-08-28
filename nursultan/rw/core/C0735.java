package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNHL;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import KDFzREm.NYT;
import KDFzREm.Nww;

public class C0735 extends NNHL {
   private static boolean[] f1000;
   private static short[] f2000;
   public Object[] f3000;

   private void m2000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f1000[0]];
         Object[] var1 = this.f3000;
      }
   }

   public C0735(NYT var1, Nww var2, NAN var3, NNYH var4) {
      super(var1, var2, var3);
      this.m2000();
      this.f3000[f2000[0]] = var4;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m10000() {
      short[] var128 = new short[2];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   public void method_25419() {
      this.m2000();
      NNuU.Nq().N((NNYH)this.f3000[f2000[1]]);
   }
}
