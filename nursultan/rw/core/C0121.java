package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0121 implements PacketHandlers<Iface0027> {
   private static boolean[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static long[] f4000;
   private static byte[] f5000;

   private static void m2000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = 2;
   }

   private static void m6000() {
      long[] var128 = new long[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 0L;
   }

   public C0121() {
      this.m32000();
   }

   public C0121(String var1, long var2) {
      this.m32000();
      this.f3000[f2000[6]] = var1;
      Long var9 = var2;
      this.f3000[f2000[7]] = var9;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[8];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((1 | -1) >>> 31);
      f2000[6] = (short)((0 | -0) >>> 31);
      f2000[7] = (short)((1 | -1) >>> 31);
   }

   private static void m12000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public void m14000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f3000[f2000[0]] = var6;
      Long var7 = var1.m8000();
      this.f3000[f2000[1]] = var7;
   }

   public String m16000() {
      return (String)this.f3000[f2000[4]];
   }

   public long m24000() {
      return (Long)this.f3000[f2000[5]];
   }

   public void m28000(PacketBuf var1) {
      var1.m70000((String)this.f3000[f2000[2]]);
      var1.m84000((Long)this.f3000[f2000[3]]);
   }

   public void m30000(Iface0027 var1) {
      var1.m28000(this);
   }

   private void m32000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f5000[0]];
         Object[] var1 = this.f3000;
         var1[f1000[0]] = f4000[0];
      }
   }
}
