package rw.core;

import KDFzREm.NxU;
import org.joml.Matrix4f;
import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.gui.KillEffect;
import rw.setting.OlpOtr;

public class C0855 implements Iface0597<C0138> {
   private static short[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   private static float[] f5000;
   private static short[] f6000;
   private static short[] f7000;

   private static void m4000() {
      f4000 = new String[]{"u_projection", "u_view", "texture_in"};
   }

   C0855(KillEffect var1, C0830 var2) {
      this.m8000();
      this.f2000[6] = var1;
      Matrix4f var8 = new Matrix4f();
      this.f2000[2] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f40000[1]).m66000(f4000[0]);
      this.f2000[3] = var9;
      OlssInijr var10 = ((OlpOtr)EspMix.f40000[1]).m66000(f4000[1]);
      this.f2000[4] = var10;
      C1239 var11 = ((OlpOtr)EspMix.f40000[1]).m10000(f4000[2]);
      this.f2000[5] = var11;
      this.f2000[0] = var2;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)KillEffect.f2000[2]).m16000((OlpOtr)EspMix.f40000[1]).m18000(4).m20000())
         .m22000(var2)
         .m20000();
      this.f2000[1] = var13;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[7];
         Object[] var1 = this.f2000;
      }
   }

   private static void m14000() {
      f5000 = new float[]{0.0F, 0.0F, -1.0F, 1000.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m18000() {
      f7000 = new short[]{6, 2, 1, 3, 1, 4, 1};
      f3000 = new short[]{5, 0, 2, 1, 1, 6, 2};
      f1000 = new short[]{0, 1, 3, 2, 4};
      f6000 = new short[]{3, 5, 6, 1};
   }

   public void m26000(C0138 var1) {
      NxU var2 = KillEffect.m48000((KillEffect)this.f2000[6]).e();
      ((Matrix4f)this.f2000[2]).setOrtho(f5000[0], var2.N, var2.y, f5000[1], f5000[2], f5000[3]);
      C0806.m54000((C0830)this.f2000[0], f5000[4], f5000[5], f5000[6], var2.N, var2.y, -1);
      ((C0805)this.f2000[1]).m32000(var1x -> {
         ((OlssInijr)this.f2000[3]).m18000((Matrix4f)this.f2000[2]);
         ((OlssInijr)this.f2000[4]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((C1239)this.f2000[5]).m6000(((C0012)((KillEffect)this.f2000[6]).f6000[1]).m66000());
      });
   }
}
