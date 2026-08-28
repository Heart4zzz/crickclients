package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NNNNud;
import KDFzREm.NNWE;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.NQo;
import KDFzREm.NbD;
import KDFzREm.NbK;
import KDFzREm.Nbx;
import KDFzREm.NjL;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import rw.NursultanClient;
import rw.defs.OlmmOsl;
import rw.gui.GuiElement;
import rw.gui.IlkOns;
import rw.gui.ZwBs;

public class C0744<T extends NjL> extends Base0748<T> {
   private static short[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static short[] f4000;
   private static byte[] f5000;
   private static byte[] f6000;
   private static String[] f7000;
   private static float[] f8000;

   private static void m2000() {
      f8000 = new float[]{0.5F, 2.0F, 4.0F, 4.0F, 2.0F, 1.0F, 4.0F};
      f3000 = new float[]{4.0F, 2.0F, 0.5F, 1.0F, 2.0F, 0.0F, 1.0F};
      f2000 = new float[]{5.0F, 1.0F, 3.0F, 2.0F, 4.0F, 1.0F, 4.0F};
   }

   private static void m10000() {
      f4000 = new short[]{0, 2, 0, 0, 3, 0};
      f1000 = new short[]{3, 3, 3, 3, 3, 0, 2};
   }

   public C0744(GuiElement var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m4000(NNBK var1, ZwBs var2, Vector4f var3, T var4) {
      float var5 = (Float)((GuiElement)this.N[0]).m44000().i();
      float var6 = (var5 - f8000[6]) / f3000[0];
      float var7 = var2.m76000(var5, (OlmmOsl)OlmmOsl.f7000[3], false) + var6 * f3000[1];
      float var8 = var3.x() + (var3.z() - var3.x()) * f3000[2];
      float var9 = var3.w() + var6 + f3000[3];

      for (NQo var13 : new NQo[]{var4.method_6047(), var4.method_6079()}) {
         if (!var13.R()) {
            NNag var14 = this.m10000(var13);
            float var15 = var2.m64000(var14, var5, (OlmmOsl)OlmmOsl.f7000[3], false);
            var2.m54000(var14)
               .m86000(var8 - var15 / f3000[4], var9)
               .m102000(var5)
               .m50000(this.u(var4))
               .m40000(var6)
               .m98000((OlmmOsl)OlmmOsl.f7000[3])
               .m28000(this.y(var4))
               .m4000();
            var9 += var7;
         }
      }

      var3.w = var9;
   }

   private static void m20000() {
      f5000 = new byte[]{2, 16};
      f6000 = new byte[]{20, 4, 4, 3, 2, 16, 16, 2};
   }

   public NNag m6000(T var1) {
      return super.m2000((T)var1).i(f7000[0]).i(NPh.field_1080 + "[" + NPh.field_1061 + Math.round(var1.method_6032()) + NPh.field_1080 + "]");
   }

   public void m8000(NNBK var1, ZwBs var2, Vector4f var3, T var4, int var5, int var6) {
      float var7 = var3.x;
      float var8 = var3.y;
      float var9 = var3.w - var8;
      int var10 = -1291187702;
      float var11 = var4.method_6032();
      float var12 = NNWE.N(var11 / Math.max(var4.method_6063(), var11), f3000[5], f3000[6]);
      float var13 = var12 * var9;
      int var14 = C0876.m50000(var6, var5, var12);
      C0805 var15 = (C0805)C0814.f15000[3];
      C0806.m36000(var15.m18000(), var7 - f2000[0], var8 - f2000[1], f2000[2], var9 + f2000[3], var10);
      C0806.m38000(var15.m18000(), (Matrix4f)IlkOns.f9000[3], var7 - f2000[4], var8 + var9 - var13, f2000[5], var13, var14, var6);
      if (!((C1013)((GuiElement)this.N[0]).f2000[2]).m14000()) {
         var3.y = Math.round(var3.y - f2000[6]);
      }
   }

   private NNag m10000(NQo var1) {
      NNag var2 = var1.d().L();
      return var1.c() <= 1 ? var2 : var2.i(NPh.field_1080 + " x" + var1.c());
   }

   public void m14000(NNBK var1, ZwBs var2, Vector4f var3, T var4) {
      int var5 = (Integer)((C0728)((C1000)((GuiElement)this.N[0]).f9000[2]).i()).f1000[0];
      int var6 = 0;
      byte var7 = 0;
      NNNNud[] var10000 = new NNNNud[f5000[0]];
      var10000[0] = NNNNud.field_49224;
      var10000[1] = NNNNud.field_49219;
      NNNNud[] var8 = var10000;
      int var9 = var8.length;

      for (int var10 = 0; var10 < var9; var10++) {
         NNNNud var11 = var8[var10];

         for (Nbx var13 : var11.N()) {
            if (var13.N() == NbD.field_6178 || var13.N() == NbD.field_6177) {
               NQo var14 = var4.method_6118(var13);
               if (!var14.R()) {
                  var6 += f5000[1] * var5;
                  var7 = 1;
               }
            }
         }
      }

      if (var7 != 0) {
         float var25 = var3.x();
         float var26 = var3.y();
         float var27 = var3.z();
         float var28 = var25 + (var27 - var25) * f8000[0];
         float var29 = Math.round(var28 - var6 / f8000[1]);
         float var30 = (Float)((GuiElement)this.N[0]).m44000().i();
         float var31 = (var30 - f8000[2]) / f8000[3];
         int var15 = 20 * var5;
         float var16 = Math.round(var26 - var31 - (var15 - 4));
         C0806.m36000(((C0805)C0814.f15000[3]).m18000(), var29 - f8000[4], var16 - f8000[5], var6 + 4, var15 - 3, this.u(var4));
         var6 = 0;

         for (NNNNud var20 : new NNNNud[]{NNNNud.field_49224, NNNNud.field_49219}) {
            for (Nbx var22 : var20.N()) {
               if (var22.N() == NbD.field_6178 || var22.N() == NbD.field_6177) {
                  NQo var23 = var4.method_6118(var22);
                  if (!var23.R()) {
                     NursultanClient.m66000().m54000(var23, var29 + var6, var16, 16 * var5);
                     var6 += 16 * var5;
                  }
               }
            }
         }
      }
   }

   public boolean m16000(NbK var1) {
      return var1 instanceof NjL;
   }

   private static void m26000() {
      f7000 = new String[]{" "};
   }
}
