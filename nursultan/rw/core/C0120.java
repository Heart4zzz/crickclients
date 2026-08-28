package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0120 implements PacketHandlers<Iface0027> {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static long[] f4000;

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[0]];
         Object[] var1 = this.f2000;
         var1[f1000[1]] = f4000[0];
      }
   }

   public C0120(long var1) {
      this.m2000();
      Long var7 = var1;
      this.f2000[f3000[3]] = var7;
   }

   public C0120() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m6000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public void m10000(PacketBuf var1) {
      Long var6 = var1.m8000();
      this.f2000[f3000[0]] = var6;
   }

   private static void m14000() {
      long[] var128 = new long[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 0L;
   }

   public void m16000(Iface0027 var1) {
      var1.m10000(this);
   }

   public long m20000() {
      return (Long)this.f2000[f3000[2]];
   }

   public void m24000(PacketBuf var1) {
      var1.m84000((Long)this.f2000[f3000[1]]);
   }
}
