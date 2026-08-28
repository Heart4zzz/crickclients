package rw.core;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.util.Deque;

public class C0022 {
   public static Object[] f1000;

   public static GpuBufferSlice m4000() {
      return (GpuBufferSlice)f1000[1];
   }

   static {
      ntfClinit();
   }

   public static void m14000() {
      ((Deque)f1000[0]).clear();
      Object var4 = null;
      f1000[1] = var4;
   }

   public static void m20000() {
      if (((Deque)f1000[0]).isEmpty()) {
         Object var4 = null;
         f1000[1] = var4;
      } else {
         GpuBufferSlice var5 = (GpuBufferSlice)((Deque)f1000[0]).removeLast();
         f1000[1] = var5;
      }
   }

   public static void m22000(GpuBufferSlice var0) {
      if ((GpuBufferSlice)f1000[1] != null) {
         ((Deque)f1000[0]).addLast((GpuBufferSlice)f1000[1]);
      }

      f1000[1] = var0;
   }

   private static void m24000() {
      f1000 = new Object[]{null, null};
   }
}
