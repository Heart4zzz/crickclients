package rw.core;

import KDFzREm.NNuU;
import KDFzREm.NlT;
import java.net.URI;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.logging.log4j.Logger;
import rw.NursultanClient;
import rw.data.ConfigFiles;
import rw.data.IltqIjstq;
import rw.data.Rec0173;
import rw.data.Rec0196;
import rw.data.Rec0224;
import rw.defs.Enum0085;
import rw.gui.IlIjrir;

public class C0926 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static String[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static long[] f8000;
   private static boolean[] f9000;

   public static void m2000() {
      if (!(Boolean)f2000[f7000[3]]) {
         Boolean var5 = f1000[0];
         f2000[f7000[4]] = var5;
         ((AtomicReference)f2000[f7000[5]]).set(new IltqIjstq((Enum0085)Enum0085.f6000[f7000[6]], f5000[0], null));
         Thread var0 = new Thread(C0926::m8000, f5000[1]);
         var0.setDaemon(f1000[1]);
         var0.start();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void m8000() {
      boolean var20 = false /* VF: Semaphore variable */;

      label77: {
         try {
            var20 = true;
            IlIjrir var0 = new IlIjrir();

            try {
               var0.m60000();
               NNuU var25 = NNuU.Nq();
               String var26 = var0.m76000();
               var25.execute(() -> NlT.m().N(URI.create(var26)));
               ((AtomicReference)f2000[f7000[7]]).set(new IltqIjstq((Enum0085)Enum0085.f6000[f6000[0]], f5000[2], null));
               String var27 = var0.m6000().get(f8000[0], TimeUnit.MINUTES);
               ((AtomicReference)f2000[f6000[1]]).set(new IltqIjstq((Enum0085)Enum0085.f6000[f6000[2]], f5000[3], null));
               Rec0173 var4 = rw.setting.C0084.m86000(var27, var0.m68000());
               Rec0224 var5 = rw.setting.C0084.m92000(var4);
               byte[] var6 = C0043.m18000(var5.m8000());
               Noqodls var7 = new Noqodls(new Rec0196(f1000[2], var5.m12000(), var5.m6000(), var6), f1000[3], System.currentTimeMillis());
               var25.execute(() -> {
                  NursultanClient.m48000().m8000(var7);
                  IltqImqmt var2x = NursultanClient.m10000().m62000(IltqImqmt.class);
                  var2x.m6000(var7.m38000());
                  ConfigFiles.m54000(IltqImqmt.class);
                  MSAuth.m42000(var5.m6000(), var5.m12000(), var5.m10000(), var5.m2000());
               });
               ((AtomicReference)f2000[f4000[0]]).set(new IltqIjstq((Enum0085)Enum0085.f6000[f4000[1]], null, var5.m6000()));
            } catch (Throwable var22) {
               try {
                  var0.m54000();
               } catch (Throwable var21) {
                  var22.addSuppressed(var21);
               }

               throw var22;
            }

            var0.m54000();
            var20 = false;
            break label77;
         } catch (Throwable var23) {
            Throwable var1 = m48000(var23);
            ((Logger)f2000[f4000[3]]).error(f5000[4], var1);
            String var2 = var1 instanceof C0723 var3 ? var3.m12000() : f5000[5];
            ((AtomicReference)f2000[f4000[4]]).set(new IltqIjstq((Enum0085)Enum0085.f6000[f4000[5]], var2, null));
            var20 = false;
         } finally {
            if (var20) {
               Boolean var15 = f1000[6];
               f2000[f4000[7]] = var15;
            }
         }

         Boolean var14 = f1000[5];
         f2000[f4000[6]] = var14;
         return;
      }

      Boolean var13 = f1000[4];
      f2000[f4000[2]] = var13;
   }

   private C0926() {
      throw new UnsupportedOperationException(f5000[6]);
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 4;
      f3000[2] = 3;
   }

   private static void m16000() {
      f2000 = new Object[f3000[(1 | -1) >>> 31]];
      f2000[f3000[2]] = f9000[4];
   }

   private static void m22000() {
      short[] var128 = new short[8];
      f7000[(0 | -0) >>> 31] = 2;
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = (short)((1 | -1) >>> 31);
      f7000[3] = 3;
      f7000[4] = 3;
      f7000[5] = 2;
      f7000[6] = (short)((1 | -1) >>> 31);
      f7000[7] = 2;
      short[] var129 = new short[3];
      f6000[(0 | -0) >>> 31] = 2;
      f6000[(1 | -1) >>> 31] = 2;
      f6000[2] = 3;
      short[] var130 = new short[8];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = 4;
      f4000[2] = 3;
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = 2;
      f4000[5] = 5;
      f4000[6] = 3;
      f4000[7] = 3;
   }

   private static void m24000() {
      long[] var128 = new long[(1 | -1) >>> 31];
      f8000[(0 | -0) >>> 31] = 5L;
   }

   private static void m28000() {
      f5000 = new String[7];
      f5000[(0 | -0) >>> 31] = "account.modal.microsoft.requesting";
      f5000[(1 | -1) >>> 31] = "Nursultan-MS-Login";
      f5000[2] = "account.modal.microsoft.waiting";
      f5000[3] = "account.modal.microsoft.processing";
      f5000[4] = "Microsoft login failed";
      f5000[5] = "account.modal.microsoft.error.timeout";
      f5000[6] = "This is a utility class and cannot be instantiated";
   }

   public static void m32000() {
      ((AtomicReference)f2000[f7000[1]]).set((IltqIjstq)f2000[f7000[2]]);
   }

   public static IltqIjstq m46000() {
      return (IltqIjstq)((AtomicReference)f2000[f7000[0]]).get();
   }

   private static Throwable m48000(Throwable var0) {
      Throwable var1 = var0.getCause();
      return var1 != null && var0 instanceof ExecutionException ? var1 : var0;
   }

   private static void m52000() {
      boolean[] var128 = new boolean[7];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((0 | -0) >>> 31);
      f1000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f9000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[2] = (boolean)((1 | -1) >>> 31);
      f9000[3] = (boolean)((1 | -1) >>> 31);
      f9000[4] = (boolean)((0 | -0) >>> 31);
   }
}
