package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.Nkq;
import rw.NursultanClient;
import rw.api.Iface0606;
import rw.data.Rec0208;
import rw.gui.PgUp;
import rw.gui.QuickUse;
import rw.module.Huddumped;

public class C0746 {
   private static byte[] f1000;
   private static byte[] f2000;
   public Object[] f3000;

   public void m4000() {
      Integer var5 = (Integer)this.f3000[6] - 1;
      this.f3000[6] = var5;
      if ((Integer)this.f3000[6] == 0) {
         this.m22000();
      }
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[2]];
         Object[] var1 = this.f3000;
         var1[f2000[3]] = 0;
         var1[f2000[4]] = 0;
         var1[f2000[5]] = 0;
      }
   }

   public C0746(Iface0606 var1, String var2, QuickUse var3) {
      this.m6000();
      Integer var8 = -1;
      this.f3000[4] = var8;
      Integer var9 = -1;
      this.f3000[5] = var9;
      Integer var10 = -1;
      this.f3000[6] = var10;
      this.f3000[1] = var1;
      NNuU var12 = var3.W();
      this.f3000[3] = var12;
      this.f3000[0] = var3;
      C1006 var14 = rw.setting.C0122.m14000(var3, var2, (PgUp)PgUp.f4000[0]);
      this.f3000[2] = var14;
   }

   static {
      ntfClinit();
   }

   public void m12000() {
      Rec0208 var1 = IljlItp.m48000((Iface0606)this.f3000[1]);
      if (var1 != null) {
         int var2 = var1.m4000();
         NQo var3 = ((NNNwS)((NNuU)this.f3000[3]).T[4]).method_31548().method_5438(var2);
         if (!((NNNwS)((NNuU)this.f3000[3]).T[4]).method_7357().N(var3)) {
            int var4 = var1.m4000();
            if (!IljlItp.m32000(var2)) {
               var4 = ((NNNwS)((NNuU)this.f3000[3]).T[4]).method_31548().M();
               Integer var9 = var4;
               this.f3000[5] = var9;
               NursultanClient.m60000().m38000(0, var2, var4, Nkq.field_7791).m26000(var1x -> this.m26000((Integer)this.f3000[5])).m24000();
               Integer var10 = var2;
               this.f3000[4] = var10;
            } else {
               this.m26000(var4);
            }
         }
      }
   }

   public void m16000() {
      Integer var5 = 4;
      this.f3000[6] = var5;
      QuickUse var10000 = (QuickUse)this.f3000[0];
      Boolean var6 = false;
      var10000.f2000[1] = var6;
   }

   public void m20000(Huddumped var1) {
      if ((NNNwS)((NNuU)this.f3000[3]).T[4] != null && (NNNZg)((NNuU)this.f3000[3]).T[3] != null) {
         if (var1.m38000((PgUp)((C1006)this.f3000[2]).i(), ((C1006)this.f3000[2]).m2000())) {
            NursultanClient.m36000().m36000(this::m12000);
         } else if (var1.m46000((PgUp)((C1006)this.f3000[2]).i())) {
            NursultanClient.m36000().m36000(this::m16000);
         }
      }
   }

   public void m22000() {
      C0892.m4000();
      if ((Integer)this.f3000[4] != -1 && (Integer)this.f3000[5] != f2000[0]) {
         NursultanClient.m60000().m38000(0, (Integer)this.f3000[4], (Integer)this.f3000[5], Nkq.field_7791).m24000();
         byte var10001 = f2000[1];
         Integer var5 = Integer.valueOf(f2000[1]);
         this.f3000[5] = var5;
         Integer var6 = Integer.valueOf(var10001);
         this.f3000[4] = var6;
      }
   }

   public void m26000(int var1) {
      C0892.m44000(var1);
      Integer var6 = -1;
      this.f3000[6] = var6;
      QuickUse var10000 = (QuickUse)this.f3000[0];
      Boolean var7 = true;
      var10000.f2000[1] = var7;
   }

   private static void m28000() {
      f1000 = new byte[]{-1, -1, -1, -1, 4, -1};
      f2000 = new byte[]{-1, -1, 7, 4, 5, 6};
   }
}
