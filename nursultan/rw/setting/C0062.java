package rw.setting;

import java.util.Objects;
import rw.core.C0347;
import rw.core.C0393;
import rw.core.C0395;
import rw.core.C0402;
import rw.core.C0405;
import rw.core.C0408;
import rw.core.C0412;
import rw.data.Rec0132;
import rw.data.Rec0133;
import rw.defs.Enum0046;

final class C0062 {
   private final C0063 f1000;
   private final C0059 f2000;
   private final float f3000;
   private final float f4000;
   private final float f5000;
   private final int f6000;
   private final C0393 f7000 = new C0393();
   private int f8000;
   private final C0408 f9000;
   private final C0395 f10000;
   private final C0402 f11000;

   float m2000() {
      return this.f4000;
   }

   int m4000() {
      return this.f8000++;
   }

   C0062(C0063 var1, C0059 var2, float var3, float var4, float var5, int var6) {
      this.f1000 = Objects.requireNonNull(var1, "engine");
      this.f2000 = Objects.requireNonNull(var2, "root");
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f9000 = new C0408(this);
      this.f10000 = new C0395(this);
      this.f11000 = new C0402(this);
   }

   void m6000() {
      this.f9000.m6000();
      this.f10000.m2000();
      this.f11000.m2000();
      this.f2000.m4000(14);
   }

   C0393 m8000() {
      return this.f7000;
   }

   int m10000() {
      return this.f6000;
   }

   float m12000() {
      return this.f3000;
   }

   float m14000(C0059 var1, Enum0046 var2, float var3) {
      float var4 = this.f1000.m4000().m32000(var1, var2, var3);
      this.m20000(var1).m18000(var2, !C0405.m32000(var4, var3));
      return var4;
   }

   Rec0132 m16000(C0059 var1, rw.gui.C0019 var2, float var3) {
      return this.f1000.m24000(var1, var2, var3);
   }

   C0059 m18000() {
      return this.f2000;
   }

   C0412 m20000(C0059 var1) {
      C0412 var2 = m24000(var1.m42000());
      if (var2.f12000 != this.f6000) {
         var2.m16000();
         var2.f12000 = this.f6000;
      }

      return var2;
   }

   Rec0133 m22000(C0059 var1, rw.gui.C0019 var2) {
      return this.f1000.m22000(var1, var2);
   }

   private static C0412 m24000(C0347 var0) {
      if (var0.m68000() instanceof C0412 var3) {
         return var3;
      } else {
         C0412 var1 = new C0412();
         var0.m74000(var1);
         return var1;
      }
   }

   float m26000() {
      return this.f5000;
   }
}
