package rw.core;

import org.lwjgl.opengl.GL33;
import rw.api.Iface0667;

public non-sealed class C0829 implements Iface0667 {
   private static byte[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;

   private static void m2000() {
      byte[] var128 = new byte[2];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 2;
   }

   public C0829(int var1) {
      this.m12000();
      Integer var6 = var1;
      this.f2000[f4000[5]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[6];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = (short)((0 | -0) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = 2;
      f4000[5] = (short)((0 | -0) >>> 31);
   }

   private static void m10000() {
      boolean[] var128 = new boolean[5];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
      f3000[3] = (boolean)((0 | -0) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[0]];
         Object[] var1 = this.f2000;
         var1[f3000[0]] = Integer.valueOf(f3000[1]);
         var1[f3000[2]] = Integer.valueOf(f3000[3]);
         var1[f1000[1]] = Integer.valueOf(f3000[4]);
      }
   }

   public void m14000(int var1, int var2) {
      if (var1 != (Integer)this.f2000[f4000[0]] || var2 != (Integer)this.f2000[f4000[1]]) {
         GL33.glUniform2i((Integer)this.f2000[f4000[2]], var1, var2);
         Integer var7 = var1;
         this.f2000[f4000[3]] = var7;
         Integer var8 = var2;
         this.f2000[f4000[4]] = var8;
      }
   }
}
