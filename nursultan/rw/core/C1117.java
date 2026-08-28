package rw.core;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class C1117 {
   public static Object[] f1000;
   private static String[] f2000;
   public Object[] f3000;

   private static void m2000() {
      f1000 = new Object[]{null};
   }

   public C1117() {
      this.m16000();
      HashMap var5 = new HashMap();
      this.f3000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f2000 = new String[]{"Failed to register icon atlas '{}' at '{}': {}"};
   }

   private void m16000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[1];
         Object[] var1 = this.f3000;
      }
   }

   public void m22000(String var1, String var2) {
      C1112 var3 = (C1112)((Map)this.f3000[0]).remove(var1);
      if (var3 != null) {
         var3.m30000();
      }

      try {
         ((Map)this.f3000[0]).put(var1, C1123.m36000(var2));
      } catch (Exception var5) {
         ((Logger)f1000[0]).error(f2000[0], var1, var2, var5.getMessage(), var5);
      }
   }

   public C1112 m24000(String var1) {
      return (C1112)((Map)this.f3000[0]).get(var1);
   }
}
