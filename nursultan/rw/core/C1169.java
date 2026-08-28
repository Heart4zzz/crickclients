package rw.core;

import java.time.Duration;
import rw.api.Iface0204;
import rw.api.Iface0659;
import rw.data.Rec0267;
import rw.defs.Enum0089;

public class C1169 implements Iface0204 {
   private static short[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static byte[] f7000;
   private static double[] f8000;
   public Object[] f9000;

   private static void m4000() {
      double[] var128 = new double[2];
      f8000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f8000[(1 | -1) >>> 31] = Double.longBitsToDouble(4607182418800017408L);
   }

   boolean m6000() {
      return (String)this.f9000[f4000[2]] != null ? f2000[0] : f2000[1];
   }

   private C1169() {
      this.m14000();
      C1197 var5 = new C1197((Enum0089)Enum0089.f1000[f6000[0]]);
      this.f9000[f6000[1]] = var5;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = 3;
   }

   private static void m10000() {
      boolean[] var128 = new boolean[5];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[2] = (boolean)((1 | -1) >>> 31);
      f2000[3] = (boolean)((0 | -0) >>> 31);
      f2000[4] = (boolean)((1 | -1) >>> 31);
   }

   float m12000() {
      return C0259.m4000(((C1197)this.f9000[f4000[1]]).m44000().floatValue());
   }

   private void m14000() {
      if (this.f9000 == null) {
         this.f9000 = new Object[f7000[0]];
         Object[] var1 = this.f9000;
      }
   }

   String m18000() {
      return (String)this.f9000[f4000[0]];
   }

   public boolean m22000(float var1) {
      ((C1197)this.f9000[f5000[0]]).m54000();
      if ((String)this.f9000[f5000[1]] != null && !((C1197)this.f9000[f5000[2]]).m6000()) {
         Object var6 = null;
         this.f9000[f5000[3]] = var6;
      }

      return f2000[4];
   }

   public boolean m24000() {
      return (String)this.f9000[f4000[3]] == null && !((C1197)this.f9000[f4000[4]]).m6000() ? f2000[3] : f2000[2];
   }

   void m30000(String var1) {
      if ((String)this.f9000[f6000[2]] == null) {
         this.f9000[f6000[3]] = var1;
      } else if (!((String)this.f9000[f6000[4]]).equals(var1)) {
         String var7 = (String)this.f9000[f6000[5]];
         this.f9000[f1000[0]] = var7;
         this.f9000[f1000[1]] = var1;
         ((C1197)this.f9000[f1000[2]]).m48000(f8000[0], Duration.ZERO, (Iface0659)C1182.f30000[f1000[3]]);
         ((C1197)this.f9000[f1000[4]]).m48000(f8000[1], (Duration)Rec0267.f9000[f3000[0]], (Iface0659)C1182.f30000[f3000[1]]);
      }
   }

   private static void m32000() {
      short[] var128 = new short[6];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[2] = (short)((1 | -1) >>> 31);
      f6000[3] = (short)((1 | -1) >>> 31);
      f6000[4] = (short)((1 | -1) >>> 31);
      f6000[5] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[5];
      f1000[(0 | -0) >>> 31] = 2;
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = 4;
      f1000[4] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[2];
      f3000[(0 | -0) >>> 31] = 2;
      f3000[(1 | -1) >>> 31] = 4;
      short[] var131 = new short[5];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = 2;
      f4000[3] = 2;
      f4000[4] = (short)((0 | -0) >>> 31);
      short[] var132 = new short[4];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = (short)((0 | -0) >>> 31);
      f5000[3] = 2;
   }
}
