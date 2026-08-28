package rw.defs;

public enum OlsqOjlj {
   private static String[] f1000;
   public static Object[] f2000;

   static {
      ntfClinit();
   }

   public static OlsqOjlj[] m8000() {
      return (OlsqOjlj[])((OlsqOjlj[])f2000[3]).clone();
   }

   private static void m10000() {
      f2000 = new Object[]{null, null, null, null};
   }

   private static void m22000() {
      f1000 = new String[]{"IDLE", "RELEASE", "FLICK"};
   }
}
