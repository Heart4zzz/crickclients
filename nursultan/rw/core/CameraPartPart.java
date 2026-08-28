package rw.core;

import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NbL;
import KDFzREm.NcB;
import KDFzREm.wY;

public class CameraPartPart extends Base1138 {
   public CameraPartPart(String var1, boolean var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof C0719) {
         NcB var3 = (NcB)((NNuU)this.N[0]).M[3];
         if (var3 instanceof NNty var2) {
            wY.N(NbL.field_5810, var2);
         } else {
            wY.N(NbL.field_5810);
         }
      }
   }
}
