package rw.core;

import java.io.IOException;
import java.util.Optional;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;
import rw.GuiWidget;
import rw.NursultanClient;
import rw.defs.BootstrapMethods;
import rw.gui.PgUp;

public class OlOsim {
   private static String[] f1000;

   private void m6000(MessageUnpacker var1) throws IOException {
      int var2 = var1.unpackArrayHeader();

      for (int var3 = 0; var3 < var2; var3++) {
         this.m26000(var1);
      }
   }

   static {
      ntfClinit();
   }

   private void m12000() {
      for (GuiWidget var2 : NursultanClient.m88000().m152000()) {
         var2.m46000((boolean)0);
         var2.m44000((PgUp)PgUp.f4000[0], 0, (BootstrapMethods)BootstrapMethods.f3000[0], (boolean)1);

         for (Base1014 var4 : var2.w().values()) {
            this.m20000(var4);
         }
      }
   }

   private void m18000(MessageUnpacker var1) throws IOException {
      int var2 = var1.unpackArrayHeader();

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1.unpackArrayHeader();
         String var5 = var1.unpackString();
         String var6 = var1.unpackString();
         boolean var7 = var1.unpackBoolean();
         int var8 = var1.unpackInt();
         var1.unpackValue();
         int var9 = var4 >= 6 ? var1.unpackInt() : 0;
         NursultanClient.m46000().m12000(var5).ifPresent(var4x -> var4x.m52000(PgUp.m76000(var8), var9, BootstrapMethods.m34000(var6), var7));
      }
   }

   private void m20000(Base1014<?> var1) {
      var1.m16000();

      for (Base1014 var3 : var1.w().values()) {
         this.m20000(var3);
      }
   }

   private void m26000(MessageUnpacker var1) throws IOException {
      var1.unpackArrayHeader();
      String var2 = var1.unpackString();
      boolean var3 = var1.unpackBoolean();
      var1.unpackValue();
      ImmutableValue var4 = var1.unpackValue();
      NursultanClient.m88000().m106000(var2).ifPresent(var3x -> {
         try {
            if (var3) {
               var3x.m46000((boolean)1);
            }
         } catch (Exception var5) {
         }

         if (!var4.isNilValue()) {
            this.m32000(var3x, var4.asArrayValue());
         }
      });
   }

   public void m28000(byte[] var1) throws IllegalStateException {
      if (var1 != null && var1.length != 0) {
         byte[] var2 = C0993.m20000(var1);
         this.m12000();

         try {
            MessageUnpacker var3 = MessagePack.newDefaultUnpacker(var2);

            try {
               int var4 = var3.unpackArrayHeader();
               var3.unpackInt();
               this.m6000(var3);
               if (var4 >= 3) {
                  this.m18000(var3);
               }
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
         } catch (IOException var8) {
            throw new IllegalStateException(f1000[0], var8);
         }
      }
   }

   private void m32000(Base0995 var1, ArrayValue var2) {
      for (Value var4 : var2) {
         ArrayValue var5 = var4.asArrayValue();
         String var6 = var5.get(0).asStringValue().asString();
         Value var7 = var5.get(1);
         Value var8 = var5.get(2);
         this.m38000(var1, var6).ifPresent(var3 -> {
            try {
               C1009.m24000((Base1014<?>)var3, var7);
            } catch (Exception var5x) {
            }

            if (!var8.isNilValue()) {
               this.m32000(var3, var8.asArrayValue());
            }
         });
      }
   }

   private static void m36000() {
      f1000 = new String[]{"Failed to deserialize preset (v1)"};
   }

   private Optional<Base1014<?>> m38000(Base0995 var1, String var2) {
      for (Base1014 var4 : var1.m2000().values()) {
         if (var4.m6000().m10000().equals(var2)) {
            return Optional.of(var4);
         }

         Optional var5 = this.m38000(var4, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }
}
