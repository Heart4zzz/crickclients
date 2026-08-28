package rw.data;

import KDFzREm.NNuU;
import java.lang.runtime.ObjectMethods;
import rw.NursultanClient;
import rw.api.Iface0673;

public record Rec0311() implements Iface0673 {
   public int f1000;
   private static boolean[] f2000;

   public Rec0311(int var1) {
      this.f1000 = NursultanClient.m74000().m10000() + var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0311,"delay",Rec0311::f1000>(this, var1);
   }

   public void m8000(NNuU var1) {
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public int m14000() {
      return this.f1000;
   }

   public boolean m16000(NNuU var1) {
      return NursultanClient.m74000().m10000() > this.f1000 ? f2000[0] : f2000[1];
   }
}
