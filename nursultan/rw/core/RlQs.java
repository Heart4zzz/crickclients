package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import java.time.Duration;
import java.util.Arrays;
import org.joml.Matrix4fStack;
import rw.api.Iface0659;
import rw.data.Rec0004;
import rw.defs.Enum0089;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.gui.TargetEsp;
import rw.setting.OlpOtr;

public class RlQs extends Base1148<TargetEsp> {
   private static String[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   public static Object[] f4000;
   private static float[] f5000;
   public Object[] f6000;
   private static float[] f7000;
   private static long[] f8000;
   private static double[] f9000;
   private static double[] f10000;
   private static float[] f11000;
   private static float[] f12000;

   private static void m8000() {
      f4000 = new Object[]{null, null};
   }

   public RlQs(TargetEsp var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m48000();
      C1197[] var9 = new C1197[4];
      this.f6000[0] = var9;
      C0805 var10 = C0805.m30000()
         .m16000(C0825.m2000().m22000((C1246)C1234.f1000[1]).m16000((OlpOtr)EspMix.f40000[1]).m18000(4).m20000())
         .m22000(C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024))
         .m20000();
      this.f6000[1] = var10;
      OlssInijr var11 = ((OlpOtr)EspMix.f40000[1]).m66000(f1000[0]);
      this.f6000[2] = var11;
      OlssInijr var12 = ((OlpOtr)EspMix.f40000[1]).m66000(f1000[1]);
      this.f6000[3] = var12;
      C1239 var13 = ((OlpOtr)EspMix.f40000[1]).m10000(f1000[2]);
      this.f6000[4] = var13;

      for (int var4 = 0; var4 < ((C1197[])this.f6000[0]).length; var4++) {
         ((C1197[])this.f6000[0])[var4] = new C1197((Enum0089)Enum0089.f1000[0]);
      }
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f9000 = new double[]{0.4F, 0.6F, 1.0, 0.3F};
      f10000 = new double[]{0.7F, 40.0, 40.0, (float) (Math.PI * 2), 2.0};
   }

   private static void m20000() {
      f1000 = new String[]{"u_projection", "u_view", "texture_in"};
   }

   private static void m22000() {
      f3000 = new float[]{2.0F, 10.0F, (float) Math.PI, 0.0F, 0.2F, 2.0F};
      f12000 = new float[]{0.5F, 1.0F, 0.5F, (float) (Math.PI * 2), 0.0F, 0.0F};
      f2000 = new float[]{1.0F, 0.0F, 0.0F, (float) Math.PI, 0.0F, 0.0F, 1.0F, 2.0F};
      f11000 = new float[]{0.0F, 0.0F, 0.0F};
      f7000 = new float[]{0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F};
      f5000 = new float[]{0.0F, 1.0F};
   }

   public void m32000(Object var1) {
      this.m48000();
      if (var1 instanceof C0138 var2) {
         boolean var3 = ((TargetEsp)this.N[1]).m16000();
         Duration var4 = var3 ? (Duration)f4000[0] : (Duration)f4000[1];

         for (int var5 = 1; var5 < ((C1197[])this.f6000[0]).length; var5++) {
            C1197 var6 = ((C1197[])this.f6000[0])[var5 - 1];
            int var7 = var3 ? 1 : 0;
            if (var3 ? !(var6.m44000() > f9000[0]) : !(var6.m44000() <= f9000[1])) {
               var6.m48000(var7, var4, var3 ? (Iface0659)C1182.f19000[0] : (Iface0659)C1182.f14000[5]);
               break;
            }

            ((C1197[])this.f6000[0])[var5].m48000(var7, var4, var3 ? (Iface0659)C1182.f19000[0] : (Iface0659)C1182.f14000[5]);
         }

         for (C1197 var8 : (C1197[])this.f6000[0]) {
            var8.m54000();
         }

         if (Arrays.<C1197>stream((C1197[])this.f6000[0]).allMatch(var0 -> var0.m52000((Enum0089)Enum0089.f1000[1]))) {
            return;
         }

         Matrix4fStack var26 = var2.m36000();
         NjL var28 = ((TargetEsp)this.N[1]).m10000();
         NXi var30 = var2.m24000().y();
         C0811 var31 = ((C0805)this.f6000[1]).m38000();
         float var9 = (float)(IlkOns.m26000(var28) - var30.M);
         float var10 = (float)(IlkOns.m34000(var28) - var30.B) + var28.method_17682() / f3000[0];
         float var11 = (float)(IlkOns.m4000(var28) - var30.Z);
         float var12 = (float)(
            (
                     f9000[2]
                        - Math.sin(
                           Math.max(
                              (((Integer)var28.fields_2212a028292fd3c078969e3ee4c71d9e8[0]).intValue() - ((NNuU)this.N[0]).NK().N(false)) / f3000[1] * f3000[2],
                              f3000[3]
                           )
                        )
                  )
                  * f9000[3]
               + f10000[0]
         );
         int var13 = (Integer)((C0998)((TargetEsp)this.N[1]).f1000[5]).i();
         byte var14 = 4;
         float var15 = f3000[4];
         float var16 = var15 * f3000[5] * var12;
         double var17 = ((NNNwS)((NNuU)this.N[0]).T[4]).field_6012 + ((NNuU)this.N[0]).NK().N(false);
         float var19 = (float)(Math.sin(var17 % f10000[1] / f10000[2] * f10000[3]) * f10000[4]);

         for (int var20 = 0; var20 < var14; var20++) {
            var26.pushMatrix();
            var26.translate(var9, var10, var11);
            float var21 = ((C1197[])this.f6000[0])[var20].m44000().floatValue() * f12000[0];
            var26.scale(f12000[1] + (f12000[2] - var21));
            var26.rotate(var2.m24000().M());
            float var22 = var20 * (f12000[3] / var14);
            var26.rotate(var22 + var19, f12000[4], f12000[5], f2000[0]);
            var26.translate(f2000[1], var16, f2000[2]);
            var26.rotate(f2000[3], f2000[4], f2000[5], f2000[6]);
            int var23 = var31.m16000();
            int var24 = C0876.m70000(var13, (int)(C0876.m46000(var13) * var21 * f2000[7]));
            var31.m42000(var26, -var15, var15, f11000[0]).m32000(f11000[1], f11000[2]).m26000(var24).m28000();
            var31.m42000(var26, var15, var15, f7000[0]).m32000(f7000[1], f7000[2]).m26000(var24).m28000();
            var31.m42000(var26, var15, -var15, f7000[3]).m32000(f7000[4], f7000[5]).m26000(var24).m28000();
            var31.m42000(var26, -var15, -var15, f7000[6]).m32000(f5000[0], f5000[1]).m26000(var24).m28000();
            ((C0805)this.f6000[1]).m4000().m18000(var23);
            var26.popMatrix();
         }

         IlkOns.m94000(((NNuU)this.N[0]).e(), (boolean)1);
         ((C0805)this.f6000[1]).m32000(var2x -> {
            this.m48000();
            ((OlssInijr)this.f6000[2]).m18000(var2.m12000());
            ((OlssInijr)this.f6000[3]).m18000(var2.m26000());
            ((C1239)this.f6000[4]).m8000(((IllOnqpm)C1225.f3000[1]).m24000());
         });
      }
   }

   private static void m42000() {
      f8000 = new long[]{300L, 100L};
   }

   private void m48000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[5];
         Object[] var1 = this.f6000;
      }
   }
}
