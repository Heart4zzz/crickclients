package rw.data;

import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Nkq;
import java.lang.runtime.ObjectMethods;
import rw.api.Iface0673;

public record Rec0313() implements Iface0673 {
   public Nkq f1000;
   public int f2000;
   public int f3000;
   private static short[] f4000;
   public int f5000;

   public int m2000() {
      return this.f2000;
   }

   public Rec0313(int var1, int var2, int var3, Nkq var4) {
      this.f2000 = var1;
      this.f3000 = var2;
      this.f5000 = var3;
      this.f1000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0313,"syncId;slotId;button;actionType",Rec0313::f2000,Rec0313::f3000,Rec0313::f5000,Rec0313::f1000>(this, var1);
   }

   private static void m6000() {
      short[] var128 = new short[2];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 4;
   }

   public void m10000(NNuU var1) {
      ((NNNZZ)var1.T[f4000[0]]).N(this.f2000, this.f3000, this.f5000, this.f1000, (NNNwS)var1.T[f4000[1]]);
   }

   public Nkq m12000() {
      return this.f1000;
   }

   public int m14000() {
      return this.f5000;
   }

   public int m16000() {
      return this.f3000;
   }
}
