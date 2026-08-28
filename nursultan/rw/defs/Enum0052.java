package rw.defs;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public enum Enum0052 {
   public static Object[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private static void m6000() {
      f2000 = new String[]{"SINGLE_WORD", "word", "words_with_underscores", "GREEDY_PHRASE", "word", "words with spaces", "\"and symbols\""};
   }

   private Enum0052(String... var3) {
      this.m14000();
      List var8 = Arrays.asList(var3);
      this.f3000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0052[] m12000() {
      return (Enum0052[])((Enum0052[])f1000[2]).clone();
   }

   private void m14000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public Collection<String> m34000() {
      return (Collection<String>)this.f3000[0];
   }

   private static void m40000() {
      f1000 = new Object[]{null, null, null};
   }
}
