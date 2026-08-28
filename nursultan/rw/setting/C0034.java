package rw.setting;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import rw.core.C0347;
import rw.core.C0360;
import rw.data.Rec0090;
import rw.data.Rec0092;
import rw.data.Rec0125;
import rw.data.Rec0126;
import rw.data.Rec0128;
import rw.defs.Enum0041;

public final class C0034 {
   private static final String f1000 = "style.";

   private static String m2000(Rec0090 var0) {
      StringBuilder var1 = new StringBuilder();

      for (Entry var3 : var0.m2000().entrySet()) {
         if (((String)var3.getKey()).startsWith("style.")) {
            if (!var1.isEmpty()) {
               var1.append("  ");
            }

            var1.append(m20000((String)var3.getKey())).append('=').append((String)var3.getValue());
         }
      }

      return var1.toString();
   }

   public static String m4000(C0059 var0, Rec0092 var1) {
      return m8000(m26000(var0, var1));
   }

   private C0034() {
   }

   public static String m6000(C0059 var0, Rec0092 var1) {
      return m50000(m26000(var0, var1));
   }

   public static String m8000(Rec0090 var0) {
      StringBuilder var1 = new StringBuilder();
      m64000(var0, var1);
      return var1.toString();
   }

   private static String m10000(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length() + 2);
      var1.append('"');

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         switch (var3) {
            case '\t':
               var1.append("\\t");
               break;
            case '\n':
               var1.append("\\n");
               break;
            case '\r':
               var1.append("\\r");
               break;
            case '"':
               var1.append("\\\"");
               break;
            case '\\':
               var1.append("\\\\");
               break;
            default:
               var1.append(var3);
         }
      }

      var1.append('"');
      return var1.toString();
   }

   private static void m12000(Rec0090 var0, Rec0090 var1, String var2, StringBuilder var3) {
      LinkedHashSet var4 = new LinkedHashSet();
      var4.addAll(var0.m2000().keySet());
      var4.addAll(var1.m2000().keySet());

      for (String var6 : var4) {
         String var7 = var0.m2000().get(var6);
         String var8 = var1.m2000().get(var6);
         if (!Objects.equals(var7, var8)) {
            var3.append("~ ")
               .append(var2)
               .append(' ')
               .append(m20000(var6))
               .append(": ")
               .append(var7 == null ? "-" : var7)
               .append(" -> ")
               .append(var8 == null ? "-" : var8)
               .append('\n');
         }
      }
   }

   private static String m14000(C0059 var0) {
      String var1 = var0.m154000();
      String var2 = var0.m120000().name().toLowerCase();
      return var1 != null && !var1.isBlank() ? var2 + "#" + var1 : var2;
   }

   private static void m16000(C0059 var0, Map<String, String> var1) {
      String var2 = m52000(var0);
      if (!var2.isEmpty()) {
         var1.put("dirty", var2);
      }

      int var3 = var0.m92000().m8000();
      if (var3 > 0) {
         var1.put("cachedDraws", String.valueOf(var3));
      }
   }

   private static String m18000(Rec0125 var0) {
      String var1 = var0.m20000().name().toLowerCase();

      float var2 = switch (var0.m20000()) {
         case f4000, f3000 -> var0.m8000();
         default -> var0.m14000();
      };
      return var1 + "(" + m40000(var2) + ")";
   }

   private static String m20000(String var0) {
      return var0.startsWith("style.") ? var0.substring("style.".length()) : var0;
   }

   private static boolean m22000(Rec0128 var0) {
      return m34000(var0.m2000(), var0.m8000()) && m34000(var0.m8000(), var0.m6000()) && m34000(var0.m6000(), var0.m20000());
   }

   private static C0059 m24000(C0059 var0, String var1) {
      if (var1.equals(var0.m154000())) {
         return var0;
      } else {
         for (C0059 var3 : var0.m14000()) {
            C0059 var4 = m24000(var3, var1);
            if (var4 != null) {
               return var4;
            }
         }

         return null;
      }
   }

   public static Rec0090 m26000(C0059 var0, Rec0092 var1) {
      Rec0092 var2 = var1 == null ? Rec0092.m10000() : var1;
      C0059 var3 = var2.m2000() == null ? var0 : m24000(var0, var2.m2000());
      return var3 == null ? new Rec0090("missing", "(missing key: " + var2.m2000() + ")", new LinkedHashMap<>(), List.of()) : m58000(var3, var2, 0, 0);
   }

   private static String m28000(C0059 var0, int var1) {
      String var2 = var0.m154000();
      return var2 != null && !var2.isBlank() ? var2 : var0.m120000().name().toLowerCase() + "[" + var1 + "]";
   }

   private static String m30000(Enum0041 var0, Object var1) {
      return switch (var1) {
         case null -> "null";
         case Float var4 -> m40000(var4);
         case Integer var5 when var0.name().contains("COLOR") -> m38000(var5);
         case Rec0125 var6 -> m18000(var6);
         case Rec0126 var7 -> var7.m2000()
            ? m40000(var7.m10000())
            : m40000(var7.m10000()) + "/" + m40000(var7.m8000()) + "/" + m40000(var7.m20000()) + "/" + m40000(var7.m4000());
         case Rec0128 var8 -> m22000(var8)
            ? m40000(var8.m2000())
            : m40000(var8.m2000()) + "/" + m40000(var8.m8000()) + "/" + m40000(var8.m6000()) + "/" + m40000(var8.m20000());
         default -> String.valueOf(var1);
      };
   }

   public static String m32000(Rec0090 var0, Rec0090 var1) {
      StringBuilder var2 = new StringBuilder();
      m60000(var0, var1, "", var2);
      return var2.isEmpty() ? "(no differences)\n" : var2.toString();
   }

   private static boolean m34000(float var0, float var1) {
      return Float.floatToIntBits(var0) == Float.floatToIntBits(var1);
   }

   private static String m36000(String var0, int var1) {
      String var2 = var0.replace('\n', ' ').replace('\r', ' ');
      return var2.length() <= var1 ? var2 : var2.substring(0, var1) + "...";
   }

   private static String m38000(int var0) {
      return String.format("#%08X", var0);
   }

   private static String m40000(float var0) {
      return var0 == Math.rint(var0) && !Float.isInfinite(var0) ? Integer.toString((int)var0) : String.format(Locale.ROOT, "%.2f", var0);
   }

   private static String m42000(float var0, float var1, float var2, float var3) {
      return "(" + m40000(var0) + "," + m40000(var1) + " " + m40000(var2) + "x" + m40000(var3) + ")";
   }

   private static void m44000(rw.gui.C0019 var0, boolean var1, Map<String, String> var2) {
      rw.gui.C0019 var3 = C0360.m4000();

      for (Enum0041 var7 : Enum0041.m20000()) {
         if (var1 || var7.m86000(var3, var0)) {
            var2.put("style." + var7.name().toLowerCase(), m30000(var7, var7.m90000(var0)));
         }
      }
   }

   private static void m46000(StringBuilder var0, Rec0090 var1) {
      for (Entry var3 : var1.m2000().entrySet()) {
         if (!((String)var3.getKey()).startsWith("style.")) {
            var0.append(' ').append((String)var3.getKey()).append('=').append((String)var3.getValue());
         }
      }
   }

   private static void m48000(Rec0090 var0, int var1, StringBuilder var2) {
      String var3 = "  ".repeat(var1);
      var2.append(var3).append(var0.m8000());
      m46000(var2, var0);
      var2.append('\n');
      String var4 = m2000(var0);
      if (!var4.isEmpty()) {
         var2.append(var3).append("    style ").append(var4).append('\n');
      }

      for (Rec0090 var6 : var0.m6000()) {
         m48000(var6, var1 + 1, var2);
      }
   }

   public static String m50000(Rec0090 var0) {
      StringBuilder var1 = new StringBuilder();
      m48000(var0, 0, var1);
      return var1.toString();
   }

   private static String m52000(C0059 var0) {
      StringBuilder var1 = new StringBuilder();
      m54000(var1, var0, 2, "LAYOUT");
      m54000(var1, var0, 4, "POSITION");
      m54000(var1, var0, 8, "SCROLL");
      m54000(var1, var0, 1, "DRAW");
      return var1.toString();
   }

   private static void m54000(StringBuilder var0, C0059 var1, int var2, String var3) {
      if (var1.m18000(var2)) {
         if (!var0.isEmpty()) {
            var0.append('|');
         }

         var0.append(var3);
      }
   }

   private static Map<String, Rec0090> m56000(List<Rec0090> var0) {
      LinkedHashMap var1 = new LinkedHashMap();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         Rec0090 var3 = (Rec0090)var0.get(var2);
         String var4 = var3.m10000();
         String var5 = var1.containsKey(var4) ? var4 + "#" + var2 : var4;
         var1.put(var5, var3);
      }

      return var1;
   }

   private static Rec0090 m58000(C0059 var0, Rec0092 var1, int var2, int var3) {
      LinkedHashMap var4 = new LinkedHashMap();
      m62000(var0, var4);
      m66000(var0.m42000(), var4);
      m44000(var0.m78000(), var1.m6000(), var4);
      m16000(var0, var4);
      ArrayList var5 = new ArrayList();
      List var6 = var0.m14000();
      if (var2 >= var1.m8000() && !var6.isEmpty()) {
         var4.put("childrenElided", String.valueOf(var6.size()));
      } else {
         for (int var7 = 0; var7 < var6.size(); var7++) {
            var5.add(m58000((C0059)var6.get(var7), var1, var2 + 1, var7));
         }
      }

      return new Rec0090(m28000(var0, var3), m14000(var0), var4, var5);
   }

   private static void m60000(Rec0090 var0, Rec0090 var1, String var2, StringBuilder var3) {
      String var4 = var2.isEmpty() ? var1.m10000() : var2 + "/" + var1.m10000();
      m12000(var0, var1, var4, var3);
      Map var5 = m56000(var0.m6000());
      Map var6 = m56000(var1.m6000());
      LinkedHashSet var7 = new LinkedHashSet();
      var7.addAll(var5.keySet());
      var7.addAll(var6.keySet());

      for (String var9 : var7) {
         Rec0090 var10 = (Rec0090)var5.get(var9);
         Rec0090 var11 = (Rec0090)var6.get(var9);
         if (var10 == null) {
            var3.append("+ ").append(var4).append('/').append(var11.m10000()).append("  ").append(var11.m8000()).append('\n');
         } else if (var11 == null) {
            var3.append("- ").append(var4).append('/').append(var10.m10000()).append("  ").append(var10.m8000()).append('\n');
         } else {
            m60000(var10, var11, var4, var3);
         }
      }
   }

   private static void m62000(C0059 var0, Map<String, String> var1) {
      String var2 = var0.m32000();
      if (var2 != null && !var2.isEmpty()) {
         var1.put("text", "\"" + m36000(var2, 60) + "\"");
      }

      String var3 = var0.m46000();
      if (var3 != null && !var3.isEmpty()) {
         var1.put("placeholder", "\"" + m36000(var3, 60) + "\"");
      }

      String var4 = var0.m100000();
      if (var4 != null && !var4.isEmpty()) {
         var1.put("texture", var4);
      }

      if (var0.m94000() != null) {
         var1.put("canvas", "yes");
      }
   }

   private static void m64000(Rec0090 var0, StringBuilder var1) {
      var1.append("{\"id\":").append(m10000(var0.m10000()));
      var1.append(",\"label\":").append(m10000(var0.m8000()));
      var1.append(",\"fields\":{");
      boolean var2 = true;

      for (Entry var4 : var0.m2000().entrySet()) {
         if (!var2) {
            var1.append(',');
         }

         var2 = false;
         var1.append(m10000((String)var4.getKey())).append(':').append(m10000((String)var4.getValue()));
      }

      var1.append("},\"children\":[");
      List var5 = var0.m6000();

      for (int var6 = 0; var6 < var5.size(); var6++) {
         if (var6 > 0) {
            var1.append(',');
         }

         m64000((Rec0090)var5.get(var6), var1);
      }

      var1.append("]}");
   }

   private static void m66000(C0347 var0, Map<String, String> var1) {
      var1.put("box", m42000(var0.m58000(), var0.m8000(), var0.m48000(), var0.m22000()));
      if (!m34000(var0.m38000(), var0.m48000()) || !m34000(var0.m84000(), var0.m22000())) {
         var1.put("raw", m40000(var0.m38000()) + "x" + m40000(var0.m84000()));
      }

      var1.put("content", m42000(var0.m80000(), var0.m10000(), var0.m18000(), var0.m20000()));
      if (var0.m14000() > 0.0F || var0.m36000() != 0.0F) {
         var1.put("scrollY", m40000(var0.m36000()) + "/" + m40000(var0.m14000()));
      }

      if (var0.m46000() != 0) {
         var1.put("z", String.valueOf(var0.m46000()));
      }
   }
}
