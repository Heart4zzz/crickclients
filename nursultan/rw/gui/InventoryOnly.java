package rw.gui;

import KDFzREm.NNBK;
import KDFzREm.NNMH;
import KDFzREm.NNNG;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NQI;
import KDFzREm.NQo;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0691;
import rw.core.C0991;
import rw.data.Rec0161;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Cooldowns",
   y = Enum0055.VISUAL,
   N = Enum0070.INTERFACE
)
public class InventoryOnly extends GuiWidget {
   public Object[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static String[] f4000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   private static void m6000() {
      f3000 = new float[]{0.0F, 20.0F};
      f2000 = new float[]{99.0F, 1.0F, 100.0F, 100.0F, 0.33333334F, 1.0F, 1.0F};
   }

   public InventoryOnly() {
      this.m4000();
      C0991 var5 = C0122.m26000(this, f4000[0], true);
      this.f1000[0] = var5;
      C0991 var6 = C0122.m26000(this, f4000[1], false);
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m8000() {
      NursultanClient.m42000().m64000();
      return super.m12000();
   }

   @Override
   public boolean m12000() {
      NursultanClient.m42000().m64000();
      return super.m14000();
   }

   public boolean m4000() {
      this.m4000();
      return (Boolean)((C0991)this.f1000[1]).i();
   }

   private static void m14000() {
      f4000 = new String[]{"render-on-items", "inventory-only", "99+"};
   }

   @Iface0642
   public void m6000(C0691 var1) {
      this.m4000();
      if ((Boolean)((C0991)this.f1000[0]).i()) {
         NNNwS var2 = (NNNwS)((NNuU)this.y[0]).T[4];
         if (var2 != null) {
            NQo var3 = var1.m14000();
            NQI var4 = var2.method_7357();
            NNNG var5 = var4.y(var3);
            if (var5 != null) {
               Rec0161 var6 = (Rec0161)var4.N.get(var5);
               if (var6 != null) {
                  float var7 = ((NNuU)this.y[0]).NK().N(true);
                  float var8 = var6.f2000 - (var4.y + var7);
                  if (!(var8 <= f3000[0])) {
                     float var9 = var8 / f3000[1];
                     String var10;
                     if (var9 > f2000[0]) {
                        var10 = f4000[2];
                     } else {
                        var10 = String.valueOf(Math.round(var9));
                     }

                     float var11 = var4.N(var3, var7);
                     float var12 = (f2000[1] - var11) * f2000[2];
                     int var13 = NNWE.M(var12 / f2000[3] * f2000[4], f2000[5], f2000[6]) | 0xFF000000;
                     NNBK var14 = var1.m24000();
                     int var15 = var1.m4000();
                     int var16 = var1.m20000() + 8 - 9 / 2 - 3;
                     var14.y((NNMH)((NNuU)this.y[0]).i[3], var10, var15, var16, var13);
                  }
               }
            }
         }
      }
   }
}
