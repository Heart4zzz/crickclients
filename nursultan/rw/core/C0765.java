package rw.core;

import KDFzREm.NNWE;
import KDFzREm.NjL;
import rw.data.Rec0187;
import rw.defs.Enum0054;

public class C0765 {
   private static double[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static float[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static float[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static double[] f13000;
   private static double[] f14000;
   private static short[] f15000;

   private static void m2000() {
      f14000 = new double[]{95.0, 185.0};
      f1000 = new double[]{0.42, 0.5, 1.35, 4.65, 8.1371E-4, -0.52, 0.52};
      f13000 = new double[]{2.7193E-4, 70.0, 135.0, 430.0, 980.0, 220.0, 520.0, 2.25};
   }

   public C0765() {
      this.m24000();
      Enum0054 var5 = (Enum0054)Enum0054.f2000[0];
      this.f4000[5] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f7000 = new short[]{0, 5, 0, 1, 2};
      f6000 = new short[]{3, 4, 0};
      f11000 = new short[]{5, 5, 0};
      f8000 = new short[]{0, 5, 0, 1, 2, 5, 1};
      f15000 = new short[]{2, 5, 1, 2, 5, 1, 3, 4};
      f12000 = new short[]{3, 4, 1, 5, 1, 2, 0, 0};
      f3000 = new short[]{5, 1, 2, 3, 4, 0, 0};
   }

   private float m22000(float var1) {
      return f5000[1] - (float)Math.pow(f5000[2] - var1, f13000[7]);
   }

   private void m24000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[6];
         Object[] var1 = this.f4000;
         var1[0] = 0L;
         var1[1] = 0L;
         var1[2] = 0L;
         var1[3] = f5000[5];
         var1[4] = f5000[6];
      }
   }

   public void m28000() {
      Long var5 = 0L;
      this.f4000[0] = var5;
      Long var6 = 0L;
      this.f4000[1] = var6;
      Long var7 = 0L;
      this.f4000[2] = var7;
      Float var8 = f10000[0];
      this.f4000[3] = var8;
      Float var9 = f10000[1];
      this.f4000[4] = var9;
      Enum0054 var10 = (Enum0054)Enum0054.f2000[0];
      this.f4000[f11000[0]] = var10;
   }

   private boolean m30000(C0983 var1, C0983 var2) {
      float var3 = Math.abs(C0070.m12000(var1.m38000(), var2.m38000()));
      float var4 = Math.abs(var2.m68000() - var1.m68000());
      if (!(var3 > f2000[0]) && !(var4 > f2000[1])) {
         return (boolean)(Math.random() < f1000[0] ? 1 : 0);
      } else {
         return (boolean)0;
      }
   }

   private float m34000(float var1) {
      return var1 * var1 * (f5000[3] - f5000[4] * var1);
   }

   private void m36000(long var1) {
      Enum0054 var7 = (Enum0054)Enum0054.f2000[0];
      this.f4000[5] = var7;
      Long var8 = 0L;
      this.f4000[1] = var8;
      Long var9 = 0L;
      this.f4000[2] = var9;
      Float var10 = f2000[5];
      this.f4000[3] = var10;
      Float var11 = f5000[0];
      this.f4000[4] = var11;
      if (var1 >= (Long)this.f4000[0]) {
         Long var12 = var1 + (long)C0052.m8000(f13000[5], f13000[6]);
         this.f4000[0] = var12;
      }
   }

   public Rec0187 m38000(C0768 var1, NjL var2, C0983 var3, C0983 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      long var9 = System.currentTimeMillis();
      if (var5 && !var7 && (!var6 || !var8)) {
         if ((Enum0054)this.f4000[f11000[1]] == (Enum0054)Enum0054.f2000[f11000[2]] && var9 >= (Long)this.f4000[0] && this.m30000(var3, var4)) {
            this.m40000(var9, var3, var4);
         }

         if ((Enum0054)this.f4000[5] == (Enum0054)Enum0054.f2000[0]) {
            return new Rec0187(var4, false);
         } else {
            float var11 = NNWE.N((float)(var9 - (Long)this.f4000[1]) / (float)Math.max(1L, (Long)this.f4000[2]), f9000[0], f9000[1]);
            if (var11 >= f9000[2]) {
               if ((Enum0054)this.f4000[5] != (Enum0054)Enum0054.f2000[1]) {
                  this.m36000(var9);
                  return new Rec0187(var4, false);
               }

               Enum0054 var18 = (Enum0054)Enum0054.f2000[2];
               this.f4000[5] = var18;
               Long var19 = var9;
               this.f4000[1] = var19;
               Long var20 = (long)C0052.m8000(f14000[0], f14000[1]);
               this.f4000[2] = var20;
               var11 = f9000[3];
            }

            float var12 = (Enum0054)this.f4000[5] == (Enum0054)Enum0054.f2000[1] ? this.m22000(var11) : f9000[4] - this.m34000(var11);
            C0983 var13 = new C0983(var4.m38000() + (Float)this.f4000[3] * var12, NNWE.N(var4.m68000() + (Float)this.f4000[4] * var12, f9000[5], f9000[6]));
            return new Rec0187(var13, true);
         }
      } else {
         this.m36000(var9);
         return new Rec0187(var4, false);
      }
   }

   private void m40000(long var1, C0983 var3, C0983 var4) {
      float var5 = C0070.m12000(var3.m38000(), var4.m38000());
      float var6 = Math.abs(var5) > f2000[2] ? Math.signum(var5) : (Math.random() > f1000[1] ? f2000[3] : f2000[4]);
      Float var11 = var6 * C0052.m8000(f1000[2], f1000[3]) + (float)(Math.random() * f1000[4]);
      this.f4000[3] = var11;
      Float var12 = C0052.m8000(f1000[5], f1000[6]) + (float)(Math.random() * f13000[0]);
      this.f4000[4] = var12;
      Enum0054 var13 = (Enum0054)Enum0054.f2000[1];
      this.f4000[5] = var13;
      Long var14 = var1;
      this.f4000[1] = var14;
      Long var15 = (long)C0052.m8000(f13000[1], f13000[2]);
      this.f4000[2] = var15;
      Long var16 = var1 + (long)C0052.m8000(f13000[3], f13000[4]);
      this.f4000[0] = var16;
   }

   private static void m44000() {
      f10000 = new float[]{0.0F, 0.0F};
      f9000 = new float[]{0.0F, 1.0F, 1.0F, 0.0F, 1.0F, -90.0F, 90.0F};
      f2000 = new float[]{2.6F, 1.3F, 0.12F, 1.0F, -1.0F, 0.0F};
      f5000 = new float[]{0.0F, 1.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F};
   }
}
