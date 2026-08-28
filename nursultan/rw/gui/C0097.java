package rw.gui;

import KDFzREm.NNIo;
import KDFzREm.NNNQL;
import KDFzREm.NNNwS;
import KDFzREm.NNiz;
import KDFzREm.NNuU;
import KDFzREm.NbL;
import org.joml.Matrix4f;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0138;
import rw.core.C0988;
import rw.core.C0998;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "Hands",
   y = Enum0055.VISUAL,
   N = Enum0070.WORLD
)
public class C0097 extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;
   private static float[] f3000;

   private static void m4000() {
      f2000 = new String[]{"color-right", "color-left", "blur", "texture-mix"};
   }

   public C0097() {
      this.m8000();
      C0998 var5 = C0122.m6000(this, f2000[0], -7694081);
      this.f1000[0] = var5;
      C0998 var6 = C0122.m6000(this, f2000[1], -7694081);
      this.f1000[1] = var6;
      C0988 var7 = C0122.m12000(this, f2000[2], f3000[0], f3000[1], f3000[2], f3000[3]);
      this.f1000[2] = var7;
      C0988 var8 = C0122.m12000(this, f2000[3], f3000[4], f3000[5], f3000[6], f3000[7]);
      this.f1000[3] = var8;
      C0095 var9 = new C0095();
      this.f1000[4] = var9;
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
      }
   }

   public boolean m4000() {
      this.m8000();
      return (boolean)(this.U() && ((C0095)this.f1000[4]).m58000() ? 1 : 0);
   }

   private static void m10000() {
      f3000 = new float[]{10.0F, 0.0F, 30.0F, 1.0F, 0.5F, 0.0F, 0.5F, 0.1F};
   }

   public void m18000() {
      this.m8000();
      ((C0095)this.f1000[4]).m92000();
   }

   public void m6000(NNNQL var1, float var2, NNIo var3, NNNwS var4, int var5, Matrix4f var6) {
      this.m8000();
      ((C0095)this.f1000[4])
         .m84000(
            var1, var2, var3, var4, var5, var6, (Integer)((C0998)this.f1000[0]).i(), (Integer)((C0998)this.f1000[1]).i(), (Float)((C0988)this.f1000[3]).i()
         );
   }

   @Iface0642
   public void m8000(C0138 var1) {
      this.m8000();
      if (((NNiz)((NNuU)this.y[0]).i[7]).NS().N() && !((NNiz)((NNuU)this.y[0]).i[7]).NG) {
         ((C0095)this.f1000[4]).m76000(((Float)((C0988)this.f1000[2]).i()).intValue());
      } else {
         ((C0095)this.f1000[4]).m92000();
      }
   }

   public boolean m10000(NbL var1) {
      this.m8000();
      return ((C0095)this.f1000[4]).m82000(var1);
   }
}
