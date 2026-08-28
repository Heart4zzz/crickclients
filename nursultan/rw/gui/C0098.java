package rw.gui;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0138;
import rw.core.C0843;
import rw.core.C0876;
import rw.core.C0988;
import rw.core.C0998;
import rw.core.C1003;
import rw.core.C1013;
import rw.core.IlOitn;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Fog",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class C0098 extends GuiWidget {
   private static float[] f1000;
   public Object[] f2000;
   private static float[] f3000;
   private static String[] f4000;

   private static void m4000() {
      f4000 = new String[]{"color", "blur", "details", "color", "distance", "radius"};
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[8];
         Object[] var1 = this.f2000;
      }
   }

   public C0098() {
      this.m6000();
      C1013 var5 = new C1013(f4000[0], true);
      this.f2000[0] = var5;
      C1013 var6 = new C1013(f4000[1], true);
      this.f2000[1] = var6;
      C1003 var7 = C0122.m4000(this, f4000[2], (C1013)this.f2000[0], (C1013)this.f2000[1]);
      this.f2000[2] = var7;
      C0998 var8 = (C0998)C0122.m6000(this, f4000[3], 1297584127).N(var1 -> {
         this.m6000();
         return (boolean)(!((C1013)this.f2000[0]).m14000() && !((C1013)this.f2000[1]).m14000() ? 0 : 1);
      });
      this.f2000[3] = var8;
      C0988 var9 = (C0988)C0122.m12000(this, f4000[4], f1000[0], f1000[1], f1000[2], f1000[3]).N(var1 -> {
         this.m6000();
         return ((C1013)this.f2000[1]).m14000();
      });
      this.f2000[4] = var9;
      C0843 var10 = new C0843();
      this.f2000[5] = var10;
      FloatBuffer var11 = BufferUtils.createFloatBuffer(20);
      this.f2000[7] = var11;
      C0988 var12 = C0122.m12000(this, f4000[5], f1000[4], f1000[5], f1000[6], f3000[0]).N(var1 -> {
         this.m6000();
         return ((C1013)this.f2000[1]).m14000();
      }).m42000((var1, var2) -> {
         this.m6000();
         IlkOns.m62000((FloatBuffer)this.f2000[7], Math.max(0, var2.intValue() - 1));
      });
      this.f2000[6] = var12;
      IlkOns.m62000((FloatBuffer)this.f2000[7], Math.max(0, ((Float)((C0988)this.f2000[6]).i()).intValue() - 1));
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f1000 = new float[]{50.0F, 10.0F, 150.0F, 1.0F, 12.0F, 8.0F, 20.0F};
      f3000 = new float[]{1.0F, 255.0F, 255.0F, 255.0F, 255.0F};
   }

   @Iface0642(
      y = Enum0081.BEFORE,
      N = {Tracers.class}
   )
   public void m14000(C0138 var1) {
      this.m6000();
      if (((C1013)this.f2000[1]).m14000()) {
         ((C0843)this.f2000[5])
            .m42000(
               var1,
               (Integer)((C0998)this.f2000[3]).i(),
               (Float)((C0988)this.f2000[4]).i(),
               ((Float)((C0988)this.f2000[6]).i()).intValue(),
               (FloatBuffer)this.f2000[7]
            );
      }
   }

   @Iface0642
   public void m18000(IlOitn var1) {
      this.m6000();
      if (((C1013)this.f2000[0]).m14000()) {
         int var2 = (Integer)((C0998)this.f2000[3]).i();
         var1.m26000(C0876.m28000(var2) / f3000[1]);
         var1.m32000(C0876.m58000(var2) / f3000[2]);
         var1.m6000(C0876.m20000(var2) / f3000[3]);
         var1.m24000(C0876.m46000(var2) / f3000[4]);
      }
   }
}
