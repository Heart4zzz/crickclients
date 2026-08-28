package rw.core;

public class C0024 {
   public Object[] f1000;
   public Object[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   private static float[] f6000;

   public float m2000() {
      return (Float)this.f1000[4];
   }

   public int m6000() {
      return (Integer)this.f3000[1];
   }

   public float m8000() {
      return (Float)this.f2000[0];
   }

   public C0024 m10000() {
      C0024 var1 = new C0024();
      var1.m54000(
         (Float)this.f1000[0],
         (Float)this.f1000[1],
         (Float)this.f1000[2],
         (Float)this.f1000[3],
         (Float)this.f1000[4],
         (Float)this.f1000[5],
         (Float)this.f1000[6],
         (Float)this.f1000[7],
         (Integer)this.f3000[0],
         (Integer)this.f3000[1],
         (Integer)this.f3000[2],
         (Integer)this.f3000[3],
         (Integer)this.f3000[4],
         (Float)this.f3000[5],
         (Float)this.f2000[0],
         (Float)this.f2000[1],
         (Float)this.f2000[2],
         (Float)this.f2000[3],
         (Float)this.f2000[4]
      );
      return var1;
   }

   public C0024() {
      this.m60000();
   }

   static {
      ntfClinit();
   }

   public float m12000() {
      return (Float)this.f2000[2];
   }

   public int m14000() {
      return (Integer)this.f3000[4];
   }

   public float m16000() {
      return (Float)this.f1000[6];
   }

   public float m18000() {
      return (Float)this.f1000[1];
   }

   public float m20000() {
      return (Float)this.f1000[2];
   }

   private static void m26000() {
      f4000 = new float[]{0.0F, 0.0F};
      f6000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
      f5000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public float m28000() {
      return (Float)this.f1000[0];
   }

   public float m32000() {
      return (Float)this.f2000[1];
   }

   public int m34000() {
      return (Integer)this.f3000[0];
   }

   public float m36000() {
      return (Float)this.f3000[5];
   }

   public float m38000() {
      return (Float)this.f1000[5];
   }

   public float m40000() {
      return (Float)this.f2000[3];
   }

   public float m44000() {
      return (Float)this.f2000[4];
   }

   public int m48000() {
      return (Integer)this.f3000[3];
   }

   public float m52000() {
      return (Float)this.f1000[3];
   }

   public void m54000(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19
   ) {
      Float var24 = var1;
      this.f1000[0] = var24;
      Float var25 = var2;
      this.f1000[1] = var25;
      Float var26 = var3;
      this.f1000[2] = var26;
      Float var27 = var4;
      this.f1000[3] = var27;
      Float var28 = var5;
      this.f1000[4] = var28;
      Float var29 = var6;
      this.f1000[5] = var29;
      Float var30 = var7;
      this.f1000[6] = var30;
      Float var31 = var8;
      this.f1000[7] = var31;
      Integer var32 = var9;
      this.f3000[0] = var32;
      Integer var33 = var10;
      this.f3000[1] = var33;
      Integer var34 = var11;
      this.f3000[2] = var34;
      Integer var35 = var12;
      this.f3000[3] = var35;
      Integer var36 = var13;
      this.f3000[4] = var36;
      Float var37 = var14;
      this.f3000[5] = var37;
      Float var38 = var15;
      this.f2000[0] = var38;
      Float var39 = var16;
      this.f2000[1] = var39;
      Float var40 = var17;
      this.f2000[2] = var40;
      Float var41 = var18;
      this.f2000[3] = var41;
      Float var42 = var19;
      this.f2000[4] = var42;
   }

   public int m56000() {
      return (Integer)this.f3000[2];
   }

   public float m58000() {
      return (Float)this.f1000[7];
   }

   private void m60000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var1 = this.f1000;
         var1[0] = f4000[0];
         var1[1] = f4000[1];
         var1[2] = f6000[0];
         var1[3] = f6000[1];
         var1[4] = f6000[2];
         var1[5] = f6000[3];
         var1[6] = f5000[0];
         var1[7] = f5000[1];
      }

      if (this.f3000 == null) {
         this.f3000 = new Object[6];
         Object[] var2 = this.f3000;
         var2[0] = 0;
         var2[1] = 0;
         var2[2] = 0;
         var2[3] = 0;
         var2[4] = 0;
         var2[5] = f5000[2];
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[5];
         Object[] var3 = this.f2000;
         var3[0] = f5000[3];
         var3[1] = f5000[4];
         var3[2] = f5000[5];
         var3[3] = f5000[6];
         var3[4] = f5000[7];
      }
   }
}
