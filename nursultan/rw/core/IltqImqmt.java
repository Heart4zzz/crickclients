package rw.core;

import java.io.IOException;
import java.util.UUID;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import rw.NursultanClient;

public class IltqImqmt extends Base0973 {
   public Object[] f1000;
   public static Object[] f2000;
   private static String[] f3000;

   private void m4000() {
      this.m6000();
      Noqodls var1 = NursultanClient.m48000().m4000((UUID)this.f1000[0]).orElse(null);
      if (var1 != null) {
         try {
            MSAuth.m28000(var1);
         } catch (RuntimeException var3) {
            ((Logger)f2000[0]).error(f3000[0], var1.m20000(), var3);
         }
      }
   }

   public IltqImqmt(String var1, int var2) {
      super(var1, var2, null);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   private static void m8000() {
      f2000 = new Object[]{null};
   }

   private static void m12000() {
      f3000 = new String[]{"Failed to apply selected account {}"};
   }

   public UUID m4000() {
      this.m6000();
      return (UUID)this.f1000[0];
   }

   public void m18000(MessageBufferPacker var1) throws IOException {
      this.m6000();
      if ((UUID)this.f1000[0] == null) {
         var1.packBoolean((boolean)0);
      } else {
         var1.packBoolean((boolean)1);
         var1.packLong(((UUID)this.f1000[0]).getMostSignificantBits());
         var1.packLong(((UUID)this.f1000[0]).getLeastSignificantBits());
      }
   }

   public IltqImqmt m6000(UUID var1) {
      this.m6000();
      this.f1000[0] = var1;
      return this;
   }

   public void m22000(int var1, MessageUnpacker var2) throws IOException {
      this.m6000();
      boolean var3 = var2.unpackBoolean();
      if (!var3) {
         Object var8 = null;
         this.f1000[0] = var8;
      } else {
         UUID var9 = new UUID(var2.unpackLong(), var2.unpackLong());
         this.f1000[0] = var9;
         this.m4000();
      }
   }

   @Override
   public boolean d_() {
      this.m6000();
      return (boolean)((UUID)this.f1000[0] == null ? 1 : 0);
   }
}
