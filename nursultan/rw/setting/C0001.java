package rw.setting;

import rw.core.C0804;
import rw.core.C0805;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C1223;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.IlpOkkIjl;
import rw.core.OlssInijr;

public class C0001 {
   public Object[] f1000;
   private static float[] f2000;
   private static String[] f3000;

   C0001(C0830 var1, OlpOtr var2, boolean var3, boolean var4, String var5) {
      this.m22000();
      C0805 var10 = C0805.m30000().m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000(var2).m18000(4).m20000()).m22000(var1).m20000();
      this.f1000[0] = var10;
      OlssInijr var11 = var2.m66000(f3000[0]);
      this.f1000[1] = var11;
      OlssInijr var12 = var2.m66000(f3000[1]);
      this.f1000[2] = var12;
      C1228 var13 = var2.m6000(f3000[2]);
      this.f1000[3] = var13;
      C1223 var14 = var2.m106000(f3000[3]);
      this.f1000[4] = var14;
      C1223 var15 = var4 ? var2.m106000(f3000[4]) : null;
      this.f1000[5] = var15;
      C1228 var16 = var3 ? var2.m6000(f3000[5]) : null;
      this.f1000[6] = var16;
      C0804 var17 = var5 != null ? var2.m76000(var5) : null;
      this.f1000[7] = var17;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f2000 = new float[]{1.0F, 1.0F};
   }

   private static void m14000() {
      f3000 = new String[]{"u_projection", "u_view", "texture_in", "texel_size", "direction", "radius"};
   }

   private void m22000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var1 = this.f1000;
      }
   }

   void m26000(IlpOkkIjl var1, float var2, float var3) {
      ((C0805)this.f1000[0]).m32000(var4 -> {
         ((OlssInijr)this.f1000[1]).m18000(var1.m40000());
         ((OlssInijr)this.f1000[2]).m18000(var1.m52000());
         ((C1228)this.f1000[3]).m20000(0);
         ((C1223)this.f1000[4]).m18000(f2000[0] / var1.m54000(), f2000[1] / var1.m34000());
         if ((C1223)this.f1000[5] != null) {
            ((C1223)this.f1000[5]).m18000(var2, var3);
         }

         if ((C1228)this.f1000[6] != null) {
            ((C1228)this.f1000[6]).m20000(var1.m62000() - 1);
         }

         if ((C0804)this.f1000[7] != null) {
            ((C0804)this.f1000[7]).m16000(var1.m64000());
         }
      });
   }
}
