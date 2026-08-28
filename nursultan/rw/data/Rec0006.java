package rw.data;

import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.runtime.ObjectMethods;

public record Rec0006() {
   public int f1000;
   private static String[] f2000;
   public int f3000;

   private static void m2000() {
      f2000 = new String[]{"fromInclusive must be <= toInclusive"};
   }

   public Rec0006(int var1, int var2) {
      if (!Character.isValidCodePoint(var1)) {
         throw new IllegalArgumentException("Invalid fromInclusive code point: " + var1);
      } else if (!Character.isValidCodePoint(var2)) {
         throw new IllegalArgumentException("Invalid toInclusive code point: " + var2);
      } else if (var1 > var2) {
         throw new IllegalArgumentException(f2000[0]);
      } else {
         this.f1000 = var1;
         this.f3000 = var2;
      }
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0006,"fromInclusive;toInclusive",Rec0006::f1000,Rec0006::f3000>(this, var1);
   }

   public int m6000() {
      return this.f3000;
   }

   public static Rec0006 m10000(int var0, int var1) {
      return new Rec0006(var0, var1);
   }

   public int m12000() {
      return this.f1000;
   }

   public void m14000(IntList var1) {
      for (int var2 = this.f1000; var2 <= this.f3000; var2++) {
         var1.add(var2);
      }
   }

   public static Rec0006 m18000(int var0) {
      return new Rec0006(var0, var0);
   }
}
