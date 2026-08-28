package rw.core;

import KDFzREm.NNNzb;
import KDFzREm.NNNzv;
import java.util.Objects;

public class C1194 extends NNNzb {
   private static boolean[] f1000;
   private static byte[] f2000;

   public C1194(String var1, String var2, NNNzv var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      if (!(var1 instanceof C1194 var2)) {
         return f1000[0];
      } else {
         return Objects.equals(this.y, var2.y) && Objects.equals(this.N, var2.N) ? f1000[1] : f1000[2];
      }
   }

   public int hashCode() {
      Object[] var10000 = new Object[f2000[0]];
      var10000[f1000[3]] = this.y;
      var10000[f1000[4]] = this.N;
      return Objects.hash(var10000);
   }

   private static void m4000() {
      f2000 = new byte[]{2};
   }

   private static void m6000() {
      f1000 = new boolean[]{false, true, false, false, true};
   }
}
