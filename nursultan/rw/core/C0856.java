package rw.core;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;

public class C0856 {
   public Object[] f1000;
   public Object[] f2000;
   private static float[] f3000;

   public C0856 m2000(int var1) {
      Integer var6 = var1;
      this.f1000[3] = var6;
      return this;
   }

   public C0856 m4000(float var1) {
      Float var6 = var1;
      this.f2000[1] = var6;
      return this;
   }

   public float m6000() {
      return (Float)this.f2000[1];
   }

   public FloatBuffer m8000() {
      return (FloatBuffer)this.f2000[2];
   }

   public C0856() {
      this.m22000();
      Matrix4f var5 = new Matrix4f();
      this.f1000[0] = var5;
      Matrix4f var6 = new Matrix4f();
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   public float m14000() {
      return (Float)this.f2000[0];
   }

   public int m16000() {
      return (Integer)this.f1000[2];
   }

   public int m20000() {
      return (Integer)this.f1000[3];
   }

   private void m22000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[7];
         Object[] var1 = this.f1000;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = f3000[0];
         var1[5] = f3000[1];
         var1[6] = 0;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var2 = this.f2000;
         var2[0] = f3000[2];
         var2[1] = f3000[3];
      }
   }

   private static void m24000() {
      f3000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
   }

   public Matrix4f m26000() {
      return (Matrix4f)this.f1000[0];
   }

   public float m28000() {
      return (Float)this.f1000[4];
   }

   public C0856 m32000(float var1) {
      Float var6 = var1;
      this.f2000[0] = var6;
      return this;
   }

   public C0856 m34000(int var1) {
      Integer var6 = var1;
      this.f1000[2] = var6;
      return this;
   }

   public float m36000() {
      return (Float)this.f1000[5];
   }

   public C0856 m38000(float var1) {
      Float var6 = var1;
      this.f1000[5] = var6;
      return this;
   }

   public Matrix4f m42000() {
      return (Matrix4f)this.f1000[1];
   }

   public C0856 m44000(float var1) {
      Float var6 = var1;
      this.f1000[4] = var6;
      return this;
   }

   public C0856 m46000(FloatBuffer var1) {
      this.f2000[2] = var1;
      return this;
   }

   public C0856 m48000(int var1) {
      Integer var6 = var1;
      this.f1000[6] = var6;
      return this;
   }

   public int m52000() {
      return (Integer)this.f1000[6];
   }
}
