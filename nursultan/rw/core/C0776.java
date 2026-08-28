package rw.core;

import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NcB;
import KDFzREm.NcZ;
import KDFzREm.NjL;
import rw.api.Iface0647;
import rw.gui.AttackAura;

public class C0776 extends Base0764 {
   public Object[] f1000;
   private static float[] f2000;

   public C0776(AttackAura var1, String var2) {
      super(var1, var2);
      this.m14000();
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f2000 = new float[]{7.0F, 13.0F, 0.0F, 0.0F};
   }

   public NXi m10000(NjL var1, double var2) {
      return C1177.m74000(var1, C0989.m28000(), var2);
   }

   public C0983 m12000(NjL var1, boolean var2, double var3) {
      this.m14000();
      if (this.m2000(var2)) {
         Boolean var14 = true;
         this.f1000[0] = var14;
         return C0989.m4000();
      } else {
         if (var2) {
            NcB var5 = C1176.m30000((NNNwS)((NNuU)this.y[0]).T[4], C0989.m28000(), var3, true, var1x -> (boolean)(var1x == var1 ? 1 : 0));
            if (var5 != null && var5.N() == NcZ.field_1331) {
               Boolean var15 = false;
               this.f1000[0] = var15;
               return C0989.m4000();
            }
         }

         C0983 var16 = C0989.m26000(C0989.m28000(), this.m10000(var1, var3));
         float var6 = this.f1000[0] ? C1183.m18000(f2000[0], f2000[1]) : f2000[2];
         float var7 = var2 ? var16.m38000() : var6;
         float var8 = var2 ? var16.m68000() : (((NNNwS)((NNuU)this.y[0]).T[4]).method_36455() > f2000[3] ? -var6 : var6);
         C0983 var9 = C0989.m28000().m64000(var7, var8);
         return var9.m54000(true);
      }
   }

   public boolean m2000(boolean var1) {
      return (boolean)(((Iface0647)((NNNZZ)((NNuU)this.y[0]).T[2])).m2000() > 1 && !var1 ? 1 : 0);
   }

   private void m14000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }
}
