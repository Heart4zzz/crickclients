package rw.core;

import java.io.IOException;
import java.util.UUID;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import rw.NursultanClient;

public class C1002 extends Base0973 {
   private static String[] f1000;
   public Object[] f2000;
   public static Object[] f3000;

   private void m4000() {
      this.m6000();
      OlsmIikp var1 = NursultanClient.m116000().m66000((UUID)this.f2000[0]).orElse(null);
      if (var1 != null && var1.m50000() && var1.m28000() != null) {
         try {
            new C0871().m2000(var1.m2000(), var1.m28000());
         } catch (RuntimeException var3) {
            ((Logger)f3000[0]).error(f1000[0], var1.m22000(), var3);
         }
      }
   }

   public C1002(String var1, int var2) {
      super(var1, var2, null);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   private static void m8000() {
      f1000 = new String[]{"Failed to apply selected preset {}"};
   }

   private static void m2000() {
      f3000 = new Object[]{null};
   }

   public UUID m4000() {
      this.m6000();
      return (UUID)this.f2000[0];
   }

   public void m16000(int var1, MessageUnpacker var2) throws IOException {
      this.m6000();
      boolean var3 = var2.unpackBoolean();
      if (!var3) {
         Object var12 = null;
         this.f2000[0] = var12;
      } else {
         long var4 = var2.unpackLong();
         long var6 = var2.unpackLong();
         UUID var13 = new UUID(var4, var6);
         this.f2000[0] = var13;
         this.m4000();
      }
   }

   public C1002 m6000(UUID var1) {
      this.m6000();
      this.f2000[0] = var1;
      return this;
   }

   public void m18000(MessageBufferPacker var1) throws IOException {
      this.m6000();
      if ((UUID)this.f2000[0] == null) {
         var1.packBoolean((boolean)0);
      } else {
         var1.packBoolean((boolean)1);
         var1.packLong(((UUID)this.f2000[0]).getMostSignificantBits());
         var1.packLong(((UUID)this.f2000[0]).getLeastSignificantBits());
      }
   }

   @Override
   public boolean d_() {
      this.m6000();
      return (boolean)((UUID)this.f2000[0] == null ? 1 : 0);
   }
}
