package rw.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import rw.api.Iface0194;
import rw.core.C0283;
import rw.core.C0290;
import rw.core.C0292;
import rw.core.C0294;
import rw.core.C0301;
import rw.data.Rec0091;
import rw.gui.Rec0015;

final class C0030 {
   private final C0032 f1000;
   private final Iface0194 f2000;

   private C0059 m2000(C0294 var1) {
      return Objects.requireNonNull(var1.m4000(), "resolvedElement");
   }

   C0030(C0032 var1, Iface0194 var2) {
      this.f1000 = Objects.requireNonNull(var1, "nodeSpecCompiler");
      this.f2000 = var2 == null ? Iface0194.f1000 : var2;
   }

   private void m4000(C0059 var1, List<C0294> var2) {
      if (var1.m102000() != 0) {
         ArrayList var3 = new ArrayList(var1.m102000());
         ArrayList var4 = new ArrayList();
         int var5 = 0;

         for (int var6 = 0; var6 < var1.m102000(); var6++) {
            C0059 var7 = var1.m148000(var6);
            if (!C0283.m4000(var7)) {
               var4.add(var7);
            } else if (var7.m26000()) {
               var3.add(var7);
            } else {
               if (var5 >= var2.size()) {
                  throw new IllegalStateException("Unplanned active child during reorder: " + var7);
               }

               var3.add(Objects.requireNonNull(((C0294)var2.get(var5)).m4000(), "resolvedElement"));
               var5++;
            }
         }

         while (var5 < var2.size()) {
            var3.add(Objects.requireNonNull(((C0294)var2.get(var5)).m4000(), "resolvedElement"));
            var5++;
         }

         var3.addAll(var4);
         var1.m128000(var3);
      }
   }

   private C0059 m6000(C0294 var1, Rec0015 var2) {
      if (!var1.m16000()) {
         return this.m2000(var1);
      } else {
         C0059 var3 = Objects.requireNonNull(var1.m8000(), "existing");
         var3.m90000();
         var1.m12000(var3);
         this.m24000(var3, var1, var2);
         return var3;
      }
   }

   private void m8000(C0294 var1) {
      if (!var1.m16000()) {
         if (var1.m4000() == null) {
            this.m12000(var1);
         }
      } else {
         for (C0294 var3 : var1.m6000().m8000()) {
            this.m8000(var3);
         }
      }
   }

   C0059 m10000(C0294 var1, Rec0015 var2) {
      Objects.requireNonNull(var1, "plan");
      Objects.requireNonNull(var2, "options");
      if (!var1.m16000()) {
         return this.m2000(var1);
      } else {
         C0059 var3 = Objects.requireNonNull(var1.m8000(), "existing");
         var1.m12000(var3);
         this.m24000(var3, var1, var2);
         return var3;
      }
   }

   private C0059 m12000(C0294 var1) {
      C0059 var2 = this.f1000.m2000(var1.m14000());
      this.m18000(var1, var2);
      return var2;
   }

   void m14000(rw.data.Rec0094 var1) {
      Objects.requireNonNull(var1, "plan");
      this.m8000(var1.m4000());
   }

   C0059 m16000(C0031 var1) {
      return this.f1000.m2000(var1);
   }

   private void m18000(C0294 var1, C0059 var2) {
      var1.m12000(var2);
      List var3 = var1.m6000().m8000();

      for (int var4 = 0; var4 < var3.size(); var4++) {
         this.m18000((C0294)var3.get(var4), var2.m148000(var4));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void m20000(C0059 var1, C0031 var2) {
      switch (C0292.f1000[var2.m20000().ordinal()]) {
         case 1:
            var1.m140000(var2.m4000());
            break;
         case 2:
            var1.m140000(var2.m4000());
            var1.m126000(var2.m6000());
            break;
         case 3:
            var1.m6000(var2.m8000());
            break;
         case 4:
            var1.m158000(var2.m14000());
         case 5:
      }
   }

   private void m22000(C0059 var1, Rec0091 var2, Rec0015 var3) {
      this.m26000(var1, var2.m2000());

      for (C0294 var5 : var2.m8000()) {
         C0059 var6 = this.m6000(var5, var3);
         if (!var5.m16000()) {
            var1.m172000(var6);
         }
      }

      for (C0059 var8 : var2.m6000()) {
         if (var8.m180000() == var1 && !var8.m26000()) {
            var8.m58000();
         }
      }

      this.m4000(var1, var2.m8000());
   }

   private void m24000(C0059 var1, C0294 var2, Rec0015 var3) {
      C0031 var4 = var2.m14000();
      C0290 var5 = C0301.m2000(var4);
      if (var5 != null) {
         var5.m4000(var1);
      }

      var1.m142000(var4.m32000());
      var1.m156000(var4.m10000());
      var1.m50000();

      for (C0033 var7 : var4.m16000()) {
         var1.m160000(var7.m6000(), var7.m4000(), var7.m2000());
      }

      this.m20000(var1, var4);
      this.m22000(var1, var2.m6000(), var3);
   }

   private void m26000(C0059 var1, List<C0059> var2) {
      for (C0059 var4 : var2) {
         if (var4.m180000() == var1) {
            this.f2000.beforeDetach(var4);
            var1.m116000(var4);
         }
      }
   }
}
