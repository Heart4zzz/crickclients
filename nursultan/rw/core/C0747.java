package rw.core;

import KDFzREm.NxU;
import org.joml.Matrix4f;
import rw.api.Iface0597;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.gui.JumpEffect;
import rw.setting.OlpOtr;

public class C0747 implements Iface0597<C0138> {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   private static short[] f5000;
   private static float[] f6000;
   public Object[] f7000;
   private static short[] f8000;
   public static Object[] f9000;

   private static void m2000() {
      f6000 = new float[]{0.0F, 0.0F, -1.0F, 1000.0F, 0.0F, 0.0F, 0.0F};
   }

   C0747(JumpEffect var1, C0830 var2) {
      this.m18000();
      this.f7000[6] = var1;
      Matrix4f var8 = new Matrix4f();
      this.f7000[2] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f35000[5]).m66000(f4000[0]);
      this.f7000[3] = var9;
      OlssInijr var10 = ((OlpOtr)EspMix.f35000[5]).m66000(f4000[1]);
      this.f7000[4] = var10;
      C1228 var11 = ((OlpOtr)EspMix.f35000[5]).m6000(f4000[2]);
      this.f7000[5] = var11;
      this.f7000[0] = var2;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f35000[5]).m18000(4).m20000())
         .m22000(var2)
         .m20000();
      this.f7000[1] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f4000 = new String[]{"u_projection", "u_view", "texture_in"};
   }

   private void m18000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[7];
         Object[] var1 = this.f7000;
      }
   }

   private static void m20000() {
      f1000 = new short[]{6, 2, 5};
      f3000 = new short[]{3, 5, 4, 5, 5, 0, 3};
      f5000 = new short[]{5, 1};
      f8000 = new short[]{6, 2, 0, 1, 3, 2, 4};
      f2000 = new short[]{3, 5};
   }

   public void m32000(C0138 var1) {
      NxU var2 = JumpEffect.m28000((JumpEffect)this.f7000[6]).e();
      ((Matrix4f)this.f7000[2]).setOrtho(f6000[0], var2.N, var2.y, f6000[1], f6000[2], f6000[3]);
      C0806.m54000((C0830)this.f7000[0], f6000[4], f6000[5], f6000[6], var2.N, var2.y, -1);
      ((C0805)this.f7000[1]).m32000(var1x -> {
         ((OlssInijr)this.f7000[3]).m18000((Matrix4f)this.f7000[2]);
         ((OlssInijr)this.f7000[4]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((C1228)this.f7000[5]).m20000(0);
      });
   }

   private static void m36000() {
      f9000 = new Object[]{0};
   }
}
