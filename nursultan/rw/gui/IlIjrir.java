package rw.gui;

import com.sun.net.httpserver.HttpServer;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.core.C0723;

public class IlIjrir implements Closeable {
   private static String[] f1000;
   private static String[] f2000;
   private static byte[] f3000;
   private static String[] f4000;
   public Object[] f5000;
   private static byte[] f6000;
   private static String[] f7000;
   private static short[] f8000;
   private static byte[] f9000;
   private static int[] f10000;
   private static short[] f11000;
   private static byte[] f12000;
   private static short[] f13000;
   private static boolean[] f14000;
   private static int[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static String[] f18000;
   private static byte[] f19000;
   private static short[] f20000;
   private static boolean[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static String[] f24000;
   private static byte[] f25000;
   public static Object[] f26000;

   public CompletableFuture<String> m6000() {
      return (CompletableFuture<String>)this.f5000[f16000[4]];
   }

   private static void m12000() {
      boolean[] var128 = new boolean[7];
      f14000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f14000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f14000[2] = (boolean)((0 | -0) >>> 31);
      f14000[3] = (boolean)((0 | -0) >>> 31);
      f14000[4] = (boolean)((0 | -0) >>> 31);
      f14000[5] = (boolean)((1 | -1) >>> 31);
      f14000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f21000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f21000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f21000[2] = (boolean)((0 | -0) >>> 31);
      f21000[3] = (boolean)((0 | -0) >>> 31);
      f21000[4] = (boolean)((1 | -1) >>> 31);
   }

   public IlIjrir() {
      this.m72000();
      CompletableFuture var9 = new CompletableFuture();
      this.f5000[f16000[0]] = var9;

      try {
         HttpServer var10 = HttpServer.create();
         this.f5000[f16000[1]] = var10;
         SecureRandom var1 = SecureRandom.getInstanceStrong();
         int var2 = var1.nextInt(f9000[0], f16000[2]);
         StringBuilder var3 = new StringBuilder(var2);

         for (int var4 = f14000[0]; var4 < var2; var4++) {
            var3.append(f1000[0].charAt(var1.nextInt(f1000[1].length())));
         }

         String var11 = var3.toString();
         this.f5000[f16000[3]] = var11;
      } catch (Throwable var12) {
         throw new C0723(f1000[2], f1000[3], var12);
      }
   }

   static {
      ntfClinit();
   }

   private static void m20000() {
      f26000 = new Object[f3000[4]];
      f26000[f21000[4]] = f2000[4];
      f26000[f3000[5]] = f2000[5];
      f26000[f3000[6]] = f2000[6];
      f26000[f3000[7]] = f2000[7];
   }

   private static void m24000() {
      short[] var128 = new short[6];
      f16000[(0 | -0) >>> 31] = 2;
      f16000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f16000[2] = 128;
      f16000[3] = (short)((1 | -1) >>> 31);
      f16000[4] = 2;
      f16000[5] = 3;
      short[] var129 = new short[3];
      f17000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f17000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f17000[2] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[5];
      f13000[(0 | -0) >>> 31] = 2;
      f13000[(1 | -1) >>> 31] = 2;
      f13000[2] = 4;
      f13000[3] = 2;
      f13000[4] = (short)((1 | -1) >>> 31);
      short[] var131 = new short[5];
      f8000[(0 | -0) >>> 31] = 2;
      f8000[(1 | -1) >>> 31] = 2;
      f8000[2] = (short)((0 | -0) >>> 31);
      f8000[3] = (short)((0 | -0) >>> 31);
      f8000[4] = 3;
      short[] var132 = new short[3];
      f11000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f11000[(1 | -1) >>> 31] = 4;
      f11000[2] = 4;
      short[] var133 = new short[2];
      f20000[(0 | -0) >>> 31] = 200;
      f20000[(1 | -1) >>> 31] = 2;
      short[] var134 = new short[8];
      f23000[(0 | -0) >>> 31] = 1234;
      f23000[(1 | -1) >>> 31] = 1235;
      f23000[2] = 1236;
      f23000[3] = 1237;
      f23000[4] = 8080;
      f23000[5] = 19364;
      f23000[6] = 19365;
      f23000[7] = 19366;
      short[] var135 = new short[5];
      f22000[(0 | -0) >>> 31] = 27930;
      f22000[(1 | -1) >>> 31] = 27931;
      f22000[2] = 27932;
      f22000[3] = 27933;
      f22000[4] = 27934;
   }

   private static void m28000() {
      f1000 = new String[4];
      f1000[(0 | -0) >>> 31] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
      f1000[(1 | -1) >>> 31] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
      f1000[2] = "account.modal.microsoft.error.generic";
      f1000[3] = "Unable to create auth server.";
      f7000 = new String[7];
      f7000[(0 | -0) >>> 31] = "/";
      f7000[(1 | -1) >>> 31] = "account.modal.microsoft.error.generic";
      f7000[2] = "Empty redirect query.";
      f7000[3] = "access_denied";
      f7000[4] = "account.modal.microsoft.error.cancelled";
      f7000[5] = "User cancelled.";
      f7000[6] = "account.modal.microsoft.error.generic";
      f4000 = new String[2];
      f4000[(0 | -0) >>> 31] = "Malformed redirect.";
      f4000[(1 | -1) >>> 31] = "account.modal.microsoft.error.generic";
      f24000 = new String[2];
      f24000[(0 | -0) >>> 31] = "State mismatch.";
      f24000[(1 | -1) >>> 31] = "localhost";
      f18000 = new String[2];
      f18000[(0 | -0) >>> 31] = "account.modal.microsoft.error.generic";
      f18000[(1 | -1) >>> 31] = "Unable to bind any port.";
      f2000 = new String[8];
      f2000[(0 | -0) >>> 31] = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Nursultan</title>\n</head>\n<body style=\"margin:0;height:100vh;display:flex;flex-direction:column;align-items:center;justify-content:center;text-align:center;background:#111;color:#eee;font-family:sans-serif\">\n    <h1 style=\"margin:0 0 12px;font-size:28px\">&#10003; Signed in to Microsoft</h1>\n    <p style=\"margin:0;color:#aaa;font-size:16px\">Your account is now signed in.<br>\n    You can close this tab and return to Minecraft.</p>\n</body>\n</html>\n";
      f2000[(1 | -1) >>> 31] = "Content-Type";
      f2000[2] = "text/html; charset=UTF-8";
      f2000[3] = "code=([^&]*)&state=([^&]*)";
      f2000[4] = "/in_game_account_switcher_long_enough_uri_to_prevent_accidental_leaks_on_screensharing_even_if_you_have_like_extremely_big_screen_though_it_might_not_mork_but_we_will_try_it_anyway_to_prevent_funny_things_from_happening_or_something";
      f2000[5] = "https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&prompt=select_account";
      f2000[6] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.-_";
      f2000[7] = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Nursultan</title>\n</head>\n<body style=\"margin:0;height:100vh;display:flex;flex-direction:column;align-items:center;justify-content:center;text-align:center;background:#111;color:#eee;font-family:sans-serif\">\n    <h1 style=\"margin:0 0 12px;font-size:28px\">&#10003; Signed in to Microsoft</h1>\n    <p style=\"margin:0;color:#aaa;font-size:16px\">Your account is now signed in.<br>\n    You can close this tab and return to Minecraft.</p>\n</body>\n</html>\n";
   }

   private static void m50000() {
      int[] var128 = new int[8];
      f15000[(0 | -0) >>> 31] = 59125;
      f15000[(1 | -1) >>> 31] = 59126;
      f15000[2] = 59127;
      f15000[3] = 59128;
      f15000[4] = 59129;
      f15000[5] = 59130;
      f15000[6] = 59131;
      f15000[7] = 59132;
      int[] var129 = new int[4];
      f10000[(0 | -0) >>> 31] = 59133;
      f10000[(1 | -1) >>> 31] = 59134;
      f10000[2] = 59135;
      f10000[3] = 42069;
   }

   public void m54000() {
      ((HttpServer)this.f5000[f11000[0]]).stop(f14000[4]);
   }

   private void m56000() {
      IOException var1 = null;
      int[] var2 = (int[])f26000[f8000[2]];
      int var3 = var2.length;

      for (int var4 = f14000[2]; var4 < var3; var4++) {
         int var5 = var2[var4];

         try {
            ((HttpServer)this.f5000[f8000[3]]).bind(new InetSocketAddress(f24000[1], var5), f14000[3]);
            Integer var11 = var5;
            this.f5000[f8000[4]] = var11;
            return;
         } catch (IOException var12) {
            var1 = var12;
         }
      }

      throw new C0723(f18000[0], f18000[1], var1);
   }

   public void m60000() {
      this.m56000();
      ((HttpServer)this.f5000[f17000[1]]).createContext(f7000[0], var1 -> {
         try {
            if ((Boolean)this.f5000[f11000[1]] || !var1.getRemoteAddress().getAddress().isLoopbackAddress()) {
               var1.close();
               return;
            }

            Boolean var11 = f14000[5];
            this.f5000[f11000[2]] = var11;
            String var2 = var1.getRequestURI().getQuery();
            byte[] var3 = f2000[0].getBytes(StandardCharsets.UTF_8);
            var1.getResponseHeaders().add(f2000[1], f2000[2]);
            var1.sendResponseHeaders(f20000[0], var3.length);

            try (OutputStream var4 = var1.getResponseBody()) {
               var4.write(var3);
            }

            var1.close();
            this.m90000(var2);
         } catch (Throwable var14) {
            var1.close();
            ((CompletableFuture)this.f5000[f20000[1]]).completeExceptionally(var14);
         }
      });
      ((HttpServer)this.f5000[f17000[2]]).start();
   }

   public String m68000() {
      return "http://localhost:"
         + (Integer)this.f5000[f16000[5]]
         + "/in_game_account_switcher_long_enough_uri_to_prevent_accidental_leaks_on_screensharing_even_if_you_have_like_extremely_big_screen_though_it_might_not_mork_but_we_will_try_it_anyway_to_prevent_funny_things_from_happening_or_something";
   }

   private void m72000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f3000[1]];
         Object[] var1 = this.f5000;
         var1[f3000[2]] = Integer.valueOf(f21000[2]);
         var1[f3000[3]] = f21000[3];
      }
   }

   public String m76000() {
      return "https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&prompt=select_account&redirect_uri="
         + URI.create(this.m68000())
         + "&state="
         + (String)this.f5000[f17000[0]];
   }

   private static void m86000() {
      byte[] var128 = new byte[8];
      f9000[(0 | -0) >>> 31] = 96;
      f9000[(1 | -1) >>> 31] = 2;
      f9000[2] = 26;
      f9000[3] = 2;
      f9000[4] = 3;
      f9000[5] = 4;
      f9000[6] = 5;
      f9000[7] = 6;
      byte[] var129 = new byte[5];
      f25000[(0 | -0) >>> 31] = 7;
      f25000[(1 | -1) >>> 31] = 8;
      f25000[2] = 9;
      f25000[3] = 10;
      f25000[4] = 11;
      byte[] var130 = new byte[4];
      f6000[(0 | -0) >>> 31] = 12;
      f6000[(1 | -1) >>> 31] = 13;
      f6000[2] = 14;
      f6000[3] = 15;
      byte[] var131 = new byte[5];
      f12000[(0 | -0) >>> 31] = 80;
      f12000[(1 | -1) >>> 31] = 16;
      f12000[2] = 17;
      f12000[3] = 18;
      f12000[4] = 19;
      byte[] var132 = new byte[6];
      f19000[(0 | -0) >>> 31] = 20;
      f19000[(1 | -1) >>> 31] = 21;
      f19000[2] = 22;
      f19000[3] = 23;
      f19000[4] = 24;
      f19000[5] = 25;
      byte[] var133 = new byte[8];
      f3000[(0 | -0) >>> 31] = 4;
      f3000[(1 | -1) >>> 31] = 5;
      f3000[2] = 3;
      f3000[3] = 4;
      f3000[4] = 6;
      f3000[5] = 2;
      f3000[6] = 3;
      f3000[7] = 5;
   }

   private void m90000(String var1) {
      if (var1 == null) {
         ((CompletableFuture)this.f5000[f13000[0]]).completeExceptionally(new C0723(f7000[1], f7000[2]));
      } else if (var1.toLowerCase(Locale.ROOT).contains(f7000[3])) {
         ((CompletableFuture)this.f5000[f13000[1]]).completeExceptionally(new C0723(f7000[4], f7000[5]));
      } else {
         Matcher var2 = ((Pattern)f26000[f13000[2]]).matcher(var1);
         if (!var2.find()) {
            ((CompletableFuture)this.f5000[f13000[3]]).completeExceptionally(new C0723(f7000[6], f4000[0]));
         } else if (!((String)this.f5000[f13000[4]]).equals(var2.group(f9000[1]))) {
            ((CompletableFuture)this.f5000[f8000[0]]).completeExceptionally(new C0723(f4000[1], f24000[0]));
         } else {
            ((CompletableFuture)this.f5000[f8000[1]]).complete(var2.group(f14000[1]));
         }
      }
   }
}
