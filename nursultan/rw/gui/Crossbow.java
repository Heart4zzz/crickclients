package rw.gui;

import KDFzREm.NHS;
import KDFzREm.NNNNRZ;
import KDFzREm.NNNNuO;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNtL;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NQa;
import KDFzREm.NQo;
import KDFzREm.NQy;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NbL;
import KDFzREm.Nef;
import KDFzREm.NjL;
import KDFzREm.wY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0602;
import rw.api.Iface0642;
import rw.core.C0138;
import rw.core.C0805;
import rw.core.C0811;
import rw.core.C0814;
import rw.core.C0836;
import rw.core.C0837;
import rw.core.C0849;
import rw.core.C0854;
import rw.core.C0876;
import rw.core.C0998;
import rw.core.C1003;
import rw.data.Rec0199;
import rw.data.Rec0200;
import rw.data.Rec0202;
import rw.data.Rec0204;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Trajectory",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class Crossbow extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static double[] f6000;
   private static float[] f7000;
   private static double[] f8000;
   public Object[] f9000;
   private static short[] f10000;
   private static float[] f11000;
   private static short[] f12000;
   private static float[] f13000;
   private static float[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static float[] f19000;
   private static float[] f20000;
   private static double[] f21000;
   private static double[] f22000;
   private static float[] f23000;
   private static float[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static double[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   private static short[] f30000;
   private static short[] f31000;
   private static float[] f32000;
   private static short[] f33000;
   private static short[] f34000;
   private static float[] f35000;
   public Object[] f36000;
   private static float[] f37000;
   private static short[] f38000;
   private static short[] f39000;
   public static Object[] f40000;
   private static short[] f41000;
   private static short[] f42000;
   private static float[] f43000;
   private static float[] f44000;
   private static short[] f45000;
   private static short[] f46000;
   private static short[] f47000;
   private static String[] f48000;
   private static double[] f49000;

   private static void m4000() {
      f8000 = new double[]{0.0, 0.0, 1.0, 0.0, 1.0E-6, 1.0E-6};
      f49000 = new double[]{0.5, 1.0E-6, 0.5};
      f6000 = new double[]{1.0E-6, 0.5, 0.0, 0.0};
      f21000 = new double[]{0.0, 0.0, 0.0, 0.0};
      f22000 = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
      f27000 = new double[]{0.0, 0.0, 0.0};
   }

   private static void m6000() {
      f40000 = new Object[]{4.0F};
   }

   public Crossbow() {
      this.m14000();
      C0854 var5 = new C0854(f48000[0], true, new C0837((Rec0200)Rec0200.f5000[2], Iface0602.f1000));
      this.f36000[0] = var5;
      C0854 var6 = new C0854(f48000[1], true, new C0849((Rec0200)Rec0200.f5000[1], Iface0602.f1000));
      this.f36000[1] = var6;
      C0854 var7 = new C0854(f48000[2], true, new C0849((Rec0200)Rec0200.f5000[0], Iface0602.f1000));
      this.f36000[2] = var7;
      C0854 var8 = new C0854(f48000[3], true, new C0837((Rec0200)Rec0200.f5000[3], Iface0602.f1000));
      this.f36000[3] = var8;
      C0854 var9 = new C0854(f1000[0], true, new C0849((Rec0200)Rec0200.f5000[0], Iface0602.f1000));
      this.f36000[4] = var9;
      C0854 var10 = new C0854(f1000[1], true, new C0837((Rec0200)Rec0200.f5000[4], Iface0602.f1000));
      this.f9000[0] = var10;
      C0854 var11 = new C0854(f1000[2], true, new C0837((Rec0200)Rec0200.f5000[5], Iface0602.f1000));
      this.f9000[1] = var11;
      C1003 var12 = C0122.m4000(
         this,
         f1000[3],
         (C0854)this.f36000[1],
         (C0854)this.f36000[0],
         (C0854)this.f36000[2],
         (C0854)this.f36000[f25000[0]],
         (C0854)this.f36000[f25000[1]],
         (C0854)this.f9000[f25000[2]],
         (C0854)this.f9000[f25000[3]]
      );
      this.f9000[f25000[4]] = var12;
      C0998 var13 = C0122.m6000(this, f1000[4], -11104513);
      this.f9000[f25000[5]] = var13;
      C0998 var14 = C0122.m6000(this, f1000[5], -43691);
      this.f9000[f25000[6]] = var14;
      NXi var15 = NXi.L;
      this.f9000[5] = var15;
      NXi var16 = NXi.L;
      this.f9000[6] = var16;
      Integer var17 = 0;
      this.f2000[0] = var17;
      Integer var18 = 0;
      this.f2000[1] = var18;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f32000 = new float[]{1.0F, (float) (Math.PI / 180.0), 0.15F};
      f24000 = new float[]{(float) (Math.PI / 180.0), 0.15F, 1.0F};
      f13000 = new float[]{5.0F, 255.0F};
      f44000 = new float[]{1.0F, 5.0F, 255.0F, 0.0F, 0.0F, 0.0F, 1.0F};
      f20000 = new float[]{0.0F, 0.6F, (float) (Math.PI * 2), 0.7F, 1.0F};
      f37000 = new float[]{0.6F, 0.196F, 2.0F};
      f43000 = new float[]{0.0F, 2.0F, 2.0F, 2.0F};
      f11000 = new float[]{0.0F, 2.5F, 0.0F};
      f19000 = new float[]{1.5F, 1.0F, (float) (Math.PI / 180.0), 1.0F};
      f4000 = new float[]{3.15F, 0.0F, 1.0F, 3.0F, 0.0F, -20.0F};
      f35000 = new float[]{0.5F, 4.0F, 0.0F};
      f23000 = new float[]{1.5F, 0.0F, 1.5F, (float) (Math.PI / 180.0)};
      f7000 = new float[]{(float) (Math.PI / 180.0), (float) (Math.PI / 180.0), (float) (Math.PI / 180.0), (float) (Math.PI / 180.0), 20.0F};
      f14000 = new float[]{2.0F, 3.0F, 1.0F, 4.0F};
   }

   private int m14000() {
      if ((NNNwS)((NNuU)this.y[0]).T[4] == null) {
         return 0;
      } else {
         for (NbL var4 : NbL.values()) {
            NQo var5 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var4);
            if (var5.N(NQa.sx)) {
               return var5.N((NNNwS)((NNuU)this.y[0]).T[4]) - ((NNNwS)((NNuU)this.y[0]).T[4]).method_6014();
            }
         }

         return 0;
      }
   }

   private static void m12000() {
      f48000 = new String[]{"pearl", "trident", "bow", "potions"};
      f1000 = new String[]{"crossbow", "snowball", "windcharge", "predict-entity", "line-color", "hit-line-color"};
   }

   private static void m16000() {
      f46000 = new short[]{2, 0, 1, 1};
      f5000 = new short[]{0, 2};
      f10000 = new short[]{3, 3, 0, 4};
      f39000 = new short[]{4, 0, 5, 1, 1, 0, 2};
      f25000 = new short[]{4, 3, 0, 1, 2, 3, 4};
      f30000 = new short[]{5, 6, 0, 1};
      f29000 = new short[]{6, 5, 6, 1, 0, 1, 5, 6};
      f31000 = new short[]{0, 1};
      f45000 = new short[]{0, 0, 4};
      f15000 = new short[]{2, 3, 4, 4};
      f16000 = new short[]{3, 0};
      f3000 = new short[]{3, 0, 4, 0, 4, 0};
      f28000 = new short[]{4, 0, 4, 0, 4};
      f34000 = new short[]{0, 4};
      f33000 = new short[]{0, 4, 0};
      f47000 = new short[]{4, 1, 0, 4, 1, 0, 0};
      f38000 = new short[]{4, 0, 4};
      f18000 = new short[]{0, 4, 0, 4};
      f17000 = new short[]{4, 2, 0, 4, 2, 3};
      f26000 = new short[]{0, 4, 3, 0, 0, 4, 0};
      f12000 = new short[]{1, 0, 4, 1, 0};
      f42000 = new short[]{4, 0};
      f41000 = new short[]{4, 0, 4, 0, 4, 0, 4};
   }

   private void m14000() {
      if (this.f36000 == null) {
         this.f36000 = new Object[5];
         Object[] var1 = this.f36000;
      }

      if (this.f9000 == null) {
         this.f9000 = new Object[7];
         Object[] var2 = this.f9000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[2];
         Object[] var3 = this.f2000;
         var3[0] = 0;
         var3[1] = 0;
      }
   }

   private void m22000(C0805 var1, Matrix4fStack var2, int var3) {
      float var4 = f37000[0];
      C0811 var5 = var1.m38000();
      int var6 = var5.m16000();
      NXi var7 = new NXi(var4, f22000[1], f22000[2]);
      NXi var8 = new NXi(f22000[3], f22000[4], var4);
      NXi var9 = new NXi(-var4, f22000[5], f22000[6]);
      NXi var10 = new NXi(f27000[0], f27000[1], -var4);
      int var11 = C0876.m70000(var3, (int)(C0876.m46000(var3) * f37000[1] * f37000[2]));
      var5.m42000(var2, (float)var7.M, (float)var7.B, (float)var7.Z).m26000(var11).m28000();
      var5.m42000(var2, (float)var8.M, (float)var8.B, (float)var8.Z).m26000(var11).m28000();
      var5.m42000(var2, (float)var9.M, (float)var9.B, (float)var9.Z).m26000(var11).m28000();
      var5.m42000(var2, (float)var10.M, (float)var10.B, (float)var10.Z).m26000(var11).m28000();
      var1.m4000().m18000(var6);
   }

   private List<Rec0204> m24000(NXi var1, float var2) {
      this.m14000();
      float var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_36455();
      float var4 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_36454();
      NXi var5 = new NXi(
         IlkOns.m26000((NNNwS)((NNuU)this.y[0]).T[4]),
         IlkOns.m34000((NNNwS)((NNuU)this.y[0]).T[4]) + ((NNNwS)((NNuU)this.y[0]).T[4]).method_18381(((NNNwS)((NNuU)this.y[0]).T[4]).method_18376()),
         IlkOns.m4000((NNNwS)((NNuU)this.y[0]).T[4])
      );

      for (NbL var9 : NbL.values()) {
         NQo var10 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5998(var9);
         if (var10.N(NQa.db) && ((C0854)this.f36000[1]).U()) {
            return List.of(new Rec0204(var5, m36000((NNNwS)((NNuU)this.y[0]).T[4], var1, var3, var4, f11000[0], f11000[1]), ((C0854)this.f36000[1]).m2000()));
         }

         if (var10.N(NQa.nz) && ((C0854)this.f36000[0]).U()) {
            return List.of(new Rec0204(var5, m36000((NNNwS)((NNuU)this.y[0]).T[4], var1, var3, var4, f11000[2], f19000[0]), ((C0854)this.f36000[0]).m2000()));
         }

         if (var10.N(NQa.dw) && ((C0854)this.f36000[4]).U()) {
            if (!NQy.u(var10)) {
               return Collections.emptyList();
            }

            int[] var22;
            if (((NNNNuO)var10.a_(NNNNRZ.x, NNNNuO.N)).N().size() == 1) {
               var22 = new int[]{0};
            } else {
               var22 = new int[]{-10, 0, 10};
            }

            ArrayList var12 = new ArrayList();

            for (int var16 : var22) {
               NXi var17 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_18864(f19000[1]);
               Quaternionf var18 = new Quaternionf().setAngleAxis(var16 * f19000[2], var17.M, var17.B, var17.Z);
               NXi var19 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5828(f19000[3]);
               Vector3f var20 = var19.W().rotate(var18);
               NXi var21 = m40000(var20.x, var20.y, var20.z, f4000[0]);
               var12.add(new Rec0204(var5, var21, ((C0854)this.f36000[4]).m2000()));
            }

            return var12;
         }

         if (var10.N(NQa.sx) && ((C0854)this.f36000[2]).U()) {
            float var11 = var2 <= f4000[1] ? f4000[2] : m28000(var2) * f4000[3];
            return List.of(new Rec0204(var5, m36000((NNNwS)((NNuU)this.y[0]).T[4], var1, var3, var4, f4000[4], var11), ((C0854)this.f36000[2]).m2000()));
         }

         if (var10.N(NQa.lO) && ((C0854)this.f36000[3]).U()) {
            return List.of(
               new Rec0204(var5, m36000((NNNwS)((NNuU)this.y[0]).T[4], var1, var3, var4, f4000[5], f35000[0]), ((C0854)this.f36000[3]).m2000(), f35000[1])
            );
         }

         if (var10.N(NQa.jP) && ((C0854)this.f9000[0]).U()) {
            return List.of(new Rec0204(var5, m36000((NNNwS)((NNuU)this.y[0]).T[4], var1, var3, var4, f35000[2], f23000[0]), ((C0854)this.f9000[0]).m2000()));
         }

         if (var10.N(NQa.Gz) && ((C0854)this.f9000[1]).U()) {
            return List.of(new Rec0204(var5, m36000((NNNwS)((NNuU)this.y[0]).T[4], var1, var3, var4, f23000[1], f23000[2]), ((C0854)this.f9000[1]).m2000()));
         }
      }

      return Collections.emptyList();
   }

   private static float m28000(float var0) {
      float var1 = var0 / f7000[4];
      var1 = (var1 * var1 + var1 * f14000[0]) / f14000[1];
      return Math.min(var1, f14000[2]);
   }

   private void m30000(C0805 var1, Matrix4fStack var2, NXi var3, NXi var4, NXi var5, int var6, int var7, float var8) {
      NXi var9 = var4.u(var3);
      NXi var10 = var5.u(var3);
      var1.m38000()
         .m42000(var2, (float)var9.M, (float)var9.B, (float)var9.Z)
         .m42000(var2, (float)var10.M, (float)var10.B, (float)var10.Z)
         .m26000(var6)
         .m26000(var7)
         .m30000(var8)
         .m28000();
   }

   @Iface0642
   public void m32000(rw.module.AttackAura var1) {
      this.m14000();
      NXi var6 = (NXi)this.f9000[6];
      this.f9000[5] = var6;
      NXi var7 = wY.y();
      this.f9000[6] = var7;
      Integer var8 = (Integer)this.f2000[1];
      this.f2000[0] = var8;
      Integer var9 = this.m14000();
      this.f2000[1] = var9;
   }

   private int m34000(Rec0202 var1, float var2) {
      this.m14000();
      if (var1.m6000().isPresent()) {
         Rec0199 var3 = var1.m6000().get();
         if (var3.m8000() instanceof NNtL) {
            return (Integer)((C0998)this.f9000[4]).i();
         }

         if (var2 > f43000[0] && this.m38000(var3.m10000(), var2)) {
            return (Integer)((C0998)this.f9000[4]).i();
         }
      }

      return (Integer)((C0998)this.f9000[3]).i();
   }

   public static NXi m36000(NbK var0, NXi var1, float var2, float var3, float var4, float var5) {
      float var6 = -NNWE.m(var3 * f23000[3]) * NNWE.P(var2 * f7000[0]);
      float var7 = -NNWE.m((var2 + var4) * f7000[1]);
      float var8 = NNWE.P(var3 * f7000[2]) * NNWE.P(var2 * f7000[3]);
      NXi var9 = m40000(var6, var7, var8, var5);
      return var9.y(var1.M, var0.method_24828() ? f27000[2] : var1.B, var1.Z);
   }

   private boolean m38000(NXi var1, float var2) {
      NHS var3 = NHS.N(var1, var2 * f43000[1], var2 * f43000[2], var2 * f43000[3]);
      double var4 = var2 * var2;
      return (boolean)(!((NNNZg)((NNuU)this.y[0]).T[3])
            .N(NjL.class, var3, var4x -> (boolean)(var4x != (NNNwS)((NNuU)this.y[0]).T[4] && var4x.method_5805() && var4x.method_5707(var1) <= var4 ? 1 : 0))
            .isEmpty()
         ? 1
         : 0);
   }

   public static NXi m40000(double var0, double var2, double var4, float var6) {
      return new NXi(var0, var2, var4).u().L(var6);
   }

   @Iface0642
   public void m44000(C0138 var1) {
      this.m14000();
      float var2 = var1.m20000().N(true);
      NXi var3 = ((NXi)this.f9000[5]).L(f32000[0] - var2).i(((NXi)this.f9000[6]).L(var2));
      float var4 = ((Integer)this.f2000[0]).intValue() + ((Integer)this.f2000[1] - (Integer)this.f2000[0]) * var2;
      List var5 = this.m24000(var3, var4);
      if (!var5.isEmpty()) {
         ArrayList var6 = new ArrayList();

         for (Rec0204 var8 : var5) {
            var6.add(var8.m10000());
         }

         float var54 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_36454();
         NXi var55 = new NXi(-NNWE.P(var54 * f32000[1]) * f32000[2], f8000[0], -NNWE.m(var54 * f24000[0]) * f24000[1]);
         C0805 var9 = (C0805)C0814.f12000[2];
         C0805 var10 = (C0805)C0814.f15000[3];
         Matrix4fStack var11 = var1.m36000();
         NXi var12 = var1.m24000().y();

         for (int var13 = 0; var13 < var6.size(); var13++) {
            Rec0202 var14 = (Rec0202)var6.get(var13);
            int var15 = this.m34000(var14, ((Rec0204)var5.get(var13)).m8000());
            List var16 = var14.m4000();
            if (!var16.isEmpty()) {
               NXi var17 = (NXi)var16.getFirst();
               NXi var18 = var14.m6000().map(Rec0199::m10000).orElse((NXi)var16.getLast());
               Quaternionf var19 = new Quaternionf()
                  .rotationTo(
                     new Vector3f((float)(var17.M - var18.M), (float)(var17.B - var18.B), (float)(var17.Z - var18.Z)),
                     new Vector3f((float)(var17.M + var55.M - var18.M), (float)(var17.B + var55.B - var18.B), (float)(var17.Z + var55.Z - var18.Z))
                  );
               var11.pushMatrix();
               var11.translate((float)(var18.M - var12.M), (float)(var18.B - var12.B), (float)(var18.Z - var12.Z));
               var11.rotate(var19);
               var11.translate((float)(var12.M - var18.M), (float)(var12.B - var18.B), (float)(var12.Z - var18.Z));
               NXi var20 = (NXi)var16.getFirst();

               for (int var21 = 1; var21 < var16.size(); var21++) {
                  NXi var22 = (NXi)var16.get(var21);
                  this.m30000(
                     var9,
                     var11,
                     var12,
                     var20,
                     var22,
                     C0876.m70000(var15, (int)(Math.min(f24000[2], (var21 - 1) / f13000[0]) * f13000[1])),
                     C0876.m70000(var15, (int)(Math.min(f44000[0], var21 / f44000[1]) * f44000[2])),
                     f44000[3]
                  );
                  var20 = var22;
               }

               var11.popMatrix();
               if (!var14.m6000().isEmpty()) {
                  Rec0199 var56 = var14.m6000().get();
                  float var57 = ((Rec0204)var5.get(var13)).m8000();
                  if (var57 > f44000[4]) {
                     C0836.m36000(var12, var56.m10000(), var57, var15);
                  } else {
                     NXi var23 = new NXi(f8000[1], f8000[2], f8000[3]);
                     if (var56.m8000() instanceof NNty var24) {
                        Nef var60 = var24.i();
                        var23 = new NXi(var60.P(), var60.s(), var60.T());
                     } else if (var56.m8000() instanceof NNtL var25) {
                        NbK var62 = var25.L();
                        NXi var27 = var25.y();
                        NHS var28 = var62.method_5829().M(f8000[4]);
                        double var29 = Math.max(f8000[5], f49000[0] * var28.y());
                        double var31 = Math.max(f49000[1], f49000[2] * var28.L());
                        double var33 = Math.max(f6000[0], f6000[1] * var28.u());
                        NXi var35 = var28.R();
                        double var36 = var27.M - var35.M;
                        double var38 = var27.B - var35.B;
                        double var40 = var27.Z - var35.Z;
                        double var42 = var36 / var29;
                        double var44 = var38 / var31;
                        double var46 = var40 / var33;
                        double var48 = Math.abs(var42);
                        double var50 = Math.abs(var44);
                        double var52 = Math.abs(var46);
                        if (var48 >= var50 && var48 >= var52) {
                           var23 = new NXi(Math.signum(var36), f6000[2], f6000[3]);
                        } else if (var50 >= var48 && var50 >= var52) {
                           var23 = new NXi(f21000[0], Math.signum(var38), f21000[1]);
                        } else {
                           var23 = new NXi(f21000[2], f21000[3], Math.signum(var40));
                        }
                     }

                     NXi var59 = var56.m10000();
                     var23 = var23.u();
                     var11.pushMatrix();
                     var11.translate((float)(var59.M - var12.M), (float)(var59.B - var12.B), (float)(var59.Z - var12.Z));
                     var11.rotate(
                        new Quaternionf().rotateTo(new Vector3f(f44000[5], f44000[6], f20000[0]), new Vector3f((float)var23.M, (float)var23.B, (float)var23.Z))
                     );
                     this.m22000(var10, var11, var15);
                     this.m48000(var9, var11, var15);
                     var11.popMatrix();
                  }
               }
            }
         }

         C0836.m40000(var1);
      }
   }

   private void m48000(C0805 var1, Matrix4fStack var2, int var3) {
      float var4 = f20000[1];
      byte var5 = 4;
      double var6 = f20000[2] / var5;
      NXi var8 = null;

      for (int var9 = 0; var9 <= var5; var9++) {
         double var10 = var9 * var6;
         float var12 = (float)(Math.cos(var10) * var4);
         float var13 = (float)(Math.sin(var10) * var4);
         NXi var14 = new NXi(var12, f22000[0], var13);
         if (var8 != null) {
            int var15 = C0876.m64000(var3, f20000[3]);
            this.m30000(var1, var2, NXi.L, var8, var14, var15, var15, f20000[4]);
         }

         var8 = var14;
      }
   }
}
