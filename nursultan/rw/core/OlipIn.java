package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NbL;
import KDFzREm.NjL;
import java.util.Arrays;
import java.util.List;

public class OlipIn extends Base0785 {
   private static short[] f1000;
   private static float[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;

   private static void m2000() {
      f4000 = new boolean[]{false, true};
   }

   public OlipIn(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new short[]{4, 0};
   }

   private static void m10000() {
      f2000 = new float[]{0.0F, 3.0F, 20.0F, 2.0F};
   }

   private float m16000(NjL var1) {
      float var2 = f2000[0];
      var2 += ((NNNwS)NNuU.Nq().T[f1000[0]]).method_5739(var1) / f2000[1];
      var2 += var1.method_6032() / f2000[2];
      long var3 = Arrays.stream(NbL.values()).filter(var1x -> ((List)f3000[f1000[1]]).contains(var1.method_5998(var1x).B())).count();
      return var2 + (float)var3 / f2000[3];
   }

   public int m20000(NjL var1, NjL var2) {
      return Float.compare(this.m16000(var1), this.m16000(var2));
   }

   private static void m4000() {
      f3000 = new Object[]{null};
   }
}
