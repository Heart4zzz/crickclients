package rw.core;

import KDFzREm.NQa;
import KDFzREm.NQo;
import rw.gui.HolyHelper;
import rw.setting.Base0124;

public class C1028 extends Base0124 {
   private static String[] f1000;

   public C1028(HolyHelper var1, String var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new String[]{"Стан", "STUN_STAR"};
   }

   public String m2000() {
      return f1000[0];
   }

   public NQo m4000() {
      return NQa.Gg.E();
   }

   public String m6000() {
      return f1000[1];
   }
}
