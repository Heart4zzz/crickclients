package rw.defs;

public enum SfDz {
   public static Object[] f1000;
   private static String[] f2000;

   private static void m6000() {
      f1000 = new Object[]{null, null, null, null};
   }

   static {
      ntfClinit();
   }

   public static SfDz[] m8000() {
      return (SfDz[])((SfDz[])ookrstn<"nyurmdq",401013874,-91341624,-91341623,-91341622,-1668950712,1710139317,610838429>()[3]).clone();
   }

   private static void m24000() {
      f2000 = new String[]{"PRESS", "RELEASE", "REPEAT"};
   }

   public static SfDz m26000(int var0) {
      switch (var0) {
         case 0:
            return (SfDz)f1000[1];
         case 1:
            return (SfDz)f1000[0];
         case 2:
            return (SfDz)f1000[2];
         default:
            throw new IllegalArgumentException("Invalid action: " + var0);
      }
   }

   public boolean m30000(SfDz var1) {
      return (boolean)(this == var1 ? 1 : 0);
   }
}
