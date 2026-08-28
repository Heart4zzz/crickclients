package rw.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class C0043 {
   private static boolean[] f1000;
   private static String[] f2000;
   public static Object[] f3000;

   private static void m6000() {
      f3000 = new Object[f1000[(1 | -1) >>> 31]];
      f3000[f1000[2]] = Byte.valueOf(f1000[3]);
   }

   private C0043() {
      throw new UnsupportedOperationException(f2000[1]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new String[2];
      f2000[(0 | -0) >>> 31] = "Unable to write Microsoft account data.";
      f2000[(1 | -1) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static String m14000(byte[] var0) {
      if (var0 != null && var0.length != 0) {
         try {
            String var2;
            try (DataInputStream var1 = new DataInputStream(new ByteArrayInputStream(var0))) {
               var1.readByte();
               var2 = var1.readUTF();
            }

            return var2;
         } catch (IOException var6) {
            return null;
         }
      } else {
         return null;
      }
   }

   public static byte[] m18000(String var0) {
      try {
         byte[] var3;
         try (
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2 = new DataOutputStream(var1);
         ) {
            var2.writeByte(f1000[0]);
            var2.writeUTF(var0);
            var3 = var1.toByteArray();
         }

         return var3;
      } catch (IOException var9) {
         throw new IllegalStateException(f2000[0], var9);
      }
   }

   private static void m20000() {
      boolean[] var128 = new boolean[4];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
   }
}
