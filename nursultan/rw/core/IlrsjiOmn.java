package rw.core;

import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class IlrsjiOmn implements Iface0667 {
   private static short[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;
   private static byte[] f4000;

   private static void m2000() {
      boolean[] var128 = new boolean[6];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((0 | -0) >>> 31);
      f2000[5] = (boolean)((0 | -0) >>> 31);
   }

   public IlrsjiOmn(int var1) {
      this.m8000();
      Integer var6 = var1;
      this.f3000[f1000[7]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      byte[] var128 = new byte[3];
      f4000[(0 | -0) >>> 31] = 4;
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
   }

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f4000[0]];
         Object[] var1 = this.f3000;
         var1[f2000[0]] = Integer.valueOf(f2000[1]);
         var1[f2000[2]] = Integer.valueOf(f2000[3]);
         var1[f4000[1]] = Integer.valueOf(f2000[4]);
         var1[f4000[2]] = Integer.valueOf(f2000[5]);
      }
   }

   public void m14000(int var1, int var2, int var3) {
      if (var1 != (Integer)this.f3000[f1000[0]] || var2 != (Integer)this.f3000[f1000[1]] || var3 != (Integer)this.f3000[f1000[2]]) {
         GL33.glUniform3i((Integer)this.f3000[f1000[3]], var1, var2, var3);
         Integer var8 = var1;
         this.f3000[f1000[4]] = var8;
         Integer var9 = var2;
         this.f3000[f1000[5]] = var9;
         Integer var10 = var3;
         this.f3000[f1000[6]] = var10;
      }
   }

   private static void m16000() {
      short[] var128 = new short[8];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = 2;
      f1000[2] = 3;
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((1 | -1) >>> 31);
      f1000[5] = 2;
      f1000[6] = 3;
      f1000[7] = (short)((0 | -0) >>> 31);
   }
}
