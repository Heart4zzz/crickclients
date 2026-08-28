package rw.core;

import java.util.List;

final class C0336 {
   private List<rw.setting.C0059> f1000 = List.of();
   private int f2000;
   private int f3000;
   private boolean f4000;

   void m2000(List<rw.setting.C0059> var1, int var2, int var3, int var4) {
      this.f1000 = var1 != null && !var1.isEmpty() ? List.copyOf(var1) : List.of();
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = !this.f1000.isEmpty() || var4 == 0;
   }

   List<rw.setting.C0059> m4000() {
      return this.f1000;
   }

   boolean m6000(int var1, int var2, int var3) {
      return this.f4000 && this.f2000 == var1 && this.f3000 == var2 && this.f1000.size() == var3;
   }
}
