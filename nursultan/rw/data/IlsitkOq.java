package rw.data;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import rw.net.PacketHandlers;

public record IlsitkOq() {
   public Supplier<Channel> f1000;
   public BiConsumer<PacketHandlers<?>, ChannelFutureListener> f2000;
   public Consumer<Rec0302> f3000;
   public int f4000;
   public Consumer<Throwable> f5000;
   private static String[] f6000;

   public Consumer<Rec0302> m2000() {
      return this.f3000;
   }

   public IlsitkOq(
      Supplier<Channel> var1, BiConsumer<PacketHandlers<?>, ChannelFutureListener> var2, int var3, Consumer<Rec0302> var4, Consumer<Throwable> var5
   ) {
      if (var1 == null || var2 == null || var4 == null || var5 == null) {
         throw new IllegalArgumentException(f6000[0]);
      } else if (var3 <= 0) {
         throw new IllegalArgumentException(f6000[1]);
      } else {
         this.f1000 = var1;
         this.f2000 = var2;
         this.f4000 = var3;
         this.f3000 = var4;
         this.f5000 = var5;
      }
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IlsitkOq,"channelSupplier;writer;maxPending;onOverflow;onError",IlsitkOq::f1000,IlsitkOq::f2000,IlsitkOq::f4000,IlsitkOq::f3000,IlsitkOq::f5000>(
         this, var1
      );
   }

   public Supplier<Channel> m6000() {
      return this.f1000;
   }

   public BiConsumer<PacketHandlers<?>, ChannelFutureListener> m8000() {
      return this.f2000;
   }

   public Consumer<Throwable> m10000() {
      return this.f5000;
   }

   public int m14000() {
      return this.f4000;
   }

   private static void m20000() {
      f6000 = new String[]{"StatefulPacketGatewayConfig: all callbacks must be non-null", "StatefulPacketGatewayConfig: maxPending must be positive"};
   }
}
