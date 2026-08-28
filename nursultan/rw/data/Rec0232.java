package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0077;

public record Rec0232() {
   public boolean f1000;
   public int f2000;
   public float f3000;
   public int f4000;
   public float f5000;
   private static float[] f6000;
   private static float[] f7000;
   public int f8000;
   public float f9000;
   private static float[] f10000;
   private static float[] f11000;
   public float f12000;
   public float f13000;
   public Enum0077 f14000;
   public float f15000;
   public static Object[] f16000;

   public float m2000() {
      return IlOsmrq<"puwmagxo",-1445478257,1167006975,1167006969,1167006971,-1445478257>(this);
   }

   public float m6000() {
      return this.f13000;
   }

   private static void m8000() {
      f16000 = new Object[]{null};
   }

   public Rec0232(int var1, float var2, float var3, float var4, float var5, int var6, int var7, boolean var8, Enum0077 var9, float var10, float var11) {
      this.f8000 = var1;
      this.f12000 = var2;
      this.f3000 = var3;
      this.f15000 = var4;
      this.f5000 = var5;
      this.f4000 = var6;
      this.f2000 = var7;
      this.f1000 = var8;
      this.f14000 = var9;
      this.f13000 = var10;
      this.f9000 = var11;
   }

   static {
      ntfClinit();
   }

   public boolean m10000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0232,"textureId;u0;v0;u1;v1;width;height;available;kind;pxRange;iconAspect",Rec0232::f8000,Rec0232::f12000,Rec0232::f3000,Rec0232::f15000,Rec0232::f5000,Rec0232::f4000,Rec0232::f2000,Rec0232::f1000,Rec0232::f14000,Rec0232::f13000,Rec0232::f9000>(
         this, var1
      );
   }

   public int m12000() {
      return this.f2000;
   }

   public boolean m14000() {
      return this.f1000;
   }

   public float m16000() {
      return this.f3000;
   }

   public Enum0077 m20000() {
      return this.f14000;
   }

   public float m22000() {
      return this.f12000;
   }

   public int m26000() {
      return this.f8000;
   }

   public static Rec0232 m30000(int var0, int var1, int var2) {
      return var0 <= 0
         ? (Rec0232)f16000[0]
         : new Rec0232(var0, f6000[6], f6000[7], f7000[0], f7000[1], var1, var2, true, (Enum0077)Enum0077.f2000[0], f11000[0], f11000[1]);
   }

   public int m32000() {
      return this.f4000;
   }

   private static void m34000() {
      f6000 = new float[]{0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F};
      f7000 = new float[]{1.0F, 0.0F};
      f11000 = new float[]{0.0F, 1.0F};
      f10000 = new float[]{0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   }

   public static Rec0232 m36000(int var0, int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      return var0 <= 0 ? (Rec0232)f16000[0] : new Rec0232(var0, var3, var4, var5, var6, var1, var2, true, (Enum0077)Enum0077.f2000[1], var7, var8);
   }

   public float m38000() {
      return this.f9000;
   }

   public static Rec0232 m42000(int var0, int var1, int var2, float var3, float var4, float var5, float var6) {
      return var0 <= 0 ? (Rec0232)f16000[0] : new Rec0232(var0, var3, var4, var5, var6, var1, var2, true, (Enum0077)Enum0077.f2000[0], f10000[0], f10000[1]);
   }

   public static Rec0232 m44000(int var0, int var1, int var2) {
      return var0 <= 0
         ? (Rec0232)f16000[0]
         : new Rec0232(var0, f6000[0], f6000[1], f6000[2], f6000[3], var1, var2, true, (Enum0077)Enum0077.f2000[0], f6000[4], f6000[5]);
   }

   public float m48000() {
      return this.f5000;
   }
}
