package rw.setting;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.ConnectException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.channels.UnresolvedAddressException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.UUID;
import rw.core.C0723;
import rw.data.Rec0173;
import rw.data.Rec0224;
import rw.data.Rec0243;

public class C0084 {
   public static Object[] f1000;
   private static boolean[] f2000;
   private static String[] f3000;
   private static String[] f4000;
   private static short[] f5000;
   private static String[] f6000;
   private static String[] f7000;
   private static byte[] f8000;
   private static String[] f9000;
   public static Object[] f10000;
   private static byte[] f11000;
   private static String[] f12000;
   private static byte[] f13000;
   private static String[] f14000;
   public static Object[] f15000;
   private static String[] f16000;
   private static String[] f17000;
   private static String[] f18000;
   public static Object[] f19000;
   private static String[] f20000;
   private static long[] f21000;
   private static short[] f22000;
   private static String[] f23000;
   private static String[] f24000;
   private static String[] f25000;
   public static Object[] f26000;
   private static boolean[] f27000;
   private static String[] f28000;
   private static String[] f29000;
   private static byte[] f30000;

   private static JsonObject m2000(String var0) {
      return JsonParser.parseString(var0).getAsJsonObject();
   }

   private static HttpResponse<String> m8000(String var0, String var1) {
      return m90000(var0, var1, f14000[4]);
   }

   private static void m10000() {
      long[] var128 = new long[7];
      f21000[(0 | -0) >>> 31] = 0L;
      f21000[(1 | -1) >>> 31] = 2148916233L;
      f21000[2] = 2148916235L;
      f21000[3] = 2148916236L;
      f21000[4] = 2148916237L;
      f21000[5] = 2148916238L;
      f21000[6] = 20L;
   }

   private C0084() {
      throw new UnsupportedOperationException(f7000[5]);
   }

   static {
      ntfClinit();
   }

