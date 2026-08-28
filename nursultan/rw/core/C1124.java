package rw.core;

import KDFzREm.NjL;
import java.time.Duration;
import rw.api.Iface0204;
import rw.api.Iface0659;
import rw.defs.Enum0089;
import rw.gui.C0140;

public class C1124 implements Iface0204 {
   public Object[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   private static short[] f4000;
   private static boolean[] f5000;
   private static short[] f6000;
   private static float[] f7000;

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m6000() {
      short[] var128 = new short[7];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = 2;
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((0 | -0) >>> 31);
      f2000[6] = 2;
      short[] var129 = new short[4];
      f6000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f6000[2] = 4;
      f6000[3] = 2;
      short[] var130 = new short[7];
      f4000[(0 | -0) >>> 31] = 2;
      f4000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = 4;
      f4000[4] = (short)((1 | -1) >>> 31);
      f4000[5] = (short)((1 | -1) >>> 31);
      f4000[6] = (short)((1 | -1) >>> 31);
   }

   private C1124() {
      this.m16000();
      C1197 var5 = new C1197((Enum0089)Enum0089.f1000[f2000[0]]);
      this.f1000[f2000[1]] = var5;
      Float var6 = f7000[0];
      this.f1000[f2000[2]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[2];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = 2;
   }

   float m12000() {
      return ((C1197)this.f1000[f4000[4]]).m44000().floatValue();
   }

   private void m16000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[0]];
         Object[] var1 = this.f1000;
         var1[f3000[1]] = f7000[1];
      }
   }

   public boolean m18000(float var1) {
      ((C1197)this.f1000[f4000[6]]).m54000();
      return f5000[2];
   }

   void m22000(NjL var1, float var2) {
      if ((NjL)this.f1000[f2000[3]] != var1) {
         boolean var3 = (NjL)this.f1000[f2000[4]] == null ? f5000[0] : f5000[1];
         this.f1000[f2000[5]] = var1;
         Float var9 = var2;
         this.f1000[f2000[6]] = var9;
         ((C1197)this.f1000[f6000[0]]).m48000(var2, var3 ? Duration.ZERO : (Duration)C0140.f49000[f6000[1]], (Iface0659)C1182.f30000[f6000[2]]);
      } else if (Float.compare((Float)this.f1000[f6000[3]], var2) != 0) {
         Float var10 = var2;
         this.f1000[f4000[0]] = var10;
         ((C1197)this.f1000[f4000[1]]).m48000(var2, (Duration)C0140.f49000[f4000[2]], (Iface0659)C1182.f30000[f4000[3]]);
      }
   }

   public boolean m24000() {
      return ((C1197)this.f1000[f4000[5]]).m6000();
   }

   private static void m26000() {
      float[] var128 = new float[2];
      f7000[(0 | -0) >>> 31] = Float.intBitsToFloat(2143289344);
      f7000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }
}
