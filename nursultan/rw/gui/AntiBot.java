package rw.gui;

import KDFzREm.NNNZg;
import KDFzREm.NNNwz;
import KDFzREm.NNuU;
import KDFzREm.wY;
import net.minecraft.world.entity.EquipmentUser;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.api.Iface0643;
import rw.core.C0991;
import rw.core.Ilnorttr;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "AntiBot",
   y = Enum0055.COMBAT,
   N = Enum0070.OTHER
)
public class AntiBot extends GuiWidget {
   private static String[] f1000;
   public Object[] f2000;

   private static void m4000() {
      f1000 = new String[]{"no-bot-interaction"};
   }

   public AntiBot() {
      this.m10000();
      C0991 var5 = C0122.m26000(this, f1000[0], false);
      this.f2000[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m6000() {
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null) {
         ((NNNZg)((NNuU)this.y[0]).T[3]).method_18456().stream().filter(EquipmentUser::N).forEach(var0 -> ((Iface0643)var0).dataManager().m6000().m12000(true));
      }

      return super.m12000();
   }

   public boolean m8000() {
      if ((NNNZg)((NNuU)this.y[0]).T[3] != null) {
         ((NNNZg)((NNuU)this.y[0]).T[3]).method_18456().forEach(var0 -> ((Iface0643)var0).dataManager().m6000().m12000(false));
      }

      return super.m14000();
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   @Iface0642
   public void m6000(rw.module.NoEntityTrace var1) {
      this.m10000();
      if ((Boolean)((C0991)this.f2000[0]).i() && ((Iface0643)var1.m4000()).dataManager().m6000().m10000()) {
         var1.N();
      }
   }

   @Iface0642
   public void m8000(Ilnorttr var1) {
      if (var1.m14000() instanceof NNNwz var2) {
         NursultanClient.m36000().m36000(() -> {
            if (wY.N(var2)) {
               ((Iface0643)var2).dataManager().m6000().m12000(true);
            }
         });
      }
   }
}
