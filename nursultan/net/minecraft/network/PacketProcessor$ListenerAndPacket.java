package net.minecraft.network;

import KDFzREm.NAC;
import KDFzREm.NAr;
import KDFzREm.NBi;
import KDFzREm.NFQ;
import KDFzREm.NtY;

record PacketProcessor$ListenerAndPacket<T extends NFQ>() {
   private final T N;
   private final NAC<T> y;

   public NAC<T> L() {
      return this.y;
   }

   PacketProcessor$ListenerAndPacket(T var1, NAC<T> var2) {
      this.N = (T)var1;
      this.y = var2;
   }

   public T y() {
      return this.N;
   }

   public void listener() {
      if (this.N.method_52413(this.y)) {
         try {
            this.y.method_65081(this.N);
         } catch (Exception var3) {
            if (var3 instanceof NtY var2 && var2.getCause() instanceof OutOfMemoryError) {
               throw NAr.N(var3, this.y, this.N);
            }

            this.N.method_59807(this.y, var3);
         }
      } else {
         NBi.N.debug("Ignoring packet due to disconnection: {}", this.y);
      }
   }
}
