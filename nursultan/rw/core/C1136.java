package rw.core;

import KDFzREm.NNNNud;
import KDFzREm.NQo;
import KDFzREm.NbK;
import KDFzREm.Nbx;
import KDFzREm.NjL;
import KDFzREm.wY;

public class C1136 extends Base1156 {
   public C1136(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   public boolean m4000(NbK var1) {
      if (this.U()) {
         return (boolean)1;
      } else if (!var1.method_5767()) {
         return (boolean)1;
      } else if (!(var1 instanceof NjL var2)) {
         return (boolean)0;
      } else {
         return (boolean)(wY.N(var2) && !this.m6000(var2) ? 0 : 1);
      }
   }

   public boolean m6000(NjL var1) {
      for (Nbx var3 : NNNNud.field_49219) {
         NQo var4 = var1.method_6118(var3);
         if (!var4.R()) {
            return (boolean)1;
         }
      }

      return (boolean)0;
   }
}
