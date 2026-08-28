package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNNww;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNuU;
import KDFzREm.NPp;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.NbI;
import KDFzREm.NbL;
import KDFzREm.NjL;
import KDFzREm.Nza;
import KDFzREm.wY;
import java.util.Optional;
import rw.NursultanClient;
import rw.data.Rec0288;
import rw.gui.AttackAura;

public abstract class Base0764 extends C1013 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static double[] f11000;
   private static short[] f12000;
   private static double[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   public Object[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static float[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   private static double[] f34000;
   private static short[] f35000;

   public boolean m2000() {
      return NursultanClient.m88000().m74000().U();
   }

   public boolean m4000(NjL var1) {
      this.m50000();
      if (((AttackAura)this.f16000[1]).m26000()) {
         return (boolean)0;
      } else if ((Boolean)this.f16000[3] && wY.N(var1, (NNNwS)((NNuU)this.f16000[0]).T[4])) {
         return (boolean)1;
      } else if (C0887.m32000(this.m32000())) {
         return (boolean)0;
      } else if (((NNNwS)((NNuU)this.f16000[0]).T[4]).method_75202(((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6047(), 0)) {
         return (boolean)0;
      } else {
         double var2 = ((AttackAura)this.f16000[1]).m76000();
         NXi var4 = this.m30000(var1, var2);
         if (!this.m40000(var1, var4, var2)) {
            return (boolean)0;
         } else {
            if (!((NNNwS)((NNuU)this.f16000[0]).T[4]).method_24828()
               && !C0887.m32000(this.m32000() - 4)
               && !C0887.m30000(f20000[0])
               && (!this.m24000() || OljOitkn.m28000(2).m10000() > f11000[0])) {
               ((AttackAura)this.f16000[1]).m4000();
            }

            int var5 = !C0887.m24000() && (((C0991)((AttackAura)this.f16000[1]).f44000[3]).i() || !((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6059(NbI.Y))
               ? 0
               : 1;
            if (this.m24000() && var5 != 0 && !(Boolean)this.f16000[2]) {
               if (this.m38000(OljOitkn.m28000(1))) {
                  ((AttackAura)this.f16000[1]).m4000(1);
               }

               if ((Boolean)((NNNwS)((NNuU)this.f16000[0]).T[4]).R[6]) {
                  return (boolean)0;
               }
            }

            int var6 = this.f16000[2] && ((NNNwS)((NNuU)this.f16000[0]).T[4]).field_6017 > f11000[1] && this.f16000[4] <= 0 ? 1 : 0;
            if (var6 == 0 && C0887.m30000(f20000[1])) {
               return (boolean)0;
            } else if (this.m26000(var1, var4, var2)) {
               return (boolean)0;
            } else if (this.m24000()
               && (((NNNwS)((NNuU)this.f16000[0]).T[4]).field_6017 == f11000[2] || !((AttackAura)this.f16000[1]).m66000() && C1175.m42000())
               && var5 != 0) {
               return (boolean)0;
            } else {
               if (!((NNNwS)((NNuU)this.f16000[0]).T[4]).method_24828()) {
                  ((AttackAura)this.f16000[1]).m4000();
               }

               return ((AttackAura)this.f16000[f23000[0]]).m172000();
            }
         }
      }
   }

   public Base0764(AttackAura var1, String var2, boolean var3) {
      super(var2, var3);
      this.m50000();
      NNuU var8 = NNuU.Nq();
      this.f16000[0] = var8;
      this.f16000[1] = var1;
   }

   public Base0764(AttackAura var1, String var2) {
      this(var1, var2, (boolean)0);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f21000 = new short[]{0, 1, 4, 4, 4, 5, 5};
      f5000 = new short[]{5, 2, 2};
      f27000 = new short[]{5, 0, 4};
      f31000 = new short[]{3, 1};
      f29000 = new short[]{1, 1, 3, 3, 0, 4};
      f26000 = new short[]{5, 0};
      f10000 = new short[]{4, 0, 2, 0};
      f19000 = new short[]{4, 1, 0, 4};
      f4000 = new short[]{0, 2, 0, 2};
      f22000 = new short[]{0, 4, 1};
      f3000 = new short[]{0, 2, 0, 4, 0, 4, 1, 3};
      f7000 = new short[]{5, 0, 4, 3, 4, 1, 3};
      f30000 = new short[]{3, 0, 4, 1};
      f2000 = new short[]{3, 1, 1, 0, 4};
      f9000 = new short[]{1, 0, 4, 0, 4, 1, 0};
      f6000 = new short[]{4, 0, 4, 0, 4, 1};
      f25000 = new short[]{3, 0, 4, 0, 4};
      f18000 = new short[]{0, 4, 1, 0, 4};
      f15000 = new short[]{1, 1, 3};
      f8000 = new short[]{0, 4, 2};
      f12000 = new short[]{1, 0};
      f1000 = new short[]{4, 6, 2};
      f35000 = new short[]{0, 4};
      f24000 = new short[]{4, 0, 4, 1, 0, 4, 1};
      f23000 = new short[]{1, 2, 6};
      f32000 = new short[]{6, 6, 6, 6, 6, 0, 4};
      f14000 = new short[]{0, 4};
      f17000 = new short[]{0, 4, 0, 4, 0, 4};
      f33000 = new short[]{6, 1, 1, 1, 0, 3, 0, 4};
      f28000 = new short[]{0, 4, 1, 4, 0, 4, 6};
   }

   private static void m12000() {
      f11000 = new double[]{0.0, 1.3F, 0.0, 1.0, 1.5};
      f34000 = new double[]{2.0, 0.0, 1.5, 0.0, 1.0};
      f13000 = new double[]{1.0, 0.1, 1.0, 0.0};
   }

   @Override
   public boolean m14000() {
      this.m50000();
      if (((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6047().N(NQa.Gm)) {
         return (boolean)1;
      } else if (((NNNwS)((NNuU)this.f16000[0]).T[4]).field_6017 < f13000[2]) {
         return (boolean)0;
      } else {
         return (boolean)(((C0991)((AttackAura)this.f16000[1]).f21000[4]).i() && IljlItp.m50000(IljlItp.m60000(NQa.Gm)).isPresent() ? 1 : 0);
      }
   }

   public void m16000(NjL var1) {
      this.m50000();
      if ((Boolean)this.f16000[3]) {
         Boolean var8 = false;
         this.f16000[3] = var8;
         if (wY.N(var1, (NNNwS)((NNuU)this.f16000[0]).T[4])) {
            wY.y(var1);
            Integer var9 = 5;
            this.f16000[5] = var9;
            return;
         }
      }

      if (((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6039()) {
         ((NNNZZ)((NNuU)this.f16000[0]).T[2]).y((NNNwS)((NNuU)this.f16000[0]).T[4]);
      }

      ((AttackAura)this.f16000[1]).m140000(10);
      NQo var2 = ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6047();
      Nza var3 = (Nza)var2.method_58694(NNNNRZ.c);
      if (var3 != null) {
         if (((NNNZZ)((NNuU)this.f16000[0]).T[2]).Z()) {
            return;
         }

         ((NNNZZ)((NNuU)this.f16000[0]).T[2]).N(var3);
         ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6104(NbL.field_5808);
         ((AttackAura)this.f16000[1]).m86000();
      } else {
         ((NNNZZ)((NNuU)this.f16000[0]).T[2]).N((NNNwS)((NNuU)this.f16000[0]).T[4], var1);
         ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6104(NbL.field_5808);
      }

      if ((Boolean)((C0991)((AttackAura)this.f16000[1]).f21000[3]).i() && (Integer)this.f16000[5] <= 0 && wY.N(var1, (NNNwS)((NNuU)this.f16000[0]).T[4])) {
         Boolean var10 = true;
         this.f16000[3] = var10;
      }

      if (var2.N(NQa.Gm)) {
         Integer var11 = 20;
         this.f16000[4] = var11;
      }
   }

   public boolean m20000(NjL var1) {
      this.m50000();
      return (boolean)(((C0991)((AttackAura)this.f16000[1]).f21000[3]).i() && this.f16000[3] ? 0 : 1);
   }

   public boolean m22000(Rec0288 var1) {
      this.m50000();
      if (((NNNwS)((NNuU)this.f16000[0]).T[4]).field_6017 <= f11000[3]) {
         return (boolean)0;
      } else {
         return (boolean)((!var1.m12000().m18000() || !(((NNNwS)((NNuU)this.f16000[0]).T[4]).field_6017 > f11000[4])) && !var1.m12000().m2000() ? 0 : 1);
      }
   }

   public boolean m24000() {
      this.m50000();
      if (((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6047().L(NNNNRZ.c)) {
         return (boolean)0;
      } else if (((C1013)((AttackAura)this.f16000[1]).f34000[3]).m14000()) {
         return (boolean)0;
      } else if (!((C1013)((AttackAura)this.f16000[1]).f44000[1]).m14000()) {
         return (boolean)1;
      } else {
         return (boolean)(!((NNNww)((NNNwS)((NNuU)this.f16000[0]).T[4]).L[1]).field_54155.i() && ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_24828() ? 0 : 1);
      }
   }

   public boolean m26000(NjL var1, NXi var2, double var3) {
      this.m50000();
      if (this.m24000() && (Boolean)this.f16000[f23000[1]]) {
         Rec0288 var5 = OljOitkn.m28000(1);
         if (this.m22000(var5)) {
            Integer var11 = 0;
            this.f16000[6] = var11;
            return (boolean)0;
         } else if (!this.m34000(var5, var1, var2, var3)) {
            Integer var12 = 0;
            this.f16000[6] = var12;
            return (boolean)0;
         } else {
            int var10002 = (Integer)this.f16000[6] + 1;
            Integer var13 = var10002;
            this.f16000[6] = var13;
            if (var10002 >= 10) {
               Integer var14 = 0;
               this.f16000[6] = var14;
               return (boolean)0;
            } else {
               return (boolean)1;
            }
         }
      } else {
         Integer var10 = 0;
         this.f16000[f23000[2]] = var10;
         return (boolean)0;
      }
   }

   public C0983 m28000(NjL var1, boolean var2, double var3) {
      C0983 var5 = this.m46000(var1, var2, var3);
      C1157 var6 = C1157.m22000(var1, var5, var2);
      NursultanClient.m8000().m12000(var6);
      return var6.m24000();
   }

   public abstract NXi m30000(NjL var1, double var2);

   public int m32000() {
      return 10;
   }

   public boolean m34000(Rec0288 var1, NjL var2, NXi var3, double var4) {
      this.m50000();
      double var6 = f34000[0];
      double var8 = (var2.method_23317() - var2.field_6014) * var6;
      double var10 = (var2.method_23318() - var2.field_6036) * var6;
      double var12 = (var2.method_23321() - var2.field_5969) * var6;
      double var14 = var2.method_23318() - ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_23318();
      if (var14 > f34000[1] && var14 <= f34000[2] && var10 < f34000[3]) {
         return (boolean)0;
      } else if (((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6047().N(NQa.Gm) && var1.m10000() < f34000[4]) {
         return (boolean)1;
      } else if (var1.m10000() < f13000[0]) {
         return (boolean)0;
      } else {
         if ((Boolean)((NNNwS)((NNuU)this.f16000[0]).T[4]).R[6] && this.m22000(OljOitkn.m28000(2))) {
            ((AttackAura)this.f16000[1]).m4000(1);
            ((AttackAura)this.f16000[1]).m122000(1);
         }

         NjL var16 = var1.m12000().m6000();
         NXi var17 = var16.method_33571();
         NXi var18 = var3.y(var8, var10, var12);
         if (!((AttackAura)this.f16000[1]).m68000() && !C1176.m46000(var17, var18, NNnS.field_17558, NNnC.field_1348)) {
            return (boolean)0;
         } else {
            NHS var19 = var16.method_5829().L(var1.m12000().m12000()).M(f13000[1]);
            if (((NNNZg)((NNuU)this.f16000[0]).T[3]).u(var19)) {
               return (boolean)0;
            } else {
               Optional var20 = var2.method_5829().u(var8, var10, var12).y(var17, var18);
               return var20.<Boolean>map(var3x -> var3x.R(var17) < var4).orElse(false);
            }
         }
      }
   }

   public boolean m38000(Rec0288 var1) {
      this.m50000();
      return (boolean)(((NNNwS)((NNuU)this.f16000[0]).T[4]).R[6] && !C0887.m32000(this.m32000() - 1) && var1.m10000() > f13000[3] && !C0887.m30000(f20000[2])
         ? 1
         : 0);
   }

   public boolean m40000(NjL var1, NXi var2, double var3) {
      this.m50000();
      NXi var5 = ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_33571();
      NXi var6 = C0989.m30000(var2).m28000().L(var3).i(var5);
      return (boolean)(!C1176.m54000(var5, var6, var1) ? 1 : 0);
   }

   public void m44000(NjL var1) {
      this.m50000();
      if ((Integer)this.f16000[4] > 0) {
         Integer var7 = (Integer)this.f16000[4] - 1;
         this.f16000[4] = var7;
      }

      if ((Integer)this.f16000[5] > 0) {
         Integer var8 = (Integer)this.f16000[5] - 1;
         this.f16000[f5000[0]] = var8;
      }

      Boolean var9 = this.m14000();
      this.f16000[f5000[1]] = var9;
      if ((Boolean)this.f16000[f5000[2]] && (Integer)this.f16000[5] <= 0 && wY.N(var1, (NNNwS)((NNuU)this.f16000[0]).T[4])) {
         Boolean var10 = true;
         this.f16000[3] = var10;
      }

      C0983 var2;
      if (this.m4000(var1)) {
         var2 = this.m28000(var1, true, ((AttackAura)this.f16000[1]).m76000());
         if (!this.m48000(var1, var2)) {
            this.m16000(var1);
         }
      } else {
         var2 = this.m28000(var1, false, ((AttackAura)this.f16000[1]).m72000());
      }

      NuZz.m44000(var2.m40000(((AttackAura)this.f16000[1]).m58000()));
   }

   public abstract C0983 m46000(NjL var1, boolean var2, double var3);

   public boolean m48000(NjL var1, C0983 var2) {
      this.m50000();
      NXi var3 = ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_33571();
      NXi var4 = var2.m28000().L(((AttackAura)this.f16000[1]).m76000()).i(var3);
      NXi var5 = C1176.m14000(var3, var4, var1).orElse(null);
      if (var5 == null) {
         return (boolean)1;
      } else {
         NQo var6 = ((NNNwS)((NNuU)this.f16000[0]).T[4]).method_6047();
         if (var6.L(NNNNRZ.c)) {
            return (boolean)0;
         } else {
            NPp var7 = (NPp)var6.method_58694(NNNNRZ.I);
            return (boolean)(var7 != null && !var7.N((NNNwS)((NNuU)this.f16000[0]).T[4], var5) ? 1 : 0);
         }
      }
   }

   private void m50000() {
      if (this.f16000 == null) {
         this.f16000 = new Object[7];
         Object[] var1 = this.f16000;
         var1[2] = false;
         var1[3] = false;
         var1[4] = 0;
         var1[5] = 0;
         var1[6] = 0;
      }
   }

   private static void m10000() {
      f20000 = new float[]{4.5F, 0.5F, 1.5F};
   }
}
