package rw.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import rw.core.C0281;
import rw.core.C0283;
import rw.core.C0294;
import rw.core.C0295;
import rw.data.Rec0091;
import rw.data.Rec0094;
import rw.defs.Enum0024;
import rw.defs.Enum0025;
import rw.setting.C0024;
import rw.setting.C0031;

final class C0014 {
   private final rw.setting.C0059 f1000;
   private final C0031 f2000;
   private final Rec0015 f3000;
   private final C0024 f4000;
   private final Set<rw.setting.C0059> f5000 = Collections.newSetFromMap(new IdentityHashMap<>());

   private void m2000(rw.setting.C0059 var1) {
      if (var1 != null && !this.m4000(var1)) {
         this.f5000.add(var1);
      }
   }

   C0014(rw.setting.C0059 var1, C0031 var2, Rec0015 var3, C0024 var4) {
      this.f1000 = Objects.requireNonNull(var1, "root");
      this.f2000 = Objects.requireNonNull(var2, "spec");
      this.f3000 = Objects.requireNonNull(var3, "options");
      this.f4000 = Objects.requireNonNull(var4, "animationManager");
   }

   private boolean m4000(rw.setting.C0059 var1) {
      for (rw.setting.C0059 var2 = var1; var2 != null; var2 = var2.m180000()) {
         if (this.f5000.contains(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean m6000(rw.setting.C0059 var1) {
      return !this.m12000(var1);
   }

   private void m8000(rw.setting.C0059 var1, C0031 var2, Set<rw.setting.C0059> var3, Set<rw.setting.C0059> var4, List<rw.setting.C0059> var5) {
      String var6 = C0295.m14000(var2);
      if (var6 != null) {
         for (int var7 = var1.m102000() - 1; var7 >= 0; var7--) {
            rw.setting.C0059 var8 = var1.m148000(var7);
            if (C0283.m4000(var8)
               && !var3.contains(var8)
               && !var4.contains(var8)
               && !this.m4000(var8)
               && var6.equals(C0295.m12000(var8))
               && !C0295.m8000(var8, var2)) {
               this.m14000(var8, var4, var5);
            }
         }
      }
   }

   private rw.setting.C0059 m10000(rw.setting.C0059 var1, int var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var1.m102000(); var4++) {
         rw.setting.C0059 var5 = var1.m148000(var4);
         if (C0283.m2000(var5) && !this.m4000(var5)) {
            if (var3 == var2) {
               return var5;
            }

            var3++;
         }
      }

      return null;
   }

   private boolean m12000(rw.setting.C0059 var1) {
      return this.f3000.m2000() != Enum0024.f2000 && C0281.m2000(var1, this.f4000);
   }

   private void m14000(rw.setting.C0059 var1, Set<rw.setting.C0059> var2, List<rw.setting.C0059> var3) {
      if (var2.add(var1)) {
         var3.add(var1);
         this.m2000(var1);
      }
   }

   Rec0094 m16000() {
      C0294 var1 = C0295.m8000(this.f1000, this.f2000) ? this.m26000(this.f1000, this.f2000) : this.m18000(this.f2000);
      if (!var1.m16000()) {
         this.m2000(this.f1000);
      }

      return new Rec0094(var1);
   }

   private C0294 m18000(C0031 var1) {
      C0294 var2 = new C0294(var1, null, Enum0025.f2000);
      ArrayList var3 = new ArrayList(var1.m2000().size());

      for (C0031 var5 : var1.m2000()) {
         var3.add(this.m18000(var5));
      }

      var2.m10000(new Rec0091(var3, List.of(), List.of()));
      return var2;
   }

   private Rec0091 m20000(rw.setting.C0059 var1, List<C0031> var2) {
      int var3 = var1.m102000();
      if (var2.isEmpty() && var3 == 0) {
         return Rec0091.m10000();
      } else {
         Set var4 = Collections.newSetFromMap(new IdentityHashMap(var2.size()));
         Set var5 = Collections.newSetFromMap(new IdentityHashMap(var3));
         Set var6 = Collections.newSetFromMap(new IdentityHashMap(var3));
         ArrayList var7 = new ArrayList();
         ArrayList var8 = new ArrayList();
         ArrayList var9 = new ArrayList(var2.size());

         for (int var10 = 0; var10 < var2.size(); var10++) {
            C0031 var11 = (C0031)var2.get(var10);
            this.m8000(var1, var11, var4, var5, var7);
            rw.setting.C0059 var12 = this.m28000(var1, var11, var10, var4);
            if (var12 == null) {
               var9.add(this.m18000(var11));
            } else {
               var4.add(var12);
               var6.add(var12);
               var9.add(this.m26000(var12, var11));
            }
         }

         this.m22000(var1, var4, var5, var6, var7, var8);
         this.m24000(var1, var6);
         return new Rec0091(var9, var7, var8);
      }
   }

   private void m22000(
      rw.setting.C0059 var1,
      Set<rw.setting.C0059> var2,
      Set<rw.setting.C0059> var3,
      Set<rw.setting.C0059> var4,
      List<rw.setting.C0059> var5,
      List<rw.setting.C0059> var6
   ) {
      for (int var7 = 0; var7 < var1.m102000(); var7++) {
         rw.setting.C0059 var8 = var1.m148000(var7);
         if (C0283.m4000(var8) && !var2.contains(var8) && !var3.contains(var8) && !this.m4000(var8)) {
            if (this.m6000(var8)) {
               this.m14000(var8, var3, var5);
               var4.add(var8);
            } else {
               if (!var8.m26000()) {
                  var6.add(var8);
               }

               var4.add(var8);
            }
         }
      }
   }

   private void m24000(rw.setting.C0059 var1, Set<rw.setting.C0059> var2) {
      for (int var3 = 0; var3 < var1.m102000(); var3++) {
         rw.setting.C0059 var4 = var1.m148000(var3);
         if (C0283.m4000(var4) && !this.m4000(var4) && !var2.contains(var4)) {
            throw new IllegalStateException("Unplanned normal child during reconciliation: " + var4);
         }
      }
   }

   private C0294 m26000(rw.setting.C0059 var1, C0031 var2) {
      C0294 var3 = new C0294(var2, var1, Enum0025.f1000);
      var3.m10000(this.m20000(var1, var2.m2000()));
      return var3;
   }

   private rw.setting.C0059 m28000(rw.setting.C0059 var1, C0031 var2, int var3, Set<rw.setting.C0059> var4) {
      if (C0295.m14000(var2) != null) {
         for (int var7 = 0; var7 < var1.m102000(); var7++) {
            rw.setting.C0059 var6 = var1.m148000(var7);
            if (C0283.m4000(var6) && !var4.contains(var6) && !this.m4000(var6) && C0295.m8000(var6, var2)) {
               return var6;
            }
         }

         return null;
      } else {
         rw.setting.C0059 var5 = this.m10000(var1, var3);
         return var5 != null && !var4.contains(var5) && C0295.m8000(var5, var2) ? var5 : null;
      }
   }
}
