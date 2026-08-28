package rw.core;

import KDFzREm.NQa;
import KDFzREm.NQo;
import rw.gui.HolyHelper;
import rw.setting.Kringeitems;

public class ExplosiveStuff extends Kringeitems {
   private static String[] f1000;

   public ExplosiveStuff(HolyHelper var1, String var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new String[]{"Взрывная штучка", "ExplosiveStuff"};
   }

   public String m2000() {
      return f1000[0];
   }

   public NQo m4000() {
      return NQa.GZ.E();
   }

   public String m6000() {
      return f1000[1];
   }
}
