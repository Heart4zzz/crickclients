package rw.core;

import KDFzREm.NNNGo;
import KDFzREm.NNNbF;
import KDFzREm.NNNoB;
import KDFzREm.NpC;
import KDFzREm.NpG;

public class C1185 {
   public static Object[] f1000;
   private static String[] f2000;

   private C1185() {
      throw new UnsupportedOperationException(f2000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[]{null, null};
   }

   private static void m10000() {
      f2000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static NNNbF<NpC> m12000() {
      if ((NNNbF)f1000[1] == null) {
         NNNbF var4 = m20000().N(NpG.N);
         f1000[1] = var4;
      }

      return (NNNbF<NpC>)f1000[1];
   }

   public static NNNGo m20000() {
      if ((NNNGo)f1000[0] == null) {
         NNNGo var4 = NNNoB.N();
         f1000[0] = var4;
      }

      return (NNNGo)f1000[0];
   }
}
