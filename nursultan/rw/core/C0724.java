package rw.core;

import KDFzREm.NXi;
import rw.data.Rec0181;
import rw.gui.Scaffold;

public class C0724 extends Base0749 {
   private static float[] f1000;

   public C0724(Scaffold var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      f1000 = new float[]{-45.0F, 45.0F, -45.0F, 45.0F, 2.0F, 1.0F};
   }

   public C0983 m6000(Rec0181 var1, NXi var2, C0983 var3) {
      float var4 = Math.clamp(var3.m38000(), f1000[0], f1000[1]);
      float var5 = Math.clamp(var3.m68000(), f1000[2], f1000[3]);
      C0983 var6 = C0989.m28000().m64000(var4, var5);
      var6 = var6.m64000(C1183.m12000(f1000[4]), C1183.m12000(f1000[5]));
      return var6.m54000(true);
   }
}
