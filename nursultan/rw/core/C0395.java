package rw.core;

import rw.defs.Enum0046;
import rw.setting.C0062;

final class C0395 {
   private final C0062 f1000;
   private final C0407 f2000;
   private final C0386 f3000;
   private final C0390 f4000;

   C0395(C0062 var1) {
      this.f1000 = var1;
      this.f2000 = new C0407(var1);
      this.f3000 = new C0386(var1);
      this.f4000 = new C0390(var1);
   }

   void m2000() {
      this.f2000.m8000(this.f1000.m18000());
      this.f3000.m12000(this.f1000.m18000(), Enum0046.f1000, this.f1000.m12000());
      this.f3000.m14000(this.f1000.m18000(), Enum0046.f1000);
      this.f4000.m4000(this.f1000.m18000());
      this.f4000.m2000(this.f1000.m18000());
      this.f3000.m12000(this.f1000.m18000(), Enum0046.f2000, this.f1000.m2000());
      this.f3000.m14000(this.f1000.m18000(), Enum0046.f2000);
   }
}
