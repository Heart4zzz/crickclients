package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class IljOmq implements PacketHandlers<Iface0027> {
   private static short[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public IljOmq() {
      this.m6000();
   }

   public IljOmq(String var1) {
      this.m6000();
      this.f3000[f1000[3]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[0]];
         Object[] var1 = this.f3000;
      }
   }

   public void m8000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f3000[f1000[0]] = var6;
   }

   public void m14000(PacketBuf var1) {
      var1.m70000((String)this.f3000[f1000[1]]);
   }

   public void m18000(Iface0027 var1) {
      var1.m34000(this);
   }

   public String m20000() {
      return (String)this.f3000[f1000[2]];
   }
}
