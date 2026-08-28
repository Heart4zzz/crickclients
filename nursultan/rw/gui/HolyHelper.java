package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import java.util.List;
import org.joml.Matrix4fStack;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0606;
import rw.api.Iface0622;
import rw.api.Iface0642;
import rw.core.Base1035;
import rw.core.C0138;
import rw.core.C0719;
import rw.core.C0805;
import rw.core.C0814;
import rw.core.C0876;
import rw.core.C0991;
import rw.core.C0998;
import rw.core.C1019;
import rw.core.C1028;
import rw.core.C1033;
import rw.core.C1172;
import rw.core.ExpBottle;
import rw.core.ExplosiveStuff;
import rw.core.IltOiis;
import rw.core.OlpkOimtk;
import rw.core.SnowBall;
import rw.defs.Enum0055;
import rw.module.OlpnniIl;
import rw.setting.C0122;

@AnnotationDefault(
   L = "HolyHelper",
   y = Enum0055.MISC,
   N = Enum0070.HELPER
)
public class HolyHelper extends GuiWidget implements Iface0622 {
   private static double[] f1000;
   public Object[] f2000;
   private static String[] f3000;
   public Object[] f4000;

   private static void m4000() {
      f1000 = new double[]{-15.0, -15.0, -15.0, 15.0, 15.0, 15.0, -0.05};
   }

   public HolyHelper() {
      this.m12000();
      ExplosiveStuff var5 = new ExplosiveStuff(this, f3000[0]);
      this.f4000[0] = var5;
      ExpBottle var6 = new ExpBottle(this, f3000[1]);
      this.f4000[1] = var6;
      C1033 var7 = new C1033(this, f3000[2]);
      this.f4000[2] = var7;
      SnowBall var8 = new SnowBall(this, f3000[3]);
      this.f4000[3] = var8;
      C1028 var9 = new C1028(this, f3000[4]);
      this.f2000[0] = var9;
      C1019 var10 = new C1019(this, f3000[5]);
      this.f2000[1] = var10;
      List var11 = List.of(
         (Base1035)this.f4000[0], (Base1035)this.f4000[1], (Base1035)this.f4000[2], (Base1035)this.f4000[3], (Base1035)this.f2000[0], (Base1035)this.f2000[1]
      );
      this.f2000[2] = var11;
      C0991 var12 = C0122.m26000(this, f3000[6], false);
      this.f2000[3] = var12;
      C0998 var13 = (C0998)C0122.m6000(this, f3000[7], -11104513).N(var1 -> {
         this.m12000();
         return (Boolean)((C0991)this.f2000[3]).i();
      });
      this.f2000[4] = var13;
      OlpkOimtk var14 = new OlpkOimtk(5, 1);
      this.f2000[5] = var14;
      C1172 var15 = new C1172(f1000[0], f1000[1], f1000[2], f1000[3], f1000[4], f1000[5]).m16000(f1000[6]);
      this.f2000[6] = var15;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      this.m12000();
      if ((Boolean)((C0991)this.f2000[3]).i()) {
         Boolean var5 = ((Base1035)this.f2000[0]).m2000().test(((NNNwS)((NNuU)this.y[0]).T[4]).method_6047());
         this.f2000[7] = var5;
      }
   }

   private static void m10000() {
      f3000 = new String[]{"explosive-stuff", "exp-bottle", "explosive-trap", "snow-ball", "stun", "trap", "show-stun-zone", "zone-color"};
   }

   private void m12000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[4];
         Object[] var1 = this.f4000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[8];
         Object[] var2 = this.f2000;
         var2[7] = false;
      }
   }

   @Iface0642
   public void m14000(C0138 var1) {
      this.m12000();
      NXi var2 = var1.m24000().y();
      Matrix4fStack var3 = var1.m36000();
      if ((Boolean)this.f2000[7]) {
         this.m16000(var1, var3, var2);
      }
   }

   private void m16000(C0138 var1, Matrix4fStack var2, NXi var3) {
      this.m12000();
      var2.pushMatrix();
      NXi var4 = new NXi(((NNNwS)((NNuU)this.y[0]).T[4]).field_6014, ((NNNwS)((NNuU)this.y[0]).T[4]).field_6036, ((NNNwS)((NNuU)this.y[0]).T[4]).field_5969)
         .N(((NNNwS)((NNuU)this.y[0]).T[4]).method_73189(), var1.m20000().N(true))
         .u(var3);
      var2.translate((float)var4.M, (float)var4.B, (float)var4.Z);
      IltOiis.m24000(
         var2,
         ((C0805)C0814.f12000[3]).m18000(),
         ((C0805)C0814.f12000[1]).m18000(),
         NXi.L,
         (C1172)this.f2000[6],
         C0876.m70000((Integer)((C0998)this.f2000[4]).i(), 120)
      );
      var2.popMatrix();
   }

   public void m18000(Iface0606 var1) {
      this.m12000();
      ((OlpkOimtk)this.f2000[5]).m42000(var1);
   }

   @Iface0642
   public void m20000(C0719 var1) {
      this.m12000();
      ((OlpkOimtk)this.f2000[5]).m34000(var1);
      this.m8000();
   }

   @Iface0642(
      u = true
   )
   public void m22000(OlpnniIl var1) {
      this.m12000();
      ((List)this.f2000[2]).forEach(var1x -> ((Base1035)var1x).y(var1));
   }
}
