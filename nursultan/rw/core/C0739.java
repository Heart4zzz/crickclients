package rw.core;

import KDFzREm.NGx;
import KDFzREm.NNBK;
import KDFzREm.NNNNRZ;
import KDFzREm.NNag;
import KDFzREm.NPh;
import KDFzREm.NQo;
import KDFzREm.NbK;
import org.joml.Vector4f;
import rw.gui.GuiElement;
import rw.gui.ZwBs;

public class C0739 extends Base0748<NGx> {
   private static float[] f1000;

   public C0739(GuiElement var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new float[]{4.0F};
   }

   public void m4000(NNBK var1, ZwBs var2, Vector4f var3, NGx var4) {
      NQo var5 = var4.N();
      int var6 = !((C1013)((GuiElement)this.N[0]).f16000[0]).m14000() && !((C1013)((GuiElement)this.N[0]).f16000[2]).m14000() ? 0 : 1;
      int var7 = !((C1013)((GuiElement)this.N[0]).f16000[1]).m14000() && !((C1013)((GuiElement)this.N[0]).f16000[2]).m14000() ? 0 : 1;
      int var8 = var5.y().method_58694(NNNNRZ.B) != null ? 1 : 0;
      if (var6 != 0) {
         super.m28000(var1, var2, var3, var4);
      }

      if (var7 != 0 && (var6 == 0 || var8 != 0)) {
         if (var6 != 0) {
            var3.y = Math.round(var3.y - f1000[0]);
         }

         this.N(var1, var2, var3, var4, this.m10000(var5), this.y(var4), this.u(var4));
      }
   }

   public boolean m6000(NbK var1) {
      return C1140.m6000().test(var1);
   }

   public NNag m8000(NGx var1) {
      NQo var2 = var1.N();
      NNag var3 = var2.Y().L();
      return var2.c() <= 1 ? var3 : var3.i(NPh.field_1080 + " x" + var2.c());
   }

   private NNag m10000(NQo var1) {
      NNag var2 = var1.k().L().N(var1.O().N());
      return var1.c() <= 1 ? var2 : var2.i(NPh.field_1080 + " x" + var1.c());
   }
}
