package rw.setting;

import rw.api.Iface0648;
import rw.core.C1104;
import rw.core.OlqIlmnt;
import rw.gui.AutoLeave;

public class C0147 extends C1104 implements Iface0648<AutoLeave> {
   private static String[] f1000;
   public Object[] f2000;

   @Override
   public String m2000() {
      this.m6000();
      return ((OlqIlmnt)this.f2000[0]).m4000();
   }

   public C0147(AutoLeave var1, String var2, boolean var3) {
      super(var1, null, var2, var3);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new String[]{"custom-command", "home home"};
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public void m10000(AutoLeave var1) {
      this.m6000();
      OlqIlmnt var6 = (OlqIlmnt)C0122.m8000(var1, f1000[0], f1000[1], null).N(var1x -> this.U());
      this.f2000[0] = var6;
   }
}
