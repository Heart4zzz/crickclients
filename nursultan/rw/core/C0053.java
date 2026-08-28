package rw.core;

import KDFzREm.NNWE;
import rw.data.Rec0188;
import rw.data.SpeedX;

public class C0053 {
   private static float[] f1000;
   private static short[] f2000;
   private static float[] f3000;
   private static double[] f4000;
   private static double[] f5000;
   private static float[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static double[] f10000;
   private static float[] f11000;
   private static double[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static float[] f15000;
   private static short[] f16000;
   private static double[] f17000;

   private void m2000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[8];
         Object[] var1 = this.f8000;
         var1[0] = 0L;
         var1[1] = 0L;
         var1[2] = 0L;
         var1[3] = f15000[5];
         var1[4] = f15000[6];
         var1[5] = f15000[7];
         var1[6] = 0;
         var1[7] = 0;
      }
   }

   private static void m6000() {
      f12000 = new double[]{0.42F, 1.08F, -2.0, 2.0};
      f10000 = new double[]{1.0, 6.0};
      f17000 = new double[]{3.0, 0.5, 0.64F, 0.34F, 1.34F, 1.08F, 2.18F};
      f5000 = new double[]{1.62F, 0.46F, 0.3F, 0.82F, 58.0};
      f4000 = new double[]{46.0, 128.0, 96.0, 120.0, 185.0, 420.0, 680.0};
   }

   public C0053() {
      this.m2000();
      Float var5 = f3000[0];
      this.f8000[3] = var5;
      Float var6 = f3000[1];
      this.f8000[4] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f3000 = new float[]{1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F};
      f11000 = new float[]{1.0F, 1.0F, 0.34F, 1.0F, 0.18F, 4.0F};
      f6000 = new float[]{0.0F, 1.65F, 3.4F};
      f1000 = new float[]{2.4F, 5.0F};
      f15000 = new float[]{4.2F, 10.0F, 12.0F, 0.74F, 0.58F, 0.0F, 0.0F, 0.0F};
   }

   private static void m18000() {
      f2000 = new short[]{3, 4, 0, 1, 2};
      f7000 = new short[]{3, 4, 5, 6, 7};
      f16000 = new short[]{6, 7, 7};
      f9000 = new short[]{7, 2, 0, 1, 2, 1};
      f14000 = new short[]{3, 4, 3, 7, 7, 6, 6, 5};
      f13000 = new short[]{7, 3, 4, 1, 2, 0};
   }

   private boolean m28000(C0768 var1, Rec0188 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (var5 || var3 <= f6000[1] || var1.m24000().m12000() < 42L) {
         return (boolean)0;
      } else if (var2.m8000() || var2.m4000()) {
         return (boolean)1;
      } else if (!var2.m16000() && var3 > f6000[2]) {
         return (boolean)1;
      } else if (var6 && var3 > f1000[0]) {
         return (boolean)1;
      } else if (var4 && var3 > f1000[1]) {
         return (boolean)(Math.random() < f17000[2] ? 1 : 0);
      } else {
         return (boolean)((this.f8000[7] < 2 || !(var3 > f15000[0])) && (!(var3 > f15000[1]) || !(Math.random() < f17000[3])) ? 0 : 1);
      }
   }

   public void m30000() {
      Long var5 = 0L;
      this.f8000[0] = var5;
      Long var6 = 0L;
      this.f8000[1] = var6;
      Long var7 = 0L;
      this.f8000[2] = var7;
      Float var8 = f3000[2];
      this.f8000[f7000[0]] = var8;
      Float var9 = f3000[3];
      this.f8000[f7000[1]] = var9;
      Float var10 = f3000[4];
      this.f8000[f7000[2]] = var10;
      Integer var11 = 0;
      this.f8000[f7000[3]] = var11;
      Integer var12 = 0;
      this.f8000[f7000[4]] = var12;
   }

   private void m32000(long var1, Rec0188 var3, float var4, boolean var5) {
      int var6 = !var3.m4000() && !var3.m8000() && var3.m16000() && !(var4 > f15000[2]) ? 0 : 1;
      Float var11 = C0052.m8000(var6 != 0 ? f17000[4] : f17000[5], var6 != 0 ? f17000[6] : f5000[0]);
      this.f8000[3] = var11;
      Float var12 = C0052.m8000(var6 != 0 ? f5000[1] : f5000[2], var5 ? f5000[3] : (var6 != 0 ? f15000[3] : f15000[4]));
      this.f8000[4] = var12;
      Long var13 = var1;
      this.f8000[1] = var13;
      Long var14 = var1 + (long)C0052.m8000(var6 != 0 ? f5000[4] : f4000[0], var6 != 0 ? f4000[1] : f4000[2]);
      this.f8000[2] = var14;
      Long var15 = var1 + (long)C0052.m8000(var6 != 0 ? f4000[3] : f4000[4], var6 != 0 ? f4000[5] : f4000[6]);
      this.f8000[0] = var15;
   }

   public SpeedX m34000(C0768 var1, C0983 var2, Rec0188 var3, float var4, float var5, boolean var6, boolean var7, boolean var8) {
      long var11 = System.currentTimeMillis();
      float var13 = var3.m14000();
      int var14 = Math.max(1, Math.round(var4 / var5));
      int var10001;
      if (var14 == (Integer)this.f8000[6]) {
         int var10003 = (Integer)this.f8000[7] + 1;
         var10001 = var10003;
         Integer var26 = var10003;
         this.f8000[7] = var26;
      } else {
         var10001 = 0;
      }

      Integer var27 = var10001;
      this.f8000[7] = var27;
      int var10 = var11 < this.f8000[2] ? 1 : 0;
      if (var10 == 0 && var11 >= (Long)this.f8000[0] && this.m28000(var1, var3, var13, var6, var7, var8)) {
         this.m32000(var11, var3, var13, var8);
         var10 = 1;
      }

      float var16 = var4;
      int var17 = 0;
      if (var10 != 0) {
         float var18 = NNWE.N((float)(var11 - (Long)this.f8000[1]) / (float)Math.max(1L, (Long)this.f8000[2] - (Long)this.f8000[1]), f3000[5], f11000[0]);
         float var19 = (float)Math.pow(f11000[1] - var18, f12000[0]);
         float var20 = f11000[2] + var19 * (Float)this.f8000[3];
         float var21 = var13 * (Float)this.f8000[4] * var20;
         var16 = Math.max(var4, var21);
         var16 *= C0052.m8000(f12000[1], f11000[3] + (Float)this.f8000[3] * f11000[4]);
         var17 = 1;
      }

      if ((Integer)this.f8000[7] >= 1 && var13 > var5 * f11000[5]) {
         float var32 = Math.signum(C0070.m12000(var2.m38000(), var3.m20000().m38000()));
         float var33 = var32 == f6000[0] ? C0052.m8000(f12000[2], f12000[3]) : var32 * C0052.m8000(f10000[0], var6 ? f10000[1] : f17000[0]);
         var16 = Math.max(var5, var16 + var33 * var5);
         var17 |= !var6 && this.f8000[7] < 2 ? 0 : 1;
      }

      int var9;
      if ((var9 = Math.max(1, Math.round(var16 / var5))) == (Integer)this.f8000[6] && var9 > 1) {
         var9 += Math.random() > f17000[1] ? 1 : -1;
      }

      var16 = Math.max(var5, var9 * var5);
      Integer var28 = var9;
      this.f8000[6] = var28;
      Float var29 = var16;
      this.f8000[5] = var29;
      return new SpeedX(var16, (boolean)var17);
   }
}
