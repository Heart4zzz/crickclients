package rw.net;

import KDFzREm.NNuN;
import KDFzREm.NNuU;
import java.util.ArrayDeque;
import java.util.Base64;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Base64.Encoder;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.core.C0108;
import rw.core.C0868;
import rw.core.C1207;
import rw.core.C1235;
import rw.data.Rec0038;
import rw.data.Rec0039;
import rw.data.Rec0046;
import rw.data.Rec0050;
import rw.data.Rec0055;
import rw.data.Rec0057;
import rw.data.Rec0209;
import rw.data.Rec0211;
import rw.data.Rec0253;
import rw.data.Rec0267;
import rw.defs.Enum0068;
import rw.defs.Enum0082;
import rw.defs.Enum0083;
import rw.setting.C0106;

public class IlkmktOi {
   private static short[] f1000;
   private static String[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static String[] f5000;
   private static short[] f6000;
   public static Object[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   public Object[] f12000;
   private static short[] f13000;

   private static boolean m2000(Rec0253 var0) {
      if (var0 == null) {
         return (boolean)0;
      } else {
         return (boolean)(var0.m12000() != 0 && var0.m2000() >= var0.m12000() ? 0 : 1);
      }
   }

   public synchronized void m6000(long var1) {
      ((Map)this.f12000[1]).remove(var1);
   }

   public synchronized void m8000() {
      byte[] var1 = m34000(((NNuN)NNuU.Nq().L[3]).N());
      if (var1 == null) {
         NursultanClient.m70000().m18000().m24000().m34000(new Rec0267(C1235.m36000(f5000[0]))).m44000();
      } else {
         SocketConnector var2 = NursultanClient.m82000();
         if (!var2.m72000()) {
            NursultanClient.m70000().m18000().m24000().m34000(new Rec0267(C1235.m36000(f5000[1]))).m44000();
         } else if (!(Boolean)this.f12000[5]) {
            Boolean var7 = true;
            this.f12000[5] = var7;
            var2.m56000(C1207.m28000(var1));
         }
      }
   }

   private static void m14000() {
      f5000 = new String[]{
         "share.import.invalid",
         "share.import.offline",
         "nursultan.fun/config?id=",
         "nursultan.fun/config?id=",
         "share.notify.copied",
         "share activate response with unknown outcome {}",
         "share.import.created",
         "share.import.updated"
      };
      f2000 = new String[]{
         "share.import.already-activated",
         "share.import.own-link",
         "share.notify.refreshed",
         "share NACK with unknown error code {}",
         "https://nursultan.fun/config?id=",
         "nursultan.fun/config?id="
      };
   }

   public IlkmktOi() {
      this.m22000();
      ArrayDeque var5 = new ArrayDeque();
      this.f12000[0] = var5;
      HashMap var6 = new HashMap();
      this.f12000[1] = var6;
      Encoder var7 = Base64.getUrlEncoder().withoutPadding();
      this.f12000[2] = var7;
      Rec0209 var8 = Rec0209.m2000();
      this.f12000[3] = var8;
   }

   static {
      ntfClinit();
   }

   private void m22000() {
      if (this.f12000 == null) {
         this.f12000 = new Object[6];
         Object[] var1 = this.f12000;
         var1[4] = 0L;
         var1[5] = false;
      }
   }

   private static void m24000() {
      f13000 = new short[]{0, 1};
      f3000 = new short[]{2, 3, 0, 1, 3, 5, 3, 5};
      f9000 = new short[]{5, 0};
      f8000 = new short[]{0, 0, 1};
      f11000 = new short[]{1, 1, 3, 3};
      f10000 = new short[]{0, 5, 0};
      f1000 = new short[]{1, 1, 1, 1, 1, 1, 3, 1};
      f4000 = new short[]{2, 5, 5, 0, 4, 4, 0, 0};
      f6000 = new short[]{2, 0, 2, 4, 4, 3};
   }

   private static void m28000() {
      f7000 = new Object[]{null, f2000[4], f2000[5]};
   }

   private void m32000(Rec0253 var1) {
      ((Map)this.f12000[1]).put(var1.m8000(), var1);
      this.m86000(var1);
      this.m78000((Enum0068)Enum0068.f1000[1], var1.m8000());
   }

   private static byte[] m34000(String var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1 = var0.toLowerCase(Locale.ROOT).indexOf(f5000[2]);
         if (var1 < 0) {
            return null;
         } else {
            int var2 = var1 + f5000[3].length();
            int var3 = var2;

            while (var3 < var0.length() && m82000(var0.charAt(var3))) {
               var3++;
            }

            if (var3 == var2) {
               return null;
            } else {
               try {
                  byte[] var4 = Base64.getUrlDecoder().decode(var0.substring(var2, var3));
                  return var4.length == 16 ? var4 : null;
               } catch (IllegalArgumentException var5) {
                  return null;
               }
            }
         }
      }
   }

   public synchronized Rec0253 m36000(long var1) {
      Rec0253 var3 = (Rec0253)((Map)this.f12000[1]).get(var1);
      return m2000(var3) ? var3 : null;
   }

   public synchronized void m52000() {
      ((Deque)this.f12000[0]).add(Rec0211.m22000());
      this.m102000();
   }

   public synchronized void m54000(long var1) {
      ((Deque)this.f12000[f8000[1]]).add(Rec0211.m20000(var1));
      this.m102000();
   }

   private String m56000(Rec0253 var1) {
      return "https://nursultan.fun/config?id=" + ((Encoder)this.f12000[2]).encodeToString(var1.m16000());
   }

   public synchronized void m58000() {
      ((Deque)this.f12000[0]).clear();
      ((Map)this.f12000[1]).clear();
      Rec0209 var5 = Rec0209.m2000();
      this.f12000[3] = var5;
      Boolean var6 = false;
      this.f12000[5] = var6;
      this.m52000();
   }

   public synchronized void m60000(long var1) {
      ((Deque)this.f12000[f8000[0]]).add(Rec0211.m26000(var1));
      this.m102000();
   }

   private void m62000(Rec0253 var1) {
      ((Map)this.f12000[1]).put(var1.m8000(), var1);
      NursultanClient.m70000().m18000().m8000().m34000(new Rec0267(C1235.m36000(f2000[2]))).m44000();
      this.m78000((Enum0068)Enum0068.f1000[3], var1.m8000());
   }

   private void m72000(Rec0050 var1) {
      int var2 = this.f12000[5] && var1.m4000() == 0L ? 1 : 0;
      if (var2 != 0) {
         Boolean var8 = false;
         this.f12000[5] = var8;
      }

      Enum0082 var3 = Enum0082.m68000(var1.m10000());
      if (var3 == null) {
         ((Logger)f7000[0]).warn(f2000[3], var1.m10000());
         this.m78000((Enum0068)Enum0068.f1000[4], var1.m4000());
      } else {
         if (var2 != 0) {
            NursultanClient.m70000().m18000().m24000().m34000(new Rec0267(C1235.m36000(var3.m60000()))).m44000();
         } else {
            C0106.m32000(C1235.m36000(var3.m60000()));
         }

         this.m78000((Enum0068)Enum0068.f1000[4], var1.m4000());
      }
   }

   private void m74000(Rec0038 var1) {
      Boolean var7 = false;
      this.f12000[5] = var7;
      Enum0083 var2 = Enum0083.m34000(var1.m2000());
      if (var2 == null) {
         ((Logger)f7000[0]).warn(f5000[5], var1.m2000());
      } else {
         switch (((int[])C0868.f1000[1])[var2.ordinal()]) {
            case 1:
               NursultanClient.m70000().m18000().m8000().m34000(new Rec0267(C1235.m36000(f5000[6]).formatted(var1.m18000()))).m44000();
               break;
            case 2:
               NursultanClient.m70000().m18000().m8000().m34000(new Rec0267(C1235.m36000(f5000[7]).formatted(var1.m18000()))).m44000();
               break;
            case 3:
               NursultanClient.m70000().m18000().m4000().m34000(new Rec0267(C1235.m36000(f2000[0]))).m44000();
               break;
            case 4:
               NursultanClient.m70000().m18000().m4000().m34000(new Rec0267(C1235.m36000(f2000[1]))).m44000();
         }
      }
   }

   private void m78000(Enum0068 var1, long var2) {
      long var10007 = (Long)this.f12000[4] + 1L;
      Long var8 = var10007;
      this.f12000[4] = var8;
      Rec0209 var9 = new Rec0209(var1, var2, var10007);
      this.f12000[3] = var9;
   }

   public synchronized void m80000(C0108 var1) {
      switch (((int[])C0868.f1000[0])[var1.m20000().ordinal()]) {
         case 1:
            this.m94000(((Rec0039)var1.m12000()).m10000());
            break;
         case 2:
            this.m32000(((Rec0046)var1.m12000()).m8000());
            break;
         case 3:
            this.m98000(((Rec0057)var1.m12000()).m8000());
            break;
         case 4:
            this.m72000((Rec0050)var1.m12000());
            break;
         case 5:
            this.m74000((Rec0038)var1.m12000());
            break;
         case 6:
            this.m62000(((Rec0055)var1.m12000()).m6000());
      }

      this.m102000();
   }

   private static boolean m82000(char var0) {
      return (boolean)((var0 < 'A' || var0 > 'Z') && (var0 < 'a' || var0 > 'z') && (var0 < '0' || var0 > '9') && var0 != '-' && var0 != '_' && var0 != '='
         ? 0
         : 1);
   }

   public synchronized boolean m84000(long var1) {
      return (boolean)(var1 > 0L && m2000((Rec0253)((Map)this.f12000[f8000[2]]).get(var1)) ? 1 : 0);
   }

   public void m86000(Rec0253 var1) {
      ((NNuN)NNuU.Nq().L[3]).N(this.m56000(var1));
      NursultanClient.m70000().m18000().m8000().m34000(new Rec0267(C1235.m36000(f5000[4]))).m44000();
   }

   public Rec0209 m88000() {
      return (Rec0209)this.f12000[3];
   }

   public synchronized void m92000(long var1, long var3, int var5) {
      ((Deque)this.f12000[0]).add(Rec0211.m30000(var1, var3, var5));
      this.m102000();
   }

   private void m94000(List<Rec0253> var1) {
      ((Map)this.f12000[1]).clear();

      for (Rec0253 var3 : var1) {
         ((Map)this.f12000[1]).put(var3.m8000(), var3);
      }
   }

   private void m98000(long var1) {
      ((Map)this.f12000[1]).remove(var1);
      this.m78000((Enum0068)Enum0068.f1000[2], var1);
   }

   private void m102000() {
      SocketConnector var1 = NursultanClient.m82000();
      if (var1.m72000()) {
         while (!((Deque)this.f12000[0]).isEmpty()) {
            Rec0211 var2 = (Rec0211)((Deque)this.f12000[0]).poll();
            switch (((int[])C0868.f1000[2])[var2.m24000().ordinal()]) {
               case 1:
                  var1.m56000(C1207.m14000());
                  break;
               case 2:
                  var1.m56000(C1207.m30000(var2.m14000(), var2.m16000(), var2.m4000()));
                  break;
               case 3:
                  var1.m56000(C1207.m20000(var2.m14000()));
                  break;
               case 4:
                  var1.m56000(C1207.m12000(var2.m14000()));
            }
         }
      }
   }
}
