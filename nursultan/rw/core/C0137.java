package rw.core;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import rw.net.PacketListener;

public class C0137 implements PacketListener<C0698> {
   static {
      ntfClinit();
   }

   public void m4000(C0698 var1) {
      GpuBufferSlice var2 = C0022.m4000();
      if (var2 != null) {
         var1.m10000(var2);
      }
   }
}
