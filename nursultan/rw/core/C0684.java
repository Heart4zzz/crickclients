package rw.core;

import rw.gui.NoSlow;
import rw.module.IltOkpln;

public class C0684 extends Base0682 {
   private static float[] f1000;

   private static void m2000() {
      f1000 = new float[]{1.0F};
   }

   public C0684(NoSlow var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      switch (var1) {
         case C0904 var4:
            var4.m22000(f1000[0]);
            break;
         case IltOkpln var5:
            var5.N();
            break;
         default:
      }
   }
}
