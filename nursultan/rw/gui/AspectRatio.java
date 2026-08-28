package rw.gui;

import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.core.C0988;
import rw.core.C1000;
import rw.core.C1013;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AspectRatio",
   y = Enum0055.VISUAL,
   N = Enum0070.SCREEN
)
public class AspectRatio extends GuiWidget {
   private static float[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private static void m4000() {
      f2000 = new String[]{"_16_9", "_16_10", "_21_9", "_4_3", "custom", "aspect-ratio", "custom-ratio"};
   }

   public AspectRatio() {
      this.m8000();
      C1013 var5 = new C1013(f2000[0], true);
      this.f3000[0] = var5;
      C1013 var6 = new C1013(f2000[1], false);
      this.f3000[1] = var6;
      C1013 var7 = new C1013(f2000[2], false);
      this.f3000[2] = var7;
      C1013 var8 = new C1013(f2000[3], false);
      this.f3000[3] = var8;
      C1013 var9 = new C1013(f2000[4], false);
      this.f3000[4] = var9;
      C1000 var10 = C0122.m18000(this, f2000[5], (C1013)this.f3000[0], (C1013)this.f3000[1], (C1013)this.f3000[2], (C1013)this.f3000[3], (C1013)this.f3000[4]);
      this.f3000[5] = var10;
      C0988 var11 = (C0988)C0122.m12000(this, f2000[6], f1000[0], f1000[1], f1000[2], f1000[3]).N(var1 -> {
         this.m8000();
         return ((C1013)this.f3000[4]).m14000();
      });
      this.f3000[6] = var11;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[7];
         Object[] var1 = this.f3000;
      }
   }

   private static void m10000() {
      f1000 = new float[]{1.0F, 0.5F, 2.0F, 0.01F, 1.7777778F, 1.6F, 2.3888888F, 1.3F};
   }

   public float m12000(float var1) {
      this.m8000();
      float var2 = ((NNuU)this.y[0]).Nt().U();
      float var3 = ((NNuU)this.y[0]).Nt().E();
      if (!this.U()) {
         return var1;
      } else if (((C1013)this.f3000[0]).m14000()) {
         return f1000[4];
      } else if (((C1013)this.f3000[1]).m14000()) {
         return f1000[5];
      } else if (((C1013)this.f3000[2]).m14000()) {
         return f1000[6];
      } else if (((C1013)this.f3000[3]).m14000()) {
         return f1000[7];
      } else {
         return ((C1013)this.f3000[4]).m14000() ? var2 / (Float)((C0988)this.f3000[6]).i() / var3 : var1;
      }
   }
}
