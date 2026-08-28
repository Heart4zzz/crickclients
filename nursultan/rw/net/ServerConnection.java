package rw.net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.Logger;

public class ServerConnection {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private static void m2000() {
      f3000 = new String[]{
         "Connecting...",
         "connect failed",
         "Connection to Nursultan Server failed ({}). Trying to reconnect",
         "Connected to Nursultan Server",
         "Channel closed with error",
         "Channel closed normally",
         "closed by peer",
         "Connection to Nursultan Server lost ({}). Trying to reconnect"
      };
   }

   private void m8000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
      }
   }

   public ServerConnection(Supplier<ChannelFuture> var1, OlrlOjtq var2, C0021 var3, BooleanSupplier var4, BooleanSupplier var5) {
      this.m8000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
      this.f1000[2] = var3;
      this.f1000[3] = var4;
      this.f1000[4] = var5;
   }

   static {
      ntfClinit();
   }

   private void m28000(ChannelFuture var1) {
      Channel var2 = var1.channel();
      if (!((BooleanSupplier)this.f1000[3]).getAsBoolean()) {
         if (var2 != null) {
            var2.close();
         }
      } else if (var1.isSuccess()) {
         this.m40000(var2);
      } else {
         Throwable var3 = var1.cause();
         String var4 = var3 != null && var3.getMessage() != null ? var3.getMessage() : f3000[1];
         ((Logger)f2000[0]).debug(f3000[2], var4);
         ((C0021)this.f1000[2]).m12000();
      }
   }

   public void m38000() {
      if (((BooleanSupplier)this.f1000[3]).getAsBoolean() && ((BooleanSupplier)this.f1000[4]).getAsBoolean() && !((OlrlOjtq)this.f1000[1]).m2000()) {
         ((Logger)f2000[0]).debug(f3000[0]);
         ((ChannelFuture)((Supplier)this.f1000[0]).get()).addListener(var1 -> this.m28000((ChannelFuture)var1));
      }
   }

   private void m40000(Channel var1) {
      ((Logger)f2000[0]).info(f3000[3]);
      ((OlrlOjtq)this.f1000[1]).m12000(var1);
      var1.closeFuture().addListener(var1x -> this.m46000((ChannelFuture)var1x));
   }

   private void m46000(ChannelFuture var1) {
      Throwable var2 = var1.cause();
      String var3;
      if (var2 != null) {
         ((Logger)f2000[0]).error(f3000[4], var2);
         var3 = var2.getMessage() != null ? var2.getMessage() : var2.getClass().getSimpleName();
      } else {
         ((Logger)f2000[0]).info(f3000[5]);
         var3 = f3000[6];
      }

      ((OlrlOjtq)this.f1000[1]).m8000();
      if (((BooleanSupplier)this.f1000[3]).getAsBoolean()) {
         ((Logger)f2000[0]).info(f3000[7], var3);
         ((C0021)this.f1000[2]).m12000();
      }
   }

   private static void m50000() {
      f2000 = new Object[]{null};
   }
}
