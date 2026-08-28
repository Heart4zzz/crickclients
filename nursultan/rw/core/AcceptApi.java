package rw.core;

import rw.api.Iface0029;
import rw.defs.AcceptPart;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class AcceptApi implements PacketHandlers<Iface0029> {
   private static short[] f1000;
   private static byte[] f2000;
   public Object[] f3000;

   private static void m2000() {
      short[] var128 = new short[8];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = (short)((0 | -0) >>> 31);
      f1000[5] = (short)((1 | -1) >>> 31);
      f1000[6] = (short)((0 | -0) >>> 31);
      f1000[7] = (short)((1 | -1) >>> 31);
   }

   public AcceptApi() {
      this.m4000();
   }

   public AcceptApi(AcceptPart var1, String var2) {
      this.m4000();
      this.f3000[f1000[6]] = var1;
      this.f3000[f1000[7]] = var2;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[0]];
         Object[] var1 = this.f3000;
      }
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public String m8000() {
      return (String)this.f3000[f1000[5]];
   }

   public void m10000(PacketBuf var1) {
      AcceptPart var6 = var1.m88000(AcceptPart.class);
      this.f3000[f1000[0]] = var6;
      String var7 = var1.m10000();
      this.f3000[f1000[1]] = var7;
   }

   public void m14000(Iface0029 var1) {
      var1.m18000(this);
   }

   public AcceptPart m16000() {
      return (AcceptPart)this.f3000[f1000[4]];
   }

   public void m18000(PacketBuf var1) {
      var1.m80000((AcceptPart)this.f3000[f1000[2]]);
      var1.m70000((String)this.f3000[f1000[3]]);
   }
}
