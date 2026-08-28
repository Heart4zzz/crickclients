package rw.core;

import KDFzREm.NAK;
import KDFzREm.NCU;
import KDFzREm.NNWE;
import KDFzREm.NaM;
import KDFzREm.NxK;
import KDFzREm.NxV;
import KDFzREm.Nxa;

class C0668 implements NxV {
   private final double f1000;
   private double f2000;
   private double f3000;
   private double f4000;
   private double f5000;
   private NCU f6000;

   public double m2000(float var1) {
      return this.f3000;
   }

   public long m4000() {
      return 0L;
   }

   public void m6000() {
      this.m14000();
   }

   public C0668(NxK var1, double var2) {
      this.f7000 = var1;
      this.f1000 = var2;
      this.m14000();
   }

   public NxV m8000() {
      return this;
   }

   public NCU m10000() {
      return this.f6000;
   }

   public Nxa m12000() {
      return Nxa.field_12753;
   }

   private void m14000() {
      this.f2000 = NNWE.N(this.f7000.M() - this.f1000 / 2.0, -this.f7000.U, this.f7000.U);
      this.f3000 = NNWE.N(this.f7000.B() - this.f1000 / 2.0, -this.f7000.U, this.f7000.U);
      this.f4000 = NNWE.N(this.f7000.M() + this.f1000 / 2.0, -this.f7000.U, this.f7000.U);
      this.f5000 = NNWE.N(this.f7000.B() + this.f1000 / 2.0, -this.f7000.U, this.f7000.U);
      this.f6000 = NAK.N(
         NAK.L,
         NAK.N(
            Math.floor(this.m26000(0.0F)),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.m2000(0.0F)),
            Math.ceil(this.m22000(0.0F)),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.m16000(0.0F))
         ),
         NaM.i
      );
   }

   public double m16000(float var1) {
      return this.f5000;
   }

   public double m18000() {
      return this.f1000;
   }

   public double m20000() {
      return 0.0;
   }

   public double m22000(float var1) {
      return this.f4000;
   }

   public double m24000() {
      return this.f1000;
   }

   public double m26000(float var1) {
      return this.f2000;
   }

   public void m28000() {
      this.m14000();
   }
}
