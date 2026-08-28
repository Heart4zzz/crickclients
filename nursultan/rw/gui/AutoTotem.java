package rw.gui;

import KDFzREm.NCj;
import KDFzREm.NGE;
import KDFzREm.NHe;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNWJ;
import KDFzREm.NNNNuY;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNfc;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.NkS;
import KDFzREm.Nkq;
import java.util.Comparator;
import java.util.List;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.core.Base1096;
import rw.core.C0721;
import rw.core.C1003;
import rw.core.C1093;
import rw.core.C1241;
import rw.core.IljlItp;
import rw.core.Ilnorttr;
import rw.data.Rec0208;
import rw.defs.Enum0055;
import rw.setting.C0122;
import rw.setting.C0137;
import rw.setting.C0138;
import rw.setting.C0142;
import rw.setting.C0144;
import rw.setting.ElytraHealth;

@AnnotationDefault(
   L = "AutoTotem",
   y = Enum0055.PLAYER,
   N = Enum0070.AUTO
)
public class AutoTotem extends GuiWidget {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   public Object[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   public Object[] f16000;
   private static short[] f17000;
   private static String[] f18000;
   private static short[] f19000;
   private static String[] f20000;
   public Object[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   public static Object[] f25000;
   private static short[] f26000;

   private void m4000() {
      this.m14000();
      if (!NursultanClient.m60000().m16000()) {
         NQo var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_6079();
         if (((Integer)this.f9000[0] == -1 && (Integer)this.f9000[1] == -1 || (Boolean)this.f9000[3]) && (!var1.y().N(NNNNRZ.e) || var1.L(NNNNRZ.b))) {
            Rec0208 var2 = IljlItp.m6000(var0 -> var0.y().N(NNNNRZ.e)).min((Comparator<? super Rec0208>)this.f9000[4]).orElse(null);
            if (var2 != null && !var2.m6000().L(NNNNRZ.b)) {
               this.m56000(var2, var1);
            } else if (!this.m40000(var1, false)) {
               if (var2 != null) {
                  this.m56000(var2, var1);
               } else {
                  this.m40000(var1, (boolean)1);
               }
            }
         }
      }
   }

   private int m4000() {
      NHe var1 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().u();

      for (int var2 = 9; var2 < var1.size(); var2++) {
         if (((NQo)var1.get(var2)).R()) {
            return var2;
         }
      }

      for (int var3 = 0; var3 < 9; var3++) {
         if (((NQo)var1.get(var3)).R()) {
            return var3;
         }
      }

      return -1;
   }

   public AutoTotem() {
      this.m14000();
      C0142 var5 = new C0142(f18000[0], true);
      this.f21000[0] = var5;
      ElytraHealth var6 = new ElytraHealth(f18000[1], false);
      this.f21000[1] = var6;
      C0144 var7 = new C0144(f18000[2], false);
      this.f16000[0] = var7;
      rw.setting.C0140 var8 = new rw.setting.C0140(f18000[3], false);
      this.f16000[1] = var8;
      C1093 var9 = new C1093(f18000[4], false);
      this.f16000[2] = var9;
      C0138 var10 = new C0138(f18000[5], false);
      this.f16000[3] = var10;
      rw.setting.C0139 var11 = new rw.setting.C0139(f18000[6], true);
      this.f16000[4] = var11;
      C0137 var12 = new C0137(f18000[7], false);
      this.f16000[5] = var12;
      C1003 var13 = C0122.m4000(
         this,
         f20000[0],
         (C0142)this.f21000[0],
         (ElytraHealth)this.f21000[1],
         (C0138)this.f16000[3],
         (C0144)this.f16000[0],
         (rw.setting.C0140)this.f16000[1],
         (C1093)this.f16000[2],
         (rw.setting.C0139)this.f16000[4],
         (C0137)this.f16000[5]
      );
      this.f16000[6] = var13;
      Integer var14 = -1;
      this.f9000[0] = var14;
      Integer var15 = -1;
      this.f9000[1] = var15;
      Comparator var16 = Comparator.comparingInt(var0 -> ((Rec0208)var0).m6000().L(NNNNRZ.b) ? 1 : 0);
      this.f9000[4] = var16;
      ((C1003)this.f16000[6]).m2000().forEach(var1 -> {
         if (var1 instanceof Iface0648) {
            ((Iface0648<AutoTotem>)var1).m2000(this);
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f22000 = new short[]{0, 1, 0, 1, 2};
      f26000 = new short[]{3, 4};
      f24000 = new short[]{5, 0, 1, 3};
      f7000 = new short[]{0, 1, 2, 4, 5, 6, 0, 1};
      f13000 = new short[]{4, 6, 0};
      f19000 = new short[]{4, 0, 4, 0, 3};
      f8000 = new short[]{0, 3};
      f3000 = new short[]{0, 4};
      f1000 = new short[]{3, 2, 0, 4, 0, 1, 3, 4};
      f10000 = new short[]{0, 0, 0, 3, 3, 0, 4, 3};
      f11000 = new short[]{0, 4, 2, 0, 4, 3, 0};
      f17000 = new short[]{1, 0, 3, 1, 0, 0, 0, 0};
      f12000 = new short[]{4, 3, 0, 4, 2, 0};
      f6000 = new short[]{4, 3, 0, 4, 1};
      f5000 = new short[]{1, 1, 0, 0, 4};
      f14000 = new short[]{1, 0, 4};
      f2000 = new short[]{0, 1, 160, 0, 4, 2};
      f23000 = new short[]{0, 1};
      f4000 = new short[]{0, 4, 3, 0, 4, 3, 0, 4};
      f15000 = new short[]{6, 2, 2, 2};
   }

   private boolean m12000() {
      return ((NNNwS)((NNuU)this.y[0]).T[4]).method_7357().N(NQa.la.E());
   }

   private void m10000() {
      this.m14000();
      if (!NursultanClient.m60000().m16000()) {
         if ((Integer)this.f9000[f17000[3]] != -1) {
            this.m14000();
         } else if ((Integer)this.f9000[f17000[4]] != -1) {
            if (this.m58000((Integer)this.f9000[f17000[5]], 0) != -1) {
               Integer var5 = -1;
               this.f9000[f17000[6]] = var5;
            }
         }
      }
   }

   private void m14000() {
      this.m14000();
      if ((NkG)((NNNwS)((NNuU)this.y[f17000[7]]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]
            == (NkS)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[2]
         && ((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M().R()) {
         NQo var1 = (NQo)((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().u().get((Integer)this.f9000[1]);
         NNNNuY var2 = (NNNNuY)var1.method_58694(NNNNRZ.D);
         if (var2 != null && !var2.M()) {
            int var3 = IljlItp.m4000((Integer)this.f9000[1]);
            if (var2.Z() && var2.B() != 0) {
               NNfc.N(var1, 0);
               ((NNuU)this.y[0]).NE().N(new NNNNWJ(var3, 0));
            }

            int var4 = !((NNNwS)((NNuU)this.y[0]).T[4]).method_6079().R() ? 1 : 0;
            C1241 var5 = NursultanClient.m60000().m38000(0, var3, 1, Nkq.field_7790).m38000(0, 45, 0, Nkq.field_7790);
            if (var4 != 0) {
               var5.m38000(0, var3, 0, Nkq.field_7790);
            }

            var5.m26000(var1x -> {
               this.m14000();
               Integer var6 = NursultanClient.m74000().m10000();
               this.f9000[2] = var6;
            }).m24000();
            Integer var11 = -1;
            this.f9000[1] = var11;
         } else {
            Integer var10 = -1;
            this.f9000[1] = var10;
         }
      }
   }

   private static void m16000() {
      f25000 = new Object[]{45};
   }

   private static void m12000() {
      f18000 = new String[]{
         "health-trigger",
         "elytra-health-trigger",
         "crystal-trigger",
         "tnt-trigger",
         "falling-dripstone-trigger",
         "falling-trigger",
         "trident-trigger",
         "mace-smash-trigger"
      };
      f20000 = new String[]{"triggers"};
   }

   private boolean m18000() {
      this.m14000();
      return (boolean)(NursultanClient.m74000().m10000() - this.f9000[2] >= 5 || this.f9000[0] == -1 && this.f9000[1] == -1 ? 0 : 1);
   }

   private boolean m20000() {
      this.m14000();
      return ((List)((C1003)this.f16000[6]).i()).stream().anyMatch(Base1096::m2000);
   }

   private void m14000() {
      if (this.f21000 == null) {
         this.f21000 = new Object[2];
         Object[] var1 = this.f21000;
      }

      if (this.f16000 == null) {
         this.f16000 = new Object[7];
         Object[] var2 = this.f16000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[5];
         Object[] var3 = this.f9000;
         var3[0] = 0;
         var3[1] = 0;
         var3[2] = 0;
         var3[3] = false;
      }
   }

   private int m20000(int var1) {
      for (NYj var3 : ((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).T) {
         if (var3.L == ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548() && var3.B() == var1) {
            return var3.u;
         }
      }

      return -1;
   }

   private boolean m32000(NQo var1, boolean var2) {
      NNNNuY var3 = (NNNNuY)var1.method_58694(NNNNRZ.D);
      return (boolean)(var3 == null ? 0 : var3.y().anyMatch(var1x -> (boolean)(!var1x.y().N(NNNNRZ.e) || !var2 && var1x.L(NNNNRZ.b) ? 0 : 1)));
   }

   private int m36000(NNNNuY var1) {
      int var2 = -1;

      for (int var3 = 0; var3 < var1.i(); var3++) {
         NQo var4 = var1.N(var3);
         if (var4.y().N(NNNNRZ.e)) {
            if (!var4.L(NNNNRZ.b)) {
               return var3;
            }

            if (var2 == -1) {
               var2 = var3;
            }
         }
      }

      return var2;
   }

   @Iface0642
   public void m38000(Ilnorttr var1) {
      if (var1.m14000() instanceof NGE) {
         if (!((NNNwS)((NNuU)this.y[0]).T[4]).method_6047().L(NNNNRZ.e) && !this.m18000() && !this.m12000()) {
            if (this.m20000()) {
               this.m4000();
            }
         }
      }
   }

   private boolean m40000(NQo var1, boolean var2) {
      this.m14000();
      if ((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]
            == (NkS)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[2]
         && ((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).M().R()) {
         Rec0208 var3 = IljlItp.m6000(var2x -> this.m32000(var2x, var2)).findFirst().orElse(null);
         if (var3 == null) {
            return (boolean)0;
         } else {
            NNNNuY var4 = (NNNNuY)var3.m6000().method_58694(NNNNRZ.D);
            int var5 = this.m36000(var4);
            if (this.m48000(var1) && var4.N(var5).L(NNNNRZ.b)) {
               return (boolean)0;
            } else {
               int var6 = var4.i() == 1 && NNNNuY.y(var1) ? 1 : 0;
               int var7 = !var1.R() && var6 == 0 ? this.m4000() : -1;
               if (!var1.R() && var6 == 0 && IljlItp.m36000(var7)) {
                  return (boolean)0;
               } else {
                  int var8 = IljlItp.m4000(var3.m4000());
                  if (var4.B() != var5) {
                     NNfc.N(var3.m6000(), var5);
                     ((NNuU)this.y[0]).NE().N(new NNNNWJ(var8, var5));
                  }

                  C1241 var9 = NursultanClient.m60000().m38000(0, var8, 1, Nkq.field_7790).m38000(0, 45, 0, Nkq.field_7790);
                  if (!var1.R()) {
                     if (var6 != 0) {
                        var9.m38000(0, var8, 0, Nkq.field_7790);
                        Integer var15 = var3.m4000();
                        this.f9000[f17000[0]] = var15;
                     } else {
                        var9.m38000(0, IljlItp.m4000(var7), 0, Nkq.field_7790);
                        Integer var16 = var7;
                        this.f9000[f17000[1]] = var16;
                     }
                  }

                  int var10 = this.m64000();
                  var9.m26000(var2x -> {
                     this.m14000();
                     Integer var7x = NursultanClient.m74000().m10000() + var10;
                     this.f9000[2] = var7x;
                  }).m24000();
                  Boolean var17 = false;
                  this.f9000[f17000[2]] = var17;
                  return (boolean)1;
               }
            }
         }
      } else {
         return (boolean)0;
      }
   }

   @Iface0642
   public void m42000(C0721 var1) {
      if (!((NNNwS)((NNuU)this.y[0]).T[4]).method_6047().L(NNNNRZ.e) && !this.m18000()) {
         if (this.m12000()) {
            this.m10000();
         } else if (this.m20000()) {
            this.m4000();
         } else {
            this.m10000();
         }
      }
   }

   @Iface0642
   public void m46000(rw.module.AutoAccept var1) {
      this.m14000();
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null
         && var1.m6000() instanceof NCj var2
         && var2.N((NNNZg)((NNuU)this.y[0]).T[3]) == (NNNwS)((NNuU)this.y[0]).T[4]
         && var2.N() == 35) {
         Boolean var8 = true;
         this.f9000[3] = var8;
         Integer var9 = NursultanClient.m74000().m10000() - 5;
         this.f9000[2] = var9;
      }
   }

   private boolean m48000(NQo var1) {
      return (boolean)(var1.y().N(NNNNRZ.e) && var1.L(NNNNRZ.b) ? 1 : 0);
   }

   private void m56000(Rec0208 var1, NQo var2) {
      this.m14000();
      if (!this.m48000(var2) || !var1.m6000().L(NNNNRZ.b)) {
         int var3 = var1.m4000();
         int var4 = this.m64000();
         if ((Integer)this.f9000[0] == -1 && !var2.R()) {
            Integer var9 = this.m58000(var3, var4);
            this.f9000[0] = var9;
            if ((Integer)this.f9000[0] != -1) {
               Boolean var10 = false;
               this.f9000[3] = var10;
            }
         } else {
            if (this.m58000(var3, var4) != -1) {
               Boolean var11 = false;
               this.f9000[3] = var11;
            }
         }
      }
   }

   private int m58000(int var1, int var2) {
      int var3 = this.m20000(var1);
      if (var3 == -1) {
         return -1;
      } else {
         NursultanClient.m60000()
            .m38000(((NkG)((NNNwS)((NNuU)this.y[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3]).b, var3, 40, Nkq.field_7791)
            .m26000(var2x -> {
               this.m14000();
               Integer var7 = NursultanClient.m74000().m10000() + var2;
               this.f9000[2] = var7;
            })
            .m24000();
         return var1;
      }
   }

   private int m64000() {
      this.m14000();
      return !((C0144)this.f16000[0]).m8000() && !((rw.setting.C0140)this.f16000[1]).m10000() ? 0 : 160;
   }
}
