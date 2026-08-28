package rw.setting;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;
import rw.NursultanClient;
import rw.core.C0959;
import rw.core.C0982;
import rw.core.OlsmIikp;
import rw.defs.Enum0065;

public class C0108 {
   public Object[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   public static Object[] f4000;
   private static boolean[] f5000;
   private static byte[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   private static short[] f10000;
   private static boolean[] f11000;
   private static byte[] f12000;
   private static boolean[] f13000;
   private static byte[] f14000;
   private static String[] f15000;
   private static long[] f16000;
   private static byte[] f17000;
   private static short[] f18000;
   private static short[] f19000;

   private static byte[] m6000(UUID var0) {
      byte[] var1 = new byte[f6000[2]];
      long var2 = var0.getMostSignificantBits();
      long var4 = var0.getLeastSignificantBits();

      for (int var6 = f11000[1]; var6 < f6000[3]; var6++) {
         var1[var6] = (byte)(var2 >>> f14000[0] * (f14000[1] - var6));
         var1[f14000[2] + var6] = (byte)(var4 >>> f14000[3] * (f14000[4] - var6));
      }

      return var1;
   }

   public Collection<OlsmIikp> m8000() {
      return List.copyOf(((Map)this.f1000[f18000[5]]).values());
   }

   private static void m12000() {
      f16000 = new long[]{0L, 0L, 0L, 255L, 255L};
   }

   public C0108() {
      this.m26000();
      Path var5 = ((Path)f4000[f10000[0]]).resolve(String.valueOf(((C0959)NursultanClient.f13000[f10000[1]]).m8000()));
      this.f1000[f3000[0]] = var5;
      LinkedHashMap var6 = new LinkedHashMap();
      this.f1000[f3000[1]] = var6;
      AtomicLong var7 = new AtomicLong();
      this.f1000[f3000[2]] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m14000() {
      f15000 = new String[]{
         "*.preset",
         "Failed to enumerate preset directory",
         "Failed to save preset {}",
         "Failed to delete preset file {}",
         "Skipped unreadable preset file {}: {}",
         "Unknown preset file schema version {}",
         "presets",
         ".preset"
      };
   }

   private static void m18000() {
      f17000 = new byte[]{3, 2, 2, 3, 10, 16};
      f12000 = new byte[]{2, 3, 4, 5, 6, 7};
      f6000 = new byte[]{8, 9, 16, 8};
      f14000 = new byte[]{8, 7, 8, 8, 7, 8, 8};
      f2000 = new byte[]{8, 8, 4, 3, 5, 50, 2, 3};
   }

   private static void m20000() {
      f10000 = new short[]{4, 2};
      f3000 = new short[]{0, 1, 2, 2};
      f7000 = new short[]{0, 0, 1, 0, 0, 0, 0, 1};
      f8000 = new short[]{2, 0, 1};
      f18000 = new short[]{2, 0, 0, 1, 1, 1};
      f19000 = new short[]{1, 0, 0};
   }

   private void m26000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f2000[3]];
         Object[] var1 = this.f1000;
      }
   }

   private static void m28000() {
      f4000 = new Object[]{null, 50, 1, f15000[7], null};
   }

   public void m32000() {
      if (Files.isDirectory((Path)this.f1000[f7000[0]])) {
         try (DirectoryStream var1 = Files.newDirectoryStream((Path)this.f1000[f7000[1]], f15000[0])) {
            for (Path var3 : var1) {
               OlsmIikp var4 = this.m58000(var3);
               if (var4 != null) {
                  ((Map)this.f1000[f7000[2]]).put(var4.m32000(), var4);
               }
            }
         } catch (IOException var7) {
            ((Logger)f4000[f7000[3]]).error(f15000[1], var7);
         }
      }
   }

   public int m40000() {
      return ((Map)this.f1000[f19000[0]]).size();
   }

   public void m44000(UUID var1) {
      if (((Map)this.f1000[f8000[2]]).remove(var1) != null) {
         ((AtomicLong)this.f1000[f18000[0]]).incrementAndGet();
      }

      Path var2 = ((Path)this.f1000[f18000[1]]).resolve(var1 + ".preset");

      try {
         Files.deleteIfExists(var2);
      } catch (IOException var4) {
         ((Logger)f4000[f18000[2]]).error(f15000[3], var1, var4);
      }
   }

   private static UUID m50000(byte[] var0) {
      long var1 = f16000[1];
      long var3 = f16000[2];

      for (int var5 = f11000[2]; var5 < f14000[5]; var5++) {
         var1 = var1 << f14000[6] | var0[var5] & f16000[3];
         var3 = var3 << f2000[0] | var0[f2000[1] + var5] & f16000[4];
      }

      return new UUID(var1, var3);
   }

   public Optional<OlsmIikp> m52000(long var1) {
      return var1 <= f16000[0]
         ? Optional.empty()
         : ((Map)this.f1000[f18000[4]]).values().stream().filter(var2 -> var2.m16000() == var1 ? f11000[3] : f11000[4]).findFirst();
   }

