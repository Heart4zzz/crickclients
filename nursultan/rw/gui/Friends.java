package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.ow;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import org.joml.Matrix4f;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.core.Base0738;
import rw.core.C0011;
import rw.core.C0130;
import rw.core.C0704;
import rw.core.C0730;
import rw.core.C0736;
import rw.core.C0743;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0876;
import rw.core.C0989;
import rw.core.C1003;
import rw.core.C1183;
import rw.core.C1225;
import rw.core.C1234;
import rw.core.C1239;
import rw.core.C1246;
import rw.core.IllOnqpm;
import rw.core.OlssInijr;
import rw.data.Rec0004;
import rw.defs.Enum0055;
import rw.defs.OlmmOsl;
import rw.setting.BjCw;
import rw.setting.C0079;
import rw.setting.C0122;
import rw.setting.Invisible;
import rw.setting.OlpOtr;
import rw.setting.OltIsijn;

@AnnotationDefault(
   L = "Arrows",
   y = Enum0055.VISUAL,
   N = Enum0070.SCREEN
)
public class Friends extends GuiWidget {
   public Object[] f1000;
   private static byte[] f2000;
   public Object[] f3000;
   private static String[] f4000;
   private static float[] f5000;
   private static byte[] f6000;
   private static float[] f7000;
   private static String[] f8000;
   private static String[] f9000;
   public static Object[] f10000;
   private static float[] f11000;
   private static double[] f12000;

   private static void m4000() {
      f6000 = new byte[]{7, 2};
      f2000 = new byte[]{3, 4, 5, 6, 4, 8, 5};
   }

