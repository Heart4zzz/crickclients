package rw.core;

import KDFzREm.NNuU;
import KDFzREm.NxU;
import org.joml.Matrix4f;
import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.setting.OlpOtr;

public class C0958 implements Iface0597<C0138> {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static short[] f9000;

   private static void m6000() {
      f4000 = new float[]{0.0F, 0.0F, -1.0F, 1000.0F, 0.0F, 0.0F, 0.0F};
   }

   C0958(C0963 var1, C0830 var2) {
      this.m24000();
      this.f3000[6] = var1;
      Matrix4f var8 = new Matrix4f();
      this.f3000[2] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f40000[1]).m66000(f7000[0]);
      this.f3000[3] = var9;
      OlssInijr var10 = ((OlpOtr)EspMix.f40000[1]).m66000(f7000[1]);
      this.f3000[4] = var10;
      C1239 var11 = ((OlpOtr)EspMix.f40000[1]).m10000(f7000[2]);
      this.f3000[5] = var11;
      this.f3000[0] = var2;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C0963.f3000[5]).m16000((OlpOtr)EspMix.f40000[1]).m18000(4).m20000())
         .m22000(var2)
         .m20000();
      this.f3000[1] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f2000 = new short[]{6, 2, 1};
      f1000 = new short[]{3, 1};
      f8000 = new short[]{4, 1, 5};
      f6000 = new short[]{0, 5, 1, 1, 6, 0, 2};
      f5000 = new short[]{0, 1, 3, 2, 4, 3};
      f9000 = new short[]{5, 6, 3};
   }

   private static void m16000() {
      f7000 = new String[]{"u_projection", "u_view", "texture_in"};
   }

   private void m24000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[7];
         Object[] var1 = this.f3000;
      }
   }

   public void m28000(C0138 var1) {
      NxU var2 = ((NNuU)((C0963)this.f3000[6]).f5000[0]).e();
      ((Matrix4f)this.f3000[2]).setOrtho(f4000[0], var2.N, var2.y, f4000[1], f4000[2], f4000[3]);
      C0806.m54000((C0830)this.f3000[0], f4000[4], f4000[5], f4000[6], var2.N, var2.y, -1);
      ((C0805)this.f3000[1]).m32000(var1x -> {
         ((OlssInijr)this.f3000[3]).m18000((Matrix4f)this.f3000[2]);
         ((OlssInijr)this.f3000[4]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((C1239)this.f3000[5]).m6000(((C0012)((C0963)this.f3000[6]).f5000[3]).m66000());
      });
   }
}
