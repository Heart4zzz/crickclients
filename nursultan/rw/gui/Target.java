package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.ow;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.regex.Pattern;
import org.joml.Matrix4f;
import org.joml.Vector2dc;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0011;
import rw.core.C0607;
import rw.core.C0704;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0876;
import rw.core.C0983;
import rw.core.C0989;
import rw.core.C1010;
import rw.core.C1183;
import rw.core.C1225;
import rw.core.C1234;
import rw.core.C1239;
import rw.core.C1246;
import rw.core.IllOnqpm;
import rw.core.OlqIlmnt;
import rw.core.OlssInijr;
import rw.data.Rec0004;
import rw.defs.Enum0055;
import rw.defs.OlmmOsl;
import rw.setting.C0122;
import rw.setting.OlpOtr;

@AnnotationDefault(
   L = "GPS",
   y = Enum0055.VISUAL,
   N = Enum0070.INTERFACE
)
public class Target extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   public static Object[] f4000;
   private static String[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static float[] f9000;

   private static void m4000() {
      f4000 = new Object[]{null, 32.0F, 60.0F, -1};
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[8];
         Object[] var1 = this.f2000;
      }
   }

   public Target() {
      this.m6000();
      OlqIlmnt var5 = (OlqIlmnt)C0122.m8000(this, f1000[0], f1000[1], (Pattern)f4000[0]).N((var1, var2) -> this.m10000());
      this.f2000[0] = var5;
      OlqIlmnt var6 = (OlqIlmnt)C0122.m8000(this, f1000[2], f5000[0], (Pattern)f4000[0]).N((var1, var2) -> this.m10000());
      this.f2000[1] = var6;
      C1010 var7 = C0122.m22000(this, f5000[1], this::m14000);
      this.f2000[2] = var7;
      C0805 var8 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[0]).m16000((OlpOtr)EspMix.f40000[1]).m18000(4).m20000())
         .m22000(C0830.m42000((Rec0004)C0011.f5000[2], 256, 64))
         .m20000();
      this.f2000[3] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f40000[1]).m66000(f5000[2]);
      this.f2000[4] = var9;
      OlssInijr var10 = ((OlpOtr)EspMix.f40000[1]).m66000(f5000[3]);
      this.f2000[5] = var10;
      C1239 var11 = ((OlpOtr)EspMix.f40000[1]).m10000(f5000[4]);
      this.f2000[6] = var11;
      Matrix4f var12 = new Matrix4f();
      this.f2000[7] = var12;
   }

   static {
      ntfClinit();
   }

   private static Double m4000(String var0) {
      try {
         return Double.parseDouble(var0);
      } catch (NumberFormatException var2) {
         return null;
      }
   }

   private void m10000() {
      this.m6000();
      NursultanClient.m22000().m22000(m4000(((OlqIlmnt)this.f2000[0]).m4000()), m4000(((OlqIlmnt)this.f2000[1]).m4000()));
   }

   private static void m12000() {
      f7000 = new float[]{2.0F, 4.0F, 180.0F, (float) Math.PI, 16.0F};
      f8000 = new float[]{100.0F, 60.0F, 1.0F, 0.0F};
      f3000 = new float[]{90.0F, 90.0F, 32.0F};
      f9000 = new float[]{0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, 2.0F};
      f6000 = new float[]{50.0F, 32.0F, 60.0F};
   }

   public void m14000() {
      this.m6000();
      ((OlqIlmnt)this.f2000[0]).m10000(f5000[5]);
      ((OlqIlmnt)this.f2000[1]).m10000(f5000[6]);
   }

   private static void m12000() {
      f1000 = new String[]{"target-x", "", "target-z"};
      f5000 = new String[]{"", "clear-target", "u_projection", "u_view", "texture_in", "", "", "^-?\\d*\\.?\\d*$"};
   }

   private static String m22000(double var0) {
      return !Double.isInfinite(var0) && var0 == Math.rint(var0) ? Long.toString((long)var0) : Double.toString(var0);
   }

   public void m26000(double var1, double var3) {
      this.m6000();
      ((OlqIlmnt)this.f2000[0]).m10000(m22000(var1));
      ((OlqIlmnt)this.f2000[1]).m10000(m22000(var3));
   }

   @Iface0642
   public void m28000(C0704 var1) {
      this.m6000();
      C0607 var2 = NursultanClient.m22000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && (NNNZg)((NNuU)this.y[0]).T[3] != null && var2.m4000()) {
         Vector2dc var3 = var2.m12000();
         NXi var4 = IlkOns.m52000();
         ow var5 = ((NNuU)this.y[0]).Nt();
         float var6 = NursultanClient.m42000().m38000();
         float var7 = var5.U() / f7000[0];
         float var8 = var5.E() / f7000[1];
         C0983 var9 = C0989.m20000();
         float var10 = C1183.m40000(var9.m38000());
         float var11 = NNWE.P(var10);
         float var12 = NNWE.m(var10);
         double var13 = var3.x() - var4.M;
         double var15 = var3.y() - var4.Z;
         double var17 = -(var15 * var11 - var13 * var12);
         double var19 = -(var13 * var11 + var15 * var12);
         float var21 = (float)NNWE.u(var17, var19) * f7000[2] / f7000[3];
         float var22 = C1183.m40000(var21);
         int var23 = (int)Math.hypot(var3.x() - ((NNNwS)((NNuU)this.y[0]).T[4]).method_23317(), var3.y() - ((NNNwS)((NNuU)this.y[0]).T[4]).method_23321());
         String var24 = "GPS: " + var23 + "m";
         ZwBs var25 = C0002.m24000();
         float var26 = f7000[4] * var6;
         float var27 = var25.m56000(var24, var26, (OlmmOsl)OlmmOsl.f7000[3], false);
         float var28 = var25.m76000(var26, (OlmmOsl)OlmmOsl.f7000[3], false);
         float var29 = f8000[0] * var6;
         float var30 = C1183.m40000(f8000[1] * (f8000[2] - Math.clamp(var9.m68000(), f8000[3], f3000[0]) / f3000[1]));
         float var31 = var29 * NNWE.P(var22);
         float var32 = var29 * NNWE.m(var22);
         float var33 = f3000[2] * var6;
         ((Matrix4f)this.f2000[7]).identity().translate(var7, var8, f9000[0]).rotateX(var30).translate(var31, var32, f9000[1]).rotateZ(var22);
         C0806.m18000(((C0805)this.f2000[3]).m18000(), (Matrix4f)this.f2000[7], -var33 / f9000[2], -var33 / f9000[3], f9000[4], var33, var33, -1);
         var25.m62000(var24)
            .m86000(var7 - var27 / f9000[5], var8 - var28 / f9000[6])
            .m102000(var26)
            .m98000((OlmmOsl)OlmmOsl.f7000[3])
            .m106000(C0876.m2000(0, f6000[0]))
            .m28000(-1)
            .m4000();
         IlkOns.m94000(((NNuU)this.y[0]).e(), (boolean)1);
         ((C0805)this.f2000[3]).m32000(var1x -> {
            this.m6000();
            ((OlssInijr)this.f2000[4]).m18000(IlkOns.m10000());
            ((OlssInijr)this.f2000[5]).m18000(RenderSystem.getModelViewMatrix());
            ((C1239)this.f2000[6]).m8000(((IllOnqpm)C1225.f3000[2]).m24000());
         });
      }
   }
}
