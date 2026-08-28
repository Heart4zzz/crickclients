package rw.event;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.apache.logging.log4j.Logger;
import rw.Module;
import rw.NursultanClient;
import rw.api.Iface0642;
import rw.api.Iface0645;
import rw.api.Iface0651;
import rw.core.C1144;
import rw.data.Rec0252;
import rw.data.Rec0254;
import rw.data.Rec0255;
import rw.defs.Enum0081;
import rw.net.PacketListener;
import rw.setting.C0151;

public class EventBus {
   public static Object[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;
   private static boolean[] f4000;
   private static String[] f5000;
   private static boolean[] f6000;
   private static boolean[] f7000;
   private static boolean[] f8000;
   private static boolean[] f9000;

   private String m6000(Iface0651 var1) {
      Class var2 = var1.m4000();
      return var2 == null ? f5000[2] : var2.getName();
   }

   private List<Iface0651> m8000(List<Iface0651> var1) {
      int var2 = var1.size();
      if (var2 < 2) {
         return var1;
      } else {
         HashMap var3 = new HashMap();

         for (int var4 = 0; var4 < var2; var4++) {
            Class var5 = ((Iface0651)var1.get(var4)).m4000();
            if (var5 != null) {
               var3.computeIfAbsent(var5, var0 -> new ArrayList<>()).add(var4);
            }
         }

         ArrayList var14 = new ArrayList(var2);

         for (int var15 = 0; var15 < var2; var15++) {
            var14.add(new HashSet());
         }

         int[] var16 = new int[var2];

         for (int var6 = 0; var6 < var2; var6++) {
            Iface0651 var7 = (Iface0651)var1.get(var6);

            for (Class var11 : var7.m10000()) {
               for (int var13 : var3.getOrDefault(var11, List.of())) {
                  if (var13 != var6 && ((Set)var14.get(var13)).add(var6)) {
                     var16[var6]++;
                  }
               }
            }

            for (Class var27 : var7.m14000()) {
               for (int var34 : var3.getOrDefault(var27, List.of())) {
                  if (var34 != var6 && ((Set)var14.get(var6)).add(var34)) {
                     var16[var34]++;
                  }
               }
            }
         }

         Comparator var17 = Comparator.comparing(var2x -> this.m6000((Iface0651)var1.get(var2x))).thenComparingInt(var0 -> var0);
         PriorityQueue var18 = new PriorityQueue(var17);

         for (int var20 = 0; var20 < var2; var20++) {
            if (var16[var20] == 0) {
               var18.add(var20);
            }
         }

         ArrayList var21 = new ArrayList(var2);
         boolean[] var23 = new boolean[var2];

         while (!var18.isEmpty()) {
            int var25 = (Integer)var18.poll();
            var21.add((Iface0651)var1.get(var25));
            var23[var25] = f8000[0];

            for (int var32 : (Set)var14.get(var25)) {
               if ((var16[var32] -= f8000[1]) == 0) {
                  var18.add(var32);
               }
            }
         }

         if (var21.size() < var2) {
            ArrayList var26 = new ArrayList();

            for (int var29 = f8000[2]; var29 < var2; var29++) {
               if (!var23[var29]) {
                  var26.add((Iface0651)var1.get(var29));
               }
            }

            String var30 = ((Iface0651)var1.get(0)).m8000().getName();
            List var33 = var26.stream().map(this::m6000).toList();
            if ((Boolean)NursultanClient.f13000[3]) {
               throw new IllegalStateException("Cyclic before/after for event " + var30 + ": " + var33);
            }

            ((Logger)f1000[0]).warn(f5000[1], var30, var33);
            var26.sort(Comparator.comparing(this::m6000));
            var21.addAll(var26);
         }

         return var21;
      }
   }

   public <T> void m12000(T var1) {
      Module var2 = var1 instanceof Module var3 ? var3 : null;
      if (var2 != null) {
         var2.m12000((boolean)0);
      }

      Rec0255 var9 = (Rec0255)((ClassValue)this.f2000[2]).get(var1.getClass());
      if (var9 != null) {
         Iface0651[] var4 = var9.m4000();
         Consumer[] var5 = var9.m6000();

         for (int var6 = 0; var6 < var5.length; var6++) {
            if (var2 == null || !var2.m10000() || !var4[var6].m6000()) {
               try {
                  var5[var6].accept(var1);
               } catch (Exception var8) {
                  ((Logger)f1000[0]).error(f5000[0], var1.getClass().getName(), var8);
               }
            }
         }
      }
   }

   public EventBus(Object var1) {
      this.m16000();
      ConcurrentHashMap var6 = new ConcurrentHashMap();
      this.f2000[0] = var6;
      ConcurrentHashMap var7 = new ConcurrentHashMap();
      this.f2000[1] = var7;
      C1144 var8 = new C1144(this);
      this.f2000[2] = var8;
      ArrayList var9 = new ArrayList();
      this.f2000[3] = var9;
      ((List)this.f2000[3]).add(new Rec0254(var1.getClass().getPackageName(), (var0, var1x) -> (Lookup)var0.invoke(null, var1x, MethodHandles.lookup())));
      this.m32000(var1);
   }

   static {
      ntfClinit();
   }

   private void m16000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[4];
         Object[] var1 = this.f2000;
      }
   }

   private static void m18000() {
      f1000 = new Object[]{null};
   }

   private void m22000(Iface0651 var1) {
      Class var2 = var1.m8000();
      ((Map)this.f2000[1]).compute(var2, (var2x, var3) -> {
         ArrayList var4 = var3 == null ? new ArrayList() : new ArrayList<>(Arrays.asList(((Rec0255)var3).m4000()));
         var4.add(var1);
         return this.m60000(var4);
      });
      ((ClassValue)this.f2000[2]).remove(var2);
   }

   private static void m28000() {
      f5000 = new String[]{"Event handler failed: {}", "Cyclic before/after for event {}; ignoring ordering for: {}", ""};
   }

   public void m32000(Object var1) {
      this.m52000(var1.getClass(), var1).forEach(this::m22000);
   }

   private Iface0645 m34000(Class<?> var1) {
      synchronized ((List)this.f2000[3]) {
         for (Rec0254 var4 : (List)this.f2000[3]) {
            if (var1.getName().startsWith(var4.m4000())) {
               return var4.m6000();
            }
         }
      }

      throw new RuntimeException("No registered lambda factory for '" + var1.getName() + "'.");
   }

   private List<Iface0651> m38000(List<Iface0651> var1) {
      EnumMap var2 = new EnumMap<>(Enum0081.class);

      for (Iface0651 var4 : var1) {
         var2.computeIfAbsent(var4.m2000(), var0 -> new ArrayList<>()).add(var4);
      }

      ArrayList var9 = new ArrayList(var1.size());

      for (Enum0081 var7 : Enum0081.m10000()) {
         List var8 = (List)var2.get(var7);
         if (var8 != null) {
            var9.addAll(this.m8000(var8));
         }
      }

      return var9;
   }

   public <T> void m44000(Enum0081 var1, boolean var2, Class<T> var3, PacketListener<T> var4) {
      this.m22000(new Rec0252(var3, var1, var2, var4));
   }

   private void m46000(Iface0651 var1) {
      Class var2 = var1.m8000();
      ((Map)this.f2000[1]).computeIfPresent(var2, (var2x, var3) -> {
         ArrayList var4 = new ArrayList<>(Arrays.asList(var3.m4000()));
         var4.remove(var1);
         return var4.isEmpty() ? null : this.m60000(var4);
      });
      ((ClassValue)this.f2000[2]).remove(var2);
   }

   private void m50000(List<Iface0651> var1, Class<?> var2, Object var3) {
      for (Method var7 : var2.getDeclaredMethods()) {
         if (this.m56000(var7)) {
            var1.add(new C0151(this.m34000(var2), var2, var3, var7));
         }
      }

      if (var2.getSuperclass() != null) {
         this.m50000(var1, var2.getSuperclass(), var3);
      }
   }

   private List<Iface0651> m52000(Class<?> var1, Object var2) {
      return ((Map)this.f2000[0]).computeIfAbsent(var2, var2x -> {
         ArrayList var3 = new ArrayList();
         this.m50000(var3, var1, var2x);
         return var3;
      });
   }

   public <T> void m54000(Class<T> var1, PacketListener<T> var2) {
      this.m44000((Enum0081)Enum0081.f1000[2], (boolean)0, var1, var2);
   }

   private boolean m56000(Method var1) {
      return (boolean)(var1.isAnnotationPresent(Iface0642.class)
            && var1.getReturnType() == void.class
            && var1.getParameterCount() == 1
            && !var1.getParameters()[0].getType().isPrimitive()
         ? 1
         : 0);
   }

   private Rec0255 m60000(List<Iface0651> var1) {
      List var2 = this.m38000(var1);
      Iface0651[] var3 = var2.toArray(var0 -> new Iface0651[var0]);
      Consumer[] var4 = new Consumer[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         var4[var5] = var3[var5].m12000();
      }

      return new Rec0255(var3, var4);
   }

   public void m66000(Object var1) {
      this.m52000(var1.getClass(), var1).forEach(this::m46000);
   }

   private static void m70000() {
      f4000 = new boolean[]{false, false};
      f3000 = new boolean[]{false, false, false, false, false, false, false};
      f9000 = new boolean[]{false, true, false, true, false};
      f8000 = new boolean[]{true, true, false};
      f7000 = new boolean[]{false, false, true, false};
      f6000 = new boolean[]{true, false, false, true, false, true};
   }

   public <T> void m74000(Enum0081 var1, Class<T> var2, PacketListener<T> var3) {
      this.m44000(var1, (boolean)0, var2, var3);
   }
}
