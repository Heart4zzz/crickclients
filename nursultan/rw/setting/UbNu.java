package rw.setting;

import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNeZ;
import KDFzREm.NNuU;
import KDFzREm.NNuo;
import KDFzREm.NPh;
import KDFzREm.NQo;
import KDFzREm.Npj;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix3x2fStack;
import org.joml.Vector2i;
import rw.NursultanClient;
import rw.core.Base1148;
import rw.core.C0077;
import rw.core.C0704;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0814;
import rw.core.C0881;
import rw.core.C1006;
import rw.core.C1088;
import rw.core.C1183;
import rw.core.C1188;
import rw.core.C1189;
import rw.core.C1225;
import rw.core.IljlItp;
import rw.core.IllOnqpm;
import rw.core.OlIrtqjti;
import rw.data.Rec0208;
import rw.gui.AutoSwap;
import rw.gui.IlkOns;
import rw.gui.PgUp;
import rw.module.Module039;
import rw.module.OlpnniIl;
import rw.module.ShulkerPreview_x;

public class UbNu extends Base1148<AutoSwap> {
   public static Object[] f1000;
   private static double[] f2000;
   private static String[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   public static Object[] f7000;
   private static short[] f8000;
   private static float[] f9000;
   private static float[] f10000;
   private static short[] f11000;
   private static float[] f12000;
   private static short[] f13000;
   public Object[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static float[] f18000;
   private static short[] f19000;
   private static String[] f20000;
   private static float[] f21000;
   private static float[] f22000;
   private static short[] f23000;
   private static float[] f24000;
   private static short[] f25000;

   private void m2000(int var1) {
      this.m30000();
      if (var1 != -1) {
         ((C1088[])this.f14000[0])[var1] = null;
         Path var2 = ((File)((NNuU)this.N[0]).l[1]).toPath().resolve(f3000[0]).resolve(var1 + ".nbt");

         try {
            Files.deleteIfExists(var2);
         } catch (IOException var4) {
         }
      }
   }

   private static void m14000() {
      f1000 = new Object[]{null, 140.0F, 84.0F, 6.0F, 8.0F, 1.0F, 20.0F};
      f7000 = new Object[]{50.0F, null};
   }

   private void m16000() {
      this.m30000();

      for (C1088 var4 : (C1088[])this.f14000[0]) {
         if (var4 != null) {
            var4.m20000((boolean)(!IljlItp.m36000(IljlItp.m62000(var4.m2000())) ? 1 : 0));
         }
      }
   }

   public UbNu(AutoSwap var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m30000();
      C1088[] var8 = new C1088[3];
      this.f14000[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m22000() {
      f3000 = new String[]{"swap-item", "swap-item", "error-please-report", "swap-item", "error-please-report", "u_projection", "u_view", "texture_in"};
      f20000 = new String[]{"u_projection", "u_view"};
   }

   private void m30000() {
      if (this.f14000 == null) {
         this.f14000 = new Object[3];
         Object[] var1 = this.f14000;
         var1[1] = false;
      }
   }

   private static void m34000() {
      f2000 = new double[]{140.0, 140.0};
   }

   private static void m40000() {
      f10000 = new float[]{2.0F, 2.0F, 50.0F, 0.0F, 182.0F, 1.0F};
      f18000 = new float[]{20.0F, (float) (Math.PI * 2), 2.0F, 2.0F, 3.0F, 16.0F, 16.0F};
      f9000 = new float[]{32.0F, 32.0F, 0.0F, 0.0F, 1.0F};
      f24000 = new float[]{1.0F, 140.0F, 84.0F, 6.0F, 2.0F};
      f21000 = new float[]{8.0F, 1.0F, 2.0F, 2.0F, 50.0F};
      f22000 = new float[]{180.0F, 360.0F, 360.0F, 140.0F, 84.0F};
      f12000 = new float[]{6.0F, 8.0F, 1.0F, 20.0F, 50.0F};
   }

   private static void m46000() {
      f15000 = new short[]{0, 1, 0, 1, 0, 2, 1, 2};
      f4000 = new short[]{1, 1, 1, 0, 0};
      f25000 = new short[]{0, 0, 2, 0, 2, 0};
      f19000 = new short[]{0, 0, 0, 0, 2, 0};
      f11000 = new short[]{2, 2, 0, 1, 1, 1, 2, 2};
      f17000 = new short[]{0, 0, 0, 0, 2};
      f23000 = new short[]{0, 2, 0, 0, 0};
      f13000 = new short[]{1, 0, 0, 2, 2, 0, 1, 0};
      f6000 = new short[]{0, 1};
      f16000 = new short[]{0, 0, 0, 0};
      f5000 = new short[]{0, 4, 0, 1, 3, 0, 3, 0};
      f8000 = new short[]{1, 1, 0, 2, -29813};
   }

   private static boolean m54000(C1088 var0) {
      return (boolean)(var0 != null && !var0.m28000() ? 1 : 0);
   }

   public void m58000(Object var1) {
      this.m30000();
      switch (var1) {
         case OlpnniIl var4:
            PgUp var30 = (PgUp)((C1006)((AutoSwap)this.N[1]).f4000[0]).i();
            if (var4.y(var30, ((C1006)((AutoSwap)this.N[1]).f4000[0]).m2000())) {
               C1189.m22000(() -> {
                  this.m30000();
                  Boolean var5x = true;
                  this.f14000[1] = var5x;
                  ((NNuo)((NNuU)this.N[0]).L[2]).z();
                  this.m16000();
               });
               var4.N();
            } else if (var4.N(var30)) {
               C1189.m22000(() -> {
                  this.m30000();
                  if ((NNYH)((NNuU)this.N[0]).v[3] == null) {
                     ((NNuU)this.N[0]).N(null);
                     Boolean var5x = false;
                     this.f14000[1] = var5x;
                  }
               });
               var4.N();
            } else if (var4.y((PgUp)PgUp.f4000[2]) && (Boolean)this.f14000[1]) {
               var4.N();
               this.m60000(this::m2000);
            }
            break;
         case Module039 var5:
            Object var28 = null;
            this.f14000[2] = var28;
            if ((Boolean)this.f14000[1]) {
               this.m60000(this::m64000);
            }

            Boolean var29 = false;
            this.f14000[1] = var29;
            break;
         case C0704 var6:
            if (!(Boolean)this.f14000[1]) {
               return;
            }

            IlkOns.m94000(((NNuU)this.N[0]).e(), (boolean)1);
            float var31 = NursultanClient.m42000().m38000();
            float var32 = ((NNuU)this.N[0]).e().N / f10000[0];
            float var9 = ((NNuU)this.N[f25000[0]]).e().y / f10000[1];
            Vector2i var10 = C0881.m20000(((NNuo)((NNuU)this.N[f25000[1]]).L[f25000[2]]).i(), ((NNuo)((NNuU)this.N[f25000[3]]).L[f25000[4]]).R());
            float var11 = var10.x - var32;
            float var12 = var10.y - var9;
            float var13 = (float)Math.hypot(var11, var12);
            int var14 = ((C1088[])this.f14000[f25000[5]]).length;
            int var15 = -1;
            if (var13 > f10000[2] * var31) {
               var15 = m84000(var11, var12, var14);
            }

            if (var15 != -1 && m54000(((C1088[])this.f14000[0])[var15])) {
               var15 = -1;
            }

            float var16 = var32;
            float var17 = var9;
            if (var13 > f10000[3]) {
               float var18 = Math.min(var13 / (f10000[4] * var31), f10000[5]);
               float var19 = f18000[0] * var31 * var18 * var18;
               var16 = Math.round(var32 - var11 / var13 * var19);
               var17 = Math.round(var9 - var12 / var13 * var19);
            }

            float var33 = f18000[1] / var14;

            for (int var34 = 0; var34 < var14; var34++) {
               C1088 var20 = ((C1088[])this.f14000[0])[var34];
               int var21 = (int)(Math.sin(var34 * var33 + var33 / f18000[2]) * f2000[0] * var31 + var16);
               int var22 = (int)(-Math.cos(var34 * var33 + var33 / f18000[3]) * f2000[1] * var31 + var17);
               this.m62000(var16, var17, var34 * var33, (var34 + 1) * var33, var31, (boolean)(var15 == var34 ? 1 : 0), m54000(var20));
               if (var20 != null) {
                  Matrix3x2fStack var23 = var6.m26000().i();
                  var23.pushMatrix();
                  var23.translate(var21, var22);
                  var23.scale(f18000[4] * var31);
                  var23.translate(-var21, -var22);
                  var6.m26000().N(var20.m18000(), var21 - 8, var22 - 8);
                  var23.popMatrix();
               } else {
                  C0806.m32000(
                     ((C0805)C0814.f15000[0]).m18000(),
                     var21 - f18000[5] * var31,
                     var22 - f18000[6] * var31,
                     f9000[0] * var31,
                     f9000[1] * var31,
                     f9000[2],
                     f9000[3],
                     f9000[4],
                     f24000[0],
                     var15 == var34 ? (Integer)C0077.f1000[0] : -7171438
                  );
               }
            }

            ((C0805)C0814.f15000[2]).m24000(var0 -> {
               var0.m66000(f20000[0]).m18000(IlkOns.m10000());
               var0.m66000(f20000[1]).m18000(RenderSystem.getModelViewMatrix());
            });
            ((C0805)C0814.f15000[0]).m32000(var0 -> {
               var0.m66000(f3000[5]).m18000(IlkOns.m10000());
               var0.m66000(f3000[6]).m18000(RenderSystem.getModelViewMatrix());
               var0.m10000(f3000[7]).m8000(((IllOnqpm)C1225.f3000[3]).m24000());
            });
            break;
         case ShulkerPreview_x var7:
            if ((CompletableFuture)this.f14000[2] != null) {
               if (var7.m2000() == null) {
                  return;
               }

               NQo var8 = var7.m2000().i();
               if (var8.R()) {
                  return;
               }

               ((CompletableFuture)this.f14000[2]).complete(var8);
               var7.N();
               ((NNuU)this.N[0]).N(null);
            }
            break;
         case null:
         default:
      }
   }

   private void m60000(Consumer<Integer> var1) {
      this.m30000();
      float var2 = ((NNuU)this.N[0]).e().N / f21000[2];
      float var3 = ((NNuU)this.N[0]).e().y / f21000[3];
      Vector2i var4 = C0881.m20000(((NNuo)((NNuU)this.N[0]).L[2]).i(), ((NNuo)((NNuU)this.N[0]).L[2]).R());
      float var5 = var4.x - var2;
      float var6 = var4.y - var3;
      int var7 = ((C1088[])this.f14000[0]).length;
      int var8 = -1;
      if (Math.hypot(var5, var6) > f21000[4] * NursultanClient.m42000().m38000()) {
         var8 = m84000(var5, var6, var7);
      }

      var1.accept(var8);
   }

   private void m62000(float var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7) {
      int var8;
      int var9;
      if (var7) {
         var8 = ((OlIrtqjti)f7000[1]).m4000();
         var9 = ((OlIrtqjti)f7000[1]).m46000();
      } else if (var6) {
         OlIrtqjti var10 = OlIrtqjti.m40000(C0077.m22000());
         var8 = var10.m4000();
         var9 = var10.m46000();
      } else {
         var8 = (Integer)C0077.f6000[1];
         var9 = (Integer)C0077.f6000[2];
      }

      C0806.m34000(
         ((C0805)C0814.f15000[2]).m18000(),
         var1,
         var2,
         f24000[1] * var5,
         f24000[2] * var5,
         var3,
         var4,
         f24000[3] * var5 / f24000[4],
         f21000[0] * var5,
         f21000[1],
         var8,
         var9
      );
   }

   private void m64000(Integer var1) {
      this.m30000();
      if (var1 != -1 && !m54000(((C1088[])this.f14000[0])[var1])) {
         C1088 var2 = ((C1088[])this.f14000[0])[var1];
         if (var2 != null) {
            NursultanClient.m36000()
               .m36000(
                  () -> ((AutoSwap)this.N[1])
                     .m58000(var1xx -> var1xx.filter(var1xxx -> var2.m2000().test(var1xxx.m6000())).mapToInt(Rec0208::m4000).findFirst().orElse(-1))
               );
         } else {
            CompletableFuture var7 = new CompletableFuture();
            this.f14000[2] = var7;
            ((CompletableFuture)this.f14000[2]).thenAccept(var2x -> {
               this.m30000();
               ((C1088[])this.f14000[0])[var1] = C1088.m26000(var2x);
               this.m76000(var2x, var1);
            });
            C1189.m22000(() -> ((NNuU)this.N[0]).N(new NNeZ((NNNwS)((NNuU)this.N[0]).T[4])));
         }
      }
   }

   public void m72000() {
      this.m30000();
      Path var1 = ((File)((NNuU)this.N[0]).l[1]).toPath().resolve(f3000[3]);

      for (int var2 = 0; var2 < ((C1088[])this.f14000[0]).length; var2++) {
         Path var3 = var1.resolve(var2 + ".nbt");
         if (Files.exists(var3)) {
            try {
               ((C1088[])this.f14000[0])[var2] = C1088.m26000(C0159.m60000(var3));
            } catch (Exception var5) {
               C0106.m32000(C1188.m12000(f3000[4]).N(NPh.field_1061));
               ((Logger)f1000[0]).error(var5, var5);
            }
         }
      }
   }

   private void m76000(NQo var1, int var2) {
      try {
         File var3 = ((File)((NNuU)this.N[0]).l[1]).toPath().resolve(f3000[1]).toFile();
         if (!var3.exists()) {
            Files.createDirectories(var3.toPath());
         }

         File var4 = new File(var3, var2 + ".nbt");
         Npj.y(C0159.m78000(var1), var4.toPath());
      } catch (IOException var5) {
         C0106.m32000(C1188.m12000(f3000[2]).N(NPh.field_1061));
         ((Logger)f1000[0]).error(var5, var5);
      }
   }

   private static int m84000(float var0, float var1, int var2) {
      float var3 = C1183.m22000(Math.atan2(-var0, var1));
      return (int)Math.floor((var3 + f22000[0]) % f22000[1] / (f22000[2] / var2));
   }
}
