package rw.core;

import rw.api.Iface0029;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class TimeApi3 implements PacketHandlers<Iface0029> {
   private static short[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public TimeApi3() {
      this.m4000();
   }

   public TimeApi3(String var1) {
      this.m4000();
      this.f2000[f1000[3]] = var1;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   public void m10000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f2000[f1000[0]] = var6;
   }

   public void m12000(PacketBuf var1) {
      var1.m70000((String)this.f2000[f1000[1]]);
   }

   public String m14000() {
      return (String)this.f2000[f1000[2]];
   }

   public void m20000(Iface0029 var1) {
      var1.m2000(this);
   }
}
