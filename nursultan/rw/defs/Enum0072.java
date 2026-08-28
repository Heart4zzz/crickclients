package rw.defs;

public enum Enum0072 {
   public static Object[] f1000;
   private static String[] f2000;

   static {
      ntfClinit();
   }

   public static Enum0072[] m6000() {
      return (Enum0072[])((Enum0072[])l1t0tp<"iicsi",126924883,-2143284039,-2143284040,-2143284037,126924883,126924883>()[2]).clone();
   }

   private static void m12000() {
      f2000 = new String[]{"MOUSE", "KEYBOARD"};
   }

   private static void m20000() {
      f1000 = new Object[]{null, null, null};
   }

   public boolean m26000(Enum0072 var1) {
      return (boolean)(this == var1 ? 1 : 0);
   }
}
