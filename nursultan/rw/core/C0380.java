package rw.core;

import java.util.List;
import rw.api.Iface0216;

final class C0380 {
   private List<Iface0216> f1000 = List.of();
   private int f2000;
   private int f3000;
   private int f4000;
   private int f5000;
   private int f6000;
   private boolean f7000;

   void m2000() {
      this.f1000 = List.of();
      this.f2000 = 0;
      this.f3000 = 0;
      this.f4000 = 0;
      this.f5000 = 0;
      this.f6000 = 0;
      this.f7000 = false;
   }

   int m4000() {
      return this.f2000;
   }

   void m6000(List<Iface0216> var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null && !var1.isEmpty() && var2 > 0) {
         this.f1000 = List.copyOf(var1);
         this.f2000 = var2;
         this.f3000 = var3;
         this.f4000 = var4;
         this.f5000 = var5;
         this.f6000 = var6;
         this.f7000 = true;
      } else {
         this.m2000();
      }
   }

   void m8000(int var1) {
      this.f6000 = var1;
   }

   boolean m10000(int var1, int var2) {
      return this.f7000 && this.f6000 == var1 && this.f3000 == var2;
   }

   boolean m12000(int var1, int var2, int var3) {
      return this.f7000 && this.f3000 == var1 && this.f4000 == var2 && this.f5000 == var3;
   }

   List<Iface0216> m14000() {
      return this.f1000;
   }
}
