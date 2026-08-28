package rw.core;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;
import rw.NursultanClient;
import rw.api.Iface0621;
import rw.data.Rec0305;
import rw.defs.Nuker;

public class C0990 extends Base0975<Rec0305> implements Iface0621 {
   public Object[] f1000;

   public void m2000(Rec0305 var1) {
      NursultanClient.m90000().m18000(var1.m2000(), var1.m8000(), var1.m10000());
   }

   public C0990(String var1, int var2) {
      super(var1, var2, (Nuker)Nuker.f1000[2]);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }

   public C0990 m6000(boolean var1) {
      this.m6000();
      Boolean var6 = var1;
      this.f1000[0] = var6;
      return this;
   }

   public void m8000(Rec0305 var1) {
      NursultanClient.m90000().m24000(var1.m2000());
   }

   public Rec0305 m10000(int var1, ArrayValue var2) {
      return new Rec0305(var2.get(0).asStringValue().asString(), var2.get(1).asStringValue().asString(), var2.get(2).asIntegerValue().asInt());
   }

   public boolean m12000() {
      this.m6000();
      return (Boolean)this.f1000[0];
   }

   public Object m14000(Rec0305 var1) {
      return var1.m2000();
   }

   public void m16000(MessageBufferPacker var1, Rec0305 var2) throws IOException {
      var1.packArrayHeader(3);
      var1.packString(var2.m2000());
      var1.packString(var2.m8000());
      var1.packInt(var2.m10000());
   }

   public List<Rec0305> m20000() {
      return NursultanClient.m90000().m4000();
   }

   public boolean m20000(Rec0305 var1, Rec0305 var2) {
      return (boolean)(var1.m10000() == var2.m10000() && Objects.equals(var1.m8000(), var2.m8000()) ? 1 : 0);
   }
}
