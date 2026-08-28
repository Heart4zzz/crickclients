package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNag;
import KDFzREm.Nog;
import rw.data.IlsIijm;

public class C0585 {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static boolean[] f5000;

   private static void m2000() {
      short[] var128 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[6];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((0 | -0) >>> 31);
   }

   public C0585(String var1, IlsIijm[] var2) {
      this.m6000();
      this.f2000[f4000[0]] = var1;
      this.f2000[f4000[1]] = var2;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m8000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   private static void m14000() {
      boolean[] var128 = new boolean[4];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((0 | -0) >>> 31);
   }

   public NAN m16000(Nog var1, boolean var2) {
      if (((IlsIijm[])this.f2000[f4000[2]]).length != 0 && var2) {
         int var3 = ((IlsIijm[])this.f2000[f4000[4]])[f5000[0]].m6000();
         NNag var4 = NAN.y(((String)this.f2000[f1000[0]]).substring(f5000[1], ((IlsIijm[])this.f2000[f1000[1]])[f5000[2]].m6000()));
         IlsIijm[] var5 = (IlsIijm[])this.f2000[f1000[2]];
         int var6 = var5.length;

         for (int var7 = f5000[3]; var7 < var6; var7++) {
            IlsIijm var8 = var5[var7];
            NAN var9 = var8.m10000(var1);
            if (var3 < var8.m6000()) {
               var4.i(((String)this.f2000[f1000[3]]).substring(var3, var8.m6000()));
            }

            var4.y(var9);
            var3 = var8.m8000();
         }

         if (var3 < ((String)this.f2000[f1000[4]]).length()) {
            var4.i(((String)this.f2000[f1000[5]]).substring(var3));
         }

         return var4;
      } else {
         return NAN.y((String)this.f2000[f4000[3]]);
      }
   }
}
