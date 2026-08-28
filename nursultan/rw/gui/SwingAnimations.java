package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.Nbh;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base0940;
import rw.core.C0158;
import rw.core.C0938;
import rw.core.C0942;
import rw.core.C0944;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.IlsIskr;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "SwingAnimations",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class SwingAnimations extends GuiWidget {
   private static float[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   private static String[] f4000;
   private static float[] f5000;
   private static String[] f6000;
   public Object[] f7000;

   private static void m4000() {
      f1000 = new float[]{8.0F, 1.0F};
      f5000 = new float[]{10.0F, 1.0F, 8.0F, 3.0F, 10.0F, 1.0F, (float) (Math.PI / 2), 2.0F};
      f3000 = new float[]{10.0F};
   }

   public SwingAnimations() {
      this.m8000();
      C0938 var5 = new C0938(this, f4000[0], true);
      this.f2000[0] = var5;
      IlsIskr var6 = new IlsIskr(this, f4000[1], false);
      this.f2000[1] = var6;
      C0942 var7 = new C0942(this, f6000[0], false);
      this.f2000[2] = var7;
      C0944 var8 = new C0944(this, f6000[1], false);
      this.f2000[3] = var8;
      C1000 var9 = C0122.m18000(this, f6000[2], (C0938)this.f2000[0], (IlsIskr)this.f2000[1], (C0942)this.f2000[2], (C0944)this.f2000[3]);
      this.f2000[4] = var9;
      C0988 var10 = (C0988)C0122.m12000(this, f6000[3], f1000[0], f1000[1], f5000[0], f5000[1]).N(var1 -> {
         this.m8000();
         return ((Base0940)((C1000)this.f2000[4]).i()).m4000();
      });
      this.f2000[5] = var10;
      C0988 var11 = (C0988)C0122.m12000(this, f6000[4], f5000[2], f5000[3], f5000[4], f5000[5]).N(var1 -> {
         this.m8000();
         return ((Base0940)((C1000)this.f2000[4]).i()).m2000();
      });
      this.f2000[6] = var11;
      C0991 var12 = (C0991)C0122.m26000(this, f6000[5], false).N(var1 -> {
         this.m8000();
         return ((IlsIskr)this.f2000[1]).U();
      });
      this.f7000[0] = var12;
      C0991 var13 = C0122.m26000(this, f6000[6], false);
      this.f7000[1] = var13;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[7];
         Object[] var1 = this.f2000;
      }

      if (this.f7000 == null) {
         this.f7000 = new Object[2];
         Object[] var2 = this.f7000;
      }
   }

   public C0991 m12000() {
      this.m8000();
      return (C0991)this.f7000[0];
   }

   private static void m10000() {
      f4000 = new String[]{"swing-1", "swing-2"};
      f6000 = new String[]{"swing-3", "swing-4", "swing", "swing-strength", "spin-smoothness", "spinning", "only-while-have-target"};
   }

   @Iface0642
   public void m22000(rw.module.SwingAnimations var1) {
      this.m8000();
      Nbh var2 = var1.m12000();
      if (!AttackAura.m116000((Boolean)((C0991)this.f7000[1]).i()) && ((NNNwS)((NNuU)this.y[0]).T[4]).method_6068() == var2) {
         ((Base0940)((C1000)this.f2000[4]).i())
            .m6000(
               var1.m22000(),
               var2 == Nbh.field_6182 ? -1 : 1,
               NNWE.m(var1.m28000() * f5000[6] * f5000[7]),
               (Float)((C0988)this.f2000[6]).i(),
               (Float)((C0988)this.f2000[5]).i() * f3000[0],
               var1.m28000(),
               var1.m2000()
            );
         var1.N();
      }
   }

   @Iface0642
   public void m24000(C0158 var1) {
      this.m8000();
      if (!AttackAura.m116000((Boolean)((C0991)this.f7000[1]).i())) {
         var1.m18000(((Float)((C0988)this.f2000[6]).i()).intValue());
      }
   }
}
