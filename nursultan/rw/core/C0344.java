package rw.core;

import java.util.List;
import rw.api.Iface0215;
import rw.api.Iface0216;

final class C0344 {
   private final C0362 f1000 = new C0362();
   private List<Iface0216> f2000 = List.of();
   private List<Iface0216> f3000 = List.of();
   private List<Iface0216> f4000 = List.of();
   private List<Iface0216> f5000 = List.of();
   private List<Iface0216> f6000 = List.of();
   private Iface0215 f7000;
   private boolean f8000;

   List<Iface0216> m2000() {
      return this.f4000;
   }

   void m4000() {
      this.f2000 = List.of();
      this.f3000 = List.of();
      this.f4000 = List.of();
      this.f5000 = List.of();
      this.f6000 = List.of();
      this.f7000 = null;
      this.f1000.m6000();
      this.f8000 = false;
   }

   List<Iface0216> m6000() {
      return this.f6000;
   }

   List<Iface0216> m8000() {
      return this.f5000;
   }

   List<Iface0216> m10000() {
      return this.f3000;
   }

   void m12000(
      List<Iface0216> var1,
      List<Iface0216> var2,
      List<Iface0216> var3,
      List<Iface0216> var4,
      List<Iface0216> var5,
      Iface0215 var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11
   ) {
      this.f2000 = m16000(var1);
      this.f3000 = m16000(var2);
      this.f4000 = m16000(var3);
      this.f5000 = m16000(var4);
      this.f6000 = m16000(var5);
      this.f7000 = var6;
      this.f1000.m2000(var7, var8, var9, var10, var11);
      this.f8000 = true;
   }

   boolean m14000(int var1, int var2, int var3, int var4, int var5) {
      return this.f8000 && this.f1000.m4000(var1, var2, var3, var4, var5);
   }

   private static List<Iface0216> m16000(List<Iface0216> var0) {
      return var0 == null ? List.of() : var0;
   }

   List<Iface0216> m18000() {
      return this.f2000;
   }

   Iface0215 m20000() {
      return this.f7000;
   }
}
