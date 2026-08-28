package rw.core;

import com.mojang.blaze3d.buffers.GpuBufferSlice;

public class C0698 {
   public Object[] f1000;
   public static Object[] f2000;

   public C0698() {
      this.m8000();
   }

   static {
      ntfClinit();
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C0698 m10000(GpuBufferSlice var1) {
      this.f1000[0] = var1;
      return this;
   }

   private static void m14000() {
      f2000 = new Object[]{null};
   }

   public GpuBufferSlice m16000() {
      return (GpuBufferSlice)this.f1000[0];
   }

   public static C0698 m18000(GpuBufferSlice var0) {
      ((C0698)f2000[0]).f1000[0] = var0;
      return (C0698)f2000[0];
   }
}
