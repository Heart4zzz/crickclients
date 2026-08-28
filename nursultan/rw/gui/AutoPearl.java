package rw.gui;

import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNNwz;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NbL;
import KDFzREm.NkN;
import KDFzREm.Nrm;
import KDFzREm.wY;
import java.util.Comparator;
import java.util.Optional;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0647;
import rw.core.C0719;
import rw.core.C0837;
import rw.core.C0892;
import rw.core.C0983;
import rw.core.C0988;
import rw.core.C0989;
import rw.core.C0991;
import rw.core.C1140;
import rw.core.IljlItp;
import rw.core.Ilnorttr;
import rw.core.NuZz;
import rw.data.Rec0199;
import rw.data.Rec0200;
import rw.data.Rec0208;
import rw.defs.Enum0055;
import rw.defs.Enum0074;
import rw.defs.Enum0081;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AutoPearl",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoPearl extends GuiWidget {
   private static float[] f1000;
   private static float[] f2000;
   private static double[] f3000;
   private static String[] f4000;
   public Object[] f5000;

   private static void m4000() {
      f2000 = new float[]{6.0F, 1.0F, 8.0F, 0.5F, 5.0F, 5.0F};
      f1000 = new float[]{10.0F, 1.0F, 90.0F, 180.0F, 90.0F, 0.0F, 1.5F};
   }

   private static void m6000() {
      f4000 = new String[]{"only-in-pvp", "target-follow", "threshold", "min-distance"};
   }

   public AutoPearl() {
      this.m10000();
      C0991 var5 = C0122.m26000(this, f4000[0], false);
      this.f5000[0] = var5;
      C0991 var6 = C0122.m26000(this, f4000[1], false);
      this.f5000[1] = var6;
      C0988 var7 = C0122.m12000(this, f4000[2], f2000[0], f2000[1], f2000[2], f2000[3]);
      this.f5000[2] = var7;
      C0988 var8 = C0122.m12000(this, f4000[3], f2000[4], f2000[5], f1000[0], f1000[1]);
      this.f5000[3] = var8;
      C0837 var9 = new C0837((Rec0200)Rec0200.f5000[2]);
      this.f5000[4] = var9;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[8];
         Object[] var1 = this.f5000;
         var1[5] = 0;
         var1[6] = 0;
         var1[7] = 0;
      }
   }

   private boolean m4000() {
      this.m10000();
      if ((Boolean)((C0991)this.f5000[0]).i() && !wY.u()) {
         return (boolean)1;
      } else {
         return (boolean)(((Iface0647)((NNNZZ)((NNuU)this.y[0]).T[2])).m2000() < 3 ? 1 : ((NNNwS)((NNuU)this.y[0]).T[4]).method_6115());
      }
   }

   private static void m12000() {
      f3000 = new double[]{Double.MAX_VALUE};
   }

   private Optional<C0983> m10000(NbK var1) {
      this.m10000();
      Optional var2 = ((C0837)this.f5000[4]).m22000(var1, var1.method_73189(), var1.method_18798()).m6000();
      if (var2.isEmpty()) {
         return Optional.empty();
      } else {
         NXi var3 = ((Rec0199)var2.get()).m10000();
         if (((NNNwS)((NNuU)this.y[0]).T[4]).method_73189().R(var3) <= ((Float)((C0988)this.f5000[3]).i()).floatValue()) {
            return Optional.empty();
         } else {
            float var4 = NNWE.z((Float)((C0988)this.f5000[2]).i());
            C0983 var5 = C0989.m30000(var3);
            float var6 = var5.m38000();
            float var7 = var5.m68000();
            NXi var8 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_60478();
            NXi var9 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_33571();
            C0983 var10 = null;
            double var11 = f3000[0];
            int var13 = -1;

            for (byte var14 = 0; var14 < 180; var14 += 3) {
               float var15 = (var7 - var14 - f1000[2]) % f1000[3] + f1000[4];
               NXi var16 = Crossbow.m36000((NNNwS)((NNuU)this.y[0]).T[4], var8, -var15, var6, f1000[5], f1000[6]);
               Optional var17 = ((C0837)this.f5000[4]).m22000(null, var9, var16).m6000();
               if (!var17.isEmpty()) {
                  double var18 = ((Rec0199)var17.get()).m10000().M(var3);
                  int var20 = ((Rec0199)var17.get()).m2000();
                  if (var20 <= ((Rec0199)var2.get()).m2000() + 100
                     && var18 <= var4
                     && (var18 < var11 && (var13 == -1 || Math.abs(var20 - var13) < 40) || var20 < var13)) {
                     var11 = var18;
                     var13 = var20;
                     var10 = new C0983(var6, var15);
                  }
               }
            }

            return Optional.ofNullable(var10);
         }
      }
   }

   @Iface0642
   public void m12000(Ilnorttr var1) {
      if (var1.m14000() instanceof NkN var2) {
         ((NNNZg)((NNuU)this.y[0]).T[3])
            .method_18456()
            .stream()
            .min(Comparator.comparingDouble(var1x -> var1x.method_5707(var2.method_73189())))
            .ifPresent(var2x -> {
               this.m10000();
               int var3 = var2.method_5628();
               if (var2x == (NNNwS)((NNuU)this.y[0]).T[4] || C1140.m32000().test(var2x)) {
                  Integer var11 = var3;
                  this.f5000[5] = var11;
               } else if ((Boolean)((C0991)this.f5000[1]).i()) {
                  TargetEsp var4 = NursultanClient.m88000().m94000();
                  if (var4.m16000() && var4.m8000() instanceof NNNwz var6 && var6 == var2x) {
                     Integer var12 = var3;
                     this.f5000[6] = var12;
                     Integer var13 = 20;
                     this.f5000[7] = var13;
                  }
               } else {
                  Integer var14 = var3;
                  this.f5000[6] = var14;
                  Integer var15 = 20;
                  this.f5000[7] = var15;
               }
            });
      }
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public void m20000(C0719 var1) {
      this.m10000();
      if ((Integer)this.f5000[6] != -1 && (Integer)this.f5000[5] != (Integer)this.f5000[6]) {
         if (((NNNZg)((NNuU)this.y[0]).T[3]).method_8469((Integer)this.f5000[6]) instanceof NkN var3) {
            if (!this.m4000()) {
               int var4 = IljlItp.m2000(NQa.nz).min(Comparator.comparingInt(var0 -> var0.m6000().I() ? 1 : 0)).map(Rec0208::m4000).orElse(-1);
               if (IljlItp.m36000(var4) || ((NNNwS)((NNuU)this.y[0]).T[4]).method_7357().N(NQa.nz.E())) {
                  Integer var13 = -1;
                  this.f5000[6] = var13;
               } else if ((Integer)this.f5000[7] <= 0) {
                  Integer var14 = -1;
                  this.f5000[6] = var14;
               } else {
                  Optional var5 = this.m10000(var3);
                  if (var5.isEmpty()) {
                     Integer var15 = (Integer)this.f5000[7] - 1;
                     this.f5000[7] = var15;
                  } else {
                     C0983 var6 = (C0983)var5.get();
                     C0983 var7 = new C0983(var6.m38000(), -var6.m68000()).m60000((Enum0074)Enum0074.f2000[0]).m32000(true).m54000(true);
                     NuZz.m44000(var7);
                     NursultanClient.m36000()
                        .m36000(
                           () -> {
                              this.m10000();
                              NuZz.m44000(var7);
                              C0892.m44000(var4);
                              ((NNNZZ)((NNuU)this.y[0]).T[2])
                                 .N((NNNZg)((NNuU)this.y[0]).T[3], var1xx -> new Nrm(NbL.field_5808, var1xx, var7.m38000(), var7.m68000()));
                              ((NNNwS)((NNuU)this.y[0]).T[4]).method_6104(NbL.field_5808);
                              Integer var7x = -1;
                              this.f5000[6] = var7x;
                              Integer var8 = 0;
                              this.f5000[7] = var8;
                              NursultanClient.m36000().m14000(4, C0892::m4000);
                           }
                        );
                  }
               }
            }
         } else {
            Integer var12 = -1;
            this.f5000[6] = var12;
         }
      }
   }
}
