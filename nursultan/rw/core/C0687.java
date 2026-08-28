package rw.core;

import rw.Module;

public class C0687 extends Base1138 {
   public C0687(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (this.U() && var1 instanceof Module var2) {
         var2.m16000();
      }
   }
}
