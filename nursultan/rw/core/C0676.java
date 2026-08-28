package rw.core;

import KDFzREm.Nef;
import KDFzREm.Nhd;
import KDFzREm.Nhl;
import rw.gui.Noweb;
import rw.module.Module010;

public class C0676 extends Base1148<Noweb> {
   public C0676(Noweb var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   @Override
   public void m2000(Object var1) {
      if (var1 instanceof Module010 var2) {
         var2.N();
         rw.setting.C0160.m74000(new Nhl(Nhd.field_12973, var2.m4000(), Nef.field_11033));
      }
   }
}
