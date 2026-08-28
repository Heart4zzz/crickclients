package rw.core;

import java.util.function.Consumer;
import rw.gui.NoDelay;

public class C1091 extends Base1099 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C1091(NoDelay var1, String var2, boolean var3, Consumer<Object> var4) {
      super(var1, var2, var3);
      this.m2000();
      this.f1000[0] = var4;
   }

   static {
      ntfClinit();
   }

   public void m6000(Object var1) {
      this.m2000();
      ((Consumer)this.f1000[0]).accept(var1);
   }
}
