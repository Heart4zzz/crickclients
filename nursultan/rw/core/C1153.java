package rw.core;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.logging.log4j.Logger;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.defs.OlpiIqlss;

public class C1153 {
   public static Object[] f1000;
   private static String[] f2000;
   private static String[] f3000;

   private static void m6000() {
      f1000 = new Object[]{null};
   }

   private C1153() {
      throw new UnsupportedOperationException(ll0kit0m0<"bnmbe",-164632502,-299604642,-299604671,-299604672,-1712432290,-153016650>()[0]);
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f3000 = new String[]{
         "==== Locale: {} ====",
         "[MISSING] отсутствует: 0",
         "[MISSING] отсутствуют ключи ({}):",
         " - {}",
         "[UNUSED] неиспользуемых описаний/настроек: 0",
         "[UNUSED] ключи присутствуют, но не используются ({}):",
         " - {}"
      };
      f2000 = new String[]{"This is a utility class and cannot be instantiated", "module."};
   }

   private static void m34000(List<C1013> var0, Consumer<String> var1) {
      for (C1013 var3 : var0) {
         m40000(var1, () -> var3.m22000().m10000());
      }
   }

   private static void m40000(Consumer<String> var0, Supplier<String> var1) {
      try {
         String var2 = (String)var1.get();
         if (var2 != null && !var2.isEmpty()) {
            var0.accept(var2);
         }
      } catch (Throwable var3) {
      }
   }

   private static void m46000(Collection<Base1014<?>> var0, Consumer<String> var1, Consumer<String> var2) {
      for (Object var4 : var0) {
         m40000(var1, ((Base1014)var4).m6000()::m10000);
         switch (var4) {
            case C1003 var7:
               m34000(var7.m2000(), var2);
               break;
            case C1000 var8:
               m34000(var8.m2000(), var2);
               break;
            case OlqIlmnt var9:
               m40000(var1, var9::m2000);
               break;
            default:
         }
      }
   }

   public static void m48000() {
      if ((Boolean)NursultanClient.f13000[4]) {
         System.out.println();
         LinkedHashSet var0 = new LinkedHashSet();
         LinkedHashSet var1 = new LinkedHashSet();
         Consumer var2 = var1x -> {
            if (var1x != null && !var1x.isEmpty()) {
               var0.add(var1x);
            }
         };
         Consumer var3 = var1x -> {
            if (var1x != null && !var1x.isEmpty()) {
               var1.add(var1x);
            }
         };

         for (GuiWidget var5 : NursultanClient.m88000().m152000()) {
            m40000(var2, var5.m10000()::m10000);
            m46000(var5.w().values(), var2, var3);
         }

         for (OlpiIqlss var7 : OlpiIqlss.m10000()) {
            C1235 var8 = new C1235(var7, var7);
            Set var9 = var8.m22000().keySet();
            TreeSet var10 = new TreeSet(var0);
            var10.removeAll(var9);
            TreeSet var11 = new TreeSet(var9);
            var11.removeAll(var0);
            var11.removeAll(var1);
            var11.removeIf(var0x -> (boolean)(!var0x.startsWith(f2000[1]) ? 1 : 0));
            ((Logger)f1000[0]).error(f3000[0], var7.m32000());
            if (var10.isEmpty()) {
               ((Logger)f1000[0]).error(f3000[1]);
            } else {
               ((Logger)f1000[0]).error(f3000[2], var10.size());

               for (String var13 : var10) {
                  ((Logger)f1000[0]).error(f3000[3], var13);
               }
            }

            if (var11.isEmpty()) {
               ((Logger)f1000[0]).error(f3000[4]);
            } else {
               ((Logger)f1000[0]).error(f3000[5], var11.size());

               for (String var17 : var11) {
                  ((Logger)f1000[0]).error(f3000[6], var17);
               }
            }

            System.out.println();
         }
      }
   }
}
