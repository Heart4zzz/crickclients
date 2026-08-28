package rw.gui;

import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1014;
import rw.core.C0694;
import rw.core.C0988;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "ViewModel",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class ViewModel extends GuiWidget {
   private static float[] f1000;
   private static float[] f2000;
   private static float[] f3000;
   private static String[] f4000;
   private static float[] f5000;
   private static String[] f6000;
   private static float[] f7000;
   public Object[] f8000;
   private static float[] f9000;

   private static void m4000() {
      f1000 = new float[]{0.0F, -1.0F, 1.0F, 0.05F, 0.0F};
      f9000 = new float[]{-1.0F, 1.0F, 0.05F, 0.0F, -1.0F};
      f2000 = new float[]{1.0F, 0.05F};
      f5000 = new float[]{1.0F, 0.1F, 2.0F, 0.05F, 0.0F, -1.0F, 1.0F, 0.05F};
      f3000 = new float[]{0.0F, -1.0F, 1.0F, 0.05F, 0.0F, -1.0F};
      f7000 = new float[]{1.0F, 0.05F, 1.0F, 0.1F, 2.0F, 0.05F};
   }

   public ViewModel() {
      this.m8000();
      C0988 var5 = C0122.m12000(this, f4000[0], f1000[0], f1000[1], f1000[2], f1000[3]);
      this.f8000[0] = var5;
      C0988 var6 = C0122.m12000(this, f4000[1], f1000[4], f9000[0], f9000[1], f9000[2]);
      this.f8000[1] = var6;
      C0988 var7 = C0122.m12000(this, f4000[2], f9000[3], f9000[4], f2000[0], f2000[1]);
      this.f8000[2] = var7;
      C0988 var8 = C0122.m12000(this, f4000[3], f5000[0], f5000[1], f5000[2], f5000[3]);
      this.f8000[3] = var8;
      C0988 var9 = C0122.m12000(this, f4000[4], f5000[4], f5000[5], f5000[6], f5000[7]);
      this.f8000[4] = var9;
      C0988 var10 = C0122.m12000(this, f4000[5], f3000[0], f3000[1], f3000[2], f3000[3]);
      this.f8000[5] = var10;
      C0988 var11 = C0122.m12000(this, f4000[6], f3000[4], f3000[5], f7000[0], f7000[1]);
      this.f8000[6] = var11;
      C0988 var12 = C0122.m12000(this, f6000[0], f7000[2], f7000[3], f7000[4], f7000[5]);
      this.f8000[7] = var12;
      C0122.m22000(
         this,
         f6000[1],
         () -> {
            this.m8000();
            List.of(
                  (C0988)this.f8000[0],
                  (C0988)this.f8000[1],
                  (C0988)this.f8000[2],
                  (C0988)this.f8000[3],
                  (C0988)this.f8000[4],
                  (C0988)this.f8000[5],
                  (C0988)this.f8000[6],
                  (C0988)this.f8000[7]
               )
               .forEach(Base1014::m16000);
         }
      );
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[8];
         Object[] var1 = this.f8000;
      }
   }

   private static void m12000() {
      f4000 = new String[]{"right-hand-x", "right-hand-y", "right-hand-z", "right-scale", "left-hand-x", "left-hand-y", "left-hand-z"};
      f6000 = new String[]{"left-scale", "reset"};
   }

   @Iface0642
   public void m12000(C0694 var1) {
      this.m8000();
      var1.m14000()
         .set((Float)((C0988)this.f8000[0]).i(), (Float)((C0988)this.f8000[1]).i(), (Float)((C0988)this.f8000[2]).i(), (Float)((C0988)this.f8000[3]).i());
      var1.m22000()
         .set((Float)((C0988)this.f8000[4]).i(), (Float)((C0988)this.f8000[5]).i(), (Float)((C0988)this.f8000[6]).i(), (Float)((C0988)this.f8000[7]).i());
   }
}
