package rw.gui;

import KDFzREm.NNWE;
import KDFzREm.NNuU;
import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0138;
import rw.core.C0721;
import rw.core.C0847;
import rw.core.C0979;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1000;
import rw.core.C1003;
import rw.core.C1004;
import rw.core.C1013;
import rw.core.C1183;
import rw.core.CriticalPart;
import rw.core.CriticalPart2;
import rw.core.CriticalPart4;
import rw.core.IlmmjsIlp;
import rw.core.OuFz;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Particles",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class Critical extends GuiWidget {
   private static float[] f1000;
   private static float[] f2000;
   public static Object[] f3000;
   public Object[] f4000;
   private static String[] f5000;
   private static float[] f6000;
   public Object[] f7000;
   private static float[] f8000;
   private static String[] f9000;

   private static void m4000() {
      f2000 = new float[]{10.0F, 0.0F, 100.0F, 1.0F, 100.0F, 0.0F, 100.0F};
      f8000 = new float[]{1.0F, 0.0F, 1.0F, 0.5F, 0.85F};
      f6000 = new float[]{0.01F, 1.0F, 1.0F, 0.1F};
      f1000 = new float[]{0.44F, 0.6F, 2.5F, 0.6F, 2.5F, 0.1F, 0.44F};
   }

   public Critical() {
      this.m12000();
      C0847 var5 = new C0847(this, f9000[0], true);
      this.f4000[0] = var5;
      CriticalPart4 var6 = new CriticalPart4(this, f9000[1], true);
      this.f4000[1] = var6;
      CriticalPart var7 = new CriticalPart(this, f9000[2], false);
      this.f4000[2] = var7;
      CriticalPart2 var8 = new CriticalPart2(this, f9000[3], true);
      this.f4000[3] = var8;
      C1003 var9 = C0122.m4000(this, f9000[4], (OuFz)this.f4000[0], (OuFz)this.f4000[1], (OuFz)this.f4000[2], (OuFz)this.f4000[3]);
      this.f4000[4] = var9;
      C0988 var10 = (C0988)C0122.m12000(this, f9000[5], f2000[0], f2000[1], f2000[2], f2000[3]).N((var1, var2) -> this.m8000());
      this.f4000[5] = var10;
      C0988 var11 = (C0988)C0122.m12000(this, f9000[6], f2000[4], f2000[5], f2000[6], f8000[0]).N((var1, var2) -> this.m8000());
      this.f7000[0] = var11;
      C1013 var12 = new C1013(f9000[7], true);
      this.f7000[1] = var12;
      C1013 var13 = new C1013(f5000[0], false);
      this.f7000[2] = var13;
      C1000 var14 = C0122.m18000(this, f5000[1], (C1013)this.f7000[1], (C1013)this.f7000[2]);
      this.f7000[3] = var14;
      C1004 var15 = (C1004)C0122.m10000(this, f5000[2], new C0979(f8000[1], f8000[2]), new C0979(f8000[3], f8000[4]), f6000[0]).N(var1 -> {
         this.m12000();
         return ((C1013)this.f7000[1]).m14000();
      });
      this.f7000[4] = var15;
      C0998 var16 = (C0998)C0122.m6000(this, f5000[3], -11104513).N(var1 -> {
         this.m12000();
         return ((C1013)this.f7000[2]).m14000();
      });
      this.f7000[5] = var16;
      rw.setting.CriticalPart var17 = new rw.setting.CriticalPart(65536, this.m14000(), this.m24000());
      this.f7000[6] = var17;
   }

   static {
      ntfClinit();
   }

   private float m14000() {
      this.m12000();
      return NNWE.B((Float)((C0988)this.f7000[0]).i() / ((C0988)this.f7000[0]).m36000(), f6000[3], f1000[0]);
   }

   private void m8000() {
      this.m12000();
      ((rw.setting.CriticalPart)this.f7000[6]).m44000(this.m14000(), this.m24000());
   }

   private static void m10000() {
      f3000 = new Object[]{0.6F, 2.5F, 0.1F, 0.44F};
   }

   private static void m18000() {
      f9000 = new String[]{"totem-popping", "ambience", "thrown-item", "critical-hit", "emitters", "pinch", "size", "hsv"};
      f5000 = new String[]{"custom", "color-selectable", "color-range", "color"};
   }

   public int m20000() {
      this.m12000();
      if (((C1013)this.f7000[1]).m14000()) {
         float var1 = C1183.m18000(((C0979)((C1004)this.f7000[4]).i()).m32000(), ((C0979)((C1004)this.f7000[4]).i()).m2000());
         return NNWE.M(var1, f6000[1], f6000[2]);
      } else {
         return (Integer)((C0998)this.f7000[5]).i();
      }
   }

   private float m24000() {
      this.m12000();
      return NNWE.B((Float)((C0988)this.f4000[5]).i() / ((C0988)this.f4000[5]).m36000(), f1000[1], f1000[2]);
   }

   private void m12000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[6];
         Object[] var1 = this.f4000;
      }

      if (this.f7000 == null) {
         this.f7000 = new Object[7];
         Object[] var2 = this.f7000;
      }
   }

   @Iface0642
   public void m38000(C0138 var1) {
      this.m12000();
      ((rw.setting.CriticalPart)this.f7000[6]).m50000(var1);
   }

   @Iface0642
   public void m40000(rw.module.AutoAccept var1) {
      NNuU.Nq().execute(() -> {
         this.m12000();
         ((List)((C1003)this.f4000[4]).i()).forEach(var1xx -> var1xx.y(var1));
      });
   }

   @Iface0642
   public void m46000(C0721 var1) {
      this.m12000();
      ((List)((C1003)this.f4000[4]).i()).forEach(var1x -> var1x.y(var1));
      ((rw.setting.CriticalPart)this.f7000[6]).m46000();
   }

   public void m50000(IlmmjsIlp var1) {
      this.m12000();
      ((rw.setting.CriticalPart)this.f7000[6]).m42000(var1);
   }
}
