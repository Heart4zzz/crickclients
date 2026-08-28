package rw.core;

import KDFzREm.NDT;
import KDFzREm.NNuU;
import java.util.List;
import rw.api.Iface0673;
import rw.data.Rec0306;
import rw.data.Rec0313;
import rw.module.AttackAura_x_x;
import rw.module.AutoAccept;
import rw.module.Blink;

public class C1227 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public boolean m4000(C1241 var1) {
      return (boolean)(!((List)var1.f1000[0]).isEmpty() ? 1 : 0);
   }

   public C1227() {
      this.m2000();
      NNuU var5 = NNuU.Nq();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   public void m6000(C1241 var1) {
      ((NNuU)this.f1000[0]).NE().N(new NDT(0));
      ((List)var1.f1000[1]).removeIf(var1x -> {
         var1x.m6000((NNuU)this.f1000[0]);
         return (boolean)1;
      });
   }

   public void m8000(C1241 var1) {
   }

   public void m10000(C1241 var1) {
   }

   public void m12000(C1241 var1) {
      this.m6000(var1);
   }

   public void m14000(Iface0673 var1, C1241 var2) {
      var1.m6000((NNuU)this.f1000[0]);
   }

   public void m20000(Rec0313 var1, C1241 var2) {
      var1.m10000((NNuU)this.f1000[0]);
   }

   public void m24000(AttackAura_x_x var1, C1241 var2) {
   }

   public void m26000(OltqiIqs var1, C1241 var2) {
   }

   public void m30000(Rec0306 var1, C1241 var2) {
      var1.m12000((NNuU)this.f1000[0]);
   }

   public void m32000(C1241 var1) {
   }

   public void m34000(Iface0673 var1, C1241 var2) {
      var1.m6000((NNuU)this.f1000[0]);
   }

   public void m36000(Blink var1, C1241 var2) {
   }

   public void m40000(AutoAccept var1, C1241 var2) {
   }

   public void m42000(C1241 var1) {
   }
}
