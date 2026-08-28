package rw.core;

import fun.crashsystem.jdrpc.DiscordIPC;
import fun.crashsystem.jdrpc.DiscordIPCConfig;
import fun.crashsystem.jdrpc.activity.ActivityType;
import fun.crashsystem.jdrpc.activity.Activity.Builder;
import fun.crashsystem.jdrpc.entity.DiscordBuild;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;

public class DiscordRpc {
   private static short[] f1000;
   private static String[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   private static short[] f10000;
   private static boolean[] f11000;
   public Object[] f12000;

   public void m4000() {
      if (((AtomicBoolean)this.f12000[2]).compareAndSet(f9000[6], true)) {
         ((ScheduledExecutorService)this.f12000[4]).shutdownNow();

         try {
            ((DiscordIPC)this.f12000[3]).close();
         } catch (Exception var2) {
            ((Logger)f4000[0]).warn(f7000[1], var2.getMessage());
         }
      }
   }

   private static void m8000() {
      f7000 = new String[]{"Failed to clear RPC: {}", "Failed to close Discord RPC: {}"};
      f2000 = new String[]{
         "Build: 1.21.11",
         "https://github.com/CrashSystemZ/nursultan-gif/blob/main/RPC.gif?raw=true",
         "Website",
         "https://nursultan.fun",
         "News",
         "https://t.me/nursultan_mc",
         "Failed to set RPC activity: {}",
         "DiscordActivity-Retry"
      };
   }

   public DiscordRpc() {
      this.m58000();
      AtomicBoolean var5 = new AtomicBoolean(f9000[0]);
      this.f12000[0] = var5;
      AtomicBoolean var6 = new AtomicBoolean(f9000[1]);
      this.f12000[1] = var6;
      AtomicBoolean var7 = new AtomicBoolean(f9000[2]);
      this.f12000[2] = var7;
      DiscordIPC var8 = DiscordIPC.create(
         DiscordIPCConfig.builder()
            .clientId(1228305955943612468L)
            .reconnectBaseDelayMs(30000L)
            .reconnectMaxDelayMs(30000L)
            .preferredBuilds(List.of(DiscordBuild.ANY))
            .reconnect(f9000[3])
            .build()
      );
      this.f12000[3] = var8;
      ScheduledExecutorService var9 = Executors.newSingleThreadScheduledExecutor(var0 -> {
         Thread var1 = new Thread(var0, f2000[7]);
         var1.setDaemon((boolean)1);
         return var1;
      });
      this.f12000[4] = var9;
      ((DiscordIPC)this.f12000[3]).addListener(new C1024(this));
      this.m44000();
   }

   static {
      ntfClinit();
   }

   private static void m16000() {
      f4000 = new Object[]{null, 30L, 1228305955943612468L};
   }

   private static void m26000() {
      f9000 = new boolean[]{false, false, false, true, true, false, false};
      f11000 = new boolean[]{true, false, true, false, true, false, true};
   }

   private void m28000() {
      if (!((AtomicBoolean)this.f12000[2]).get()) {
         try {
            ((ScheduledExecutorService)this.f12000[4]).schedule(this::m44000, 30L, TimeUnit.SECONDS);
         } catch (Exception var2) {
         }
      }
   }

   private static void m32000() {
      f6000 = new short[]{0, 1, 2, 3, 4};
      f5000 = new short[]{3, 0, 3, 0, 3, 3, 0, 2};
      f10000 = new short[]{4, 3, 0, 2};
      f1000 = new short[]{1, 3};
      f8000 = new short[]{2, 4, 2, 3, 2, 2, 0, 1};
      f3000 = new short[]{2};
   }

   public void m40000() {
      ((AtomicBoolean)this.f12000[0]).set(f9000[5]);
      if (((DiscordIPC)this.f12000[3]).isConnected()) {
         try {
            ((DiscordIPC)this.f12000[3]).clearActivityAsync();
         } catch (Exception var2) {
            ((Logger)f4000[0]).warn(f7000[0], var2.getMessage());
         }
      }
   }

   private void m44000() {
      if (!((AtomicBoolean)this.f12000[2]).get()) {
         if (((AtomicBoolean)this.f12000[1]).compareAndSet(false, true)) {
            ((DiscordIPC)this.f12000[3]).connectAsync().whenComplete((var1, var2) -> {
               ((AtomicBoolean)this.f12000[1]).set((boolean)0);
               if (!((AtomicBoolean)this.f12000[2]).get()) {
                  if (var2 != null) {
                     this.m28000();
                  }
               }
            });
         }
      }
   }

   public void m48000() {
      ((AtomicBoolean)this.f12000[0]).set(f9000[4]);
      if (((DiscordIPC)this.f12000[3]).isConnected()) {
         this.m62000();
      }
   }

   private void m58000() {
      if (this.f12000 == null) {
         this.f12000 = new Object[5];
         Object[] var1 = this.f12000;
      }
   }

   void m62000() {
      if (!((AtomicBoolean)this.f12000[2]).get()) {
         try {
            long var1 = (System.currentTimeMillis() - ManagementFactory.getRuntimeMXBean().getUptime()) / 1000L;
            ((DiscordIPC)this.f12000[3])
               .setActivityAsync(
                  new Builder()
                     .setType(ActivityType.PLAYING)
                     .setState("UID: " + ((C0959)NursultanClient.f13000[2]).m8000())
                     .setDetails(f2000[0])
                     .setStartTimestamp(var1)
                     .setLargeImage(f2000[1], ((C0959)NursultanClient.f13000[2]).m20000())
                     .addButton(f2000[2], f2000[3])
                     .addButton(f2000[4], f2000[5])
                     .build()
               );
         } catch (Exception var3) {
            ((Logger)f4000[0]).warn(f2000[6], var3.getMessage());
         }
      }
   }
}
