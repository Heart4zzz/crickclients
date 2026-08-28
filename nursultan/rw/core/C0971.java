package rw.core;

import KDFzREm.NNNYO;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import java.util.List;
import java.util.Objects;
import org.joml.Vector2f;
import rw.gui.C0002;
import rw.gui.IlkOns;
import rw.gui.ZwBs;

public class C0971 extends OlqsjOqn<WaypointXPart> {
   public Object[] f1000;

   public C0971() {
      this.m2000();
      NNuU var5 = NNuU.Nq();
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m6000(C0721 var1) {
      NXi var2 = IlkOns.m52000();

      for (WaypointXPart var4 : this.N()) {
         if (!Objects.equals(var4.m16000(), rw.setting.C0160.m6000())) {
            var4.m30000((boolean)1);
         } else {
            var4.m36000((int)var2.R(var4.m46000()));
            var4.m30000((boolean)0);
         }
      }
   }

   public void m10000(C0704 var1) {
      this.m2000();
      List var2 = this.N();
      if (!var2.isEmpty()) {
         ZwBs var3 = C0002.m24000();
         byte var4 = 18;

         for (WaypointXPart var6 : var2) {
            if (!var6.m14000()) {
               NXi var7 = var6.m46000().u(((NNNYO)((NNuU)this.f1000[0]).i[5]).s().y());
               Vector2f var8 = IlkOns.m72000((float)var7.M, (float)var7.B, (float)var7.Z);
               if (var8 != null) {
                  var8 = var8.round();
                  String var9 = var6.m18000() + " " + var6.m34000() + "m";
                  C0806.m46000(var3, var9, 18, var8.x, var8.y);
               }
            }
         }
      }
   }

   public void m12000(C0138 var1) {
   }
}
