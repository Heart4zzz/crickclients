package rw.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import rw.api.Iface0204;

public class C1116<K, V> implements Iface0204 {
   private static float[] f1000;
   public Object[] f2000;
   public static Object[] f3000;

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
         var1[2] = f1000[0];
         var1[3] = false;
      }
   }

   public C1116(float var1) {
      this.m6000();
      LinkedHashMap var6 = new LinkedHashMap();
      this.f2000[0] = var6;
      HashMap var7 = new HashMap();
      this.f2000[1] = var7;
      Float var8 = var1;
      this.f2000[2] = var8;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new float[]{0.0F};
   }

   private static void m12000() {
      f3000 = new Object[]{180L};
   }

   public boolean m22000(boolean var1) {
      boolean var2 = (Boolean)this.f2000[3];
      Boolean var7 = var1;
      this.f2000[3] = var7;
      return var2;
   }

   public boolean m24000(K var1) {
      return ((Map)this.f2000[1]).containsKey(var1);
   }

   public float m26000(boolean var1, float var2) {
      if (var1) {
         Float var7 = var2;
         this.f2000[2] = var7;
      }

      return (Float)this.f2000[2];
   }

   public boolean m28000() {
      return (boolean)(!((Map)this.f2000[1]).isEmpty() ? 1 : 0);
   }

   public List<V> m30000(List<V> var1, Function<V, K> var2) {
      long var3 = System.currentTimeMillis();
      HashSet var5 = new HashSet();

      for (Object var7 : var1) {
         Object var8 = var2.apply(var7);
         var5.add(var8);
         ((Map)this.f2000[0]).put(var8, var7);
         ((Map)this.f2000[1]).remove(var8);
      }

      for (Object var10 : ((Map)this.f2000[0]).keySet()) {
         if (!var5.contains(var10)) {
            ((Map)this.f2000[1]).putIfAbsent(var10, var3);
         }
      }

      ((Map)this.f2000[0]).keySet().removeIf(var3x -> {
         Long var4 = (Long)((Map)this.f2000[1]).get(var3x);
         if (var4 != null && var3 - var4 >= 180L) {
            ((Map)this.f2000[1]).remove(var3x);
            return (boolean)1;
         } else {
            return (boolean)0;
         }
      });
      return List.copyOf(((Map)this.f2000[0]).values());
   }

   public boolean m36000(float var1) {
      return (boolean)1;
   }
}
