package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNNwz;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.Nbp;
import KDFzREm.NcZ;
import KDFzREm.NjL;
import KDFzREm.wY;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base0764;
import rw.core.C0066;
import rw.core.C0719;
import rw.core.C0760;
import rw.core.C0767;
import rw.core.C0771;
import rw.core.C0776;
import rw.core.C0779;
import rw.core.C0782;
import rw.core.C0784;
import rw.core.C0799;
import rw.core.C0801;
import rw.core.C0887;
import rw.core.C0892;
import rw.core.C0905;
import rw.core.C0913;
import rw.core.C0916;
import rw.core.C0983;
import rw.core.C0988;
import rw.core.C0989;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1013;
import rw.core.C1136;
import rw.core.C1137;
import rw.core.C1140;
import rw.core.C1141;
import rw.core.C1149;
import rw.core.C1150;
import rw.core.C1176;
import rw.core.C1177;
import rw.core.HlPo;
import rw.core.IljlItp;
import rw.core.IlqIsmn;
import rw.core.IltOkpplt;
import rw.core.OlipIn;
import rw.core.OlmInrq;
import rw.core.OltlIpjm;
import rw.data.Rec0190;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x;
import rw.module.AttackAura_x_x;
import rw.module.Module005;
import rw.setting.C0071;
import rw.setting.C0122;
import rw.setting.C0160;
import rw.setting.ElytraGliding;

