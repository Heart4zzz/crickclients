package rw.defs;

import java.util.Map;

public enum FfDf {
   private static String[] f1000;
   public Object[] f2000;
   public static Object[] f3000;

   private FfDf(int var3) {
      this.m30000();
      Integer var8 = var3;
      this.f2000[0] = var8;
   }

   static {
      ntfClinit();
   }

   public static FfDf[] m10000() {
      return (FfDf[])((FfDf[])f3000[7]).clone();
   }

   private static void m18000() {
      f1000 = new String[]{"REQUEST_LIST", "REQUEST_CREATE", "REQUEST_UPDATE", "REQUEST_GET", "REQUEST_DELETE", "REQUEST_RENAME"};
   }

   private static void m24000() {
      f3000 = new Object[]{null, null, null, null, null, null, null, null};
   }

   private void m30000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
         var1[0] = 0;
      }
   }

   public static FfDf m32000(int var0) {
      return (FfDf)((Map)f3000[6]).get(var0);
   }

   public int m34000() {
      return (Integer)this.f2000[0];
   }
}
