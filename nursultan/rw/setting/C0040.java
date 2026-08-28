package rw.setting;

import java.util.Objects;
import java.util.function.Supplier;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0199;
import rw.api.Iface0202;
import rw.api.Iface0204;
import rw.core.C0297;
import rw.data.Rec0106;
import rw.defs.Enum0023;

final class C0040 implements Iface0202 {
   private final C0044 f1000;
   private final Rec0106 f2000;

   C0040(C0044 var1, Rec0106 var2) {
      this.f1000 = Objects.requireNonNull(var1, "stateStore");
      this.f2000 = Objects.requireNonNull(var2, "path");
   }

   public <T extends Iface0204> T m2000(String var1, Supplier<T> var2) {
      return this.m10000(var1, var2, Enum0023.f1000);
   }

   public <T> Iface0196<T> m4000(String var1, T var2) {
      return this.m6000(var1, () -> (T)var2);
   }

   public <T> Iface0196<T> m6000(String var1, Supplier<T> var2) {
      return this.f1000.m32000(var1, var2);
   }

   @Override
   public <T extends Iface0204> T m10000(String var1, Supplier<T> var2, Enum0023 var3) {
      return this.f1000.m8000(this.f2000, var1, var2, var3);
   }

   public <T> Iface0196<T> m12000(String var1, T var2) {
      return this.m30000(var1, (T)var2, Enum0023.f1000);
   }

   public <C> C0031 m14000(String var1, Iface0197<C> var2, C var3) {
      return this.f1000.m40000(this.f2000, var1, var2, var3);
   }

   @Override
   public void m16000(String var1) {
      this.f1000.m30000(this.f2000, var1);
   }

   public <T> C0031 m20000(C0297<T> var1, T var2, Supplier<C0031> var3) {
      return this.f1000.m42000(var1, var2, var3);
   }

   public <T> Iface0196<T> m22000(String var1, Supplier<T> var2, Enum0023 var3) {
      return this.f1000.m34000(this.f2000, var1, var2, var3);
   }

   public <T> T m24000(C0297<T> var1) {
      return this.f1000.m44000(var1);
   }

   public <T> Iface0196<T> m26000(String var1, Supplier<T> var2) {
      return this.m22000(var1, var2, Enum0023.f1000);
   }

   public <T> T m28000(String var1, Supplier<T> var2, Iface0199<T> var3) {
      return this.f1000.m46000(this.f2000, var1, var2, var3);
   }

   public <T> Iface0196<T> m30000(String var1, T var2, Enum0023 var3) {
      return this.m22000(var1, () -> (T)var2, var3);
   }
}
