package rw.setting;

import rw.defs.Enum0027;
import rw.defs.OlmmOsl;

public class C0017 {
   public static Object[] f1000;
   private static String[] f2000;

   private static void m4000() {
      f1000 = new Object[]{f2000[3]};
   }

   private C0017() {
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f2000 = new String[]{"inter", "inter", "inter", "inter"};
   }

   public static C0056 m22000(int var0, OlmmOsl var1) {
      return C0056.m130000().m58000(var0).m174000(new Rec0036(f2000[0], var1.m46000()));
   }

   public static Rec0036 m24000(OlmmOsl var0) {
      return new Rec0036(f2000[2], var0.m46000());
   }

   public static C0056 m26000(int var0, OlmmOsl var1, Enum0027 var2) {
      return C0056.m130000().m58000(var0).m174000(new Rec0036(f2000[1], var1.m46000(), var2));
   }
}
