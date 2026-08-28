package rw.core;

import java.io.IOException;
import java.util.List;
import java.util.UUID;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;
import rw.NursultanClient;
import rw.api.Iface0640;
import rw.data.Rec0196;
import rw.data.Rec0303;

public class C0980 extends Base0975<Noqodls> {
   public static Object[] f1000;

   public Object m2000(Noqodls var1) {
      return var1.m38000();
   }

   public C0980(String var1, int var2) {
      super(var1, var2, null);
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      f1000 = new Object[]{0, 1};
   }

   public Noqodls m4000(int var1, ArrayValue var2) {
      int var3 = var2.get(0).asIntegerValue().asInt();
      if (var3 == 0) {
         String var11 = var2.get(1).asStringValue().asString();
         long var12 = var2.get(2).asIntegerValue().asLong();
         boolean var13 = var2.get(3).asBooleanValue().getBoolean();
         boolean var14 = var2.get(4).asBooleanValue().getBoolean();
         UUID var15 = var14 ? new UUID(var2.get(5).asIntegerValue().asLong(), var2.get(6).asIntegerValue().asLong()) : null;
         boolean var16 = var2.get(7).asBooleanValue().getBoolean();
         return new Noqodls(new Rec0303(var11, var15, var13), var16, var12);
      } else {
         String var4 = var2.get(1).asStringValue().asString();
         long var5 = var2.get(2).asIntegerValue().asLong();
         UUID var7 = new UUID(var2.get(3).asIntegerValue().asLong(), var2.get(4).asIntegerValue().asLong());
         boolean var8 = var2.get(5).asBooleanValue().getBoolean();
         byte[] var9 = var2.get(6).asBinaryValue().asByteArray();
         boolean var10 = var2.get(7).asBooleanValue().getBoolean();
         return new Noqodls(new Rec0196(var8, var7, var4, var9), var10, var5);
      }
   }

   public void m6000(Noqodls var1) {
      NursultanClient.m48000().m22000(var1);
   }

   public void m8000(MessageBufferPacker var1, Noqodls var2) throws IOException {
      Iface0640 var3 = var2.m14000();
      if (var3 instanceof Rec0303 var6) {
         UUID var7 = var6.m12000();
         var1.packArrayHeader(8);
         var1.packInt(0);
         var1.packString(var6.m14000());
         var1.packLong(var2.m6000());
         var1.packBoolean(var6.m28000());
         var1.packBoolean((boolean)(var7 != null ? 1 : 0));
         var1.packLong(var7 != null ? var7.getMostSignificantBits() : 0L);
         var1.packLong(var7 != null ? var7.getLeastSignificantBits() : 0L);
         var1.packBoolean(var2.m24000());
      } else {
         Rec0196 var4 = (Rec0196)var3;
         byte[] var5 = var4.m26000();
         var1.packArrayHeader(8);
         var1.packInt(1);
         var1.packString(var4.m16000());
         var1.packLong(var2.m6000());
         var1.packLong(var4.m18000().getMostSignificantBits());
         var1.packLong(var4.m18000().getLeastSignificantBits());
         var1.packBoolean(var4.m14000());
         var1.packBinaryHeader(var5.length);
         var1.writePayload(var5);
         var1.packBoolean(var2.m24000());
      }
   }

   public void m10000(Noqodls var1) {
      NursultanClient.m48000().m32000(var1);
   }

   public boolean m12000(Noqodls var1, Noqodls var2) {
      return (boolean)(var1.m2000() == var2.m2000() && var1.m20000().equals(var2.m20000()) && var1.m6000() == var2.m6000() && var1.m24000() == var2.m24000()
         ? 1
         : 0);
   }

   public List<Noqodls> m16000() {
      return NursultanClient.m48000().m16000();
   }
}
