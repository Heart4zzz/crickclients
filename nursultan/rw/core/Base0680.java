package rw.core;

import java.util.function.BiConsumer;
import rw.NursultanClient;
import rw.gui.ElytraTarget;

public abstract class Base0680 extends Base1148<ElytraTarget> {
   public Base0680(ElytraTarget var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public boolean m10000(BiConsumer<Integer, Integer> var1) {
      if (NursultanClient.m60000().m16000()) {
         return (boolean)0;
      } else {
         C1187.m42000(() -> NursultanClient.m88000().m66000().m34000(10), var1);
         return (boolean)1;
      }
   }
}
