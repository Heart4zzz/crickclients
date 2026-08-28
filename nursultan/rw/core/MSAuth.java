package rw.core;

import KDFzREm.NNNJQ;
import KDFzREm.NNNWz;
import KDFzREm.NNNYo;
import KDFzREm.NNNYw;
import KDFzREm.NNNZg;
import KDFzREm.NNNkP;
import KDFzREm.NNNwS;
import KDFzREm.NNRd;
import KDFzREm.NNfd;
import KDFzREm.NNuU;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.UserApiService.UserProperties;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.api.Iface0666;
import rw.data.Rec0173;
import rw.data.Rec0196;
import rw.data.Rec0224;
import rw.data.Rec0303;
import rw.setting.C0106;

public class MSAuth {
   private static String[] f1000;
   public static Object[] f2000;

   private static void m4000() {
      f1000 = new String[]{
         "Microsoft account {} has no stored token",
         "Nursultan-MS-Reauth",
         "",
         "This is a utility class and cannot be instantiated",
         "Switched offline account to {} ({})",
         "Switched Microsoft account to {} ({})",
         "Microsoft re-authentication failed",
         "account.modal.microsoft.error.generic"
      };
   }

   private MSAuth() {
      throw new UnsupportedOperationException(f1000[3]);
   }

   static {
      ntfClinit();
   }

   public static boolean m28000(Noqodls var0) {
      return switch (var0.m14000()) {
         case Rec0303 var3 -> m34000(var3.m14000(), var3.m20000());
         case Rec0196 var4 -> m40000(var0, var4);
         default -> throw new MatchException(null, null);
      };
   }

   private static void m30000() {
      f2000 = new Object[]{null};
   }

   public static boolean m34000(String var0, UUID var1) {
      NNuU var2 = NNuU.Nq();
      if ((NNNZg)var2.T[3] == null && (NNNwS)var2.T[4] == null && var2.NE() == null) {
         NNRd var3 = new NNRd(var0, var1, f1000[2], Optional.empty(), Optional.empty());
         YggdrasilAuthenticationService var4 = YggdrasilAuthenticationService.createOffline(var2.NJ());
         NNNkP var5 = NNNkP.N(var4, (File)var2.l[1]);
         UserApiService var6 = UserApiService.OFFLINE;

         UserProperties var7;
         try {
            var7 = var6.fetchProperties();
         } catch (Throwable var14) {
            var7 = UserApiService.OFFLINE_PROPERTIES;
         }

         NNfd var8 = new NNfd(var2, var6);
         NNNWz var9 = new NNNWz(var2, var6, var3);
         NNNJQ var10 = NNNJQ.N(var6, var3, ((File)var2.l[1]).toPath());
         NNNYo var11 = NNNYo.N(NNNYw.N(), var6);
         UserProperties var12 = var7;
         Runnable var13 = () -> {
            Iface0666 var11x = (Iface0666)var2;
            var2.i[2] = var3;
            var11x.m8000(var5);
            var11x.m4000(CompletableFuture.completedFuture(null));
            var11x.m6000(var6);
            var11x.m2000(CompletableFuture.completedFuture(var12));
            var11x.m12000(var8);
            var11x.m16000(var9);
            var11x.m14000(var10);
            var11x.m10000(var11);
            var2.yZ();
            ((Logger)f2000[0]).info(f1000[4], var0, var1);
         };
         if (var2.E_()) {
            var13.run();
         } else {
            var2.execute(var13);
         }

         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   public static boolean m40000(Noqodls var0, Rec0196 var1) {
      NNuU var2 = NNuU.Nq();
      if ((NNNZg)var2.T[3] == null && (NNNwS)var2.T[4] == null && var2.NE() == null) {
         String var3 = C0043.m14000(var1.m26000());
         if (var3 == null) {
            ((Logger)f2000[0]).warn(f1000[0], var1.m16000());
            return (boolean)0;
         } else {
            UUID var4 = var1.m18000();
            C1107.m30000(var4);
            Thread var5 = new Thread(() -> {
               try {
                  Rec0173 var5x = rw.setting.C0084.m100000(var3);
                  Rec0224 var10 = rw.setting.C0084.m92000(var5x);
                  byte[] var11 = C0043.m18000(var10.m8000());
                  Noqodls var8 = new Noqodls(new Rec0196(var1.m14000(), var10.m12000(), var10.m6000(), var11), var0.m24000(), var0.m6000());
                  var2.execute(() -> {
                     NursultanClient.m48000().m8000(var8);
                     m42000(var10.m6000(), var10.m12000(), var10.m10000(), var10.m2000());
                     C1107.m2000(var4);
                  });
               } catch (Throwable var9) {
                  ((Logger)f2000[0]).error(f1000[6], var9);
                  String var6 = var9 instanceof C0723 var7 ? var7.m12000() : f1000[7];
                  C1107.m24000(var4, var6);
                  C0106.m32000("Microsoft: " + C1235.m36000(var6));
               }
            }, f1000[1]);
            var5.setDaemon((boolean)1);
            var5.start();
            return (boolean)1;
         }
      } else {
         return (boolean)0;
      }
   }

   public static boolean m42000(String var0, UUID var1, String var2, String var3) {
      NNuU var4 = NNuU.Nq();
      if ((NNNZg)var4.T[3] == null && (NNNwS)var4.T[4] == null && var4.NE() == null) {
         NNRd var5 = new NNRd(var0, var1, var2, Optional.ofNullable(var3), Optional.empty());
         YggdrasilAuthenticationService var6 = new YggdrasilAuthenticationService(var4.NJ());
         NNNkP var7 = NNNkP.N(var6, (File)var4.l[1]);

         UserApiService var8;
         try {
            var8 = var6.createUserApiService(var2);
         } catch (Throwable var18) {
            var8 = UserApiService.OFFLINE;
         }

         UserProperties var9;
         try {
            var9 = var8.fetchProperties();
         } catch (Throwable var17) {
            var9 = UserApiService.OFFLINE_PROPERTIES;
         }

         NNfd var10 = new NNfd(var4, var8);
         NNNWz var11 = new NNNWz(var4, var8, var5);
         NNNJQ var12 = NNNJQ.N(var8, var5, ((File)var4.l[1]).toPath());
         NNNYo var13 = NNNYo.N(NNNYw.N(), var8);
         UserApiService var14 = var8;
         UserProperties var15 = var9;
         Runnable var16 = () -> {
            Iface0666 var11x = (Iface0666)var4;
            var4.i[2] = var5;
            var11x.m8000(var7);
            var11x.m4000(CompletableFuture.completedFuture(null));
            var11x.m6000(var14);
            var11x.m2000(CompletableFuture.completedFuture(var15));
            var11x.m12000(var10);
            var11x.m16000(var11);
            var11x.m14000(var12);
            var11x.m10000(var13);
            var4.yZ();
            ((Logger)f2000[0]).info(f1000[5], var0, var1);
         };
         if (var4.E_()) {
            var16.run();
         } else {
            var4.execute(var16);
         }

         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }
}
