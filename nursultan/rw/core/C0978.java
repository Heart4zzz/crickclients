package rw.core;

import java.io.IOException;
import java.util.List;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;
import rw.NursultanClient;
import rw.api.Iface0621;
import rw.data.OliOkkns;
import rw.defs.Nuker;

public class C0978 extends Base0975<OliOkkns> implements Iface0621 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }

   public Object m2000(OliOkkns var1) {
      return var1.m6000();
   }

   public C0978(String var1, int var2) {
      super(var1, var2, (Nuker)Nuker.f1000[0]);
      this.m2000();
   }

   static {
      ntfClinit();
   }

   public C0978 m6000(boolean var1) {
      this.m2000();
      Boolean var6 = var1;
      this.f1000[0] = var6;
      return this;
   }

   public void m8000(OliOkkns var1) {
      NursultanClient.m68000().m18000(var1.m6000(), var1.m8000());
   }

   public OliOkkns m10000(int var1, ArrayValue var2) {
      return new OliOkkns(var2.get(0).asStringValue().asString(), var2.get(1).asIntegerValue().asLong());
   }

   public boolean m12000() {
      this.m2000();
      return (Boolean)this.f1000[0];
   }

   public List<OliOkkns> m18000() {
      return NursultanClient.m68000().m10000();
   }

   public void m14000(MessageBufferPacker var1, OliOkkns var2) throws IOException {
      var1.packArrayHeader(2);
      var1.packString(var2.m6000());
      var1.packLong(var2.m8000());
   }

   public void m18000(OliOkkns var1) {
      NursultanClient.m68000().m14000(var1.m6000());
   }

   public boolean m20000(OliOkkns var1, OliOkkns var2) {
      return (boolean)(var1.m8000() == var2.m8000() ? 1 : 0);
   }
}
