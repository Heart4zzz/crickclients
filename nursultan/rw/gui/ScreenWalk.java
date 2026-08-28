package rw.gui;

import KDFzREm.NNYH;
import KDFzREm.NNiz;
import KDFzREm.NNuU;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.C0679;
import rw.core.C1000;
import rw.core.C1181;
import rw.core.C1226;
import rw.core.C1227;
import rw.core.C1241;
import rw.core.C1243;
import rw.core.C1245;
import rw.core.OlkOrn;
import rw.defs.Enum0055;
import rw.defs.Enum0081;
import rw.module.AttackAura_x_x;
import rw.setting.C0122;

@AnnotationDefault(
   L = "ScreenWalk",
   y = Enum0055.MOVEMENT,
   N = Enum0070.BASE
)
public class ScreenWalk extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public ScreenWalk() {
      this.m4000();
      C1000 var5 = (C1000)C0122.m18000(
            this,
            f2000[0],
            new C0679(f2000[1], false, new OlkOrn()),
            new C0679(f2000[2], false, new C1243()),
            new C0679(f2000[3], false, new C1226()),
            new C0679(f2000[4], false, new C1245()),
            new C0679(f2000[5], true, (C1227)C1241.f2000[0])
         )
         .N((var1, var2) -> this.m8000((C0679)var2));
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m6000() {
      this.m4000();
      NursultanClient.m60000().m28000((C1227)((C0679)((C1000)this.f1000[0]).i()).f1000[0]);
      return super.m12000();
   }

   public boolean m10000() {
      NursultanClient.m60000().m28000((C1227)C1241.f2000[0]);
      return super.m14000();
   }

   private static void m12000() {
      f2000 = new String[]{"mode", "ft", "matrix", "hw", "spooky", "vanilla"};
   }

   private void m8000(C0679 var1) {
      if (this.U()) {
         NursultanClient.m60000().m28000((C1227)var1.f1000[0]);
      }
   }

   @Iface0642(
      y = Enum0081.BEFORE
   )
   public void m10000(AttackAura_x_x var1) {
      if ((NNYH)((NNuU)this.y[0]).v[3] != null && !C1181.m30000()) {
         var1.m16000(C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).n.N.y()));
         var1.m34000(C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).G.N.y()));
         var1.m46000(C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).l.N.y()));
         var1.m2000(C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).t.N.y()));
         var1.m22000(C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).d.N.y()));
         var1.m10000(C1181.m38000(((NNiz)((NNuU)this.y[0]).i[7]).k.N.y()));
      }
   }
}
