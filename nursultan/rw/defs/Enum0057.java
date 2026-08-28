package rw.defs;

import rw.core.IllisOqkm;

public enum Enum0057 {
   private static String[] f1000;
   public static Object[] f2000;

   static {
      ntfClinit();
   }

   public static Enum0057[] m8000() {
      return (Enum0057[])((Enum0057[])oo0ktk<"kwvda",1681689629,1598887504,1598887505,1598887506,1320915064>()[4]).clone();
   }

   private static void m14000() {
      f2000 = new Object[]{null, null, null, null, null};
   }

   private static void m22000() {
      f1000 = new String[]{"MID_CHEST", "UPPER_CHEST", "SHOULDER", "HEAD_LINE"};
   }

   public Enum0057 m32000(IllisOqkm var1) {
      Enum0057[] var2 = m8000();
      Enum0057 var3 = var2[var1.m42000(0, var2.length - 1)];
      return var3 == this ? var2[(this.ordinal() + 1) % var2.length] : var3;
   }
}
