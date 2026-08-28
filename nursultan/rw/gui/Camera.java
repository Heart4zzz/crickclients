package rw.gui;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.wY;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0648;
import rw.core.Base1148;
import rw.core.C0719;
import rw.core.C0954;
import rw.core.C0965;
import rw.core.C1000;
import rw.core.CameraPart;
import rw.core.CameraPartPart;
import rw.core.OltqItr;
import rw.defs.Enum0055;
import rw.module.AttackAura_x_x;
import rw.setting.C0122;
import rw.setting.CameraApi;

@AnnotationDefault(
   L = "AntiAFK",
   y = Enum0055.PLAYER,
   N = Enum0070.BASE
)
public class Camera extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new String[]{"camera-shake", "click", "custom", "ft", "mode"};
   }

   public Camera() {
      this.m8000();
      C0965 var5 = new C0965();
      this.f2000[0] = var5;
      OltqItr var6 = new OltqItr(f1000[0], true);
      this.f2000[1] = var6;
      CameraPartPart var7 = new CameraPartPart(f1000[1], true);
      this.f2000[2] = var7;
      CameraApi var8 = new CameraApi(this, (CameraPartPart)this.f2000[2], (OltqItr)this.f2000[1], f1000[2], true);
      this.f2000[3] = var8;
      CameraPart var9 = new CameraPart(this, (CameraPartPart)this.f2000[2], (OltqItr)this.f2000[1], f1000[3], false);
      this.f2000[4] = var9;
      C1000 var10 = C0122.m18000(this, f1000[4], (Base1148)this.f2000[3], (Base1148)this.f2000[4]);
      this.f2000[5] = var10;
      ((C1000)this.f2000[5]).m2000().forEach(var1 -> {
         if (var1 instanceof Iface0648 var2) {
            var2.m2000(this);
         }
      });
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[7];
         Object[] var1 = this.f2000;
         var1[6] = false;
      }
   }

   @Iface0642
   public void m4000(AttackAura_x_x var1) {
      this.m8000();
      if ((Boolean)this.f2000[6]) {
         ((Base1148)((C1000)this.f2000[5]).i()).y(var1);
      }
   }

   @Iface0642
   public void m8000(C0719 var1) {
      this.m8000();
      Boolean var6 = false;
      this.f2000[6] = var6;
      if (!((NNuU)this.y[0]).q()) {
         if (!((NNNwS)((NNuU)this.y[0]).T[4]).k() && !wY.u()) {
            if (((C0965)this.f2000[0]).m18000(C0954.m20000(30))) {
               Boolean var7 = true;
               this.f2000[6] = var7;
               ((C0965)this.f2000[0]).m16000();
            }

            if ((Boolean)this.f2000[6]) {
               ((Base1148)((C1000)this.f2000[5]).i()).y(var1);
            }
         } else {
            ((C0965)this.f2000[0]).m16000();
         }
      }
   }
}
