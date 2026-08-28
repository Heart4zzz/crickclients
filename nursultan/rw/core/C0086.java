package rw.core;

import org.joml.Matrix4f;
import rw.api.Iface0003;
import rw.data.Rec0004;
import rw.gui.EspMix;
import rw.setting.OlpOtr;

public class C0086 {
   private static float[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static byte[] f4000;
   public Object[] f5000;
   public static Object[] f6000;
   private static float[] f7000;
   private static String[] f8000;

   private static void m2000() {
      f4000 = new byte[]{6, 4, 24, 16, 8, 5, 2};
   }

   public C0086() {
      this.m14000();
      C0830 var5 = C0830.m42000((Rec0004)C0011.f5000[2], 256, 6);
      this.f5000[0] = var5;
      C0805 var6 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[2]).m16000((OlpOtr)EspMix.f40000[1]).m18000(4).m20000())
         .m22000((C0830)this.f5000[0])
         .m20000();
      this.f5000[1] = var6;
      Matrix4f var7 = new Matrix4f();
      this.f5000[2] = var7;
      Matrix4f var8 = new Matrix4f();
      this.f5000[3] = var8;
      Matrix4f var9 = new Matrix4f();
      this.f5000[4] = var9;
   }

   static {
      ntfClinit();
   }

   private void m14000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[5];
         Object[] var1 = this.f5000;
      }
   }

   private static void m20000() {
      f7000 = new float[]{0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -10000.0F};
      f2000 = new float[]{10000.0F, 255.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      f1000 = new float[]{1.0F, 0.0F, 0.5F, 1.0F, 1.0F, (float) Math.PI, 1.0F, 2.5F};
      f3000 = new float[]{-1.0F, 0.0F, 1.0F, 0.0F, 2.5F, 10000.0F};
   }

   public void m24000(Iface0003 var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      if (var1 != null && var2 > 0 && var3 > 0) {
         float var10 = Math.clamp(var6, f7000[0], f7000[1]);
         if (!(var10 <= f7000[2])) {
            this.m26000(var3, var4, var5, var10, var7, var8, var9);
            ((Matrix4f)this.f5000[2]).setOrtho(f7000[3], var2, var3, f7000[4], f7000[5], f2000[0]);
            int var11 = Math.round(var10 * f2000[1]);
            int var12 = var11 << 24 | var11 << 16 | var11 << 8 | var11;
            C0806.m32000((C0830)this.f5000[0], f2000[2], f2000[3], var2, var3, f2000[4], f2000[5], f1000[0], f1000[1], var12);
            ((C0805)this.f5000[1]).m32000(var2x -> {
               var2x.m66000(f8000[0]).m18000((Matrix4f)this.f5000[2]);
               var2x.m66000(f8000[1]).m18000((Matrix4f)this.f5000[3]);
               var2x.m10000(f8000[2]).m6000(var1);
            });
         }
      }
   }

   private void m26000(int var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (var5 + var6) * f1000[2];
      float var9 = var8 + (f1000[3] - var8) * var4;
      float var10 = (f1000[4] - var7) * f1000[5];
      float var11 = (f1000[6] - var4) * var10;
      float var12 = var1 * f1000[7];
      ((Matrix4f)this.f5000[4]).identity().m23(f3000[0] / var12);
      ((Matrix4f)this.f5000[3])
         .identity()
         .translate(var2, var3, f3000[1])
         .mul((Matrix4f)this.f5000[4])
         .rotateX(var11)
         .scale(var9, var9, f3000[2])
         .translate(-var2, -var3, f3000[3]);
   }

   private static void m28000() {
      f6000 = new Object[]{2.5F, 10000.0F};
   }

   private static void m38000() {
      f8000 = new String[]{"u_projection", "u_view", "texture_in"};
   }
}
