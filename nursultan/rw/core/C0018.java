package rw.core;

import KDFzREm.NAd;
import rw.api.Iface0007;
import rw.gui.C0001;

public class C0018 implements Iface0007 {
   private static float[] f1000;
   public Object[] f2000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[6];
         Object[] var1 = this.f2000;
         var1[1] = f1000[3];
         var1[2] = f1000[4];
         var1[3] = 0;
         var1[4] = f1000[5];
      }
   }

   C0018(C0039 var1) {
      this.m4000();
      this.f2000[5] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new float[]{0.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F};
   }

   private void m14000() {
      float var1 = ((C0028)((C0039)this.f2000[5]).f35000[0]).m44000() - ((C0028)((C0039)this.f2000[5]).f35000[0]).m36000();
      if (!(var1 <= f1000[0])) {
         float var2 = ((C0001)this.f2000[0]).m64000((Float)this.f2000[1]);
         float var3 = ((C0028)((C0039)this.f2000[5]).f35000[0]).m26000() - (Float)this.f2000[4];
         float var4 = Math.round((Float)this.f2000[2]) - (Float)this.f2000[4];
         float var5 = var3 + var1 + (Float)this.f2000[4] * f1000[1];
         float var6 = var4 + var2 + (Float)this.f2000[4] * f1000[2];
         ((C0039)this.f2000[5]).m58000(var3, var4, var5, var6, (Integer)this.f2000[3]);
      }
   }

   public void m16000() {
      this.m14000();
   }

   public void m20000(C0001 var1, float var2, float var3, int var4, float var5) {
      this.f2000[0] = var1;
      Float var11 = var2;
      this.f2000[1] = var11;
      Float var12 = var3;
      this.f2000[2] = var12;
      Integer var13 = var4;
      this.f2000[3] = var13;
      Float var14 = var5;
      this.f2000[4] = var14;
   }

   public void m22000() {
      this.m14000();
      Float var5 = (Float)this.f2000[2] + ((C0001)this.f2000[0]).m64000((Float)this.f2000[1]);
      this.f2000[2] = var5;
   }

   public void m26000(int var1, NAd var2, boolean var3, C0267 var4, float var5) {
   }
}
