package rw.core;

import KDFzREm.NNNVf;
import KDFzREm.NNNYO;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NjL;
import KDFzREm.pz;
import java.util.List;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL33;
import rw.data.CriticalPartApi;
import rw.data.OlnpOqOpi;
import rw.data.Rec0004;
import rw.data.Rec0285;
import rw.data.Rec0304;
import rw.data.Rec0309;
import rw.gui.EspMix;
import rw.gui.IlkOns;
import rw.setting.OlpOtr;

public class C0761 {
   private static short[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static double[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static float[] f16000;
   public Object[] f17000;
   private static short[] f18000;
   private static String[] f19000;
   private static short[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   public Object[] f25000;
   private static short[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static short[] f32000;
   private static float[] f33000;
   private static short[] f34000;
   private static short[] f35000;
   private static short[] f36000;
   public Object[] f37000;
   public Object[] f38000;
   private static short[] f39000;
   private static short[] f40000;
   private static short[] f41000;
   private static float[] f42000;
   private static short[] f43000;
   private static short[] f44000;
   private static short[] f45000;
   public static Object[] f46000;
   private static short[] f47000;
   private static short[] f48000;
   private static short[] f49000;
   private static short[] f50000;
   private static short[] f51000;
   private static short[] f52000;
   private static short[] f53000;
   private static short[] f54000;

   private static void m4000() {
      f2000 = new float[]{1.0F, 180.0F / (float)Math.PI, 90.0F, 95.0F, 265.0F, 180.0F, 0.3F};
      f42000 = new float[]{50.0F, 50.0F, 4.0F};
      f16000 = new float[]{1.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
      f33000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private int m8000() {
      if ((Integer)this.f8000[3] == 0) {
         Integer var5 = GL33.glGenSamplers();
         this.f8000[3] = var5;
         GL33.glSamplerParameteri((Integer)this.f8000[3], 10241, 9728);
         GL33.glSamplerParameteri((Integer)this.f8000[3], 10240, 9728);
         GL33.glSamplerParameteri((Integer)this.f8000[3], 10242, 33071);
         GL33.glSamplerParameteri((Integer)this.f8000[3], 10243, 33071);
      }

      return (Integer)this.f8000[3];
   }

   public C0761() {
      this.m20000();
      NNuU var5 = NNuU.Nq();
      this.f17000[0] = var5;
      C0830 var6 = C0830.m42000((Rec0004)f46000[1], 65536, 16384);
      this.f17000[1] = var6;
      C0805 var7 = C0805.m30000()
         .m16000(
            C0825.m2000()
               .m22000(
                  C1246.m18000()
                     .m24000((Rec0309)Rec0309.f6000[0])
                     .m20000((OlnpOqOpi)OlnpOqOpi.f1000[0])
                     .m14000((CriticalPartApi)CriticalPartApi.f2000[0])
                     .m22000((Rec0304)Rec0304.f1000[1])
                     .m16000()
               )
               .m16000((OlpOtr)EspMix.f7000[3])
               .m18000(4)
               .m20000()
         )
         .m22000((C0830)this.f17000[1])
         .m20000();
      this.f17000[2] = var7;
      OlssInijr var8 = ((OlpOtr)EspMix.f7000[3]).m66000(f19000[0]);
      this.f17000[3] = var8;
      OlssInijr var9 = ((OlpOtr)EspMix.f7000[3]).m66000(f19000[1]);
      this.f17000[4] = var9;
      C1239 var10 = ((OlpOtr)EspMix.f7000[3]).m10000(f19000[2]);
      this.f17000[5] = var10;
      C1239 var11 = ((OlpOtr)EspMix.f7000[3]).m10000(f19000[3]);
      this.f17000[6] = var11;
      C1250 var12 = ((OlpOtr)EspMix.f7000[3]).m94000(f19000[4]);
      this.f17000[7] = var12;
      Matrix4f var13 = new Matrix4f();
      this.f37000[0] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f45000 = new short[]{0, 1, 16384, 1, 0, 0, 0, 1};
      f43000 = new short[]{3, 1};
      f40000 = new short[]{2, 3, 3, 3, 4, 3};
      f4000 = new short[]{5, 3, 6, 3};
      f54000 = new short[]{7, 0};
      f26000 = new short[]{1, 3, 4, 5, 1, 2, 0};
      f3000 = new short[]{0, 0, 1, 2, 2, 3, 4, 4};
      f22000 = new short[]{6, 2, 0};
      f44000 = new short[]{1, 3, 5, 0};
      f49000 = new short[]{1, 2, 2};
      f6000 = new short[]{5, 6};
      f20000 = new short[]{0, 5, 6, 0, 1, 4};
      f47000 = new short[]{3, 0, 2, 2};
      f23000 = new short[]{1, 4, 3, 4, 1, 1, 4, 5};
      f24000 = new short[]{4, 4, 5, 4};
      f29000 = new short[]{4, 5, 4, 2, 0, 2};
      f41000 = new short[]{2, 4, 6, 4, 4};
      f32000 = new short[]{1, 1, 0, 4, 2, 2};
      f31000 = new short[]{3, 4, 0, 0, 2, 2, 1};
      f18000 = new short[]{1, 1, 0, 1, 1, 1};
      f36000 = new short[]{2, 1, 0, 1, 1};
      f14000 = new short[]{1, 1, 1, 3, 1, 0};
      f39000 = new short[]{0, 1, 2};
      f11000 = new short[]{1, 1, 2, 2, 1, 1, 0, 1};
      f30000 = new short[]{2, 1, 1, 1, 4, 1, 3};
      f51000 = new short[]{0, 5, 1, 1, 1, 1, 1, 1};
      f27000 = new short[]{1, 1, 2, 1, 0, 1};
      f9000 = new short[]{1, 1, 2, 1, 0, 1};
      f52000 = new short[]{1, 1, 1, 1};
      f13000 = new short[]{0, 1, 1};
      f15000 = new short[]{1, 2, 1, 0, 1, 1, 1, 1};
      f50000 = new short[]{1, 0, 1, 1, 1, 2, 1, 0};
      f34000 = new short[]{1, 1, 1, 1, 4, 4};
      f21000 = new short[]{0, 2, 2, 4, 4};
      f28000 = new short[]{0, 5, 0, 0, 0, 1, 0};
      f5000 = new short[]{1, 0, 5};
      f12000 = new short[]{3, 3};
      f10000 = new short[]{3, 10241, 9728, 3};
      f53000 = new short[]{10240, 9728, 3, 10242};
      f35000 = new short[]{3, 10243, 3, 1, 2, 3};
      f1000 = new short[]{4, 2, 1, 1, 0};
      f48000 = new short[]{3, 4, 5, 6, 7};
   }

   private void m20000() {
      if (this.f17000 == null) {
         this.f17000 = new Object[8];
         Object[] var1 = this.f17000;
      }

      if (this.f37000 == null) {
         this.f37000 = new Object[7];
         Object[] var2 = this.f37000;
         var2[6] = f16000[2];
      }

      if (this.f38000 == null) {
         this.f38000 = new Object[3];
         Object[] var3 = this.f38000;
         var3[0] = f16000[3];
         var3[1] = 0;
         var3[2] = f16000[4];
      }

      if (this.f25000 == null) {
         this.f25000 = new Object[6];
         Object[] var4 = this.f25000;
         var4[0] = f16000[5];
         var4[1] = f16000[6];
         var4[2] = f33000[0];
         var4[3] = f33000[1];
         var4[4] = f33000[2];
         var4[5] = f33000[3];
      }

      if (this.f8000 == null) {
         this.f8000 = new Object[4];
         Object[] var5 = this.f8000;
         var5[0] = f33000[4];
         var5[1] = f33000[5];
         var5[2] = false;
         var5[3] = 0;
      }
   }

   private int m24000() {
      return ((NNNYO)((NNuU)this.f17000[0]).i[5]).T().N().texture() instanceof pz var1 ? var1.N() : 0;
   }

   private static void m32000() {
      f46000 = new Object[]{3, null};
   }

   private void m34000(NXi var1) {
      float var2 = (float)Math.hypot(var1.M - ((NXi)this.f37000[4]).M, var1.Z - ((NXi)this.f37000[4]).Z);
      float var3 = Math.min(var2 * f42000[2], f16000[0]);
      Float var8 = (Float)this.f8000[0];
      this.f25000[5] = var8;
      Float var9 = (Float)this.f8000[0] + (var3 - (Float)this.f8000[0]) * f16000[1];
      this.f8000[0] = var9;
      Float var10 = (Float)this.f8000[1] + (Float)this.f8000[0];
      this.f8000[1] = var10;
   }

   private static void m42000() {
      f7000 = new double[]{0.0025000002F};
   }

   public void m44000() {
      Object var5 = null;
      this.f37000[1] = var5;
      Object var6 = null;
      this.f37000[2] = var6;
      Object var7 = null;
      this.f37000[3] = var7;
      Object var8 = null;
      this.f37000[4] = var8;
      Boolean var9 = false;
      this.f8000[2] = var9;
   }

   public void m48000(NjL var1, NXi var2) {
      this.f37000[1] = var1;
      NXi var3 = var2 != null ? var2 : var1.method_73189();
      this.f37000[3] = var3;
      this.f37000[4] = var3;
      this.f37000[5] = var3;
      Float var13 = (Float)var1.fields_4212a028292fd3c078969e3ee4c71d9e8[1];
      this.f38000[2] = var13;
      Float var14 = (Float)var1.fields_4212a028292fd3c078969e3ee4c71d9e8[0];
      this.f25000[0] = var14;
      Float var15 = (Float)var1.fields_5212a028292fd3c078969e3ee4c71d9e8[0];
      this.f25000[1] = var15;
      Float var16 = (Float)var1.fields_4212a028292fd3c078969e3ee4c71d9e8[2];
      this.f25000[2] = var16;
      Float var17 = var1.field_6004;
      this.f25000[3] = var17;
      Float var18 = var1.method_36455();
      this.f25000[4] = var18;
      Float var19 = (Float)this.f25000[4];
      this.f37000[6] = var19;
      Float var20 = (Float)this.f25000[2];
      this.f38000[0] = var20;
      Integer var21 = 0;
      this.f38000[1] = var21;
      NNNVf var4 = (NNNVf)var1.fields_3212a028292fd3c078969e3ee4c71d9e8[3];
      Float var22 = var4.N;
      this.f25000[5] = var22;
      Float var23 = var4.y;
      this.f8000[0] = var23;
      Float var24 = var4.L;
      this.f8000[1] = var24;
      Boolean var25 = true;
      this.f8000[2] = var25;
   }

   public void m54000(NXi var1, float var2, float var3) {
      if ((Boolean)this.f8000[2] && var1 != null) {
         if (!var1.equals((NXi)this.f37000[f6000[0]]) || var2 != (Float)this.f37000[f6000[1]] || var3 != (Float)this.f38000[0]) {
            this.f37000[5] = var1;
            Float var11 = var2;
            this.f37000[6] = var11;
            Float var12 = var3;
            this.f38000[0] = var12;
            Integer var13 = 3;
            this.f38000[1] = var13;
         }

         NXi var14 = (NXi)this.f37000[4];
         this.f37000[3] = var14;
         Float var15 = (Float)this.f25000[0];
         this.f38000[2] = var15;
         Float var16 = (Float)this.f25000[2];
         this.f25000[f23000[0]] = var16;
         Float var17 = (Float)this.f25000[f23000[1]];
         this.f25000[f23000[2]] = var17;
         NXi var4 = (NXi)this.f37000[f23000[3]];
         if ((Integer)this.f38000[f23000[4]] > 0) {
            float var5 = f2000[0] / ((Integer)this.f38000[f23000[5]]).intValue();
            var4 = new NXi(
               ((NXi)this.f37000[f23000[6]]).M + (((NXi)this.f37000[f23000[7]]).M - ((NXi)this.f37000[4]).M) * var5,
               ((NXi)this.f37000[4]).B + (((NXi)this.f37000[5]).B - ((NXi)this.f37000[4]).B) * var5,
               ((NXi)this.f37000[4]).Z + (((NXi)this.f37000[5]).Z - ((NXi)this.f37000[4]).Z) * var5
            );
            Float var18 = (Float)this.f25000[2] + NNWE.R((Float)this.f38000[0] - (Float)this.f25000[2]) * var5;
            this.f25000[2] = var18;
            Float var19 = (Float)this.f25000[4] + ((Float)this.f37000[6] - (Float)this.f25000[4]) * var5;
            this.f25000[4] = var19;
            Integer var20 = (Integer)this.f38000[1] - 1;
            this.f38000[1] = var20;
         }

         Float var21 = this.m62000(var4);
         this.f25000[0] = var21;
         this.m34000(var4);
         this.f37000[4] = var4;
      }
   }

   public void m56000(C0138 var1, int var2) {
      if ((Boolean)this.f8000[2]) {
         float var3 = var1.m20000().N(true);
         this.m60000(var3);
         if ((List)this.f37000[2] != null) {
            NXi var4 = var1.m24000().y();
            NXi var5 = ((NXi)this.f37000[3]).N((NXi)this.f37000[4], var3);
            ((Matrix4f)this.f37000[0]).translation((float)(var5.M - var4.M), (float)(var5.B - var4.B), (float)(var5.Z - var4.Z));
            IlkOns.m94000(((NNuU)this.f17000[0]).e(), (boolean)1);

            for (Rec0285 var7 : (List)this.f37000[2]) {
               if (!var7.m8000().isClosed() && var7.m8000().texture() instanceof pz var8) {
                  this.m58000(var7);
                  ((C0805)this.f17000[2]).m32000(var4x -> {
                     ((OlssInijr)this.f17000[3]).m18000(var1.m12000());
                     ((OlssInijr)this.f17000[4]).m18000(var1.m26000());
                     ((C1239)this.f17000[5]).m8000(var8.N());
                     GL33.glBindSampler(0, this.m8000());
                     ((C1239)this.f17000[6]).m4000(33985, this.m24000());
                     GL33.glBindSampler(1, this.m8000());
                     ((C1250)this.f17000[7]).m22000(var2);
                  });
               }
            }

            GL33.glBindSampler(0, 0);
            GL33.glBindSampler(1, 0);
         }
      }
   }

   private void m58000(Rec0285 var1) {
      C0811 var2 = ((C0830)this.f17000[1]).m6000();
      C0808 var3 = ((C0830)this.f17000[1]).m52000();
      float[] var4 = var1.m4000();
      float[] var5 = var1.m10000();
      int[] var6 = var1.m2000();
      float[] var7 = var1.m14000();

      for (int var8 = 0; var8 < var6.length; var8++) {
         var2.m42000((Matrix4f)this.f37000[0], var4[var8 * 3], var4[var8 * 3 + 1], var4[var8 * 3 + 2])
            .m32000(var5[var8 * 2], var5[var8 * 2 + 1])
            .m26000(var6[var8])
            .m32000(var7[var8 * 2], var7[var8 * 2 + 1])
            .m28000();
      }

      for (int var11 : var1.m12000()) {
         var3.m24000(var11);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void m60000(float var1) {
      if ((NjL)this.f37000[1] != null && !((NjL)this.f37000[1]).method_31481()) {
         float var2 = (Float)((NjL)this.f37000[1]).fields_4212a028292fd3c078969e3ee4c71d9e8[0];
         float var3 = (Float)((NjL)this.f37000[1]).fields_4212a028292fd3c078969e3ee4c71d9e8[1];
         float var4 = (Float)((NjL)this.f37000[1]).fields_4212a028292fd3c078969e3ee4c71d9e8[2];
         float var5 = (Float)((NjL)this.f37000[1]).fields_5212a028292fd3c078969e3ee4c71d9e8[0];
         float var6 = ((NjL)this.f37000[1]).method_36454();
         float var7 = ((NjL)this.f37000[1]).field_5982;
         float var8 = ((NjL)this.f37000[1]).method_36455();
         float var9 = ((NjL)this.f37000[1]).field_6004;
         NNNVf var10 = (NNNVf)((NjL)this.f37000[1]).fields_3212a028292fd3c078969e3ee4c71d9e8[3];
         float var11 = var10.y;
         float var12 = var10.N;
         float var13 = var10.L;
         NjL var10000 = (NjL)this.f37000[1];
         Float var21 = (Float)this.f25000[0];
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var21;
         var10000 = (NjL)this.f37000[1];
         Float var22 = (Float)this.f38000[2];
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[1] = var22;
         var10000 = (NjL)this.f37000[1];
         Float var23 = (Float)this.f25000[2];
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[2] = var23;
         var10000 = (NjL)this.f37000[1];
         Float var24 = (Float)this.f25000[1];
         var10000.fields_5212a028292fd3c078969e3ee4c71d9e8[0] = var24;
         ((NjL)this.f37000[1]).method_36456((Float)this.f25000[2]);
         ((NjL)this.f37000[1]).field_5982 = (Float)this.f25000[1];
         ((NjL)this.f37000[1]).method_36457((Float)this.f25000[4]);
         ((NjL)this.f37000[1]).field_6004 = (Float)this.f25000[3];
         var10.y = (Float)this.f8000[0];
         var10.N = (Float)this.f25000[5];
         var10.L = (Float)this.f8000[1];
         boolean var40 = false /* VF: Semaphore variable */;

         label56: {
            try {
               var40 = true;
               NXi var14 = new NXi(
                  NNWE.u(var1, ((NjL)this.f37000[1]).field_6014, ((NjL)this.f37000[1]).method_23317()),
                  NNWE.u(var1, ((NjL)this.f37000[1]).field_6036, ((NjL)this.f37000[1]).method_23318()),
                  NNWE.u(var1, ((NjL)this.f37000[1]).field_5969, ((NjL)this.f37000[1]).method_23321())
               );
               List var15 = C1174.m20000((NjL)this.f37000[1], var14, var1);
               if (!var15.isEmpty()) {
                  this.f37000[2] = var15;
                  var40 = false;
               } else {
                  var40 = false;
               }
               break label56;
            } catch (Exception var41) {
               var40 = false;
            } finally {
               if (var40) {
                  var10000 = (NjL)this.f37000[1];
                  Float var34 = var2;
                  var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var34;
                  var10000 = (NjL)this.f37000[1];
                  Float var35 = var3;
                  var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[1] = var35;
                  var10000 = (NjL)this.f37000[1];
                  Float var36 = var4;
                  var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[2] = var36;
                  var10000 = (NjL)this.f37000[1];
                  Float var37 = var5;
                  var10000.fields_5212a028292fd3c078969e3ee4c71d9e8[0] = var37;
                  ((NjL)this.f37000[1]).method_36456(var6);
                  ((NjL)this.f37000[1]).field_5982 = var7;
                  ((NjL)this.f37000[1]).method_36457(var8);
                  ((NjL)this.f37000[1]).field_6004 = var9;
                  var10.y = var11;
                  var10.N = var12;
                  var10.L = var13;
               }
            }

            var10000 = (NjL)this.f37000[1];
            Float var30 = var2;
            var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var30;
            var10000 = (NjL)this.f37000[1];
            Float var31 = var3;
            var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[1] = var31;
            var10000 = (NjL)this.f37000[1];
            Float var32 = var4;
            var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[2] = var32;
            var10000 = (NjL)this.f37000[1];
            Float var33 = var5;
            var10000.fields_5212a028292fd3c078969e3ee4c71d9e8[0] = var33;
            ((NjL)this.f37000[1]).method_36456(var6);
            ((NjL)this.f37000[1]).field_5982 = var7;
            ((NjL)this.f37000[1]).method_36457(var8);
            ((NjL)this.f37000[1]).field_6004 = var9;
            var10.y = var11;
            var10.N = var12;
            var10.L = var13;
            return;
         }

         var10000 = (NjL)this.f37000[1];
         Float var26 = var2;
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[0] = var26;
         var10000 = (NjL)this.f37000[1];
         Float var27 = var3;
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[1] = var27;
         var10000 = (NjL)this.f37000[1];
         Float var28 = var4;
         var10000.fields_4212a028292fd3c078969e3ee4c71d9e8[2] = var28;
         var10000 = (NjL)this.f37000[1];
         Float var29 = var5;
         var10000.fields_5212a028292fd3c078969e3ee4c71d9e8[0] = var29;
         ((NjL)this.f37000[1]).method_36456(var6);
         ((NjL)this.f37000[1]).field_5982 = var7;
         ((NjL)this.f37000[1]).method_36457(var8);
         ((NjL)this.f37000[1]).field_6004 = var9;
         var10.y = var11;
         var10.N = var12;
         var10.L = var13;
      }
   }

   private float m62000(NXi var1) {
      double var2 = var1.M - ((NXi)this.f37000[4]).M;
      double var4 = var1.Z - ((NXi)this.f37000[4]).Z;
      float var6 = (Float)this.f25000[0];
      float var7 = var6;
      if (var2 * var2 + var4 * var4 > f7000[0]) {
         var7 = (float)NNWE.u(var4, var2) * f2000[1] - f2000[2];
         float var8 = NNWE.L(NNWE.R((Float)this.f25000[2]) - var7);
         if (f2000[3] < var8 && var8 < f2000[4]) {
            var7 -= f2000[5];
         }
      }

      var6 += NNWE.R(var7 - var6) * f2000[6];
      float var10 = NNWE.R((Float)this.f25000[2] - var6);
      if (Math.abs(var10) > f42000[0]) {
         var6 += var10 - NNWE.U(var10) * f42000[1];
      }

      return var6;
   }

   private static void m68000() {
      f19000 = new String[]{"u_projection", "u_view", "texture_in", "lightmap_in", "u_color"};
   }
}
