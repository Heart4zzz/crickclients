package rw.net;

import io.netty.channel.EventLoopGroup;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.Logger;

public class C0021 {
   public static Object[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static String[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   public Object[] f8000;
   private static short[] f9000;
   private static short[] f10000;

   public ScheduledFuture<?> m4000() {
      return (ScheduledFuture<?>)this.f8000[5];
   }

   public AtomicBoolean m6000() {
      return (AtomicBoolean)this.f8000[0];
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void m8000() {
      boolean var9 = false /* VF: Semaphore variable */;

      try {
         var9 = true;
         if (((BooleanSupplier)this.f8000[2]).getAsBoolean()) {
            ((Runnable)this.f8000[3]).run();
            var9 = false;
         } else {
            var9 = false;
         }
      } finally {
         if (var9) {
            ((AtomicBoolean)this.f8000[0]).set((boolean)0);
            Object var7 = null;
            this.f8000[5] = var7;
         }
      }

      ((AtomicBoolean)this.f8000[0]).set((boolean)0);
      Object var6 = null;
      this.f8000[5] = var6;
   }

   private static void m10000() {
      f10000 = new short[]{2, 0, 1, 0};
      f4000 = new short[]{4, 5, 0};
      f2000 = new short[]{5, 0, 0, 5};
      f3000 = new short[]{5, 5, 5, 5, 5, 0};
      f6000 = new short[]{0, 2, 3, 0, 5, 0, 5, 0};
      f7000 = new short[]{1, 2, 3};
      f9000 = new short[]{4, 0, 1, 2, 3, 4, 5};
   }

   public C0021(Supplier<EventLoopGroup> var1, BooleanSupplier var2, Runnable var3, long var4) {
      this.m24000();
      AtomicBoolean var10 = new AtomicBoolean(false);
      this.f8000[0] = var10;
      this.f8000[f7000[0]] = var1;
      this.f8000[f7000[1]] = var2;
      this.f8000[f7000[2]] = var3;
      Long var14 = var4;
      this.f8000[4] = var14;
   }

   static {
      ntfClinit();
   }

   public boolean m12000() {
      if (((BooleanSupplier)this.f8000[2]).getAsBoolean() && ((AtomicBoolean)this.f8000[0]).compareAndSet(false, true)) {
         EventLoopGroup var1 = (EventLoopGroup)((Supplier)this.f8000[1]).get();
         if (var1 != null && !var1.isShuttingDown() && !var1.isShutdown()) {
            try {
               io.netty.util.concurrent.ScheduledFuture var7 = var1.schedule(this::m8000, (Long)this.f8000[4], TimeUnit.MILLISECONDS);
               this.f8000[5] = var7;
               return (boolean)1;
            } catch (RejectedExecutionException var10) {
               ((AtomicBoolean)this.f8000[0]).set((boolean)0);
               Object var8 = null;
               this.f8000[5] = var8;
               ((Logger)f1000[0]).warn(f5000[0], var10);
               return (boolean)0;
            } catch (RuntimeException var11) {
               ((AtomicBoolean)this.f8000[0]).set((boolean)0);
               Object var9 = null;
               this.f8000[5] = var9;
               throw var11;
            }
         } else {
            ((AtomicBoolean)this.f8000[0]).set((boolean)0);
            return (boolean)0;
         }
      } else {
         return (boolean)0;
      }
   }

   public Supplier<EventLoopGroup> m14000() {
      return (Supplier<EventLoopGroup>)this.f8000[1];
   }

   public void m16000() {
      if ((ScheduledFuture)this.f8000[5] != null && !((ScheduledFuture)this.f8000[5]).isCancelled() && !((ScheduledFuture)this.f8000[5]).isDone()) {
         ((ScheduledFuture)this.f8000[5]).cancel((boolean)0);
         Object var5 = null;
         this.f8000[5] = var5;
      }

      ((AtomicBoolean)this.f8000[0]).set((boolean)0);
   }

   private void m24000() {
      if (this.f8000 == null) {
         this.f8000 = new Object[6];
         Object[] var1 = this.f8000;
         var1[4] = 0L;
      }
   }

   private static void m26000() {
      f1000 = new Object[]{null};
   }

   public Runnable m30000() {
      return (Runnable)this.f8000[3];
   }

   public boolean m34000() {
      return ((AtomicBoolean)this.f8000[0]).get();
   }

   private static void m36000() {
      f5000 = new String[]{"Reconnect rejected by event loop"};
   }

   public BooleanSupplier m38000() {
      return (BooleanSupplier)this.f8000[2];
   }

   public long m48000() {
      return (Long)this.f8000[4];
   }
}
