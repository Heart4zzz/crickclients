package rw.core;

import KDFzREm.NNuU;
import KDFzREm.NxU;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.function.IntSupplier;
import rw.data.Rec0004;
import rw.gui.IlkOns;
import rw.setting.IlrkrIijk;
import rw.setting.Invprojection;

public class C0843 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   public static Object[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   private static short[] f14000;

   private static void m2000() {
      f1000 = new short[]{2, 4096, 1024, 0};
      f13000 = new short[]{1, 2, 3, 4};
      f6000 = new short[]{5, 6, 0};
      f5000 = new short[]{2, 6, 0};
      f2000 = new short[]{3, 2, 0, 4, 3};
      f11000 = new short[]{0, 5, 4, 0, 0, 4, 5, 0};
      f3000 = new short[]{1, 5, 4, 0, 0, 5};
      f9000 = new short[]{6, 7, 0, 0, 0};
      f14000 = new short[]{1, 1, 1, 1, 1, 7, 1, 0};
      f7000 = new short[]{0, 0, 0, 0, 0};
      f12000 = new short[]{0, 0, 0, 0};
   }

   public C0843() {
      this.m24000();
      C0830 var5 = C0830.m42000((Rec0004)C0011.f5000[2], 4096, 1024);
      this.f8000[0] = var5;
      C0862 var6 = new C0862();
      this.f8000[1] = var6;
      C0012 var7 = KrHa.m42000(() -> ((NNuU)f10000[0]).Nt().U() / 2, () -> ((NNuU)f10000[0]).Nt().E() / 2);
      this.f8000[2] = var7;
      C0012 var8 = KrHa.m42000(() -> ((NNuU)f10000[0]).Nt().U() / 2, () -> ((NNuU)f10000[0]).Nt().E() / 2);
      this.f8000[3] = var8;
      C0012 var9 = KrHa.m2000(() -> ((NNuU)f10000[0]).Nt().U() / 2, () -> ((NNuU)f10000[0]).Nt().E() / 2);
      this.f8000[4] = var9;
      C0012 var10 = KrHa.m2000(() -> ((NNuU)f10000[0]).Nt().U() / 4, () -> ((NNuU)f10000[0]).Nt().E() / 4);
      this.f8000[5] = var10;
      IntSupplier var11 = () -> IlkOns.m46000(((NNuU)f10000[0]).e());
      this.f8000[6] = var11;
      IlksOmts var12 = IlksOmts.<C0862>m22000()
         .m18000(new IlrkrIijk((C0830)this.f8000[0]))
         .m36000((C0012)this.f8000[2])
         .m50000(() -> IlkOns.m74000(((NNuU)f10000[0]).e()))
         .m46000(33990, (IntSupplier)this.f8000[6])
         .m32000(new C0857((C0830)this.f8000[0]))
         .m36000((C0012)this.f8000[3])
         .m10000((C0012)this.f8000[2])
         .m32000(new C0850((C0830)this.f8000[0], f4000[0]))
         .m36000((C0012)this.f8000[4])
         .m10000((C0012)this.f8000[3])
         .m32000(new C0850((C0830)this.f8000[0], f4000[1]))
         .m36000((C0012)this.f8000[5])
         .m10000((C0012)this.f8000[4])
         .m32000(new rw.setting.C0102((C0830)this.f8000[0], (float[])rw.setting.C0102.f9000[0], f4000[2]))
         .m36000((C0012)this.f8000[4])
         .m10000((C0012)this.f8000[5])
         .m32000(new rw.setting.C0102((C0830)this.f8000[0], (float[])rw.setting.C0102.f9000[1], f4000[3]))
         .m36000((C0012)this.f8000[5])
         .m10000((C0012)this.f8000[4])
         .m32000(new Invprojection((C0830)this.f8000[0]))
         .m4000(((NNuU)f10000[0])::e)
         .m10000((C0012)this.f8000[5])
         .m46000(33990, (IntSupplier)this.f8000[f9000[0]])
         .m52000();
      this.f8000[f9000[1]] = var12;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f10000 = new Object[]{null};
   }

   private void m24000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[8];
         Object[] var1 = this.f8000;
      }
   }

   public void m42000(C0138 var1, int var2, float var3, int var4, FloatBuffer var5) {
      NxU var6 = ((NNuU)f10000[f9000[2]]).e();
      int var7 = ((NNuU)f10000[f9000[3]]).Nt().U();
      int var8 = ((NNuU)f10000[f9000[4]]).Nt().E();
      ((C0862)this.f8000[1]).m58000().setOrtho(f4000[4], var6.N, var6.y, f4000[5], f4000[6], f4000[7]);
      ((C0862)this.f8000[1]).m2000().set(var1.m12000()).invert();
      ((C0862)this.f8000[1]).m44000().set(var1.m26000()).invert();
      ((C0862)this.f8000[1]).m8000().set(RenderSystem.getModelViewMatrix());
      ((C0862)this.f8000[1]).m36000(var6.N).m38000(var6.y).m48000(var7).m4000(var8).m40000(var3).m6000(var2).m50000(var4).m52000(var5);
      ((IlksOmts)this.f8000[7]).m8000((C0862)this.f8000[1]);
   }

   private static void m48000() {
      f4000 = new float[]{1.0F, 2.0F, 4.0F, 4.0F, 0.0F, 0.0F, -1.0F, 1.0F};
   }
}
