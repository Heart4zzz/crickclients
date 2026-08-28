package rw.gui;

import KDFzREm.NNNYO;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNde;
import KDFzREm.NNiz;
import KDFzREm.NNnC;
import KDFzREm.NNnS;
import KDFzREm.NNnf;
import KDFzREm.NNty;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NcZ;
import KDFzREm.Ned;
import KDFzREm.ow;
import KDFzREm.wY;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.pathing.goals.GoalBlock;
import org.joml.Vector2f;
import org.joml.Vector3d;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0704;
import rw.core.C0710;
import rw.core.C0718;
import rw.core.C0721;
import rw.core.C0806;
import rw.core.C0988;
import rw.core.C0991;
import rw.core.C1181;
import rw.core.C1183;
import rw.defs.Enum0055;
import rw.defs.Enum0072;
import rw.defs.Enum0081;
import rw.defs.OlmmOsl;
import rw.module.AttackAura_x_x;
import rw.module.OlpnniIl;
import rw.setting.C0122;

@AnnotationDefault(
   L = "FreeCamera",
   y = Enum0055.MOVEMENT,
   N = Enum0070.TOOLS
)
public class FreeCamera extends GuiWidget {
   private static float[] f1000;
   private static float[] f2000;
   public Object[] f3000;
   private static float[] f4000;
   private static double[] f5000;
   private static String[] f6000;
   private static float[] f7000;
   private static float[] f8000;

   public FreeCamera() {
      this.m16000();
      C0988 var5 = C0122.m12000(this, f6000[0], f7000[0], f7000[1], f7000[2], f7000[3]);
      this.f3000[0] = var5;
      C0988 var6 = C0122.m12000(this, f6000[1], f4000[0], f4000[1], f4000[2], f4000[3]);
      this.f3000[1] = var6;
      C0991 var7 = C0122.m26000(this, f6000[2], false);
      this.f3000[2] = var7;
      C0991 var8 = C0122.m26000(this, f6000[3], true);
      this.f3000[3] = var8;
      Vector3d var9 = new Vector3d(f5000[0], f5000[1], f5000[2]);
      this.f3000[4] = var9;
      Vector3d var10 = new Vector3d(f5000[3], f5000[4], f5000[5]);
      this.f3000[5] = var10;
      Vector2f var11 = new Vector2f(f4000[4], f4000[5]);
      this.f3000[6] = var11;
   }

   static {
      ntfClinit();
   }

