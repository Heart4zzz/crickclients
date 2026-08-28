package rw.core;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import rw.api.Iface0621;
import rw.defs.Nuker;

public abstract class Base0973 {
   private static String[] f1000;
   public Object[] f2000;
   public static Object[] f3000;

   private static void m6000() {
      f1000 = new String[]{"Unknown schema version {} in {}"};
   }

   public Base0973(String var1, int var2, Nuker var3) {
      this.m10000();
      this.f2000[0] = var1;
      Integer var9 = var2;
      this.f2000[1] = var9;
      this.f2000[2] = var3;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
         var1[1] = 0;
      }
   }

   public Nuker m14000() {
      return (Nuker)this.f2000[2];
   }

   private static void m16000() {
      f3000 = new Object[]{null};
   }

   public String m20000() {
      return (String)this.f2000[0];
   }

   public void m22000(MessageBufferPacker var1) throws IOException {
      var1.packInt((Integer)this.f2000[1]);
      if (this instanceof Iface0621 var2) {
         var1.packBoolean(var2.m4000());
      }

      this.m32000(var1);
   }

   public abstract void m28000(int var1, MessageUnpacker var2) throws IOException;

   public abstract void m32000(MessageBufferPacker var1) throws IOException;

   public void m34000(MessageUnpacker var1) throws IOException {
      int var2 = var1.unpackInt();
      if (!this.m36000(var2)) {
         ((Logger)f3000[0]).warn(f1000[0], var2, (String)this.f2000[0]);
      } else {
         if (this instanceof Iface0621 var3) {
            var3.m6000(var1.unpackBoolean());
         }

         this.m28000(var2, var1);
      }
   }

   public boolean m36000(int var1) {
      return (boolean)(var1 == this.f2000[1] ? 1 : 0);
   }

   public int m38000() {
      return (Integer)this.f2000[1];
   }

   public abstract boolean d_();
}
