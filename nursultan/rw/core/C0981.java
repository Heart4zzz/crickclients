package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNUB;
import KDFzREm.NNUU;
import KDFzREm.NNuU;
import KDFzREm.NjL;
import KDFzREm.Nwn;
import rw.api.Iface0642;

public class C0981 {
   public Object[] f1000;
   private static float[] f2000;

   public C0981() {
      this.m8000();
      NNuU var5 = NNuU.Nq();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   @Iface0642
   public void m14000(C0721 var1) {
      C1007.m34000();
   }

   private static void m16000(NjL var0, NNUB var1) {
      NNuU var2 = NNuU.Nq();
      if ((NNNZg)var2.T[3] != null) {
         ((NNNZg)var2.T[3]).method_55116(var0, var1, var0.method_5634(), f2000[0], f2000[1] + var0.method_59922().z() * f2000[2]);
      }
   }

   @Iface0642
   public void m18000(C0913 var1) {
      if ((NNNwS)((NNuU)this.f1000[0]).T[4] != null && var1.m20000() instanceof Nwn var2) {
         if (C1007.m32000(var2, ((NNNwS)((NNuU)this.f1000[0]).T[4]).method_73189(), true) && !C1007.m42000((NNNwS)((NNuU)this.f1000[0]).T[4])) {
            m16000(var2, (NNUB)NNUU.wV.N());
         }
      }
   }

   public static void m20000(NjL var0) {
      m16000(var0, (NNUB)NNUU.we.N());
   }

   private static void m22000() {
      f2000 = new float[]{1.0F, 0.8F, 0.4F};
   }
}
