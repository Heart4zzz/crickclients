package rw.core;

import KDFzREm.NAd;
import rw.api.Iface0007;

public class C0033 implements Iface0007 {
   private static float[] f1000;
   public Object[] f2000;

   float m4000() {
      return Math.round((Float)this.f2000[1]);
   }

   C0033() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
         var1[1] = f1000[1];
      }
   }

   public void m16000() {
      float var1 = ((C0028)this.f2000[0]).m44000() - ((C0028)this.f2000[0]).m36000();
      if (var1 > (Float)this.f2000[1]) {
         Float var6 = var1;
         this.f2000[1] = var6;
      }
   }

   public void m20000() {
      float var1 = ((C0028)this.f2000[0]).m44000() - ((C0028)this.f2000[0]).m36000();
      if (var1 > (Float)this.f2000[1]) {
         Float var6 = var1;
         this.f2000[1] = var6;
      }
   }

   void m24000(C0028 var1) {
      this.f2000[0] = var1;
      Float var7 = f1000[0];
      this.f2000[1] = var7;
   }

   public void m26000(int var1, NAd var2, boolean var3, C0267 var4, float var5) {
      float var6 = ((C0028)this.f2000[0]).m44000() - ((C0028)this.f2000[0]).m36000() + var5;
      if (var6 > (Float)this.f2000[1]) {
         Float var11 = var6;
         this.f2000[1] = var11;
      }
   }

   private static void m28000() {
      f1000 = new float[]{0.0F, 0.0F};
   }
}
