package rw.defs;

public enum Enum0059 {
   private static String[] f1000;
   private static String[] f2000;
   public static Object[] f3000;
   private static String[] f4000;
   private static String[] f5000;
   public Object[] f6000;
   private static String[] f7000;
   public static Object[] f8000;

   private Enum0059(String var3) {
      this.m64000();
      this.f6000[0] = var3;
   }

   static {
      ntfClinit();
   }

   public static Enum0059[] m16000() {
      return (Enum0059[])((Enum0059[])f8000[7]).clone();
   }

   private static void m18000() {
      f5000 = new String[]{"OTHER", "autobuy.category.other", "ARMOR"};
      f7000 = new String[]{"autobuy.category.armor", "TOOLS"};
      f1000 = new String[]{"autobuy.category.tools", "SPHERES"};
      f4000 = new String[]{"autobuy.category.spheres", "TALISMANS", "autobuy.category.talismans", "POTIONS", "autobuy.category.potions"};
      f2000 = new String[]{"CONSUMABLES", "autobuy.category.consumables", "ARROWS", "autobuy.category.arrows", "BLOCKS", "autobuy.category.blocks"};
   }

   private static void m24000() {
      f3000 = new Object[]{null, null};
      f8000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   public String m54000() {
      return (String)this.f6000[0];
   }

   private void m64000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[1];
         Object[] var1 = this.f6000;
      }
   }
}
