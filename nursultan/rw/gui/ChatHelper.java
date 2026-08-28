package rw.gui;

import java.util.List;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.core.Base1017;
import rw.core.C0701;
import rw.core.C0703;
import rw.core.C1003;
import rw.core.C1034;
import rw.defs.Enum0055;
import rw.setting.C0122;

@AnnotationDefault(
   L = "ChatHelper",
   y = Enum0055.MISC,
   N = Enum0070.HELPER
)
public class ChatHelper extends GuiWidget {
   public Object[] f1000;
   private static String[] f2000;

   public ChatHelper() {
      this.m6000();
      C1034 var5 = new C1034(this, f2000[0], true);
      this.f1000[0] = var5;
      C1003 var6 = C0122.m4000(this, f2000[1], (Base1017)this.f1000[0]);
      this.f1000[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f2000 = new String[]{"better-commands", "chat-addons"};
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   @Iface0642
   public void m8000(C0703 var1) {
      this.m6000();
      ((List)((C1003)this.f1000[1]).i()).forEach(var1x -> var1x.y(var1));
   }

   @Iface0642
   public void m10000(C0701 var1) {
      this.m6000();
      ((List)((C1003)this.f1000[1]).i()).forEach(var1x -> var1x.y(var1));
   }

   @Iface0642
   public void m12000(rw.module.AutoAccept var1) {
      this.m6000();
      ((List)((C1003)this.f1000[1]).i()).forEach(var1x -> var1x.y(var1));
   }
}
