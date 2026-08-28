package rw.core;

import KDFzREm.CZ;
import KDFzREm.NNNwp;
import java.util.List;

public class C0507 implements NNNwp<T> {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;

   private static void m2000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public C0507(CZ var1, CZ var2) {
      this.m8000();
      this.f2000[f1000[0]] = var1;
      this.f2000[f1000[1]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
   }

   public List<T> m6000(String var1) {
      return ((CZ)this.f2000[f1000[2]]).N(var1);
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }

   public List<T> m14000(String var1) {
      return ((CZ)this.f2000[f1000[3]]).N(var1);
   }
}
