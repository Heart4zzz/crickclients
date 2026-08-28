package rw.defs;

public enum Enum0058 {
   private static String[] f1000;
   public static Object[] f2000;
   public Object[] f3000;

   private void m4000() {
      if (lOslnOnI<"hkzf",-1817927963,-801874850,-801874849,-801874852,-1817927963,-1817927963>(this) == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   private Enum0058(String var3) {
      this.m4000();
      this.f3000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static Enum0058[] m10000() {
      return (Enum0058[])((Enum0058[])f2000[2]).clone();
   }

   private static void m28000() {
      f1000 = new String[]{"DEFAULT", "access.default", "DEVELOPMENT", "access.development"};
   }

   public boolean m32000(Enum0058 var1) {
      return (boolean)(this == var1 ? 1 : 0);
   }

   public String m34000() {
      return (String)this.f3000[0];
   }

   private static void m38000() {
      f2000 = new Object[]{null, null, null};
   }
}
