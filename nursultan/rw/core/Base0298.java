package rw.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import rw.api.Iface0200;
import rw.api.Iface0207;
import rw.api.Iface0212;
import rw.api.Iface0217;
import rw.data.Rec0107;
import rw.defs.Enum0026;
import rw.defs.Enum0047;
import rw.setting.C0031;

public abstract class Base0298<T extends Base0298<T>> implements Iface0200 {
   private String f1000;
   private String f2000;
   private rw.setting.C0056 f3000 = rw.setting.C0056.f1000;
   private final List<rw.setting.C0033> f4000 = new ArrayList<>();
   private final List<C0368> f5000 = new ArrayList<>();
   private C0290<Iface0212> f6000;

   protected final List<C0368> m2000() {
      return List.copyOf(this.f5000);
   }

   Base0298() {
      this.f1000 = null;
      this.f2000 = null;
   }

   public abstract C0031 m4000();

   protected final rw.setting.C0056 m6000() {
      return this.f3000;
   }

   protected final List<rw.setting.C0033> m8000() {
      return List.copyOf(this.f4000);
   }

   T m10000(String var1) {
      this.f2000 = var1;
      return this.m38000();
   }

   public T m12000(Iface0207 var1) {
      return this.m30000(Enum0026.f4000, var1);
   }

   protected final String m14000() {
      return this.f1000;
   }

   public T m16000(Enum0026 var1, Iface0207 var2, Rec0107 var3) {
      if (var1 != null && var2 != null) {
         this.f4000.add(new rw.setting.C0033(var1, var2, var3));
         return this.m38000();
      } else {
         return this.m38000();
      }
   }

   protected final C0031 m18000(Enum0047 var1, List<C0031> var2, String var3, String var4, String var5, Iface0217 var6) {
      return new C0031(this.f1000, this.f2000, var1, var2, this.m8000(), this.m2000(), this.f3000, var3, var4, var5, var6, this.f6000);
   }

   private static boolean m20000(List<C0368> var0, C0368 var1) {
      for (C0368 var3 : var0) {
         if (var3 == var1) {
            return true;
         }
      }

      return false;
   }

   public T m22000(rw.setting.C0056 var1, rw.setting.C0056... var2) {
      if (var2 != null && var2.length != 0) {
         rw.setting.C0056[] var3 = new rw.setting.C0056[var2.length + 1];
         var3[0] = var1;
         System.arraycopy(var2, 0, var3, 1, var2.length);
         return this.m24000(rw.setting.C0056.m120000(var3));
      } else {
         return this.m24000(var1);
      }
   }

   public T m24000(rw.setting.C0056 var1) {
      this.f3000 = var1 == null ? rw.setting.C0056.f1000 : var1;
      return this.m38000();
   }

   public T m26000(C0290<Iface0212> var1) {
      this.f6000 = var1;
      return this.m38000();
   }

   public T m28000(String var1) {
      this.f1000 = var1;
      return this.m38000();
   }

   public T m30000(Enum0026 var1, Iface0207 var2) {
      return this.m16000(var1, var2, Rec0107.f4000);
   }

   public T m32000(C0368... var1) {
      if (var1 != null && var1.length != 0) {
         for (C0368 var5 : var1) {
            this.m34000(var5);
         }

         return this.m38000();
      } else {
         return this.m38000();
      }
   }

   public T m34000(C0368 var1) {
      if (var1 != null && !m20000(this.f5000, var1)) {
         this.f5000.add(var1);
      }

      return this.m38000();
   }

   public T m36000(UnaryOperator<rw.setting.C0056> var1) {
      if (var1 != null) {
         rw.setting.C0056 var2 = var1.apply(this.f3000);
         this.m24000(var2);
      }

      return this.m38000();
   }

   protected abstract T m38000();
}
