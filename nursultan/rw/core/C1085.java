package rw.core;

import KDFzREm.NAN;
import KDFzREm.NNuU;
import rw.api.Iface0636;

public class C1085 extends C1013 implements Iface0636 {
   private static String[] f1000;

   private static void m2000() {
      f1000 = new String[]{"Auto leave"};
   }

   public C1085(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000() {
      NNuU.Nq().NE().M().method_10747(NAN.N(f1000[0]));
   }
}
