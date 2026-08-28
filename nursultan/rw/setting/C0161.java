package rw.setting;

import KDFzREm.NNBj;
import KDFzREm.NNNG;
import KDFzREm.NNuU;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class C0161 {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m2000() {
      f2000 = new Object[]{null, null};
   }

   public static NNBj m6000(String var0) {
      try {
         return ((NNuU)f2000[0]).Nm().L(m38000(var0));
      } catch (Throwable var2) {
         throw var2;
      }
   }

   private C0161() {
      throw new UnsupportedOperationException(f1000[2]);
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f1000 = new String[]{"nursultan-client", "\n", "This is a utility class and cannot be instantiated"};
   }

   public static Reader m24000(String var0) {
      try {
         return ((NNuU)f2000[0]).Nm().i(m38000(var0));
      } catch (Throwable var2) {
         throw var2;
      }
   }

   public static Set<NNNG> m26000(String var0, Predicate<NNNG> var1) {
      return ((NNuU)f2000[0]).Nm().y(var0, var1).keySet();
   }

   private static String m32000(NNNG var0) {
      try {
         String var3;
         try (
            InputStream var1 = NNuU.Nq().Nm().u(var0);
            BufferedReader var2 = new BufferedReader(new InputStreamReader(var1));
         ) {
            var3 = var2.lines().collect(Collectors.joining(f1000[1]));
         }

         return var3;
      } catch (IOException var9) {
         throw new RuntimeException(var9);
      }
   }

   public static <T> T m34000(NNNG var0, TypeToken<?> var1) {
      return (T)((Gson)f2000[1]).fromJson(m32000(var0), var1.getType());
   }

   public static <T> T m36000(NNNG var0, Class<T> var1) {
      return (T)((Gson)f2000[1]).fromJson(m32000(var0), var1);
   }

   public static NNNG m38000(String var0) {
      return NNNG.N(f1000[0], var0);
   }
}
