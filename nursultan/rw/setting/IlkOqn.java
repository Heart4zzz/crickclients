package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import rw.api.Iface0597;
import rw.core.C0804;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0821;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0963;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.OlssInijr;
import rw.gui.EspMix;
import rw.gui.IlkOns;

public class IlkOqn implements Iface0597<rw.core.C0138> {
   private static short[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static double[] f5000;
   private static String[] f6000;
   public static Object[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   public Object[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;

   private static void m2000() {
      f7000 = new Object[]{6};
   }

   IlkOqn(C0963 var1, C0830 var2) {
      this.m42000();
      this.f2000[6] = var1;
      Matrix4f var8 = new Matrix4f();
      this.f11000[2] = var8;
      Matrix4f var9 = new Matrix4f();
      this.f11000[3] = var9;
      OlssInijr var10 = ((OlpOtr)EspMix.f3000[1]).m66000(f6000[0]);
      this.f2000[0] = var10;
      OlssInijr var11 = ((OlpOtr)EspMix.f3000[1]).m66000(f6000[1]);
      this.f2000[1] = var11;
      C1228 var12 = ((OlpOtr)EspMix.f3000[1]).m6000(f6000[2]);
      this.f2000[2] = var12;
      OlssInijr var13 = ((OlpOtr)EspMix.f3000[1]).m66000(f6000[3]);
      this.f2000[3] = var13;
      C0821 var14 = ((OlpOtr)EspMix.f3000[1]).m32000(f6000[4]);
      this.f2000[4] = var14;
      C0804 var15 = ((OlpOtr)EspMix.f3000[1]).m76000(f6000[5]);
      this.f2000[5] = var15;
      this.f11000[0] = var2;
      C0805 var17 = C0805.m30000().m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f3000[1]).m18000(4).m20000()).m22000(var2).m20000();
      this.f11000[1] = var17;
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f6000 = new String[]{"u_projection", "u_view", "depth_texture_in", "inv_mvp", "u_time", "waves"};
   }

   private static void m14000() {
      f8000 = new float[]{0.0F, 0.0F, -1.0F, 1000.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void m26000() {
      f4000 = new short[]{6, 2, 3, 1};
      f3000 = new short[]{0, 1};
      f17000 = new short[]{1, 1, 2};
      f15000 = new short[]{1, 3};
      f13000 = new short[]{1, 4, 1, 5, 0, 3};
      f1000 = new short[]{1, 1, 6, 3, 6};
      f10000 = new short[]{3, 2, 0};
      f14000 = new short[]{3, 6, 0, 1};
      f16000 = new short[]{0, 2};
      f12000 = new short[]{1, 3, 2, 3, 3, 6, 0, 4};
      f9000 = new short[]{6, 0, 4, 5, 6, 1};
   }

   private void m42000() {
      if (this.f11000 == null) {
         this.f11000 = new Object[4];
         Object[] var1 = this.f11000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[7];
         Object[] var2 = this.f2000;
      }
   }

   public void m44000(rw.core.C0138 var1) {
      int var2 = ((rw.core.C0012)((C0963)this.f2000[6]).f5000[3]).m126000();
      int var3 = ((rw.core.C0012)((C0963)this.f2000[6]).f5000[3]).m76000();
      ((Matrix4f)this.f11000[2]).setOrtho(f8000[0], var2, var3, f8000[1], f8000[2], f8000[3]);
      C0806.m54000((C0830)this.f11000[0], f8000[4], f8000[5], f8000[6], var2, var3, -1);
      ((Matrix4f)this.f11000[3]).set(var1.m12000()).mul(var1.m26000()).invert();
      IlkOns.m96000(((NNuU)((C0963)this.f2000[6]).f5000[0]).e().i());
      ((C0805)this.f11000[1])
         .m32000(
            var1x -> {
               ((OlssInijr)this.f2000[0]).m18000((Matrix4f)this.f11000[2]);
               ((OlssInijr)this.f2000[f12000[0]]).m18000((Matrix4f)IlkOns.f9000[f12000[1]]);
               ((C1228)this.f2000[f12000[2]]).m20000(6);
               ((OlssInijr)this.f2000[f12000[3]]).m18000((Matrix4f)this.f11000[f12000[4]]);
               double var2x = (
                     ((NNNwS)((NNuU)((C0963)this.f2000[f12000[5]]).f5000[f12000[6]]).T[f12000[7]]).field_6012
                        + ((NNuU)((C0963)this.f2000[6]).f5000[0]).NK().N(false)
                  )
                  / f5000[0];
               ((C0821)this.f2000[4]).m20000((float)(var2x % f5000[1]));
               ((C0804)this.f2000[5]).m16000((FloatBuffer)((C0963)this.f2000[6]).f5000[1]);
            }
         );
   }

   private static void m50000() {
      f5000 = new double[]{20.0, Math.PI * 10};
   }
}
