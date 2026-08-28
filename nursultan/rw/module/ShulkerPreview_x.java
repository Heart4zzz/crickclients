package rw.module;

import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.Nkq;
import rw.Module;

public class ShulkerPreview_x extends Module {
   private static short[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   public Object[] f5000;
   public static Object[] f6000;
   private static short[] f7000;

   public NYj m2000() {
      this.m14000();
      return (NYj)this.f5000[f1000[3]];
   }

   public Nkq m6000() {
      this.m14000();
      return (Nkq)this.f5000[f1000[4]];
   }

   public ShulkerPreview_x() {
      this.m14000();
   }

   static {
      ntfClinit();
   }

   public int m8000() {
      this.m14000();
      return (Integer)this.f5000[f1000[1]];
   }

   private static void m10000() {
      short[] var128 = new short[5];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[2] = (short)((0 | -0) >>> 31);
      f7000[3] = (short)((1 | -1) >>> 31);
      f7000[4] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[8];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = 2;
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = 4;
      f2000[5] = (short)((0 | -0) >>> 31);
      f2000[6] = 5;
      f2000[7] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[6];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = 2;
      f1000[3] = 3;
      f1000[4] = 4;
      f1000[5] = 5;
   }

   public NkG m12000() {
      this.m14000();
      return (NkG)this.f5000[f1000[5]];
   }

   private void m14000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f3000[0]];
         Object[] var1 = this.f5000;
         var1[f4000[1]] = Integer.valueOf(f4000[2]);
         var1[f4000[3]] = Integer.valueOf(f4000[4]);
         var1[f3000[1]] = Integer.valueOf(f4000[5]);
      }
   }

   private static void m16000() {
      byte[] var128 = new byte[2];
      f3000[(0 | -0) >>> 31] = 6;
      f3000[(1 | -1) >>> 31] = 2;
   }

   public int m20000() {
      this.m14000();
      return (Integer)this.f5000[f1000[0]];
   }

   private static void m22000() {
      f6000 = new Object[f4000[6]];
   }

   public static ShulkerPreview_x m24000(int var0, int var1, int var2, NYj var3, Nkq var4, NkG var5) {
      ShulkerPreview_x var10000 = (ShulkerPreview_x)f6000[f7000[0]];
      Integer var10 = var0;
      var10000.f5000[f7000[1]] = var10;
      var10000 = (ShulkerPreview_x)f6000[f7000[2]];
      Integer var11 = var1;
      var10000.f5000[f7000[3]] = var11;
      ((ShulkerPreview_x)f6000[f7000[4]]).f5000[f2000[0]] = var3;
      var10000 = (ShulkerPreview_x)f6000[f2000[1]];
      Integer var13 = var2;
      var10000.f5000[f2000[2]] = var13;
      ((ShulkerPreview_x)f6000[f2000[3]]).f5000[f2000[4]] = var4;
      ((ShulkerPreview_x)f6000[f2000[5]]).f5000[f2000[6]] = var5;
      return (ShulkerPreview_x)f6000[f2000[7]];
   }

   private static void m26000() {
      boolean[] var128 = new boolean[7];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((1 | -1) >>> 31);
   }

   public int m28000() {
      this.m14000();
      return (Integer)this.f5000[f1000[2]];
   }
}
