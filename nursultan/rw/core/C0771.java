package rw.core;

import KDFzREm.NXi;
import KDFzREm.NjL;
import rw.gui.AttackAura;

public class C0771 extends Base0764 {
   public Object[] f1000;
   private static float[] f2000;

   private static void m4000() {
      f2000 = new float[]{360.0F, 360.0F, 0.6F, 0.3F};
   }

   public C0771(AttackAura var1, String var2) {
      super(var1, var2);
      this.m16000();
   }

   static {
      ntfClinit();
   }

   public NXi m12000(NjL var1, double var2) {
      return C1177.m64000(var1, C0989.m28000(), true, ((AttackAura)this.y[1]).m76000());
   }

   public C0983 m14000(NjL var1, boolean var2, double var3) {
      this.m16000();
      if ((Integer)this.f1000[0] > 0) {
         Integer var18 = (Integer)this.f1000[0] - 1;
         this.f1000[0] = var18;
      }

      if (var2) {
         Integer var19 = 2;
         this.f1000[0] = var19;
      }

      if ((Integer)this.f1000[0] == 0) {
         return C0989.m4000();
      } else {
         C0983 var5 = C0989.m28000();
         NXi var6 = this.m12000(var1, var3);
         C0983 var7 = C0989.m26000(var5, var6);
         float var8 = var7.m38000();
         float var9 = var7.m68000();
         float var10 = (float)Math.hypot(Math.abs(var8), Math.abs(var9));
         float var11 = Math.abs(var8 / var10) * f2000[0];
         float var12 = Math.abs(var9 / var10) * f2000[1];
         C0983 var13 = new C0983(
            var5.m38000() + Math.min(Math.max(var8, -var11), var11) + C1183.m12000(f2000[2]),
            var5.m68000() + Math.min(Math.max(var9, -var12), var12) + C1183.m12000(f2000[3])
         );
         return var13.m32000(true).m54000(true);
      }
   }

   private void m16000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = 0;
      }
   }
}
