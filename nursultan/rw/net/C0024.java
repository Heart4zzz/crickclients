package rw.net;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;

public class C0024 {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[4];
         Object[] var1 = this.f1000;
      }
   }

   public C0024(OlrlOjtq var1, C0021 var2, C0026 var3, AtomicBoolean var4) {
      this.m4000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
      this.f1000[2] = var3;
      this.f1000[3] = var4;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[]{null};
   }

   private static void m10000() {
      f3000 = new String[]{"Error during shutdown"};
   }

   public CompletableFuture<Void> m18000() {
      ((AtomicBoolean)this.f1000[3]).set((boolean)0);
      ((C0021)this.f1000[1]).m16000();
      Channel var1 = ((OlrlOjtq)this.f1000[0]).m16000();
      ((OlrlOjtq)this.f1000[0]).m8000();
      CompletableFuture var2 = new CompletableFuture();
      if (var1 == null) {
         this.m26000(var2);
         return var2;
      } else {
         ChannelFuture var3 = var1.isOpen() ? var1.close() : var1.newSucceededFuture();
         var3.addListener(var2x -> this.m26000(var2));
         return var2;
      }
   }

   private void m26000(CompletableFuture<Void> var1) {
      ((C0026)this.f1000[2]).m38000().whenComplete((var1x, var2) -> {
         if (var2 == null) {
            var1.complete(null);
         } else {
            var1.completeExceptionally(var2);
         }
      });
   }

   public void m32000() {
      try {
         this.m18000().join();
      } catch (CompletionException var2) {
         ((Logger)f2000[0]).error(f3000[0], var2.getCause());
      }
   }
}
