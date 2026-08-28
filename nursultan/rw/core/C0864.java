package rw.core;

import KDFzREm.NNag;
import KDFzREm.NNdF;
import KDFzREm.NNda;
import KDFzREm.NNdc;
import java.util.function.Consumer;

public class C0864 {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   public Object[] f6000;
   private static short[] f7000;
   private static byte[] f8000;

   private static void m4000() {
      boolean[] var128 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
   }

   public C0864(NNag var1, NNda var2) {
      this.m18000();
      NNdF var7 = Iltonopij.m16000();
      this.f6000[f7000[2]] = var7;
      Consumer var8 = var0 -> {};
      this.f6000[f5000[0]] = var8;
      Consumer var9 = var0 -> {};
      this.f6000[f5000[1]] = var9;
      Integer var10 = Integer.valueOf(f5000[2]);
      this.f3000[f5000[3]] = var10;
      Integer var11 = Integer.valueOf(f8000[0]);
      this.f3000[f5000[4]] = var11;
      this.f6000[f5000[5]] = var1;
      this.f6000[f5000[6]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[3];
      f7000[(0 | -0) >>> 31] = 3;
      f7000[(1 | -1) >>> 31] = 4;
      f7000[2] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[8];
      f5000[(0 | -0) >>> 31] = 3;
      f5000[(1 | -1) >>> 31] = 4;
      f5000[2] = 150;
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = 2;
      f5000[5] = (short)((1 | -1) >>> 31);
      f5000[6] = 2;
      f5000[7] = 5;
      short[] var130 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = 2;
      f2000[3] = 5;
      short[] var131 = new short[8];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = 2;
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = 2;
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = 3;
      f1000[7] = 4;
   }

   private static void m10000() {
      byte[] var128 = new byte[5];
      f8000[(0 | -0) >>> 31] = 20;
      f8000[(1 | -1) >>> 31] = 6;
      f8000[2] = 5;
      f8000[3] = 3;
      f8000[4] = 2;
   }

   public C0864 m14000(int var1, int var2) {
      Integer var7 = var1;
      this.f6000[f5000[7]] = var7;
      Integer var8 = var2;
      this.f3000[f2000[0]] = var8;
      return this;
   }

   private void m18000() {
      this.f6000 = new Object[f8000[(1 | -1) >>> 31]];
      this.f3000 = new Object[f8000[3]];
      this.f6000[f8000[2]] = Integer.valueOf(f4000[0]);
      this.f3000[f4000[(1 | -1) >>> 31]] = Integer.valueOf(f4000[2]);
      this.f3000[f4000[3]] = Integer.valueOf(f4000[4]);
      this.f3000[f8000[4]] = Integer.valueOf(f4000[5]);
   }

   public C0864 m20000(Consumer<NNdc> var1) {
      this.f6000[f7000[1]] = var1;
      return this;
   }

   public C0864 m24000(Consumer<NNdc> var1) {
      this.f6000[f7000[0]] = var1;
      return this;
   }

   public C0864 m26000(int var1, int var2) {
      Integer var7 = var1;
      this.f3000[f2000[1]] = var7;
      Integer var8 = var2;
      this.f3000[f2000[2]] = var8;
      return this;
   }

   public Iltonopij m28000() {
      return new Iltonopij(
         (Integer)this.f6000[f2000[3]],
         (Integer)this.f3000[f1000[0]],
         (Integer)this.f3000[f1000[1]],
         (Integer)this.f3000[f1000[2]],
         (NNag)this.f6000[f1000[3]],
         (NNda)this.f6000[f1000[4]],
         (NNdF)this.f6000[f1000[5]],
         (Consumer<NNdc>)this.f6000[f1000[6]],
         (Consumer<NNdc>)this.f6000[f1000[7]]
      );
   }
}
