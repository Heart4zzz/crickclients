package net.minecraft.world.level.border;

import KDFzREm.NAK;
import KDFzREm.NCU;
import KDFzREm.NNWE;
import KDFzREm.NaM;
import KDFzREm.NxK;
import KDFzREm.NxV;
import KDFzREm.Nxa;
import rw.core.C0668;

class BorderStatus implements NxV {
   private final double y;
   private final double L;
   private final long u;
   private final long i;
   private final double R;
   private long M;
   private double B;
   private double Z;

   public double L(float var1) {
      return NNWE.N(this.N.B() - NNWE.u(var1, this.z(), this.N()) / 2.0, -this.N.U, this.N.U);
   }

   public long L() {
      return this.M;
   }

   public void M() {
   }

   BorderStatus(NxK var1, double var2, double var4, long var6, long var8) {
      this.N = var1;
      this.y = var2;
      this.L = var4;
      this.R = var6;
      this.M = var6;
      this.i = var8;
      this.u = this.i + var6;
      double var10 = this.U();
      this.B = var10;
      this.Z = var10;
   }

   public NxV B() {
      this.M--;
      this.Z = this.B;
      this.B = this.U();
      if (this.M <= 0L) {
         this.N.method_80();
         return new C0668(this.N, this.L);
      } else {
         return this;
      }
   }

   public NCU Z() {
      return NAK.N(
         NAK.L,
         NAK.N(
            Math.floor(this.N(0.0F)),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.L(0.0F)),
            Math.ceil(this.y(0.0F)),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.u(0.0F))
         ),
         NaM.i
      );
   }

   public Nxa i() {
      return this.L < this.y ? Nxa.field_12756 : Nxa.field_12754;
   }

   private double U() {
      double var1 = (this.R - this.M) / this.R;
      return var1 < 1.0 ? NNWE.u(var1, this.y, this.L) : this.L;
   }

   public double z() {
      return this.Z;
   }

   public double u(float var1) {
      return NNWE.N(this.N.B() + NNWE.u(var1, this.z(), this.N()) / 2.0, -this.N.U, this.N.U);
   }

   public double u() {
      return this.L;
   }

   public double y(float var1) {
      return NNWE.N(this.N.M() + NNWE.u(var1, this.z(), this.N()) / 2.0, -this.N.U, this.N.U);
   }

   public double y() {
      return Math.abs(this.y - this.L) / (this.u - this.i);
   }

   public double N(float var1) {
      return NNWE.N(this.N.M() - NNWE.u(var1, this.z(), this.N()) / 2.0, -this.N.U, this.N.U);
   }

   public double N() {
      return this.B;
   }

   public void R() {
   }
}
