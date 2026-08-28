package rw.core;

import com.github.luben.zstd.Zstd;

public class C0993 {
   public static Object[] f1000;

   private C0993() {
   }

   static {
      ntfClinit();
   }

   private static void m12000() {
      f1000 = new Object[]{9};
   }

   public static byte[] m14000(byte[] var0) {
      return Zstd.compress(var0, 9);
   }

   public static byte[] m20000(byte[] var0) {
      long var1 = Zstd.getFrameContentSize(var0);
      return var1 <= 0L ? Zstd.decompress(var0, (int)Math.max(var0.length * 10L, 4096L)) : Zstd.decompress(var0, (int)var1);
   }
}
