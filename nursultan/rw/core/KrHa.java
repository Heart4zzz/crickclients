package rw.core;

import java.util.function.IntSupplier;
import rw.defs.Enum0061;
import rw.defs.Enum0062;
import rw.defs.Enum0063;

public class KrHa {
   private static String[] f1000;

   public static C0012 m2000(IntSupplier var0, IntSupplier var1) {
      return C0012.m96000(var0, var1).m44000((Enum0063)Enum0063.f1000[1], (Enum0063)Enum0063.f1000[1]).m26000((Enum0061)Enum0061.f1000[0]).m40000();
   }

   public static C0012 m4000(int var0, int var1) {
      return m32000(() -> var0, () -> var1);
   }

   private KrHa() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   public static C0012 m18000(IntSupplier var0, IntSupplier var1) {
      return C0012.m96000(var0, var1).m44000((Enum0063)Enum0063.f1000[1], (Enum0063)Enum0063.f1000[1]).m26000((Enum0061)Enum0061.f1000[0]).m40000();
   }

   public static C0012 m22000(int var0, int var1) {
      return m52000(() -> var0, () -> var1);
   }

   public static C0012 m32000(IntSupplier var0, IntSupplier var1) {
      return C0012.m96000(var0, var1)
         .m44000((Enum0063)Enum0063.f1000[5], (Enum0063)Enum0063.f1000[1])
         .m26000((Enum0061)Enum0061.f1000[0])
         .m36000(true)
         .m40000();
   }

   public static C0012 m34000(int var0, int var1) {
      return m2000(() -> var0, () -> var1);
   }

   public static C0012 m38000(int var0, int var1) {
      return m18000(() -> var0, () -> var1);
   }

   public static C0012 m42000(IntSupplier var0, IntSupplier var1) {
      return C0012.m96000(var0, var1).m44000((Enum0063)Enum0063.f1000[0], (Enum0063)Enum0063.f1000[0]).m26000((Enum0061)Enum0061.f1000[0]).m40000();
   }

   public static C0012 m46000(IntSupplier var0, IntSupplier var1, boolean var2) {
      return C0012.m96000(var0, var1)
         .m20000((Enum0062)Enum0062.f2000[3])
         .m44000((Enum0063)Enum0063.f1000[0], (Enum0063)Enum0063.f1000[0])
         .m26000((Enum0061)Enum0061.f1000[0])
         .m22000(var2)
         .m40000();
   }

   public static C0012 m48000(int var0, int var1, boolean var2) {
      return m46000(() -> var0, () -> var1, var2);
   }

   private static void m50000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static C0012 m52000(IntSupplier var0, IntSupplier var1) {
      return C0012.m96000(var0, var1)
         .m44000((Enum0063)Enum0063.f1000[0], (Enum0063)Enum0063.f1000[0])
         .m26000((Enum0061)Enum0061.f1000[0])
         .m22000(true)
         .m40000();
   }

   public static C0012 m54000(int var0, int var1) {
      return m42000(() -> var0, () -> var1);
   }
}
