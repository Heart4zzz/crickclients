package rw.core;

import KDFzREm.NNNYO;
import KDFzREm.NNNZg;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.ow;
import java.nio.FloatBuffer;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.lwjgl.BufferUtils;
import rw.data.Rec0004;
import rw.data.Rec0284;
import rw.defs.Enum0089;
import rw.defs.OlmmOsl;
import rw.gui.C0002;
import rw.gui.IlkOns;
import rw.gui.ZwBs;
import rw.setting.IlkOqn;

public class C0963 extends OlqsjOqn<C0970> {
   private static double[] f1000;
   private static float[] f2000;
   public static Object[] f3000;
   private static float[] f4000;
   public Object[] f5000;
   private static float[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static float[] f9000;

   public C0963() {
      this.m10000();
      NNuU var5 = NNuU.Nq();
      this.f5000[0] = var5;
      FloatBuffer var6 = BufferUtils.createFloatBuffer(40);
      this.f5000[1] = var6;
      C0830 var7 = C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024);
      this.f5000[2] = var7;
      C0012 var8 = KrHa.m18000(() -> {
         this.m10000();
         return ((NNuU)this.f5000[0]).e().N;
      }, () -> {
         lIOqipI0<"sdeb",212230205,742480434,742480435,742480432,212230205,212230205>(this);
         return ((NNuU)this.f5000[0]).e().y;
      });
      this.f5000[3] = var8;
      IlksOmts var9 = IlksOmts.<C0138>m22000().m18000(new IlkOqn(this, (C0830)this.f5000[2])).m28000((C0012)this.f5000[3]).m46000(33990, () -> {
         this.m10000();
         return IlkOns.m46000(((NNuU)this.f5000[0]).e());
      }).m32000(new C0958(this, (C0830)this.f5000[2])).m4000(((NNuU)this.f5000[0])::e).m10000((C0012)this.f5000[3]).m52000();
      this.f5000[4] = var9;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[5];
         Object[] var1 = this.f5000;
      }
   }

   private static void m18000() {
      f3000 = new Object[]{5, 40.0F, 500.0F, Math.PI * 10, null, null};
   }

   private static void m20000() {
      f2000 = new float[]{8.0F, 0.15F};
      f9000 = new float[]{0.15F, 2.0F, 14.0F, 2.0F, 28.0F, 14.0F, 16.0F};
      f8000 = new float[]{2.0F, 48.0F, 16.0F, 1.0F, 8.0F, 40.0F};
      f7000 = new float[]{0.1F, 500.0F, 0.0F, 1.0F};
      f4000 = new float[]{255.0F, 255.0F, 255.0F, 255.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f6000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 40.0F, 500.0F};
   }

   private static void m26000() {
      f1000 = new double[]{0.0, 0.0, 0.0, 1.0, 2.0, 0.0, 200.0, Math.PI * 10};
   }

   private boolean m28000(List<C0970> var1, NXi var2) {
      this.m10000();
      ((FloatBuffer)this.f5000[1]).clear();
      int var3 = 0;

      for (C0970 var5 : var1) {
         if (var3 >= 5) {
            break;
         }

         C1197 var6 = var5.m4000();
         if (!this.m32000(var5, var6, var2)) {
            float var7 = var6.m44000().floatValue();
            float var8 = f8000[5] * var7;
            if (!(var8 < f7000[0])) {
               NXi var9 = var5.m8000();
               int var10 = var5.m10000();
               long var11 = (System.nanoTime() - var6.m32000()) / 1000000L;
               float var13 = (float)(var6.m42000().toMillis() - var11);
               float var14 = Math.clamp(var13 / f7000[1], f7000[2], f7000[3]) * C0876.m46000(var10) / f4000[0];
               ((FloatBuffer)this.f5000[1]).put((float)(var9.M - var2.M));
               ((FloatBuffer)this.f5000[1]).put((float)(var9.B - var2.B));
               ((FloatBuffer)this.f5000[1]).put((float)(var9.Z - var2.Z));
               ((FloatBuffer)this.f5000[1]).put(var8);
               ((FloatBuffer)this.f5000[1]).put(var14);
               ((FloatBuffer)this.f5000[1]).put(C0876.m28000(var10) / f4000[1]);
               ((FloatBuffer)this.f5000[1]).put(C0876.m58000(var10) / f4000[2]);
               ((FloatBuffer)this.f5000[1]).put(C0876.m20000(var10) / f4000[3]);
               var3++;
            }
         }
      }

      for (int var15 = var3; var15 < 5; var15++) {
         ((FloatBuffer)this.f5000[1]).put(f4000[4]).put(f4000[5]).put(f4000[6]).put(f4000[7]).put(f6000[0]).put(f6000[1]).put(f6000[2]).put(f6000[3]);
      }

      return (boolean)(var3 > 0 ? 1 : 0);
   }

   public void m6000(C0138 var1) {
      this.m10000();
      List var2 = this.N();
      if (!var2.isEmpty()) {
         if (this.m28000(var2, var1.m24000().y())) {
            ((IlksOmts)this.f5000[4]).m8000(var1);
         }
      }
   }

   public void m8000(C0704 var1) {
      this.m10000();
      List var2 = this.N();
      if (!var2.isEmpty()) {
         byte var3 = 16;
         byte var4 = 14;
         float var5 = f2000[0];
         ow var6 = ((NNuU)this.f5000[0]).Nt();
         float var7 = var6.U();
         float var8 = var6.E();
         float var9 = f2000[1];
         float var10 = Math.min(var7, var8) * f9000[0];
         ZwBs var11 = C0002.m24000();
         NXi var12 = ((NNNYO)((NNuU)this.f5000[0]).i[5]).s().y();

         for (C0970 var14 : var2) {
            var14.m2000().m54000();
            var14.m4000().m54000();
            NXi var15 = var14.W();
            byte var16 = 0;
            if (var14.m40000()) {
               NbK var17 = ((NNNZg)((NNuU)this.f5000[0]).T[3]).method_8469(var14.m32000());
               if (var17 != null) {
                  var15 = new NXi(var17.field_6014, var17.field_6036 + var17.method_17682(), var17.field_5969)
                     .N(var17.method_73189().y(f1000[0], var17.method_17682(), f1000[1]), var1.m14000().N(true));
                  var14.N(var15);
                  var16 = 1;
               }
            }

            NXi var38 = var15.u(var12);
            NXi var18 = var15.y(f1000[2], var16 != 0 ? f1000[3] : f1000[4], f1000[5]).u(var12);
            Rec0284 var19 = IlkOns.m40000((float)var38.M, (float)var38.B, (float)var38.Z);
            Rec0284 var20 = IlkOns.m40000((float)var18.M, (float)var18.B, (float)var18.Z);
            if (var19 != null && var20 != null) {
               Vector2f var21 = var19.m6000().round();
               Vector2f var22 = var20.m6000().round();
               boolean var23 = var19.m4000();
               int var24 = var23 && var21.x >= var10 && var21.x <= var7 - var10 && var21.y >= var10 && var21.y <= var8 - var10 ? 1 : 0;
               int var25 = var14.m10000();
               String var26 = var14.E() + " m";
               float var27 = var14.m2000().m44000().floatValue();
               float var28 = (var21.y - var22.y) * var27;
               float var29 = (var22.y - var21.y) * var27;
               float var30 = var21.y + var29;
               float var31 = var21.x;
               float var32 = var30;
               if (var24 != 0) {
                  C0806.m38000(((C0805)C0814.f15000[3]).m18000(), (Matrix4f)IlkOns.f9000[3], var21.x, var30, f9000[1], var28, var25, C0876.m70000(var25, 0));
               } else {
                  Vector2f var33 = IlkOns.m60000(var21, var7, var8, var10);
                  var31 = var33.x;
                  var32 = var33.y;
               }

               float var40 = var31 - var11.m56000(var26, f9000[2], (OlmmOsl)OlmmOsl.f7000[3], false) / f9000[3];
               float var34 = var32 - f9000[4];
               C0806.m56000(var11, var26, var40, var34, f9000[5], var25, -16777216);
               var26 = var14.m();
               float var35 = var31 - var11.m56000(var26, f9000[6], (OlmmOsl)OlmmOsl.f7000[3], false) / f8000[0];
               float var36 = var32 - f8000[1];
               C0806.m56000(var11, var26, var35, var36, f8000[2], var25, -16777216);
               C0806.m30000(((C0805)C0814.f15000[3]).m18000(), (Matrix4f)IlkOns.f9000[3], var31 + f8000[3], var32, f8000[4], var25);
            }
         }
      }
   }

   private boolean m32000(C0970 var1, C1197 var2, NXi var3) {
      if (var2.m52000((Enum0089)Enum0089.f1000[0])) {
         return (boolean)1;
      } else {
         return (boolean)(var3.R(var1.m28000()) > f1000[6] ? 1 : 0);
      }
   }

   @Override
   public void m10000(C0721 var1) {
      this.m10000();
      List var2 = this.N();
      if (!var2.isEmpty()) {
         NXi var3 = ((NNNYO)((NNuU)this.f5000[0]).i[5]).s().y();

         for (C0970 var5 : var2) {
            var5.N((int)var3.R(var5.W()));
         }
      }
   }
}
