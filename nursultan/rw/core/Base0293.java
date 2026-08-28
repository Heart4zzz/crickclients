package rw.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import rw.api.Iface0200;
import rw.api.Iface0201;
import rw.api.Iface0217;
import rw.setting.C0031;

public abstract class Base0293<T extends Base0293<T>> extends Base0298<T> {
   private final List<C0031> f1000 = new ArrayList<>();

   public T m2000(Consumer<C0286> var1) {
      C0286 var2 = C0287.m8000();
      if (var1 != null) {
         var1.accept(var2);
      }

      return this.m22000(var2);
   }

   public T m4000(String var1) {
      return this.m22000(C0287.m34000(var1));
   }

   Base0293() {
   }

   protected final List<C0031> m6000() {
      return List.copyOf(this.f1000);
   }

   public T m8000(Consumer<C0299> var1) {
      C0299 var2 = C0287.m36000();
      if (var1 != null) {
         var1.accept(var2);
      }

      return this.m22000(var2);
   }

   public T m10000(String var1) {
      return this.m22000(C0287.m4000(var1));
   }

   public T m12000(String var1) {
      return this.m22000(C0287.m10000(var1));
   }

   public T m14000(Consumer<C0300> var1) {
      C0300 var2 = C0287.m6000();
      if (var1 != null) {
         var1.accept(var2);
      }

      return this.m22000(var2);
   }

   public T m16000(Consumer<C0296> var1) {
      C0296 var2 = C0287.m2000();
      if (var1 != null) {
         var1.accept(var2);
      }

      return this.m22000(var2);
   }

   public T m18000(rw.setting.C0056 var1) {
      return this.m34000(var1, null);
   }

   public T m20000(C0031 var1) {
      if (var1 != null) {
         this.f1000.add(var1);
      }

      return (T)this.R();
   }

   public T m22000(Iface0200 var1) {
      if (var1 != null) {
         this.f1000.add(var1.m2000());
      }

      return (T)this.R();
   }

   public T m24000(Iface0217 var1) {
      return this.m22000(C0287.m22000(var1));
   }

   public T m26000(Collection<? extends C0031> var1) {
      if (var1 != null) {
         for (C0031 var3 : var1) {
            this.m20000(var3);
         }
      }

      return (T)this.R();
   }

   public T m28000(Iface0200 var1) {
      return this.m22000(var1);
   }

   public T m30000(C0031 var1) {
      return this.m20000(var1);
   }

   private void m32000(Object var1) {
      if (var1 instanceof C0031 var3) {
         this.f1000.add(var3);
      } else {
         if (var1 instanceof Iface0200 var2) {
            this.f1000.add(var2.m2000());
         }
      }
   }

   public T m34000(rw.setting.C0056 var1, Consumer<C0288> var2) {
      return this.m20000(C0287.m26000(var1, var2));
   }

   public T m36000(Consumer<C0288> var1) {
      return this.m20000(C0287.m24000(var1));
   }

   public C0031 m38000(Object... var1) {
      if (var1 != null) {
         for (Object var5 : var1) {
            this.m32000(var5);
         }
      }

      return this.i();
   }

   public <I> T m40000(List<I> var1, Iface0201<I> var2) {
      if (var1 != null && var2 != null) {
         for (int var3 = 0; var3 < var1.size(); var3++) {
            this.m20000(var2.m2000(var1.get(var3), var3));
         }

         return (T)this.R();
      } else {
         return (T)this.R();
      }
   }

   public T m42000(String var1, rw.setting.C0056 var2) {
      return this.m20000(C0287.m30000(var1, var2));
   }

   public T m44000(boolean var1, Supplier<C0031> var2) {
      if (var1 && var2 != null) {
         this.m20000((C0031)var2.get());
      }

      return (T)this.R();
   }
}
