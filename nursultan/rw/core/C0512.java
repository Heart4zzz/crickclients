package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNvM;
import KDFzREm.NNNvY;
import KDFzREm.NNrm;
import KDFzREm.NNtJ;
import KDFzREm.Ncv;

public class C0512 implements NNNvY<Ncv> {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;

   private static void m2000() {
      f1000 = new boolean[]{true};
   }

   public C0512(NNtJ var1) {
      this.m12000();
      this.f2000[f3000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f3000 = new short[]{0, 0};
   }

   public NNNvM m10000(Ncv var1, NNNZg var2, double var3, double var5, double var7, double var9, double var11, double var13, NNrm var15) {
      return new C0511(var2, var3, var5, var7, var9, (NNtJ)this.f2000[f3000[1]]);
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[0]];
         Object[] var1 = this.f2000;
      }
   }
}
