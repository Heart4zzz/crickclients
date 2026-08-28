package rw.setting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import rw.api.Iface0196;
import rw.api.Iface0197;
import rw.api.Iface0199;
import rw.api.Iface0202;
import rw.api.Iface0204;
import rw.core.C0284;
import rw.core.C0297;
import rw.core.C0311;
import rw.core.C0313;
import rw.data.Rec0095;
import rw.data.Rec0106;
import rw.defs.Enum0023;

final class C0044 {
   private final C0043 f1000;
   private final Runnable f2000;
   private final Rec0106 f3000;
   private final Map<Rec0095, C0037<?>> f4000 = new HashMap<>();
   private final Map<String, C0037<?>> f5000 = new HashMap<>();
   private final Map<Rec0095, C0311<?>> f6000 = new HashMap<>();
   private final Set<Rec0106> f7000 = new HashSet<>();
   private final Set<Rec0095> f8000 = new HashSet<>();
   private final Set<Rec0095> f9000 = new HashSet<>();
   private C0042 f10000;
   private boolean f11000;

   void m2000() {
      if (this.f11000) {
         for (Rec0095 var2 : this.f9000) {
            C0311 var3 = this.f6000.get(var2);
            if (var3 != null) {
               var3.m2000();
            }
         }

         this.f4000.entrySet().removeIf(var1 -> this.m18000(var1.getKey(), var1.getValue()));
         this.f6000.keySet().removeIf(var1 -> !this.f9000.contains(var1));
         this.f7000.clear();
         this.f8000.clear();
         this.f9000.clear();
         this.f10000 = null;
         this.f11000 = false;
      }
   }

   C0044(C0043 var1, Runnable var2, String var3) {
      this.f1000 = Objects.requireNonNull(var1, "tickerManager");
      this.f2000 = Objects.requireNonNull(var2, "requestRender");
      this.f3000 = Rec0106.m8000(var3);
   }

   boolean m4000() {
      if (this.f6000.isEmpty()) {
         return false;
      } else {
         for (C0311 var2 : this.f6000.values()) {
            if (var2.m4000()) {
               return true;
            }
         }

         return false;
      }
   }

   void m6000() {
      for (Rec0095 var2 : this.f8000) {
         C0037 var3 = this.f4000.get(var2);
         if (var3 != null && var3.f3000) {
            this.m16000(var3);
         }
      }

      this.f7000.clear();
      this.f8000.clear();
      this.f9000.clear();
      this.f10000 = null;
      this.f11000 = false;
   }

   <T extends Iface0204> T m8000(Rec0106 var1, String var2, Supplier<T> var3, Enum0023 var4) {
      Rec0095 var5 = this.m12000(var1, var2, "ticker name");
      Enum0023 var6 = this.m28000(var4);
      C0037 var7 = this.f4000.get(var5);
      if (var7 != null) {
         if (!var7.f3000) {
            throw new IllegalStateException("State name is already used by a value: " + var5);
         } else {
            var7.f2000 = var6;
            Iface0204 var10 = var7.f1000;
            this.m14000(var5, var10);
            return (T)var10;
         }
      } else {
         Iface0204 var8 = this.m24000(var3, var5);
         C0037 var9 = new C0037<>(var8, var6, true, this.f2000);
         this.f4000.put(var5, var9);
         this.m14000(var5, var8);
         return (T)var8;
      }
   }

   Iface0202 m10000() {
      return this.m36000(this.f3000);
   }

   private Rec0095 m12000(Rec0106 var1, String var2, String var3) {
      return new Rec0095(var1, C0313.m2000(var2, var3));
   }

   private void m14000(Rec0095 var1, Iface0204 var2) {
      this.f8000.add(var1);
      this.f1000.m10000(var2, this.f2000);
   }

   private void m16000(C0037<?> var1) {
      this.f1000.m4000((Iface0204)var1.f1000);
   }

   private boolean m18000(Rec0095 var1, C0037<?> var2) {
      boolean var3 = this.f8000.contains(var1);
      if (var2.f3000 && !var3) {
         this.m16000(var2);
      }

      boolean var4 = var2.f2000 == Enum0023.f1000 && !this.f7000.contains(var1.m6000());
      if (var4 && var2.f3000 && var3) {
         this.m16000(var2);
      }

      return var4;
   }

   private <T extends Iface0204> T m24000(Supplier<T> var1, Rec0095 var2) {
      return Objects.requireNonNull((T)Objects.requireNonNull(var1, "initialValue").get(), "Ticker supplier returned null: " + var2);
   }