   public void m54000(OlsmIikp var1) {
      Path var2 = ((Path)this.f1000[f7000[4]]).resolve(var1.m32000() + ".preset");
      Path var3 = ((Path)this.f1000[f7000[5]]).resolve(var1.m32000() + ".preset." + UUID.randomUUID() + ".tmp");

      try {
         Files.createDirectories((Path)this.f1000[f7000[6]]);
         OlsmIikp var4 = this.m64000(var1, var2);
         MessageBufferPacker var6 = MessagePack.newDefaultBufferPacker();

         byte[] var5;
         try {
            this.m60000(var6, var4);
            var5 = var6.toByteArray();
         } catch (Throwable var20) {
            if (var6 != null) {
               try {
                  var6.close();
               } catch (Throwable var19) {
                  var20.addSuppressed(var19);
               }
            }

            throw var20;
         }

         if (var6 != null) {
            var6.close();
         }

         byte[] var10001 = C0982.m20000(var5);
         OpenOption[] var10002 = new OpenOption[f17000[0]];
         var10002[f13000[2]] = StandardOpenOption.CREATE;
         var10002[f13000[3]] = StandardOpenOption.TRUNCATE_EXISTING;
         var10002[f17000[1]] = StandardOpenOption.WRITE;
         Files.write(var3, var10001, var10002);
         CopyOption[] var23 = new CopyOption[f17000[2]];
         var23[f13000[4]] = StandardCopyOption.ATOMIC_MOVE;
         var23[f13000[5]] = StandardCopyOption.REPLACE_EXISTING;
         Files.move(var3, var2, var23);
         ((Map)this.f1000[f7000[7]]).put(var4.m32000(), var4);
         ((AtomicLong)this.f1000[f8000[0]]).incrementAndGet();
      } catch (IOException var21) {
         ((Logger)f4000[f8000[1]]).error(f15000[2], var1.m32000(), var21);
      } finally {
         try {
            Files.deleteIfExists(var3);
         } catch (IOException var18) {
         }
      }
   }

   private OlsmIikp m58000(Path var1) {
      try {
         byte[] var2 = Files.readAllBytes(var1);
         byte[] var3 = C0982.m20000(var2);
         MessageUnpacker var4 = MessagePack.newDefaultUnpacker(var3);

         OlsmIikp var5;
         try {
            var5 = this.m68000(var4);
         } catch (Throwable var8) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (var4 != null) {
            var4.close();
         }

         return var5;
      } catch (Exception var9) {
         ((Logger)f4000[f19000[1]]).warn(f15000[4], var1.getFileName(), var9.getMessage());
         return null;
      }
   }

   private void m60000(MessageBufferPacker var1, OlsmIikp var2) throws IOException {
      var1.packArrayHeader(f17000[3]);
      var1.packInt(f9000[1]);
      var1.packArrayHeader(f17000[4]);
      var1.packBinaryHeader(f17000[5]);
      var1.writePayload(m6000(var2.m32000()));
      var1.packLong(var2.m16000());
      var1.packString(var2.m22000());
      var1.packString(var2.m30000());
      var1.packLong(var2.m14000());
      var1.packLong(var2.m44000());
      var1.packLong(var2.m64000());
      var1.packString(var2.m8000().m40000());
      var1.packInt(var2.m2000());
      var1.packBoolean(var2.m50000());
      if (var2.m50000() && var2.m28000() != null) {
         var1.packBinaryHeader(var2.m28000().length);
         var1.writePayload(var2.m28000());
      } else {
         var1.packBinaryHeader(f9000[2]);
      }
   }

   public long m62000() {
      return ((AtomicLong)this.f1000[f3000[3]]).get();
   }

   private OlsmIikp m64000(OlsmIikp var1, Path var2) {
      if (!var1.m50000() && var1.m28000() == null && Files.exists(var2)) {
         OlsmIikp var3 = this.m58000(var2);
         if (var3 != null && var3.m50000() && var3.m28000() != null) {
            if (!var3.m32000().equals(var1.m32000())) {
               return var1;
            } else if (var3.m64000() != var1.m64000() && !var3.m46000()) {
               return var1;
            } else {
               var1.m54000(var3.m2000());
               var1.m60000(var3.m28000());
               var1.m52000(f9000[0]);
               return var1;
            }
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public Optional<OlsmIikp> m66000(UUID var1) {
      return Optional.ofNullable((OlsmIikp)((Map)this.f1000[f18000[3]]).get(var1));
   }

   private OlsmIikp m68000(MessageUnpacker var1) throws IOException {
      var1.unpackArrayHeader();
      int var2 = var1.unpackInt();
      if (var2 != f9000[3]) {
         ((Logger)f4000[f19000[2]]).warn(f15000[5], var2);
         return null;
      } else {
         ImmutableValue var3 = var1.unpackValue();
         ArrayValue var4 = var3.asArrayValue();
         UUID var5 = m50000(var4.get(f9000[4]).asBinaryValue().asByteArray());
         long var6 = var4.get(f9000[5]).asIntegerValue().asLong();
         String var8 = var4.get(f12000[0]).asStringValue().asString();
         String var9 = var4.get(f12000[1]).asStringValue().asString();
         long var10 = var4.get(f12000[2]).asIntegerValue().asLong();
         long var12 = var4.get(f12000[3]).asIntegerValue().asLong();
         long var14 = var4.get(f12000[4]).asIntegerValue().asLong();
         Enum0065 var16 = Enum0065.m38000(var4.get(f12000[5]).asStringValue().asString());
         if (var16 == null) {
            return null;
         } else {
            int var17 = var4.get(f6000[0]).asIntegerValue().asInt();
            boolean var18 = var4.get(f6000[1]).asBooleanValue().getBoolean();
            ImmutableValue var19 = var1.unpackValue();
            byte[] var20 = var19.asBinaryValue().asByteArray();
            if (!var18 || var20.length == 0) {
               var20 = null;
               var18 = f11000[0];
            }

            return new OlsmIikp(var5, var6, var8, var9, var10, var12, var14, var16, var17, var18, var20);
         }
      }
   }

   private static void m74000() {
      f13000 = new boolean[]{false, false, false, true, false, true, false};
      f9000 = new boolean[]{true, true, false, true, false, true};
      f11000 = new boolean[]{false, false, false, true, false};
      f5000 = new boolean[]{false, false, true, true};
   }
}
