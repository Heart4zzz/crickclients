package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.gui.SprintReset;
import rw.module.AttackAura_x_x;

public class C0797 extends Base0795 {
   public C0797(SprintReset var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof AttackAura_x_x var2) {
         ((NNNwS)((NNuU)this.N[0]).T[4]).method_5728((boolean)0);
         var2.m10000((boolean)0);
      }
   }

   public int m2000() {
      return 1;
   }

   public boolean m6000() {
      return (boolean)0;
   }
}
