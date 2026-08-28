package rw.core;

import java.util.ArrayList;
import java.util.List;
import rw.NursultanClient;
import rw.api.Iface0642;
import rw.defs.Enum0081;

public abstract class OlqsjOqn<T extends WaypointXPart> {
   public Object[] f1000;

   public OlqsjOqn() {
      this.m4000();
      ArrayList var5 = new ArrayList();
      this.f1000[0] = var5;
      NursultanClient.m8000().m32000(this);
      NursultanClient.m8000().m54000(C0721.class, var1 -> ((List)this.f1000[0]).removeIf(WaypointXPart::m22000));
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m6000(T var1) {
      ((List)this.f1000[0]).remove(var1);
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public abstract void m14000(C0704 var1);

   public void m16000(T var1) {
      ((List)this.f1000[0]).add(var1);
   }

   public List<T> m18000() {
      return (List<T>)this.f1000[0];
   }

   @Iface0642
   public abstract void m20000(C0721 var1);

   @Iface0642(
      y = Enum0081.AFTER
   )
   public abstract void m24000(C0138 var1);
}
