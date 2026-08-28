package rw.core;

import rw.api.Iface0029;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class IllillIms implements PacketHandlers<Iface0029> {
   private static short[] f1000;
   private static double[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   public Object[] f6000;
   private static boolean[] f7000;
   private static short[] f8000;

   public int m2000() {
      return (Integer)this.f6000[f5000[1]];
   }

   private static void m6000() {
      short[] var128 = new short[3];
      f8000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f8000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f8000[2] = 2;
      short[] var129 = new short[4];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((1 | -1) >>> 31);
      f1000[3] = 2;
      short[] var130 = new short[3];
      f4000[(0 | -0) >>> 31] = 3;
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      short[] var131 = new short[6];
      f5000[(0 | -0) >>> 31] = 2;
      f5000[(1 | -1) >>> 31] = 3;
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = (short)((1 | -1) >>> 31);
      f5000[4] = 2;
      f5000[5] = 3;
   }

   public IllillIms() {
      this.m12000();
   }

   public IllillIms(double var1, double var3, double var5, int var7) {
      this.m12000();
      Double var12 = var1;
      this.f6000[f5000[2]] = var12;
      Double var13 = var3;
      this.f6000[f5000[3]] = var13;
      Double var14 = var5;
      this.f6000[f5000[4]] = var14;
      Integer var15 = var7;
      this.f6000[f5000[5]] = var15;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[3];
      f7000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f7000[2] = (boolean)((0 | -0) >>> 31);
   }

   private static void m10000() {
      double[] var128 = new double[3];
      f2000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f2000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f2000[2] = Double.longBitsToDouble(0L);
   }

   private void m12000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f3000[0]];
         Object[] var1 = this.f6000;
         var1[f7000[0]] = f2000[0];
         var1[f7000[1]] = f2000[1];
         var1[f3000[1]] = f2000[2];
         var1[f3000[2]] = Integer.valueOf(f7000[2]);
      }
   }

   public double m14000() {
      return (Double)this.f6000[f4000[2]];
   }

   public void m20000(PacketBuf var1) {
      Double var6 = var1.m26000();
      this.f6000[f8000[0]] = var6;
      Double var7 = var1.m26000();
      this.f6000[f8000[1]] = var7;
      Double var8 = var1.m26000();
      this.f6000[f8000[2]] = var8;
      Integer var9 = var1.m94000();
      this.f6000[f1000[0]] = var9;
   }

   public double m22000() {
      return (Double)this.f6000[f4000[1]];
   }

   public double m26000() {
      return (Double)this.f6000[f5000[0]];
   }

   public void m28000(PacketBuf var1) {
      var1.m90000((Double)this.f6000[f1000[1]]);
      var1.m90000((Double)this.f6000[f1000[2]]);
      var1.m90000((Double)this.f6000[f1000[3]]);
      var1.m56000((Integer)this.f6000[f4000[0]]);
   }

   public void m34000(Iface0029 var1) {
      var1.m36000(this);
   }

   private static void m36000() {
      byte[] var128 = new byte[3];
      f3000[(0 | -0) >>> 31] = 4;
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = 3;
   }
}
