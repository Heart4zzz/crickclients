package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0117 implements PacketHandlers<Iface0027> {
   public Object[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static boolean[] f8000;
   private static double[] f9000;

   public double m2000() {
      return (Double)this.f1000[f7000[2]];
   }

   private static void m6000() {
      double[] var128 = new double[3];
      f9000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f9000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f9000[2] = Double.longBitsToDouble(0L);
   }

   public C0117() {
      this.m16000();
   }

   public C0117(String var1, int var2, double var3, double var5, double var7, int var9) {
      this.m16000();
      this.f1000[f6000[0]] = var1;
      Integer var15 = var2;
      this.f1000[f6000[1]] = var15;
      Double var16 = var3;
      this.f1000[f6000[2]] = var16;
      Double var17 = var5;
      this.f1000[f6000[3]] = var17;
      Double var18 = var7;
      this.f1000[f6000[4]] = var18;
      Integer var19 = var9;
      this.f1000[f6000[5]] = var19;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[5];
      f2000[(0 | -0) >>> 31] = 6;
      f2000[(1 | -1) >>> 31] = 2;
      f2000[2] = 3;
      f2000[3] = 4;
      f2000[4] = 5;
   }

   private static void m10000() {
      boolean[] var128 = new boolean[3];
      f8000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((0 | -0) >>> 31);
   }

   public String m12000() {
      return (String)this.f1000[f4000[5]];
   }

   private static void m14000() {
      short[] var128 = new short[3];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = 2;
      short[] var129 = new short[4];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 4;
      f3000[2] = 5;
      f3000[3] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[7];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = 2;
      f4000[2] = 3;
      f4000[3] = 4;
      f4000[4] = 5;
      f4000[5] = (short)((0 | -0) >>> 31);
      f4000[6] = (short)((1 | -1) >>> 31);
      short[] var131 = new short[4];
      f7000[(0 | -0) >>> 31] = 2;
      f7000[(1 | -1) >>> 31] = 3;
      f7000[2] = 4;
      f7000[3] = 5;
      short[] var132 = new short[6];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f6000[2] = 2;
      f6000[3] = 3;
      f6000[4] = 4;
      f6000[5] = 5;
   }

   private void m16000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f2000[0]];
         Object[] var1 = this.f1000;
         var1[f8000[0]] = Integer.valueOf(f8000[1]);
         var1[f2000[1]] = f9000[0];
         var1[f2000[2]] = f9000[1];
         var1[f2000[3]] = f9000[2];
         var1[f2000[4]] = Integer.valueOf(f8000[2]);
      }
   }

   public double m18000() {
      return (Double)this.f1000[f7000[0]];
   }

   public int m22000() {
      return (Integer)this.f1000[f4000[6]];
   }

   public void m24000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f1000[f5000[0]] = var6;
      Integer var7 = var1.m94000();
      this.f1000[f5000[1]] = var7;
      Double var8 = var1.m26000();
      this.f1000[f5000[2]] = var8;
      Double var9 = var1.m26000();
      this.f1000[f3000[0]] = var9;
      Double var10 = var1.m26000();
      this.f1000[f3000[1]] = var10;
      Integer var11 = var1.m94000();
      this.f1000[f3000[2]] = var11;
   }

   public void m28000(Iface0027 var1) {
      var1.m18000(this);
   }

   public double m30000() {
      return (Double)this.f1000[f7000[1]];
   }

   public void m34000(PacketBuf var1) {
      var1.m70000((String)this.f1000[f3000[3]]);
      var1.m56000((Integer)this.f1000[f4000[0]]);
      var1.m90000((Double)this.f1000[f4000[1]]);
      var1.m90000((Double)this.f1000[f4000[2]]);
      var1.m90000((Double)this.f1000[f4000[3]]);
      var1.m56000((Integer)this.f1000[f4000[4]]);
   }

   public int m40000() {
      return (Integer)this.f1000[f7000[3]];
   }
}
