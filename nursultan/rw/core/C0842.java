package rw.core;

import KDFzREm.NNBK;
import KDFzREm.NbK;
import KDFzREm.Nbr;
import org.joml.Vector4f;
import rw.gui.GuiElement;
import rw.gui.ZwBs;

public class C0842 extends C0744<Nbr> {
   private static float[] f1000;

   public C0842(GuiElement var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   public void m4000(NNBK var1, ZwBs var2, Vector4f var3, Nbr var4) {
      super.N(var1, var2, var3, var4);
      if (var4.method_16914()) {
         var3.y = Math.round(var3.y - f1000[0]);
         this.N(var1, var2, var3, var4, var4.method_5797().L(), this.y(var4), this.u(var4));
      }
   }

   private static void m6000() {
      f1000 = new float[]{4.0F};
   }

   public boolean m8000(NbK var1) {
      return C1140.m26000().and(C1140.m50000()).test(var1);
   }
}
