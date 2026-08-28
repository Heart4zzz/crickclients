package rw.core;

import KDFzREm.NXi;
import java.util.Map;
import java.util.stream.Stream;
import rw.NursultanClient;
import rw.data.IlsOnqsqi;
import rw.defs.Nuker;

public class C0951 {
   public Object[] f1000;

   public void m4000() {
      if (!((IlsIpn)this.f1000[0]).isEmpty()) {
         ((IlsIpn)this.f1000[0]).forEach(WaypointXPart::m6000);
         ((IlsIpn)this.f1000[0]).clear();
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[1]));
      }
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public C0951() {
      this.m6000();
      IlsIpn var5 = new IlsIpn();
      this.f1000[0] = var5;
      C0964 var6 = new C0964(this);
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   public Stream<String> m14000() {
      return ((IlsIpn)this.f1000[0]).stream().map(WaypointXPart::m18000);
   }

   private void m16000(WaypointXPart var1) {
      if (var1 instanceof C0970 var2 && var2.m40000()) {
         ((IlsIpn)this.f1000[0]).removeIf(var1x -> {
            if (var1x instanceof C0970 var2x && var2x.m40000() && var2x.m32000() == var2.m32000()) {
               var1x.m6000();
               return (boolean)1;
            } else {
               return (boolean)0;
            }
         });
      }
   }

   public void m20000(String var1, NXi var2, String var3) {
      this.m30000(new WaypointXPart(var1, var2, var3));
   }

   public boolean m24000(String var1) {
      boolean var2 = ((IlsIpn)this.f1000[0]).removeIf(var1x -> {
         if (var1x.m18000().equals(var1)) {
            var1x.m38000((boolean)1);
            return (boolean)1;
         } else {
            return (boolean)0;
         }
      });
      if (var2) {
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[1]));
      }

      return var2;
   }

   public IlsIpn m26000() {
      IlsIpn var1 = new IlsIpn();
      var1.addAll((IlsIpn)this.f1000[0]);
      return var1;
   }

   public void m30000(WaypointXPart var1) {
      this.m16000(var1);
      ((OlqsjOqn)((Map)this.f1000[1]).get(var1.m44000())).m16000(var1);
      if (((IlsIpn)this.f1000[0]).add(var1)) {
         NursultanClient.m8000().m12000(IlsOnqsqi.m4000((Nuker)Nuker.f1000[1]));
      }
   }
}
