package rw.core;

import java.io.IOException;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;

public class OlmkIji {
   private static String[] f1000;

   private OlmkIji() {
      throw new UnsupportedOperationException(f1000[0]);
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      f1000 = new String[]{"This is a utility class and cannot be instantiated"};
   }

   public static void m6000(Base0973 var0, byte[] var1) throws IOException {
      byte[] var2 = C0993.m20000(var1);
      MessageUnpacker var3 = MessagePack.newDefaultUnpacker(var2);

      try {
         var0.m34000(var3);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }
   }

   public static byte[] m8000(Base0973 var0) throws IOException {
      MessageBufferPacker var1 = MessagePack.newDefaultBufferPacker();

      byte[] var2;
      try {
         var0.m22000(var1);
         var2 = C0993.m14000(var1.toByteArray());
      } catch (Throwable var5) {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if (var1 != null) {
         var1.close();
      }

      return var2;
   }
}
