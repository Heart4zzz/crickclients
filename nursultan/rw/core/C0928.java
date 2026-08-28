package rw.core;

import KDFzREm.NNuU;
import KDFzREm.NxU;
import org.joml.Matrix4f;
import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.setting.OlpOtr;

public class C0928 implements Iface0597<OllkkkIrq> {
   public static Object[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   private static byte[] f4000;
   private static String[] f5000;

   private static void m8000() {
      f5000 = new String[]{"u_projection", "u_view", "texture_in"};
   }

   public C0928(C0830 var1) {
      this.m38000();
      Matrix4f var6 = new Matrix4f();
      this.f2000[2] = var6;
      OlssInijr var7 = ((OlpOtr)EspMix.f35000[5]).m66000(f5000[0]);
      this.f2000[3] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f35000[5]).m66000(f5000[1]);
      this.f2000[4] = var8;
      C1228 var9 = ((OlpOtr)EspMix.f35000[5]).m6000(f5000[2]);
      this.f2000[5] = var9;
      this.f2000[0] = var1;
      C0805 var11 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f35000[5]).m18000(4).m20000())
         .m22000(var1)
         .m20000();
      this.f2000[1] = var11;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f4000 = new byte[]{4, -1, 6, 2};
   }

   private static void m18000() {
      f1000 = new Object[]{0, null};
   }

   private static void m22000() {
      f3000 = new float[]{0.0F, 0.0F, -1.0F, 1000.0F, 0.0F, 0.0F, 0.0F};
   }

   public void m30000(OllkkkIrq var1) {
      NxU var2 = ((NNuU)f1000[1]).e();
      ((Matrix4f)this.f2000[2]).setOrtho(f3000[0], var2.N, var2.y, f3000[1], f3000[2], f3000[3]);
      C0806.m54000((C0830)this.f2000[0], f3000[4], f3000[5], f3000[6], var2.N, var2.y, -1);
      ((C0805)this.f2000[1]).m32000(var1x -> {
         ((OlssInijr)this.f2000[3]).m18000((Matrix4f)this.f2000[2]);
         ((OlssInijr)this.f2000[4]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((C1228)this.f2000[5]).m20000(0);
      });
   }

   private void m38000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[6];
         Object[] var1 = this.f2000;
      }
   }
}
