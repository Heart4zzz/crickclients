package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import java.time.Duration;
import org.joml.Matrix4fStack;
import rw.api.Iface0659;
import rw.defs.Enum0089;
import rw.gui.IlkOns;
import rw.gui.TargetEsp;

public class C0936 extends Base1148<TargetEsp> {
   public Object[] f1000;
   private static double[] f2000;
   public static Object[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static float[] f6000;
   private static short[] f7000;

   private static void m2000() {
      f2000 = new double[]{1.0, 0.0, 4.0, 255.0, 120.0};
   }

   private static void m8000() {
      f3000 = new Object[]{null};
   }

   public C0936(TargetEsp var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.m10000();
      C1197 var8 = new C1197((Enum0089)Enum0089.f1000[0]);
      this.f1000[0] = var8;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m24000(Object var1) {
      this.m10000();
      if (var1 instanceof C0138 var2) {
         ((C1197)this.f1000[0]).m48000(((TargetEsp)this.N[1]).m16000() ? f2000[0] : f2000[1], (Duration)f3000[0], (Iface0659)C1182.f30000[4]);
         ((C1197)this.f1000[0]).m54000();
         if (((C1197)this.f1000[0]).m52000((Enum0089)Enum0089.f1000[1])) {
            return;
         }

         C0805 var3 = (C0805)C0814.f12000[3];
         C0805 var4 = (C0805)C0814.f12000[1];
         Matrix4fStack var5 = var2.m36000();
         NjL var6 = ((TargetEsp)this.N[1]).m10000();
         NXi var7 = var2.m24000().y();
         float var8 = (float)(IlkOns.m26000(var6) - var7.M);
         float var9 = (float)(IlkOns.m34000(var6) - var7.B);
         float var10 = (float)(IlkOns.m4000(var6) - var7.Z);
         C0811 var11 = var3.m38000();
         C0811 var12 = var4.m38000();
         C0808 var13 = var4.m4000();
         byte var14 = 35;
         float var15 = ((TargetEsp)this.N[1]).m10000().method_17682() / f6000[0];
         double var16 = (((NNNwS)((NNuU)this.N[f7000[0]]).T[f7000[1]]).field_6012 + ((NNuU)this.N[f7000[2]]).NK().N(false)) / f2000[2];
         float var18 = (float)Math.sin(var16) * var15 + var15;
         float var19 = (float)Math.cos(var16);
         int var20 = (Integer)((C0998)((TargetEsp)this.N[f7000[3]]).f1000[f7000[4]]).i();
         int var21 = C0876.m70000(var20, (int)(f2000[3] * ((C1197)this.f1000[f7000[5]]).m44000()));
         int var22 = C0876.m70000(var20, (int)(f2000[4] * ((C1197)this.f1000[f7000[6]]).m44000()));
         int var23 = C0876.m70000(var20, 0);
         float var24 = var6.method_17681();

         for (int var25 = 0; var25 < var14; var25++) {
            int var26 = var12.m16000();
            float var27 = (float)Math.toRadians(f6000[1] / var14 * var25);
            float var28 = (float)Math.sin(var27) * var24;
            float var29 = (float)Math.cos(var27) * var24;
            float var30 = (float)Math.toRadians(f6000[2] / var14 * (var25 + 1));
            float var31 = (float)Math.sin(var30) * var24;
            float var32 = (float)Math.cos(var30) * var24;
            var11.m42000(var5, var8 + var28, var9 + var18, var10 + var29)
               .m42000(var5, var8 + var31, var9 + var18, var10 + var32)
               .m26000(var21)
               .m26000(var21)
               .m30000(f6000[3])
               .m28000();
            var12.m42000(var5, var8 + var31, var9 + var18 - var19 / f6000[4], var10 + var32).m26000(var23).m28000();
            var12.m42000(var5, var8 + var28, var9 + var18 - var19 / f6000[5], var10 + var29).m26000(var23).m28000();
            var12.m42000(var5, var8 + var28, var9 + var18, var10 + var29).m26000(var22).m28000();
            var12.m42000(var5, var8 + var31, var9 + var18, var10 + var32).m26000(var22).m28000();
            var13.m18000(var26);
         }
      }
   }

   private static void m26000() {
      f6000 = new float[]{2.0F, 360.0F, 360.0F, 0.0F, 2.0F, 2.0F};
   }

   private static void m32000() {
      f4000 = new short[]{0, 0, 0, 1, 0};
      f5000 = new short[]{4, 0, 0, 1, 3, 1, 1, 1};
      f7000 = new short[]{0, 4, 0, 1, 5, 0, 0};
   }
}
