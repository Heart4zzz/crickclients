package rw.core;

import rw.api.Iface0029;
import rw.defs.AcceptPart2;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class AcceptApi2 implements PacketHandlers<Iface0029> {
   private static short[] f1000;
   private static byte[] f2000;
   public Object[] f3000;

   private void m2000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[0]];
         Object[] var1 = this.f3000;
      }
   }

   public AcceptApi2() {
      this.m2000();
   }

   public AcceptApi2(AcceptPart2 var1, String var2) {
      this.m2000();
      this.f3000[f1000[6]] = var1;
      this.f3000[f1000[7]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      short[] var128 = new short[8];
      f1000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
      f1000[6] = (short)((0 | -0) >>> 31);
      f1000[7] = (short)((1 | -1) >>> 31);
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public AcceptPart2 m10000() {
      return (AcceptPart2)this.f3000[f1000[4]];
   }

   public void m12000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f3000[f1000[0]] = var6;
      AcceptPart2 var7 = var1.m88000(AcceptPart2.class);
      this.f3000[f1000[1]] = var7;
   }

   public void m16000(Iface0029 var1) {
      var1.m30000(this);
   }

   public void m20000(PacketBuf var1) {
      var1.m70000((String)this.f3000[f1000[2]]);
      var1.m80000((AcceptPart2)this.f3000[f1000[3]]);
   }

   public String m22000() {
      return (String)this.f3000[f1000[5]];
   }
}
