package rw.data;

import java.lang.runtime.ObjectMethods;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public record Rec0233() {
   public Vector4fc f1000;
   private static boolean[] f2000;
   public Vector4fc f3000;
   private static float[] f4000;

   public float m2000() {
      return this.f3000.x();
   }

   public Rec0236 m4000() {
      return new Rec0236(this.m2000(), this.m14000(), this.m2000() + this.m28000(), this.m14000() + this.m18000());
   }

   public Rec0233(float var1, float var2, float var3, float var4, Vector4fc var5) {
      this(new Vector4f(var1, var2, var3, var4), var5);
   }

   public Rec0233(Vector4fc var1, Vector4fc var2) {
      Vector4f var3 = new Vector4f(var1);
      Vector4f var4 = new Vector4f(var2);
      this.f3000 = var3;
      this.f1000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0233,"rect;round",Rec0233::f3000,Rec0233::f1000>(this, var1);
   }

   private static void m8000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(953267991);
   }

   private static void m10000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public Vector4fc m12000() {
      return this.f3000;
   }

   public float m14000() {
      return this.f3000.y();
   }

   public float m18000() {
      return this.f3000.w();
   }

   public Rec0233 m20000(Rec0233 var1) {
      Rec0236 var2 = this.m4000().m16000(var1.m4000());
      if (var2 == null) {
         return null;
      } else {
         Vector4f var3 = new Vector4f();
         m26000(this, var2, var3);
         m26000(var1, var2, var3);
         return new Rec0233(var2.m2000(), var2.m10000(), var2.m8000(), var2.m20000(), var3);
      }
   }

   private static boolean m22000(float var0, float var1) {
      return Math.abs(var0 - var1) <= f4000[0] ? f2000[0] : f2000[1];
   }

   private static void m26000(Rec0233 var0, Rec0236 var1, Vector4f var2) {
      float var3 = var0.m2000();
      float var4 = var0.m14000();
      float var5 = var3 + var0.m28000();
      float var6 = var4 + var0.m18000();
      if (m22000(var1.m2000(), var3) && m22000(var1.m10000(), var4)) {
         var2.w = Math.max(var2.w, var0.m30000().w());
      }

      if (m22000(var1.m12000(), var5) && m22000(var1.m10000(), var4)) {
         var2.z = Math.max(var2.z, var0.m30000().z());
      }

      if (m22000(var1.m2000(), var3) && m22000(var1.m14000(), var6)) {
         var2.y = Math.max(var2.y, var0.m30000().y());
      }

      if (m22000(var1.m12000(), var5) && m22000(var1.m14000(), var6)) {
         var2.x = Math.max(var2.x, var0.m30000().x());
      }
   }

   public float m28000() {
      return this.f3000.z();
   }

   public Vector4fc m30000() {
      return this.f1000;
   }
}
