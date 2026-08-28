package rw.core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import rw.NursultanClient;

public class C0982 {
   private static String[] f1000;

   private C0982() {
   }

   static {
      ntfClinit();
   }

   private static byte[] m16000(long var0) {
      try {
         return MessageDigest.getInstance(f1000[0]).digest(("nursultan-storage-xor-v1:" + var0).getBytes());
      } catch (NoSuchAlgorithmException var3) {
         throw new IllegalStateException(f1000[1], var3);
      }
   }

   private static void m18000() {
      f1000 = new String[]{"SHA-256", "SHA-256 unavailable"};
   }

   public static byte[] m20000(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         byte[] var1 = m16000(((C0959)NursultanClient.f13000[2]).m8000());
         byte[] var2 = new byte[var0.length];

         for (int var3 = 0; var3 < var0.length; var3++) {
            var2[var3] = (byte)(var0[var3] ^ var1[var3 % var1.length]);
         }

         return var2;
      } else {
         return var0;
      }
   }
}
