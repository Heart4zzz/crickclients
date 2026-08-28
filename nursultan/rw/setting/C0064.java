package rw.setting;

import java.util.ArrayList;
import java.util.Objects;
import rw.api.Iface0208;
import rw.data.Rec0132;
import rw.data.Rec0133;

final class C0064 {
   private C0064() {
   }

   private static float m2000(Iface0208 var0, String var1, float var2, Rec0036 var3) {
      float var4 = 0.0F;
      int var5 = -1;
      int var6 = 0;

      while (var6 < var1.length()) {
         int var7 = var1.codePointAt(var6);
         var6 += Character.charCount(var7);
         if (var7 != 13 && var7 != 10) {
            if (var5 >= 0) {
               var4 += var0.m8000(var5, var7, var2, var3);
            }

            var4 += var0.m2000(var7, var2, var3);
            var5 = var7;
         } else {
            var5 = -1;
         }
      }

      return Math.max(0.0F, var4);
   }

   private static Rec0132 m4000(Iface0208 var0, String var1, float var2, Rec0036 var3, float var4) {
      String[] var5 = var1.split("\\n", -1);
      float var6 = 0.0F;

      for (String var10 : var5) {
         var6 = Math.max(var6, m2000(var0, var10, var2, var3));
      }

      return new Rec0132(var1, var6, var5.length * var4, var5.length);
   }

   private static float m6000(Iface0208 var0, String var1, float var2, Rec0036 var3) {
      float var4 = 0.0F;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         char var7 = var1.charAt(var6);
         if (!Character.isWhitespace(var7)) {
            if (var5 < 0) {
               var5 = var6;
            }
         } else if (var5 >= 0) {
            var4 = Math.max(var4, m2000(var0, var1.substring(var5, var6), var2, var3));
            var5 = -1;
         }
      }

      if (var5 >= 0) {
         var4 = Math.max(var4, m2000(var0, var1.substring(var5), var2, var3));
      }

      return var4;
   }

   static Rec0133 m8000(rw.gui.C0013 var0, String var1, float var2, Rec0036 var3) {
      Objects.requireNonNull(var0, "context");
      String var4 = var1 == null ? "" : var1.replace("\r", "");
      Iface0208 var5 = var0.m8000();
      float var6 = var5.m4000(var2, var3);
      float var7 = m4000(var5, var4, var2, var3, var6).m8000();
      float var8 = m6000(var5, var4, var2, var3);
      return new Rec0133(var7, var6, var8);
   }

   static Rec0132 m10000(rw.gui.C0013 var0, String var1, float var2, float var3, Rec0036 var4, Rec0133 var5) {
      Objects.requireNonNull(var0, "context");
      Rec0133 var6 = var5 == null ? m8000(var0, var1, var3, var4) : var5;
      String var7 = var1 == null ? "" : var1.replace("\r", "");
      float var8 = var6.m6000();
      if (var7.isEmpty()) {
         return new Rec0132("", 0.0F, var8, 1);
      } else if (Float.isInfinite(var2)) {
         return m4000(var0.m8000(), var7, var3, var4, var8);
      } else {
         ArrayList var9 = new ArrayList();
         StringBuilder var10 = new StringBuilder();
         StringBuilder var11 = new StringBuilder();
         float var12 = 0.0F;
         float var13 = 0.0F;
         float var14 = 0.0F;
         boolean var15 = false;
         int var16 = 0;

         while (var16 < var7.length()) {
            char var17 = var7.charAt(var16);
            if (var17 == '\n') {
               var14 = Math.max(var14, var12);
               var9.add(var10.toString());
               var10.setLength(0);
               var11.setLength(0);
               var12 = 0.0F;
               var13 = 0.0F;
               var15 = false;
               var16++;
            } else {
               boolean var18 = Character.isWhitespace(var17);
               int var19 = var16;
               if (var18) {
                  while (true) {
                     if (var16 < var7.length()) {
                        char var25 = var7.charAt(var16);
                        if (var25 != '\n' && Character.isWhitespace(var25)) {
                           var16++;
                           continue;
                        }
                     }

                     if (var15) {
                        String var26 = var7.substring(var19, var16);
                        var11.append(var26);
                        var13 += m2000(var0.m8000(), var26, var3, var4);
                     }
                     break;
                  }
               } else {
                  while (true) {
                     if (var16 < var7.length()) {
                        char var20 = var7.charAt(var16);
                        if (var20 != '\n' && !Character.isWhitespace(var20)) {
                           var16++;
                           continue;
                        }
                     }

                     String var24 = var7.substring(var19, var16);
                     float var21 = m2000(var0.m8000(), var24, var3, var4);
                     float var22 = var15 ? var12 + var13 + var21 : var21;
                     if (var15 && var22 > var2 + 0.01F) {
                        var14 = Math.max(var14, var12);
                        var9.add(var10.toString());
                        var10.setLength(0);
                        var11.setLength(0);
                        var12 = 0.0F;
                        var13 = 0.0F;
                        var15 = false;
                     }

                     if (var15 && !var11.isEmpty()) {
                        var10.append((CharSequence)var11);
                        var12 += var13;
                        var11.setLength(0);
                        var13 = 0.0F;
                     }

                     var10.append(var24);
                     var12 += var21;
                     var15 = true;
                     break;
                  }
               }
            }
         }

         var14 = Math.max(var14, var12);
         var9.add(var10.toString());
         return new Rec0132(String.join("\n", var9), var14, var9.size() * var8, var9.size());
      }
   }
}
