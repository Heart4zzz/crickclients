package rw.core;

import KDFzREm.NbK;

public class C1141 extends Base1156 {
   public C1141(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   public boolean m6000(NbK var1) {
      if (this.U()) {
         return (boolean)1;
      } else {
         return (boolean)(!C1140.m16000().test(var1) ? 1 : 0);
      }
   }
}
