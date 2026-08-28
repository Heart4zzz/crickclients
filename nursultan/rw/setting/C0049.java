package rw.setting;

import java.util.Objects;
import rw.core.C0346;
import rw.data.Rec0089;

public final class C0049 {
   private final C0054 f1000;

   C0049(rw.gui.C0013 var1) {
      this.f1000 = new C0054(Objects.requireNonNull(var1, "context"));
   }

   public C0346 m4000(C0059 var1, float var2, float var3, Rec0089 var4, boolean var5) {
      return this.f1000.m40000(var1, var2, var3, var4, var5);
   }

   public static C0049 m6000(rw.gui.C0013 var0) {
      rw.gui.C0013 var1 = Objects.requireNonNull(var0, "context");
      return var1.m10000(C0049.class).orElseGet(() -> {
         C0049 var1x = new C0049(var1);
         var1.m12000(C0049.class, var1x);
         return var1x;
      });
   }

   public C0346 m8000(C0059 var1, float var2, float var3) {
      return this.f1000.m42000(var1, var2, var3);
   }
}
