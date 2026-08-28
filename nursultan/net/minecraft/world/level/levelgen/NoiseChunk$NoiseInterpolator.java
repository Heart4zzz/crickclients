package net.minecraft.world.level.levelgen;

import KDFzREm.NNNEd;
import KDFzREm.NNNEm;
import KDFzREm.NNNjL;
import KDFzREm.NNNjN;
import KDFzREm.NNNje;
import KDFzREm.NNNjv;
import KDFzREm.NNNjy;
import KDFzREm.NNWE;

public class NoiseChunk$NoiseInterpolator implements NNNEd, NNNje {
   double[][] N;
   double[][] y;
   private final NNNjN M;
   private double B;
   private double Z;
   private double z;
   private double U;
   private double E;
   private double W;
   private double m;
   private double P;
   private double s;
   private double T;
   private double b;
   private double j;
   private double v;
   private double n;
   private double t;

   void L(double var1) {
      this.t = NNWE.u(var1, this.v, this.n);
   }

   NoiseChunk$NoiseInterpolator(NNNEm var1, NNNjN var2) {
      this.L = var1;
      this.M = var2;
      this.N = this.allocateSlice(var1.y, var1.N);
      this.y = this.allocateSlice(var1.y, var1.N);
      var1.R.add(this);
   }

   public NNNjv i() {
      return NNNjv.field_36562;
   }

   public NNNjN u() {
      return this.M;
   }

   private double[][] allocateSlice(int var1, int var2) {
      int var3 = var2 + 1;
      int var4 = var1 + 1;
      double[][] var5 = new double[var3][var4];

      for (int var6 = 0; var6 < var3; var6++) {
         var5[var6] = new double[var4];
      }

      return var5;
   }

   void y(double var1) {
      this.v = NNWE.u(var1, this.s, this.T);
      this.n = NNWE.u(var1, this.b, this.j);
   }

   void selectCellYZ(int var1, int var2) {
      this.B = this.N[var2][var1];
      this.Z = this.N[var2 + 1][var1];
      this.z = this.y[var2][var1];
      this.U = this.y[var2 + 1][var1];
      this.E = this.N[var2][var1 + 1];
      this.W = this.N[var2 + 1][var1 + 1];
      this.m = this.y[var2][var1 + 1];
      this.P = this.y[var2 + 1][var1 + 1];
   }

   public void N(double[] var1, NNNjy var2) {
      if (this.L.E) {
         var2.N(var1, this);
      } else {
         this.u().N(var1, var2);
      }
   }

   public double N(NNNjL var1) {
      if (var1 != this.L) {
         return this.M.N(var1);
      } else if (!this.L.U) {
         throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
      } else {
         return this.L.E
            ? NNWE.N(
               (double)this.L.m / this.L.Z,
               (double)this.L.P / this.L.z,
               (double)this.L.s / this.L.Z,
               this.B,
               this.z,
               this.E,
               this.m,
               this.Z,
               this.U,
               this.W,
               this.P
            )
            : this.t;
      }
   }

   void N(double var1) {
      this.s = NNWE.u(var1, this.B, this.E);
      this.T = NNWE.u(var1, this.z, this.m);
      this.b = NNWE.u(var1, this.Z, this.W);
      this.j = NNWE.u(var1, this.U, this.P);
   }

   private void swapSlices() {
      double[][] var1 = this.N;
      this.N = this.y;
      this.y = var1;
   }
}