   private static void m32000() {
      f9000 = new String[2];
      f9000[(0 | -0) >>> 31] = "https://login.live.com/oauth20_token.srf";
      f9000[(1 | -1) >>> 31] = "account.modal.microsoft.error.generic";
      f3000 = new String[5];
      f3000[(0 | -0) >>> 31] = "https://login.live.com/oauth20_token.srf";
      f3000[(1 | -1) >>> 31] = "account.modal.microsoft.error.generic";
      f3000[2] = "id";
      f3000[3] = "name";
      f3000[4] = "AuthMethod";
      f20000 = new String[8];
      f20000[(0 | -0) >>> 31] = "RPS";
      f20000[(1 | -1) >>> 31] = "SiteName";
      f20000[2] = "user.auth.xboxlive.com";
      f20000[3] = "RpsTicket";
      f20000[4] = "Properties";
      f20000[5] = "RelyingParty";
      f20000[6] = "http://auth.xboxlive.com";
      f20000[7] = "TokenType";
      f18000 = new String[3];
      f18000[(0 | -0) >>> 31] = "JWT";
      f18000[(1 | -1) >>> 31] = "https://user.auth.xboxlive.com/user/authenticate";
      f18000[2] = "account.modal.microsoft.error.generic";
      f23000 = new String[7];
      f23000[(0 | -0) >>> 31] = "UserTokens";
      f23000[(1 | -1) >>> 31] = "SandboxId";
      f23000[2] = "RETAIL";
      f23000[3] = "Properties";
      f23000[4] = "RelyingParty";
      f23000[5] = "rp://api.minecraftservices.com/";
      f23000[6] = "TokenType";
      f28000 = new String[7];
      f28000[(0 | -0) >>> 31] = "JWT";
      f28000[(1 | -1) >>> 31] = "https://xsts.auth.xboxlive.com/xsts/authorize";
      f28000[2] = "XErr";
      f28000[3] = "XErr";
      f28000[4] = "account.modal.microsoft.error.no-xbox";
      f28000[5] = "No Xbox profile linked.";
      f28000[6] = "account.modal.microsoft.error.xbox-region";
      f16000 = new String[4];
      f16000[(0 | -0) >>> 31] = "Xbox Live not available in region.";
      f16000[(1 | -1) >>> 31] = "account.modal.microsoft.error.xbox-adult";
      f16000[2] = "Adult verification required.";
      f16000[3] = "account.modal.microsoft.error.generic";
      f24000 = new String[7];
      f24000[(0 | -0) >>> 31] = "account.modal.microsoft.error.generic";
      f24000[(1 | -1) >>> 31] = "identityToken";
      f24000[2] = "https://api.minecraftservices.com/authentication/login_with_xbox";
      f24000[3] = "account.modal.microsoft.error.generic";
      f24000[4] = "access_token";
      f24000[5] = "https://api.minecraftservices.com/minecraft/profile";
      f24000[6] = "User-Agent";
      f25000 = new String[2];
      f25000[(0 | -0) >>> 31] = "Nursultan/1.0 (Minecraft client)";
      f25000[(1 | -1) >>> 31] = "Authorization";
      f4000 = new String[7];
      f4000[(0 | -0) >>> 31] = "account.modal.microsoft.error.no-minecraft";
      f4000[(1 | -1) >>> 31] = "Account does not own Minecraft.";
      f4000[2] = "account.modal.microsoft.error.generic";
      f4000[3] = "access_token";
      f4000[4] = "refresh_token";
      f4000[5] = "Token";
      f4000[6] = "DisplayClaims";
      f14000 = new String[6];
      f14000[(0 | -0) >>> 31] = "xui";
      f14000[(1 | -1) >>> 31] = "uhs";
      f14000[2] = "xid";
      f14000[3] = "xid";
      f14000[4] = "application/x-www-form-urlencoded";
      f14000[5] = "application/json";
      f29000 = new String[6];
      f29000[(0 | -0) >>> 31] = "User-Agent";
      f29000[(1 | -1) >>> 31] = "Nursultan/1.0 (Minecraft client)";
      f29000[2] = "Accept";
      f29000[3] = "application/json";
      f29000[4] = "Content-Type";
      f29000[5] = "account.modal.microsoft.error.connect";
      f7000 = new String[7];
      f7000[(0 | -0) >>> 31] = "Unable to reach Microsoft servers.";
      f7000[(1 | -1) >>> 31] = "account.modal.microsoft.error.generic";
      f7000[2] = "Microsoft request failed.";
      f7000[3] = "account.modal.microsoft.error.generic";
      f7000[4] = "-";
      f7000[5] = "This is a utility class and cannot be instantiated";
      f7000[6] = "54fd49e4-2103-4044-9603-2b028c814ec3";
      f6000 = new String[3];
      f6000[(0 | -0) >>> 31] = "XboxLive.signin%20XboxLive.offline_access";
      f6000[(1 | -1) >>> 31] = "account.modal.microsoft.error.connect";
      f6000[2] = "account.modal.microsoft.error.generic";
      f12000 = new String[4];
      f12000[(0 | -0) >>> 31] = "account.modal.microsoft.error.no-minecraft";
      f12000[(1 | -1) >>> 31] = "account.modal.microsoft.error.no-xbox";
      f12000[2] = "account.modal.microsoft.error.xbox-region";
      f12000[3] = "account.modal.microsoft.error.xbox-adult";
      f17000 = new String[6];
      f17000[(0 | -0) >>> 31] = "Nursultan/1.0 (Minecraft client)";
      f17000[(1 | -1) >>> 31] = "https://login.live.com/oauth20_token.srf";
      f17000[2] = "https://user.auth.xboxlive.com/user/authenticate";
      f17000[3] = "https://xsts.auth.xboxlive.com/xsts/authorize";
      f17000[4] = "https://api.minecraftservices.com/authentication/login_with_xbox";
      f17000[5] = "https://api.minecraftservices.com/minecraft/profile";
   }

   private static JsonObject m38000(String var0) {
      HttpResponse var1;
      try {
         var1 = ((HttpClient)f19000[f5000[2]])
            .send(
               HttpRequest.newBuilder(URI.create(f24000[5]))
                  .header(f24000[6], f25000[0])
                  .header(f25000[1], "Bearer " + var0)
                  .timeout((Duration)f1000[f5000[3]])
                  .GET()
                  .build(),
               BodyHandlers.ofString()
            );
      } catch (Throwable var3) {
         throw m104000(var3);
      }

      if (var1.statusCode() == f5000[4]) {
         throw new C0723(f4000[0], f4000[1]);
      } else if (var1.statusCode() != f5000[5]) {
         throw new C0723(f4000[2], "Profile request failed: " + var1.statusCode());
      } else {
         return m2000((String)var1.body());
      }
   }

   private static Rec0243 m42000(String var0) {
      JsonArray var1 = new JsonArray();
      var1.add(var0);
      JsonObject var2 = new JsonObject();
      var2.add(f23000[0], var1);
      var2.addProperty(f23000[1], f23000[2]);
      JsonObject var3 = new JsonObject();
      var3.add(f23000[3], var2);
      var3.addProperty(f23000[4], f23000[5]);
      var3.addProperty(f23000[6], f28000[0]);
      HttpResponse var4 = m74000(f28000[1], var3.toString());
      if (var4.statusCode() == f22000[3]) {
         JsonObject var5 = m2000((String)var4.body());
         long var6 = var5.has(f28000[2]) ? var5.get(f28000[3]).getAsLong() : f21000[0];
         if (var6 == f21000[1]) {
            throw new C0723(f28000[4], f28000[5]);
         } else if (var6 == f21000[2]) {
            throw new C0723(f28000[6], f16000[0]);
         } else if (var6 != f21000[3] && var6 != f21000[4] && var6 != f21000[5]) {
            throw new C0723(f16000[3], "XSTS denied: " + var6);
         } else {
            throw new C0723(f16000[1], f16000[2]);
         }
      } else if (var4.statusCode() != f5000[0]) {
         throw new C0723(f24000[0], "XSTS request failed: " + var4.statusCode());
      } else {
         return m80000(m2000((String)var4.body()));
      }
   }

