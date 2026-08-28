package rw.data;

import KDFzREm.NFv;
import KDFzREm.NNNwr;
import java.lang.runtime.ObjectMethods;

public record Rec0149() {
   private static byte[] f1000;
   public NNNwr f2000;
   public String f3000;

   private static void m2000() {
      byte[] var128 = new byte[2];
      f1000[(0 | -0) >>> 31] = 16;
      f1000[(1 | -1) >>> 31] = 16;
   }

   public Rec0149(String var1, NNNwr var2) {
      this.f3000 = var1;
      this.f2000 = var2;
   }

   public Rec0149(NFv var1) {
      this(var1.u(f1000[0]), NNNwr.N(var1));
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0149,"name;signature",Rec0149::f3000,Rec0149::f2000>(this, var1);
   }

   public String m6000() {
      return this.f3000;
   }

   public NNNwr m10000() {
      return this.f2000;
   }

   public void m12000(NFv var1) {
      var1.N(this.f3000, f1000[1]);
      NNNwr.N(var1, this.f2000);
   }
}
