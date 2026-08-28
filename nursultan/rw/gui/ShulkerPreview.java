package rw.gui;

import KDFzREm.NAN;
import KDFzREm.NGx;
import KDFzREm.NKi;
import KDFzREm.NNBK;
import KDFzREm.NNMH;
import KDFzREm.NNNG;
import KDFzREm.NNNKk;
import KDFzREm.NNNKw;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NQR;
import KDFzREm.NQo;
import KDFzREm.NYT;
import KDFzREm.NYj;
import KDFzREm.Nal;
import KDFzREm.NbK;
import KDFzREm.Nbp;
import KDFzREm.Nkq;
import KDFzREm.XD;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import org.joml.Vector2ic;
import org.joml.Vector4f;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0704;
import rw.core.C0735;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0814;
import rw.core.C0830;
import rw.core.C0876;
import rw.core.C0907;
import rw.core.C0991;
import rw.core.C1188;
import rw.core.C1193;
import rw.core.C1225;
import rw.core.IllOnqpm;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.defs.OlmmOsl;
import rw.module.ShulkerPreview_x;
import rw.setting.C0122;
import rw.setting.C0161;

@AnnotationDefault(
   L = "ShulkerPreview",
   y = Enum0055.VISUAL,
   N = Enum0070.SCREEN
)
public class ShulkerPreview extends GuiWidget {
   private static float[] f1000;
   public Object[] f2000;
   private static String[] f3000;
   private static float[] f4000;
   private static float[] f5000;
   public static Object[] f6000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var1 = this.f2000;
      }
   }

   public ShulkerPreview() {
      this.m4000();
      NNNG var5 = C0161.m38000(f3000[0]);
      this.f2000[0] = var5;
      C0991 var6 = C0122.m26000(this, f3000[1], true);
      this.f2000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new float[]{256.0F, 256.0F, 0.0F, 0.0F};
      f5000 = new float[]{1.0F, 1.0F, 0.0F, 0.0F, 16.0F, 1.0F};
      f4000 = new float[]{13.0F, 2.0F, 13.0F, 1.0F, 8.0F, 8.0F};
   }

   private static void m10000() {
      f3000 = new String[]{"icons/3x9.png", "show-in-world", "shulker.holdControl", " ", "shulker.contains", "u_projection", "u_view", "texture_in"};
   }

   private static void m12000() {
      f6000 = new Object[]{8, -12698050, -16777216};
   }

   private void m14000(NNBK var1, int var2, int var3, int var4, NQo var5) {
      this.m4000();
      var1.N(XD.Na, (NNNG)this.f2000[0], var2 - 4, var3 + var4 + 5, f5000[2], f5000[3], 256, 256, 256, 256, this.m34000(var5, false));
   }

   private void m16000(ZwBs var1, NQo var2, int var3, int var4) {
      int var5 = var2.c();
      if (var5 > 1) {
         String var6 = Integer.toString(var5);
         float var7 = var1.m56000(var6, f4000[4], (OlmmOsl)OlmmOsl.f7000[3], false);
         C0806.m56000(var1, var6, var3 + 17 - var7, var4 + 9, f4000[5], -1, -12698050);
      }
   }

   private NAN m18000(List<NQo> var1) {
      return C1188.m16000(f3000[4], var1.size()).N(NPh.field_1080);
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public void m20000(C0704 var1) {
      this.m4000();
      if ((Boolean)((C0991)this.f2000[1]).i()) {
         byte var2 = 0;

         for (NbK var4 : ((NNNZg)((NNuU)this.y[0]).T[3]).M()) {
            if (var4.method_5864() == Nbp.Nt && IlkOns.m50000(var4)) {
               NQo var5 = ((NGx)var4).N();
               if (C1193.m32000(var5)) {
                  Vector4f var6 = IlkOns.m68000(var4, true);
                  if (var6 != null) {
                     List var7 = C1193.m18000(var5);
                     if (!var7.isEmpty()) {
                        int var8 = (int)(var6.x() + (var6.z() - var6.x()));
                        int var9 = (int)var6.y();
                        var8 += 12;
                        byte var10 = 18;
                        var9 -= var10;
                        C0806.m32000(
                           ((C0805)C0814.f15000[0]).m18000(),
                           var8 - 4,
                           var9 + var10 + 5,
                           f1000[0],
                           f1000[1],
                           f1000[2],
                           f1000[3],
                           f5000[0],
                           f5000[1],
                           this.m34000(var5, true)
                        );
                        var2 = 1;
                        this.m22000(var7, var8, var9, var10);
                     }
                  }
               }
            }
         }

         if (var2 != 0) {
            IlkOns.m94000(((NNuU)this.y[0]).e(), (boolean)1);
            ((C0805)C0814.f15000[0]).m32000(var0 -> {
               var0.m66000(f3000[5]).m18000(IlkOns.m10000());
               var0.m66000(f3000[6]).m18000(RenderSystem.getModelViewMatrix());
               var0.m10000(f3000[7]).m8000(((IllOnqpm)C1225.f3000[4]).m24000());
            });
         }
      }
   }

   private void m22000(List<NQo> var1, int var2, int var3, int var4) {
      ZwBs var5 = C0002.m16000();

      for (int var6 = 0; var6 < var1.size(); var6++) {
         int var7 = var2 + 4 + var6 % 9 * 18;
         int var8 = var3 + var4 + 13 + var6 / 9 * 18;
         NQo var9 = (NQo)var1.get(var6);
         NursultanClient.m66000().m54000(var9, var7, var8, f5000[4]);
         this.m24000(var9, var7, var8);
         this.m16000(var5, var9, var7, var8);
      }
   }

   private void m24000(NQo var1, int var2, int var3) {
      if (var1.m()) {
         int var4 = var1.s();
         if (var4 > 0) {
            float var5 = f5000[5] - (float)var1.P() / var4;
            C0830 var6 = ((C0805)C0814.f12000[0]).m18000();
            C0806.m36000(var6, var2 + 2, var3 + 13, f4000[0], f4000[1], -16777216);
            int var7 = Math.round(var5 * f4000[2]);
            if (var7 > 0) {
               C0806.m36000(var6, var2 + 2, var3 + 13, var7, f4000[3], C0876.m60000(var5));
            }
         }
      }
   }

   @Iface0642
   public void m26000(C0907 var1) {
      NQo var2 = var1.m14000();
      List var3 = C1193.m18000(var2);
      if (!var3.isEmpty() && !((NNuU)this.y[0]).s()) {
         List var4 = var1.m24000();
         var4.add(1, C1188.m12000(f3000[2]).N(NPh.field_1080));
         var4.add(2, NAN.y(f3000[3]));
      }
   }

   private void m30000(NNBK var1, List<NQo> var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < var2.size(); var6++) {
         int var7 = var3 + 4 + var6 % 9 * 18;
         int var8 = var4 + var5 + 13 + var6 / 9 * 18;
         NQo var9 = (NQo)var2.get(var6);
         IlkOns.m92000(var1, var9, var7, var8);
         var1.N((NNMH)((NNuU)this.y[0]).i[3], var9, var7, var8);
      }
   }

   @Iface0642
   public void m32000(ShulkerPreview_x var1) {
      if (var1.m20000() == -111) {
         var1.N();
      }

      NYj var2 = var1.m2000();
      if (var2 != null && var2.R()) {
         NQo var3 = var2.i();
         List var4 = C1193.m18000(var3);
         if (!var4.isEmpty() && ((NNuU)this.y[0]).s()) {
            if (var1.m6000() == Nkq.field_7790 && var1.m28000() == 1) {
               var1.N();
               NYT var5 = new NYT(-111, ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548());
               var5.L().addAll(var4);

               for (int var6 = 0; var6 < var4.size(); var6++) {
                  ((NYj)var5.T.get(var6)).u((NQo)var4.get(var6));
               }

               NNYH var9 = (NNYH)((NNuU)this.y[0]).v[3];
               NNYH var8 = (NNYH)((NNuU)this.y[0]).v[3];
               if (var8 instanceof C0735 var7) {
                  var9 = (NNYH)var7.f3000[0];
               }

               ((NNuU)this.y[0]).N(new C0735(var5, ((NNNwS)((NNuU)this.y[0]).T[4]).method_31548(), var3.d(), var9));
            }
         }
      }
   }

   private int m34000(NQo var1, boolean var2) {
      if (NKi.N(var1.B()) instanceof Nal var3) {
         NQR var5 = var3.y();
         if (var5 != null) {
            return C0876.m70000(var5.u().NU, var2 ? 100 : 255);
         }
      }

      return C0876.m70000(NQR.field_7945.u().NU, var2 ? 100 : 255);
   }

   @Iface0642
   public void m36000(rw.module.ShulkerPreview var1) {
      NQo var2 = var1.m2000();
      List var3 = C1193.m18000(var2);
      if (!var3.isEmpty() && ((NNuU)this.y[0]).s()) {
         var1.N();
         NAN var4 = this.m18000(var3);
         NAN var5 = var2.d();
         int var6 = Math.max(((NNMH)((NNuU)this.y[0]).i[3]).N(var4), ((NNMH)((NNuU)this.y[0]).i[3]).N(var5));
         byte var7 = 18;
         int var8 = var1.m12000();
         int var9 = var1.m38000() - var7;
         NNBK var10 = var1.m22000();
         Vector2ic var11 = NNNKw.N.method_47944(var10.N(), var10.y(), var8, var9, var6, var7);
         var8 = var11.x();
         var9 = var11.y();
         NNNKk.N(var10, var8, var9, var6, var7, (NNNG)var2.method_58694(NNNNRZ.V));
         this.m14000(var10, var8, var9, var7, var2);
         var10.y((NNMH)((NNuU)this.y[0]).i[3], var5.method_30937(), var8, var9, -1);
         var10.y((NNMH)((NNuU)this.y[0]).i[3], var4.method_30937(), var8, var9 + 10, -1);
         this.m30000(var10, var3, var8, var9, var7);
      }
   }
}
