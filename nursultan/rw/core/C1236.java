package rw.core;

import rw.NursultanClient;
import rw.api.Iface0642;
import rw.defs.Enum0081;
import rw.module.AttackAura_x_x;
import rw.module.AutoAccept;
import rw.module.Blink;

public class C1236 {
   public Object[] f1000;

   public C1236() {
      this.m6000();
      C1241 var5 = NursultanClient.m60000();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m8000(C0719 var1) {
      ((C1227)((C1241)this.f1000[0]).f1000[2]).m8000((C1241)this.f1000[0]);
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m10000(OltqiIqs var1) {
      ((C1227)((C1241)this.f1000[0]).f1000[2]).m26000(var1, (C1241)this.f1000[0]);
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m12000(Blink var1) {
      if (!var1.y()) {
         ((C1227)((C1241)this.f1000[0]).f1000[2]).m36000(var1, (C1241)this.f1000[0]);
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m14000(AutoAccept var1) {
      if (!var1.y()) {
         ((C1227)((C1241)this.f1000[0]).f1000[2]).m40000(var1, (C1241)this.f1000[0]);
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m16000(C0700 var1) {
      ((C1227)((C1241)this.f1000[0]).f1000[2]).m42000((C1241)this.f1000[0]);
   }

   @Iface0642(
      y = Enum0081.LISTENER
   )
   public void m20000(AttackAura_x_x var1) {
      ((C1227)((C1241)this.f1000[0]).f1000[2]).m24000(var1, (C1241)this.f1000[0]);
   }
}
