package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0081() {
   private final long f1000;
   private final int f2000;
   private final double f3000;
   private final double f4000;
   private final double f5000;
   private final int f6000;
   private final int[] f7000;
   private final Rec0088[] f8000;

   public double m2000() {
      return this.f3000;
   }

   public int[] m4000() {
      return this.f7000;
   }

   Rec0081(long var1, int var3, double var4, double var6, double var8, int var10, int[] var11, Rec0088[] var12) {
      this.f1000 = var1;
      this.f2000 = var3;
      this.f3000 = var4;
      this.f4000 = var6;
      this.f5000 = var8;
      this.f6000 = var10;
      this.f7000 = var11;
      this.f8000 = var12;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0081,"fontHash;fieldType;baseSize;pxRange;weight;channels;cp;cells",Rec0081::f1000,Rec0081::f2000,Rec0081::f3000,Rec0081::f4000,Rec0081::f5000,Rec0081::f6000,Rec0081::f7000,Rec0081::f8000>(
         this, var1
      );
   }

   public Rec0088[] m8000() {
      return this.f8000;
   }

   public double m10000() {
      return this.f5000;
   }

   public double m12000() {
      return this.f4000;
   }

   public int m14000() {
      return this.f2000;
   }

   public long m16000() {
      return this.f1000;
   }

   public int m18000() {
      return this.f6000;
   }
}
