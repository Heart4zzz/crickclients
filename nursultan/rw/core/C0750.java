package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import rw.NursultanClient;
import rw.data.ConfigFiles;

public class C0750 {
   private static byte[] f1000;
   private static boolean[] f2000;
   private static String[] f3000;
   private static boolean[] f4000;
   public static Object[] f5000;
   private static short[] f6000;
   private static short[] f7000;

   private static void m2000() {
      boolean[] var128 = new boolean[5];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((1 | -1) >>> 31);
      f2000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[4];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 2;
   }

   private C0750() {
      throw new UnsupportedOperationException(oon0jlp<"hvene",-180243762,293913572,293913537,293913536,1830938210,-93534044,-87484471>()[0]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f3000 = new String[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   private static void m12000() {
      f5000 = new Object[f1000[(0 | -0) >>> 31]];
      f5000[f4000[2]] = f4000[3];
   }

   private static void m14000() {
      Boolean var5 = f4000[0];
      f5000[f6000[4]] = var5;
      UUID var0 = (UUID)((AtomicReference)f5000[f6000[5]]).getAndSet(null);
      if (var0 != null) {
         NursultanClient.m48000().m4000(var0).ifPresent(var0x -> {
            IltqImqmt var1 = NursultanClient.m10000().m62000(IltqImqmt.class);
            var1.m6000(var0x.m38000());
            ConfigFiles.m54000(IltqImqmt.class);
            MSAuth.m28000(var0x);
         });
      }
   }

   public static boolean m18000(UUID var0) {
      return var0 != null && var0.equals(((AtomicReference)f5000[f7000[1]]).get()) ? f2000[0] : f2000[1];
   }

   public static void m22000() {
      ((AtomicReference)f5000[f6000[0]]).set(null);
   }

   public static void m26000(UUID var0) {
      ((AtomicReference)f5000[f6000[1]]).compareAndSet(var0, null);
   }

   private static boolean m28000(NNuU var0) {
      return var0 != null && (NNNZg)var0.T[f6000[2]] == null && (NNNwS)var0.T[f6000[3]] == null && var0.NE() == null ? f2000[3] : f2000[4];
   }

   public static void m32000(Noqodls var0) {
      ((AtomicReference)f5000[f7000[2]]).set(var0.m38000());
      if (!(Boolean)f5000[f7000[3]]) {
         Boolean var5 = f2000[2];
         f5000[f7000[4]] = var5;
         NursultanClient.m36000().m22000(C0750::m28000, C0750::m14000);
      }
   }

   public static UUID m36000() {
      return (UUID)((AtomicReference)f5000[f7000[0]]).get();
   }

   private static void m38000() {
      short[] var128 = new short[5];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[2] = (short)((0 | -0) >>> 31);
      f7000[3] = (short)((1 | -1) >>> 31);
      f7000[4] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[6];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = 3;
      f6000[3] = 4;
      f6000[4] = (short)((1 | -1) >>> 31);
      f6000[5] = (short)((0 | -0) >>> 31);
   }
}
