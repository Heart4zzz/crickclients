package rw.core;

import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class C1249 implements Iface0667 {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;

   private static void m4000() {
      boolean[] var128 = new boolean[7];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
      f4000[6] = (boolean)((0 | -0) >>> 31);
   }

   public C1249(int var1) {
      this.m6000();
      Integer var6 = var1;
      this.f2000[f5000[1]] = var6;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
         var1[f4000[0]] = Integer.valueOf(f4000[1]);
         var1[f4000[2]] = Integer.valueOf(f4000[3]);
         var1[f3000[1]] = Integer.valueOf(f4000[4]);
         var1[f3000[2]] = Integer.valueOf(f4000[5]);
         var1[f3000[3]] = Integer.valueOf(f4000[6]);
      }
   }

   private static void m10000() {
      byte[] var128 = new byte[4];
      f3000[(0 | -0) >>> 31] = 5;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
      f3000[3] = 4;
   }

   public void m12000(int var1, int var2, int var3, int var4) {
      if (var1 != (Integer)this.f2000[f1000[0]]
         || var2 != (Integer)this.f2000[f1000[1]]
         || var3 != (Integer)this.f2000[f1000[2]]
         || var4 != (Integer)this.f2000[f1000[3]]) {
         GL33.glUniform4i((Integer)this.f2000[f1000[4]], var1, var2, var3, var4);
         Integer var9 = var1;
         this.f2000[f1000[5]] = var9;
         Integer var10 = var2;
         this.f2000[f1000[6]] = var10;
         Integer var11 = var3;
         this.f2000[f1000[7]] = var11;
         Integer var12 = var4;
         this.f2000[f5000[0]] = var12;
      }
   }

   private static void m16000() {
      short[] var128 = new short[8];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 3;
      f1000[3] = 4;
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
      f1000[6] = 2;
      f1000[7] = 3;
      short[] var129 = new short[2];
      f5000[(0 | -0) >>> 31] = 4;
      f5000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }
}
