package rw.core;

import rw.api.Iface0029;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class TimeApi4 implements PacketHandlers<Iface0029> {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;

   private static void m2000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = 2;
   }

   public TimeApi4(String var1, String var2) {
      this.m6000();
      this.f2000[f1000[6]] = var1;
      this.f2000[f1000[7]] = var2;
   }

   public TimeApi4() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
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

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }

   public String m8000() {
      return (String)this.f2000[f1000[4]];
   }

   public void m12000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f2000[f1000[0]] = var6;
      String var7 = var1.m10000();
      this.f2000[f1000[1]] = var7;
   }

   public void m18000(PacketBuf var1) {
      var1.m70000((String)this.f2000[f1000[2]]);
      var1.m70000((String)this.f2000[f1000[3]]);
   }

   public String m20000() {
      return (String)this.f2000[f1000[5]];
   }

   public void m22000(Iface0029 var1) {
      var1.m34000(this);
   }
}
