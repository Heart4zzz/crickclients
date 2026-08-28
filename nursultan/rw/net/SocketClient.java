package rw.net;

import java.lang.runtime.ObjectMethods;
import java.net.URI;

public record SocketClient() {
   public long f1000;
   public String f2000;
   public String f3000;
   private static String[] f4000;
   public boolean f5000;
   public int f6000;

   public URI m6000() {
      String var1 = this.f5000 ? f4000[2] : f4000[3];
      return URI.create(var1 + "://" + this.f3000 + ":" + this.f6000 + this.f2000);
   }

   public String m8000() {
      return this.f3000;
   }

   public SocketClient(String var1, int var2, String var3, boolean var4, long var5) {
      this.f3000 = var1;
      this.f6000 = var2;
      this.f2000 = var3;
      this.f5000 = var4;
      this.f1000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m10000(Object var1) {
      return ObjectMethods.bootstrap<"equals",SocketClient,"host;port;path;sslEnabled;reconnectAfterMs",SocketClient::f3000,SocketClient::f6000,SocketClient::f2000,SocketClient::f5000,SocketClient::f1000>(
         this, var1
      );
   }

   public boolean m16000() {
      return this.f5000;
   }

   private static void m18000() {
      f4000 = new String[]{"socket.nursultan.fun", "/ws", "wss", "ws"};
   }

   public long m26000() {
      return this.f1000;
   }

   public int m32000() {
      return this.f6000;
   }

   public String m40000() {
      return this.f2000;
   }

   public static SocketClient m42000() {
      return new SocketClient(f4000[0], 443, f4000[1], true, 5000L);
   }
}
