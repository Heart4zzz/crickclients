package rw.module;

import KDFzREm.NNBK;
import KDFzREm.NQo;
import rw.Module;

public class ShulkerPreview extends Module {
   public static Object[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static byte[] f6000;
   public Object[] f7000;

   public NQo m2000() {
      this.m10000();
      return (NQo)this.f7000[f2000[2]];
   }

   private static void m6000() {
      short[] var128 = new short[8];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = (short)((0 | -0) >>> 31);
      f5000[5] = 2;
      f5000[6] = (short)((0 | -0) >>> 31);
      f5000[7] = 3;
      short[] var129 = new short[7];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((1 | -1) >>> 31);
      f2000[3] = 2;
      f2000[4] = 3;
      f2000[5] = (short)((0 | -0) >>> 31);
      f2000[6] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[2];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 3;
   }

   public ShulkerPreview() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[3];
      f6000[(0 | -0) >>> 31] = 4;
      f6000[(1 | -1) >>> 31] = 2;
      f6000[2] = 3;
   }

   private void m10000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[f6000[0]];
         Object[] var1 = this.f7000;
         var1[f6000[1]] = Integer.valueOf(f4000[1]);
         var1[f6000[2]] = Integer.valueOf(f4000[2]);
      }
   }

   public int m12000() {
      this.m10000();
      return (Integer)this.f7000[f2000[3]];
   }

   private static void m16000() {
      f1000 = new Object[f4000[3]];
   }

   private static void m18000() {
      boolean[] var128 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
   }

   public NNBK m22000() {
      this.m10000();
      return (NNBK)this.f7000[f2000[1]];
   }

   public ShulkerPreview m24000(int var1) {
      this.m10000();
      Integer var6 = var1;
      this.f7000[f3000[1]] = var6;
      return this;
   }

   public ShulkerPreview m26000(NQo var1) {
      this.m10000();
      this.f7000[f2000[6]] = var1;
      return this;
   }

   public ShulkerPreview m28000(int var1) {
      this.m10000();
      Integer var6 = var1;
      this.f7000[f3000[0]] = var6;
      return this;
   }

   public static ShulkerPreview m30000(NNBK var0, NQo var1, int var2, int var3) {
      ((ShulkerPreview)f1000[f5000[0]]).f7000[f5000[1]] = var0;
      ((ShulkerPreview)f1000[f5000[2]]).f7000[f5000[3]] = var1;
      ShulkerPreview var10000 = (ShulkerPreview)f1000[f5000[4]];
      Integer var10 = var2;
      var10000.f7000[f5000[5]] = var10;
      var10000 = (ShulkerPreview)f1000[f5000[6]];
      Integer var11 = var3;
      var10000.f7000[f5000[7]] = var11;
      return (ShulkerPreview)f1000[f2000[0]];
   }

   public ShulkerPreview m32000(NNBK var1) {
      this.m10000();
      this.f7000[f2000[5]] = var1;
      return this;
   }

   public int m38000() {
      this.m10000();
      return (Integer)this.f7000[f2000[4]];
   }
}
