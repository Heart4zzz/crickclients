package rw.core;

import KDFzREm.NAd;
import KDFzREm.NNAf;
import KDFzREm.NNaI;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;
import rw.api.Iface0007;
import rw.defs.OlmmOsl;
import rw.gui.C0001;
import rw.gui.IlkOns;
import rw.gui.ZwBs;

public class C0039 {
   private static float[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static byte[] f6000;
   private static short[] f7000;
   private static int[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static String[] f12000;
   private static short[] f13000;
   private static byte[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static byte[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static byte[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static boolean[] f32000;
   private static byte[] f33000;
   private static short[] f34000;
   public Object[] f35000;
   private static short[] f36000;
   private static short[] f37000;
   private static short[] f38000;
   public static Object[] f39000;
   private static short[] f40000;

   private void m6000() {
      Integer var5 = Integer.valueOf(f4000[3]);
      this.f35000[f31000[1]] = var5;
      ((ByteBuffer)this.f35000[f31000[2]]).position(f4000[4]);
   }

   private static void m8000() {
      f21000 = new short[]{0, 1, 2, 512, 1};
      f11000 = new short[]{3, 512, 4};
      f17000 = new short[]{6, 7};
      f16000 = new short[]{5, 6, 7};
      f30000 = new short[]{5, 4};
      f13000 = new short[]{1, 3, 4};
      f28000 = new short[]{3, 1, 3};
      f15000 = new short[]{2, 3, 5, 3, 7, 3};
      f20000 = new short[]{0, 6};
      f40000 = new short[]{6, 2, 2};
      f23000 = new short[]{5, 4, 4, 1, 3, 1, 3, 2};
      f29000 = new short[]{3, 3, 3, 6};
      f9000 = new short[]{3, 4, 3, 7};
      f37000 = new short[]{6, 6, 1, 1, 0};
      f36000 = new short[]{0, 0, 5, 5, 1, 3, 1};
      f7000 = new short[]{3, 2, 3, 3, 3, 6, 3};
      f26000 = new short[]{4, 3, 5, 3, 7};
      f38000 = new short[]{3, 0, 3};
      f24000 = new short[]{1, 4};
      f18000 = new short[]{5, 5, 6, 7, 7};
      f22000 = new short[]{0, 0, 0};
      f10000 = new short[]{0, 6, 6, 4};
      f27000 = new short[]{4, 4, 4, 1};
      f2000 = new short[]{3, 3, 3};
      f31000 = new short[]{3, 5, 3, 255};
      f5000 = new short[]{255, 5, 3, 5};
      f34000 = new short[]{7, 6, 4096, 1024, 512};
   }

   public C0039() {
      this.m34000();
      C0028 var5 = new C0028();
      this.f35000[f21000[0]] = var5;
      ZxLn var6 = new ZxLn(this);
      this.f35000[f21000[1]] = var6;
      C0018 var7 = new C0018(this);
      this.f35000[f21000[2]] = var7;
      ByteBuffer var8 = MemoryUtil.memAlloc(f21000[3] * (Integer)C0020.f6000[f21000[4]]);
      this.f35000[f11000[0]] = var8;
      Object[] var9 = new Object[f11000[1]];
      this.f35000[f11000[2]] = var9;
      Integer var10 = Integer.valueOf(f33000[0]);
      this.f35000[f17000[0]] = var10;
      Integer var11 = Integer.valueOf(f33000[1]);
      this.f35000[f17000[1]] = var11;
   }

   static {
      ntfClinit();
   }

   private void m12000(int var1) {
      if (((Object[])this.f35000[f10000[3]]).length < var1) {
         int var2 = ((Object[])this.f35000[f27000[0]]).length;

         while (var2 < var1) {
            var2 *= f33000[6];
         }

         Object[] var8 = Arrays.copyOf((Object[])this.f35000[f27000[1]], var2);
         this.f35000[f27000[2]] = var8;
      }

      int var10 = var1 * (Integer)C0020.f6000[f27000[3]];
      if (((ByteBuffer)this.f35000[f2000[0]]).capacity() < var10) {
         int var3 = ((ByteBuffer)this.f35000[f2000[1]]).capacity();

         while (var3 < var10) {
            var3 *= f33000[7];
         }

         ByteBuffer var9 = MemoryUtil.memRealloc((ByteBuffer)this.f35000[f2000[2]], var3);
         this.f35000[f31000[0]] = var9;
      }
   }

   private static void m14000() {
      f12000 = new String[]{"Unknown payload type: {}", "u_projection", "u_view", "texture_in", "u_projection", "texture_in"};
   }

   private static void m16000() {
      f8000 = new int[]{-16777216, 16777215, 65536};
   }

   private static void m22000() {
      f1000 = new float[]{1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   void m26000() {
      if ((Integer)this.f35000[f18000[3]] != f33000[5]) {
         ((C0805)f39000[f18000[4]]).m32000(var1 -> {
            var1.m66000(f12000[1]).m18000(IlkOns.m10000());
            var1.m66000(f12000[2]).m18000(RenderSystem.getModelViewMatrix());
            var1.m10000(f12000[3]).m8000((Integer)this.f35000[f34000[0]]);
         });
      }
   }

   private void m28000() {
      ((C0805)f39000[f18000[2]]).m24000(var1 -> {
         var1.m66000(f12000[4]).m18000(IlkOns.m10000());
         var1.m10000(f12000[5]).m8000((Integer)this.f35000[f34000[1]]);
      });
   }

   private void m34000() {
      if (this.f35000 == null) {
         this.f35000 = new Object[f19000[2]];
         Object[] var1 = this.f35000;
         var1[f19000[3]] = Integer.valueOf(f3000[3]);
         var1[f19000[4]] = Integer.valueOf(f3000[4]);
         var1[f19000[5]] = Integer.valueOf(f3000[5]);
      }
   }

   private static void m38000() {
      f33000 = new byte[]{-1, -1, -1, -1, 2, -1, 2, 2};
      f6000 = new byte[]{8, 2};
      f14000 = new byte[]{8, 5, 4, 6, 6, 6, 4};
      f19000 = new byte[]{2, 7, 8, 5, 6, 7, 8};
      f25000 = new byte[]{2, 3, 2, 4, 8};
   }

   private OlmmOsl m42000(int var1) {
      int var2 = var1 >>> f14000[0] & f5000[0];
      return var2 >= ((OlmmOsl[])f39000[f5000[1]]).length ? (OlmmOsl)OlmmOsl.f7000[f5000[2]] : ((OlmmOsl[])f39000[f5000[3]])[var2];
   }

   private int m44000(OlmmOsl var1, boolean var2, boolean var3) {
      int var4 = (var1.ordinal() & f31000[3]) << f6000[0];
      if (var2) {
         var4 |= f4000[5];
      }

      if (var3) {
         var4 |= f6000[1];
      }

      return var4;
   }

   public void m46000(String var1, float var2, float var3, byte var4, OlmmOsl var5, boolean var6, int var7, int var8, int var9, byte var10) {
      this.m54000(var1, var2, var3, var4, var7, var8, this.m44000(var5, var6, var9 != 0 ? f32000[0] : f32000[1]), var9, var10);
   }

   public void m50000(ZwBs var1) {
      if ((Integer)this.f35000[f16000[0]] != 0) {
         Integer var19 = Integer.valueOf(f33000[2]);
         this.f35000[f16000[1]] = var19;
         Integer var20 = Integer.valueOf(f33000[3]);
         this.f35000[f16000[2]] = var20;

         for (int var2 = f32000[4]; var2 < this.f35000[f30000[0]]; var2++) {
            Object var3 = ((Object[])this.f35000[f30000[1]])[var2];
            if (var3 != null) {
               int var4 = var2 * (Integer)C0020.f6000[f13000[0]];
               int var5 = ((ByteBuffer)this.f35000[f13000[1]]).getInt(var4 + (Integer)C0020.f3000[f13000[2]]);
               if ((var5 & f33000[4]) != 0) {
                  float var6 = ((ByteBuffer)this.f35000[f28000[0]]).getFloat(var4 + (Integer)C0020.f3000[f28000[1]]);
                  float var7 = ((ByteBuffer)this.f35000[f28000[2]]).getFloat(var4 + (Integer)C0020.f3000[f15000[0]]);
                  int var8 = ((ByteBuffer)this.f35000[f15000[1]]).getInt(var4 + (Integer)C0020.f3000[f15000[2]]);
                  byte var9 = ((ByteBuffer)this.f35000[f15000[3]]).get(var4 + (Integer)C0020.f3000[f15000[4]]);
                  byte var10 = ((ByteBuffer)this.f35000[f15000[5]]).get(var4 + (Integer)C0020.f6000[f20000[0]]);
                  C0001 var11 = var1.m48000(this.m42000(var5));
                  int var12 = var11.m76000();
                  if (var12 != (Integer)this.f35000[f20000[1]]) {
                     this.m28000();
                     Integer var21 = var12;
                     this.f35000[f40000[0]] = var21;
                  }

                  ((C0018)this.f35000[f40000[1]]).m20000(var11, var9, var7, var8, var10);
                  this.m60000(var11, var9, var3, var6, var7, (C0018)this.f35000[f40000[2]]);
               }
            }
         }

         this.m28000();

         for (int var23 = f32000[5]; var23 < this.f35000[f23000[0]]; var23++) {
            Object var24 = ((Object[])this.f35000[f23000[1]])[var23];
            ((Object[])this.f35000[f23000[2]])[var23] = null;
            if (var24 != null) {
               int var25 = var23 * (Integer)C0020.f6000[f23000[3]];
               float var26 = ((ByteBuffer)this.f35000[f23000[4]]).getFloat(var25 + (Integer)C0020.f3000[f23000[5]]);
               float var27 = ((ByteBuffer)this.f35000[f23000[6]]).getFloat(var25 + (Integer)C0020.f3000[f23000[7]]);
               int var28 = ((ByteBuffer)this.f35000[f29000[0]]).getInt(var25 + (Integer)C0020.f3000[f29000[1]]);
               int var29 = ((ByteBuffer)this.f35000[f29000[2]]).getInt(var25 + (Integer)C0020.f3000[f29000[3]]);
               int var30 = ((ByteBuffer)this.f35000[f9000[0]]).getInt(var25 + (Integer)C0020.f3000[f9000[1]]);
               byte var31 = ((ByteBuffer)this.f35000[f9000[2]]).get(var25 + (Integer)C0020.f3000[f9000[3]]);
               C0001 var32 = var1.m48000(this.m42000(var30));
               int var33 = var32.m76000();
               if (var33 != (Integer)this.f35000[f37000[0]]) {
                  this.m28000();
                  Integer var22 = var33;
                  this.f35000[f37000[1]] = var22;
               }

               float var13 = var32.m2000() / Math.max(f32000[6], var32.m44000());
               float var14 = var32.m2000() / Math.max(f32000[7], var32.m8000());
               ((ZxLn)this.f35000[f37000[2]]).m16000(var28, var29, var13, var14);
               this.m60000(var32, var31, var24, var26, var27, (ZxLn)this.f35000[f37000[3]]);
            }
         }

         this.m6000();
         this.m28000();
         this.m26000();
      }
   }

   static int m52000(NAd var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         NNaI var2 = var0.N();
         return var2 == null ? var1 : var1 & f8000[0] | var2.N() & f8000[1];
      }
   }

   private void m54000(Object var1, float var2, float var3, byte var4, int var5, int var6, int var7, int var8, byte var9) {
      int var10 = (Integer)this.f35000[f36000[2]] + f4000[1];
      this.m12000(var10);
      int var11 = (Integer)this.f35000[f36000[3]] * (Integer)C0020.f6000[f36000[4]];
      ((ByteBuffer)this.f35000[f36000[5]]).putFloat(var11 + (Integer)C0020.f3000[f36000[6]], var2);
      ((ByteBuffer)this.f35000[f7000[0]]).putFloat(var11 + (Integer)C0020.f3000[f7000[1]], var3);
      ((ByteBuffer)this.f35000[f7000[2]]).putInt(var11 + (Integer)C0020.f3000[f7000[3]], var5);
      ((ByteBuffer)this.f35000[f7000[4]]).putInt(var11 + (Integer)C0020.f3000[f7000[5]], var6);
      ((ByteBuffer)this.f35000[f7000[6]]).putInt(var11 + (Integer)C0020.f3000[f26000[0]], var7);
      ((ByteBuffer)this.f35000[f26000[1]]).putInt(var11 + (Integer)C0020.f3000[f26000[2]], var8);
      ((ByteBuffer)this.f35000[f26000[3]]).put(var11 + (Integer)C0020.f3000[f26000[4]], var4);
      ((ByteBuffer)this.f35000[f38000[0]]).put(var11 + (Integer)C0020.f6000[f38000[1]], var9);
      ((ByteBuffer)this.f35000[f38000[2]]).position(var10 * (Integer)C0020.f6000[f24000[0]]);
      ((Object[])this.f35000[f24000[1]])[this.f35000[f18000[0]]] = var1;
      Integer var16 = var10;
      this.f35000[f18000[1]] = var16;
   }

   void m58000(float var1, float var2, float var3, float var4, int var5) {
      ((C0805)f39000[f10000[2]])
         .m38000()
         .m30000(var1)
         .m30000(var2)
         .m30000(var3)
         .m30000(var4)
         .m30000(f1000[2])
         .m30000(f1000[3])
         .m30000(f1000[4])
         .m30000(f1000[5])
         .m26000(var5)
         .m30000(f1000[6])
         .m30000(f1000[7])
         .m26000(f4000[2])
         .m28000();
   }

   private void m60000(C0001 var1, float var2, Object var3, float var4, float var5, Iface0007 var6) {
      switch (var3) {
         case String var9:
            ((C0028)this.f35000[f37000[4]]).m30000(var1, var2, f1000[0], var9, var4, var5, var6);
            break;
         case NNAf var10:
            ((C0028)this.f35000[f36000[0]]).m34000(var1, var2, f1000[1], var10, var4, var5, var6);
            break;
         default:
            ((Logger)f39000[f36000[1]]).warn(f12000[0], var3.getClass().getSimpleName());
      }
   }

   private static void m62000() {
      f39000 = new Object[]{null, 512, 1, 2, 8, null, null, null};
   }

   public void m66000(NNAf var1, float var2, float var3, byte var4, OlmmOsl var5, boolean var6, int var7, int var8, int var9, byte var10) {
      this.m54000(var1, var2, var3, var4, var7, var8, this.m44000(var5, var6, var9 != 0 ? f32000[2] : f32000[3]), var9, var10);
   }

   void m68000(C0267 var1, int var2, int var3, float var4, float var5) {
      float var6 = ((C0028)this.f35000[f22000[0]]).m26000() + (((C0028)this.f35000[f22000[1]]).m44000() - ((C0028)this.f35000[f22000[2]]).m36000());
      float var7 = ((C0028)this.f35000[f10000[0]]).m22000();
      float var8 = var6 + var1.f1000;
      float var9 = var6 + var1.f3000;
      float var10 = var7 - var1.f4000;
      float var11 = var7 - var1.f2000;
      float var12 = var1.f5000;
      float var13 = var1.f8000;
      float var14 = var1.f7000;
      float var15 = var1.f6000;
      ((C0805)f39000[f10000[1]])
         .m38000()
         .m30000(var8)
         .m30000(var10)
         .m30000(var9)
         .m30000(var11)
         .m30000(var12)
         .m30000(var13)
         .m30000(var14)
         .m30000(var15)
         .m26000(var2)
         .m30000(var4)
         .m30000(var5)
         .m26000(var3)
         .m28000();
   }

   private static void m74000() {
      f32000 = new boolean[]{true, false, true, false, false, false, true, true};
      f4000 = new boolean[]{false, true, false, false, false, true, false, false};
      f3000 = new boolean[]{false, false, true, false, false, false, true, true};
   }
}
