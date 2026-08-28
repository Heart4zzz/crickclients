package rw.setting;

import java.util.Objects;
import rw.api.Iface0598;
import rw.api.NestMembersX;
import rw.core.C0823;
import rw.core.NsVe;

public class IlrmOrp implements Iface0598 {
   public Object[] f1000;
   private static String[] f2000;

   @Override
   public rw.core.C0012 m2000() {
      return (rw.core.C0012)this.f1000[1];
   }

   IlrmOrp(int var1, rw.core.C0012 var2) {
      this.m14000();
      Integer var7 = -1;
      this.f1000[2] = var7;
      Integer var8 = var1;
      this.f1000[0] = var8;
      rw.core.C0012 var9 = Objects.requireNonNull(var2, f2000[0]);
      this.f1000[1] = var9;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new String[]{"source"};
   }

   private void m14000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[0] = 0;
         var1[2] = 0;
      }
   }

   public int m22000() {
      return (Integer)this.f1000[0];
   }

   public void m28000(NsVe var1) {
      NestMembersX.m4000().m8000((Integer)this.f1000[0] - 33984, var1.m10000((Integer)this.f1000[2]));
   }

   public void m30000(C0823 var1) {
      Integer var6 = var1.m18000((rw.core.C0012)this.f1000[1]);
      this.f1000[2] = var6;
   }

   @Override
   public int a_() {
      return (Integer)this.f1000[2];
   }
}
