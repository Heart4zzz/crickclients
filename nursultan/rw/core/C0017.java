package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNAf;
import KDFzREm.NNaI;
import rw.api.Iface0005;
import rw.api.Iface0007;
import rw.gui.C0001;

public class C0017 implements Iface0007 {
   private static short[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   public Object[] f7000;
   private static short[] f8000;
   private static short[] f9000;

   private static void m6000() {
      f2000 = new float[]{1.0F};
   }

   public C0017() {
      this.m8000();
      C0024 var5 = new C0024();
      this.f7000[0] = var5;
      C0028 var6 = new C0028();
      this.f7000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[6];
         Object[] var1 = this.f7000;
         var1[4] = 0;
         var1[5] = false;
      }
   }

   public boolean m20000(C0001 var1, float var2, float var3, String var4, float var5, float var6, int var7, Iface0005 var8) {
      this.f7000[2] = var1;
      this.f7000[3] = var8;
      Integer var15 = var7;
      this.f7000[f9000[0]] = var15;
      Boolean var16 = true;
      this.f7000[f9000[1]] = var16;
      ((C0028)this.f7000[f9000[2]]).m30000(var1, var2, var3, var4, var5, var6, this);
      return (Boolean)this.f7000[f9000[3]];
   }

   public void m22000(int var1, NAd var2, boolean var3, C0267 var4, float var5) {
      if (!var3) {
         Boolean var10 = false;
         this.f7000[5] = var10;
      } else {
         this.m28000(var4, var1, m30000(var2, (Integer)this.f7000[4]));
      }
   }

   public boolean m26000(C0001 var1, float var2, float var3, NNAf var4, float var5, float var6, int var7, Iface0005 var8) {
      this.f7000[f9000[4]] = var1;
      this.f7000[f9000[5]] = var8;
      Integer var15 = var7;
      this.f7000[f9000[6]] = var15;
      Boolean var16 = true;
      this.f7000[5] = var16;
      ((C0028)this.f7000[1]).m34000(var1, var2, var3, var4, var5, var6, this);
      return (Boolean)this.f7000[5];
   }

   private void m28000(C0267 var1, int var2, int var3) {
      int var4 = ((C0001)this.f7000[2]).m44000();
      int var5 = ((C0001)this.f7000[2]).m8000();
      if (var4 > 0 && var5 > 0) {
         float var6 = ((C0028)this.f7000[1]).m26000() + (((C0028)this.f7000[1]).m44000() - ((C0028)this.f7000[1]).m36000());
         float var7 = ((C0028)this.f7000[1]).m22000();
         float var8 = var6 + var1.f1000;
         float var9 = var6 + var1.f3000;
         float var10 = var7 - var1.f4000;
         float var11 = var7 - var1.f2000;
         float var12 = f2000[0] / ((C0028)this.f7000[1]).m2000();
         float var13 = var8 * var12;
         float var14 = var10 * var12;
         float var15 = var9 * var12;
         float var16 = var11 * var12;
         float var17 = var1.f5000;
         float var18 = var1.f8000;
         float var19 = var1.f7000;
         float var20 = var1.f6000;
         ((C0024)this.f7000[0])
            .m54000(
               var13,
               var14,
               var15,
               var16,
               var17,
               var18,
               var19,
               var20,
               ((C0001)this.f7000[2]).m48000(),
               var4,
               var5,
               var2,
               var3,
               var1.f9000 * var12,
               ((C0028)this.f7000[1]).m44000(),
               ((C0028)this.f7000[1]).m6000(),
               ((C0028)this.f7000[1]).m26000(),
               ((C0028)this.f7000[1]).m22000(),
               ((C0001)this.f7000[2]).m2000()
            );
         ((Iface0005)this.f7000[3]).m2000((C0024)this.f7000[0]);
      }
   }

   private static int m30000(NAd var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         NNaI var2 = var0.N();
         return var2 == null ? var1 : var1 & 0xFF000000 | var2.N() & 16777215;
      }
   }

   private static void m32000() {
      f8000 = new short[]{0, 1, 2, 3};
      f9000 = new short[]{4, 5, 1, 5, 2, 3, 4};
      f6000 = new short[]{5, 1, 5, 5, 4};
      f3000 = new short[]{2, 2, 1};
      f5000 = new short[]{1, 1, 1};
      f4000 = new short[]{1, 0, 2, 1, 1, 1, 1, 2};
      f1000 = new short[]{3, 0};
   }
}
