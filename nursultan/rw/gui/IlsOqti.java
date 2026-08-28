package rw.gui;

import KDFzREm.NFU;
import KDFzREm.NSg;
import KDFzREm.Nho;
import KDFzREm.Nhq;
import java.util.UUID;
import rw.GuiWidget;
import rw.api.AnnotationDefault;
import rw.api.Iface0642;
import rw.defs.Enum0055;

@AnnotationDefault(
   L = "SRPSpoofer",
   y = Enum0055.MISC,
   N = Enum0070.BASE
)
public class IlsOqti extends GuiWidget {
   static {
      ntfClinit();
   }

   @Iface0642
   public void m2000(rw.module.AutoAccept var1) {
      if (var1.m6000() instanceof NSg var2) {
         var1.N();
         UUID var5 = var2.N();
         NFU var4 = var1.m2000();
         var4.method_10743(new Nho(var5, Nhq.field_13016));
         var4.method_10743(new Nho(var5, Nhq.field_13017));
      }
   }
}
