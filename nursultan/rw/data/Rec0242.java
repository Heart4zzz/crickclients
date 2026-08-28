package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record Rec0242() {
   private final List<Object> f1000;

   Rec0242(List<Object> var1) {
      this.f1000 = var1;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0242,"subkeys",Rec0242::f1000>(this, var1);
   }

   public List<Object> m4000() {
      return this.f1000;
   }
}
