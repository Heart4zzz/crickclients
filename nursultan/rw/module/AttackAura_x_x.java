package rw.module;

import KDFzREm.gB;
import rw.Module;

public class AttackAura_x_x extends Module {
   private static short[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   public Object[] f5000;
   private static short[] f6000;
   public static Object[] f7000;
   private static byte[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static boolean[] f11000;
   private static short[] f12000;

   public AttackAura_x_x m2000(boolean var1) {
      this.m26000();
      Boolean var6 = var1;
      this.f5000[f4000[2]] = var6;
      return this;
   }

   public boolean m6000() {
      this.m26000();
      return (Boolean)this.f5000[f10000[3]];
   }

   public boolean m8000() {
      this.m26000();
      return (Boolean)this.f5000[f10000[0]];
   }

   public AttackAura_x_x m10000(boolean var1) {
      this.m26000();
      Boolean var6 = var1;
      this.f5000[f4000[6]] = var6;
      return this;
   }

   private static void m12000() {
      f7000 = new Object[f2000[2]];
   }

   public AttackAura_x_x() {
      this.m26000();
   }

   static {
      ntfClinit();
   }

   public boolean m14000() {
      this.m26000();
      return (Boolean)this.f5000[f10000[5]];
   }

   public AttackAura_x_x m16000(boolean var1) {
      this.m26000();
      Boolean var6 = var1;
      this.f5000[f4000[0]] = var6;
      return this;
   }

   public boolean m18000() {
      this.m26000();
      return (Boolean)this.f5000[f10000[2]];
   }

   public boolean m20000() {
      this.m26000();
      return (Boolean)this.f5000[f1000[1]];
   }

   public AttackAura_x_x m22000(boolean var1) {
      this.m26000();
      Boolean var6 = var1;
      this.f5000[f4000[4]] = var6;
      return this;
   }

   private static void m24000() {
      short[] var128 = new short[8];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((0 | -0) >>> 31);
      f6000[3] = (short)((1 | -1) >>> 31);
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = 2;
      f6000[6] = (short)((0 | -0) >>> 31);
      f6000[7] = 3;
      short[] var129 = new short[4];
      f12000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f12000[(1 | -1) >>> 31] = 4;
      f12000[2] = (short)((0 | -0) >>> 31);
      f12000[3] = 5;
      short[] var130 = new short[3];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = 6;
      f3000[2] = (short)((0 | -0) >>> 31);
      short[] var131 = new short[6];
      f9000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[2] = (short)((0 | -0) >>> 31);
      f9000[3] = (short)((0 | -0) >>> 31);
      f9000[4] = (short)((0 | -0) >>> 31);
      f9000[5] = (short)((0 | -0) >>> 31);
      short[] var132 = new short[2];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var133 = new short[6];
      f10000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f10000[(1 | -1) >>> 31] = 2;
      f10000[2] = 3;
      f10000[3] = 4;
      f10000[4] = 5;
      f10000[5] = 6;
      short[] var134 = new short[7];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[2] = 2;
      f4000[3] = 3;
      f4000[4] = 4;
      f4000[5] = 5;
      f4000[6] = 6;
   }

   private void m26000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f8000[0]];
         Object[] var1 = this.f5000;
         var1[f11000[1]] = f11000[2];
         var1[f11000[3]] = f11000[4];
         var1[f8000[1]] = f11000[5];
         var1[f8000[2]] = f11000[6];
         var1[f8000[3]] = f11000[7];
         var1[f8000[4]] = f2000[0];
         var1[f8000[5]] = f2000[1];
      }
   }

   public gB m28000() {
      return new gB(
         ((AttackAura_x_x)f7000[f9000[0]]).m20000(),
         ((AttackAura_x_x)f7000[f9000[1]]).m8000(),
         ((AttackAura_x_x)f7000[f9000[2]]).m32000(),
         ((AttackAura_x_x)f7000[f9000[3]]).m18000(),
         ((AttackAura_x_x)f7000[f9000[4]]).m6000(),
         ((AttackAura_x_x)f7000[f9000[5]]).m44000(),
         ((AttackAura_x_x)f7000[f1000[0]]).m14000()
      );
   }

   public boolean m32000() {
      this.m26000();
      return (Boolean)this.f5000[f10000[1]];
   }

   public AttackAura_x_x m34000(boolean var1) {
      this.m26000();
      Boolean var6 = var1;
      this.f5000[f4000[1]] = var6;
      return this;
   }

   public AttackAura_x_x m36000(boolean var1) {
      this.m26000();
      Boolean var6 = var1;
      this.f5000[f4000[5]] = var6;
      return this;
   }

   private static void m38000() {
      boolean[] var128 = new boolean[8];
      f11000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[2] = (boolean)((0 | -0) >>> 31);
      f11000[3] = (boolean)((1 | -1) >>> 31);
      f11000[4] = (boolean)((0 | -0) >>> 31);
      f11000[5] = (boolean)((0 | -0) >>> 31);
      f11000[6] = (boolean)((0 | -0) >>> 31);
      f11000[7] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[3];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
   }

   public static AttackAura_x_x m40000(boolean var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      AttackAura_x_x var10000 = (AttackAura_x_x)f7000[f6000[0]];
      Boolean var11 = var0;
      var10000.f5000[f6000[1]] = var11;
      var10000 = (AttackAura_x_x)f7000[f6000[2]];
      Boolean var12 = var1;
      var10000.f5000[f6000[3]] = var12;
      var10000 = (AttackAura_x_x)f7000[f6000[4]];
      Boolean var13 = var2;
      var10000.f5000[f6000[5]] = var13;
      var10000 = (AttackAura_x_x)f7000[f6000[6]];
      Boolean var14 = var3;
      var10000.f5000[f6000[7]] = var14;
      var10000 = (AttackAura_x_x)f7000[f12000[0]];
      Boolean var15 = var4;
      var10000.f5000[f12000[1]] = var15;
      var10000 = (AttackAura_x_x)f7000[f12000[2]];
      Boolean var16 = var5;
      var10000.f5000[f12000[3]] = var16;
      var10000 = (AttackAura_x_x)f7000[f3000[0]];
      Boolean var17 = var6;
      var10000.f5000[f3000[1]] = var17;
      return (AttackAura_x_x)f7000[f3000[2]];
   }

   private static void m42000() {
      byte[] var128 = new byte[6];
      f8000[(0 | -0) >>> 31] = 7;
      f8000[(1 | -1) >>> 31] = 2;
      f8000[2] = 3;
      f8000[3] = 4;
      f8000[4] = 5;
      f8000[5] = 6;
   }

   public boolean m44000() {
      this.m26000();
      return (Boolean)this.f5000[f10000[4]];
   }

   public AttackAura_x_x m46000(boolean var1) {
      this.m26000();
      Boolean var6 = var1;
      this.f5000[f4000[3]] = var6;
      return this;
   }
}
