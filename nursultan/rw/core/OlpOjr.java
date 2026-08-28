package rw.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.api.Iface0034;
import rw.data.Rec0198;
import rw.defs.Enum0060;

public class OlpOjr implements Iface0034 {
   public Object[] f1000;

   OlpOjr(List<Rec0198> var1) {
      this.m8000();
      ArrayList var8 = new ArrayList();
      this.f1000[0] = var8;
      HashMap var9 = new HashMap();
      this.f1000[1] = var9;
      HashSet var10 = new HashSet();
      this.f1000[2] = var10;
      HashSet var11 = new HashSet();
      this.f1000[3] = var11;

      for (Rec0198 var3 : var1) {
         if (var3.f1000 == null) {
            ((List)this.f1000[0]).add(var3);
         } else if (((Map)this.f1000[1]).put(var3.f1000, var3) != null) {
            throw new IllegalArgumentException("Shader template arg was configured twice: " + var3.f1000);
         }
      }
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
         var1[4] = 0;
      }
   }

   public void m14000() {
      Integer var5 = 0;
      this.f1000[4] = var5;
      ((Set)this.f1000[2]).clear();
      ((Set)this.f1000[3]).clear();
   }

   private Rec0198 m16000(String var1) {
      Rec0198 var2 = (Rec0198)((Map)this.f1000[1]).get(var1);
      if (var2 != null) {
         ((Set)this.f1000[2]).add(var1);
         return var2;
      } else if ((Integer)this.f1000[4] < ((List)this.f1000[0]).size()) {
         List var10000 = (List)this.f1000[0];
         int var10003 = (Integer)this.f1000[4];
         Integer var7 = var10003 + 1;
         this.f1000[4] = var7;
         return (Rec0198)var10000.get(var10003);
      } else {
         throw new IllegalArgumentException("Missing shader template value for " + var1);
      }
   }

   public boolean m20000() {
      return (boolean)1;
   }

   public String m22000(int var1, String var2, String var3) {
      Matcher var4 = ((Pattern)C0816.f1000[0]).matcher(var3);
      StringBuilder var5 = new StringBuilder();

      while (var4.find()) {
         String var6 = var4.group(1);
         String var7 = var4.group(2);
         Enum0060 var8 = Enum0060.m108000(var4.group(3));
         int var9 = m28000(var8, var7, var4.group(4));
         String var10 = var4.group(5);
         Rec0198 var11 = this.m16000(var7);
         String var12 = this.m26000(var2, var7, var8, var9, var11);
         var4.appendReplacement(var5, Matcher.quoteReplacement(var6 + var12 + var10));
         ((Set)this.f1000[3]).add(var7);
      }

      var4.appendTail(var5);
      if (var1 == 35632) {
         this.m30000(var2);
      }

      return var5.toString();
   }

   private String m26000(String var1, String var2, Enum0060 var3, int var4, Rec0198 var5) {
      if (var5.f4000 != null && var5.f4000 != var3) {
         throw new IllegalArgumentException("Shader template type mismatch for " + var2 + " in " + var1 + ". Expected " + var5.f4000 + ", actual " + var3);
      } else if (var5.f5000) {
         return var3.m94000(var2, var4);
      } else {
         try {
            return var3.m102000(var2, var5.f2000, var4);
         } catch (IllegalArgumentException var7) {
            throw new IllegalArgumentException("Invalid shader template value for " + var2 + " (" + var3 + ") in " + var1 + ": " + var7.getMessage(), var7);
         }
      }
   }

   private static int m28000(Enum0060 var0, String var1, String var2) {
      if (!var0.m100000()) {
         if (var2 != null) {
            throw new IllegalArgumentException("Only array shader template args can have a size: " + var1);
         } else {
            return 0;
         }
      } else if (var2 == null) {
         throw new IllegalArgumentException("Array shader template arg needs a marker size: " + var1);
      } else {
         return Integer.parseInt(var2);
      }
   }

   private void m30000(String var1) {
      if ((Integer)this.f1000[4] < ((List)this.f1000[0]).size()) {
         throw new IllegalArgumentException("Too many ordered shader template actions for " + var1 + ". First unused action index: " + (Integer)this.f1000[4]);
      } else {
         for (String var3 : ((Map)this.f1000[1]).keySet()) {
            if (!((Set)this.f1000[3]).contains(var3)) {
               throw new IllegalArgumentException("Shader template arg was not found: " + var3);
            }

            if (!((Set)this.f1000[2]).contains(var3)) {
               throw new IllegalArgumentException("Shader template arg was not used: " + var3);
            }
         }
      }
   }
}
