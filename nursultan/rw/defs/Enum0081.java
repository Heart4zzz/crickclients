package rw.defs;

public enum Enum0081 {
   public static Object[] f1000;
   public Object[] f2000;
   private static String[] f3000;

   private Enum0081(int var3) {
      this.m24000();
      Integer var8 = var3;
      this.f2000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static Enum0081[] m10000() {
      return (Enum0081[])((Enum0081[])f1000[6]).clone();
   }

   private static void m18000() {
      f1000 = new Object[]{null, null, null, null, null, null, null};
   }

   private void m24000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
         var1[0] = 0;
      }
   }

   private static void m28000() {
      f3000 = new String[]{"BEFORE_ALL", "BEFORE", "NOW", "AFTER", "AFTER_ALL", "LISTENER"};
   }

   public int m32000() {
      return (Integer)this.f2000[0];
   }
}