@AnnotationDefault(
   L = "AttackAura",
   y = Enum0055.COMBAT,
   N = Enum0070.FIGHTING
)
public class AttackAura extends GuiWidget {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static String[] f6000;
   private static short[] f7000;
   private static double[] f8000;
   public Object[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static float[] f12000;
   private static short[] f13000;
   private static String[] f14000;
   private static short[] f15000;
   public Object[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   public Object[] f21000;
   private static String[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   public Object[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   public Object[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   public Object[] f34000;
   private static short[] f35000;
   private static short[] f36000;
   private static short[] f37000;
   private static short[] f38000;
   private static short[] f39000;
   private static short[] f40000;
   private static short[] f41000;
   private static short[] f42000;
   private static String[] f43000;
   public Object[] f44000;
   private static String[] f45000;
   private static short[] f46000;
   private static String[] f47000;
   public Object[] f48000;
   private static String[] f49000;
   private static float[] f50000;
   public static Object[] f51000;
   private static short[] f52000;
   private static short[] f53000;
   private static String[] f54000;
   private static float[] f55000;
   private static short[] f56000;
   private static short[] f57000;
   private static short[] f58000;
   private static short[] f59000;
   private static short[] f60000;
   private static short[] f61000;

   public void m4000(int var1) {
      this.m176000();
      Integer var6 = var1;
      this.f26000[3] = var6;
   }

   private boolean m6000(boolean var1) {
      this.m176000();
      if (!(Boolean)((C0991)this.f44000[3]).i() || (NNNwS)((NNuU)this.y[0]).T[4] == null || (Integer)this.f26000[6] > 0) {
         return (boolean)0;
      } else if ((NjL)this.f26000[2] == null || !((Base0764)((C1000)this.f9000[3]).i()).m24000() || !C0887.m24000()) {
         return (boolean)0;
      } else if (!(((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 <= f8000[2]) && !var1) {
         return (boolean)(!C0887.m32000(((Base0764)((C1000)this.f9000[3]).i()).m32000()) ? 1 : 0);
      } else {
         return (boolean)0;
      }
   }

   public C1000<Base0764> m22000() {
      this.m176000();
      return (C1000<Base0764>)this.f9000[3];
   }

   public boolean m26000() {
      this.m176000();

      for (ElytraGliding var2 : (List)((C1003)this.f34000[0]).i()) {
         if (var2.m32000((NNuU)this.y[0])) {
            return (boolean)1;
         }
      }

      return (boolean)0;
   }

   private void m32000() {
      this.m176000();
      if (((Base0764)((C1000)this.f9000[3]).i()).m2000()) {
         for (NNNwz var2 : ((NNNZg)((NNuU)this.y[0]).T[3]).method_18456()) {
            if (var2 instanceof C0071 var3) {
               wY.N(var3);
            }
         }
      }
   }

   public AttackAura() {
      this.m176000();
      C0767 var5 = new C0767(this, f43000[0], true);
      this.f16000[0] = var5;
      C0776 var6 = new C0776(this, f43000[1]);
      this.f16000[1] = var6;
      HlPo var7 = new HlPo(this, f43000[2]);
      this.f16000[2] = var7;
      C0760 var8 = new C0760(this, f43000[3]);
      this.f16000[3] = var8;
      C0771 var9 = new C0771(this, f43000[4]);
      this.f16000[4] = var9;
      OlipIn var10 = new OlipIn(f43000[5], true);
      this.f16000[5] = var10;
      C0801 var11 = new C0801(f43000[6]);
      this.f16000[6] = var11;
      C0782 var12 = new C0782(f6000[0]);
      this.f48000[0] = var12;
      C0799 var13 = new C0799(f6000[1]);
      this.f48000[1] = var13;
      C1136 var14 = new C1136(f6000[2], true);
      this.f48000[2] = var14;
      C1137 var15 = new C1137(f22000[0], true);
      this.f48000[3] = var15;
      C1141 var16 = new C1141(f22000[1], false);
      this.f48000[4] = var16;
      C1149 var17 = new C1149<>(
         C1140.m12000()
            .and(C1140.m50000())
            .and(C1140.m32000().negate())
            .and((C1137)this.f48000[3])
            .and((C1141)this.f48000[f17000[0]])
            .and((C1136)this.f48000[f17000[1]]),
         f22000[2],
         true
      );
      this.f48000[f17000[2]] = var17;
      C1149 var18 = new C1149<>(C1140.m20000().and(C1140.m50000()).and(C1140.m56000().negate()), f22000[3], true);
      this.f48000[6] = var18;
      C1149 var19 = new C1149<>(C1140.m56000().and(C1140.m50000()), f45000[0], true);
      this.f9000[0] = var19;
      C1003 var20 = C0122.m4000(this, f45000[1], (C1149)this.f48000[5], (C1149)this.f48000[6], (C1149)this.f9000[0]);
      this.f9000[1] = var20;
      C1003 var21 = (C1003)C0122.m4000(this, f45000[2], (C1136)this.f48000[2], (C1137)this.f48000[3], (C1141)this.f48000[4]).N(var1 -> {
         this.m176000();
         return ((C1149)this.f48000[5]).U();
      });
      this.f9000[2] = var21;
      C1000 var22 = C0122.m18000(
         this, f45000[3], (C0767)this.f16000[0], (C0776)this.f16000[1], (HlPo)this.f16000[2], (C0760)this.f16000[3], (C0771)this.f16000[4]
      );
      this.f9000[3] = var22;
      C1000 var23 = C0122.m18000(this, f45000[4], (C0801)this.f16000[6], (OlipIn)this.f16000[5], (C0782)this.f48000[0], (C0799)this.f48000[1]);
      this.f9000[4] = var23;
      C0066 var24 = new C0066(this, false, f45000[5], true);
      this.f9000[5] = var24;
      C1000 var25 = (C1000)C0122.m18000(this, f45000[6], new C0784(this, f14000[0], false), new C0066(this, true, f14000[1], false), (C0066)this.f9000[5])
         .m28000(((C0767)this.f16000[0])::m14000, (C0066)this.f9000[5])
         .N(var1 -> {
            this.m176000();
            return (boolean)(!((C0767)this.f16000[0]).U() ? 1 : 0);
         });
      this.f9000[6] = var25;
      C1003 var26 = C0122.m4000(
         this,
         f14000[2],
         ElytraGliding.m18000(false),
         ElytraGliding.m30000(false),
         ElytraGliding.m6000(false),
         ElytraGliding.m26000(false),
         ElytraGliding.m42000(false),
         ElytraGliding.m12000(false)
      );
      this.f34000[0] = var26;
      C1013 var27 = new C1013(f14000[3], true);
      this.f34000[1] = var27;
      C1000 var28 = (C1000)C0122.m18000(this, f14000[4], (C1013)this.f34000[1], new C1013(f14000[5], false))
         .m28000(((C0767)this.f16000[0])::m14000, (C1013)this.f34000[1])
         .N(var1 -> {
            this.m176000();
            return (boolean)(!((C0767)this.f16000[0]).U() ? 1 : 0);
         });
      this.f34000[2] = var28;
      C1013 var29 = new C1013(f47000[0], true);
      this.f34000[3] = var29;
      C1013 var30 = new C1013(f47000[1], false);
      this.f44000[0] = var30;
      C1013 var31 = new C1013(f47000[2], false);
      this.f44000[1] = var31;
      C1000 var32 = C0122.m18000(this, f49000[0], (C1013)this.f34000[3], (C1013)this.f44000[0], (C1013)this.f44000[1]);
      this.f44000[2] = var32;
      C0991 var33 = (C0991)C0122.m26000(this, f49000[1], false).N(var1 -> {
         this.m176000();
         return (boolean)(!((C1013)this.f34000[3]).m14000() ? 1 : 0);
      });
      this.f44000[3] = var33;
      C0988 var34 = C0122.m12000(this, f49000[2], f50000[0], f50000[1], f55000[0], f55000[1]).m34000((Supplier<String>)OltlIpjm.f2000[1]);
      this.f44000[4] = var34;
      C0988 var35 = C0122.m12000(this, f49000[3], f55000[2], f55000[3], f12000[0], f12000[1]).N(((C0767)this.f16000[0])::m14000, f12000[2]).m30000(var1 -> {
         this.m176000();
         return (boolean)(!((C0767)this.f16000[0]).U() ? 1 : 0);
      });
      this.f44000[5] = var35;
      C0988 var36 = C0122.m12000(this, f49000[4], f12000[3], f12000[4], f12000[5], f12000[6]);
      this.f21000[0] = var36;
      C0779 var37 = new C0779(this, f49000[5], false, false);
      this.f21000[1] = var37;
      C1000 var38 = C0122.m18000(this, f49000[6], (C0779)this.f21000[1], new C0779(this, f49000[7], true, true), new IlqIsmn(this, f54000[0], false));
      this.f21000[2] = var38;
      C0991 var39 = C0122.m26000(this, f54000[1], true);
      this.f21000[3] = var39;
      C0991 var40 = C0122.m26000(this, f54000[2], true);
      this.f21000[4] = var40;
      C0991 var41 = C0122.m26000(this, f54000[3], true).N(((C0767)this.f16000[0])::m14000, false).m30000(var1 -> {
         this.m176000();
         return (boolean)(!((C0767)this.f16000[0]).U() ? 1 : 0);
      });
      this.f21000[5] = var41;
      IltOkpplt var42 = new IltOkpplt();
      this.f31000[0] = var42;
      OlmInrq var43 = new OlmInrq(this);
      this.f31000[1] = var43;
      Comparator var44 = Comparator.comparingInt(var0 -> var0.method_5864() == Nbp.Ly ? 0 : 1);
      this.f31000[2] = var44;
      Comparator var45 = Comparator.comparingInt(var1 -> this.m136000(C1177.m80000((NbK)var1), this.m76000()) ? 1 : 0);
      this.f26000[0] = var45;
      LinkedList var46 = new LinkedList();
      this.f26000[1] = var46;
   }

   static {
      ntfClinit();
   }

   private static void m38000() {
      f56000 = new short[]{0, 1, 2, 3, 4, 5, 6, 0};
      f15000 = new short[]{1, 2, 3, 4, 3};
      f17000 = new short[]{4, 2, 5};
      f18000 = new short[]{6, 0};
      f10000 = new short[]{5, 6, 0, 1, 2, 3, 4};
      f7000 = new short[]{2, 0};
      f59000 = new short[]{1, 2, 3, 4, 3, 6, 5};
      f3000 = new short[]{0, 1, 4, 5, 5, 0};
      f27000 = new short[]{5, 6};
      f35000 = new short[]{0, 1};
      f52000 = new short[]{1, 0, 1, 2, 3};
      f25000 = new short[]{0, 1, 3, 0, 1, 2, 3};
      f46000 = new short[]{1, 4, 0, 5, 0, 1, 1, 2};
      f2000 = new short[]{3, 4};
      f36000 = new short[]{0, 5, 0, 1};
      f61000 = new short[]{2, 0, 1, 2, 5, 7, 7, 0};
      f30000 = new short[]{0, 2, 2, 1, 2};
      f23000 = new short[]{2, 2, 3, 2, 2, 6, 1, 3};
      f29000 = new short[]{4, 3, 4, 0, 4, 3};
      f40000 = new short[]{3, 4, 4, 4};
      f4000 = new short[]{0, 4, 3, 7, 0, 4};
      f41000 = new short[]{7, 7, 2, 5, 0, 4};
      f53000 = new short[]{0, 6};
      f19000 = new short[]{6, 6, 5};
      f1000 = new short[]{1, 1, 5, 6};
      f11000 = new short[]{1, 1, 0};
      f57000 = new short[]{3, 0, 4, 0, 4};
      f20000 = new short[]{1, 0, 2, 4};
      f60000 = new short[]{3, 5};
      f24000 = new short[]{0, 0, 5, 0, 4, 0};
      f13000 = new short[]{4, 5, 0, 2, 6, 0, 0};
      f32000 = new short[]{0, 4, 4, 4, 3, 0, 3, 3};
      f42000 = new short[]{0, 3};
      f58000 = new short[]{2, 0, 4, 0, 4};
      f33000 = new short[]{2, 3, 0, 4};
      f37000 = new short[]{6, 2, 3, 0, 4};
      f5000 = new short[]{3, 3, 1, 1, 1, 0};
      f28000 = new short[]{4, 1, 1, 1, 6, 3};
      f39000 = new short[]{2, 0, 0};
      f38000 = new short[]{3, 0, 0, 5, 0, 0, 0};
   }

   private static void m42000() {
      f51000 = new Object[]{80L};
   }

   private static void m48000() {
      f43000 = new String[]{"ft", "grim", "spooky-time", "noise", "hw", "smart", "distance"};
      f6000 = new String[]{"fov", "health", "invisible"};
      f22000 = new String[]{"naked", "bot", "players", "mobs"};
      f45000 = new String[]{"villagers", "targets", "target-condition", "mode", "sort", "lite", "move-correction"};
      f14000 = new String[]{"target-follow", "strong", "do-not-attack", "default", "sprint-mode", "fast"};
      f47000 = new String[]{"critical-disabled", "critical-always", "critical-only-space"};
      f49000 = new String[]{"critical-hit", "increase-crit-accuracy", "fov", "additional-range", "aim-range", "disabled", "through-walls", "always"};
      f54000 = new String[]{"ft", "shield-break", "auto-mace", "swap-damage"};
   }

   public boolean m58000() {
      this.m176000();
      return ((C0066)((C1000)this.f9000[6]).i()).m8000();
   }

   public boolean m60000() {
      this.m176000();
      return (boolean)((NjL)this.f26000[2] != null ? 1 : 0);
   }

   public boolean m66000() {
      this.m176000();
      if (!(Boolean)((C0991)this.f44000[3]).i()) {
         return (boolean)0;
      } else {
         synchronized ((List)this.f26000[1]) {
            return (boolean)(!((List)this.f26000[1]).isEmpty() ? 1 : 0);
         }
      }
   }

   public boolean m68000() {
      this.m176000();
      return ((C0779)((C1000)this.f21000[2]).i()).m8000();
   }

   public double m72000() {
      this.m176000();
      C1150 var1 = C1150.m16000((Float)((C0988)this.f21000[0]).i());
      NursultanClient.m8000().m12000(var1);
      return this.m76000() + var1.m18000();
   }

   public double m76000() {
      this.m176000();
      return ((NNNwS)((NNuU)this.y[0]).T[4]).method_55755() + ((Float)((C0988)this.f44000[5]).i()).floatValue();
   }

   private void m80000() {
      this.m176000();
      if (((Base0764)((C1000)this.f9000[3]).i()).m2000()) {
         for (NNNwz var2 : ((NNNZg)((NNuU)this.y[0]).T[3]).method_18456()) {
            if (var2 instanceof C0071 var3) {
               wY.y(var3);
            }
         }
      }
   }

   private static void m84000() {
      f50000 = new float[]{180.0F, 1.0F};
      f55000 = new float[]{180.0F, 1.0F, 0.0F, 0.0F};
      f12000 = new float[]{3.0F, 0.1F, 0.0F, 1.0F, 0.0F, 10.0F, 0.1F, 180.0F};
   }

   public void m86000() {
      this.m176000();
      ((IltOkpplt)this.f31000[0]).m8000();
   }

   private static void m90000() {
      f8000 = new double[]{1.0, 2.0, 0.0};
   }

   public NjL m96000() {
      this.m176000();
      return (NjL)this.f26000[2];
   }

   public void m4000() {
      this.m176000();
      if ((Boolean)((C0991)this.f21000[5]).i()) {
         ((IltOkpplt)this.f31000[0]).m62000();
      }
   }

   @Override
   public void m10000() {
      this.m176000();
      Object var5 = null;
      this.f26000[2] = var5;
      this.m140000(0);
      Boolean var6 = false;
      this.f26000[5] = var6;
      if ((Boolean)this.f26000[7]) {
         C0892.m20000();
         Boolean var7 = false;
         this.f26000[7] = var7;
      }

      ((IltOkpplt)this.f31000[0]).m2000();
      super.m6000();
   }

   public static boolean m116000(boolean var0) {
      AttackAura var1 = NursultanClient.m88000().m30000();
      return (boolean)(!var0 || (NjL)var1.f26000[2] != null && var1.U() ? 0 : 1);
   }

   public void m122000(int var1) {
      this.m176000();
      Integer var6 = var1;
      this.f26000[4] = var6;
   }

   @Iface0642
   public void m124000(AttackAura_x_x var1) {
      this.m176000();
      ((C0066)((C1000)this.f9000[6]).i()).m6000(var1);
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m128000(rw.module.Blink var1) {
      this.m176000();
      if ((Boolean)this.f26000[5] && !var1.y() && (Integer)this.f26000[6] <= 0) {
         var1.N();
         synchronized ((List)this.f26000[1]) {
            ((List)this.f26000[1]).add(new Rec0190(var1.m2000(), System.currentTimeMillis()));
         }
      } else {
         this.m140000(0);
      }
   }

   @Iface0642
   public void m130000(Module005 var1) {
      this.m176000();
      ((C0779)((C1000)this.f21000[2]).i()).m6000(var1);
   }

   @Iface0642
   public void m132000(rw.module.AttackAura var1) {
      this.m176000();
      ((C0779)((C1000)this.f21000[2]).i()).m6000(var1);
      Boolean var6 = this.m6000(var1.m54000());
      this.f26000[5] = var6;
   }

   @Iface0642
   public void m134000(AttackAura_x var1) {
      this.m176000();
      if ((Boolean)((C0991)this.f21000[4]).i() && !(((NNNwS)((NNuU)this.y[0]).T[4]).field_6017 < f8000[0])) {
         if (!(var1.m2000() instanceof NjL var2 && !((Base0764)((C1000)this.f9000[3]).i()).m20000(var2))) {
            int var9 = IljlItp.m60000(NQa.Gm);
            if (!IljlItp.m36000(var9)) {
               C0892.m44000(var9);
               Boolean var8 = true;
               this.f26000[7] = var8;
            }
         }
      }
   }

   public boolean m136000(NXi var1, double var2) {
      return (boolean)(var1.R(((NNNwS)((NNuU)this.y[0]).T[4]).method_33571()) > var2 ? 1 : 0);
   }

   public void m140000(int var1) {
      this.m176000();
      synchronized ((List)this.f26000[1]) {
         if ((NNNwS)((NNuU)this.y[0]).T[4] == null) {
            ((List)this.f26000[1]).clear();
            return;
         }

         for (Rec0190 var4 : (List)this.f26000[1]) {
            C0160.m74000(var4.m4000());
         }

         ((List)this.f26000[1]).clear();
      }

      Integer var10 = var1;
      this.f26000[6] = var10;
   }

   boolean m142000(NXi var1, NbK var2) {
      NXi var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();
      NNty var4 = C1176.m28000(new NNnf(var3, var1, NNnS.field_17559, NNnC.field_1348, (NNNwS)((NNuU)this.y[0]).T[4]));
      return (boolean)(var4.N() == NcZ.field_1333 ? 0 : C1176.m14000(var3, var1, var2).map(var2x -> var2x.R(var3) > var4.y().R(var3)).orElse(true));
   }

   @Iface0642
   public void m144000(C0719 var1) {
      this.m176000();
      ((C0779)((C1000)this.f21000[2]).i()).m6000(var1);
      this.m32000();
      if (!((OlmInrq)this.f31000[1]).m10000((NjL)this.f26000[2])) {
         NjL var6 = this.m170000();
         this.f26000[2] = var6;
      }

      if ((NjL)this.f26000[2] != null) {
         ((Base0764)((C1000)this.f9000[3]).i()).m44000((NjL)this.f26000[2]);
         TargetEsp.m2000((NjL)this.f26000[2]);
      }

      this.m80000();
   }

   @Iface0642(
      y = Enum0081.BEFORE_ALL
   )
   public void m148000(C0916 var1) {
      this.m176000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null) {
         ((IltOkpplt)this.f31000[0]).m20000();
         if ((Integer)this.f26000[6] > 0) {
            Integer var12 = (Integer)this.f26000[6] - 1;
            this.f26000[6] = var12;
            Boolean var13 = false;
            this.f26000[5] = var13;
         }

         synchronized ((List)this.f26000[1]) {
            long var3 = System.currentTimeMillis();
            Iterator var5 = ((List)this.f26000[1]).iterator();

            while (var5.hasNext()) {
               Rec0190 var6 = (Rec0190)var5.next();
               if (var3 - var6.m6000() >= 80L) {
                  C0160.m74000(var6.m4000());
                  var5.remove();
               }
            }
         }
      }
   }

   public boolean m150000(NjL var1) {
      this.m176000();
      if ((Float)((C0988)this.f44000[4]).i() == f12000[7]) {
         return (boolean)1;
      } else {
         C0983 var2 = C0989.m4000();
         return (boolean)(C1176.m60000(var2, this.m76000(), var1)
               && !(var2.m48000(C1177.m64000(var1, var2, false, this.m76000())) < ((C0988)this.f44000[4]).i())
            ? 0
            : 1);
      }
   }

   @Iface0642
   public void m154000(C0913 var1) {
      this.m176000();
      ((IltOkpplt)this.f31000[0]).m8000();
      if ((Boolean)((C0991)this.f21000[4]).i() && (Boolean)this.f26000[7]) {
         Boolean var6 = false;
         this.f26000[7] = var6;
         C0892.m20000();
      }
   }

   @Iface0642
   public void m156000(C0905 var1) {
      this.m176000();
      ((IltOkpplt)this.f31000[0]).m48000();
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m158000(AttackAura_x_x var1) {
      this.m176000();
      if (((C1013)this.f34000[1]).m14000()) {
         if ((Integer)this.f26000[3] > 0) {
            var1.m16000((boolean)0);
         }

         if ((Integer)this.f26000[4] > 0) {
            var1.m10000((boolean)0);
         }
      } else if ((Integer)this.f26000[3] > 0 || (Integer)this.f26000[4] > 0) {
         var1.m10000((boolean)0);
         ((NNNwS)((NNuU)this.y[0]).T[4]).method_5728((boolean)0);
      }

      Integer var6 = (Integer)this.f26000[3] - 1;
      this.f26000[3] = var6;
      Integer var7 = (Integer)this.f26000[4] - 1;
      this.f26000[4] = var7;
   }

   private NjL m170000() {
      this.m176000();
      return ((NNNZg)((NNuU)this.y[0]).T[3])
         .method_8333((NNNwS)((NNuU)this.y[0]).T[4], ((NNNwS)((NNuU)this.y[0]).T[4]).method_5829().M(this.m72000() + f8000[1]), (OlmInrq)this.f31000[1])
         .stream()
         .map(var0 -> (NjL)var0)
         .min(((Comparator)this.f26000[0]).thenComparing((Comparator)this.f31000[2]).thenComparing((Comparator)((C1000)this.f9000[4]).i()))
         .orElse(null);
   }

   public boolean m172000() {
      this.m176000();
      return (boolean)(((C0991)this.f21000[5]).i() && !((IltOkpplt)this.f31000[0]).m38000() ? 0 : 1);
   }

   private void m176000() {
      if (this.f16000 == null) {
         this.f16000 = new Object[7];
         Object[] var1 = this.f16000;
      }

      if (this.f48000 == null) {
         this.f48000 = new Object[7];
         Object[] var2 = this.f48000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[7];
         Object[] var3 = this.f9000;
      }

      if (this.f34000 == null) {
         this.f34000 = new Object[4];
         Object[] var4 = this.f34000;
      }

      if (this.f44000 == null) {
         this.f44000 = new Object[6];
         Object[] var5 = this.f44000;
      }

      if (this.f21000 == null) {
         this.f21000 = new Object[6];
         Object[] var6 = this.f21000;
      }

      if (this.f31000 == null) {
         this.f31000 = new Object[3];
         Object[] var7 = this.f31000;
      }

      if (this.f26000 == null) {
         this.f26000 = new Object[8];
         Object[] var8 = this.f26000;
         var8[3] = 0;
         var8[4] = 0;
         var8[5] = false;
         var8[6] = 0;
         var8[7] = false;
      }
   }
}
