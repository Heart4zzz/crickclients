package rw.core;

import rw.api.Iface0003;
import rw.api.Iface0006;
import rw.api.NestMembersX;
import rw.data.Rec0007;

public class C0023 {
   public Object[] f1000;

   C0023(int var1, int var2, Rec0007 var3, Iface0003 var4, Iface0003 var5) {
      this.m26000();
      Long var10 = System.currentTimeMillis();
      this.f1000[7] = var10;
      Integer var11 = var1;
      this.f1000[0] = var11;
      Integer var12 = var2;
      this.f1000[1] = var12;
      this.f1000[2] = var3;
      this.f1000[3] = var4;
      this.f1000[4] = var5;
   }

   static {
      ntfClinit();
   }

   public Iface0006 m16000() {
      if ((Iface0006)this.f1000[5] == null) {
         Iface0006 var5 = NestMembersX.m4000().m10000((Iface0003)this.f1000[3], (Iface0003)this.f1000[4], ((Rec0007)this.f1000[2]).m8000());
         this.f1000[5] = var5;
      }

      return (Iface0006)this.f1000[5];
   }

   public void m18000() {
      if ((Iface0006)this.f1000[5] != null) {
         ((Iface0006)this.f1000[5]).m10000();
         Object var5 = null;
         this.f1000[5] = var5;
      }

      if ((Iface0003)this.f1000[3] != null) {
         ((Iface0003)this.f1000[3]).m2000();
         Object var6 = null;
         this.f1000[3] = var6;
      }

      if ((Iface0003)this.f1000[4] != null) {
         ((Iface0003)this.f1000[4]).m2000();
         Object var7 = null;
         this.f1000[4] = var7;
      }
   }

   boolean m24000(long var1, long var3, boolean var5) {
      return (boolean)((Iface0003)this.f1000[3] != null && ((Iface0003)this.f1000[3]).m10000() && !this.f1000[6] && !var5 && var1 - this.f1000[7] > var3
         ? 1
         : 0);
   }

   private void m26000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var1 = this.f1000;
         var1[0] = 0;
         var1[1] = 0;
         var1[6] = false;
         var1[7] = 0L;
      }
   }
}
