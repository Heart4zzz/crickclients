package rw.core;

import java.util.function.Consumer;
import java.util.function.Supplier;
import rw.api.Iface0217;
import rw.setting.C0031;

public final class C0287 {
   public static C0296 m2000() {
      return new C0296();
   }

   public static C0300 m4000(String var0) {
      return new C0300().m2000(var0);
   }

   private C0287() {
   }

   public static C0300 m6000() {
      return new C0300();
   }

   public static C0286 m8000() {
      return new C0286();
   }

   public static C0286 m10000(String var0) {
      return new C0286().m2000(var0);
   }

   public static C0031 m12000(String var0, rw.setting.C0056 var1) {
      return ((C0286)new C0286().m2000(var0).N(var1)).m2000();
   }

   public static C0288 m14000() {
      return new C0288();
   }

   public static <T> C0297<T> m16000(Supplier<T> var0) {
      return new C0297<>(var0);
   }

   private static <T> void m18000(Consumer<T> var0, T var1) {
      if (var0 != null) {
         var0.accept(var1);
      }
   }

   public static <T> C0297<T> m20000() {
      return new C0297<>();
   }

   public static C0299 m22000(Iface0217 var0) {
      return new C0299().m6000(var0);
   }

   public static C0031 m24000(Consumer<C0288> var0) {
      C0288 var1 = new C0288();
      m18000(var0, var1);
      return var1.m4000();
   }

   public static C0031 m26000(rw.setting.C0056 var0, Consumer<C0288> var1) {
      C0288 var2 = (C0288)new C0288().N(var0);
      m18000(var1, var2);
      return var2.m4000();
   }

   public static C0031 m28000(rw.setting.C0056 var0) {
      return m26000(var0, null);
   }

   public static C0031 m30000(String var0, rw.setting.C0056 var1) {
      return ((C0296)new C0296().m2000(var0).N(var1)).m2000();
   }

   public static <T> C0297<T> m32000(T var0) {
      return new C0297<>((T)var0);
   }

   public static C0296 m34000(String var0) {
      return new C0296().m2000(var0);
   }

   public static C0299 m36000() {
      return new C0299();
   }
}
