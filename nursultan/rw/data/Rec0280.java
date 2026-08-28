package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.BooleanSupplier;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.api.Iface0656;
import rw.core.C1044;
import rw.core.C1161;
import rw.setting.C0031;

public record Rec0280() implements Iface0656 {
   public BooleanSupplier f1000;

   public Rec0280(BooleanSupplier var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0280,"checked",Rec0280::f1000>(this, var1);
   }

   public C0031 m10000(Iface0202 var1, C1161 var2) {
      IlpimlpIt var3 = new IlpimlpIt(this.f1000.getAsBoolean(), var0 -> {});
      return var1.m18000("notify-switch-" + var2.m56000(), (Iface0197<IlpimlpIt>)C1044.f13000[0], var3);
   }

   public BooleanSupplier m12000() {
      return this.f1000;
   }
}
