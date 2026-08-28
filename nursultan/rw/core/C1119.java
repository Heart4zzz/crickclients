package rw.core;

import KDFzREm.NjL;
import java.time.Duration;
import rw.api.Iface0204;
import rw.api.Iface0659;
import rw.defs.Enum0089;
import rw.gui.C0140;

public class C1119 implements Iface0204 {
   private static short[] f1000;
   private static double[] f2000;
   private static short[] f3000;
   private static float[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static String[] f7000;
   private static boolean[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static byte[] f11000;
   private static boolean[] f12000;
   private static short[] f13000;
   public Object[] f14000;
   private static short[] f15000;

   @Override
   boolean m2000() {
      return this.m18000() && ((String)this.f14000[f1000[1]]).length() != ((String)this.f14000[f1000[2]]).length() ? f8000[0] : f8000[1];
   }

   private static void m6000() {
      boolean[] var128 = new boolean[4];
      f12000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f12000[2] = (boolean)((1 | -1) >>> 31);
      f12000[3] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[8];
      f8000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((1 | -1) >>> 31);
      f8000[3] = (boolean)((0 | -0) >>> 31);
      f8000[4] = (boolean)((1 | -1) >>> 31);
      f8000[5] = (boolean)((0 | -0) >>> 31);
      f8000[6] = (boolean)((1 | -1) >>> 31);
      f8000[7] = (boolean)((0 | -0) >>> 31);
   }

   boolean m8000(int var1) {
      return this.m18000()
            && ((String)this.f14000[f1000[3]]).length() == ((String)this.f14000[f1000[4]]).length()
            && ((String)this.f14000[f1000[5]]).charAt(var1) != ((String)this.f14000[f1000[6]]).charAt(var1)
         ? f8000[2]
         : f8000[3];
   }

   private C1119() {
      this.m26000();
      C1197 var5 = new C1197((Enum0089)Enum0089.f1000[f6000[0]]);
      this.f14000[f6000[1]] = var5;
      String var6 = f7000[0];
      this.f14000[f6000[2]] = var6;
      Integer var7 = Integer.valueOf(f12000[0]);
      this.f14000[f6000[3]] = var7;
   }

   static {
      ntfClinit();
   }

   private static void m10000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   private static void m12000() {
      double[] var128 = new double[3];
      f2000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f2000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f2000[2] = Double.longBitsToDouble(4607182418800017408L);
   }

   private static void m16000() {
      f7000 = new String[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = m44000("");
   }

   private boolean m18000() {
      return (String)this.f14000[f1000[0]] != null ? f12000[2] : f12000[3];
   }

   int m20000() {
      return (Integer)this.f14000[f13000[4]];
   }

   String m22000() {
      return (String)this.f14000[f13000[2]];
   }

   private void m26000() {
      if (this.f14000 == null) {
         this.f14000 = new Object[f11000[1]];
         Object[] var1 = this.f14000;
         var1[f11000[2]] = f4000[0];
         var1[f11000[3]] = Integer.valueOf(f8000[7]);
      }
   }

   private static void m30000() {
      short[] var128 = new short[6];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = 2;
      f6000[3] = 5;
      f6000[4] = (short)((1 | -1) >>> 31);
      f6000[5] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[4];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 3;
      f3000[2] = 4;
      f3000[3] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[3];
      f5000[(0 | -0) >>> 31] = 4;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 4;
      short[] var131 = new short[5];
      f10000[(0 | -0) >>> 31] = 4;
      f10000[(1 | -1) >>> 31] = 5;
      f10000[2] = 2;
      f10000[3] = 3;
      f10000[4] = 2;
      short[] var132 = new short[4];
      f9000[(0 | -0) >>> 31] = 4;
      f9000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f9000[2] = 4;
      f9000[3] = (short)((0 | -0) >>> 31);
      short[] var133 = new short[6];
      f13000[(0 | -0) >>> 31] = 2;
      f13000[(1 | -1) >>> 31] = 4;
      f13000[2] = 2;
      f13000[3] = 3;
      f13000[4] = 5;
      f13000[5] = (short)((0 | -0) >>> 31);
      short[] var134 = new short[7];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 2;
      f1000[3] = 3;
      f1000[4] = 2;
      f1000[5] = 3;
      f1000[6] = 2;
      short[] var135 = new short[6];
      f15000[(0 | -0) >>> 31] = 3;
      f15000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f15000[2] = (short)((0 | -0) >>> 31);
      f15000[3] = 3;
      f15000[4] = (short)((0 | -0) >>> 31);
      f15000[5] = 3;
   }

   float m32000() {
      return C0259.m4000(((C1197)this.f14000[f13000[5]]).m44000().floatValue());
   }

   public boolean m34000() {
      return (String)this.f14000[f15000[0]] == null && !((C1197)this.f14000[f15000[1]]).m6000() ? f8000[5] : f8000[4];
   }

   public boolean m38000(float var1) {
      ((C1197)this.f14000[f15000[2]]).m54000();
      if ((String)this.f14000[f15000[3]] != null && !((C1197)this.f14000[f15000[4]]).m6000()) {
         Object var6 = null;
         this.f14000[f15000[5]] = var6;
      }

      return f8000[6];
   }

   void m42000(NjL var1, String var2, float var3) {
      if ((NjL)this.f14000[f6000[4]] != var1) {
         this.f14000[f6000[5]] = var1;
         this.f14000[f3000[0]] = var2;
         Object var10 = null;
         this.f14000[f3000[1]] = var10;
         Float var11 = var3;
         this.f14000[f3000[2]] = var11;
         ((C1197)this.f14000[f3000[3]]).m48000(f2000[0], Duration.ZERO, (Iface0659)C1182.f30000[f5000[0]]);
      } else if (((String)this.f14000[f5000[1]]).equals(var2)) {
         Float var12 = var3;
         this.f14000[f5000[2]] = var12;
      } else {
         Integer var13 = Integer.valueOf(var3 < this.f14000[f10000[0]] ? f12000[1] : f11000[0]);
         this.f14000[f10000[1]] = var13;
         String var14 = (String)this.f14000[f10000[2]];
         this.f14000[f10000[3]] = var14;
         this.f14000[f10000[4]] = var2;
         Float var16 = var3;
         this.f14000[f9000[0]] = var16;
         ((C1197)this.f14000[f9000[1]]).m48000(f2000[1], Duration.ZERO, (Iface0659)C1182.f30000[f9000[2]]);
         ((C1197)this.f14000[f9000[3]]).m48000(f2000[2], (Duration)C0140.f49000[f13000[0]], (Iface0659)C1182.f30000[f13000[1]]);
      }
   }

   String m46000() {
      return (String)this.f14000[f13000[3]];
   }

   private static void m50000() {
      byte[] var128 = new byte[4];
      f11000[(0 | -0) >>> 31] = -1;
      f11000[(1 | -1) >>> 31] = 6;
      f11000[2] = 4;
      f11000[3] = 5;
   }
}
