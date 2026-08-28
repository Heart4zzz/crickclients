package rw.net;

import io.netty.buffer.ByteBuf;

public class C0030 {
   private static String[] f1000;
   public static Object[] f2000;

   private C0030() {
      throw new UnsupportedOperationException(f1000[1]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f2000 = new Object[]{5, 127, 128, 7};
   }

   private static void m16000() {
      f1000 = new String[]{"VarInt too big", "This is a utility class and cannot be instantiated"};
   }

   public static int m20000(ByteBuf var0) {
      int var1 = 0;
      int var2 = 0;

      byte var3;
      do {
         var3 = var0.readByte();
         var1 |= (var3 & 127) << var2 * 7;
         if (++var2 > 5) {
            throw new RuntimeException(f1000[0]);
         }
      } while (m22000(var3));

      return var1;
   }

   public static boolean m22000(byte var0) {
      return (boolean)((var0 & 128) == 128 ? 1 : 0);
   }

   public static ByteBuf m28000(ByteBuf var0, int var1) {
      while ((var1 & -128) != 0) {
         var0.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      var0.writeByte(var1);
      return var0;
   }
}
