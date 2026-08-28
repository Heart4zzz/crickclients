package rw.core;

import KDFzREm.NAd;
import KDFzREm.NLz;
import KDFzREm.NNMH;
import KDFzREm.NNNGi;
import KDFzREm.NNbo;
import KDFzREm.NNuU;
import KDFzREm.xN;
import rw.data.OljOsk;

public class C0036 {
   private static float[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private static void m4000() {
      f1000 = new float[]{9.0F, 7.0F};
   }

   private static void m6000() {
      f2000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   private C0036() {
      throw new UnsupportedOperationException(f2000[0]);
   }

   static {
      ntfClinit();
   }

   public static OljOsk m24000(int var0, NAd var1) {
      NAd var2 = var1 == null ? NAd.N : var1;
      if (!(((NNMH)NNuU.Nq().i[3]).N(var0, var2) instanceof NNbo var4 && var4.N() != NNNGi.field_37899)) {
         return null;
      } else {
         return var4.u instanceof xN var5 && !var5.isClosed()
            ? new OljOsk(var5.N().N(), var4.i, var4.M, var4.R, var4.B, var4.Z, var4.z, var4.U, var4.E, var4.N().N(var2.L()))
            : null;
      }
   }

   private static void m26000() {
      f3000 = new Object[]{9.0F, 7.0F};
   }

   public static boolean m28000(NAd var0) {
      if (var0 == null) {
         return (boolean)0;
      } else {
         NLz var1 = var0.E();
         return (boolean)(var1 != NLz.y && !NLz.y.equals(var1) ? 1 : 0);
      }
   }

   public static boolean m32000(int var0) {
      return (boolean)((var0 < 57344 || var0 > 63743) && (var0 < 983040 || var0 > 1048573) && (var0 < 1048576 || var0 > 1114109) ? 0 : 1);
   }
}
