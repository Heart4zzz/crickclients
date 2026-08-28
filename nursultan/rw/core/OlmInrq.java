package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NjL;
import java.util.List;
import java.util.function.Predicate;
import rw.gui.AttackAura;

public class OlmInrq implements Predicate<NbK> {
   public Object[] f1000;

   OlmInrq(AttackAura var1) {
      this.m8000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public boolean m10000(NbK var1) {
      if (var1 == null
         || var1.method_73183() != (NNNZg)AttackAura.m114000((AttackAura)this.f1000[0]).T[3]
         || !var1.method_5805()
         || var1 == ((NNNwS)AttackAura.m12000((AttackAura)this.f1000[0]).T[4]).method_5854()) {
         return (boolean)0;
      } else if (var1 instanceof NjL var2) {
         if (((List)((C1003)((AttackAura)this.f1000[0]).f9000[1]).i()).stream().noneMatch(var1x -> var1x.m4000(var2))) {
            return (boolean)0;
         } else if (!((AttackAura)this.f1000[0]).m150000(var2)) {
            return (boolean)0;
         } else {
            double var3 = ((AttackAura)this.f1000[0]).m72000();
            NXi var5 = ((Base0764)((C1000)((AttackAura)this.f1000[0]).f9000[3]).i()).m30000(var2, var3);
            NXi var6 = ((NNNwS)AttackAura.m146000((AttackAura)this.f1000[0]).T[4]).method_33571();
            NXi var7 = C0989.m30000(var5).m28000().L(var3).i(var6);
            if (C1176.m54000(var6, var7, var1)) {
               return (boolean)0;
            } else {
               return (boolean)(!((AttackAura)this.f1000[0]).m68000() && ((AttackAura)this.f1000[0]).m142000(var5, var1) ? 0 : 1);
            }
         }
      } else {
         return (boolean)0;
      }
   }
}
