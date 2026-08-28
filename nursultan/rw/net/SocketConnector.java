package rw.net;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.logging.log4j.Logger;
import rw.api.Iface0029;
import rw.core.C1166;
import rw.core.C1168;

public class SocketConnector {
   public static Object[] f1000;
   private static byte[] f2000;
   private static String[] f3000;
   public Object[] f4000;
   public Object[] f5000;

   public AtomicBoolean m2000() {
      return (AtomicBoolean)this.f5000[3];
   }

   public C1168 m8000() {
      return (C1168)this.f5000[0];
   }

   private void m10000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f2000[0]];
         Object[] var1 = this.f5000;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[f2000[1]];
         Object[] var2 = this.f4000;
      }
   }

   public SocketConnector() {
      this.m10000();
      C1168 var5 = new C1168();
      this.f5000[0] = var5;
      C0026 var6 = new C0026();
      this.f5000[1] = var6;
      OlrlOjtq var7 = new OlrlOjtq();
      this.f5000[2] = var7;
      AtomicBoolean var8 = new AtomicBoolean(true);
      this.f5000[3] = var8;
      AtomicReference var9 = new AtomicReference();
      this.f5000[4] = var9;
      AtomicReference var10 = new AtomicReference();
      this.f5000[5] = var10;
      AtomicReference var11 = new AtomicReference();
      this.f4000[0] = var11;
      C1166 var12 = new C1166(((AtomicReference)this.f5000[4])::get);
      this.f4000[1] = var12;
      AtomicBoolean var13 = new AtomicBoolean(false);
      this.f4000[2] = var13;
   }

   static {
      ntfClinit();
   }

   public C0026 m14000() {
      return (C0026)this.f5000[1];
   }

   public void m16000() {
      C0024 var1 = (C0024)((AtomicReference)this.f4000[0]).get();
      if (var1 != null) {
         var1.m32000();
      }
   }

   public C1166 m20000() {
      return (C1166)this.f4000[1];
   }

   private static void m24000() {
      f1000 = new Object[]{null};
   }

   private static void m26000() {
      f2000 = new byte[]{6, 3};
   }

   public void m28000() {
      C0024 var1 = (C0024)((AtomicReference)this.f4000[0]).get();
      if (var1 == null) {
         CompletableFuture.completedFuture(null);
      } else {
         var1.m18000();
      }
   }

   private void m30000() {
      ServerConnection var1 = (ServerConnection)((AtomicReference)this.f5000[5]).get();
      if (var1 != null) {
         var1.m38000();
      }
   }

   private static void m32000() {
      f3000 = new String[]{"startSocketConnection called twice - ignoring", "packet and state must not be null", "SSL init failed. Disabling auto reconnect."};
   }

   public AtomicReference<ServerConnection> m36000() {
      return (AtomicReference<ServerConnection>)this.f5000[5];
   }

   public void m38000() {
      if (!((AtomicBoolean)this.f4000[2]).compareAndSet(false, true)) {
         ((Logger)f1000[0]).warn(f3000[0]);
      } else {
         ((AtomicBoolean)this.f5000[3]).set((boolean)1);
         SocketClient var1 = SocketClient.m42000();
         EventLoopGroup var2 = ((C0026)this.f5000[1]).m22000();
         C0021 var3 = new C0021(((C0026)this.f5000[1])::m14000, ((AtomicBoolean)this.f5000[3])::get, this::m30000, var1.m26000());
         Bootstrap var4 = this.m64000(var2, var1, var3);
         ServerConnection var5 = new ServerConnection(
            () -> var4.connect(var1.m8000(), var1.m32000()), (OlrlOjtq)this.f5000[2], var3, ((AtomicBoolean)this.f5000[3])::get, ((C0026)this.f5000[1])::m28000
         );
         ((AtomicReference)this.f5000[5]).set(var5);
         ((AtomicReference)this.f4000[0]).set(new C0024((OlrlOjtq)this.f5000[2], var3, (C0026)this.f5000[1], (AtomicBoolean)this.f5000[3]));
         var5.m38000();
      }
   }

   public AtomicReference<C0024> m40000() {
      return (AtomicReference<C0024>)this.f4000[0];
   }

   public OlrlOjtq m48000() {
      return (OlrlOjtq)this.f5000[2];
   }

   public List<String> m50000() {
      return ((C1168)this.f5000[0]).m18000();
   }

   public void m52000(PacketHandlers<?> var1, Enum0031 var2, ChannelFutureListener var3) {
      if (var1 != null && var2 != null) {
         IlpOks var4 = (IlpOks)((AtomicReference)this.f5000[4]).get();
         if (var4 != null) {
            var4.m70000(var1, var2, var3);
         }
      } else {
         throw new IllegalArgumentException(f3000[1]);
      }
   }

   public void m56000(PacketHandlers<Iface0029> var1) {
      this.m68000(var1, (Enum0031)Enum0031.f3000[1]);
   }

   private Bootstrap m64000(EventLoopGroup var1, SocketClient var2, C0021 var3) {
      C0023 var4 = new C0023(var2, new C0025(), () -> new IlpOks(this), ((AtomicReference)this.f5000[4])::set, () -> {
         ((AtomicBoolean)this.f5000[3]).set((boolean)0);
         var3.m16000();
         ((Logger)f1000[0]).error(f3000[2]);
         this.m28000();
      });
      return (Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(var1)).channel(NioSocketChannel.class))
            .option(ChannelOption.TCP_NODELAY, true))
         .handler(var4);
   }

   public AtomicBoolean m66000() {
      return (AtomicBoolean)this.f4000[2];
   }

   public void m68000(PacketHandlers<?> var1, Enum0031 var2) {
      this.m52000(var1, var2, null);
   }

   public AtomicReference<IlpOks> m70000() {
      return (AtomicReference<IlpOks>)this.f5000[4];
   }

   public boolean m72000() {
      return ((OlrlOjtq)this.f5000[2]).m2000();
   }
}
