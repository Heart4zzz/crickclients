package rw.core;

import rw.module.AttackAura_x_x;

public class CameraApiPart extends Base1138 {
   public CameraApiPart(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof AttackAura_x_x var2) {
         var2.m22000((boolean)1);
      }
   }
}
