package rw.defs;

import java.util.Arrays;

public enum Nuker {
   public static Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   private static void m2000() {
      f1000 = new Object[]{null, null, null, null, null, null};
   }

   private Nuker(int var3) {
      this.m26000();
      Integer var8 = var3;
      this.f2000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Nuker[] m10000() {
      return (Nuker[])((Nuker[])f1000[5]).clone();
   }

   private void m26000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
         var1[0] = 0;
      }
   }

   public static Nuker m34000(int var0) {
      return Arrays.stream(m10000()).filter(var1 -> (boolean)(var1.f2000[0] == var0 ? 1 : 0)).findFirst().orElse(null);
   }

   public int m38000() {
      return (Integer)this.f2000[0];
   }

   private static void m42000() {
      f3000 = new String[]{"FRIENDS", "WAYPOINTS", "MACROS", "NUKER", "CLIENT_SETTINGS"};
   }
}
