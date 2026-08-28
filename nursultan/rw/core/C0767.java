package rw.core;

import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.api.Iface0647;
import rw.gui.AttackAura;

public class C0767 extends Base0764 {
   private static float[] f1000;

   public C0767(AttackAura var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new float[]{2.0F, 40.0F, 60.0F, 10.0F, 2.5F, 8.0F, 4.0F, 1.0F};
   }

   private float m2000(float var1, float var2) {
      return (float)(var2 * Math.tanh(var1 / var2));
   }

   public NXi m10000(NjL var1, double var2) {
      return C1177.m74000(var1, C0989.m28000(), var2);
   }

   public C0983 m12000(NjL var1, boolean var2, double var3) {
      if (((Iface0647)((NNNZZ)((NNuU)this.y[0]).T[2])).m2000() == 1) {
         return C0989.m28000();
      } else {
         C0983 var5 = C0989.m26000(C0989.m28000(), this.m10000(var1, var3));
         int var6 = ((NNNwS)((NNuU)this.y[0]).T[4]).field_6012;
         float var7 = var2
            ? var5.m38000() + C1183.m12000(f1000[0])
            : this.m2000(var5.m38000(), C1183.m18000(f1000[1], f1000[2])) + (NNWE.m(var6) * f1000[3] + C1183.m12000(f1000[4]));
         float var8 = this.m2000(var5.m68000(), f1000[5]) + (NNWE.P(var6) * f1000[6] + C1183.m12000(f1000[7]));
         C0983 var9 = C0989.m28000().m64000(var7, var8);
         return var9.m32000(true);
      }
   }
}
