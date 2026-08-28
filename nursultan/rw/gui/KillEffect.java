package rw.gui;

import KDFzREm.NCj;
import KDFzREm.NGK;
import KDFzREm.NNIo;
import KDFzREm.NNNBL;
import KDFzREm.NNNBM;
import KDFzREm.NNNHB;
import KDFzREm.NNNNLk;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNNwz;
import KDFzREm.NNWE;
import KDFzREm.NNrm;
import KDFzREm.NNrv;
import KDFzREm.NNuU;
import KDFzREm.NSY;
import KDFzREm.NXi;
import KDFzREm.NjL;
import KDFzREm.Yk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0674;
import rw.core.C0011;
import rw.core.C0012;
import rw.core.C0138;
import rw.core.C0721;
import rw.core.C0830;
import rw.core.C0855;
import rw.core.C0859;
import rw.core.C0979;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C0998;
import rw.core.C1004;
import rw.core.C1183;
import rw.core.IlksOmts;
import rw.core.OlmlOlil;
import rw.core.OlsOrqs;
import rw.data.Rec0004;
import rw.data.Rec0201;
import rw.data.Rec0203;
import rw.defs.Enum0055;
import rw.defs.Enum0061;
import rw.defs.Enum0063;
import rw.module.AttackAura_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "KillEffect",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class KillEffect extends GuiWidget {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;
   private static float[] f5000;
   public Object[] f6000;
   private static float[] f7000;
   private static float[] f8000;
   private static boolean[] f9000;
   private static float[] f10000;
   public Object[] f11000;
   private static float[] f12000;
   private static boolean[] f13000;
   private static float[] f14000;
   private static boolean[] f15000;

   public KillEffect() {
      this.m6000();
      HashSet var5 = new HashSet();
      this.f6000[0] = var5;
      C0012 var6 = C0012.m96000(
            () -> ((NNuU)I1ln000j<"rjcg",-1870813470,-2134316036,-2134316035,-2134316034,-1870813470,-1870813470>(this)[0]).e().N / 2,
            () -> ((NNuU)this.y[0]).e().y / 2
         )
         .m44000((Enum0063)Enum0063.f1000[1], (Enum0063)Enum0063.f1000[1])
         .m26000((Enum0061)Enum0061.f1000[0])
         .m22000(true)
         .m40000()
         .m112000(() -> (boolean)(!this.U() ? 1 : 0));
      this.f6000[1] = var6;
      C0830 var7 = C0830.m46000((Rec0004)f2000[0], 65536);
      this.f6000[2] = var7;
      C0830 var8 = C0830.m42000((Rec0004)C0011.f5000[2], 256, 64);
      this.f6000[3] = var8;
      IlksOmts var9 = IlksOmts.<C0138>m22000()
         .m18000(new OlmlOlil(this, (C0830)this.f6000[2]))
         .m28000((C0012)this.f6000[1])
         .m34000(
            var1 -> {
               this.m6000();
               if (!(Boolean)((C0991)this.f11000[0]).i()) {
                  IlkOns.m88000(
                     ((NNuU)this.y[0]).e(),
                     (C0012)this.f6000[1],
                     0,
                     0,
                     ((NNuU)this.y[0]).e().N,
                     ((NNuU)this.y[0]).e().y,
                     0,
                     0,
                     ((C0012)this.f6000[1]).m126000(),
                     ((C0012)this.f6000[1]).m76000(),
                     256,
                     9728
                  );
               }
            }
         )
         .m32000(new C0855(this, (C0830)this.f6000[3]))
         .m4000(((NNuU)I1ln000j<"rjcg",-1870813470,-2134316036,-2134316035,-2134316034,-1870813470,-1870813470>(this)[0])::e)
         .m10000((C0012)this.f6000[1])
         .m52000();
      this.f6000[4] = var9;
      C0991 var10 = C0122.m26000(this, f3000[0], false);
      this.f11000[0] = var10;
      C0998 var11 = C0122.m6000(this, f3000[1], -11104513);
      this.f11000[1] = var11;
      C0988 var12 = C0122.m12000(this, f3000[2], f12000[0], f12000[1], f12000[2], f12000[3]);
      this.f11000[2] = var12;
      C1004 var13 = C0122.m10000(this, f3000[3], new C0979(f12000[4], f14000[0]), new C0979(f14000[1], f7000[0]), f7000[1]);
      this.f11000[3] = var13;
      ArrayList var14 = new ArrayList();
      this.f11000[4] = var14;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[5];
         Object[] var1 = this.f6000;
      }

      if (this.f11000 == null) {
         this.f11000 = new Object[8];
         Object[] var2 = this.f11000;
         var2[6] = Integer.valueOf(f15000[3]);
         var2[7] = f15000[4];
      }
   }

   private static void m8000() {
      f13000 = new boolean[]{true, false, false, false, false, true, true, false};
      f4000 = new boolean[]{true, true, false, true, false, false, false};
      f1000 = new boolean[]{false, true, false, false, true, true};
      f9000 = new boolean[]{false, true, true, true, true};
      f15000 = new boolean[]{true, true, true, false, false};
   }

   private static void m12000() {
      f2000 = new Object[]{null, null, null, 100};
   }

   private static void m10000() {
      f12000 = new float[]{30.0F, 5.0F, 50.0F, 1.0F, 4.0F};
      f14000 = new float[]{12.0F, 5.0F};
      f7000 = new float[]{8.0F, 1.0F, 0.0F, -1.0F, -1.0F, 1.0F, 0.9375F};
      f5000 = new float[]{0.9375F, 0.9375F, 0.0F, -1.501F, 0.0F};
      f8000 = new float[]{0.0F, 0.0F, 16.0F, 16.0F, 16.0F, 0.1F, 1.0F, 20.0F};
      f10000 = new float[]{20.0F, 16.0F, 16.0F, 16.0F, 0.0F};
   }

   private void m16000() {
      this.m6000();
      if ((Boolean)this.f11000[7] && NursultanClient.m74000().m10000() - (Integer)this.f11000[6] < 3) {
         ((List)this.f11000[4]).add(new Rec0203((NjL)this.f11000[5], NursultanClient.m74000().m10000()));
         Object var5 = null;
         this.f11000[5] = var5;
      }
   }

   @Iface0642
   public void m26000(AttackAura_x var1) {
      this.m6000();
      if (var1.m2000() instanceof NjL var2 && var2 != (NNNwS)((NNuU)this.y[0]).T[4]) {
         this.f11000[5] = var2;
         Integer var9 = NursultanClient.m74000().m10000();
         this.f11000[6] = var9;
         Boolean var10 = false;
         this.f11000[7] = var10;
      }
   }

   @Iface0642
   public void m28000(rw.module.AutoAccept var1) {
      switch (var1.m6000()) {
         case NNNHB var4:
            ((NNuU)this.y[0])
               .execute(
                  () -> {
                     this.m6000();
                     if ((NjL)this.f11000[5] != null
                        && ((NjL)this.f11000[5]).method_5628() == var4.N()
                        && NursultanClient.m74000().m10000() - (Integer)this.f11000[6] < 3) {
                        Boolean var6x = true;
                        this.f11000[7] = var6x;
                     }
                  }
               );
            break;
         case NCj var5:
            ((NNuU)this.y[0])
               .execute(
                  () -> {
                     this.m6000();
                     if (var5.N() == 3
                        && (NNNZg)((NNuU)this.y[0]).T[3] != null
                        && (NjL)this.f11000[5] != null
                        && var5.N((NNNZg)((NNuU)this.y[0]).T[3]) == (NjL)this.f11000[5]) {
                        this.m16000();
                     }
                  }
               );
            break;
         case NSY var6:
            ((NNuU)this.y[0]).execute(() -> var6.N().forEach(var1xx -> {
               this.m6000();
               if ((NjL)this.f11000[5] != null && ((NjL)this.f11000[5]).method_5628() == var1xx) {
                  this.m16000();
               }
            }));
            break;
         default:
      }
   }

   @Iface0642
   public void m30000(C0721 var1) {
      this.m6000();
      int var2 = NursultanClient.m74000().m10000();
      if (!((List)this.f11000[4]).isEmpty()) {
         ((List)this.f11000[4]).removeIf(var2x -> {
            NjL var3x = var2x.m4000();
            if ((Integer)var3x.fields_2212a028292fd3c078969e3ee4c71d9e8[2] <= 0 && !var3x.method_31481()) {
               return (boolean)(var2 - var2x.m6000() > 100 ? 1 : 0);
            } else {
               this.m38000(var3x);
               return (boolean)1;
            }
         });
      }

      if (!((Set)this.f6000[0]).isEmpty()) {
         Iterator var3 = ((Set)this.f6000[0]).iterator();

         while (var3.hasNext()) {
            List var4 = ((C0859)var3.next()).m18000();
            var4.removeIf(var0 -> {
               var0.m18000();
               return var0.m24000();
            });
            if (var4.isEmpty()) {
               var3.remove();
            }
         }
      }
   }

   private void m36000(NjL var1, C0859 var2, int var3) {
      if (((NNuU)this.y[0]).Ng().N(var1) instanceof NNNNLk var5) {
         Yk var7 = (Yk)var5.method_55269();
         var5.N(var1, var7, f7000[2]);
         NNrv var8 = ((Iface0674)var5).m2000();
         var8.method_2819(var7);
         NNIo var10 = new NNIo();
         float var11 = var7.NL;
         var10.y(var11, var11, var11);
         ((Iface0674)var5).m4000(var7, var10, var7.x, var11);
         var10.y(f7000[3], f7000[4], f7000[5]);
         ((Iface0674)var5).m6000(var7, var10);
         if (var1 instanceof NNNwz) {
            var10.y(f7000[6], f5000[0], f5000[1]);
         }

         var10.N(f5000[2], f5000[3], f5000[4]);
         NNNBL var12 = var8.method_63512();
         ArrayList var13 = new ArrayList();
         AtomicReference var14 = new AtomicReference<>(f8000[0]);
         var12.N(var10, (var2x, var3x, var4, var5x) -> {
            float var6 = (var5x.i - var5x.y) / f10000[1];
            float var7x = (var5x.R - var5x.L) / f10000[2];
            float var8x = (var5x.M - var5x.u) / f10000[3];
            float var9 = var6 * var7x * var8x;
            if (!(var9 <= f10000[4])) {
               var13.add(new Rec0201(new Matrix4f(var2x.N()), var5x, var9));
               var14.set((Float)var14.get() + var9);
            }
         });
         if (!var13.isEmpty() && !((Float)var14.get() <= f8000[1])) {
            float var15 = (Float)var14.get();
            AtomicInteger var16 = new AtomicInteger(var3);
            NNrm var17 = var1.method_59922();

            for (int var18 = 0; var18 < var13.size(); var18++) {
               Rec0201 var19 = (Rec0201)var13.get(var18);
               int var20;
               if (var18 == var13.size() - 1) {
                  var20 = var16.get();
               } else {
                  float var21 = var19.f2000 / var15;
                  var20 = Math.max(1, Math.round(var3 * var21));
                  var20 = Math.min(var20, var16.get());
               }

               if (var20 > 0) {
                  var16.addAndGet(-var20);
                  this.m42000(var1, var2, var19.f1000, var19.f3000, var20, var17);
               }
            }
         }
      }
   }

   private void m38000(NjL var1) {
      this.m6000();
      if (!(var1 instanceof NGK)) {
         C0859 var2 = new C0859(var1);
         if (((Set)this.f6000[0]).add(var2)) {
            this.m36000(var1, var2, ((Float)((C0988)this.f11000[2]).i()).intValue() * 10);
         }
      }
   }

   private void m42000(NjL var1, C0859 var2, Matrix4f var3, NNNBM var4, int var5, NNrm var6) {
      this.m6000();
      double var7 = var1.method_23317();
      double var9 = var1.method_23318();
      double var11 = var1.method_23321();

      for (int var13 = 0; var13 < var5; var13++) {
         float var14 = NNWE.N(var6, var4.y, var4.i) / f8000[2];
         float var15 = NNWE.N(var6, var4.L, var4.R) / f8000[3];
         float var16 = NNWE.N(var6, var4.u, var4.M) / f8000[4];
         Vector3f var17 = new Vector3f(var14, var15, var16);
         Vector3f var18 = var3.transformPosition(var17, new Vector3f());
         double var19 = var7 + var18.x();
         double var21 = var9 + var18.y();
         double var23 = var11 + var18.z();
         NXi var25 = new NXi(var19, var21, var23);
         var2.m18000()
            .add(
               new OlsOrqs(
                  var25,
                  var25,
                  C1183.m18000(f8000[5], f8000[6]),
                  C1183.m24000((int)(f8000[7] * ((C0979)((C1004)this.f11000[3]).i()).m32000()), (int)(f10000[0] * ((C0979)((C1004)this.f11000[3]).i()).m2000()))
               )
            );
      }
   }

   @Iface0642
   public void m46000(C0138 var1) {
      this.m6000();
      if (!((Set)this.f6000[0]).isEmpty()) {
         ((IlksOmts)this.f6000[4]).m8000(var1);
      }
   }

   private static void m52000() {
      f3000 = new String[]{"behind-walls", "color", "count", "duration"};
   }
}
