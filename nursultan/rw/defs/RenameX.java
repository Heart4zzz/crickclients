package rw.defs;

public enum RenameX {
   private static String[] f1000;
   public static Object[] f2000;

   static {
      ntfClinit();
   }

   public static RenameX[] m8000() {
      return (RenameX[])((RenameX[])f2000[5]).clone();
   }

   private static void m10000() {
      f2000 = new Object[]{null, null, null, null, null, null};
   }

   private static void m16000() {
      f1000 = new String[]{"CREATE", "UPDATE", "DELETE", "RENAME", "LOAD"};
   }
}
