package rw.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import rw.api.Iface0212;
import rw.core.C0360;
import rw.core.C0373;
import rw.core.C0376;
import rw.defs.Enum0037;
import rw.defs.Enum0047;

public final class C0053 {
   private final C0024 f1000;

   private void m2000(C0059 var1) {
      this.m12000(var1);

      for (int var2 = 0; var2 < var1.m102000(); var2++) {
         C0059 var3 = var1.m148000(var2);
         this.m2000(var3);
      }
   }

   private static C0373 m4000(C0059 var0) {
      C0056 var1 = var0.m54000();
      return var1 == null ? C0373.f1000 : var1.m64000();
   }

   private C0053(rw.gui.C0013 var1) {
      this.f1000 = C0024.m18000(Objects.requireNonNull(var1, "context"));
   }

   private static C0373 m6000(C0059 var0) {
      C0056 var1 = var0.m54000();
      return var1 == null ? C0373.f1000 : var1.m102000();
   }

   private static C0373 m8000(C0059 var0) {
      List var1 = var0.m88000();
      if (var1.isEmpty()) {
         return C0373.f1000;
      } else {
         ArrayList var2 = new ArrayList();

         for (C0059 var3 = var0.m180000(); var3 != null; var3 = var3.m180000()) {
            var2.add(var3);
         }

         C0373 var8 = C0373.f1000;

         for (int var4 = var2.size() - 1; var4 >= 0; var4--) {
            C0059 var5 = (C0059)var2.get(var4);
            C0056 var6 = var5.m54000();
            if (var6 != null && !var6.m68000().m10000()) {
               C0373 var7 = var6.m68000().m16000(var1, var5.m132000(), var5.m176000(), var5.m76000());
               var8 = var8.m78000(var7);
            }
         }

         return var8;
      }
   }

   private void m10000(C0059 var1) {
      for (int var2 = 0; var2 < var1.m102000(); var2++) {
         this.m2000(var1.m148000(var2));
      }
   }

   private void m12000(C0059 var1) {
      rw.gui.C0019 var2 = var1.m78000();
      rw.gui.C0019 var3 = m28000(var1);
      rw.gui.C0019 var4 = this.f1000.m24000(var1, var2, var3, m4000(var1));
      var1.m152000(var4);
      var1.m144000(var4.m46000());
      boolean var5 = !var3.m156000(var2);
      boolean var6 = !var3.m132000(var2);
      boolean var7 = !var3.m4000(var2);
      if (var5) {
         var1.m56000(2);
      } else if (var6) {
         var1.m56000(4);
      } else {
         if (var7) {
            var1.m56000(1);
         }
      }
   }

   public void m16000(C0059 var1) {
      if (var1 != null) {
         this.m12000(var1);
      }
   }

   private static boolean m18000(C0056 var0, boolean var1, boolean var2, boolean var3) {
      if (var0 != null && !var0.m68000().m10000()) {
         C0376 var4 = var0.m68000();
         return var1 && var4.m14000(Enum0037.f1000) || var2 && var4.m14000(Enum0037.f2000) || var3 && var4.m14000(Enum0037.f3000);
      } else {
         return false;
      }
   }

   public static C0053 m20000(rw.gui.C0013 var0) {
      return var0.m10000(C0053.class).orElseGet(() -> {
         C0053 var1 = new C0053(var0);
         var0.m12000(C0053.class, var1);
         return var1;
      });
   }

   public void m22000(C0059 var1, boolean var2, boolean var3, boolean var4) {
      if (var1 != null) {
         boolean var5 = var1.m132000() != var2;
         boolean var6 = var1.m176000() != var3;
         boolean var7 = var1.m76000() != var4;
         if (var5 || var6 || var7) {
            var1.m130000(var2);
            var1.m12000(var3);
            var1.m106000(var4);
            this.m16000(var1);
            if (m18000(var1.m54000(), var5, var6, var7)) {
               this.m10000(var1);
            }
         }
      }
   }

   public void m24000(Iface0212 var1) {
      if (var1 instanceof C0059 var2) {
         this.m2000(var2);
      }
   }

   public void m26000(C0059 var1) {
      if (var1 != null) {
         this.m2000(var1);
      }
   }

   private static rw.gui.C0019 m28000(C0059 var0) {
      rw.gui.C0019 var1 = var0.m120000() == Enum0047.f3000 ? C0360.m2000() : C0360.m4000();
      C0056 var2 = var0.m54000();
      C0373 var3 = var2 == null ? C0373.f1000 : var2.m142000(var0.m132000(), var0.m176000(), var0.m76000());
      var3 = var3.m78000(m8000(var0));
      if (var0.m26000()) {
         return m6000(var0).m92000(var3.m92000(var1));
      } else if (var3.m18000(var0.m66000())) {
         return var0.m84000();
      } else {
         rw.gui.C0019 var4 = var3.m92000(var1);
         var0.m150000(var3, var4);
         return var4;
      }
   }
}
