package rw.core;

import rw.GuiWidget;
import rw.api.Iface0578;
import rw.data.IlqOps;
import rw.data.Rec0008;
import rw.defs.BootstrapMethods;
import rw.gui.PgUp;

public class C0042 {
   private static String[] f1000;

   private C0042() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   public static C0073 m10000(Iface0578 var0) {
      return new C0073(new Rec0008(var0), null, (BootstrapMethods)BootstrapMethods.f3000[0], (PgUp)PgUp.f4000[0], 0);
   }

   public static C0073 m12000(GuiWidget var0, PgUp var1) {
      return new C0073(new IlqOps(var0), "module/" + var0.m42000(), (BootstrapMethods)BootstrapMethods.f3000[0], var1, 0);
   }

   public static C0073 m16000(Iface0578 var0) {
      return new C0073(new Rec0008(var0), null, (BootstrapMethods)BootstrapMethods.f3000[1], (PgUp)PgUp.f4000[0], 0);
   }

   private static void m20000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated"};
   }
}
