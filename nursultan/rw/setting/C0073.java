package rw.setting;

import KDFzREm.NNNBL;
import KDFzREm.NNSB;
import KDFzREm.NNSR;
import KDFzREm.NNSi;
import KDFzREm.NNSu;
import KDFzREm.NNSy;
import KDFzREm.NNSz;
import KDFzREm.NUZ;

public class C0073 extends NUZ {
   private final NNNBL f1000;
   private final NNNBL f2000;

   public C0073(NNNBL var1) {
      super(var1);
      this.f1000 = var1.y("root");
      this.f2000 = this.f1000.y("shell");
   }

   public static NNSR m2000() {
      NNSB var0 = L();
      NNSz var1 = var0.N();
      NNSz var2 = var1.N("root", NNSi.L(), NNSy.N(0.0F, 29.0F, -6.0F));
      NNSz var3 = var2.N(
         "shell",
         NNSi.L()
            .N(0, 0)
            .N(-7.0F, -10.0F, -7.0F, 14.0F, 10.0F, 16.0F, new NNSu(0.01F))
            .N(0, 26)
            .N(-7.0F, 0.0F, -7.0F, 14.0F, 8.0F, 20.0F, new NNSu(0.01F))
            .N(48, 26)
            .N(-7.0F, 0.0F, 6.0F, 14.0F, 8.0F, 0.0F, new NNSu(0.0F)),
         NNSy.N(0.0F, -13.0F, 5.0F)
      );
      return NNSR.N(var0, 128, 128);
   }
}
