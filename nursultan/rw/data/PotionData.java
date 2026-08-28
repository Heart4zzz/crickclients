package rw.data;

import KDFzREm.NQo;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiPredicate;
import java.util.function.Function;

public record PotionData<T>() {
   private static boolean[] f1000;
   public Function<NQo, T> f2000;
   public BiPredicate<T, T> f3000;
   public String f4000;

   public Function<NQo, T> m2000() {
      return this.f2000;
   }

   PotionData(String var1, Function<NQo, T> var2, BiPredicate<T, T> var3) {
      this.f4000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",PotionData,"name;getter;equals",PotionData::f4000,PotionData::f2000,PotionData::f3000>(this, var1);
   }

   private static void m6000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public String m8000() {
      return this.f4000;
   }

   public boolean m10000(NQo var1, NQo var2) {
      Object var3 = this.f2000.apply(var1);
      Object var4 = this.f2000.apply(var2);
      if (var3 == null && var4 == null) {
         return f1000[0];
      } else {
         return var3 != null && var4 != null ? this.f3000.test((T)var3, (T)var4) : f1000[1];
      }
   }

   public BiPredicate<T, T> m14000() {
      return this.f3000;
   }
}
