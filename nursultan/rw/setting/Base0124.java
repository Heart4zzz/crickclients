package rw.setting;

import rw.core.Base1035;
import rw.gui.HolyHelper;

public abstract class Base0124 extends Base1035 {
   private static String[] f1000;

   public Base0124(HolyHelper var1, String var2) {
      super(var1, var2, f1000[0], f1000[1]);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new String[]{"pyrotechnic-item", "name"};
   }
}
