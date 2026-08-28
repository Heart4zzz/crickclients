package rw.core;

public final class C0350 {
   private final rw.setting.C0025 f1000;
   private int f2000;
   private int f3000;
   private int f4000;
   private int f5000;
   private boolean f6000;

   public int m2000() {
      return this.f4000;
   }

   public float m4000() {
      return (float)this.f3000 / this.f1000.m2000();
   }

   C0350(rw.setting.C0025 var1) {
      this.f1000 = var1;
   }

   public float m6000() {
      return (float)(this.f2000 + this.f4000) / this.f1000.m62000();
   }

   public float m8000() {
      return (float)(this.f3000 + this.f5000) / this.f1000.m2000();
   }

   public boolean m10000() {
      return this.f6000;
   }

   void m12000() {
      this.f2000 = 0;
      this.f3000 = 0;
      this.f4000 = 0;
      this.f5000 = 0;
      this.f6000 = false;
   }

   rw.setting.C0025 m14000() {
      return this.f1000;
   }

   public int m16000() {
      return this.f5000;
   }

   public int m18000() {
      return this.f3000;
   }

   void m20000(int var1, int var2, int var3, int var4) {
      this.f2000 = var1;
      this.f3000 = var2;
      this.f4000 = var3;
      this.f5000 = var4;
      this.f6000 = true;
   }

   public int m22000() {
      return this.f2000;
   }

   public float m24000() {
      return (float)this.f2000 / this.f1000.m62000();
   }
}
