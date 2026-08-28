package rw.core;

import KDFzREm.NbK;
import java.util.function.Predicate;
import rw.gui.NoInteract;
import rw.module.NoEntityTrace;

public class IlIniissm extends Base1148<NoInteract> {
   public Object[] f1000;

   public IlIniissm(NoInteract var1, String var2, boolean var3, Predicate<NbK> var4) {
      super(var1, var2, var3);
      this.m4000();
      this.f1000[0] = var4;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public void m8000(Object var1) {
      this.m4000();
      if (var1 instanceof NoEntityTrace var2 && ((Predicate)this.f1000[0]).test(var2.m4000())) {
         var2.N();
      }
   }
}
