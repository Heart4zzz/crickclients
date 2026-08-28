package rw.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import rw.GuiWidget;

public class C0895 {
   private static boolean[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;
   private static String[] f4000;
   private static boolean[] f5000;

   private byte[] m4000(Iterable<GuiWidget> var1) throws IOException {
      ArrayList var2 = new ArrayList();

      for (GuiWidget var4 : var1) {
         if (this.m22000(var4)) {
            var2.add(var4);
         }
      }

      List var9 = this.m16000(var1);
      MessageBufferPacker var10 = MessagePack.newDefaultBufferPacker();

      byte[] var12;
      try {
         var10.packArrayHeader(f3000[0]);
         var10.packInt(f1000[0]);
         var10.packArrayHeader(var2.size());

         for (GuiWidget var6 : var2) {
            this.m24000(var10, var6);
         }

         var10.packArrayHeader(var9.size());

         for (C0073 var13 : var9) {
            this.m36000(var10, var13);
         }

         var12 = var10.toByteArray();
      } catch (Throwable var8) {
         if (var10 != null) {
            try {
               var10.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var10 != null) {
         var10.close();
      }

      return var12;
   }

   private static void m6000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
      boolean[] var129 = new boolean[8];
      f5000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((1 | -1) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
      f5000[4] = (boolean)((0 | -0) >>> 31);
      f5000[5] = (boolean)((1 | -1) >>> 31);
      f5000[6] = (boolean)((0 | -0) >>> 31);
      f5000[7] = (boolean)((1 | -1) >>> 31);
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      f2000 = new Object[f5000[5]];
      f2000[f5000[6]] = Integer.valueOf(f5000[7]);
   }

   private static void m14000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "Failed to serialize preset (v1)";
   }

   private List<C0073> m16000(Iterable<GuiWidget> var1) {
      ArrayList var2 = new ArrayList();

      for (GuiWidget var4 : var1) {
         this.m28000(var2, var4.m54000());
         this.m18000(var4, var2);
      }

      return var2;
   }

   private void m18000(Base0995 var1, List<C0073> var2) {
      for (Base1014 var4 : var1.m2000().values()) {
         this.m18000(var4, var2);
      }
   }

   private void m20000(MessageBufferPacker var1, Base1014<?> var2) throws IOException {
      List var3 = var2.w().values().stream().filter(this::m34000).toList();
      var1.packArrayHeader(f3000[3]);
      var1.packString(var2.m6000().m10000());
      C1009.m10000(var1, var2);
      if (var3.isEmpty()) {
         var1.packNil();
      } else {
         var1.packArrayHeader(var3.size());

         for (Base1014 var5 : var3) {
            this.m20000(var1, var5);
         }
      }
   }

   private boolean m22000(GuiWidget var1) {
      if (var1.m30000()) {
         return f1000[1];
      } else {
         for (Base1014 var3 : var1.w().values()) {
            if (this.m34000(var3)) {
               return f1000[2];
            }
         }

         return f5000[0];
      }
   }

   private void m24000(MessageBufferPacker var1, GuiWidget var2) throws IOException {
      List var3 = var2.w().values().stream().filter(this::m34000).toList();
      var1.packArrayHeader(f3000[2]);
      var1.packString(var2.m42000());
      var1.packBoolean(var2.m30000());
      var1.packNil();
      if (var3.isEmpty()) {
         var1.packNil();
      } else {
         var1.packArrayHeader(var3.size());

         for (Base1014 var5 : var3) {
            this.m20000(var1, var5);
         }
      }
   }

   private static void m26000() {
      byte[] var128 = new byte[4];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 6;
      f3000[2] = 4;
      f3000[3] = 3;
   }

   private void m28000(List<C0073> var1, C0073 var2) {
      if (!var2.m14000()) {
         var1.add(var2);
      }
   }

   private boolean m34000(Base1014<?> var1) {
      if (var1.m36000()) {
         return f5000[1];
      } else if (var1.c_()) {
         return f5000[2];
      } else {
         for (Base1014 var3 : var1.w().values()) {
            if (this.m34000(var3)) {
               return f5000[3];
            }
         }

         return f5000[4];
      }
   }

   private void m36000(MessageBufferPacker var1, C0073 var2) throws IOException {
      var1.packArrayHeader(f3000[1]);
      var1.packString(var2.m2000());
      var1.packString(var2.m18000().m38000());
      var1.packBoolean(var2.m54000());
      var1.packInt(var2.m36000().m8000());
      if (var2.m68000() == null) {
         var1.packNil();
      } else {
         var1.packString(var2.m68000());
      }

      var1.packInt(var2.m16000());
   }

   public byte[] m38000(Iterable<GuiWidget> var1) {
      try {
         byte[] var2 = this.m4000(var1);
         return C0993.m14000(var2);
      } catch (IOException var3) {
         throw new IllegalStateException(f4000[0], var3);
      }
   }
}
