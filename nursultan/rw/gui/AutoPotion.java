package rw.gui;

import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNbw;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NbI;
import KDFzREm.NbL;
import KDFzREm.NbQ;
import KDFzREm.Nbw;
import KDFzREm.NkG;
import KDFzREm.NkS;
import KDFzREm.Nkq;
import KDFzREm.Nrm;
import KDFzREm.wY;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0606;
import rw.api.Iface0642;
import rw.api.Iface0647;
import rw.core.C0672;
import rw.core.C0719;
import rw.core.C0892;
import rw.core.C0983;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1006;
import rw.core.C1013;
import rw.core.C1176;
import rw.core.C1193;
import rw.core.IljlItp;
import rw.core.NuZz;
import rw.data.Rec0178;
import rw.defs.Enum0055;
import rw.defs.Enum0074;
import rw.defs.Enum0081;
import rw.module.OlpnniIl;
import rw.setting.C0122;
import rw.setting.C0160;

@AnnotationDefault(
   L = "AutoPotion",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoPotion extends GuiWidget {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;
   public Object[] f5000;
   private static boolean[] f6000;
   private static String[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static boolean[] f10000;
   private static boolean[] f11000;
   private static boolean[] f12000;
   private static boolean[] f13000;
   private static double[] f14000;
   private static boolean[] f15000;
   private static boolean[] f16000;
   private static float[] f17000;
   private static boolean[] f18000;
   public Object[] f19000;
   private static boolean[] f20000;
   public Object[] f21000;
   public Object[] f22000;
   private static boolean[] f23000;

   private void m4000() {
      this.m12000();
      if ((Boolean)this.f22000[0] || !IljlItp.m36000((Integer)this.f19000[3])) {
         if (NursultanClient.m74000().m10000() - (Integer)this.f19000[5] >= 1) {
            this.m82000();
            if (((C1013)this.f19000[0]).m14000()) {
               this.N((boolean)0);
            }
         }
      }
   }

   private void m16000() {
      this.m12000();
      if (!IljlItp.m36000((Integer)this.f19000[3])) {
         NursultanClient.m60000().m38000(0, (Integer)this.f19000[4], (Integer)this.f19000[3], Nkq.field_7791).m24000();
         Integer var5 = -1;
         this.f19000[4] = var5;
         Integer var6 = -1;
         this.f19000[3] = var6;
      }
   }

   public AutoPotion() {
      this.m12000();
      C0672 var5 = new C0672(
         f7000[0], true, var0 -> (boolean)(!var0.method_6059(NbI.N) ? 1 : 0), var1 -> (boolean)(var1.N(NQa.lO) && this.m72000(var1, NbI.N) ? 1 : 0)
      );
      this.f21000[0] = var5;
      C0672 var6 = new C0672(
         f7000[1], true, var0 -> (boolean)(!var0.method_6059(NbI.i) ? 1 : 0), var1 -> (boolean)(var1.N(NQa.lO) && this.m72000(var1, NbI.i) ? 1 : 0)
      );
      this.f21000[1] = var6;
      C0672 var7 = new C0672(
         f7000[2], true, var0 -> (boolean)(!var0.method_6059(NbI.E) ? 1 : 0), var1 -> (boolean)(var1.N(NQa.lO) && this.m72000(var1, NbI.E) ? 1 : 0)
      );
      this.f21000[2] = var7;
      C0672 var8 = new C0672(f7000[3], false, var1 -> {
         this.m12000();
         return (boolean)(!this.f22000[2] && !(var1.method_6032() < ((C0988)this.f21000[5]).i()) ? 0 : f13000[7]);
      }, var1 -> {
         if (var1.N(NQa.lO)) {
            NNNbw[] var10002 = new NNNbw[f13000[3]];
            var10002[f13000[4]] = NbI.R;
            if (this.m72000(var1, var10002)) {
               return f13000[5];
            }
         }

         return f13000[6];
      });
      this.f21000[3] = var8;
      C1003 var9 = C0122.m4000(this, f7000[4], (C0672)this.f21000[1], (C0672)this.f21000[0], (C0672)this.f21000[2], (C0672)this.f21000[3]);
      this.f21000[4] = var9;
      C0988 var10 = (C0988)C0122.m12000(this, f7000[5], f17000[0], f17000[1], f17000[2], f17000[3]).N(var1 -> {
         this.m12000();
         return ((C0672)this.f21000[3]).U();
      });
      this.f21000[5] = var10;
      C1006 var11 = (C1006)C0122.m14000(this, f7000[6], (PgUp)PgUp.f4000[0]).N(var1 -> {
         this.m12000();
         return ((C0672)this.f21000[3]).U();
      });
      this.f21000[6] = var11;
      C1013 var12 = new C1013(f7000[7], true);
      this.f21000[7] = var12;
      C1013 var13 = new C1013(f3000[0], false);
      this.f5000[0] = var13;
      C1000 var14 = C0122.m18000(this, f3000[1], (C1013)this.f21000[7], (C1013)this.f5000[0]);
      this.f5000[1] = var14;
      C0991 var15 = C0122.m26000(this, f3000[2], false);
      this.f5000[2] = var15;
      C1013 var16 = new C1013(f3000[3], false);
      this.f5000[3] = var16;
      C1013 var17 = new C1013(f3000[4], false);
      this.f19000[0] = var17;
      C1013 var18 = new C1013(f3000[5], true);
      this.f19000[1] = var18;
      C1003 var19 = C0122.m4000(this, f3000[6], (C1013)this.f5000[3], (C1013)this.f19000[0], (C1013)this.f19000[1]);
      this.f19000[2] = var19;
      Integer var20 = -1;
      this.f19000[3] = var20;
      Integer var21 = -1;
      this.f19000[4] = var21;
      Integer var22 = -1;
      this.f19000[5] = var22;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      this.m12000();
      NuZz.m60000(((Rec0178)this.f22000[3]).m8000());
      if (NursultanClient.m74000().m10000() - ((Rec0178)this.f22000[3]).m2000() >= 1 && !(((NNNwS)((NNuU)this.y[0]).T[4]).method_36455() < f17000[7])) {
         if (!((Iface0606)((Rec0178)this.f22000[3]).m10000().f1000[1])
            .test((NQo)((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().u().get(((Rec0178)this.f22000[3]).m6000()))) {
            this.m84000();
         } else {
            this.m66000(((Rec0178)this.f22000[3]).m6000(), ((Rec0178)this.f22000[3]).m8000(), ((Rec0178)this.f22000[3]).m10000());
            Object var5 = null;
            this.f22000[3] = var5;
         }
      }
   }

   private static void m10000() {
      f7000 = new String[]{"speed-potion", "strength-potion", "fire-resistance-potion", "healing-potion", "potions", "heal-health", "heal-key", "single"};
      f3000 = new String[]{"multi", "mode", "hotbar-only", "only-in-pvp", "disable-after-throw", "exclude-donate-potions", "addons"};
   }

   private void m12000() {
      if (this.f21000 == null) {
         this.f21000 = new Object[8];
         Object[] var1 = this.f21000;
      }

      if (this.f5000 == null) {
         this.f5000 = new Object[4];
         Object[] var2 = this.f5000;
      }

      if (this.f19000 == null) {
         this.f19000 = new Object[6];
         Object[] var3 = this.f19000;
         var3[3] = 0;
         var3[4] = 0;
         var3[5] = 0;
      }

      if (this.f22000 == null) {
         this.f22000 = new Object[4];
         Object[] var4 = this.f22000;
         var4[0] = false;
         var4[1] = false;
         var4[2] = false;
      }
   }

   private boolean m26000() {
      this.m12000();
      if (((C1013)this.f5000[3]).m14000() && !wY.u()) {
         return (boolean)1;
      } else if (((Iface0647)((NNNZZ)((NNuU)this.y[0]).T[2])).m2000() < 3) {
         return (boolean)1;
      } else {
         return (boolean)(C0160.m18000() && ((NNNwS)((NNuU)this.y[0]).T[4]).field_6012 < 110 ? 1 : ((NNNwS)((NNuU)this.y[0]).T[4]).method_6115());
      }
   }

   private static void m28000() {
      f17000 = new float[]{10.0F, 0.0F, 20.0F, 0.5F, 17.0F, 90.0F, 80.0F, 80.0F};
   }

   private static void m14000() {
      f2000 = new Object[]{1, 1};
   }

   private static void m34000() {
      f8000 = new boolean[]{true, true, true, false, false};
      f10000 = new boolean[]{true, true, false, false, true, false, false};
      f9000 = new boolean[]{false, true, false, true};
      f20000 = new boolean[]{false, true, true, true};
      f23000 = new boolean[]{false, true, false, true, true, false, false};
      f15000 = new boolean[]{true, false, false, true, true, true, false};
      f13000 = new boolean[]{false, true, false, true, false, true, false, true};
      f1000 = new boolean[]{false, true};
      f16000 = new boolean[]{false, true};
      f11000 = new boolean[]{false, true, false};
      f6000 = new boolean[]{true, false, true, false, true};
      f18000 = new boolean[]{false, true, false, true, false};
      f4000 = new boolean[]{true, false, false, false, false, false, false};
      f12000 = new boolean[]{true, false, false, false, true, true, true};
   }

   private boolean m36000() {
      this.m12000();
      return (boolean)(!((C0991)this.f5000[2]).i() ? 1 : 0);
   }

   private static void m16000() {
      f14000 = new double[]{0.0, -1.0, 0.0};
   }

   private void m50000(int var1, C0983 var2, C0672 var3) {
      this.m12000();
      Boolean var10 = true;
      this.f22000[1] = var10;
      boolean var4 = IljlItp.m36000((Integer)this.f19000[3]);
      int var5 = var4 ? ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().M() : (Integer)this.f19000[3];
      NursultanClient.m60000().m38000(0, var1, var5, Nkq.field_7791).m26000(var6 -> {
         this.m12000();
         if (var4) {
            Integer var11 = var1;
            this.f19000[4] = var11;
            Integer var12 = var5;
            this.f19000[3] = var12;
         }

         Rec0178 var13 = new Rec0178(var5, var2, var3, NursultanClient.m74000().m10000());
         this.f22000[3] = var13;
         Boolean var14 = f13000[2];
         this.f22000[1] = var14;
      }).m24000();
   }

   @Iface0642(
      u = true
   )
   public void m62000(OlpnniIl var1) {
      this.m12000();
      if (((C0672)this.f21000[3]).U() && ((C1006)this.f21000[6]).m4000(var1)) {
         Boolean var6 = true;
         this.f22000[2] = var6;
      }
   }

   private void m66000(int var1, C0983 var2, C0672 var3) {
      this.m12000();
      C0892.m44000(var1);
      ((NNNZZ)((NNuU)this.y[0]).T[2]).N((NNNZg)((NNuU)this.y[0]).T[3], var1x -> new Nrm(NbL.field_5808, var1x, var2.m38000(), var2.m68000()));
      ((NNNwS)((NNuU)this.y[0]).T[4]).method_6104(NbL.field_5808);
      var3.m4000(10);
      if (var3 == (C0672)this.f21000[3]) {
         Boolean var8 = false;
         this.f22000[2] = var8;
      }

      Boolean var9 = true;
      this.f22000[0] = var9;
      Integer var10 = NursultanClient.m74000().m10000();
      this.f19000[5] = var10;
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public void m70000(C0719 var1) {
      this.m12000();
      if (!(Boolean)this.f22000[1]) {
         if ((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]
               == (NkS)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[2]
            && !NursultanClient.m60000().m16000()) {
            if ((Rec0178)this.f22000[3] != null) {
               if (this.m26000()) {
                  this.m84000();
               } else {
                  this.m8000();
               }
            } else if (this.m26000()) {
               this.m4000();
            } else {
               NXi var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_73189();
               if (C1176.m46000(var2, var2.y(f14000[0], f14000[1], f14000[2]), NNnS.field_17558, NNnC.field_1348)) {
                  this.m4000();
               } else {
                  byte var3 = 0;

                  for (C0672 var5 : (List)((C1003)this.f21000[4]).i()) {
                     if (!var5.m6000() && ((Predicate)var5.f1000[0]).test((NNNwS)((NNuU)this.y[0]).T[4])) {
                        int var6 = IljlItp.m38000((Iface0606)var5.f1000[1]);
                        int var7 = IljlItp.m36000(var6) && this.m36000() ? IljlItp.m62000((Iface0606)var5.f1000[1]) : -1;
                        if (!IljlItp.m36000(var6) || !IljlItp.m36000(var7)) {
                           C0983 var8 = new C0983(
                                 ((NNNwS)((NNuU)this.y[0]).T[4]).method_36454() + NNWE.m(((NNNwS)((NNuU)this.y[0]).T[4]).field_6012) * f17000[4], f17000[5]
                              )
                              .m60000((Enum0074)Enum0074.f2000[0]);
                           NuZz.m60000(var8);
                           if (((NNNwS)((NNuU)this.y[0]).T[4]).method_36455() < f17000[6]) {
                              return;
                           }

                           if (IljlItp.m36000(var6)) {
                              this.m50000(var7, var8, var5);
                              return;
                           }

                           this.m66000(var6, var8, var5);
                           var3 = 1;
                           if (((C1013)this.f21000[7]).m14000()) {
                              return;
                           }
                        }
                     }
                  }

                  if (var3 == 0) {
                     this.m4000();
                  }
               }
            }
         }
      }
   }

   @SafeVarargs
   private boolean m72000(NQo var1, NNNbw<Nbw>... var2) {
      this.m12000();
      if (!((C1013)this.f19000[1]).m14000()) {
         return C1193.m50000(var1, var2);
      } else {
         Iterable var3 = C1193.m12000(var1).N();
         if (!var3.iterator().hasNext()) {
            return (boolean)0;
         } else {
            for (NbQ var5 : var3) {
               if (Arrays.stream(var2).noneMatch(var1x -> var5.L().N(var1x))) {
                  return f13000[0];
               }
            }

            return f13000[1];
         }
      }
   }

   private void m82000() {
      this.m12000();
      if ((Boolean)this.f22000[0]) {
         C0892.m20000();
         Boolean var5 = false;
         this.f22000[0] = var5;
      }

      this.m16000();
   }

   private void m84000() {
      this.m12000();
      Object var5 = null;
      this.f22000[3] = var5;
      this.m82000();
   }
}
