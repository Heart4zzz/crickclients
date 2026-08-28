package rw.setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import rw.api.Iface0212;
import rw.api.Iface0217;
import rw.core.C0290;
import rw.core.C0368;
import rw.defs.Enum0047;

public final class C0031 {
   private final String f1000;
   private final String f2000;
   private final Enum0047 f3000;
   private final List<C0031> f4000;
   private final List<C0033> f5000;
   private final List<C0368> f6000;
   private final C0056 f7000;
   private final String f8000;
   private final String f9000;
   private final String f10000;
   private final Iface0217 f11000;
   private final C0290<Iface0212> f12000;

   public List<C0031> m2000() {
      return this.f4000;
   }

   public String m4000() {
      return this.f8000;
   }

   C0031(
      String var1,
      String var2,
      Enum0047 var3,
      List<C0031> var4,
      List<C0033> var5,
      List<C0368> var6,
      C0056 var7,
      String var8,
      String var9,
      String var10,
      Iface0217 var11,
      C0290<Iface0212> var12
   ) {
      this.f1000 = var1 != null && !var1.isBlank() ? var1 : null;
      this.f2000 = var2 != null && !var2.isBlank() ? var2 : null;
      this.f3000 = Objects.requireNonNull(var3, "type");
      this.f4000 = var4 == null ? List.of() : List.copyOf(var4);
      this.f5000 = var5 == null ? List.of() : List.copyOf(var5);
      this.f7000 = var7 == null ? C0056.f1000 : var7;
      this.f6000 = m24000(var6, this.f7000.m200000());
      this.f8000 = var8 == null ? "" : var8;
      this.f9000 = var9 == null ? "" : var9;
      this.f10000 = var10 == null ? "" : var10;
      this.f11000 = var11;
      this.f12000 = var12;
   }

   public String m6000() {
      return this.f9000;
   }

   public String m8000() {
      return this.f10000;
   }

   public List<C0368> m10000() {
      return this.f6000;
   }

   String m12000() {
      return this.f2000;
   }

   public Iface0217 m14000() {
      return this.f11000;
   }

   public List<C0033> m16000() {
      return this.f5000;
   }

   private static void m18000(List<C0368> var0, List<C0368> var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (C0368 var3 : var1) {
            if (var3 != null && !m26000(var0, var3)) {
               var0.add(var3);
            }
         }
      }
   }

   public Enum0047 m20000() {
      return this.f3000;
   }

   C0290<Iface0212> m22000() {
      return this.f12000;
   }

   private static List<C0368> m24000(List<C0368> var0, List<C0368> var1) {
      if (var0 != null && !var0.isEmpty() || var1 != null && !var1.isEmpty()) {
         ArrayList var2 = new ArrayList();
         m18000(var2, var0);
         m18000(var2, var1);
         return var2.isEmpty() ? List.of() : List.copyOf(var2);
      } else {
         return List.of();
      }
   }

   private static boolean m26000(List<C0368> var0, C0368 var1) {
      for (C0368 var3 : var0) {
         if (var3 == var1) {
            return true;
         }
      }

      return false;
   }

   C0031 m28000(String var1) {
      return new C0031(
         this.f1000, var1, this.f3000, this.f4000, this.f5000, this.f6000, this.f7000, this.f8000, this.f9000, this.f10000, this.f11000, this.f12000
      );
   }

   public String m30000() {
      return this.f1000;
   }

   public C0056 m32000() {
      return this.f7000;
   }
}
