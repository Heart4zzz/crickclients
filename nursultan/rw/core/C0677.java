package rw.core;

import rw.gui.ElytraTarget;

public class C0677 extends Base0680 {
   public C0677(ElytraTarget var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if ((Boolean)((ElytraTarget)this.N[1]).f5000[5] && this.N((var0, var1x) -> {})) {
         ElytraTarget var10000 = (ElytraTarget)this.N[1];
         Boolean var6 = false;
         var10000.f5000[5] = var6;
      }
   }
}
