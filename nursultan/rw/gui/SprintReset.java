package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import java.util.function.Supplier;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base0795;
import rw.core.C0787;
import rw.core.C0789;
import rw.core.C0797;
import rw.core.C0800;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C1000;
import rw.core.C1183;
import rw.core.OltlIpjm;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x;
import rw.module.AttackAura_x_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "SprintReset",
   y = Enum0055.COMBAT,
   N = Enum0070.TOOLS
)
public class SprintReset extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;
   private static double[] f3000;
   private static float[] f4000;
   public Object[] f5000;
   public Object[] f6000;

   private static void m4000() {
      f2000 = new String[]{"w-tap", "s-tap", "shift-tap", "no-stop", "mode", "chance", "ground-only", "delay"};
   }

   public SprintReset() {
      this.m12000();
      C0800 var5 = new C0800(this, f2000[0], true);
      this.f1000[0] = var5;
      C0787 var6 = new C0787(this, f2000[1], false);
      this.f1000[1] = var6;
      C0789 var7 = new C0789(this, f2000[2], false);
      this.f5000[0] = var7;
      C0797 var8 = new C0797(this, f2000[3], false);
      this.f5000[1] = var8;
      C1000 var9 = C0122.m18000(this, f2000[4], (C0800)this.f1000[0], (C0787)this.f1000[1], (C0789)this.f5000[0], (C0797)this.f5000[1]);
      this.f5000[2] = var9;
      C0988 var10 = C0122.m12000(this, f2000[5], f4000[0], f4000[1], f4000[2], f4000[3]).m34000((Supplier<String>)OltlIpjm.f2000[0]);
      this.f5000[3] = var10;
      C0991 var11 = C0122.m26000(this, f2000[6], true);
      this.f5000[4] = var11;
      C0988 var12 = (C0988)C0122.m12000(this, f2000[7], f4000[4], f4000[5], f4000[6], f4000[7]).m34000((Supplier<String>)OltlIpjm.f2000[3]).N(var1 -> {
         this.m12000();
         return ((Base0795)((C1000)this.f5000[2]).i()).m12000();
      });
      this.f5000[5] = var12;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f4000 = new float[]{100.0F, 1.0F, 100.0F, 1.0F, 1.0F, 1.0F, 10.0F, 1.0F};
   }

   private static void m10000() {
      f3000 = new double[]{100.0};
   }

   public int m10000() {
      this.m12000();
      return ((Float)((C0988)this.f5000[5]).i()).intValue();
   }

   private void m12000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }

      if (this.f5000 == null) {
         this.f5000 = new Object[6];
         Object[] var2 = this.f5000;
      }

      if (this.f6000 == null) {
         this.f6000 = new Object[3];
         Object[] var3 = this.f6000;
         var3[0] = 0;
         var3[1] = 0;
         var3[2] = 0;
      }
   }

   @Iface0642(
      y = Enum0081.AFTER,
      L = {Sprint.class}
   )
   public void m16000(AttackAura_x_x var1) {
      this.m12000();
      Integer var6 = (Integer)this.f6000[2] - 1;
      this.f6000[2] = var6;
      if ((Integer)this.f6000[1] > 0) {
         Integer var7 = (Integer)this.f6000[1] - 1;
         this.f6000[1] = var7;
      } else if ((Integer)this.f6000[0] > 0) {
         Integer var8 = (Integer)this.f6000[0] - 1;
         this.f6000[0] = var8;
         ((Base0795)((C1000)this.f5000[2]).i()).y(var1);
      }
   }

   @Iface0642
   public void m20000(AttackAura_x var1) {
      this.m12000();
      if ((Boolean)((NNNwS)((NNuU)this.y[0]).T[4]).R[6]) {
         if (!(Boolean)((C0991)this.f5000[4]).i() || ((NNNwS)((NNuU)this.y[0]).T[4]).method_24828()) {
            if ((Integer)this.f6000[2] <= 0 && Math.random() * f3000[0] <= ((Float)((C0988)this.f5000[3]).i()).floatValue()) {
               Integer var6 = C1183.m24000(0, 2);
               this.f6000[1] = var6;
               Integer var7 = ((Base0795)((C1000)this.f5000[2]).i()).m8000();
               this.f6000[0] = var7;
               Integer var8 = 10;
               this.f6000[2] = var8;
            }
         }
      }
   }
}
