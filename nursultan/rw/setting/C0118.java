package rw.setting;

import KDFzREm.NNuU;
import KDFzREm.NxU;
import org.joml.Matrix4f;
import rw.api.Iface0597;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.C1250;
import rw.core.OllkkkIrq;
import rw.core.OlssInijr;
import rw.gui.EspMix;
import rw.gui.IlkOns;

public class C0118 implements Iface0597<OllkkkIrq> {
   private static float[] f1000;
   private static float[] f2000;
   public Object[] f3000;
   public static Object[] f4000;
   private static String[] f5000;

   private static void m2000() {
      f2000 = new float[]{0.0F, 0.0F, -1.0F, 1000.0F, 0.0F};
      f1000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m8000() {
      f5000 = new String[]{"u_projection", "u_view", "inv_view_proj", "texture_in", "params"};
   }

   public C0118(C0830 var1) {
      this.m42000();
      Matrix4f var6 = new Matrix4f();
      this.f3000[2] = var6;
      OlssInijr var7 = ((OlpOtr)EspMix.f13000[1]).m66000(f5000[0]);
      this.f3000[3] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f13000[1]).m66000(f5000[1]);
      this.f3000[4] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f13000[1]).m66000(f5000[2]);
      this.f3000[5] = var9;
      C1228 var10 = ((OlpOtr)EspMix.f13000[1]).m6000(f5000[3]);
      this.f3000[6] = var10;
      C1250 var11 = ((OlpOtr)EspMix.f13000[1]).m94000(f5000[4]);
      this.f3000[7] = var11;
      this.f3000[0] = var1;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f13000[1]).m18000(4).m20000())
         .m22000(var1)
         .m20000();
      this.f3000[1] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m26000() {
      f4000 = new Object[]{0, null};
   }

   public void m30000(OllkkkIrq var1) {
      NxU var2 = ((NNuU)f4000[1]).e();
      ((Matrix4f)this.f3000[2]).setOrtho(f2000[0], var2.N, var2.y, f2000[1], f2000[2], f2000[3]);
      C0806.m54000((C0830)this.f3000[0], f2000[4], f1000[0], f1000[1], var2.N, var2.y, -1);
      ((C0805)this.f3000[1]).m32000(var3 -> {
         ((OlssInijr)this.f3000[3]).m18000((Matrix4f)this.f3000[2]);
         ((OlssInijr)this.f3000[4]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((OlssInijr)this.f3000[5]).m18000(var1.m18000());
         ((C1228)this.f3000[6]).m20000(0);
         ((C1250)this.f3000[7]).m18000(f1000[2], var2.N, f1000[3], f1000[4]);
      });
   }

   private void m42000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[8];
         Object[] var1 = this.f3000;
      }
   }
}
