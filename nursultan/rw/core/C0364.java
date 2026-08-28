package rw.core;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import rw.api.Iface0219;
import rw.gui.C0019;

final class C0364 {
   private C0364() {
   }

   static <T> BiPredicate<C0019, C0019> m8000(Function<C0019, T> var0) {
      return (var1, var2) -> !Objects.equals(var0.apply(var1), var0.apply(var2));
   }

   static BiPredicate<C0019, C0019> m10000(ToIntFunction<C0019> var0) {
      return (var1, var2) -> var0.applyAsInt(var1) != var0.applyAsInt(var2);
   }

   static BiPredicate<C0019, C0019> m12000(Iface0219 var0) {
      return (var1, var2) -> Float.compare(var0.m2000(var1), var0.m2000(var2)) != 0;
   }
}