   public boolean m4000() {
      this.m16000();
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && (NNNZg)((NNuU)this.y[0]).T[3] != null) {
         NNde var1 = ((NNNYO)((NNuU)this.y[0]).i[5]).s();
         NXi var2 = var1.y();
         ((Vector3d)this.f3000[5]).set(new Vector3d(var2.M, var2.B, var2.Z));
         ((Vector3d)this.f3000[4]).set((Vector3d)this.f3000[5]);
         Vector2f var7 = new Vector2f(var1.R(), var1.i());
         this.f3000[6] = var7;
         return super.m12000();
      } else {
         this.N((boolean)0);
         return (boolean)0;
      }
   }

   public boolean m6000() {
      if ((NNNwS)((NNuU)this.y[0]).T[4] != null && wY.i()) {
         IPathingBehavior var1 = wY.N().getPathingBehavior();
         var1.cancelEverything();
         var1.forceCancel();
      }

      return super.m14000();
   }

   private static void m10000() {
      f6000 = new String[]{"speed-xz", "speed-y", "walk-by-click", "show-camera-position", "x: %s y: %s z: %s"};
   }

   private static void m12000() {
      f5000 = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 256.0};
   }

   private static void m14000() {
      f7000 = new float[]{1.0F, 0.1F, 4.0F, 0.1F};
      f4000 = new float[]{0.6F, 0.1F, 2.0F, 0.1F, 0.0F, 0.0F};
      f8000 = new float[]{2.0F, 2.0F};
      f2000 = new float[]{16.0F, 2.0F, 60.0F, 0.15F, 0.15F, -90.0F, 90.0F, 0.0F};
      f1000 = new float[]{1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F};
   }

   private void m16000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[7];
         Object[] var1 = this.f3000;
      }
   }

   @Iface0642
   public void m10000(rw.core.C0127 var1) {
      var1.m16000((boolean)1);
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public void m12000(rw.module.FreeCamera var1) {
      this.m16000();
      var1.m34000(((Vector2f)this.f3000[6]).x);
      var1.m28000(((Vector2f)this.f3000[6]).y);
      var1.m4000(NNWE.u(IlkOns.m86000((NNNwS)((NNuU)this.y[0]).T[4]), ((Vector3d)this.f3000[4]).x, ((Vector3d)this.f3000[5]).x));
      var1.m30000(NNWE.u(IlkOns.m86000((NNNwS)((NNuU)this.y[0]).T[4]), ((Vector3d)this.f3000[4]).y, ((Vector3d)this.f3000[5]).y));
      var1.m36000(NNWE.u(IlkOns.m86000((NNNwS)((NNuU)this.y[0]).T[4]), ((Vector3d)this.f3000[4]).z, ((Vector3d)this.f3000[5]).z));
      var1.N();
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m14000(C0704 var1) {
      this.m16000();
      if ((Boolean)((C0991)this.f3000[3]).i()) {
         String var2 = String.format(f6000[4], (int)((Vector3d)this.f3000[5]).x(), (int)((Vector3d)this.f3000[5]).y(), (int)((Vector3d)this.f3000[5]).z());
         ow var3 = ((NNuU)this.y[0]).Nt();
         ZwBs var4 = C0002.m24000();
         float var5 = var3.U() / f8000[0];
         float var6 = var3.E() / f8000[1];
         float var7 = f2000[0];
         C0806.m56000(var4, var2, var5 - var4.m56000(var2, var7, (OlmmOsl)OlmmOsl.f7000[3], false) / f2000[1], var6 - f2000[2], var7, -1, -16777216);
      }
   }

   @Iface0642
   public void m16000(C0718 var1) {
      var1.m18000((boolean)1);
   }

   @Iface0642(
      u = true
   )
   public void m18000(OlpnniIl var1) {
      this.m16000();
      if ((Boolean)((C0991)this.f3000[2]).i() && var1.Z() == (Enum0072)Enum0072.f1000[0] && var1.z() == 1) {
         if (!wY.i()) {
            NXi var2 = ((NNNYO)((NNuU)this.y[0]).i[5]).s().y();
            NXi var3 = ((NNNwS)((NNuU)this.y[0]).T[4]).method_5631(((Vector2f)this.f3000[6]).y, ((Vector2f)this.f3000[6]).x).L(f5000[6]);
            NXi var4 = var2.i(var3);
            NNty var5 = ((NNNZg)((NNuU)this.y[0]).T[3]).N(new NNnf(var2, var4, NNnS.field_17558, NNnC.field_1348, (NNNwS)((NNuU)this.y[0]).T[4]));
            if (var5 != null && var5.N() == NcZ.field_1332) {
               Ned var6 = var5.u();
               wY.N().getCustomGoalProcess().setGoalAndPath(new GoalBlock(var6.method_10263(), var6.method_10264() + 1, var6.method_10260()));
            }
         }
      }
   }

   @Iface0642(
      y = Enum0081.AFTER_ALL
   )
   public void m20000(C0721 var1) {
      this.m16000();
      ((Vector3d)this.f3000[4]).set((Vector3d)this.f3000[5]);
      if (!C1181.m30000()) {
         boolean var2 = C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).n.N.y());
         boolean var3 = C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).G.N.y());
         boolean var4 = C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).t.N.y());
         boolean var5 = C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).l.N.y());
         float var6 = var2 == var3 ? f2000[7] : (var2 ? f1000[0] : f1000[1]);
         float var7 = var4 == var5 ? f1000[2] : (var4 ? f1000[3] : f1000[4]);
         boolean var8 = C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).d.N.y());
         boolean var9 = C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).w.N.y());
         if (var8) {
            ((Vector3d)this.f3000[5]).y = ((Vector3d)this.f3000[5]).y + ((Float)((C0988)this.f3000[1]).i()).floatValue();
         }

         if (var9) {
            ((Vector3d)this.f3000[5]).y = ((Vector3d)this.f3000[5]).y - ((Float)((C0988)this.f3000[1]).i()).floatValue();
         }

         if (var7 != f1000[5] || var6 != f1000[6]) {
            float var10 = C1183.m40000(C1181.m40000(((Vector2f)this.f3000[6]).x, var6, var7));
            ((Vector3d)this.f3000[5]).x = ((Vector3d)this.f3000[5]).x + -NNWE.m(var10) * (Float)((C0988)this.f3000[0]).i();
            ((Vector3d)this.f3000[5]).z = ((Vector3d)this.f3000[5]).z + NNWE.P(var10) * (Float)((C0988)this.f3000[0]).i();
         }
      }
   }

   @Iface0642(
      y = Enum0081.BEFORE
   )
   public void m22000(AttackAura_x_x var1) {
      C1181.m50000(var1);
   }

   @Iface0642(
      y = Enum0081.BEFORE
   )
   public void m24000(rw.module.AimAssist var1) {
      this.m16000();
      ((Vector2f)this.f3000[6]).x = ((Vector2f)this.f3000[6]).x + (float)var1.m18000() * f2000[3];
      ((Vector2f)this.f3000[6]).y = ((Vector2f)this.f3000[6]).y + (float)var1.m4000() * f2000[4];
      ((Vector2f)this.f3000[6]).y = NNWE.N(((Vector2f)this.f3000[6]).y, f2000[5], f2000[6]);
      var1.N();
   }

   @Iface0642(
      y = Enum0081.AFTER
   )
   public void m26000(C0710 var1) {
      var1.m26000((boolean)1);
      var1.m18000((boolean)0);
   }
}
