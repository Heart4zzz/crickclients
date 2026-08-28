package rw.core;

import KDFzREm.NNNZZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNgf;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.Nrm;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import rw.NursultanClient;
import rw.api.Iface0642;
import rw.defs.Enum0074;
import rw.defs.Enum0075;
import rw.defs.Enum0081;
import rw.module.AimAssist;
import rw.module.AttackAura_x_x;
import rw.module.FreeCamera;
import rw.module.IltlnIij;

public class NuZz {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   public static Object[] f10000;
   private static float[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   public Object[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static short[] f20000;
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
   public Object[] f31000;
   private static short[] f32000;
   private static float[] f33000;

   public boolean m4000() {
      return (Boolean)this.f31000[1];
   }

   private void m6000(C0983 var1) {
      if (!(Boolean)this.f31000[f9000[2]]) {
         Float var6 = ((NNNwS)((NNuU)f10000[f9000[3]]).T[4]).method_36454();
         this.f31000[4] = var6;
         Float var7 = ((NNNwS)((NNuU)f10000[0]).T[4]).method_36455();
         this.f31000[5] = var7;
      }

      ((NNNwS)((NNuU)f10000[0]).T[4]).method_36456(var1.m38000());
      ((NNNwS)((NNuU)f10000[0]).T[4]).method_36457(var1.m68000());
      Integer var8 = NursultanClient.m74000().m10000();
      this.f31000[2] = var8;
      Boolean var9 = true;
      this.f31000[3] = var9;
   }

   public float m8000() {
      return (Float)this.f31000[4];
   }

   private static void m10000() {
      f10000 = new Object[]{null};
   }

   private void m12000() {
      if (this.f31000 == null) {
         this.f31000 = new Object[8];
         Object[] var1 = this.f31000;
         var1[1] = false;
         var1[2] = 0;
         var1[3] = false;
         var1[4] = f33000[6];
         var1[5] = f33000[7];
         var1[6] = false;
         var1[7] = false;
      }

      if (this.f14000 == null) {
         this.f14000 = new Object[2];
         Object[] var2 = this.f14000;
         var2[0] = false;
      }
   }

   public NuZz() {
      this.m12000();
      ArrayList var5 = new ArrayList();
      this.f31000[0] = var5;
      NursultanClient.m8000().m32000(this);
   }

   static {
      ntfClinit();
   }

   public List<C0983> m14000() {
      return (List<C0983>)this.f31000[0];
   }

   public boolean m16000() {
      return (Boolean)this.f31000[7];
   }

   public int m20000() {
      return (Integer)this.f31000[2];
   }

   private static void m22000() {
      f19000 = new short[]{0, 1};
      f13000 = new short[]{3, 1, 3};
      f7000 = new short[]{7, 4, 0, 0, 4, 2, 3, 0};
      f21000 = new short[]{1, 7, 6};
      f6000 = new short[]{1, 1};
      f20000 = new short[]{3, 4, 4, 5, 5};
      f18000 = new short[]{5, 5, 1, 3, 4};
      f28000 = new short[]{5, 1, 3, 4, 5, 0, 4, 0};
      f32000 = new short[]{2, 6, 0, 4, 4};
      f15000 = new short[]{0, 4, 0, 4, 5, 0};
      f30000 = new short[]{4, 1, 1, 2, 0};
      f29000 = new short[]{4, 0, 4, 0, 4};
      f12000 = new short[]{5, 0, 4, 0, 4, 0, 4, 0};
      f27000 = new short[]{4, 0};
      f8000 = new short[]{4, 5, 0, 4, 0, 4, 3};
      f1000 = new short[]{0, 4, 0, 4};
      f23000 = new short[]{4, 0, 4, 0};
      f3000 = new short[]{4, 0, 4, 0, 0, 4, 0, 4};
      f4000 = new short[]{2, 0, 4, 5};
      f9000 = new short[]{1, 3, 3, 0};
      f2000 = new short[]{4, 4};
      f5000 = new short[]{0, 4, 5};
      f25000 = new short[]{0, 4, 0, 4, 2, 3, 0};
      f24000 = new short[]{0, 0, 0, 4, 0, 1};
      f16000 = new short[]{7, 6};
      f17000 = new short[]{1, 0, 0, 1, 2, 3, 4, 5};
      f26000 = new short[]{6, 7, 0, 1, 0, 2, 0};
      f22000 = new short[]{3, 0, 4, 0, 4, 0, 4};
   }

   private static void m24000() {
      f11000 = new float[]{0.15F, 0.15F, -90.0F, 90.0F, 2.0F, 2.0F, 1.0F, 5.0F};
      f33000 = new float[]{10.0F, 35.0F, 0.5F, 0.5F, -90.0F, 90.0F, 0.0F, 0.0F};
   }

   public boolean m30000() {
      return (Boolean)this.f14000[0];
   }

   public boolean m32000() {
      return (Boolean)this.f31000[3];
   }

   private void m38000(IltlnIij var1) {
      NbL var2 = var1.m12000();
      if (this.m68000(((NNNwS)((NNuU)f10000[0]).T[4]).method_5998(var2))) {
         var1.N();
         C0983 var3 = C0989.m4000().m60000((Enum0074)Enum0074.f2000[0]);
         this.m6000(var3);
         m44000(var3);
         NursultanClient.m36000()
            .m14000(
               2,
               () -> {
                  this.m6000(var3);
                  m44000(var3);
                  ((NNNZZ)((NNuU)f10000[0]).T[2])
                     .N(
                        (NNNZg)((NNuU)f10000[0]).T[3],
                        var1xx -> new Nrm(var2, var1xx, ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454(), ((NNNwS)((NNuU)f10000[0]).T[4]).method_36455())
                     );
                  ((NNNwS)((NNuU)f10000[0]).T[4]).method_6104(var2);
               }
            );
      }
   }

   public boolean m42000() {
      return (Boolean)this.f31000[6];
   }

   public static void m44000(C0983 var0) {
      NuZz var1 = NursultanClient.m72000();
      if (!(Boolean)var1.f14000[0]) {
         ((List)var1.f31000[0]).add(var0);
         ((List)var1.f31000[0]).sort(Comparator.comparingInt(var0x -> var0x.m30000().m32000()));
      }
   }

   private void m46000() {
      if (NursultanClient.m74000().m10000() - 20 <= (Integer)this.f31000[2] && (Boolean)this.f31000[6]) {
         float var1 = ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454() + NNWE.R((Float)this.f31000[4] - ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454());
         if (Math.abs(var1 - ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454()) < f11000[4]
            && Math.abs((Float)this.f31000[5] - ((NNNwS)((NNuU)f10000[0]).T[f30000[0]]).method_36455()) < f11000[5]) {
            this.m72000();
            return;
         }

         if ((Enum0075)this.f14000[f30000[1]] == (Enum0075)Enum0075.f4000[f30000[2]]) {
            float var2;
            if (NursultanClient.m74000().m10000() - 10 < (Integer)this.f31000[f30000[3]]) {
               var2 = C1183.m18000(f11000[6], f11000[7]);
            } else {
               var2 = C1183.m18000(f33000[0], f33000[1]);
            }

            C0983 var3 = new C0983(
                  ((NNNwS)((NNuU)f10000[f30000[4]]).T[4]).method_36454() + NNWE.N(var1 - ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454(), -var2, var2),
                  ((NNNwS)((NNuU)f10000[0]).T[4]).method_36455() + NNWE.N((Float)this.f31000[5] - ((NNNwS)((NNuU)f10000[0]).T[4]).method_36455(), -var2, var2)
               )
               .m54000(true);
            ((NNNwS)((NNuU)f10000[0]).T[4]).method_36456(var3.m38000());
            ((NNNwS)((NNuU)f10000[0]).T[4]).method_36457(var3.m68000());
         } else {
            C0983 var4 = new C0983(
                  NNWE.B(f33000[2], ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454(), var1),
                  NNWE.B(f33000[3], ((NNNwS)((NNuU)f10000[0]).T[4]).method_36455(), (Float)this.f31000[5])
               )
               .m54000(true);
            ((NNNwS)((NNuU)f10000[0]).T[4]).method_36456(var4.m38000());
            ((NNNwS)((NNuU)f10000[0]).T[4]).method_36457(var4.m68000());
         }
      } else {
         this.m72000();
      }
   }

   public float m52000() {
      return (Float)this.f31000[5];
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public void m54000(AimAssist var1) {
      if (!var1.y()) {
         if (!(Boolean)this.f31000[1] && (Boolean)this.f31000[3]) {
            var1.N();
            Float var6 = (Float)this.f31000[4] + (float)var1.m18000() * f11000[0];
            this.f31000[4] = var6;
            Float var7 = (Float)this.f31000[5] + (float)var1.m4000() * f11000[1];
            this.f31000[5] = var7;
            Float var8 = Math.clamp((Float)this.f31000[5], f11000[2], f11000[3]);
            this.f31000[5] = var8;
         }
      }
   }

   @Iface0642
   public void m56000(IltlnIij var1) {
      if (!(Boolean)this.f31000[1] && (Boolean)this.f31000[3]) {
         this.m38000(var1);
      }
   }

   @Iface0642
   public void m58000(FreeCamera var1) {
      if (!(Boolean)this.f31000[1] && (Boolean)this.f31000[3]) {
         var1.m34000((Float)this.f31000[4]);
         var1.m28000((Float)this.f31000[5]);
      }
   }

   public static void m60000(C0983 var0) {
      NuZz var1 = NursultanClient.m72000();
      if ((NNNwS)((NNuU)f10000[0]).T[4] != null) {
         ((List)var1.f31000[0]).clear();
         Boolean var6 = var0.m14000();
         var1.f31000[1] = var6;
         Boolean var7 = var0.m36000();
         var1.f31000[7] = var7;
         Boolean var8 = var0.m46000();
         var1.f31000[6] = var8;
         Enum0075 var9 = var0.m56000();
         var1.f14000[1] = var9;
         var1.m6000(var0);
         Boolean var10 = true;
         var1.f14000[0] = var10;
      }
   }

   @Iface0642
   public void m62000(C0921 var1) {
      if (!(Boolean)this.f31000[1] && (Boolean)this.f31000[3]) {
         var1.m20000((Float)this.f31000[4]);
         var1.m26000((Float)this.f31000[5]);
      }
   }

   @Iface0642
   public void m64000(AttackAura_x_x var1) {
      if (!(Boolean)this.f31000[1] && (Boolean)this.f31000[3] && !(Boolean)this.f31000[7]) {
         C1181.m52000(var1, (Float)this.f31000[4]);
      }
   }

   @Iface0642(
      y = Enum0081.LISTENER
   )
   public void m66000(C0719 var1) {
      Boolean var8 = false;
      this.f14000[0] = var8;
      if ((NNNwS)((NNuU)f10000[0]).T[4] != null) {
         if (NursultanClient.m74000().m10000() - 1 > (Integer)this.f31000[2] && (Boolean)this.f31000[3]) {
            this.m46000();
         }

         Iterator var2 = ((List)this.f31000[0]).iterator();

         while (var2.hasNext()) {
            C0983 var3 = (C0983)var2.next();
            Boolean var9 = var3.m14000();
            this.f31000[1] = var9;
            Boolean var10 = var3.m36000();
            this.f31000[7] = var10;
            Boolean var11 = var3.m46000();
            this.f31000[6] = var11;
            Enum0075 var12 = var3.m56000();
            this.f14000[1] = var12;
            this.m6000(var3);
            var2.remove();
         }
      }
   }

   private boolean m68000(NQo var1) {
      if (var1.N(NQa.nz)) {
         return (boolean)1;
      } else if (var1.N(NQa.Gz)) {
         return (boolean)1;
      } else if (var1.N(NQa.dw)) {
         return (boolean)1;
      } else {
         return (boolean)(var1.N(NQa.GB) ? 1 : var1.B() instanceof NNgf);
      }
   }

   private void m72000() {
      if ((Boolean)this.f31000[3]) {
         ((NNNwS)((NNuU)f10000[0]).T[4])
            .method_36456(((NNNwS)((NNuU)f10000[0]).T[4]).method_36454() + NNWE.R((Float)this.f31000[4] - ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454()));
         NNNwS var10000 = (NNNwS)((NNuU)f10000[0]).T[4];
         Float var5 = ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454();
         var10000.u[0] = var5;
         var10000 = (NNNwS)((NNuU)f10000[0]).T[4];
         Float var6 = ((NNNwS)((NNuU)f10000[0]).T[4]).method_36454();
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[2] = var6;
         ((NNNwS)((NNuU)f10000[0]).T[4]).method_36457(NNWE.N((Float)this.f31000[5], f33000[4], f33000[5]));
      }

      Boolean var7 = false;
      this.f31000[f9000[0]] = var7;
      Boolean var8 = false;
      this.f31000[f9000[1]] = var8;
   }

   public Enum0075 m74000() {
      return (Enum0075)this.f14000[1];
   }
}