   public Friends() {
      this.m12000();
      Invisible var8 = new Invisible(this, f8000[0], true);
      this.f3000[0] = var8;
      OltIsijn var9 = new OltIsijn(this, f8000[1], true);
      this.f3000[1] = var9;
      C0736 var10 = new C0736(this, f4000[0], true);
      this.f3000[2] = var10;
      C0743 var11 = new C0743(this, f4000[1], true);
      this.f3000[3] = var11;
      C0730 var12 = new C0730(this, f4000[2], true);
      this.f3000[4] = var12;
      C0079 var13 = new C0079(this, f4000[3], true);
      this.f3000[5] = var13;
      BjCw var14 = new BjCw(this, f4000[4], true);
      this.f3000[6] = var14;
      C1003 var15 = C0122.m4000(
         this,
         f4000[5],
         (Invisible)this.f3000[0],
         (BjCw)this.f3000[6],
         (OltIsijn)this.f3000[1],
         (C0736)this.f3000[2],
         (C0079)this.f3000[5],
         (C0743)this.f3000[3],
         (C0730)this.f3000[4]
      );
      this.f3000[7] = var15;

      for (Base0738 var2 : ((C1003)this.f3000[7]).m2000()) {
         if (var2 instanceof Iface0648) {
            var2.m2000(this);
         }
      }

      C0805 var16 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[0]).m16000((OlpOtr)EspMix.f40000[1]).m18000(4).m20000())
         .m22000(C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024))
         .m20000();
      this.f1000[0] = var16;
      OlssInijr var17 = ((OlpOtr)EspMix.f40000[1]).m66000(f4000[6]);
      this.f1000[1] = var17;
      OlssInijr var18 = ((OlpOtr)EspMix.f40000[1]).m66000(f9000[0]);
      this.f1000[2] = var18;
      C1239 var19 = ((OlpOtr)EspMix.f40000[1]).m10000(f9000[1]);
      this.f1000[3] = var19;
      Matrix4f var20 = new Matrix4f();
      this.f1000[4] = var20;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f8000 = new String[]{"players", "friends"};
      f4000 = new String[]{"villagers", "monsters", "animals", "items", "party", "entities", "u_projection"};
      f9000 = new String[]{"u_view", "texture_in"};
   }

   private static void m10000() {
      f10000 = new Object[]{32.0F};
   }

   private void m12000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[8];
         Object[] var1 = this.f3000;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var2 = this.f1000;
      }
   }

   private static void m14000() {
      f12000 = new double[]{512.0, 0.5, 1.0};
   }

   private static void m14000() {
      f11000 = new float[]{2.0F, 2.0F, 1000.0F, 180.0F, (float) Math.PI, 12.0F, 2.0F, 32.0F};
      f7000 = new float[]{0.0F, 0.0F, 0.0F, 1.0F, -16.0F};
      f5000 = new float[]{-16.0F, 0.0F, 32.0F, 32.0F, 32.0F};
   }

   @Iface0642
   public void m22000(C0704 var1) {
      this.m12000();
      NXi var2 = IlkOns.m52000();
      ow var3 = ((NNuU)this.y[0]).Nt();
      float var4 = var3.U() / f11000[0];
      float var5 = var3.E() / f11000[1];
      float var6 = C1183.m40000(C0989.m20000().m38000());
      float var7 = NNWE.P(var6);
      float var8 = NNWE.m(var6);

      for (NbK var10 : ((NNNZg)((NNuU)this.y[0]).T[3]).M()) {
         for (Base0738 var12 : (List)((C1003)this.f3000[7]).i()) {
            if (var12.test(var10)) {
               double var13 = IlkOns.m26000(var10);
               double var15 = IlkOns.m4000(var10);
               double var17 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5858(var10);
               this.m26000(var12, null, var13, var2, var15, var7, var8, var4, var5, var17);
            }
         }
      }

      if (((BjCw)this.f3000[6]).U()) {
         for (C0130 var22 : NursultanClient.m100000().m32000()) {
            float var23 = (float)(System.currentTimeMillis() - var22.m22000()) / f11000[2];
            double var24 = var22.m14000().x();
            double var14 = var22.m14000().z();
            double var16 = NNWE.u(var23, var22.m32000().x(), var24);
            double var18 = NNWE.u(var23, var22.m32000().z(), var14);
            String var20 = var22.m2000()
               + " "
               + (int)Math.hypot(((NNNwS)((NNuU)this.y[0]).T[4]).method_23317() - var24, ((NNNwS)((NNuU)this.y[0]).T[4]).method_23321() - var14)
               + "m";
            this.m26000((BjCw)this.f3000[6], var20, var16, var2, var18, var7, var8, var4, var5, var22.m14000().distanceSquared(var2.M, var2.B, var2.Z));
         }
      }

      IlkOns.m94000(((NNuU)this.y[0]).e(), (boolean)1);
      ((C0805)this.f1000[0]).m32000(var1x -> {
         this.m12000();
         ((OlssInijr)this.f1000[1]).m18000(IlkOns.m10000());
         ((OlssInijr)this.f1000[2]).m18000(RenderSystem.getModelViewMatrix());
         ((C1239)this.f1000[3]).m8000(((IllOnqpm)C1225.f3000[2]).m24000());
      });
   }

   private int m24000(double var1, int var3) {
      var1 = Math.clamp(var1 / f12000[0], f12000[1], f12000[2]);
      return C0876.m70000(var3, (int)(C0876.m46000(var3) * var1));
   }

   private void m26000(Base0738 var1, String var2, double var3, NXi var5, double var6, float var8, float var9, float var10, float var11, double var12) {
      this.m12000();
      double var14 = var3 - var5.M;
      double var16 = var6 - var5.Z;
      double var18 = -(var16 * var8 - var14 * var9);
      double var20 = -(var14 * var8 + var16 * var9);
      float var22 = (float)NNWE.u(var18, var20) * f11000[3] / f11000[4];
      float var23 = C1183.m40000(var22);
      float var24 = var10 + var1.m18000() * NNWE.P(var23);
      float var25 = var11 + var1.m18000() * NNWE.m(var23);
      if (var2 != null) {
         ZwBs var26 = C0002.m24000();
         float var27 = f11000[5];
         C0806.m56000(
            var26, var2, var24 - var26.m56000(var2, var27, (OlmmOsl)OlmmOsl.f7000[3], false) / f11000[6], var25 - f11000[7], var27, var1.m2000(), -16777216
         );
      }

      ((Matrix4f)this.f1000[4]).identity().translate(var24, var25, f7000[0]).rotate(var23, f7000[1], f7000[2], f7000[3]);
      C0806.m18000(((C0805)this.f1000[0]).m18000(), (Matrix4f)this.f1000[4], f7000[4], f5000[0], f5000[1], f5000[2], f5000[3], this.m24000(var12, var1.m2000()));
   }
}
