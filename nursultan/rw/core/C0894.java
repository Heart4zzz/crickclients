package rw.core;

import KDFzREm.NXi;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;
import rw.NursultanClient;
import rw.api.Iface0621;
import rw.defs.Nuker;

public class C0894 extends Base0975<WaypointXPart> implements Iface0621 {
   public Object[] f1000;

   public Object m2000(WaypointXPart var1) {
      return var1.m18000();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }

   public C0894(String var1, int var2) {
      super(var1, var2, (Nuker)Nuker.f1000[1]);
      this.m6000();
   }

   static {
      ntfClinit();
   }

   public C0894 m6000(boolean var1) {
      this.m6000();
      Boolean var6 = var1;
      this.f1000[0] = var6;
      return this;
   }

   public WaypointXPart m8000(int var1, ArrayValue var2) {
      String var3 = var2.get(0).asStringValue().asString();
      String var4 = var2.get(1).asStringValue().asString();
      double var5 = var2.get(2).asFloatValue().toDouble();
      double var7 = var2.get(3).asFloatValue().toDouble();
      double var9 = var2.get(4).asFloatValue().toDouble();
      return new WaypointXPart(var3, new NXi(var5, var7, var9), var4);
   }

   public void m10000(WaypointXPart var1) {
      NursultanClient.m96000().m30000(var1);
   }

   public boolean m12000() {
      this.m6000();
      return (Boolean)this.f1000[0];
   }

   public void m14000(MessageBufferPacker var1, WaypointXPart var2) throws IOException {
      NXi var3 = var2.m46000();
      var1.packArrayHeader(5);
      var1.packString(var2.m18000());
      var1.packString(var2.m16000());
      var1.packDouble(var3.M);
      var1.packDouble(var3.B);
      var1.packDouble(var3.Z);
   }

   public List<WaypointXPart> m18000() {
      return NursultanClient.m96000().m26000().stream().filter(WaypointXPart::m20000).toList();
   }

   public void m16000(WaypointXPart var1) {
      NursultanClient.m96000().m24000(var1.m18000());
   }

   public boolean m18000(WaypointXPart var1, WaypointXPart var2) {
      return (boolean)(Objects.equals(var1.m16000(), var2.m16000()) && var1.m46000().equals(var2.m46000()) ? 1 : 0);
   }
}
