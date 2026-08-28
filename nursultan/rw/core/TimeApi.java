package rw.core;

import rw.api.Iface0029;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class TimeApi implements PacketHandlers<Iface0029> {
   private static short[] f1000;
   public Object[] f2000;
   private static boolean[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((0 | -0) >>> 31);
   }

   public TimeApi(int var1) {
      this.m4000();
      Integer var6 = var1;
      this.f2000[f1000[3]] = var6;
   }

   public TimeApi() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[0]];
         Object[] var1 = this.f2000;
         var1[f3000[1]] = Integer.valueOf(f3000[2]);
      }
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   public void m8000(PacketBuf var1) {
      Integer var6 = Integer.valueOf(var1.m58000());
      this.f2000[f1000[0]] = var6;
   }

   public void m12000(PacketBuf var1) {
      var1.m2000((Integer)this.f2000[f1000[1]]);
   }

   public int m18000() {
      return (Integer)this.f2000[f1000[2]];
   }

   public void m20000(Iface0029 var1) {
      var1.m4000(this);
   }
}
