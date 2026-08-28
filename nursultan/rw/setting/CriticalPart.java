package rw.setting;

import KDFzREm.NNuU;
import KDFzREm.NXi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector3d;
import org.lwjgl.opengl.GL30;
import rw.api.NestMembersX;
import rw.core.C0805;
import rw.core.C0806;
import rw.core.C0811;
import rw.core.C0821;
import rw.core.C0825;
import rw.core.C0830;
import rw.core.C0876;
import rw.core.C1234;
import rw.core.C1239;
import rw.core.C1246;
import rw.core.IlmmjsIlp;
import rw.core.KrHa;
import rw.core.OlssInijr;
import rw.data.CriticalPartApi;
import rw.data.OlnpOqOpi;
import rw.data.Rec0004;
import rw.gui.EspMix;
import rw.gui.IlkOns;

public class CriticalPart {
   private static float[] f1000;
   private static float[] f2000;
   private static boolean[] f3000;
   public Object[] f4000;
   private static boolean[] f5000;
   private static boolean[] f6000;
   private static String[] f7000;
   public Object[] f8000;
   public Object[] f9000;
   public Object[] f10000;
   private static float[] f11000;
   public static Object[] f12000;
   private static boolean[] f13000;

   private static void m4000() {
      f1000 = new float[]{1.0F, 5.0F, 1.0F, 255.0F, 0.08F, 0.0F};
      f11000 = new float[]{0.0F, -1000.0F, 1000.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f2000 = new float[]{0.0F, 5.0F};
   }

   private void m8000() {
      if (this.f10000 == null) {
         this.f10000 = new Object[2];
         Object[] var1 = this.f10000;
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[4];
         Object[] var2 = this.f8000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[3];
         Object[] var3 = this.f4000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[8];
         Object[] var4 = this.f9000;
         var4[5] = f11000[6];
         var4[6] = f2000[0];
         var4[7] = false;
      }
   }

   public CriticalPart(int var1, float var2, float var3) {
      this(var1, var2, var3, (C1246)C1234.f1000[0]);
   }

   public CriticalPart(int var1, float var2, float var3, C1246 var4) {
      this.m8000();
      ArrayList var9 = new ArrayList();
      this.f10000[0] = var9;
      rw.core.C0013 var10 = (rw.core.C0013)rw.core.C0013.f2000[0];
      this.f10000[1] = var10;
      rw.core.C0012 var11 = KrHa.m4000(48, 48).m112000(() -> (boolean)1);
      this.f8000[0] = var11;
      C0830 var12 = C0830.m42000((Rec0004)rw.core.C0011.f5000[2], 4096, 1024);
      this.f8000[1] = var12;
      C0805 var13 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[3]).m16000((OlpOtr)EspMix.f7000[5]).m18000(4).m20000())
         .m22000((C0830)this.f8000[1])
         .m20000();
      this.f8000[3] = var13;
      OlssInijr var14 = ((OlpOtr)EspMix.f7000[5]).m66000(f7000[0]);
      this.f4000[1] = var14;
      OlssInijr var15 = ((OlpOtr)EspMix.f7000[5]).m66000(f7000[1]);
      this.f4000[2] = var15;
      C0821 var16 = ((OlpOtr)EspMix.f7000[5]).m32000(f7000[2]);
      this.f9000[0] = var16;
      C0821 var17 = ((OlpOtr)EspMix.f7000[5]).m32000(f7000[3]);
      this.f9000[1] = var17;
      OlssInijr var18 = ((OlpOtr)EspMix.f50000[6]).m66000(f7000[4]);
      this.f9000[2] = var18;
      OlssInijr var19 = ((OlpOtr)EspMix.f50000[6]).m66000(f7000[5]);
      this.f9000[3] = var19;
      C1239 var20 = ((OlpOtr)EspMix.f50000[6]).m10000(f7000[6]);
      this.f9000[4] = var20;
      Boolean var21 = true;
      this.f9000[7] = var21;
      Float var22 = var2;
      this.f9000[5] = var22;
      Float var23 = var3;
      this.f9000[6] = var23;
      C0830 var24 = C0830.m46000((Rec0004)f12000[0], var1);
      this.f8000[2] = var24;
      C0805 var25 = C0805.m30000()
         .m16000(
            C0825.m2000()
               .m22000(var4.m2000().m20000((OlnpOqOpi)OlnpOqOpi.f1000[0]).m14000((CriticalPartApi)CriticalPartApi.f2000[1]).m16000())
               .m16000((OlpOtr)EspMix.f50000[6])
               .m18000(4)
               .m20000()
         )
         .m22000((C0830)this.f8000[2])
         .m18000(6)
         .m20000();
      this.f4000[0] = var25;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f6000 = new boolean[]{true, true};
      f3000 = new boolean[]{true, true, true, false};
      f13000 = new boolean[]{true, false, true, false, true, true};
      f5000 = new boolean[]{true, false, false, true};
   }

   private static void m26000() {
      f12000 = new Object[]{null, 5.0F, null};
   }

   private static void m32000() {
      f7000 = new String[]{"u_projection", "u_view", "radius", "pinch", "u_projection", "u_view", "texture_in"};
   }

   public void m42000(IlmmjsIlp var1) {
      ((List)this.f10000[0]).add(var1);
   }

   public void m44000(float var1, float var2) {
      Float var7 = var1;
      this.f9000[5] = var7;
      Float var8 = var2;
      this.f9000[6] = var8;
      Boolean var9 = true;
      this.f9000[7] = var9;
   }

   public void m46000() {
      if (!((List)this.f10000[0]).isEmpty()) {
         Iterator var1 = ((List)this.f10000[0]).iterator();

         while (var1.hasNext()) {
            IlmmjsIlp var2 = (IlmmjsIlp)var1.next();
            var2.m62000();
            if (var2.m40000()) {
               var1.remove();
            }
         }
      }
   }

   public void m50000(rw.core.C0138 var1) {
      this.m56000();
      if (!((List)this.f10000[0]).isEmpty()) {
         NXi var2 = var1.m24000().y();
         float var3 = var1.m20000().N(f3000[0]);
         C0811 var4 = ((C0830)this.f8000[2]).m6000();

         for (IlmmjsIlp var6 : (List)this.f10000[0]) {
            Vector3d var7 = var6.m18000().lerp(var6.m82000(), var3, new Vector3d());
            int var8 = var6.m46000() - var6.m24000();
            float var9 = Math.min(f1000[0], var8 / f1000[1]);
            if (var6.m6000() > 0) {
               var9 = Math.min(var9, Math.min(f1000[2], (var6.m24000() + var3) / var6.m6000()));
            }

            int var10 = C0876.m70000(var6.m84000(), (int)(f1000[3] * var9));
            float var11 = f1000[4] * var6.m72000();
            float var12 = var6.m32000() + (var6.m54000() - var6.m32000()) * var3;
            var4.m40000((float)(var7.x - var2.M), (float)(var7.y - var2.B), (float)(var7.z - var2.Z)).m30000(var11).m30000(var12).m26000(var10).m28000();
         }

         ((rw.core.C0013)this.f10000[1]).m40000(((NNuU)f12000[2]).e(), f3000[1]);
         ((C0805)this.f4000[0]).m24000(var2x -> {
            ((OlssInijr)this.f9000[2]).m18000(var1.m12000());
            ((OlssInijr)this.f9000[3]).m18000(var1.m26000());
            ((C1239)this.f9000[4]).m6000(((rw.core.C0012)this.f8000[0]).m66000());
         });
      }
   }

   private void m56000() {
      if (!((rw.core.C0012)this.f8000[0]).m6000()) {
         Boolean var7 = f3000[2];
         this.f9000[7] = var7;
      }

      if ((Boolean)this.f9000[7]) {
         ((rw.core.C0013)this.f10000[1]).m22000((rw.core.C0012)this.f8000[0]);
         Matrix4f var1 = (Matrix4f)IlkOns.f9000[3];
         Matrix4f var2 = new Matrix4f()
            .setOrtho(f1000[5], ((rw.core.C0012)this.f8000[0]).m126000(), ((rw.core.C0012)this.f8000[0]).m76000(), f11000[0], f11000[1], f11000[2]);
         C0806.m24000(
            (C0830)this.f8000[1], f11000[3], f11000[4], f11000[5], ((rw.core.C0012)this.f8000[0]).m126000(), ((rw.core.C0012)this.f8000[0]).m76000(), -1
         );
         ((C0805)this.f8000[3]).m32000(var3 -> {
            ((OlssInijr)this.f4000[1]).m18000(var2);
            ((OlssInijr)this.f4000[2]).m18000(var1);
            ((C0821)this.f9000[0]).m20000((Float)this.f9000[5]);
            ((C0821)this.f9000[1]).m20000((Float)this.f9000[6]);
         });
         NestMembersX.m4000().m8000(f3000[3], ((rw.core.C0012)this.f8000[0]).m66000());
         GL30.glGenerateMipmap(3553);
         ((rw.core.C0013)this.f10000[1]).m40000(((NNuU)f12000[2]).e(), (boolean)1);
         Boolean var8 = false;
         this.f9000[7] = var8;
      }
   }
}
