package rw.defs;

import java.util.Map;

public enum Enum0065 {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private void m4000() {
      if (II0jmOO<"iwjbj",-1806420730,1297381451,1297381450,1297381449,-1806420730,-1806420730,-1806420730>(this) == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private Enum0065(String var3) {
      this.m4000();
      this.f1000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static Enum0065[] m12000() {
      return (Enum0065[])((Enum0065[])f2000[5]).clone();
   }

   private static void m14000() {
      f3000 = new String[]{"SYNCED", "synced", "DIRTY", "dirty", "LOCAL", "local", "DELETING", "deleting"};
   }

   private static void m28000() {
      f2000 = new Object[]{null, null, null, null, null, null};
   }

   public static Enum0065 m38000(String var0) {
      return (Enum0065)((Map)f2000[4]).get(var0);
   }

   public String m40000() {
      return (String)this.f1000[0];
   }
}
