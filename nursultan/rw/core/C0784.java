package rw.core;

import KDFzREm.NjL;
import rw.gui.AttackAura;
import rw.module.AttackAura_x_x;

public class C0784 extends C0066 {
   public C0784(AttackAura var1, String var2, boolean var3) {
      super(var1, (boolean)1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m4000(Object var1) {
      if (var1 instanceof AttackAura_x_x var2 && ((AttackAura)this.y[0]).m60000()) {
         this.m4000(var2);
      }
   }

   public boolean m2000(NjL var1) {
      return (boolean)1;
   }

   public void m4000(AttackAura_x_x var1) {
      NjL var2 = ((AttackAura)this.y[0]).m96000();
      if (this.m2000(var2)) {
         C0983 var3 = C0989.m30000(var2.method_66233().method_66265());
         C1181.m28000(var1);
         var1.m16000((boolean)1);
         C1181.m52000(var1, var3.m38000());
      }
   }
}
