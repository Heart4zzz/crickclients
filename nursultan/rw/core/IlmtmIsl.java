package rw.core;

import KDFzREm.NAN;
import KDFzREm.NAd;
import KDFzREm.NNaI;
import KDFzREm.NNag;
import KDFzREm.NPh;
import rw.api.Iface0605;

public class IlmtmIsl implements Iface0605 {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f1000 = new String[]{" ⇨ ", "Nursultan"};
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new Object[]{null};
   }

   public NNag m14000() {
      NNag var1 = NAN.y(f1000[0]).y(NAd.N.N(NNaI.N(NPh.field_1080)));
      return NAN.y(f1000[1]).y(var1);
   }
}
