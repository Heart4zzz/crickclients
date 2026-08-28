package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base0749;
import rw.core.Base1148;
import rw.core.C0719;
import rw.core.C0724;
import rw.core.C0727;
import rw.core.C0732;
import rw.core.C0733;
import rw.core.C0734;
import rw.core.C0979;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1004;
import rw.defs.Enum0055;
import rw.module.AttackAura_x_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Scaffold",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class Scaffold extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;
   private static String[] f3000;
   private static float[] f4000;

   public boolean m4000() {
      this.m10000();
      return (Boolean)((C0991)this.f1000[4]).i();
   }

   public Scaffold() {
      this.m10000();
      C0732 var5 = new C0732(this, f2000[0], false);
      this.f1000[0] = var5;
      C1000 var6 = C0122.m18000(this, f2000[1], new C0734(this, f2000[2], true), new C0724(this, f2000[3], false), (C0732)this.f1000[0]);
      this.f1000[1] = var6;
      C0991 var7 = (C0991)C0122.m26000(this, f2000[4], true).N(var1 -> {
         this.m10000();
         return ((C0732)this.f1000[0]).U();
      });
      this.f1000[2] = var7;
      C1000 var8 = C0122.m18000(this, f2000[5], new C0733(this, f3000[0], true), new C0727(this, f3000[1], false));
      this.f1000[3] = var8;
      C0991 var9 = C0122.m26000(this, f3000[2], true);
      this.f1000[4] = var9;
      C1004 var10 = C0122.m10000(this, f3000[3], new C0979(f4000[0], f4000[1]), new C0979(f4000[2], f4000[3]), f4000[4]);
      this.f1000[5] = var10;
   }

   static {
      ntfClinit();
   }

   public boolean m4000() {
      this.m10000();
      return ((Base0749)((C1000)this.f1000[1]).i()).m12000();
   }

   public boolean m6000() {
      this.m10000();
      return (NNNwS)((NNuU)this.y[0]).T[4] == null ? super.m14000() : ((Base0749)((C1000)this.f1000[1]).i()).m4000();
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var1 = this.f1000;
      }
   }

   private static void m12000() {
      f2000 = new String[]{"telly", "mode", "grim", "basic", "auto-jump", "safe-walk"};
      f3000 = new String[]{"sneak", "none", "save-y", "delay"};
   }

   private static void m14000() {
      f4000 = new float[]{0.0F, 6.0F, 0.0F, 3.0F, 1.0F};
   }

   public C0979 m12000() {
      this.m10000();
      return (C0979)((C1004)this.f1000[5]).i();
   }

   private boolean m18000(AttackAura_x_x var1) {
      this.m10000();
      if (!((C0732)this.f1000[0]).U() || !(Boolean)((C0991)this.f1000[2]).i() || var1.m44000()) {
         return (boolean)0;
      } else if (!var1.m20000() && !var1.m8000() && !var1.m32000() && !var1.m18000()) {
         return (boolean)0;
      } else {
         if (((NNNwS)((NNuU)this.y[0]).T[4]).method_24828()) {
            var1.m22000((boolean)1);
         }

         return (boolean)1;
      }
   }

   @Iface0642
   public void m24000(AttackAura_x_x var1) {
      this.m10000();
      if (!this.m18000(var1)) {
         ((Base1148)((C1000)this.f1000[3]).i()).y(var1);
      }
   }

   @Iface0642
   public void m26000(C0719 var1) {
      this.m10000();
      ((Base0749)((C1000)this.f1000[1]).i()).m2000();
   }
}
