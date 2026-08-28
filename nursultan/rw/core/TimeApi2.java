package rw.core;

import rw.api.Iface0029;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class TimeApi2 implements PacketHandlers<Iface0029> {
   public Object[] f1000;
   private static short[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   private static byte[] f5000;

   public String m4000() {
      return (String)this.f1000[f2000[1]];
   }

   private static void m6000() {
      byte[] var128 = new byte[2];
      f5000[(0 | -0) >>> 31] = 3;
      f5000[(1 | -1) >>> 31] = 2;
   }

   public TimeApi2(String var1, String var2, int var3) {
      this.m10000();
      this.f1000[f2000[3]] = var1;
      this.f1000[f2000[4]] = var2;
      Integer var10 = var3;
      this.f1000[f2000[5]] = var10;
   }

   public TimeApi2() {
      this.m10000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[6];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[2] = 2;
      f4000[3] = (short)((0 | -0) >>> 31);
      f4000[4] = (short)((1 | -1) >>> 31);
      f4000[5] = 2;
      short[] var129 = new short[6];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = 2;
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((1 | -1) >>> 31);
      f2000[5] = 2;
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f5000[0]];
         Object[] var1 = this.f1000;
         var1[f5000[1]] = Integer.valueOf(f3000[0]);
      }
   }

   public String m12000() {
      return (String)this.f1000[f2000[0]];
   }

   public void m16000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f1000[f4000[0]] = var6;
      String var7 = var1.m10000();
      this.f1000[f4000[1]] = var7;
      Integer var8 = var1.m94000();
      this.f1000[f4000[2]] = var8;
   }

   public int m20000() {
      return (Integer)this.f1000[f2000[2]];
   }

   public void m24000(PacketBuf var1) {
      var1.m70000((String)this.f1000[f4000[3]]);
      var1.m70000((String)this.f1000[f4000[4]]);
      var1.m56000((Integer)this.f1000[f4000[5]]);
   }

   public void m26000(Iface0029 var1) {
      var1.m12000(this);
   }

   private static void m28000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }
}
