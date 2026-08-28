package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNAf;
import rw.api.Iface0007;
import rw.data.OljOsk;
import rw.gui.C0001;

public class C0028 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static float[] f5000;
   private static float[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   public Object[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static float[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   public Object[] f19000;
   private static float[] f20000;
   private static short[] f21000;

   public float m2000() {
      return (Float)this.f8000[4];
   }

   public float m6000() {
      return (Float)this.f9000[0];
   }

   public C0028() {
      this.m18000();
      C0029 var5 = new C0029(this);
      this.f8000[0] = var5;
      C0267 var6 = new C0267();
      this.f8000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if ((Integer)this.f9000[5] != -1) {
         Float var5 = (Float)this.f19000[2] + Math.round((Float)this.f9000[6]);
         this.f19000[2] = var5;
         Float var6 = f16000[2];
         this.f9000[6] = var6;
      }
   }

   private static void m10000() {
      f6000 = new float[]{0.0F, 1.0F};
      f16000 = new float[]{4.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f20000 = new float[]{0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f5000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public float m12000() {
      return (Float)this.f9000[3];
   }

   private static void m16000() {
      f21000 = new short[]{0, 1, 0, 1, 2, 0, 1, 2};
      f18000 = new short[]{3, 4, 2, 3, 4, 0, 4};
      f17000 = new short[]{1, 1, 2, 4, 0};
      f10000 = new short[]{1, 1};
      f1000 = new short[]{0, 2, 3, 4};
      f3000 = new short[]{5, 6, 2, 0, 5, 2};
      f14000 = new short[]{6, 2, 6};
      f15000 = new short[]{0, 1, 2, 0, 3};
      f11000 = new short[]{0, 0, 2};
      f12000 = new short[]{5, 2};
      f2000 = new short[]{6, 4, 2, 5, 6};
      f7000 = new short[]{5, 6, 5, 2, 5, 3, 2};
      f13000 = new short[]{6, 2, 2, 3, 0, 6, 5, 2};
      f4000 = new short[]{3, 1, 2, 3, 0, 1, 6, 5};
   }

   private void m18000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[5];
         Object[] var1 = this.f8000;
         var1[3] = f20000[2];
         var1[4] = f20000[3];
      }

      if (this.f19000 == null) {
         this.f19000 = new Object[3];
         Object[] var2 = this.f19000;
         var2[1] = f20000[4];
         var2[2] = f20000[5];
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[7];
         Object[] var3 = this.f9000;
         var3[0] = f20000[6];
         var3[1] = f5000[0];
         var3[2] = f5000[1];
         var3[3] = f5000[2];
         var3[4] = f5000[3];
         var3[5] = 0;
         var3[6] = f5000[4];
      }
   }

   public float m22000() {
      return (Float)this.f9000[2];
   }

   public float m26000() {
      return (Float)this.f9000[1];
   }

   public void m30000(C0001 var1, float var2, float var3, String var4, float var5, float var6, Iface0007 var7) {
      this.m38000(var1, var2, var3, var5, var6, var7);
      int var8 = 0;

      while (var8 < var4.length()) {
         int var9 = var4.codePointAt(var8);
         var8 += Character.charCount(var9);
         this.m32000(null, var9);
      }

      this.m8000();
      var7.m2000();
      this.m42000();
   }

   void m32000(NAd var1, int var2) {
      switch (var2) {
         case 9:
            Float var14 = (Float)this.f19000[2] + Math.round((Float)this.f9000[6] + (Float)this.f9000[4]);
            this.f19000[2] = var14;
            Integer var15 = -1;
            this.f9000[5] = var15;
            Float var16 = f16000[3];
            this.f9000[6] = var16;
            return;
         case 10:
            this.m8000();
            ((Iface0007)this.f19000[0]).m4000();
            Float var10 = (Float)this.f19000[1];
            this.f19000[2] = var10;
            Float var11 = (Float)this.f9000[0] + (Float)this.f9000[3];
            this.f9000[0] = var11;
            Float var12 = (float)Math.round((Float)this.f9000[0]);
            this.f9000[2] = var12;
            Integer var13 = -1;
            this.f9000[5] = var13;
            return;
         case 11:
         case 12:
         default:
            if ((Integer)this.f9000[f7000[2]] != -1) {
               float var3 = ((C0001)this.f8000[f7000[3]]).m66000((Integer)this.f9000[f7000[4]], var2, (Float)this.f8000[f7000[5]]);
               Float var19 = (Float)this.f19000[f7000[6]] + Math.round((Float)this.f9000[6] + var3);
               this.f19000[2] = var19;
            }

            if (!C0036.m28000(var1) && !C0036.m32000(var2) && ((C0001)this.f8000[2]).m46000(var2)) {
               boolean var25 = ((C0001)this.f8000[2]).m56000(var2, (Float)this.f8000[3], (C0267)this.f8000[1]);
               float var26 = ((C0001)this.f8000[2]).m58000(var2, (Float)this.f8000[3]);
               ((Iface0007)this.f19000[0]).m6000(var2, var1, var25, (C0267)this.f8000[1], var26);
               Float var22 = var26;
               this.f9000[6] = var22;
               Integer var23 = var2;
               this.f9000[5] = var23;
               return;
            }

            OljOsk var24 = C0036.m24000(var2, var1);
            float var4 = f20000[0];
            if (var24 != null) {
               float var5 = (Float)this.f9000[3] / f20000[1];
               var4 = var24.m8000() * var5;
               ((Iface0007)this.f19000[0]).m8000(var2, var1, var24, var5, var4);
            }

            Float var20 = var4;
            this.f9000[6] = var20;
            Integer var21 = var2;
            this.f9000[5] = var21;
            return;
         case 13:
            Integer var17 = -1;
            this.f9000[f7000[0]] = var17;
            Float var18 = f16000[4];
            this.f9000[f7000[1]] = var18;
      }
   }

   public void m34000(C0001 var1, float var2, float var3, NNAf var4, float var5, float var6, Iface0007 var7) {
      this.m38000(var1, var2, var3, var5, var6, var7);
      var4.accept((C0029)this.f8000[0]);
      this.m8000();
      var7.m2000();
      this.m42000();
   }

   public float m36000() {
      return (Float)this.f19000[1];
   }

   private void m38000(C0001 var1, float var2, float var3, float var4, float var5, Iface0007 var6) {
      this.f8000[2] = var1;
      Float var12 = var2;
      this.f8000[3] = var12;
      Float var13 = var3 > f6000[0] ? var3 : f6000[1];
      this.f8000[4] = var13;
      this.f19000[0] = var6;
      Float var15 = var4 * (Float)this.f8000[4];
      this.f19000[1] = var15;
      Float var16 = (Float)this.f19000[1];
      this.f19000[2] = var16;
      Float var17 = var5 * (Float)this.f8000[4] + var1.m52000(var2);
      this.f9000[0] = var17;
      Float var18 = (float)Math.round((Float)this.f19000[1]);
      this.f9000[1] = var18;
      Float var19 = (float)Math.round((Float)this.f9000[0]);
      this.f9000[2] = var19;
      Float var20 = var1.m64000(var2);
      this.f9000[3] = var20;
      Float var21 = var1.m58000(32, var2) * f16000[0];
      this.f9000[4] = var21;
      Integer var22 = -1;
      this.f9000[5] = var22;
      Float var23 = f16000[1];
      this.f9000[6] = var23;
   }

   private void m42000() {
      Object var5 = null;
      this.f8000[2] = var5;
      Object var6 = null;
      this.f19000[0] = var6;
   }

   public float m44000() {
      return (Float)this.f19000[2];
   }
}
