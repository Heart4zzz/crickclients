package rw.core;

public final class C0409 {
   public static final int f1000 = 0;
   public static final int f2000 = 1;
   public static final int f3000 = 2;
   public static final int f4000 = 4;
   public static final int f5000 = 8;

   private C0409() {
   }

   public static int m2000(int var0, int var1) {
      int var2 = var0 | var1;
      if (m4000(var2, 2) || m4000(var2, 4) || m4000(var2, 8)) {
         var2 |= 1;
      }

      return var2;
   }

   public static boolean m4000(int var0, int var1) {
      return (var0 & var1) == var1;
   }
}
