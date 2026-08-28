package rw.core;

import rw.api.Iface0211;

public final class C0347 implements Iface0211 {
   private final rw.setting.C0059 f1000;
   private float f2000;
   private float f3000;
   private float f4000;
   private float f5000;
   private float f6000;
   private float f7000;
   private float f8000;
   private float f9000;
   private float f10000;
   private float f11000;
   private float f12000;
   private float f13000;
   private int f14000;
   private float f15000;
   private String f16000 = "";
   private float f17000;
   private float f18000;
   private int f19000;
   private float f20000;
   private float f21000;
   private float f22000;
   private float f23000;
   private int f24000 = -1;
   private boolean f25000;
   private Object f26000;

   private void m2000() {
      this.f19000++;
      this.f1000.m52000();
   }

   public void m4000(float var1) {
      float var2 = Math.max(0.0F, var1);
      if (!m12000(this.f5000, var2)) {
         this.f5000 = var2;
         this.m2000();
      }
   }

   public void m6000(float var1, float var2) {
      if (!m12000(this.f2000, var1) || !m12000(this.f3000, var2)) {
         this.f2000 = var1;
         this.f3000 = var2;
         this.m2000();
      }
   }

   @Override
   public float m8000() {
      return this.f3000;
   }

   @Override
   public float m10000() {
      return this.f11000;
   }

   private static boolean m12000(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   @Override
   public float m14000() {
      return this.f18000;
   }

   public boolean m16000() {
      return this.f25000;
   }

   C0347(rw.setting.C0059 var1) {
      this.f1000 = var1;
   }

   public float m18000() {
      return this.f12000;
   }

   public float m20000() {
      return this.f13000;
   }

   public float m22000() {
      return this.f5000;
   }

   public void m24000(float var1, float var2) {
      float var3 = Math.max(0.0F, C0259.m2000(var1, var2));
      float var4 = C0259.m8000(this.f17000, 0.0F, var3);
      if (!m12000(this.f18000, var3) || !m12000(this.f17000, var4)) {
         this.f18000 = var3;
         this.f17000 = var4;
         this.m2000();
      }
   }

   public float m26000() {
      return this.f20000;
   }

   public int m28000() {
      return this.f24000;
   }

   public float m30000() {
      return this.f23000;
   }

   public float m32000() {
      return this.f8000;
   }

   public float m34000() {
      return this.f9000;
   }

   public float m36000() {
      return this.f17000;
   }

   public float m38000() {
      return this.f6000;
   }

   public float m40000() {
      return this.f22000;
   }

   public float m42000() {
      return this.f21000;
   }

   public float m44000() {
      return this.f15000;
   }

   public int m46000() {
      return this.f14000;
   }

   public float m48000() {
      return this.f4000;
   }

   public void m50000(float var1, float var2) {
      this.f8000 = var1;
      this.f9000 = var2;
   }

   private float m52000(float var1) {
      return C0259.m8000(var1, 0.0F, this.f18000);
   }

   public void m54000(float var1, float var2) {
      float var3 = Math.max(0.0F, var1);
      float var4 = Math.max(0.0F, var2);
      if (!m12000(this.f4000, var3) || !m12000(this.f5000, var4)) {
         this.f4000 = var3;
         this.f5000 = var4;
         this.m2000();
      }
   }

   public void m56000(float var1) {
      float var2 = Math.max(0.0F, var1);
      if (!m12000(this.f4000, var2)) {
         this.f4000 = var2;
         this.m2000();
      }
   }

   public float m58000() {
      return this.f2000;
   }

   public String m60000() {
      return this.f16000;
   }

   public void m62000(float var1, float var2, float var3, float var4, int var5, boolean var6) {
      this.f20000 = var1;
      this.f21000 = var2;
      this.f22000 = var3;
      this.f23000 = var4;
      this.f24000 = var5;
      this.f25000 = var6;
   }

   public void m64000(float var1) {
      this.f15000 = var1;
   }

   public void m66000(float var1, float var2, float var3, float var4) {
      float var5 = Math.max(0.0F, var3);
      float var6 = Math.max(0.0F, var4);
      if (!m12000(this.f10000, var1) || !m12000(this.f11000, var2) || !m12000(this.f12000, var5) || !m12000(this.f13000, var6)) {
         this.f10000 = var1;
         this.f11000 = var2;
         this.f12000 = var5;
         this.f13000 = var6;
         this.m2000();
      }
   }

   public Object m68000() {
      return this.f26000;
   }

   public void m70000(String var1) {
      String var2 = var1 == null ? "" : var1;
      if (!this.f16000.equals(var2)) {
         this.f16000 = var2;
         this.m2000();
      }
   }

   public void m72000(float var1, float var2) {
      this.f6000 = Math.max(0.0F, var1);
      this.f7000 = Math.max(0.0F, var2);
   }

   public void m74000(Object var1) {
      this.f26000 = var1;
   }

   public void m76000(int var1) {
      if (this.f14000 != var1) {
         this.f14000 = var1;
         this.m2000();
         this.f1000.m184000();
      }
   }

   public int m78000() {
      return this.f19000;
   }

   public float m80000() {
      return this.f10000;
   }

   public boolean m82000(float var1, float var2) {
      float var3 = C0259.m2000(var1, var2);
      float var4 = this.m52000(var3);
      if (m12000(this.f17000, var4)) {
         return false;
      } else {
         this.f17000 = var4;
         this.m2000();
         return true;
      }
   }

   public float m84000() {
      return this.f7000;
   }
}
