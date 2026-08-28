package rw.core;

import rw.gui.SprintReset;
import rw.module.AttackAura_x_x;

public class C0789 extends Base0795 {
   public C0789(SprintReset var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof AttackAura_x_x var2) {
         var2.m36000((boolean)1);
         var2.m10000((boolean)0);
      }
   }
}
