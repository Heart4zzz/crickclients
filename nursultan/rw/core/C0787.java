package rw.core;

import rw.gui.SprintReset;
import rw.module.AttackAura_x_x;

public class C0787 extends Base0795 {
   public C0787(SprintReset var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof AttackAura_x_x var2) {
         var2.m16000((boolean)0);
         var2.m34000((boolean)1);
         var2.m10000((boolean)0);
      }
   }
}