   private static String m66000(String var0, String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty(f24000[1], "XBL3.0 x=" + var1 + ";" + var0);
      HttpResponse var3 = m74000(f24000[2], var2.toString());
      if (var3.statusCode() != f5000[1]) {
         throw new C0723(f24000[3], "MCA request failed: " + var3.statusCode());
      } else {
         return m102000(m2000((String)var3.body()), f24000[4]);
      }
   }

   private static void m70000() {
      byte[] var128 = new byte[3];
      f11000[(0 | -0) >>> 31] = 8;
      f11000[(1 | -1) >>> 31] = 8;
      f11000[2] = 12;
      byte[] var129 = new byte[4];
      f8000[(0 | -0) >>> 31] = 12;
      f8000[(1 | -1) >>> 31] = 16;
      f8000[2] = 16;
      f8000[3] = 20;
      byte[] var130 = new byte[8];
      f13000[(0 | -0) >>> 31] = 20;
      f13000[(1 | -1) >>> 31] = 32;
      f13000[2] = 2;
      f13000[3] = 2;
      f13000[4] = 2;
      f13000[5] = 3;
      f13000[6] = 2;
      f13000[7] = 2;
      byte[] var131 = new byte[7];
      f30000[(0 | -0) >>> 31] = 3;
      f30000[(1 | -1) >>> 31] = 2;
      f30000[2] = 6;
      f30000[3] = 3;
      f30000[4] = 4;
      f30000[5] = 5;
      f30000[6] = 3;
   }

   private static UUID m72000(String var0) {
      if (var0.contains(f7000[4])) {
         return UUID.fromString(var0);
      } else {
         String var1 = var0.substring(f27000[1], f11000[0])
            + "-"
            + var0.substring(f11000[1], f11000[2])
            + "-"
            + var0.substring(f8000[0], f8000[1])
            + "-"
            + var0.substring(f8000[2], f8000[3])
            + "-"
            + var0.substring(f13000[0], f13000[1]);
         return UUID.fromString(var1);
      }
   }

   private static HttpResponse<String> m74000(String var0, String var1) {
      return m90000(var0, var1, f14000[5]);
   }

   private static Rec0243 m80000(JsonObject var0) {
      String var1 = m102000(var0, f4000[5]);
      JsonObject var2 = var0.getAsJsonObject(f4000[6]);
      JsonObject var3 = var2.getAsJsonArray(f14000[0]).get(f27000[0]).getAsJsonObject();
      String var4 = var3.get(f14000[1]).getAsString();
      String var5 = var3.has(f14000[2]) ? var3.get(f14000[3]).getAsString() : null;
      return new Rec0243(var1, var4, var5);
   }

