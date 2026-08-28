package rw.core;

import KDFzREm.NNSO;
import KDFzREm.NQo;
import KDFzREm.NkS;
import KDFzREm.Nwn;
import KDFzREm.Nww;

public class C0666 implements NNSO {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static byte[] f4000;
   public Object[] f5000;
   private static boolean[] f6000;

   private static void m2000() {
      short[] var128 = new short[2];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[6];
      f3000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      f3000[4] = 2;
      f3000[5] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = (short)((1 | -1) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
   }

   public C0666(Nwn var1, int var2) {
      this.m10000();
      this.f5000[f1000[0]] = var1;
      Integer var8 = var2;
      this.f5000[f1000[1]] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 2;
   }

   private static void m8000() {
      boolean[] var128 = new boolean[3];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[2] = (boolean)((0 | -0) >>> 31);
   }

   private void m10000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f4000[0]];
         Object[] var1 = this.f5000;
         var1[f6000[1]] = Integer.valueOf(f6000[2]);
      }
   }

   public boolean m14000(NQo var1) {
      ((NkS)((Nwn)this.f5000[f3000[3]]).fields_07fa3311b0e9d3e9b883d09222919bf5a[f3000[4]]).T().method_5447((Integer)this.f5000[f3000[5]], var1);
      ((NkS)((Nwn)this.f5000[f2000[0]]).fields_07fa3311b0e9d3e9b883d09222919bf5a[f2000[1]])
         .y((Nww)((Nwn)this.f5000[f2000[2]]).fields_07fa3311b0e9d3e9b883d09222919bf5a[f2000[3]]);
      return f6000[0];
   }

   public NQo m18000() {
      return ((NkS)((Nwn)this.f5000[f3000[0]]).fields_07fa3311b0e9d3e9b883d09222919bf5a[f3000[1]]).T().method_5438((Integer)this.f5000[f3000[2]]);
   }
}
