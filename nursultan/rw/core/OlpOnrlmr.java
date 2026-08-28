package rw.core;

import KDFzREm.NNNNRZ;
import KDFzREm.NNNNUL;
import KDFzREm.NNNNUY;
import KDFzREm.NNNNin;
import KDFzREm.NNNNuc;
import KDFzREm.NNNbw;
import KDFzREm.NNNwS;
import KDFzREm.NNcO;
import KDFzREm.NNck;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.Nbx;
import KDFzREm.NgZ;
import KDFzREm.Ngj;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Comparator;
import java.util.Optional;
import org.apache.commons.lang3.mutable.MutableFloat;
import rw.data.Rec0208;
import rw.defs.Enum0092;

public class OlpOnrlmr {
   public static Object[] f1000;
   private static short[] f2000;
   private static double[] f3000;
   private static boolean[] f4000;
   private static String[] f5000;
   private static float[] f6000;
   private static byte[] f7000;

   private static void m4000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = 2;
   }

   private static void m6000() {
      boolean[] var128 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
   }

   private OlpOnrlmr() {
      throw new UnsupportedOperationException(f5000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f5000 = new String[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private static void m14000() {
      short[] var128 = new short[6];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = 4;
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = 4;
      f2000[5] = (short)((1 | -1) >>> 31);
   }

   private static void m18000() {
      f1000 = new Object[f7000[1]];
   }

   public static Optional<Rec0208> m28000(Enum0092 var0) {
      Optional var1 = IljlItp.m6000(var0.m30000())
         .sorted(
            Comparator.<Rec0208>comparingDouble(var0x -> var0x.m6000().P() - var0x.m6000().s())
               .thenComparingDouble(var1x -> -m54000(var1x.m6000(), var0.m44000()))
               .thenComparingDouble(var0x -> -C1193.m42000(var0x.m6000(), Ngj.G))
         )
         .max(Comparator.comparingDouble(var1x -> m50000(var0.m44000(), var1x.m6000())));
      if (var1.isEmpty()) {
         return var1;
      } else {
         return var0 != (Enum0092)Enum0092.f6000[f2000[0]] && m40000(var0, ((Rec0208)var1.get()).m6000()) ? Optional.empty() : var1;
      }
   }

   public static boolean m40000(Enum0092 var0, NQo var1) {
      return m50000(var0.m44000(), ((NNNwS)((NNuU)f1000[f2000[1]]).T[f2000[2]]).method_6118(var0.m44000())) >= m50000(var0.m44000(), var1)
         ? f4000[0]
         : f4000[1];
   }

   private static void m42000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f6000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   private static double m50000(Nbx var0, NQo var1) {
      if (var1.R()) {
         return f3000[2];
      } else {
         MutableFloat var2 = new MutableFloat(f6000[0]);
         NNNNin var3 = (NNNNin)var1.a_(NNNNRZ.P, NNNNin.N);

         for (Entry var5 : var3.y()) {
            ((NgZ)((NNNbw)var5.getKey()).N())
               .N(NNNNUL.L)
               .forEach(
                  var2x -> var2.setValue(
                     ((NNNNUY)var2x.N()).N(var5.getIntValue(), ((NNNwS)((NNuU)f1000[f2000[3]]).T[f2000[4]]).method_59922(), var2.floatValue())
                  )
               );
         }

         ((NNNNuc)var1.a_(NNNNRZ.b, NNNNuc.N))
            .y()
            .stream()
            .filter(var1x -> (var1x.N() == NNcO.y || var1x.N() == NNcO.L) && var1x.L().y(var0) ? f4000[2] : f4000[3])
            .map(var0x -> var0x.y().y())
            .forEach(var2::add);
         return var2.doubleValue();
      }
   }

   private static double m54000(NQo var0, Nbx var1) {
      return var0.L(NNNNRZ.b)
         ? ((NNNNuc)var0.method_58694(NNNNRZ.b))
            .y()
            .stream()
            .filter(var1x -> var1x.L().y(var1))
            .mapToDouble(var0x -> ((NNck)f1000[f2000[5]]).L(var0x.N()))
            .max()
            .orElse(f3000[0])
         : f3000[1];
   }

   private static void m60000() {
      double[] var128 = new double[3];
      f3000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f3000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f3000[2] = Double.longBitsToDouble(0L);
   }
}
