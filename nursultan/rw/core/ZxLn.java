package rw.core;

import KDFzREm.NAd;
import rw.api.Iface0007;
import rw.data.OljOsk;

public class ZxLn implements Iface0007 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static float[] f7000;

   private void m2000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[5];
         Object[] var1 = this.f4000;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = f7000[2];
         var1[3] = f7000[3];
      }
   }

   private static void m6000() {
      f7000 = new float[]{7.0F, 1.0F, 0.0F, 0.0F};
   }

   ZxLn(C0039 var1) {
      this.m2000();
      this.f4000[4] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new short[]{4, 0, 1, 2, 3};
      f1000 = new short[]{4, 0, 1};
      f5000 = new short[]{2, 3, 4};
      f6000 = new short[]{7, 4, 4, 7, 4, 0, 4};
      f2000 = new short[]{0, 4, 0, 4, 0, 7, 0};
   }

   public void m16000(int var1, int var2, float var3, float var4) {
      Integer var9 = var1;
      this.f4000[0] = var9;
      Integer var10 = var2;
      this.f4000[1] = var10;
      Float var11 = var3;
      this.f4000[2] = var11;
      Float var12 = var4;
      this.f4000[3] = var12;
   }

   public void m18000(int var1, NAd var2, OljOsk var3, float var4, float var5) {
      if ((Integer)((C0039)this.f4000[4]).f35000[7] != var3.m4000()) {
         ((C0039)this.f4000[4]).m26000();
         C0039 var10000 = (C0039)this.f4000[4];
         Integer var16 = var3.m4000();
         var10000.f35000[7] = var16;
      }

      float var6 = ((C0028)((C0039)this.f4000[4]).f35000[0]).m26000()
         + (((C0028)((C0039)this.f4000[4]).f35000[0]).m44000() - ((C0028)((C0039)this.f4000[4]).f35000[0]).m36000());
      float var7 = ((C0028)((C0039)this.f4000[4]).f35000[0]).m22000();
      float var8 = var6 + var3.m18000() * var4;
      float var9 = var7 + (var3.m16000() - f7000[0]) * var4 + f7000[1];
      float var10 = (var3.m22000() - var3.m18000()) * var4;
      float var11 = (var3.m10000() - var3.m16000()) * var4;
      C0806.m32000(
         ((C0805)C0039.f39000[7]).m18000(),
         var8,
         var9,
         var10,
         var11,
         var3.m2000(),
         var3.m14000(),
         var3.m20000(),
         var3.m12000(),
         C0039.m52000(var2, (Integer)this.f4000[0])
      );
   }

   public void m20000(int var1, NAd var2, boolean var3, C0267 var4, float var5) {
      if (var3) {
         ((C0039)this.f4000[4]).m68000(var4, C0039.m52000(var2, (Integer)this.f4000[0]), (Integer)this.f4000[1], (Float)this.f4000[2], (Float)this.f4000[3]);
      }
   }
}
