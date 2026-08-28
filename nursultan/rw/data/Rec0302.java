package rw.data;

import io.netty.channel.ChannelFutureListener;
import java.lang.runtime.ObjectMethods;
import rw.net.Enum0031;
import rw.net.PacketHandlers;

public record Rec0302() {
   public ChannelFutureListener f1000;
   public PacketHandlers<?> f2000;
   public Enum0031 f3000;

   public ChannelFutureListener m2000() {
      return this.f1000;
   }

   public Rec0302(PacketHandlers<?> var1, Enum0031 var2, ChannelFutureListener var3) {
      this.f2000 = var1;
      this.f3000 = var2;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0302,"packet;requiredState;listener",Rec0302::f2000,Rec0302::f3000,Rec0302::f1000>(this, var1);
   }

   public Enum0031 m6000() {
      return this.f3000;
   }

   public PacketHandlers<?> m8000() {
      return this.f2000;
   }
}
