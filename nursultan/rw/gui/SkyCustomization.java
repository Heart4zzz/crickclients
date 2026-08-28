package rw.gui;

import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0011;
import rw.core.C0012;
import rw.core.C0721;
import rw.core.C0830;
import rw.core.C0928;
import rw.core.C0933;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1000;
import rw.core.IlksOmts;
import rw.core.IltOtprri;
import rw.core.KrHa;
import rw.core.OllkkkIrq;
import rw.data.Rec0004;
import rw.defs.Enum0055;
import rw.setting.C0118;
import rw.setting.C0122;
import rw.setting.IlkkOttlj;

@AnnotationDefault(
   L = "SkyCustomization",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class SkyCustomization extends GuiWidget {
   private static String[] f1000;
   private static String[] f2000;
   private static float[] f3000;
   private static float[] f4000;
   public Object[] f5000;
   private static float[] f6000;
   public Object[] f7000;
   private static String[] f8000;
   public static Object[] f9000;
   private static float[] f10000;
   private static float[] f11000;

   public C0988 m10000() {
      this.m20000();
      return (C0988)this.f5000[5];
   }

   public C0988 m12000() {
      this.m20000();
      return (C0988)this.f5000[4];
   }

   public SkyCustomization() {
      this.m20000();
      C1000 var5 = C0122.m18000(this, f2000[0], new C0933(f2000[1], true, true), new C0933(f2000[2], false, false));
      this.f5000[0] = var5;
      C0998 var6 = C0122.m6000(this, f1000[0], -14425478);
      this.f5000[1] = var6;
      C0998 var7 = C0122.m6000(this, f1000[1], -8766209);
      this.f5000[2] = var7;
      C0988 var8 = (C0988)C0122.m12000(this, f1000[2], f4000[0], f4000[1], f4000[2], f4000[3]).N(var1 -> {
         this.m20000();
         return ((C0933)((C1000)this.f5000[0]).i()).m2000();
      });
      this.f5000[3] = var8;
      C0988 var9 = (C0988)C0122.m12000(this, f1000[3], f4000[4], f4000[5], f4000[6], f10000[0]).N(var1 -> {
         this.m20000();
         return ((C0933)((C1000)this.f5000[0]).i()).m2000();
      });
      this.f5000[4] = var9;
      C0988 var10 = (C0988)C0122.m12000(this, f1000[4], f10000[1], f6000[0], f6000[1], f6000[2]).N(var1 -> {
         this.m20000();
         return ((C0933)((C1000)this.f5000[0]).i()).m2000();
      });
      this.f5000[5] = var10;
      C0988 var11 = C0122.m12000(this, f8000[0], f3000[0], f3000[1], f3000[2], f3000[3]);
      this.f7000[0] = var11;
      C1000 var12 = C0122.m18000(
         this,
         f8000[1],
         new IltOtprri(f8000[2], 1, true),
         new IltOtprri(f8000[3], 2, false),
         new IltOtprri(f8000[4], 4, false),
         new IltOtprri(f8000[5], 8, false)
      );
      this.f7000[1] = var12;
      C0830 var13 = C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024);
      this.f7000[2] = var13;
      C0012 var14 = KrHa.m18000(() -> {
         this.m20000();
         return ((NNuU)this.y[0]).e().N / ((IltOtprri)((C1000)this.f7000[1]).i()).m2000();
      }, () -> {
         this.m20000();
         return ((NNuU)this.y[0]).e().y / ((IltOtprri)((C1000)this.f7000[1]).i()).m2000();
      });
      this.f7000[3] = var14;
      C0012 var15 = KrHa.m18000(() -> {
         this.m20000();
         return ((NNuU)this.y[0]).e().N / (((IltOtprri)((C1000)this.f7000[1]).i()).m2000() * 3);
      }, () -> {
         this.m20000();
         return ((NNuU)this.y[0]).e().y / (((IltOtprri)((C1000)this.f7000[1]).i()).m2000() * 3);
      });
      this.f7000[4] = var15;
      IlksOmts var16 = IlksOmts.<OllkkkIrq>m22000()
         .m18000(new rw.setting.C0111(this, (C0830)this.f7000[2]))
         .m36000((C0012)this.f7000[3])
         .m32000(new C0928((C0830)this.f7000[2]))
         .m4000(((NNuU)this.y[0])::e)
         .m10000((C0012)this.f7000[3])
         .m52000();
      this.f7000[5] = var16;
      IlksOmts var17 = IlksOmts.<OllkkkIrq>m22000()
         .m18000(new IlkkOttlj(this, (C0830)this.f7000[2]))
         .m36000((C0012)this.f7000[4])
         .m32000(new C0118((C0830)this.f7000[2]))
         .m4000(((NNuU)this.y[0])::e)
         .m10000((C0012)this.f7000[4])
         .m52000();
      this.f7000[6] = var17;
   }

   static {
      ntfClinit();
   }

   private void m20000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[6];
         Object[] var1 = this.f5000;
      }

      if (this.f7000 == null) {
         this.f7000 = new Object[8];
         Object[] var2 = this.f7000;
         var2[7] = f3000[7];
      }
   }

   public C0012 m26000() {
      this.m20000();
      return (C0012)this.f7000[3];
   }

   public C0988 m28000() {
      this.m20000();
      return (C0988)this.f7000[0];
   }

   public C0998 m32000() {
      this.m20000();
      return (C0998)this.f5000[1];
   }

   private static void m36000() {
      f2000 = new String[]{"mode", "chroma", "borealis"};
      f1000 = new String[]{"aurora-first", "aurora-second", "intensity", "softness", "coverage"};
      f8000 = new String[]{"speed", "downscale", "_1x", "_2x", "_4x", "_8x"};
   }

   public C0988 m40000() {
      this.m20000();
      return (C0988)this.f5000[3];
   }

   private static void m42000() {
      f4000 = new float[]{1.5F, 0.0F, 3.0F, 0.05F, 0.4F, 0.0F, 1.0F};
      f10000 = new float[]{0.01F, 0.5F};
      f6000 = new float[]{0.0F, 0.67F, 0.01F};
      f3000 = new float[]{1.0F, 0.0F, 5.0F, 0.05F, 0.05F, 100000.0F, 0.05F, 0.0F};
      f11000 = new float[]{0.05F};
   }

   public C0998 m46000() {
      this.m20000();
      return (C0998)this.f5000[2];
   }

   public C0012 m50000() {
      this.m20000();
      return (C0012)this.f7000[4];
   }

   public C1000<C0933> m52000() {
      this.m20000();
      return (C1000<C0933>)this.f5000[0];
   }

   @Iface0642
   public void m66000(C0721 var1) {
      this.m20000();
      Float var6 = ((Float)this.f7000[7] + f3000[4] * (Float)((C0988)this.f7000[0]).i()) % f3000[5];
      this.f7000[7] = var6;
   }

   public float m68000(float var1) {
      this.m20000();
      return (Float)this.f7000[7] + var1 * f3000[6] * (Float)((C0988)this.f7000[0]).i();
   }

   @Iface0642
   public void m70000(OllkkkIrq var1) {
      this.m20000();
      if (((C0933)((C1000)this.f5000[0]).i()).m2000()) {
         ((IlksOmts)this.f7000[5]).m8000(var1);
      } else {
         ((IlksOmts)this.f7000[6]).m8000(var1);
      }
   }

   private static void m80000() {
      f9000 = new Object[]{3, 0.05F};
   }
}
