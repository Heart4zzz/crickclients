package rw.setting;

import KDFzREm.NNNzv;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map.Entry;
import rw.core.C1194;

public class C0163 {
   private static String[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private static void m2000() {
      f3000 = new Object[]{null, null, null, f2000[2], f2000[3], f2000[4]};
   }

   private C0163() {
      throw new UnsupportedOperationException(f2000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m34000() {
      f1000 = new String[]{"ip", "ip", "ip", "expired", "expired", "expired", "-1"};
      f2000 = new String[]{"This is a utility class and cannot be instantiated", "dd.MM.yyyy", "ip", "expired", "-1"};
   }

   private static String m36000(JsonObject var0) {
      return var0.has(f1000[0]) && !var0.get(f1000[1]).isJsonNull() ? var0.get(f1000[2]).getAsString() : null;
   }

   private static LocalDate m40000(JsonObject var0) {
      if (var0.has(f1000[3]) && !var0.get(f1000[4]).isJsonNull()) {
         String var1 = var0.get(f1000[5]).getAsString();
         return f1000[6].equals(var1) ? null : LocalDate.parse(var1, (DateTimeFormatter)f3000[2]);
      } else {
         return null;
      }
   }

   private static boolean m42000(LocalDate var0) {
      return (boolean)(var0 != null && !LocalDate.now().isBefore(var0) ? 0 : 1);
   }

   private static void m46000(String var0, String var1) {
      C1194 var2 = new C1194(var0, var1, NNNzv.field_45611);
      ((List)f3000[0]).remove(var2);
      ((List)f3000[0]).add(var2);
   }

   public static void m48000(String var0) {
      JsonObject var1 = (JsonObject)((Gson)f3000[1]).fromJson(var0, JsonObject.class);

      for (Entry var3 : var1.entrySet()) {
         String var4 = (String)var3.getKey();
         JsonObject var5 = ((JsonElement)var3.getValue()).getAsJsonObject();
         String var6 = m36000(var5);
         if (var6 != null && !var6.isEmpty()) {
            LocalDate var7 = m40000(var5);
            if (m42000(var7)) {
               m46000(var4, var6);
            }
         }
      }
   }
}
