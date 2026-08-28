package rw.core;

import rw.NursultanClient;
import rw.gui.ElytraTarget;

public class C0683 extends Base0680 {
   private static float[] f1000;

   private static void m2000() {
      f1000 = new float[]{0.0F};
   }

   public C0683(ElytraTarget var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (C1187.m22000() && NursultanClient.m74000().m10000() % (Float)((C0988)((ElytraTarget)this.N[1]).f5000[3]).i() == f1000[0]) {
         this.N((var0, var1x) -> {});
      }
   }
}
