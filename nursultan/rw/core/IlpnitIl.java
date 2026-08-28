package rw.core;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.lwjgl.opengl.GL11;
import rw.api.Iface0003;
import rw.api.Iface0006;

public class IlpnitIl implements Iface0006 {
   private static short[] f1000;
   private static boolean[] f2000;
   private static byte[] f3000;
   public Object[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;
   private static int[] f7000;

   @Override
   public Iface0003 m2000() {
      return null;
   }

   private static void m6000() {
      boolean[] var128 = new boolean[7];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((0 | -0) >>> 31);
      f2000[5] = (boolean)((0 | -0) >>> 31);
      f2000[6] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[2];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public IlpnitIl(int var1, int var2, int var3) {
      this.m10000();
      Integer var8 = var1;
      this.f4000[f5000[0]] = var8;
      Integer var9 = var2;
      this.f4000[f5000[1]] = var9;
      Integer var10 = var3;
      this.f4000[f5000[2]] = var10;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[2];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 2;
   }

   private void m10000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[0]];
         Object[] var1 = this.f4000;
         var1[f2000[4]] = Integer.valueOf(f2000[5]);
         var1[f2000[6]] = Integer.valueOf(f6000[0]);
         var1[f3000[1]] = Integer.valueOf(f6000[1]);
      }
   }

   public int m12000() {
      return (Integer)this.f4000[f5000[5]];
   }

   private static void m14000() {
      int[] var128 = new int[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = 36160;
   }

   private static void m16000() {
      short[] var128 = new short[8];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = 2;
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = 2;
      f5000[5] = (short)((0 | -0) >>> 31);
      f5000[6] = (short)((0 | -0) >>> 31);
      f5000[7] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[3];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = 16384;
      f1000[2] = 256;
   }

   @Override
   public int m18000() {
      return (Integer)this.f4000[f5000[4]];
   }

   public void m22000() {
   }

   public void m28000(boolean var1) {
      GlStateManager._glBindFramebuffer(f7000[0], (Integer)this.f4000[f5000[6]]);
      if (var1) {
         GL11.glViewport(f2000[0], f2000[1], (Integer)this.f4000[f5000[7]], (Integer)this.f4000[f1000[0]]);
      }
   }

   public Iface0003 m30000() {
      return null;
   }

   public void m32000(boolean var1, boolean var2) {
      this.m28000(f2000[2]);
      short var3 = f2000[3];
      if (var1) {
         var3 |= f1000[1];
      }

      if (var2) {
         var3 |= f1000[2];
      }

      if (var3 != 0) {
         GL11.glClear(var3);
      }
   }

   public int m34000() {
      return (Integer)this.f4000[f5000[3]];
   }
}
