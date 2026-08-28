package rw.core;

import rw.api.Iface0029;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C1214 implements PacketHandlers<Iface0029> {
   private static byte[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static boolean[] f4000;
   private static double[] f5000;
   private static short[] f6000;

   public double m4000() {
      return (Double)this.f3000[f6000[1]];
   }

   private void m6000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f1000[0]];
         Object[] var1 = this.f3000;
         var1[f4000[0]] = f5000[0];
         var1[f4000[1]] = f5000[1];
         var1[f1000[1]] = f5000[2];
      }
   }

   public C1214() {
      this.m6000();
   }

   public C1214(double var1, double var3, double var5) {
      this.m6000();
      Double var11 = var1;
      this.f3000[f6000[4]] = var11;
      Double var12 = var3;
      this.f3000[f6000[5]] = var12;
      Double var13 = var5;
      this.f3000[f6000[6]] = var13;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[5];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = 2;
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[7];
      f6000[(0 | -0) >>> 31] = 2;
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((1 | -1) >>> 31);
      f6000[3] = 2;
      f6000[4] = (short)((0 | -0) >>> 31);
      f6000[5] = (short)((1 | -1) >>> 31);
      f6000[6] = 2;
   }

   private static void m10000() {
      double[] var128 = new double[3];
      f5000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f5000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f5000[2] = Double.longBitsToDouble(0L);
   }

   private static void m14000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public void m16000(PacketBuf var1) {
      Double var6 = var1.m26000();
      this.f3000[f2000[0]] = var6;
      Double var7 = var1.m26000();
      this.f3000[f2000[1]] = var7;
      Double var8 = var1.m26000();
      this.f3000[f2000[2]] = var8;
   }

   public double m20000() {
      return (Double)this.f3000[f6000[3]];
   }

   public double m28000() {
      return (Double)this.f3000[f6000[2]];
   }

   public void m30000(PacketBuf var1) {
      var1.m90000((Double)this.f3000[f2000[3]]);
      var1.m90000((Double)this.f3000[f2000[4]]);
      var1.m90000((Double)this.f3000[f6000[0]]);
   }

   public void m32000(Iface0029 var1) {
      var1.m32000(this);
   }

   private static void m34000() {
      byte[] var128 = new byte[2];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 2;
   }
}
