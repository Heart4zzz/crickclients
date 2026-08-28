package rw.core;

import rw.api.Iface0204;

public class C0095 implements Iface0204 {
   private static float[] f1000;
   public Object[] f2000;

   C0095(float var1) {
      this.m32000();
      Runnable var6 = () -> {};
      this.f2000[3] = var6;
      Float var7 = var1;
      this.f2000[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
   }

   void m12000() {
      Boolean var5 = true;
      this.f2000[1] = var5;
      Float var6 = f1000[0];
      this.f2000[2] = var6;
   }

   void m20000() {
      Boolean var5 = false;
      this.f2000[1] = var5;
      Float var6 = f1000[1];
      this.f2000[2] = var6;
   }

   public boolean m24000(float var1) {
      if (!(Boolean)this.f2000[1]) {
         return (boolean)0;
      } else {
         Float var6 = (Float)this.f2000[2] + var1;
         this.f2000[2] = var6;
         if ((Float)this.f2000[2] >= (Float)this.f2000[0]) {
            Boolean var7 = false;
            this.f2000[1] = var7;
            ((Runnable)this.f2000[3]).run();
            return (boolean)1;
         } else {
            return (boolean)0;
         }
      }
   }

   void m28000(Runnable var1) {
      Runnable var6 = var1 == null ? () -> {} : var1;
      this.f2000[3] = var6;
   }

   public boolean m30000() {
      return (Boolean)this.f2000[1];
   }

   private void m32000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
         var1[0] = f1000[2];
         var1[1] = false;
         var1[2] = f1000[3];
      }
   }
}
