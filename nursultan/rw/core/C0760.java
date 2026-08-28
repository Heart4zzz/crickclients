package rw.core;

import KDFzREm.NNNZZ;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.api.Iface0647;
import rw.gui.AttackAura;

public class C0760 extends Base0764 {
   private static float[] f1000;

   public C0760(AttackAura var1, String var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new float[]{45.0F, 0.0F, 5.0F, 0.0F, 5.0F, 1.0F};
   }

   public float m2000() {
      return f1000[5];
   }

   public C0983 m8000(NjL var1, boolean var2, double var3) {
      if (((Iface0647)((NNNZZ)((NNuU)this.y[0]).T[2])).m2000() == 1) {
         return C0989.m28000();
      } else {
         C0983 var5 = C0989.m26000(C0989.m28000(), this.m12000(var1, var3));
         float var6 = this.m4000(var5.m38000(), f1000[0]) + (var2 ? f1000[1] : C1183.m12000(this.m6000()));
         float var7 = this.m4000(var5.m68000(), f1000[2]) + (var2 ? f1000[3] : C1183.m12000(this.m2000()));
         C0983 var8 = C0989.m28000().m64000(var6, var7);
         return var8.m54000(true).m32000(true);
      }
   }

   private float m4000(float var1, float var2) {
      return (float)(var2 * Math.tanh(var1 / var2));
   }

   public NXi m12000(NjL var1, double var2) {
      return C1177.m74000(var1, C0989.m28000(), var2);
   }

   public float m6000() {
      return f1000[4];
   }
}
