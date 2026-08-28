package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.core.C0350;

record Rec0080() {
   private final C0350[] f1000;
   private final int[] f2000;
   private final int[] f3000;
   private final int f4000;
   private final int f5000;
   private final int f6000;
   private final int f7000;
   static final Rec0080 f8000 = new Rec0080(new C0350[0], new int[0], new int[0], 0, 0, 0, 1);

   public int[] m2000() {
      return this.f3000;
   }

   public int m4000() {
      return this.f7000;
   }

   Rec0080(C0350[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0080,"handles;outX;outY;count;usedBottom;usedLayoutBottom;newHeight",Rec0080::f1000,Rec0080::f2000,Rec0080::f3000,Rec0080::f4000,Rec0080::f5000,Rec0080::f6000,Rec0080::f7000>(
         this, var1
      );
   }

   public int m8000() {
      return this.f5000;
   }

   public int m10000() {
      return this.f4000;
   }

   public int[] m12000() {
      return this.f2000;
   }

   public C0350[] m14000() {
      return this.f1000;
   }

   public int m16000() {
      return this.f6000;
   }
}
