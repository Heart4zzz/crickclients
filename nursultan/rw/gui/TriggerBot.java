package rw.gui;

import KDFzREm.NHS;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNNww;
import KDFzREm.NNNwz;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNtL;
import KDFzREm.NNuU;
import KDFzREm.NPp;
import KDFzREm.NQa;
import KDFzREm.NXi;
import KDFzREm.NbC;
import KDFzREm.NbK;
import KDFzREm.NbL;
import KDFzREm.NjL;
import KDFzREm.Nza;
import KDFzREm.wY;
import java.util.List;
import java.util.Optional;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0887;
import rw.core.C0892;
import rw.core.C0913;
import rw.core.C0916;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1013;
import rw.core.C1136;
import rw.core.C1137;
import rw.core.C1140;
import rw.core.C1141;
import rw.core.C1149;
import rw.core.C1176;
import rw.core.C1177;
import rw.core.IljlItp;
import rw.core.OljOitkn;
import rw.data.Rec0288;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x;
import rw.module.AttackAura_x_x;
import rw.setting.C0071;
import rw.setting.C0122;
import rw.setting.ElytraGliding;

@AnnotationDefault(
   L = "TriggerBot",
   y = Enum0055.COMBAT,
   N = Enum0070.FIGHTING
)
public class TriggerBot extends GuiWidget {
   private static short[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static boolean[] f8000;
   private static short[] f9000;
   private static boolean[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static boolean[] f16000;
   public Object[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static boolean[] f22000;
   private static double[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static boolean[] f26000;
   private static boolean[] f27000;
   public Object[] f28000;
   private static short[] f29000;
   private static boolean[] f30000;
   private static short[] f31000;
   private static boolean[] f32000;
   private static String[] f33000;
   private static boolean[] f34000;
   private static boolean[] f35000;
   private static short[] f36000;
   public Object[] f37000;
   private static short[] f38000;
   private static boolean[] f39000;
   private static short[] f40000;
   private static double[] f41000;
   private static String[] f42000;
   private static short[] f43000;
   private static short[] f44000;
   private static short[] f45000;
   private static boolean[] f46000;
   private static String[] f47000;
   public Object[] f48000;
   private static boolean[] f49000;
   private static boolean[] f50000;
   private static float[] f51000;
   private static short[] f52000;
   private static short[] f53000;
   private static short[] f54000;
   private static short[] f55000;
   private static boolean[] f56000;
   private static boolean[] f57000;
   public Object[] f58000;
   public static Object[] f59000;
   private static boolean[] f60000;
   private static boolean[] f61000;
   private static short[] f62000;
   private static short[] f63000;
   private static short[] f64000;
   private static short[] f65000;
   private static boolean[] f66000;
   private static boolean[] f67000;
   private static boolean[] f68000;
   private static short[] f69000;
   private static boolean[] f70000;
   private static boolean[] f71000;
   private static short[] f72000;

   private boolean m4000(NbK var1) {
      this.m4000();
      if (!this.m30000()) {
         return (boolean)0;
      } else if (!(Boolean)this.f58000[0]) {
         return (boolean)0;
      } else {
         Rec0288 var2 = OljOitkn.m28000(1);
         return (boolean)(!(((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 > f41000[4])
               || (!var2.m12000().m18000() || !(((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 > f41000[5])) && !var2.m12000().m2000()
            ? this.m68000(var2, var1, C1177.m80000(var1), ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755())
            : 0);
      }
   }

   private void m4000() {
      if (this.f28000 == null) {
         this.f28000 = new Object[4];
         Object[] var1 = this.f28000;
      }

      if (this.f37000 == null) {
         this.f37000 = new Object[8];
         Object[] var2 = this.f37000;
      }

      if (this.f48000 == null) {
         this.f48000 = new Object[8];
         Object[] var3 = this.f48000;
      }

      if (this.f17000 == null) {
         this.f17000 = new Object[7];
         Object[] var4 = this.f17000;
         var4[0] = 0;
         var4[1] = 0;
         var4[2] = 0;
         var4[3] = 0;
         var4[4] = 0;
         var4[5] = 0;
         var4[6] = false;
      }

      if (this.f58000 == null) {
         this.f58000 = new Object[3];
         Object[] var5 = this.f58000;
         var5[0] = false;
         var5[1] = 0;
         var5[2] = false;
      }
   }

   private void m14000() {
      for (NNNwz var2 : ((NNNZg)((NNuU)this.y[0]).T[3]).method_18456()) {
         if (var2 instanceof C0071 var3) {
            wY.N(var3, (boolean)1);
         }
      }
   }

   public TriggerBot() {
      this.m4000();
      C1136 var5 = new C1136(f33000[0], false);
      this.f28000[0] = var5;
      C1137 var6 = new C1137(f33000[1], true);
      this.f28000[1] = var6;
      C1141 var7 = new C1141(f33000[2], true);
      this.f28000[2] = var7;
      C1149 var8 = new C1149<>(
         C1140.m12000().and(C1140.m50000()).and(C1140.m32000().negate()).and((C1137)this.f28000[1]).and((C1141)this.f28000[2]).and((C1136)this.f28000[0]),
         f33000[3],
         true
      );
      this.f28000[3] = var8;
      C1149 var9 = new C1149<>(C1140.m4000().and(C1140.m50000()).and(C1140.m56000().negate()), f33000[4], true);
      this.f37000[0] = var9;
      C1149 var10 = new C1149<>(C1140.m26000().and(C1140.m50000()).and(C1140.m56000().negate()), f33000[5], true);
      this.f37000[1] = var10;
      C1149 var11 = new C1149<>(C1140.m56000().and(C1140.m50000()), f33000[6], true);
      this.f37000[2] = var11;
      C1003 var12 = C0122.m4000(this, f47000[0], (C1149)this.f28000[3], (C1149)this.f37000[0], (C1149)this.f37000[1], (C1149)this.f37000[2]);
      this.f37000[3] = var12;
      C1003 var13 = (C1003)C0122.m4000(this, f47000[1], (C1136)this.f28000[0], (C1137)this.f28000[1], (C1141)this.f28000[2]).N(var1 -> {
         this.m4000();
         return ((C1149)this.f28000[3]).U();
      });
      this.f37000[4] = var13;
      C1003 var14 = C0122.m4000(
         this,
         f47000[2],
         ElytraGliding.m18000(false),
         ElytraGliding.m30000(false),
         ElytraGliding.m6000(false),
         ElytraGliding.m26000(false),
         ElytraGliding.m42000(false),
         ElytraGliding.m12000(false)
      );
      this.f37000[5] = var14;
      C1013 var15 = new C1013(f47000[3], true);
      this.f37000[6] = var15;
      C1013 var16 = new C1013(f47000[4], false);
      this.f37000[7] = var16;
      C1013 var17 = new C1013(f47000[5], false);
      this.f48000[0] = var17;
      C1000 var18 = C0122.m18000(this, f47000[6], (C1013)this.f37000[6], (C1013)this.f37000[7], (C1013)this.f48000[0]);
      this.f48000[1] = var18;
      C1013 var19 = new C1013(f47000[7], true);
      this.f48000[2] = var19;
      C1013 var20 = new C1013(f42000[0], false);
      this.f48000[3] = var20;
      C1013 var21 = new C1013(f42000[1], false);
      this.f48000[4] = var21;
      C1000 var22 = (C1000)C0122.m18000(this, f42000[2], (C1013)this.f48000[2], (C1013)this.f48000[3], (C1013)this.f48000[4]).N(var1 -> {
         this.m4000();
         return (boolean)(!((C1013)this.f37000[6]).m14000() ? 1 : 0);
      });
      this.f48000[5] = var22;
      C0991 var23 = C0122.m26000(this, f42000[3], true);
      this.f48000[6] = var23;
      C0991 var24 = C0122.m26000(this, f42000[4], true);
      this.f48000[7] = var24;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f51000 = new float[]{1.5F};
   }

   private void m10000() {
      if (C1176.m32000((NNNwS)((NNuU)this.y[0]).T[4], ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755(), true, this::m58000) instanceof NNtL var2) {
         NbK var3 = var2.L();
         if (this.m58000(var3) && this.m80000(var3)) {
            this.m82000(var3, null);
         }
      }
   }

   private boolean m30000() {
      this.m4000();
      if (((NNNwS)((NNuU)this.y[0]).T[4]).method_6047().L(NNNNRZ.c)) {
         return (boolean)0;
      } else if (((C1013)this.f37000[6]).m14000()) {
         return (boolean)0;
      } else if (!((C1013)this.f48000[0]).m14000()) {
         return (boolean)1;
      } else {
         return (boolean)(!((NNNww)((NNNwS)((NNuU)this.y[0]).T[4]).L[1]).field_54155.i() && ((NNNwS)((NNuU)this.y[0]).T[4]).method_24828() ? 0 : 1);
      }
   }

   private static void m32000() {
      f59000 = new Object[]{10, 2};
   }

   private static void m34000() {
      f45000 = new short[]{0, 1, 2, 1, 2, 0, 3, 0};
      f53000 = new short[]{1, 2, 3, 0, 1};
      f52000 = new short[]{2, 3, 0, 1, 2};
      f15000 = new short[]{4, 5, 6, 7, 0, 6, 7};
      f36000 = new short[]{0, 1, 2};
      f55000 = new short[]{3, 4};
      f18000 = new short[]{2, 3, 4, 5, 6};
      f54000 = new short[]{7, 0, 4};
      f44000 = new short[]{1, 1, 1, 0};
      f14000 = new short[]{0, 4, 0, 4};
      f24000 = new short[]{0, 4, 0, 4, 0};
      f19000 = new short[]{4, 0, 4, 1, 0, 4, 2};
      f65000 = new short[]{0, 4, 0, 4};
      f7000 = new short[]{0, 4};
      f5000 = new short[]{0, 3, 0, 3, 3, 3};
      f25000 = new short[]{3, 4, 4, 4, 7, 0, 4};
      f69000 = new short[]{2, 7, 2, 2, 6, 6};
      f64000 = new short[]{0, 4, 0, 4, 0, 2, 0};
      f12000 = new short[]{4, 0, 4, 0};
      f9000 = new short[]{2, 0, 2, 0, 2, 0};
      f31000 = new short[]{4, 0, 4, 5, 5, 6, 6, 1};
      f13000 = new short[]{1, 2};
      f6000 = new short[]{2, 1, 2, 2, 0, 1, 2, 0};
      f2000 = new short[]{0, 4, 6, 0};
      f29000 = new short[]{0, 4};
      f11000 = new short[]{1, 0, 4};
      f1000 = new short[]{6, 0, 4, 0, 4, 0, 4};
      f20000 = new short[]{0, 0, 4, 2, 4, 4, 0, 4};
      f63000 = new short[]{3, 0, 4, 6};
      f38000 = new short[]{0, 0, 4, 1, 0, 4, 0};
      f62000 = new short[]{4, 7, 0, 0, 4, 0};
      f43000 = new short[]{4, 0, 4, 0, 4, 0};
      f40000 = new short[]{4, 6, 3, 4};
      f72000 = new short[]{0, 3, 0};
      f21000 = new short[]{5, 0, 3, 0, 4, 6, 6, 3};
   }

   public boolean m36000() {
      this.m4000();

      for (ElytraGliding var2 : (List)((C1003)this.f37000[5]).i()) {
         if (var2.m32000((NNuU)this.y[0])) {
            return (boolean)1;
         }
      }

      return (boolean)0;
   }

   private static void m40000() {
      f33000 = new String[]{"invisible", "naked", "bot", "players", "animals", "monsters", "villagers"};
      f47000 = new String[]{
         "targets", "target-condition", "do-not-attack", "critical-disabled", "critical-always", "critical-only-space", "critical-hit", "disable"
      };
      f42000 = new String[]{"default", "fast", "reset-sprint", "shield-break", "auto-mace"};
   }

   private void m44000() {
      for (NNNwz var2 : ((NNNZg)((NNuU)this.y[0]).T[3]).method_18456()) {
         if (var2 instanceof C0071 var3) {
            wY.y(var3);
         }
      }
   }

   private boolean m46000() {
      this.m4000();
      if (((NNNwS)((NNuU)this.y[0]).T[4]).method_6047().N(NQa.Gm)) {
         return (boolean)1;
      } else if (((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 < f41000[3]) {
         return (boolean)0;
      } else {
         return (boolean)(((C0991)this.f48000[7]).i() && IljlItp.m50000(IljlItp.m60000(NQa.Gm)).isPresent() ? 1 : 0);
      }
   }

   private static void m12000() {
      f41000 = new double[]{1.0, 0.0, 1.3F, 1.0, 1.0, 1.5, 1.0};
      f23000 = new double[]{1.0, 0.1, 0.0};
   }

   private void m56000(int var1) {
      this.m4000();
      if (var1 == (Integer)this.f17000[1]) {
         Integer var6 = (Integer)this.f17000[2] + 1;
         this.f17000[2] = var6;
      } else {
         Integer var7 = var1;
         this.f17000[1] = var7;
         Integer var8 = 0;
         this.f17000[2] = var8;
      }

      if ((Integer)this.f17000[2] >= 2) {
         Integer var9 = Math.max(0, var1 - 10 + 1);
         this.f17000[0] = var9;
         Integer var10 = 0;
         this.f17000[1] = var10;
         Integer var11 = 0;
         this.f17000[2] = var11;
      } else {
         Integer var12 = 0;
         this.f17000[0] = var12;
      }
   }

   private boolean m58000(NbK var1) {
      this.m4000();
      if (var1 == null) {
         return (boolean)0;
      } else if (!NbC.B.test(var1)) {
         return (boolean)0;
      } else {
         for (C1149 var3 : (List)((C1003)this.f37000[3]).i()) {
            if (var3.m4000(var1)) {
               return (boolean)1;
            }
         }

         return (boolean)0;
      }
   }

   private void m64000(Nza var1) {
      NPp var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_76693();
      this.m14000();

      try {
         if (!(
            C1176.m52000(
               (NNNwS)((NNuU)this.y[0]).T[4],
               (Float)((NNNwS)((NNuU)this.y[0]).T[4]).R[1],
               (Float)((NNNwS)((NNuU)this.y[0]).T[4]).R[2],
               var2.y((NNNwS)((NNuU)this.y[0]).T[4]),
               false,
               this::m58000
            ) instanceof NNtL var4
         )) {
            return;
         }

         NbK var5 = var4.L();
         if (!this.m58000(var5) || !this.m80000(var5)) {
            return;
         }

         if (!var2.N((NNNwS)((NNuU)this.y[0]).T[4], var4.y())) {
            return;
         }

         if (C1176.m46000(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571(), var4.y(), NNnS.field_17558, NNnC.field_1348)) {
            this.m82000(var5, var1);
            return;
         }
      } finally {
         this.m44000();
      }
   }

   @Iface0642
   public void m66000(C0913 var1) {
      this.m4000();
      if ((Boolean)((C0991)this.f48000[7]).i() && (Boolean)this.f58000[2]) {
         Boolean var6 = false;
         this.f58000[2] = var6;
         C0892.m20000();
      }
   }

   private boolean m68000(Rec0288 var1, NbK var2, NXi var3, double var4) {
      this.m4000();
      if (((NNNwS)((NNuU)this.y[0]).T[4]).method_6047().N(NQa.Gm) && var1.m10000() < f41000[6]) {
         return (boolean)1;
      } else if (var1.m10000() < f23000[0]) {
         return (boolean)0;
      } else {
         if ((Boolean)((NNNwS)((NNuU)this.y[0]).T[4]).R[6]) {
            Integer var20 = 1;
            this.f17000[3] = var20;
         }

         Integer var21 = 3;
         this.f17000[4] = var21;
         NjL var6 = var1.m12000().m6000();
         NXi var7 = var6.method_33571();
         if (!C1176.m46000(var7, var3, NNnS.field_17558, NNnC.field_1348)) {
            return (boolean)0;
         } else {
            NHS var8 = var6.method_5829().L(var1.m12000().m12000()).M(f23000[1]);
            if (((NNNZg)((NNuU)this.y[0]).T[3]).u(var8)) {
               return (boolean)0;
            } else {
               double var9 = var2.method_23317() - var2.field_6014;
               double var11 = var2.method_23318() - var2.field_6036;
               double var13 = var2.method_23321() - var2.field_5969;
               Optional var15 = var2.method_5829().u(var9, var11, var13).y(var7, var3.y(var9, var11, var13));
               return var15.<Boolean>map(var3x -> var3x.R(var7) < var4).orElse(true);
            }
         }
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m70000(AttackAura_x_x var1) {
      this.m4000();
      if ((Integer)this.f17000[3] > 0) {
         Integer var6 = (Integer)this.f17000[3] - 1;
         this.f17000[f25000[0]] = var6;
         var1.m16000((boolean)0);
      }

      if ((Integer)this.f17000[f25000[1]] > 0) {
         Integer var7 = (Integer)this.f17000[f25000[2]] - 1;
         this.f17000[f25000[3]] = var7;
         var1.m10000((boolean)0);
      }
   }

   @Iface0642(
      y = Enum0081.BEFORE
   )
   public void m74000(C0916 var1) {
      this.m4000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && !this.m36000()) {
         if ((Integer)this.f58000[1] > 0) {
            Integer var7 = (Integer)this.f58000[1] - 1;
            this.f58000[1] = var7;
         }

         Boolean var8 = this.m46000();
         this.f58000[0] = var8;
         Nza var2 = (Nza)((NNNwS)((NNuU)this.y[0]).T[4]).method_6047().method_58694(NNNNRZ.c);
         if (var2 != null) {
            this.m64000(var2);
         } else {
            this.m10000();
         }
      }
   }

   @Iface0642
   public void m76000(AttackAura_x var1) {
      this.m4000();
      if ((Boolean)((C0991)this.f48000[f25000[4]]).i() && !(((NNNwS)((NNuU)this.y[f25000[5]]).T[f25000[6]]).field_6017 < f41000[0])) {
         int var2 = IljlItp.m60000(NQa.Gm);
         if (!IljlItp.m36000(var2)) {
            C0892.m44000(var2);
            Boolean var7 = true;
            this.f58000[2] = var7;
         }
      }
   }

   private boolean m80000(NbK var1) {
      this.m4000();
      if ((Boolean)this.f17000[6] && var1 instanceof NjL var2 && wY.N(var2, (NNNwS)((NNuU)this.y[0]).T[4])) {
         return (boolean)1;
      } else if (((NNNwS)((NNuU)this.y[0]).T[4]).method_75202(((NNNwS)((NNuU)this.y[0]).T[4]).method_6047(), 0)) {
         return (boolean)0;
      } else if (C0887.m32000(this.m92000())) {
         return (boolean)0;
      } else {
         boolean var10 = C0887.m24000();
         if (this.m30000() && var10 && !(Boolean)this.f58000[0]) {
            if (((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 == f41000[1]) {
               return (boolean)0;
            }

            if (!((C1013)this.f48000[2]).m14000()) {
               Rec0288 var3 = OljOitkn.m28000(1);
               if (this.m84000(var3)) {
                  if (((C1013)this.f48000[4]).m14000()) {
                     Integer var8 = 1;
                     this.f17000[4] = var8;
                     ((NNNwS)((NNuU)this.y[0]).T[4]).method_5728((boolean)0);
                  } else {
                     Integer var9 = 1;
                     this.f17000[3] = var9;
                  }
               }

               if ((Boolean)((NNNwS)((NNuU)this.y[0]).T[4]).R[6]) {
                  return (boolean)0;
               }
            }
         }

         if (C0887.m26000(this.m30000()) && var10) {
            return (boolean)0;
         } else {
            int var11 = this.f58000[0] && ((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 > f41000[2] && this.f58000[1] <= 0 ? 1 : 0;
            if (var11 == 0 && C0887.m2000()) {
               return (boolean)0;
            } else {
               return (boolean)(this.m4000(var1) ? 0 : 1);
            }
         }
      }
   }

   private void m82000(NbK var1, Nza var2) {
      this.m4000();
      int var3 = C0887.m36000();
      if ((Boolean)this.f17000[6]) {
         Boolean var10 = false;
         this.f17000[6] = var10;
         if (var1 instanceof NjL var4 && wY.N(var4, (NNNwS)((NNuU)this.y[0]).T[4])) {
            wY.y(var4);
            return;
         }
      }

      if (((NNNwS)((NNuU)this.y[0]).T[4]).method_6039()) {
         ((NNNZZ)((NNuU)this.y[0]).T[2]).y((NNNwS)((NNuU)this.y[0]).T[4]);
      }

      boolean var14 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_6047().N(NQa.Gm);
      if (var2 != null) {
         if (((NNNZZ)((NNuU)this.y[0]).T[2]).Z()) {
            return;
         }

         ((NNNZZ)((NNuU)this.y[0]).T[2]).N(var2);
      } else {
         ((NNNZZ)((NNuU)this.y[0]).T[2]).N((NNNwS)((NNuU)this.y[0]).T[4], var1);
      }

      ((NNNwS)((NNuU)this.y[0]).T[4]).method_6104(NbL.field_5808);
      Integer var11 = (Integer)this.f17000[5] + 1;
      this.f17000[5] = var11;
      if (var1 instanceof NjL var5) {
         TargetEsp.m28000(var5, 15);
         if ((Boolean)((C0991)this.f48000[6]).i()) {
            Boolean var12 = true;
            this.f17000[6] = var12;
         }
      }

      if (var14) {
         Integer var13 = 20;
         this.f58000[1] = var13;
      }

      this.m56000(var3);
   }

   public boolean m84000(Rec0288 var1) {
      return (boolean)(((NNNwS)((NNuU)this.y[0]).T[4]).R[6] && !C0887.m32000(this.m92000() - 1) && var1.m10000() > f23000[2] && !C0887.m30000(f51000[0])
         ? 1
         : 0);
   }

   private static void m90000() {
      f32000 = new boolean[]{false, true, true, true, true, true};
      f4000 = new boolean[]{true, false, true, false, true, false, false, true};
      f16000 = new boolean[]{false, false, false, false, false};
      f35000 = new boolean[]{true, false};
      f60000 = new boolean[]{false, false, true};
      f50000 = new boolean[]{true, false, false, false, true, true, true};
      f56000 = new boolean[]{true, true, false};
      f49000 = new boolean[]{true, true, false, true};
      f26000 = new boolean[]{false, true, false, false};
      f67000 = new boolean[]{true, true, true, false};
      f71000 = new boolean[]{false, true, false, false, false};
      f22000 = new boolean[]{false, false, true, false, true, true};
      f34000 = new boolean[]{false, false, false, false};
      f57000 = new boolean[]{true, true, false, true, false};
      f68000 = new boolean[]{false, true, false, false, false};
      f30000 = new boolean[]{true, true, false, true, false, false};
      f39000 = new boolean[]{false, true, false};
      f27000 = new boolean[]{true, false, true, false};
      f70000 = new boolean[]{false, true, true};
      f66000 = new boolean[]{false, false, false, true, false, true, true, false};
      f46000 = new boolean[]{true, false};
      f61000 = new boolean[]{true, false, false};
      f3000 = new boolean[]{false, true, false, false, false, false};
      f10000 = new boolean[]{false, false, false, false, true, false, false, false};
      f8000 = new boolean[]{true};
   }

   private int m92000() {
      this.m4000();
      return 10 + (Integer)this.f17000[0];
   }
}
