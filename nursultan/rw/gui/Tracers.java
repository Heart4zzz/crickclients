package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import java.util.List;
import org.joml.Matrix4f;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.core.Base0932;
import rw.core.C0138;
import rw.core.C0805;
import rw.core.C0811;
import rw.core.C0814;
import rw.core.C1003;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.setting.C0116;
import rw.setting.C0122;
import rw.setting.InvisibleX;

@AnnotationDefault(
   L = "Tracers",
   y = Enum0055.VISUAL,
   N = Enum0070.SCREEN
)
public class Tracers extends GuiWidget {
   private static String[] f1000;
   private static float[] f2000;
   public Object[] f3000;

   private static void m4000() {
      f2000 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
   }

   public Tracers() {
      this.m8000();
      Matrix4f var8 = new Matrix4f();
      this.f3000[0] = var8;
      InvisibleX var9 = new InvisibleX(this, f1000[0], true);
      this.f3000[1] = var9;
      C0116 var10 = new C0116(this, f1000[1], true);
      this.f3000[2] = var10;
      C1003 var11 = C0122.m4000(this, f1000[2], (InvisibleX)this.f3000[1], (C0116)this.f3000[2]);
      this.f3000[3] = var11;
      Matrix4f var12 = new Matrix4f();
      this.f3000[4] = var12;

      for (Base0932 var2 : ((C1003)this.f3000[3]).m2000()) {
         if (var2 instanceof Iface0648) {
            var2.m2000(this);
         }
      }
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[5];
         Object[] var1 = this.f3000;
      }
   }

   private static void m10000() {
      f1000 = new String[]{"players", "friends", "entities"};
   }

   @Iface0642(
      y = Enum0081.BEFORE
   )
   public void m4000(C0138 var1) {
      this.m8000();
      C0811 var2 = ((C0805)C0814.f12000[2]).m38000();
      NXi var3 = var1.m24000().y();
      Matrix4f var4 = var1.m2000().L().N().invert((Matrix4f)this.f3000[4]);
      Matrix4f var5 = var1.m26000().invert((Matrix4f)this.f3000[0]);
      Matrix4f var6 = var5.mul(var4);

      for (NbK var8 : ((NNNZg)((NNuU)this.y[0]).T[3]).M()) {
         if (var8 != (NNNwS)((NNuU)this.y[0]).T[4]) {
            for (int var9 = 0; var9 < ((List)((C1003)this.f3000[3]).i()).size(); var9++) {
               Base0932 var10 = (Base0932)((List)((C1003)this.f3000[3]).i()).get(var9);
               if (var10.test(var8)) {
                  int var11 = var10.m12000();
                  var2.m42000(var6, f2000[0], f2000[1], f2000[2])
                     .m42000(var1.m36000(), (float)(IlkOns.m26000(var8) - var3.M), (float)(IlkOns.m34000(var8) - var3.B), (float)(IlkOns.m4000(var8) - var3.Z))
                     .m26000(var11)
                     .m26000(var11)
                     .m30000(f2000[3])
                     .m28000();
               }
            }
         }
      }
   }
}
