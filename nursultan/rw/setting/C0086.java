package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NSS;
import java.util.function.Supplier;
import rw.api.Iface0648;
import rw.core.Base1138;
import rw.core.C0918;
import rw.core.C0988;
import rw.core.OltlIpjm;
import rw.gui.NoVelocity;
import rw.module.AttackAura_x_x;

public class C0086 extends Base1138 implements Iface0648<NoVelocity> {
   public Object[] f1000;
   private static float[] f2000;
   private static double[] f3000;
   private static String[] f4000;

   private static void m4000() {
      f2000 = new float[]{100.0F, 1.0F, 100.0F, 1.0F};
   }

   public C0086(String var1, boolean var2) {
      super(var1, var2);
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f4000 = new String[]{"chance"};
   }

   private static void m10000() {
      f3000 = new double[]{0.0, 100.0};
   }

   public void m14000(Object var1) {
      this.m4000();
      switch (var1) {
         case AttackAura_x_x var4:
            if ((Boolean)this.f1000[0]) {
               var4.m10000((boolean)1);
               var4.m16000((boolean)1);
               var4.m22000((boolean)1);
            }

            Boolean var11 = false;
            this.f1000[0] = var11;
            break;
         case C0918 var5:
            NSS var6 = var5.m14000();
            if ((NNNwS)((NNuU)this.N[0]).T[4] != null
               && ((NNNwS)((NNuU)this.N[0]).T[4]).method_5624()
               && var6.y().B >= f3000[0]
               && var6.N() == ((NNNwS)((NNuU)this.N[0]).T[4]).method_5628()
               && Math.random() * f3000[1] <= ((Float)((C0988)this.f1000[1]).i()).floatValue()) {
               Boolean var12 = true;
               this.f1000[0] = var12;
            }
            break;
         default:
      }
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }

   public void m24000(NoVelocity var1) {
      this.m4000();
      C0988 var6 = (C0988)C0122.m12000(var1, f4000[0], f2000[0], f2000[1], f2000[2], f2000[3]).m34000((Supplier<String>)OltlIpjm.f2000[0]).N(var1x -> this.U());
      this.f1000[1] = var6;
   }
}