   private static void m82000() {
      boolean[] var128 = new boolean[8];
      f27000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f27000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f27000[2] = (boolean)((0 | -0) >>> 31);
      f27000[3] = (boolean)((1 | -1) >>> 31);
      f27000[4] = (boolean)((0 | -0) >>> 31);
      f27000[5] = (boolean)((1 | -1) >>> 31);
      f27000[6] = (boolean)((0 | -0) >>> 31);
      f27000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[4];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[2] = (boolean)((0 | -0) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
   }

   public static Rec0173 m86000(String var0, String var1) {
      String var2 = "client_id=54fd49e4-2103-4044-9603-2b028c814ec3&code="
         + URLEncoder.encode(var0, StandardCharsets.UTF_8)
         + "&grant_type=authorization_code&redirect_uri="
         + URLEncoder.encode(var1, StandardCharsets.UTF_8)
         + "&scope=XboxLive.signin%20XboxLive.offline_access";
      HttpResponse var3 = m8000(f9000[0], var2);
      if (var3.statusCode() != f22000[0]) {
         throw new C0723(f9000[1], "Code exchange failed: " + var3.statusCode());
      } else {
         return m98000(m2000((String)var3.body()));
      }
   }

   private static void m88000() {
      short[] var128 = new short[4];
      f22000[(0 | -0) >>> 31] = 200;
      f22000[(1 | -1) >>> 31] = 200;
      f22000[2] = 200;
      f22000[3] = 401;
      short[] var129 = new short[8];
      f5000[(0 | -0) >>> 31] = 200;
      f5000[(1 | -1) >>> 31] = 200;
      f5000[2] = 2;
      f5000[3] = 2;
      f5000[4] = 404;
      f5000[5] = 200;
      f5000[6] = 2;
      f5000[7] = 2;
   }

   private static HttpResponse<String> m90000(String var0, String var1, String var2) {
      try {
         return ((HttpClient)f19000[f5000[6]])
            .send(
               HttpRequest.newBuilder(URI.create(var0))
                  .header(f29000[0], f29000[1])
                  .header(f29000[2], f29000[3])
                  .header(f29000[4], var2)
                  .timeout((Duration)f1000[f5000[7]])
                  .POST(BodyPublishers.ofString(var1))
                  .build(),
               BodyHandlers.ofString()
            );
      } catch (Throwable var4) {
         throw m104000(var4);
      }
   }

   public static Rec0224 m92000(Rec0173 var0) {
      Rec0243 var1 = m118000(var0.m6000());
      Rec0243 var2 = m42000(var1.m6000());
      String var3 = m66000(var2.m6000(), var2.m8000());
      JsonObject var4 = m38000(var3);
      UUID var5 = m72000(m102000(var4, f3000[2]));
      String var6 = m102000(var4, f3000[3]);
      return new Rec0224(var5, var6, var3, var0.m4000(), var2.m2000());
   }

   private static Rec0173 m98000(JsonObject var0) {
      return new Rec0173(m102000(var0, f4000[3]), m102000(var0, f4000[4]));
   }

   public static Rec0173 m100000(String var0) {
      String var1 = "client_id=54fd49e4-2103-4044-9603-2b028c814ec3&refresh_token="
         + URLEncoder.encode(var0, StandardCharsets.UTF_8)
         + "&grant_type=refresh_token&scope=XboxLive.signin%20XboxLive.offline_access";
      HttpResponse var2 = m8000(f3000[0], var1);
      if (var2.statusCode() != f22000[1]) {
         throw new C0723(f3000[1], "Refresh failed: " + var2.statusCode());
      } else {
         return m98000(m2000((String)var2.body()));
      }
   }

   private static String m102000(JsonObject var0, String var1) {
      if (var0.has(var1) && !var0.get(var1).isJsonNull()) {
         return var0.get(var1).getAsString();
      } else {
         throw new C0723(f7000[3], "Missing field: " + var1);
      }
   }

   private static C0723 m104000(Throwable var0) {
      return !(var0 instanceof UnresolvedAddressException) && !(var0 instanceof HttpTimeoutException) && !(var0 instanceof ConnectException)
         ? new C0723(f7000[1], f7000[2], var0)
         : new C0723(f29000[5], f7000[0], var0);
   }

   private static void m112000() {
      f26000 = new Object[f13000[5]];
      f26000[f27000[3]] = f7000[6];
      f26000[f13000[6]] = f6000[(0 | -0) >>> 31];
      f15000 = new Object[f13000[7]];
      f15000[f27000[4]] = f6000[(1 | -1) >>> 31];
      f15000[f27000[5]] = f6000[2];
      f10000 = new Object[f30000[(0 | -0) >>> 31]];
      f10000[f27000[6]] = f12000[(0 | -0) >>> 31];
      f10000[f27000[7]] = f12000[(1 | -1) >>> 31];
      f10000[f30000[(1 | -1) >>> 31]] = f12000[2];
      f1000 = new Object[f30000[2]];
      f1000[f2000[(0 | -0) >>> 31]] = f12000[3];
      f1000[f2000[(1 | -1) >>> 31]] = f17000[(0 | -0) >>> 31];
      f1000[f30000[3]] = f17000[(1 | -1) >>> 31];
      f1000[f30000[4]] = f17000[2];
      f1000[f30000[5]] = f17000[3];
      f19000 = new Object[f30000[6]];
      f19000[f2000[2]] = f17000[4];
      f19000[f2000[3]] = f17000[5];
   }

   private static Rec0243 m118000(String var0) {
      JsonObject var1 = new JsonObject();
      var1.addProperty(f3000[4], f20000[0]);
      var1.addProperty(f20000[1], f20000[2]);
      var1.addProperty(f20000[3], "d=" + var0);
      JsonObject var2 = new JsonObject();
      var2.add(f20000[4], var1);
      var2.addProperty(f20000[5], f20000[6]);
      var2.addProperty(f20000[7], f18000[0]);
      HttpResponse var3 = m74000(f18000[1], var2.toString());
      if (var3.statusCode() != f22000[2]) {
         throw new C0723(f18000[2], "XBL request failed: " + var3.statusCode());
      } else {
         return m80000(m2000((String)var3.body()));
      }
   }
}
