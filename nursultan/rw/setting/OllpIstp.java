package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NbL;
import KDFzREm.Nkq;
import KDFzREm.wY;
import java.util.Comparator;
import rw.NursultanClient;
import rw.core.Base0793;
import rw.core.C0892;
import rw.core.IljlItp;
import rw.data.Rec0208;
import rw.gui.ClickAction;
import rw.module.Huddumped;

public class OllpIstp extends Base0793 {
   private static String[] f1000;

   private static void m2000() {
      f1000 = new String[]{"throw-key"};
   }

   public OllpIstp(ClickAction var1) {
      super(var1, f1000[0]);
   }

   static {
      ntfClinit();
   }

   private boolean m12000() {
      if (((NNNwS)((NNuU)this.N[0]).T[4]).method_6079().B() == NQa.nz) {
         wY.N(NbL.field_5810);
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   public void m4000(Huddumped var1) {
      NursultanClient.m36000().m36000(() -> {
         if (!((NNNwS)((NNuU)this.N[0]).T[4]).method_7357().N(NQa.nz.E()) && !this.m12000()) {
            int var1x = IljlItp.m26000(NQa.nz).min(Comparator.comparingInt(var0 -> var0.m6000().I() ? 1 : 0)).map(Rec0208::m4000).orElse(-1);
            IljlItp.m50000(var1x).ifPresent(var1xx -> {
               if (IljlItp.m32000(var1xx)) {
                  C0892.m44000(var1xx);
                  wY.N(NbL.field_5808);
                  NursultanClient.m36000().m14000(3, C0892::m20000);
               } else {
                  this.m14000(var1xx);
               }
            });
         }
      });
   }

   private void m14000(int var1) {
      int var2 = ((NNNwS)((NNuU)this.N[0]).T[4]).method_31548().N();
      NursultanClient.m60000().m38000(0, var1, var2, Nkq.field_7791).m26000(var2x -> {
         wY.N(NbL.field_5808);
         NursultanClient.m36000().m14000(4, () -> NursultanClient.m60000().m38000(0, var1, var2, Nkq.field_7791).m24000());
      }).m24000();
   }
}
