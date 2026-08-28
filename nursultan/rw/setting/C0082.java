package rw.setting;

import java.nio.FloatBuffer;
import org.joml.Matrix4f;
import rw.api.Iface0597;
import rw.core.C0804;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1223;
import rw.core.C1228;
import rw.core.C1234;
import rw.core.C1246;
import rw.core.C1250;
import rw.core.OlssInijr;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.gui.JumpEffect;

public class C0082 implements Iface0597<rw.core.C0138> {
   public Object[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static String[] f10000;
   public Object[] f11000;
   private static float[] f12000;
   public Object[] f13000;
   private static double[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   private static short[] f20000;
   public Object[] f21000;
   private static String[] f22000;
   public static Object[] f23000;

   private static void m4000() {
      f14000 = new double[]{8.0};
   }

   private void m12000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }

      if (this.f21000 == null) {
         this.f21000 = new Object[5];
         Object[] var2 = this.f21000;
      }

      if (this.f11000 == null) {
         this.f11000 = new Object[7];
         Object[] var3 = this.f11000;
      }

      if (this.f13000 == null) {
         this.f13000 = new Object[3];
         Object[] var4 = this.f13000;
      }
   }

   C0082(JumpEffect var1, C0830 var2) {
      this.m12000();
      this.f13000[2] = var1;
      Matrix4f var8 = new Matrix4f();
      this.f21000[0] = var8;
      Matrix4f var9 = new Matrix4f();
      this.f21000[1] = var9;
      Matrix4f var10 = new Matrix4f();
      this.f21000[2] = var10;
      OlssInijr var11 = ((OlpOtr)EspMix.f7000[1]).m66000(f10000[0]);
      this.f21000[3] = var11;
      OlssInijr var12 = ((OlpOtr)EspMix.f7000[1]).m66000(f10000[1]);
      this.f21000[4] = var12;
      C1228 var13 = ((OlpOtr)EspMix.f7000[1]).m6000(f10000[2]);
      this.f11000[0] = var13;
      C1228 var14 = ((OlpOtr)EspMix.f7000[1]).m6000(f10000[3]);
      this.f11000[1] = var14;
      OlssInijr var15 = ((OlpOtr)EspMix.f7000[1]).m66000(f10000[4]);
      this.f11000[2] = var15;
      OlssInijr var16 = ((OlpOtr)EspMix.f7000[1]).m66000(f22000[0]);
      this.f11000[3] = var16;
      C1250 var17 = ((OlpOtr)EspMix.f7000[1]).m94000(f22000[1]);
      this.f11000[4] = var17;
      C1250 var18 = ((OlpOtr)EspMix.f7000[1]).m94000(f22000[2]);
      this.f11000[5] = var18;
      C1250 var19 = ((OlpOtr)EspMix.f7000[1]).m94000(f22000[3]);
      this.f11000[6] = var19;
      C1223 var20 = ((OlpOtr)EspMix.f7000[1]).m106000(f22000[4]);
      this.f13000[0] = var20;
      C0804 var21 = ((OlpOtr)EspMix.f7000[1]).m76000(f22000[5]);
      this.f13000[1] = var21;
      this.f1000[0] = var2;
      C0805 var23 = C0805.m30000().m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f7000[1]).m18000(4).m20000()).m22000(var2).m20000();
      this.f1000[1] = var23;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f10000 = new String[]{"u_projection", "u_view", "texture_in", "depth_texture_in", "inv_mvp"};
      f22000 = new String[]{"mvp", "wave_params", "first_color", "second_color", "gradient_dir", "waves"};
   }

   private static void m42000() {
      f4000 = new float[]{0.0F, 0.0F};
      f12000 = new float[]{-1.0F, 1000.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 20.0F};
   }

   public void m50000(rw.core.C0138 var1) {
      int var2 = ((rw.core.C0012)((JumpEffect)this.f13000[2]).f1000[3]).m126000();
      int var3 = ((rw.core.C0012)((JumpEffect)this.f13000[2]).f1000[3]).m76000();
      float var4 = var1.m20000().N(true);
      ((Matrix4f)this.f21000[0]).setOrtho(f4000[0], var2, var3, f4000[1], f12000[0], f12000[1]);
      C0806.m54000((C0830)this.f1000[0], f12000[2], f12000[3], f12000[4], var2, var3, -1);
      ((Matrix4f)this.f21000[1]).set(var1.m12000()).mul(var1.m26000());
      ((Matrix4f)this.f21000[2]).set((Matrix4f)this.f21000[1]).invert();
      ((JumpEffect)this.f13000[2]).m26000(var1.m24000().y(), var4);
      IlkOns.m96000(JumpEffect.m2000((JumpEffect)this.f13000[2]).e().i());
      IlkOns.m96000(JumpEffect.m20000((JumpEffect)this.f13000[2]).e().L());
      ((C0805)this.f1000[1]).m32000(var2x -> {
         ((OlssInijr)this.f21000[3]).m18000((Matrix4f)this.f21000[0]);
         ((OlssInijr)this.f21000[4]).m18000((Matrix4f)IlkOns.f9000[3]);
         ((C1228)this.f11000[0]).m20000(0);
         ((C1228)this.f11000[1]).m20000(6);
         ((OlssInijr)this.f11000[f6000[0]]).m18000((Matrix4f)this.f21000[f6000[1]]);
         ((OlssInijr)this.f11000[f6000[2]]).m18000((Matrix4f)this.f21000[f6000[3]]);
         ((C1250)this.f11000[f6000[4]]).m18000(f12000[5], (Float)((C0988)((JumpEffect)this.f13000[f6000[5]]).f3000[1]).i(), f12000[6], f12000[7]);
         ((C1250)this.f11000[5]).m22000((Integer)((C0998)((JumpEffect)this.f13000[2]).f3000[2]).i());
         ((C1250)this.f11000[6]).m22000((Integer)((C0998)((JumpEffect)this.f13000[2]).f3000[3]).i());
         double var3x = (((Integer)((JumpEffect)this.f13000[2]).f1000[1]).intValue() + var4) / f14000[0];
         ((C1223)this.f13000[0]).m18000((float)Math.sin(var3x), (float)Math.cos(var3x));
         ((C0804)this.f13000[1]).m16000((FloatBuffer)((JumpEffect)this.f13000[2]).f1000[0]);
      });
   }

   private static void m54000() {
      f23000 = new Object[]{0, 6};
   }

   private static void m60000() {
      f18000 = new short[]{2, 0, 1, 2, 1};
      f16000 = new short[]{3, 1, 4};
      f5000 = new short[]{1, 0, 1, 1, 1};
      f19000 = new short[]{2, 1, 3, 1, 4, 1, 5, 1};
      f8000 = new short[]{6, 1, 0, 1, 1};
      f17000 = new short[]{0, 3, 1, 1, 2, 3, 2, 3};
      f9000 = new short[]{0, 0, 1, 2, 1};
      f20000 = new short[]{2, 2, 2, 1, 3};
      f3000 = new short[]{0, 4};
      f7000 = new short[]{3, 0, 1};
      f6000 = new short[]{2, 2, 3, 1, 4, 2};
      f15000 = new short[]{1, 5, 2, 2, 6};
      f2000 = new short[]{2, 3, 2, 1, 0, 1, 2, 0};
   }
}
