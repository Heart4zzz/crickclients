package rw.net;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntFunction;

public class C0026 {
   private static String[] f1000;
   public static Object[] f2000;
   public Object[] f3000;

   public AtomicReference<EventLoopGroup> m2000() {
      return (AtomicReference<EventLoopGroup>)this.f3000[1];
   }

   private static void m8000() {
      f1000 = new String[]{"EventLoopGroup already started", "Netty Client IO #%d"};
   }

   public C0026(IntFunction<EventLoopGroup> var1) {
      this.m46000();
      AtomicReference var6 = new AtomicReference();
      this.f3000[1] = var6;
      this.f3000[0] = var1;
   }

   public C0026() {
      this(var0 -> new NioEventLoopGroup(var0, new ThreadFactoryBuilder().setNameFormat(f1000[1]).setDaemon(true).build()));
   }

   static {
      ntfClinit();
   }

   public EventLoopGroup m14000() {
      return (EventLoopGroup)((AtomicReference)this.f3000[1]).get();
   }

   private static void m20000() {
      f2000 = new Object[]{150L, 2000L};
   }

   public EventLoopGroup m22000() {
      EventLoopGroup var1 = (EventLoopGroup)((IntFunction)this.f3000[0]).apply(0);
      if (!((AtomicReference)this.f3000[1]).compareAndSet(null, var1)) {
         var1.shutdownGracefully(0L, 0L, TimeUnit.MILLISECONDS);
         throw new IllegalStateException(f1000[0]);
      } else {
         return var1;
      }
   }

   public boolean m28000() {
      EventLoopGroup var1 = (EventLoopGroup)((AtomicReference)this.f3000[1]).get();
      return (boolean)(var1 != null && !var1.isShuttingDown() && !var1.isShutdown() ? 1 : 0);
   }

   public CompletableFuture<Void> m38000() {
      return this.m42000(150L, 2000L);
   }

   public CompletableFuture<Void> m42000(long var1, long var3) {
      EventLoopGroup var5 = (EventLoopGroup)((AtomicReference)this.f3000[1]).getAndSet(null);
      CompletableFuture var6 = new CompletableFuture();
      if (var5 != null && !var5.isShuttingDown() && !var5.isShutdown()) {
         var5.shutdownGracefully(var1, var3, TimeUnit.MILLISECONDS).addListener(var1x -> {
            if (var1x.isSuccess()) {
               var6.complete(null);
            } else {
               var6.completeExceptionally(var1x.cause());
            }
         });
         return var6;
      } else {
         var6.complete(null);
         return var6;
      }
   }

   private void m46000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[2];
         Object[] var1 = this.f3000;
      }
   }

   public IntFunction<EventLoopGroup> m48000() {
      return (IntFunction<EventLoopGroup>)this.f3000[0];
   }
}
