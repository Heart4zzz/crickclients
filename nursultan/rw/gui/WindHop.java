package rw.gui;

import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nkq;
import KDFzREm.Nrm;
import java.util.ArrayDeque;
import java.util.Deque;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0606;
import rw.api.Iface0642;
import rw.core.C0719;
import rw.core.C0892;
import rw.core.C0983;
import rw.core.C0989;
import rw.core.C0991;
import rw.core.C1006;
import rw.core.IljlItp;
import rw.core.NuZz;
import rw.data.Rec0174;
import rw.data.Rec0175;
import rw.data.Rec0208;
import rw.defs.Enum0055;
import rw.defs.Enum0074;
import rw.module.AttackAura_x_x;
import rw.module.OlpnniIl;
import rw.setting.C0122;

@AnnotationDefault(
   L = "WindHop",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class WindHop extends GuiWidget {
   public Object[] f1000;
   public Object[] f2000;
   public static Object[] f3000;
   private static String[] f4000;
   private static float[] f5000;

   public WindHop() {
      this.m12000();
      C0991 var5 = C0122.m26000(this, f4000[0], true);
      this.f2000[0] = var5;
      C1006 var6 = C0122.m14000(this, f4000[1], (PgUp)PgUp.f4000[0]);
      this.f2000[1] = var6;
      C1006 var7 = C0122.m14000(this, f4000[2], (PgUp)PgUp.f4000[0]);
      this.f2000[2] = var7;
      Iface0606 var8 = Iface0606.m4000(NQa.Gz);
      this.f2000[3] = var8;
      Iface0606 var9 = Iface0606.m4000(NQa.nz);
      this.f2000[4] = var9;
      ArrayDeque var10 = new ArrayDeque();
      this.f2000[5] = var10;
   }

   static {
      ntfClinit();
   }

   public boolean m8000() {
      this.m12000();
      ((Deque)this.f2000[5]).clear();
      Object var5 = null;
      this.f1000[0] = var5;
      Boolean var6 = false;
      this.f2000[6] = var6;
      Boolean var7 = false;
      this.f2000[7] = var7;
      C0892.m20000();
      return (boolean)1;
   }

   private void m10000() {
      this.m12000();
      Rec0174 var1 = (Rec0174)((Deque)this.f2000[5]).poll();
      if (var1 != null) {
         this.m6000(var1);
      }
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[8];
         Object[] var1 = this.f2000;
         var1[6] = false;
         var1[7] = false;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var2 = this.f1000;
      }
   }

   private static void m4000() {
      f5000 = new float[]{5.0F};
   }

   private static void m14000() {
      f3000 = new Object[]{90, -90, 5, 10, 2};
   }

   private static void m16000() {
      f4000 = new String[]{"auto-jump", "jump-key", "combo-key"};
   }

   private void m6000(Rec0174 var1) {
      this.m12000();
      NQo var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_6079();
      if (var1.f1000.test(var2) && !((NNNwS)((NNuU)this.y[0]).T[4]).method_7357().N(var2)) {
         Rec0175 var10 = new Rec0175(-1, -1, NbL.field_5810, var1.f3000, var1.f2000, var1.f4000);
         this.f1000[0] = var10;
      } else {
         Rec0208 var3 = IljlItp.m48000(var1.f1000);
         if (var3 != null && !((NNNwS)((NNuU)this.y[0]).T[4]).method_7357().N(var3.m6000())) {
            int var4 = var3.m4000();
            if (IljlItp.m32000(var4)) {
               Rec0175 var12 = new Rec0175(var4, -1, NbL.field_5808, var1.f3000, var1.f2000, var1.f4000);
               this.f1000[0] = var12;
            } else {
               int var5 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().M();
               NursultanClient.m60000().m38000(0, var4, var5, Nkq.field_7791).m26000(var4x -> {
                  this.m12000();
                  Rec0175 var9 = new Rec0175(var5, var4, NbL.field_5808, var1.f3000, var1.f2000, var1.f4000);
                  this.f1000[0] = var9;
               }).m24000();
            }
         } else {
            ((Deque)this.f2000[5]).clear();
            Boolean var11 = false;
            this.f2000[7] = var11;
         }
      }
   }

   private void m8000(NbL var1) {
      ((NNNZZ)((NNuU)this.y[0]).T[2])
         .N(
            (NNNZg)((NNuU)this.y[0]).T[3],
            var2 -> new Nrm(var1, var2, ((NNNwS)((NNuU)this.y[0]).T[4]).method_36454(), ((NNNwS)((NNuU)this.y[0]).T[4]).method_36455())
         );
      ((NNNwS)((NNuU)this.y[0]).T[4]).method_6104(var1);
   }

   @Iface0642
   public void m12000(C0719 var1) {
      this.m12000();
      if ((Rec0175)this.f1000[0] != null) {
         NuZz.m60000(new C0983(C0989.m28000().m38000(), ((Rec0175)this.f1000[0]).f2000).m60000((Enum0074)Enum0074.f2000[0]).m32000(true));
         if (!(Math.abs(((NNNwS)((NNuU)this.y[0]).T[4]).method_36455() - ((Rec0175)this.f1000[0]).f2000) > f5000[0])) {
            if (((Rec0175)this.f1000[0]).f3000) {
               NursultanClient.m36000().m36000(this::m4000);
            }

            int var2 = ((Rec0175)this.f1000[0]).f5000;
            if (var2 != -1) {
               C0892.m44000(var2);
            }

            this.m8000(((Rec0175)this.f1000[0]).f1000);
            int var3 = ((Rec0175)this.f1000[0]).f4000;
            NursultanClient.m36000().m14000(4, () -> {
               C0892.m20000();
               if (var3 != -1 && var2 != -1) {
                  NursultanClient.m60000().m38000(0, var3, var2, Nkq.field_7791).m24000();
               }
            });
            int var4 = ((Rec0175)this.f1000[0]).f6000;
            Object var9 = null;
            this.f1000[0] = var9;
            if (((Deque)this.f2000[5]).isEmpty()) {
               Boolean var10 = false;
               this.f2000[7] = var10;
            } else {
               NursultanClient.m36000().m14000(Math.max(1, var4), this::m10000);
            }
         }
      }
   }

   @Iface0642(
      u = true
   )
   public void m16000(OlpnniIl var1) {
      this.m12000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && (NNNZg)((NNuU)this.y[0]).T[3] != null) {
         if ((Rec0175)this.f1000[0] == null && ((Deque)this.f2000[5]).isEmpty()) {
            if (((C1006)this.f2000[1]).m4000(var1)) {
               ((Deque)this.f2000[5]).add(new Rec0174((Iface0606)this.f2000[3], 90, true, 0));
               NursultanClient.m36000().m36000(this::m10000);
            } else {
               if (((C1006)this.f2000[2]).m4000(var1)) {
                  Boolean var6 = true;
                  this.f2000[7] = var6;
                  ((Deque)this.f2000[5]).add(new Rec0174((Iface0606)this.f2000[3], 90, true, 10));
                  ((Deque)this.f2000[5]).add(new Rec0174((Iface0606)this.f2000[4], -90, false, 1));
                  ((Deque)this.f2000[5]).add(new Rec0174((Iface0606)this.f2000[3], -90, false, 0));
                  NursultanClient.m36000().m36000(this::m10000);
               }
            }
         }
      }
   }

   @Iface0642
   public void m20000(AttackAura_x_x var1) {
      this.m12000();
      if ((Boolean)this.f2000[7]) {
         var1.m16000((boolean)0);
         var1.m34000((boolean)0);
         var1.m2000((boolean)0);
         var1.m46000((boolean)0);
         var1.m10000((boolean)0);
         var1.m36000((boolean)0);
      }

      if ((Boolean)this.f2000[6]) {
         if ((Boolean)((C0991)this.f2000[0]).i()) {
            var1.m22000((boolean)1);
            Boolean var6 = false;
            this.f2000[6] = var6;
         }
      }
   }
}
