package rw.core;

import KDFzREm.NNSO;
import KDFzREm.NQo;
import KDFzREm.NkG;
import KDFzREm.Nwn;

public class OltqnsOqt implements NNSO {
   private static boolean[] f1000;
   private static short[] f2000;
   public Object[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public OltqnsOqt(Nwn var1) {
      this.m4000();
      this.f3000[f2000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f1000[1]];
         Object[] var1 = this.f3000;
      }
   }

   private static void m6000() {
      short[] var128 = new short[5];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = 3;
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = 3;
   }

   public NQo m10000() {
      return ((NkG)((Nwn)this.f3000[f2000[1]]).fields_07fa3311b0e9d3e9b883d09222919bf5a[f2000[2]]).M();
   }

   public boolean m12000(NQo var1) {
      ((NkG)((Nwn)this.f3000[f2000[3]]).fields_07fa3311b0e9d3e9b883d09222919bf5a[f2000[4]]).N(var1);
      return f1000[0];
   }
}
