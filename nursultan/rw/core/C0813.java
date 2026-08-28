package rw.core;

import org.lwjgl.opengl.GL33;

public class C0813 {
   public Object[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static long[] f5000;
   private static byte[] f6000;
   private static int[] f7000;
   private static short[] f8000;

   public void m2000(int var1) {
      GL33.glQueryCounter(((int[])this.f1000[f3000[3]])[var1], f7000[1]);
      ((boolean[])this.f1000[f3000[4]])[var1] = f4000[0];
   }

   private static void m4000() {
      short[] var128 = new short[3];
      f8000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f8000[2] = 2;
      short[] var129 = new short[7];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      f3000[4] = 2;
      f3000[5] = 2;
      f3000[6] = 2;
      short[] var130 = new short[8];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = 3;
      f2000[3] = 3;
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((1 | -1) >>> 31);
      f2000[6] = 2;
      f2000[7] = 2;
   }

   private static void m8000() {
      int[] var128 = new int[4];
      f7000[(0 | -0) >>> 31] = 36392;
      f7000[(1 | -1) >>> 31] = 36392;
      f7000[2] = 34918;
      f7000[3] = 34918;
   }

   public C0813(int var1) {
      this.m32000();
      int[] var6 = new int[var1];
      this.f1000[f8000[0]] = var6;
      int[] var7 = new int[var1];
      this.f1000[f8000[1]] = var7;
      boolean[] var8 = new boolean[var1];
      this.f1000[f8000[2]] = var8;
      GL33.glGenQueries((int[])this.f1000[f3000[0]]);
      GL33.glGenQueries((int[])this.f1000[f3000[1]]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      byte[] var128 = new byte[2];
      f6000[(0 | -0) >>> 31] = 4;
      f6000[(1 | -1) >>> 31] = 3;
   }

   private static void m18000() {
      boolean[] var128 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
   }

   private static void m20000() {
      long[] var128 = new long[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = -1L;
   }

   public void m22000(int var1) {
      GL33.glQueryCounter(((int[])this.f1000[f3000[2]])[var1], f7000[0]);
   }

   public void m24000() {
      if (!(Boolean)this.f1000[f2000[2]]) {
         Boolean var6 = f4000[2];
         this.f1000[f2000[3]] = var6;
         GL33.glDeleteQueries((int[])this.f1000[f2000[4]]);
         GL33.glDeleteQueries((int[])this.f1000[f2000[5]]);

         for (int var1 = f4000[3]; var1 < ((boolean[])this.f1000[f2000[6]]).length; var1++) {
            ((boolean[])this.f1000[f2000[7]])[var1] = f4000[4];
         }
      }
   }

   public long m26000(int var1) {
      if (!((boolean[])this.f1000[f3000[5]])[var1]) {
         return f5000[0];
      } else {
         ((boolean[])this.f1000[f3000[6]])[var1] = f4000[1];
         long var2 = GL33.glGetQueryObjectui64(((int[])this.f1000[f2000[0]])[var1], f7000[2]);
         long var4 = GL33.glGetQueryObjectui64(((int[])this.f1000[f2000[1]])[var1], f7000[3]);
         return var4 - var2;
      }
   }

   private void m32000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f6000[0]];
         Object[] var1 = this.f1000;
         var1[f6000[1]] = f4000[5];
      }
   }
}
