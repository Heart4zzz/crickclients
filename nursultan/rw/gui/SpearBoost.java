package rw.gui;

import KDFzREm.NNNNRZ;
import KDFzREm.NNNNuc;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNcO;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nbx;
import KDFzREm.Ngj;
import KDFzREm.Njn;
import KDFzREm.Nww;
import KDFzREm.Nza;
import java.util.Comparator;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0606;
import rw.api.Iface0642;
import rw.core.C0719;
import rw.core.C0892;
import rw.core.C0991;
import rw.core.C1006;
import rw.core.C1193;
import rw.core.IljlItp;
import rw.data.Rec0208;
import rw.defs.Enum0055;
import rw.module.AttackAura_x_x;
import rw.module.OlpnniIl;
import rw.setting.C0122;

@AnnotationDefault(
   L = "SpearBoost",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class SpearBoost extends GuiWidget {
   public static Object[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static boolean[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;
   private static boolean[] f10000;
   public Object[] f11000;
   private static String[] f12000;
   private static boolean[] f13000;
   private static boolean[] f14000;
   public Object[] f15000;
   private static boolean[] f16000;

   private double m2000(NQo var1) {
      return ((NNNNuc)var1.a_(NNNNRZ.b, NNNNuc.N))
         .y()
         .stream()
         .filter(var0 -> (boolean)(var0.N() == NNcO.R && var0.L().y(Nbx.field_6173) && var0.y().L() == Njn.field_6328 ? 1 : 0))
         .mapToDouble(var0 -> var0.y().y())
         .sum();
   }

   private void m4000() {
      this.m12000();
      int var1 = IljlItp.m38000((Iface0606)this.f15000[1]);
      if (!IljlItp.m36000(var1)) {
         NQo var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().method_5438(var1);
         Nza var3 = (Nza)var2.method_58694(NNNNRZ.c);
         if (var3 != null) {
            if ((Boolean)((C0991)this.f2000[0]).i()) {
               Boolean var8 = true;
               this.f15000[2] = var8;
            }

            C0892.m32000(var1);
            Boolean var9 = true;
            this.f11000[0] = var9;
            ((NNNZZ)((NNuU)this.y[0]).T[2]).N(var3);
            ((NNNwS)((NNuU)this.y[0]).T[4]).method_6104(NbL.field_5808);
            Boolean var10 = true;
            this.f11000[1] = var10;
            Boolean var11 = false;
            this.f15000[4] = var11;
            Integer var12 = 0;
            this.f11000[3] = var12;
         }
      }
   }

   private boolean m4000() {
      this.m12000();
      int var1 = IljlItp.m38000((Iface0606)this.f15000[1]);
      if (IljlItp.m36000(var1)) {
         return (boolean)0;
      } else {
         NQo var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().method_5438(var1);
         return (boolean)(!((NNNwS)((NNuU)this.y[0]).T[4]).method_75202(var2, 0) ? 1 : 0);
      }
   }

   public SpearBoost() {
      this.m12000();
      C0991 var5 = C0122.m26000(this, f12000[0], true);
      this.f2000[0] = var5;
      C0991 var6 = C0122.m26000(this, f12000[1], false);
      this.f2000[1] = var6;
      C1006 var7 = C0122.m14000(this, f12000[2], (PgUp)PgUp.f4000[0]);
      this.f15000[0] = var7;
      Iface0606 var8 = var0 -> (boolean)(var0.L(NNNNRZ.c) && C1193.m42000(var0, Ngj.X) > 0 ? 1 : 0);
      this.f15000[1] = var8;
   }

   static {
      ntfClinit();
   }

   public boolean m8000() {
      this.m12000();
      Boolean var5 = false;
      this.f15000[2] = var5;
      Boolean var6 = false;
      this.f15000[3] = var6;
      Boolean var7 = false;
      this.f15000[4] = var7;
      Boolean var8 = false;
      this.f11000[1] = var8;
      Integer var9 = 0;
      this.f11000[2] = var9;
      Integer var10 = 0;
      this.f11000[3] = var10;
      this.m14000();
      return f16000[0];
   }

   private static void m10000() {
      f12000 = new String[]{"auto-jump", "rapid", "boost-key"};
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }

      if (this.f15000 == null) {
         this.f15000 = new Object[5];
         Object[] var2 = this.f15000;
         var2[2] = false;
         var2[3] = false;
         var2[4] = false;
      }

      if (this.f11000 == null) {
         this.f11000 = new Object[4];
         Object[] var3 = this.f11000;
         var3[0] = false;
         var3[1] = false;
         var3[2] = 0;
         var3[3] = 0;
      }
   }

   private boolean m8000() {
      this.m12000();
      if (!this.m10000()) {
         return (boolean)0;
      } else {
         return (boolean)(!((C0991)this.f2000[1]).i() && !this.m4000() ? 0 : 1);
      }
   }

   private boolean m10000() {
      this.m12000();
      return (boolean)((NNNwS)((NNuU)this.y[0]).T[4] != null
            && ((NNNwS)((NNuU)this.y[0]).T[4]).method_76458()
            && !IljlItp.m36000(IljlItp.m38000((Iface0606)this.f15000[1]))
         ? 1
         : 0);
   }

   private static void m12000() {
      f5000 = new boolean[]{true, false, false, false, false, false, false, false};
      f16000 = new boolean[]{true, true, true, false, true};
      f9000 = new boolean[]{false, false};
      f13000 = new boolean[]{false, false, false, true, false};
      f4000 = new boolean[]{false, false, true};
      f10000 = new boolean[]{true, true, false, false, true, false};
      f7000 = new boolean[]{true, false, false, false, true, false, true};
      f14000 = new boolean[]{true, true, false, false, true};
      f8000 = new boolean[]{false, true, false, true, false, true};
      f6000 = new boolean[]{true, false, false, false, false, false, false};
      f3000 = new boolean[]{true, false, false, false, false, true};
   }

   private void m14000() {
      this.m12000();
      if ((Boolean)this.f11000[0]) {
         Boolean var5 = false;
         this.f11000[0] = var5;
         C0892.m20000();
      }
   }

   private static void m14000() {
      f1000 = new Object[]{2, 30};
   }

   private void m16000() {
      this.m12000();
      int var1 = this.m22000(IljlItp.m38000((Iface0606)this.f15000[1]));
      if (!IljlItp.m36000(var1)) {
         C0892.m32000(var1);
         Boolean var6 = true;
         this.f11000[0] = var6;
      }
   }

   private int m22000(int var1) {
      int var2 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548().N();
      return IljlItp.m22000(var0 -> (boolean)1)
         .filter(var1x -> (boolean)(var1x.m4000() != var1 ? 1 : 0))
         .max(Comparator.<Rec0208>comparingInt(var2x -> -this.m32000(var2x.m4000(), var2)).thenComparingDouble(var1x -> this.m2000(var1x.m6000())))
         .map(Rec0208::m4000)
         .orElse(-1);
   }

   @Iface0642(
      u = true
   )
   public void m28000(OlpnniIl var1) {
      this.m12000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && (NNNZg)((NNuU)this.y[0]).T[3] != null) {
         if (var1.y((PgUp)((C1006)this.f15000[0]).i(), ((C1006)this.f15000[0]).m2000())) {
            Boolean var6 = f16000[1];
            this.f15000[3] = var6;
            Boolean var7 = f16000[2];
            this.f15000[4] = var7;
         } else if (var1.N((PgUp)((C1006)this.f15000[0]).i())) {
            Boolean var8 = f16000[3];
            this.f15000[3] = var8;
         }
      }
   }

   @Iface0642
   public void m30000(AttackAura_x_x var1) {
      this.m12000();
      if ((Boolean)this.f15000[2] || (Boolean)this.f15000[3]) {
         if ((Boolean)((C0991)this.f2000[0]).i()) {
            var1.m22000((boolean)1);
         }

         Boolean var6 = false;
         this.f15000[2] = var6;
      }
   }

   private int m32000(int var1, int var2) {
      int var3 = Math.abs(var1 - var2);
      return Math.min(var3, Nww.L() - var3);
   }

   @Iface0642
   public void m34000(C0719 var1) {
      this.m12000();
      byte var2 = !this.f15000[3] && !this.f15000[4] && this.f11000[2] == 0 ? 0 : f16000[4];
      if (var2 != 0 && this.m10000()) {
         if ((Boolean)this.f15000[4] && !(Boolean)this.f15000[3]) {
            Integer var11 = (Integer)this.f11000[3] + 1;
            this.f11000[3] = var11;
            if ((Integer)this.f11000[3] > 30) {
               Boolean var12 = false;
               this.f15000[4] = var12;
            }
         } else {
            Integer var13 = 0;
            this.f11000[3] = var13;
         }

         if (!(Boolean)this.f11000[1]) {
            if (this.m10000() && this.m4000()) {
               this.m4000();
               Integer var14 = 0;
               this.f11000[2] = var14;
               return;
            }

            Boolean var15 = true;
            this.f11000[1] = var15;
         }

         if ((Integer)this.f11000[2] == 0) {
            this.m16000();
         } else if (this.m8000()) {
            this.m4000();
         }

         Integer var16 = ((Integer)this.f11000[2] + 1) % 2;
         this.f11000[2] = var16;
      } else {
         this.m14000();
         Boolean var7 = false;
         this.f11000[1] = var7;
         Boolean var8 = false;
         this.f15000[4] = var8;
         Integer var9 = 0;
         this.f11000[2] = var9;
         Integer var10 = 0;
         this.f11000[3] = var10;
      }
   }
}
