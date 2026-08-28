package rw.defs;

public enum Enum0089 {
   public static Object[] f1000;
   private static String[] f2000;

   public boolean m2000() {
      return (boolean)(this == (Enum0089)IIkpiI0rs<"xngwvcw",1494904490,1060038086,1060038083,1060038080,1494904490>()[0] ? 1 : 0);
   }

   static {
      ntfClinit();
   }

   public static Enum0089[] m8000() {
      return (Enum0089[])((Enum0089[])f1000[2]).clone();
   }

   private static void m12000() {
      f2000 = new String[]{"FORWARDS", "BACKWARDS"};
   }

   public Enum0089 m26000() {
      return this == (Enum0089)f1000[0] ? (Enum0089)f1000[1] : (Enum0089)f1000[0];
   }

   public boolean m28000() {
      return (boolean)(this == (Enum0089)f1000[1] ? 1 : 0);
   }

   private static void m36000() {
      f1000 = new Object[]{null, null, null};
   }
}