   private <T> T m26000(Supplier<T> var1) {
      return (T)(var1 == null ? null : var1.get());
   }

   private Enum0023 m28000(Enum0023 var1) {
      return var1 == null ? Enum0023.f1000 : var1;
   }

   void m30000(Rec0106 var1, String var2) {
      C0037 var3 = this.f4000.remove(this.m12000(var1, var2, "state name"));
      if (var3 != null && var3.f3000) {
         this.m16000(var3);
      }
   }

   <T> Iface0196<T> m32000(String var1, Supplier<T> var2) {
      String var3 = C0313.m2000(var1, "app state name");
      C0037 var4 = this.f5000.get(var3);
      if (var4 != null) {
         return var4;
      } else {
         C0037 var5 = new C0037<>(this.m26000(var2), Enum0023.f3000, false, this.f2000);
         this.f5000.put(var3, var5);
         return var5;
      }
   }

   <T> Iface0196<T> m34000(Rec0106 var1, String var2, Supplier<T> var3, Enum0023 var4) {
      Rec0095 var5 = this.m12000(var1, var2, "state name");
      Enum0023 var6 = this.m28000(var4);
      C0037 var7 = this.f4000.get(var5);
      if (var7 != null) {
         if (var7.f3000) {
            throw new IllegalStateException("State name is already used by a ticker: " + var5);
         } else {
            var7.f2000 = var6;
            return var7;
         }
      } else {
         C0037 var8 = new C0037<>(this.m26000(var3), var6, false, this.f2000);
         this.f4000.put(var5, var8);
         return var8;
      }
   }

   Iface0202 m36000(Rec0106 var1) {
      if (!this.f11000) {
         throw new IllegalStateException("State scope can only be opened while rendering");
      } else if (!this.f7000.add(var1)) {
         throw new IllegalStateException("Duplicate state scope path: " + var1);
      } else {
         return new C0040(this, var1);
      }
   }

   void m38000() {
      if (this.f11000) {
         throw new IllegalStateException("Stateful render is already in progress");
      } else {
         this.f7000.clear();
         this.f8000.clear();
         this.f9000.clear();
         this.f10000 = null;
         this.f11000 = true;
      }
   }

   <C> C0031 m40000(Rec0106 var1, String var2, Iface0197<C> var3, C var4) {
      String var5 = C0313.m2000(var2, "component key");
      Iface0197 var6 = Objects.requireNonNull(var3, "component");
      Rec0106 var7 = var1.m4000(var5);
      Iface0202 var8 = this.m36000(var7);
      C0031 var9 = var6.m2000(var4, var8);
      return Objects.requireNonNull(var9, "Stateful component returned null: " + var7);
   }

   <T> C0031 m42000(C0297<T> var1, T var2, Supplier<C0031> var3) {
      Objects.requireNonNull(var1, "context");
      Objects.requireNonNull(var3, "render");
      C0042 var4 = this.f10000;
      this.f10000 = new C0042(var4, var1, var2);

      C0031 var5;
      try {
         var5 = Objects.requireNonNull((C0031)var3.get(), "Context provider returned null: " + var1);
      } finally {
         this.f10000 = var4;
      }

      return var5;
   }

   <T> T m44000(C0297<T> var1) {
      C0297 var2 = Objects.requireNonNull(var1, "context");
      Object var3 = this.f10000 == null ? C0042.f1000 : this.f10000.m2000(var2);
      if (var3 != C0042.f1000) {
         return (T)var3;
      } else if (var2.m6000()) {
         return (T)var2.m2000();
      } else {
         throw new C0284("Missing context: " + var2);
      }
   }

   <T> T m46000(Rec0106 var1, String var2, Supplier<T> var3, Iface0199<T> var4) {
      Rec0095 var5 = this.m12000(var1, var2, "observable name");
      Supplier var6 = Objects.requireNonNull(var3, "snapshot");
      Iface0199 var7 = Objects.requireNonNull(var4, "changeDetector");
      Object var8 = var6.get();
      C0311 var9 = this.f6000.get(var5);
      if (var9 == null) {
         this.f6000.put(var5, new C0311<>(var8, var6, var7));
      } else {
         var9.f2000 = (T)var8;
         var9.f3000 = var6;
         var9.f4000 = var7;
      }

      this.f9000.add(var5);
      return (T)var8;
   }
}
