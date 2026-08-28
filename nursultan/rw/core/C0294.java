package rw.core;

import rw.data.Rec0091;
import rw.defs.Enum0025;
import rw.setting.C0031;

final class C0294 {
   private final C0031 f1000;
   private final rw.setting.C0059 f2000;
   private final Enum0025 f3000;
   private Rec0091 f4000 = Rec0091.m10000();
   private rw.setting.C0059 f5000;

   Enum0025 m2000() {
      return this.f3000;
   }

   C0294(C0031 var1, rw.setting.C0059 var2, Enum0025 var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f5000 = var2;
   }

   rw.setting.C0059 m4000() {
      return this.f5000;
   }

   Rec0091 m6000() {
      return this.f4000;
   }

   rw.setting.C0059 m8000() {
      return this.f2000;
   }

   void m10000(Rec0091 var1) {
      this.f4000 = var1 == null ? Rec0091.m10000() : var1;
   }

   void m12000(rw.setting.C0059 var1) {
      this.f5000 = var1;
   }

   C0031 m14000() {
      return this.f1000;
   }

   boolean m16000() {
      return this.f3000 == Enum0025.f1000;
   }
}
