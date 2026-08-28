package rw.core;

import rw.data.Rec0033;

public class OlIrtqjti {
   private static float[] f1000;
   private static boolean[] f2000;
   private static boolean[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;
   public Object[] f6000;
   public Object[] f7000;
   public static Object[] f8000;
   private static boolean[] f9000;

   public int m4000() {
      return (Integer)OlIrtqjti<"vlfx",-271685193,1835043234,1835043235,1835043232,-271685193>(this)[3];
   }

   public int m6000() {
      return (Integer)this.f7000[0];
   }

   private OlIrtqjti(int var1) {
      this.m24000();
      Integer var6 = ((Rec0033)f8000[0]).m30000(var1);
      this.f7000[0] = var6;
      Integer var7 = ((Rec0033)f8000[1]).m30000(var1);
      this.f7000[1] = var7;
      Integer var8 = ((Rec0033)f8000[2]).m30000(var1);
      this.f7000[2] = var8;
      Integer var9 = ((Rec0033)f8000[3]).m30000(var1);
      this.f6000[0] = var9;
      Integer var10 = ((Rec0033)f8000[4]).m30000(var1);
      this.f6000[1] = var10;
      Integer var11 = ((Rec0033)f4000[0]).m30000(var1);
      this.f6000[2] = var11;
      Integer var12 = ((Rec0033)f4000[1]).m30000(var1);
      this.f6000[3] = var12;
      Integer var13 = ((Rec0033)f4000[2]).m30000(var1);
      this.f6000[4] = var13;
      Integer var14 = ((Rec0033)f4000[3]).m30000(var1);
      this.f6000[5] = var14;
   }

   static {
      ntfClinit();
   }

   public int m14000() {
      return (Integer)this.f6000[1];
   }

   public static OlIrtqjti m16000() {
      return m40000(-7623425);
   }

   public int m20000() {
      return (Integer)this.f6000[0];
   }

   private static void m22000() {
      f3000 = new boolean[]{false, true, false, true, false, false, true};
      f5000 = new boolean[]{false, false};
      f2000 = new boolean[]{false, false, true};
      f9000 = new boolean[]{false, false, false, false, false, false};
   }

   private void m24000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[3];
         Object[] var1 = this.f7000;
         var1[0] = 0;
         var1[1] = Integer.valueOf(f5000[0]);
         var1[2] = Integer.valueOf(f5000[1]);
      }

      if (OlIrtqjti<"vlfx",-271685193,1835043234,1835043235,1835043232,-271685193>(this) == null) {
         this.f6000 = new Object[6];
         Object[] var2 = this.f6000;
         var2[0] = 0;
         var2[1] = 0;
         var2[2] = 0;
         var2[3] = 0;
         var2[4] = 0;
         var2[5] = 0;
      }
   }

   private static void m26000() {
      f1000 = new float[]{3.0F, 30.0F};
   }

   public int m28000() {
      return (Integer)this.f6000[5];
   }

   public int m30000() {
      return (Integer)this.f7000[2];
   }

   public int m34000() {
      return (Integer)this.f7000[1];
   }

   private static void m38000() {
      f8000 = new Object[]{null, null, null, null, null};
      f4000 = new Object[]{null, null, null, null, -7623425, null, null};
   }

   public static OlIrtqjti m40000(int var0) {
      int var1 = var0 | 0xFF000000;
      OlIrtqjti var2 = (OlIrtqjti)f4000[5];
      if (var2 != null && (Integer)f4000[4] == var1) {
         return var2;
      } else {
         OlIrtqjti var3 = new OlIrtqjti(var1);
         Integer var8 = var1;
         f4000[4] = var8;
         f4000[5] = var3;
         return var3;
      }
   }

   public int m42000() {
      return (Integer)this.f6000[2];
   }

   public int m46000() {
      return (Integer)this.f6000[4];
   }
}
