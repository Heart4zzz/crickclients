package rw.core;

import fun.crashsystem.jdrpc.entity.User;
import fun.crashsystem.jdrpc.event.DiscordEventListener;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;

public class C1024 implements DiscordEventListener {
   public Object[] f1000;
   private static String[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f4000[0]];
         Object[] var1 = this.f1000;
      }
   }

   public C1024(DiscordRpc var1) {
      this.m4000();
      this.f1000[f3000[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new String[]{"Discord onReady handler failed: {}", "Discord RPC disconnected: {} (code {})", "Discord RPC error: {} (code {})"};
   }

   private static void m10000() {
      f3000 = new short[]{0, 2, 0, 0, 0, 0, 0, 0};
   }

   private static void m16000() {
      f4000 = new boolean[]{true};
   }

   public void onDisconnect(int var1, String var2) {
      ((Logger)DiscordRpc.f4000[f3000[6]]).info(f2000[1], var2, var1);
   }

   public void onError(int var1, String var2) {
      ((Logger)DiscordRpc.f4000[f3000[7]]).warn(f2000[2], var2, var1);
   }

   public void onReady(User var1) {
      try {
         ((C0959)NursultanClient.f13000[f3000[1]]).m52000(var1);
         if (((AtomicBoolean)((DiscordRpc)this.f1000[f3000[2]]).f12000[f3000[3]]).get()) {
            ((DiscordRpc)this.f1000[f3000[4]]).m62000();
         }
      } catch (Exception var3) {
         ((Logger)DiscordRpc.f4000[f3000[5]]).warn(f2000[0], var3.getMessage());
      }
   }
}
