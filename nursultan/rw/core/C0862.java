package rw.core;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class C0862 {
   public Object[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   public Object[] f4000;

   public Matrix4f m2000() {
      return (Matrix4f)this.f4000[2];
   }

   public C0862 m4000(float var1) {
      Float var6 = var1;
      this.f1000[1] = var6;
      return this;
   }

   public C0862 m6000(int var1) {
      Integer var6 = var1;
      this.f1000[3] = var6;
      return this;
   }

   public Matrix4f m8000() {
      return (Matrix4f)this.f4000[1];
   }

   private static void m12000() {
      f3000 = new float[]{0.0F, 0.0F, 0.0F};
   }

   public C0862() {
      this.m26000();
      Matrix4f var5 = new Matrix4f();
      this.f4000[0] = var5;
      Matrix4f var6 = new Matrix4f();
      this.f4000[1] = var6;
      Matrix4f var7 = new Matrix4f();
      this.f4000[2] = var7;
      Matrix4f var8 = new Matrix4f();
      this.f2000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public FloatBuffer m18000() {
      return (FloatBuffer)this.f1000[5];
   }

   public int m20000() {
      return (Integer)this.f1000[3];
   }

   public int m24000() {
      return (Integer)this.f2000[1];
   }

   private void m26000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[3];
         Object[] var1 = this.f4000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var2 = this.f2000;
         var2[1] = 0;
         var2[2] = 0;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var3 = this.f1000;
         var3[0] = f3000[0];
         var3[1] = f3000[1];
         var3[2] = f3000[2];
         var3[3] = 0;
         var3[4] = 0;
      }
   }

   public int m30000() {
      return (Integer)this.f1000[4];
   }

   public int m32000() {
      return (Integer)this.f2000[2];
   }

   public float m34000() {
      return (Float)this.f1000[2];
   }

   public C0862 m36000(int var1) {
      Integer var6 = var1;
      this.f2000[1] = var6;
      return this;
   }

   public C0862 m38000(int var1) {
      Integer var6 = var1;
      this.f2000[2] = var6;
      return this;
   }

   public C0862 m40000(float var1) {
      Float var6 = var1;
      this.f1000[2] = var6;
      return this;
   }

   public float m42000() {
      return (Float)this.f1000[0];
   }

   public Matrix4f m44000() {
      return (Matrix4f)this.f2000[0];
   }

   public float m46000() {
      return (Float)this.f1000[1];
   }

   public C0862 m48000(float var1) {
      Float var6 = var1;
      this.f1000[0] = var6;
      return this;
   }

   public C0862 m50000(int var1) {
      Integer var6 = var1;
      this.f1000[4] = var6;
      return this;
   }

   public C0862 m52000(FloatBuffer var1) {
      this.f1000[5] = var1;
      return this;
   }

   public Matrix4f m58000() {
      return (Matrix4f)this.f4000[0];
   }
}
