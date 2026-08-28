package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NNNNEg;

public class C0717 {
   public Object[] f1000;
   public static Object[] f2000;

   private void m6000() {
      if (Ilnjk0ksI<"nfji",-1310731162,831899002,831899005,831899006,-1310731162,-1310731162>(this) == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public C0717() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f2000 = new Object[]{null};
   }

   public NNBK m16000() {
      return (NNBK)Ilnjk0ksI<"nfji",-1310731162,831899002,831899005,831899006,-1310731162,-1310731162>(this)[0];
   }

   public static C0717 m18000(NNBK var0, NNNNEg var1) {
      ((C0717)f2000[0]).f1000[0] = var0;
      ((C0717)f2000[0]).f1000[1] = var1;
      return (C0717)f2000[0];
   }

   public C0717 m22000(NNBK var1) {
      this.f1000[0] = var1;
      return this;
   }

   public NNNNEg m24000() {
      return (NNNNEg)this.f1000[1];
   }

   public C0717 m26000(NNNNEg var1) {
      this.f1000[1] = var1;
      return this;
   }
}
