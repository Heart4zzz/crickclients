package rw.core;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.SuppressForbidden;

public class C0353 {
   private static boolean[] f1000;

   static {
      ntfClinit();
   }

   public static String m2000(Class<?> var0, String var1) {
      Field[] var2 = var0.getDeclaredFields();
      int var3 = var2.length;

      for (int var4 = f1000[1]; var4 < var3; var4++) {
         Field var5 = var2[var4];
         SuppressForbidden var6 = var5.getAnnotation(SuppressForbidden.class);
         if (var6 != null
            && (
               Olmnlqm<"uulucy",2062580975,658113662,658113651,658113661,1052630699,-132919685>(var6).equals(var1)
                  || Olmnlqm<"hgyic",2062580975,658113662,658113657,658113661,1052630699,-132919685>(var6).equals(var1)
            )) {
            return var5.getName();
         }
      }

      throw new IllegalStateException("Could not find field mapping for " + var1 + " in class " + var0.getName());
   }

   public static String m6000(Class<?> var0, String var1) {
      Method[] var2 = var0.getDeclaredMethods();
      int var3 = var2.length;

      for (int var4 = f1000[0]; var4 < var3; var4++) {
         Method var5 = var2[var4];
         SuppressForbidden var6 = var5.getAnnotation(SuppressForbidden.class);
         if (var6 != null
            && (
               Olmnlqm<"phvawrxo",2062580975,658113662,658113651,658113661,1052630699,-132919685>(var6).equals(var1)
                  || Olmnlqm<"dpqtpxxo",2062580975,658113662,658113657,658113661,1052630699,-132919685>(var6).equals(var1)
            )) {
            return var5.getName();
         }
      }

      throw new IllegalStateException("Could not find mapping for " + var1 + " in class " + var0.getName());
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }
}
