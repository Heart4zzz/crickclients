package rw.setting;

import rw.core.Base1148;
import rw.core.C1188;
import rw.data.Rec0215;
import rw.gui.C0110;

public class C0114 extends Base1148<C0110> {
   private static String[] f1000;

   public C0114(C0110 var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof Rec0215 var2) {
         C0106.m32000(C1188.m12000(f1000[0]));
      }
   }

   private static void m4000() {
      f1000 = new String[]{"irc-ping"};
   }
}
