package rw.core;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class IlpOkkIjl {
   public Object[] f1000;
   public Object[] f2000;
   public Object[] f3000;
   private static float[] f4000;

   public IlpOkkIjl m2000(int var1) {
      Integer var6 = var1;
      this.f1000[4] = var6;
      return this;
   }

   public IlpOkkIjl m4000(float var1) {
      Float var6 = var1;
      this.f1000[2] = var6;
      return this;
   }

   public float m6000() {
      return (Float)this.f1000[1];
   }

   public float m10000() {
      return (Float)this.f1000[3];
   }

   private void m14000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[2];
         Object[] var1 = this.f3000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[6];
         Object[] var2 = this.f2000;
         var2[0] = 0;
         var2[1] = 0;
         var2[2] = 0;
         var2[3] = 0;
         var2[4] = f4000[0];
         var2[5] = f4000[1];
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var3 = this.f1000;
         var3[0] = f4000[2];
         var3[1] = f4000[3];
         var3[2] = f4000[4];
         var3[3] = f4000[5];
         var3[4] = 0;
      }
   }

   public IlpOkkIjl() {
      this.m14000();
      Matrix4f var5 = new Matrix4f();
      this.f3000[0] = var5;
      Matrix4f var6 = new Matrix4f();
      this.f3000[1] = var6;
   }

   static {
      ntfClinit();
   }

   public int m18000() {
      return (Integer)this.f2000[2];
   }

   public int m20000() {
      return (Integer)this.f2000[0];
   }

   public IlpOkkIjl m24000(int var1) {
      Integer var6 = var1;
      this.f2000[2] = var6;
      return this;
   }

   public int m26000() {
      return (Integer)this.f2000[3];
   }

   public IlpOkkIjl m28000(float var1) {
      Float var6 = var1;
      this.f1000[3] = var6;
      return this;
   }

   private static void m32000() {
      f4000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public float m34000() {
      return (Float)this.f2000[5];
   }

   public float m38000() {
      return (Float)this.f1000[2];
   }

   public Matrix4f m40000() {
      return (Matrix4f)this.f3000[0];
   }

   public IlpOkkIjl m42000(float var1) {
      Float var6 = var1;
      this.f2000[4] = var6;
      return this;
   }

   public float m44000() {
      return (Float)this.f1000[0];
   }

   public IlpOkkIjl m46000(int var1) {
      Integer var6 = var1;
      this.f2000[3] = var6;
      return this;
   }

   public IlpOkkIjl m48000(int var1) {
      Integer var6 = var1;
      this.f2000[0] = var6;
      return this;
   }

   public IlpOkkIjl m50000(float var1) {
      Float var6 = var1;
      this.f1000[0] = var6;
      return this;
   }

   public Matrix4f m52000() {
      return (Matrix4f)this.f3000[1];
   }

   public float m54000() {
      return (Float)this.f2000[4];
   }

   public IlpOkkIjl m56000(FloatBuffer var1) {
      this.f1000[5] = var1;
      return this;
   }

   public IlpOkkIjl m58000(float var1) {
      Float var6 = var1;
      this.f1000[1] = var6;
      return this;
   }

   public IlpOkkIjl m60000(int var1) {
      Integer var6 = var1;
      this.f2000[1] = var6;
      return this;
   }

   public int m62000() {
      return (Integer)this.f1000[4];
   }

   public FloatBuffer m64000() {
      return (FloatBuffer)this.f1000[5];
   }

   public IlpOkkIjl m66000(float var1) {
      Float var6 = var1;
      this.f2000[5] = var6;
      return this;
   }

   public int m70000() {
      return (Integer)this.f2000[1];
   }
}
