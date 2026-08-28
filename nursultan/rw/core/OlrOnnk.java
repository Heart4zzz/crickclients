package rw.core;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.Logger;

public class OlrOnnk {
   private static short[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static long[] f9000;
   private static String[] f10000;
   private static short[] f11000;
   private static boolean[] f12000;
   public static Object[] f13000;
   public static Object[] f14000;
   private static short[] f15000;
   private static boolean[] f16000;
   private static byte[] f17000;
   private static short[] f18000;

   public static C0828 m2000(String var0) {
      return (C0828)((Map)f13000[f4000[2]]).get(var0);
   }

   public static boolean m6000() {
      return (Boolean)f13000[f18000[0]];
   }

   private static void m10000() {
      f10000 = new String[3];
      f10000[(0 | -0) >>> 31] = "GpuProfiler.beginFrame() called twice without endFrame()";
      f10000[(1 | -1) >>> 31] = "GpuProfiler.endFrame() with {} unclosed scope(s); auto-closing";
      f10000[2] = "GpuProfiler.end() called without matching begin()";
   }

   private OlrOnnk() {
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      boolean[] var128 = new boolean[2];
      f12000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[6];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
      f3000[3] = (boolean)((1 | -1) >>> 31);
      f3000[4] = (boolean)((0 | -0) >>> 31);
      f3000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var130 = new boolean[3];
      f16000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f16000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f16000[2] = (boolean)((0 | -0) >>> 31);
   }

   private static void m16000() {
      ((Deque)f13000[f15000[5]]).clear();
      ((Map)f13000[f15000[6]]).values().forEach(C0813::m24000);
      ((Map)f13000[f15000[7]]).clear();
      ((Map)f13000[f11000[0]]).clear();
      Long var4 = f9000[4];
      f13000[f11000[1]] = var4;
      Integer var5 = Integer.valueOf(f3000[0]);
      f14000[f11000[2]] = var5;
      Boolean var6 = f3000[1];
      f14000[f11000[3]] = var6;
   }

   public static void m22000() {
      if ((Boolean)f13000[f1000[0]] && (Boolean)f14000[f1000[1]]) {
         if (!((Deque)f13000[f1000[2]]).isEmpty()) {
            ((Logger)f13000[f1000[3]]).warn(f10000[1], ((Deque)f13000[f1000[4]]).size());
            m28000();
         }

         Long var4 = (Long)f13000[f1000[5]] + f9000[2];
         f13000[f1000[6]] = var4;
         Boolean var5 = f12000[1];
         f14000[f1000[7]] = var5;
      }
   }

   private static void m24000() {
      f13000 = new Object[f17000[4]];
      f13000[f3000[3]] = Integer.valueOf(f2000[0]);
      f13000[f2000[(1 | -1) >>> 31]] = f3000[4];
      f13000[f2000[2]] = f9000[5];
      f14000 = new Object[f2000[3]];
      f14000[f3000[5]] = Integer.valueOf(f16000[0]);
      f14000[f16000[(1 | -1) >>> 31]] = f16000[2];
   }

   private static void m26000() {
      byte[] var128 = new byte[5];
      f17000[(0 | -0) >>> 31] = 3;
      f17000[(1 | -1) >>> 31] = 2;
      f17000[2] = 3;
      f17000[3] = 4;
      f17000[4] = 7;
      byte[] var129 = new byte[4];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = 5;
      f2000[2] = 6;
      f2000[3] = 2;
   }

   private static void m28000() {
      while (!((Deque)f13000[f15000[2]]).isEmpty()) {
         ((C0813)((Deque)f13000[f15000[3]]).pollFirst()).m2000((Integer)f14000[f15000[4]]);
      }
   }

   public static void m32000() {
      ((Map)f13000[f4000[3]]).values().forEach(C0828::m32000);
   }

   public static void m38000() {
      if ((Boolean)f13000[f8000[5]] && (Boolean)f14000[f7000[0]]) {
         C0813 var0 = (C0813)((Deque)f13000[f7000[1]]).pollFirst();
         if (var0 == null) {
            ((Logger)f13000[f7000[2]]).warn(f10000[2]);
         } else {
            var0.m2000((Integer)f14000[f7000[3]]);
         }
      }
   }

   public static C0819 m40000(String var0) {
      if ((Boolean)f13000[f6000[0]] && (Boolean)f14000[f6000[1]]) {
         m44000(var0);
         return (C0819)C0819.f3000[f4000[0]];
      } else {
         return (C0819)C0819.f3000[f6000[2]];
      }
   }

   private static void m42000() {
      long[] var128 = new long[6];
      f9000[(0 | -0) >>> 31] = 3L;
      f9000[(1 | -1) >>> 31] = 3L;
      f9000[2] = 1L;
      f9000[3] = 0L;
      f9000[4] = 0L;
      f9000[5] = 0L;
   }

   public static void m44000(String var0) {
      if ((Boolean)f13000[f8000[0]] && (Boolean)f14000[f8000[1]]) {
         C0813 var1 = ((Map)f13000[f8000[2]]).computeIfAbsent(var0, var0x -> new C0813(f17000[0]));
         var1.m22000((Integer)f14000[f8000[3]]);
         ((Deque)f13000[f8000[4]]).push(var1);
      }
   }

   public static void m48000(boolean var0) {
      if (var0 != (Boolean)f13000[f18000[1]]) {
         Boolean var5 = var0;
         f13000[f18000[2]] = var5;
         if (!var0) {
            m16000();
         }
      }
   }

   public static void m50000() {
      if ((Boolean)f13000[f5000[0]]) {
         if ((Boolean)f14000[f5000[1]]) {
            ((Logger)f13000[f5000[2]]).warn(f10000[0]);
            m28000();
         }

         Boolean var4 = f12000[0];
         f14000[f5000[3]] = var4;
         Integer var5 = (int)((Long)f13000[f5000[4]] % f9000[0]);
         f14000[f5000[5]] = var5;
         if ((Long)f13000[f5000[6]] >= f9000[1]) {
            m60000((Integer)f14000[f5000[7]]);
         }
      }
   }

   private static void m54000() {
      short[] var128 = new short[3];
      f18000[(0 | -0) >>> 31] = 5;
      f18000[(1 | -1) >>> 31] = 5;
      f18000[2] = 5;
      short[] var129 = new short[8];
      f5000[(0 | -0) >>> 31] = 5;
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = 6;
      f5000[5] = (short)((0 | -0) >>> 31);
      f5000[6] = 6;
      f5000[7] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[8];
      f1000[(0 | -0) >>> 31] = 5;
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = 3;
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = 3;
      f1000[5] = 6;
      f1000[6] = 6;
      f1000[7] = (short)((1 | -1) >>> 31);
      short[] var131 = new short[6];
      f8000[(0 | -0) >>> 31] = 5;
      f8000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f8000[2] = 2;
      f8000[3] = (short)((0 | -0) >>> 31);
      f8000[4] = 3;
      f8000[5] = 5;
      short[] var132 = new short[4];
      f7000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[(1 | -1) >>> 31] = 3;
      f7000[2] = (short)((0 | -0) >>> 31);
      f7000[3] = (short)((0 | -0) >>> 31);
      short[] var133 = new short[3];
      f6000[(0 | -0) >>> 31] = 5;
      f6000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f6000[2] = (short)((1 | -1) >>> 31);
      short[] var134 = new short[5];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = 4;
      f4000[2] = 4;
      f4000[3] = 4;
      f4000[4] = 2;
      short[] var135 = new short[8];
      f15000[(0 | -0) >>> 31] = 4;
      f15000[(1 | -1) >>> 31] = 4;
      f15000[2] = 3;
      f15000[3] = 3;
      f15000[4] = (short)((0 | -0) >>> 31);
      f15000[5] = 3;
      f15000[6] = 2;
      f15000[7] = 2;
      short[] var136 = new short[4];
      f11000[(0 | -0) >>> 31] = 4;
      f11000[(1 | -1) >>> 31] = 6;
      f11000[2] = (short)((0 | -0) >>> 31);
      f11000[3] = (short)((1 | -1) >>> 31);
   }

   public static Map<String, C0828> m56000() {
      return Collections.unmodifiableMap(new LinkedHashMap<>((Map<? extends String, ? extends C0828>)f13000[f4000[1]]));
   }

   private static void m60000(int var0) {
      for (Entry var2 : ((Map)f13000[f4000[4]]).entrySet()) {
         long var3 = ((C0813)var2.getValue()).m26000(var0);
         if (var3 >= f9000[3]) {
            C0828 var5 = (C0828)((Map)f13000[f15000[0]]).get(var2.getKey());
            if (var5 == null) {
               ((Map)f13000[f15000[1]]).put((String)var2.getKey(), new C0828((String)var2.getKey(), var3));
            } else {
               var5.m48000(var3);
            }
         }
      }
   }
}
