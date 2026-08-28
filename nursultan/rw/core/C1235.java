package rw.core;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.data.Rec0312;
import rw.defs.OlpiIqlss;

public class C1235 {
   public Object[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private void m2000(OlpiIqlss var1) {
      rw.setting.C0161.m26000("locale/" + var1.m32000(), var0 -> var0.N().endsWith(f2000[0])).forEach(var1x -> {
         C1232 var2 = new C1232(this);
         Map var3 = rw.setting.C0161.m34000(var1x, var2);
         if (var3 != null) {
            ((Map)this.f1000[2]).putAll(var3);
         }
      });
   }

   private static void m8000() {
      f2000 = new String[]{".json"};
   }

   public C1235(OlpiIqlss var1, OlpiIqlss var2) {
      this.m12000();
      HashMap var7 = new HashMap();
      this.f1000[2] = var7;
      this.f1000[1] = var2;
      this.m32000(var1);
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f3000 = new Object[]{null};
   }

   private void m12000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
      }
   }

   private boolean m20000(OlpiIqlss var1) {
      if ((OlpiIqlss)this.f1000[0] == var1) {
         return (boolean)0;
      } else {
         this.f1000[0] = var1;
         return (boolean)1;
      }
   }

   public Map<String, String> m22000() {
      return Map.copyOf((Map<? extends String, ? extends String>)this.f1000[2]);
   }

   public void m32000(OlpiIqlss var1) {
      if (this.m20000(var1)) {
         try {
            ((Map)this.f1000[2]).clear();
            this.m2000((OlpiIqlss)this.f1000[1]);
            this.m2000(var1);
         } catch (Exception var3) {
            ((Logger)f3000[0]).error(var3, var3);
         }
      }
   }

   public OlpiIqlss m34000() {
      return (OlpiIqlss)this.f1000[0];
   }

   public static String m36000(String var0) {
      return ((Map)NursultanClient.m14000().f1000[2]).getOrDefault(var0, var0);
   }

   public static String m40000(Rec0312 var0) {
      return ((Map)NursultanClient.m14000().f1000[2]).getOrDefault(var0.m10000(), var0.m10000());
   }
}
