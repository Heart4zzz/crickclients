package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0122 implements PacketHandlers<Iface0027> {
   private static short[] f1000;
   private static short[] f2000;
   private static double[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   public Object[] f6000;
   private static byte[] f7000;

   public double m2000() {
      return (Double)this.f6000[f4000[2]];
   }

   private void m6000() {
      if (this.f6000 == null) {
         this.f6000 = new Object[f7000[0]];
         Object[] var1 = this.f6000;
         var1[f7000[1]] = f3000[0];
         var1[f7000[2]] = f3000[1];
         var1[f7000[3]] = f3000[2];
      }
   }

   public C0122(String var1, String var2, double var3, double var5, double var7) {
      this.m6000();
      this.f6000[f4000[5]] = var1;
      this.f6000[f4000[6]] = var2;
      Double var15 = var3;
      this.f6000[f4000[7]] = var15;
      Double var16 = var5;
      this.f6000[f1000[0]] = var16;
      Double var17 = var7;
      this.f6000[f1000[1]] = var17;
   }

   public C0122() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[4];
      f7000[(0 | -0) >>> 31] = 5;
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = 3;
      f7000[3] = 4;
   }

   private static void m10000() {
      short[] var128 = new short[3];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[2] = 2;
      short[] var129 = new short[7];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
      f2000[4] = 2;
      f2000[5] = 3;
      f2000[6] = 4;
      short[] var130 = new short[8];
      f4000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[2] = 2;
      f4000[3] = 3;
      f4000[4] = 4;
      f4000[5] = (short)((0 | -0) >>> 31);
      f4000[6] = (short)((1 | -1) >>> 31);
      f4000[7] = 2;
      short[] var131 = new short[2];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 4;
   }

   public String m12000() {
      return (String)this.f6000[f4000[1]];
   }

   public String m14000() {
      return (String)this.f6000[f4000[0]];
   }

   public double m16000() {
      return (Double)this.f6000[f4000[4]];
   }

   public void m20000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f6000[f5000[0]] = var6;
      String var7 = var1.m10000();
      this.f6000[f5000[1]] = var7;
      Double var8 = var1.m26000();
      this.f6000[f5000[2]] = var8;
      Double var9 = var1.m26000();
      this.f6000[f2000[0]] = var9;
      Double var10 = var1.m26000();
      this.f6000[f2000[1]] = var10;
   }

   public double m26000() {
      return (Double)this.f6000[f4000[3]];
   }

   public void m28000(Iface0027 var1) {
      var1.m12000(this);
   }

   public void m30000(PacketBuf var1) {
      var1.m70000((String)this.f6000[f2000[2]]);
      var1.m70000((String)this.f6000[f2000[3]]);
      var1.m90000((Double)this.f6000[f2000[4]]);
      var1.m90000((Double)this.f6000[f2000[5]]);
      var1.m90000((Double)this.f6000[f2000[6]]);
   }

   private static void m34000() {
      double[] var128 = new double[3];
      f3000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f3000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f3000[2] = Double.longBitsToDouble(0L);
   }
}
