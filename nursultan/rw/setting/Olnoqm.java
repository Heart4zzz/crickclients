package rw.setting;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.loader.impl.mapping.RuntimeMappingRegistry;
import net.minecraft.SuppressForbidden;
import rw.core.C0353;
import rw.core.OlkpIlIij;
import rw.data.Rec0123;

public class Olnoqm {
   public Object[] f1000;
   private static String[] f2000;
   public static Object[] f3000;
   private static String[] f4000;

   private static void m4000() {
      f4000 = new String[]{"Recursive mapping bootstrap", "intermediary", "mappingfinder"};
      f2000 = new String[]{"intermediary", "mappingfinder", "intermediary", "mappingfinder", "mappingfinder", "intermediary"};
   }

   private static void m6000(String var0, String var1, String var2) {
      try {
         RuntimeMappingRegistry.registerMethodMapping(
            Ilsm0l<"qifqj",1412072173,1365072414,1365072437,1365072403,1412072173,1412072173>()[0], var0, var1, null, var2
         );
         RuntimeMappingRegistry.registerMethodMapping(f2000[1], var0, var1, null, var2);
      } catch (NoClassDefFoundError var4) {
      }
   }

   private Olnoqm() {
      this.m30000();
      HashMap var5 = new HashMap();
      this.f1000[0] = var5;
      HashMap var6 = new HashMap();
      this.f1000[1] = var6;
      HashMap var7 = new HashMap();
      this.f1000[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m20000() {
      f3000 = new Object[]{null, f2000[4], f2000[5]};
   }

   private static void m24000(String var0, String var1, String var2) {
      try {
         RuntimeMappingRegistry.registerFieldMapping(f2000[2], var0, var1, null, var2);
         RuntimeMappingRegistry.registerFieldMapping(f2000[3], var0, var1, null, var2);
      } catch (NoClassDefFoundError var4) {
      }
   }

   private void m30000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
         var1[3] = false;
         var1[4] = false;
      }
   }

   private static void m36000(String var0, Class<?> var1) {
      try {
         RuntimeMappingRegistry.registerClassMapping(f4000[1], var0, var1.getName());
         RuntimeMappingRegistry.registerClassMapping(f4000[2], var0, var1.getName());
      } catch (NoClassDefFoundError var3) {
      }
   }

   private void m40000(String var1, String var2, String var3) {
      if (var2 != null && !var2.isEmpty()) {
         ((Map)this.f1000[2]).put(new Rec0123(var1, var2), var3);
         m24000(var1, var2, var3);
      }
   }

   private void m42000(String var1, String var2, String var3) {
      if (var2 != null && !var2.isEmpty()) {
         ((Map)this.f1000[1]).put(new Rec0123(var1, var2), var3);
         m6000(var1, var2, var3);
      }
   }

   public synchronized Olnoqm m44000(String var1, Class<?> var2) {
      ((Map)this.f1000[0]).put(var1, var2);
      m36000(var1, var2);

      for (Method var6 : var2.getDeclaredMethods()) {
         SuppressForbidden var7 = var6.getAnnotation(SuppressForbidden.class);
         if (var7 != null) {
            this.m42000(var1, Ilsm0l<"yzvsiauj",1412072166,1365072386,1365072409,1365072396,1412072166,1412072166>(var7), var6.getName());
            this.m42000(var1, Ilsm0l<"czgydqw",1412072166,1365072386,1365072395,1365072396,1412072166,1412072166>(var7), var6.getName());
            this.m42000(var1, var6.getName(), var6.getName());
         }
      }

      for (Field var11 : var2.getDeclaredFields()) {
         SuppressForbidden var12 = var11.getAnnotation(SuppressForbidden.class);
         if (var12 != null) {
            this.m40000(var1, Ilsm0l<"ovfrkqze",1412072166,1365072386,1365072409,1365072396,1412072166,1412072166>(var12), var11.getName());
            this.m40000(var1, Ilsm0l<"hldcfnyj",1412072166,1365072386,1365072395,1365072396,1412072166,1412072166>(var12), var11.getName());
            this.m40000(var1, var11.getName(), var11.getName());
         }
      }

      return this;
   }

   public synchronized String m50000(String var1, String var2, String var3, String var4, String var5) {
      this.m54000();
      String var6 = (String)((Map)this.f1000[1]).get(new Rec0123(var2, var3));
      if (var6 != null) {
         return var6;
      } else {
         var6 = (String)((Map)this.f1000[1]).get(new Rec0123(var2, var5));
         if (var6 != null) {
            return var6;
         } else {
            Class var7 = (Class)((Map)this.f1000[0]).get(var2);
            return var7 != null ? C0353.m6000(var7, var5) : var3;
         }
      }
   }

   public synchronized String m52000(String var1, String var2) {
      this.m54000();
      String var3 = (String)((Map)this.f1000[2]).get(new Rec0123(var1, var2));
      return var3 != null ? var3 : var2;
   }

   public synchronized void m54000() {
      if (!(Boolean)this.f1000[3]) {
         if ((Boolean)this.f1000[4]) {
            throw new IllegalStateException(f4000[0]);
         } else {
            Boolean var6 = true;
            this.f1000[4] = var6;

            try {
               OlkpIlIij.m16000(this);
               Boolean var7 = true;
               this.f1000[3] = var7;
            } finally {
               Boolean var9 = false;
               this.f1000[4] = var9;
            }
         }
      }
   }
}
