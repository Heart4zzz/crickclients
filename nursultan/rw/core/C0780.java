package rw.core;

import KDFzREm.NCM;
import KDFzREm.NCz;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nkq;
import KDFzREm.Nrm;
import KDFzREm.Nxl;
import java.util.List;
import rw.gui.AutoJoin;
import rw.module.AutoAccept;

public class C0780 extends Base0786 {
   private static String[] f1000;

   private static void m4000() {
      f1000 = new String[]{"Хаб", "⚔ Дуэли 1.16.5 ⚔"};
   }

   public C0780(AutoJoin var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      int var1 = IljlItp.m60000(NQa.jJ);
      if (!IljlItp.m36000(var1)) {
         C0892.m18000(var1);
         C0983 var2 = C0989.m28000();
         ((NNNZZ)((NNuU)this.N[0]).T[2]).N((NNNZg)((NNuU)this.N[0]).T[3], var1x -> new Nrm(NbL.field_5808, var1x, var2.m38000(), var2.m68000()));
      }
   }

   private void m10000(NCz var1) {
      if ((NNNwS)((NNuU)this.N[0]).T[4] != null && (NNNZZ)((NNuU)this.N[0]).T[2] != null) {
         List var2 = var1.L();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            NQo var4 = (NQo)var2.get(var3);
            String var5 = var4.d().getString();
            if (var5.equals(f1000[1])) {
               ((NNNZZ)((NNuU)this.N[0]).T[2]).N(var1.N(), var3, 0, Nkq.field_7790, (NNNwS)((NNuU)this.N[0]).T[4]);
               break;
            }
         }
      }
   }

   public void m14000(Object var1) {
      switch (var1) {
         case AutoAccept var4:
            this.m16000(var4);
            break;
         case C0721 var5:
            if (((NNNwS)((NNuU)this.N[0]).T[4]).field_6012 % 10 == 0) {
               this.m6000();
            }
            break;
         default:
      }
   }

   private void m16000(AutoAccept var1) {
      switch (var1.m6000()) {
         case Nxl var4:
            if (!var4.N().getString().contains(f1000[0])) {
               ((NNuU)this.N[0]).execute(() -> ((AutoJoin)this.y[0]).N((boolean)0));
            }
            break;
         case NCM var5:
            ((NNuU)this.N[0]).execute(() -> {
               if ((NNNwS)((NNuU)this.N[0]).T[4] != null) {
                  this.m6000();
               }
            });
            break;
         case NCz var6:
            ((NNuU)this.N[0]).execute(() -> this.m10000(var6));
            break;
         default:
      }
   }
}
