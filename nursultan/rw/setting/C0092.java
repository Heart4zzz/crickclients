package rw.setting;

import java.util.Objects;
import rw.api.Iface0599;
import rw.core.C0823;
import rw.core.NsVe;

public class C0092 implements Iface0599 {
   public Object[] f1000;
   private static String[] f2000;

   C0092(rw.core.C0012 var1, boolean var2) {
      this.m6000();
      Integer var7 = -1;
      this.f1000[2] = var7;
      rw.core.C0012 var8 = Objects.requireNonNull(var1, f2000[0]);
      this.f1000[0] = var8;
      Boolean var9 = var2;
      this.f1000[1] = var9;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[1] = false;
         var1[2] = 0;
      }
   }

   private static void m14000() {
      f2000 = new String[]{"config"};
   }

   public void m16000(NsVe var1, rw.core.C0013 var2) {
      var1.m24000((Integer)this.f1000[2]);
      var1.m18000((Integer)this.f1000[2]).m12000((Boolean)this.f1000[1]);
   }

   public rw.core.C0012 m20000() {
      return (rw.core.C0012)this.f1000[0];
   }

   public void m24000(C0823 var1) {
      Integer var6 = var1.m18000((rw.core.C0012)this.f1000[0]);
      this.f1000[2] = var6;
   }

   public boolean m26000(NsVe var1) {
      return (boolean)(var1.m16000((Integer)this.f1000[2]) != null ? 1 : 0);
   }
}
