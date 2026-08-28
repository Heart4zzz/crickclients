package rw.gui;

import KDFzREm.NNUU;
import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0720;
import rw.core.C0927;
import rw.core.C0929;
import rw.core.C0931;
import rw.core.C0934;
import rw.core.C0945;
import rw.core.C0948;
import rw.core.C0988;
import rw.core.C1003;
import rw.core.OmKw;
import rw.defs.Enum0055;
import rw.module.IltOmtiq;
import rw.module.Module001;
import rw.module.Module003;
import rw.module.Module007;
import rw.module.Module009;
import rw.module.Module013;
import rw.module.Module014;
import rw.module.Module020;
import rw.module.Module021;
import rw.module.Module023;
import rw.module.Module024;
import rw.module.Module026;
import rw.module.Module027;
import rw.module.Nametags;
import rw.module.OlrsqIrj;
import rw.module.Particles;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Removals",
   y = Enum0055.VISUAL,
   N = Enum0070.SCREEN
)
public class Vignette extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static String[] f6000;
   private static boolean[] f7000;
   private static String[] f8000;
   private static String[] f9000;
   public Object[] f10000;
   public Object[] f11000;
   private static boolean[] f12000;
   private static boolean[] f13000;
   public Object[] f14000;
   private static String[] f15000;
   private static String[] f16000;
   private static boolean[] f17000;
   private static boolean[] f18000;
   private static boolean[] f19000;
   public Object[] f20000;
   private static boolean[] f21000;
   private static float[] f22000;
   private static boolean[] f23000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
      }

      if (this.f20000 == null) {
         this.f20000 = new Object[2];
         Object[] var2 = this.f20000;
      }

      if (this.f11000 == null) {
         this.f11000 = new Object[3];
         Object[] var3 = this.f11000;
      }

      if (this.f14000 == null) {
         this.f14000 = new Object[8];
         Object[] var4 = this.f14000;
      }

      if (this.f10000 == null) {
         this.f10000 = new Object[2];
         Object[] var5 = this.f10000;
      }
   }

   public Vignette() {
      this.m4000();
      C0934 var5 = new C0934(f9000[0], true, Module001.class);
      this.f2000[0] = var5;
      C0934 var6 = new C0934(f9000[1], true, Module007.class);
      this.f2000[1] = var6;
      C0934 var7 = new C0934(f9000[2], true, OlrsqIrj.class);
      this.f2000[2] = var7;
      C0934 var8 = new C0934(f1000[0], true, Module014.class);
      this.f2000[3] = var8;
      C0934 var9 = new C0934(f1000[1], true, Module020.class);
      this.f20000[0] = var9;
      C0934 var10 = new C0934(f15000[0], true, Module003.class);
      this.f20000[1] = var10;
      C0934 var11 = new C0934(f15000[1], true, Module023.class);
      this.f11000[0] = var11;
      C0934 var12 = new C0934(f15000[2], true, Module026.class);
      this.f11000[1] = var12;
      String var10003 = f16000[0];
      boolean var10004 = f19000[0];
      Class[] var10005 = new Class[f19000[1]];
      var10005[f19000[2]] = Module013.class;
      C0934 var13 = new C0934(var10003, var10004, var10005);
      this.f11000[2] = var13;
      var10003 = f16000[1];
      var10004 = f19000[3];
      var10005 = new Class[f19000[4]];
      var10005[f19000[5]] = Module009.class;
      C0934 var14 = new C0934(var10003, var10004, var10005);
      this.f14000[0] = var14;
      var10003 = f16000[2];
      var10004 = f19000[6];
      var10005 = new Class[f19000[7]];
      var10005[0] = Module027.class;
      C0934 var15 = new C0934(var10003, var10004, var10005);
      this.f14000[1] = var15;
      C0934 var16 = new C0934(f6000[0], true, Module021.class);
      this.f14000[2] = var16;
      C0945 var17 = new C0945(f6000[1], true);
      this.f14000[3] = var17;
      C0931 var18 = new C0931(f6000[2], true);
      this.f14000[4] = var18;
      C0929 var19 = new C0929(f6000[3], true);
      this.f14000[5] = var19;
      C0948 var20 = new C0948(f6000[4], true);
      this.f14000[6] = var20;
      C1003 var21 = C0122.m4000(
         this,
         f6000[5],
         (C0934)this.f20000[0],
         (C0934)this.f2000[3],
         (C0934)this.f2000[2],
         (C0934)this.f2000[0],
         (C0934)this.f2000[1],
         (C0945)this.f14000[3],
         (C0931)this.f14000[4],
         (C0934)this.f11000[1],
         (C0929)this.f14000[5],
         (C0934)this.f11000[2],
         (C0934)this.f20000[1],
         (C0934)this.f11000[0],
         (C0934)this.f14000[0],
         (C0934)this.f14000[1],
         (C0934)this.f14000[2],
         (C0948)this.f14000[6]
      );
      this.f14000[7] = var21;
      C1003 var22 = C0122.m4000(
         this,
         f6000[6],
         new C0927(f8000[0], true, NNUU.QC, NNUU.yh),
         new C0927(f8000[1], true, NNUU.Jy),
         new C0927(f8000[2], true, NNUU.Ui),
         new C0927(f8000[3], true, NNUU.Oa, NNUU.zK, NNUU.db),
         new C0927(f8000[4], true, NNUU.QB, NNUU.Us)
      );
      this.f10000[0] = var22;
      C0988 var23 = C0122.m12000(this, f8000[5], f22000[0], f22000[1], f22000[2], f22000[3]);
      this.f10000[1] = var23;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f9000 = new String[]{"tilt-view", "vignette-overlay", "fire-overlay"};
      f1000 = new String[]{"under-water-overlay", "wall-overlay"};
      f15000 = new String[]{"rain", "fog", "blindness"};
      f16000 = new String[]{"nausea", "totem-pop", "status-effect-overlay"};
      f6000 = new String[]{"scoreboard", "holograms", "camera-clip", "heart-effect", "fishing-bobber", "removals", "sounds"};
      f8000 = new String[]{"trident", "wither-spawn", "end-portal-open", "anarchy-events", "exp-bottle", "sound-multiplier"};
   }

   private static void m10000() {
      f13000 = new boolean[]{true, true, false, true, true, false};
      f23000 = new boolean[]{true, true, false, true, true};
      f21000 = new boolean[]{false, true, true};
      f18000 = new boolean[]{false, true, true, false, true, true, false, true};
      f4000 = new boolean[]{true, false};
      f19000 = new boolean[]{true, true, false, true, true, false, true, true};
      f12000 = new boolean[]{false, true, true, false, true, true, true};
      f17000 = new boolean[]{true, false, true, false};
      f5000 = new boolean[]{true, false, true, true};
      f7000 = new boolean[]{true, true, false, true, true, false, true, false};
      f3000 = new boolean[]{true, true, false, true};
   }

   private static void m12000() {
      f22000 = new float[]{0.5F, 0.0F, 1.0F, 0.01F};
   }

   @Iface0642
   public void m40000(Module003 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m42000(IltOmtiq var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m44000(Module009 var1) {
      this.m46000(var1);
   }

   private void m46000(Object var1) {
      this.m4000();
      ((List)((C1003)this.f14000[7]).i()).forEach(var1x -> var1x.y(var1));
   }

   @Iface0642
   public void m48000(Module020 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m50000(Module013 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m52000(Module026 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m54000(OmKw var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m56000(Module014 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m58000(Nametags var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m60000(OlrsqIrj var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m62000(C0720 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m64000(Module027 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m66000(Module007 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m68000(Module024 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m70000(Module021 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m72000(Module001 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m74000(Module023 var1) {
      this.m46000(var1);
   }

   @Iface0642
   public void m78000(Particles var1) {
      this.m4000();

      for (C0927 var3 : (List)((C1003)this.f10000[0]).i()) {
         if (var3.m4000(var1)) {
            var1.m46000((Float)((C0988)this.f10000[1]).i());
         }
      }
   }
}
