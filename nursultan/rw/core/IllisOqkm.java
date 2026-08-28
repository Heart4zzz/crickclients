package rw.core;

import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

public class IllisOqkm {
   private static double[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   private static float[] f4000;

   private static void m8000() {
      f4000 = new float[]{0.0F, 0.0F, 0.0F, 1.0F, 0.52F, 0.76F};
      f3000 = new float[]{0.24F, 0.48F, 0.0F, 0.0F};
   }

   public IllisOqkm() {
      this.m48000();
      SplittableRandom var5 = this.m10000();
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private SplittableRandom m10000() {
      long var1 = System.nanoTime() ^ ThreadLocalRandom.current().nextLong() ^ (long)System.identityHashCode(this) << 32;
      return new SplittableRandom(this.m38000(var1));
   }

   private static void m18000() {
      f1000 = new double[]{0.5};
   }

   public void m24000() {
      SplittableRandom var5 = this.m10000();
      this.f2000[0] = var5;
      Float var6 = f4000[0];
      this.f2000[1] = var6;
      Float var7 = f4000[1];
      this.f2000[2] = var7;
   }

   public float m26000(float var1, float var2) {
      if (var2 <= var1) {
         return var1;
      } else {
         double var3 = (((SplittableRandom)this.f2000[0]).nextDouble() + ((SplittableRandom)this.f2000[0]).nextDouble()) * f1000[0];
         return var1 + (var2 - var1) * (float)var3;
      }
   }

   public float m32000(boolean var1, float var2) {
      float var3 = var1 ? (Float)this.f2000[1] : (Float)this.f2000[2];
      float var4 = var3 * this.m36000(f4000[4], f4000[5]) + this.m26000(-var2, var2) * this.m36000(f3000[0], f3000[1]);
      var4 = Math.max(-var2, Math.min(var2, var4));
      if (var1) {
         Float var9 = var4;
         this.f2000[1] = var9;
      } else {
         Float var10 = var4;
         this.f2000[2] = var10;
      }

      return var4;
   }

   public boolean m34000(float var1) {
      return (boolean)(((SplittableRandom)this.f2000[0]).nextDouble() < Math.max(f4000[2], Math.min(f4000[3], var1)) ? 1 : 0);
   }

   public float m36000(float var1, float var2) {
      return var2 <= var1 ? var1 : var1 + (var2 - var1) * (float)((SplittableRandom)this.f2000[0]).nextDouble();
   }

   private long m38000(long var1) {
      var1 ^= var1 >>> 33;
      var1 *= -49064778989728563L;
      var1 ^= var1 >>> 33;
      var1 *= -4265267296055464877L;
      return var1 ^ var1 >>> 33;
   }

   public int m40000() {
      return ((SplittableRandom)this.f2000[0]).nextBoolean() ? 1 : -1;
   }

   public int m42000(int var1, int var2) {
      return var2 <= var1 ? var1 : ((SplittableRandom)this.f2000[0]).nextInt(var1, var2 + 1);
   }

   private void m48000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
         var1[1] = f3000[2];
         var1[2] = f3000[3];
      }
   }
}
