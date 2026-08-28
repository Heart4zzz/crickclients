package rw.gui;

import java.util.ArrayList;
import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base0793;
import rw.defs.Enum0055;
import rw.module.OlpnniIl;
import rw.setting.OllpIstp;
import rw.setting.SocketX;

@AnnotationDefault(
   L = "ClickAction",
   y = Enum0055.MISC,
   N = Enum0070.BASE
)
public class ClickAction extends GuiWidget {
   public Object[] f1000;

   public ClickAction() {
      this.m2000();
      ArrayList var5 = new ArrayList();
      this.f1000[0] = var5;
      this.m2000(new OlpIilj(this));
      this.m2000(new OllpIstp(this));
      this.m2000(new SocketX(this));
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

   private void m2000(Base0793 var1) {
      this.m2000();
      ((List)this.f1000[0]).add(var1);
   }

   @Iface0642(
      u = true
   )
   public void m4000(OlpnniIl var1) {
      this.m2000();

      for (Base0793 var3 : (List)this.f1000[0]) {
         var3.m12000(var1);
      }
   }
}
