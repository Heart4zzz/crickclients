package rw.defs;

public enum Enum0078 {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m4000() {
      f2000 = new Object[]{null, null, null, null, null};
   }

   static {
      ntfClinit();
   }

   public static Enum0078[] m10000() {
      return (Enum0078[])((Enum0078[])OlInp<"negrhm",1395250395,2003038119,2003038118,2003038117,1395250395,1395250395>()[4]).clone();
   }

   private static void m18000() {
      f1000 = new String[]{"FULL", "HORIZONTAL", "VERTICAL", "NONE"};
   }

   public boolean m26000() {
      return (boolean)(this != (Enum0078)f2000[0] && this != (Enum0078)f2000[1] ? 0 : 1);
   }

   public boolean m30000() {
      return (boolean)(this != (Enum0078)OlInp<"negrhm",1395250395,2003038119,2003038118,2003038117,1395250395,1395250395>()[0] && this != (Enum0078)f2000[2]
         ? 0
         : 1);
   }
}
