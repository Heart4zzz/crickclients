package rw.core;

import KDFzREm.NNNNH;
import KDFzREm.NNWd;
import KDFzREm.Ov;
import KDFzREm.af;
import KDFzREm.pN;
import KDFzREm.pP;
import KDFzREm.pz;
import java.util.function.Supplier;
import org.lwjgl.opengl.EXTDebugLabel;

class C1080 extends pN {
   public boolean m2000() {
      return true;
   }

   public void m4000(Ov var1) {
      EXTDebugLabel.glLabelObjectEXT(35656, var1.y(), NNWd.N(var1.L(), 256, true));
   }

   public void m6000(pP var1) {
      EXTDebugLabel.glLabelObjectEXT(32884, var1.N, NNWd.N(var1.y.toString(), 256, true));
   }

   public void m8000(NNNNH var1) {
      EXTDebugLabel.glLabelObjectEXT(35648, var1.method_1270(), NNWd.N(var1.method_68404(), 256, true));
   }

   public void m10000(af var1) {
      Supplier var2 = var1.L;
      if (var2 != null) {
         EXTDebugLabel.glLabelObjectEXT(37201, var1.u, NNWd.N((String)var2.get(), 256, true));
      }
   }

   public void m12000(pz var1) {
      EXTDebugLabel.glLabelObjectEXT(5890, var1.N, NNWd.N(var1.getLabel(), 256, true));
   }
}
