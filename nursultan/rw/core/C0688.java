package rw.core;

import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nrm;
import rw.gui.NoSlow;
import rw.module.IltOkpln;

public class C0688 extends Base0682 {
   private static float[] f1000;

   private static void m2000() {
      f1000 = new float[]{1.0F};
   }

   public C0688(NoSlow var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m6000(Object var1) {
      switch (var1) {
         case IltOkpln var4:
            if (this.m10000()) {
               var4.N();
            }
            break;
         case C0904 var5:
            if (this.m10000()) {
               var5.m22000(f1000[0]);
            }
            break;
         case C0721 var6:
            if (!((NNNwS)((NNuU)this.N[0]).T[4]).method_6115() || !((NNNwS)((NNuU)this.N[0]).T[4]).k()) {
               return;
            }

            if (!this.m10000()) {
               return;
            }

            C0983 var7 = C0989.m28000();
            ((NNNZZ)((NNuU)this.N[0]).T[2])
               .N(
                  (NNNZg)((NNuU)this.N[0]).T[3],
                  var2 -> new Nrm(
                     ((NNNwS)((NNuU)this.N[0]).T[4]).method_6058() == NbL.field_5808 ? NbL.field_5810 : NbL.field_5808, var2, var7.m38000(), var7.m68000()
                  )
               );
            return;
         default:
      }
   }

   private NQo m8000(NbL var1) {
      return var1 == NbL.field_5810 ? ((NNNwS)((NNuU)this.N[0]).T[4]).method_6047() : ((NNNwS)((NNuU)this.N[0]).T[4]).method_6079();
   }

   private boolean m10000() {
      return (boolean)(!this.m12000(this.m8000(((NNNwS)((NNuU)this.N[0]).T[4]).method_6058())) ? 1 : 0);
   }

   private boolean m12000(NQo var1) {
      return (boolean)(C1193.m24000(var1) != 0 ? 1 : 0);
   }
}
