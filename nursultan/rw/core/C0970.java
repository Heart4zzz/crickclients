package rw.core;

import KDFzREm.NNNZg;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import java.time.Duration;
import rw.api.Iface0659;
import rw.defs.Enum0089;
import rw.gui.IlkOns;

public class C0970 extends AutomaticPartPartPart {
   private static short[] f1000;
   private static short[] f2000;
   private static byte[] f3000;
   public Object[] f4000;
   private static float[] f5000;
   private static double[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static boolean[] f9000;
   private static long[] f10000;

   public C1197 m2000() {
      this.m20000();
      return (C1197)this.f4000[f7000[1]];
   }

   public C1197 m4000() {
      this.m20000();
      return (C1197)this.f4000[f7000[0]];
   }

   public C0970(String var1, int var2, NXi var3, String var4, int var5) {
      super(var1, var3, Duration.ofSeconds(f10000[0]), var4);
      this.m20000();
      C1197 var10 = new C1197((Enum0089)Enum0089.f1000[f1000[0]]);
      this.f4000[f1000[1]] = var10;
      C1197 var11 = new C1197((Enum0089)Enum0089.f1000[f1000[2]]);
      this.f4000[f1000[3]] = var11;
      Integer var12 = var2;
      this.f4000[f1000[4]] = var12;
      Integer var13 = var5;
      this.f4000[f2000[0]] = var13;
      this.f4000[f2000[1]] = var3;
      ((C1197)this.f4000[f2000[2]]).m48000(f6000[0], Duration.ofMillis(f10000[1]), (Iface0659)C1182.f30000[f2000[3]]);
      ((C1197)this.f4000[f2000[4]]).m48000(f6000[1], Duration.ofMillis(f10000[2]), (Iface0659)C1182.f30000[f2000[5]]);
   }

   static {
      ntfClinit();
   }

   public NXi m8000() {
      this.m20000();
      return (NXi)this.f4000[f7000[4]];
   }

   public int m10000() {
      this.m20000();
      return (Integer)this.f4000[f7000[2]];
   }

   private static void m14000() {
      double[] var128 = new double[2];
      f6000[(0 | -0) >>> 31] = Double.longBitsToDouble(4607182418800017408L);
      f6000[(1 | -1) >>> 31] = Double.longBitsToDouble(4607182418800017408L);
   }

   private static void m16000() {
      long[] var128 = new long[3];
      f10000[(0 | -0) >>> 31] = 30L;
      f10000[(1 | -1) >>> 31] = 2200L;
      f10000[2] = 250L;
   }

   private static void m18000() {
      byte[] var128 = new byte[5];
      f3000[(0 | -0) >>> 31] = -1;
      f3000[(1 | -1) >>> 31] = -1;
      f3000[2] = 5;
      f3000[3] = 2;
      f3000[4] = 3;
   }

   private void m20000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f3000[2]];
         Object[] var1 = this.f4000;
         var1[f3000[3]] = Integer.valueOf(f9000[2]);
         var1[f3000[4]] = Integer.valueOf(f9000[3]);
      }
   }

   private static void m22000() {
      short[] var128 = new short[5];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((1 | -1) >>> 31);
      f1000[4] = 2;
      short[] var129 = new short[6];
      f2000[(0 | -0) >>> 31] = 3;
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = 4;
      f2000[4] = (short)((1 | -1) >>> 31);
      f2000[5] = 4;
      short[] var130 = new short[5];
      f8000[(0 | -0) >>> 31] = 3;
      f8000[(1 | -1) >>> 31] = 3;
      f8000[2] = 3;
      f8000[3] = 3;
      f8000[4] = 3;
      short[] var131 = new short[5];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[2] = 2;
      f7000[3] = 3;
      f7000[4] = 4;
   }

   private static void m24000() {
      boolean[] var128 = new boolean[4];
      f9000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f9000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f9000[2] = (boolean)((0 | -0) >>> 31);
      f9000[3] = (boolean)((0 | -0) >>> 31);
   }

   public NXi m28000() {
      this.m20000();
      if ((Integer)this.f4000[f8000[1]] == f3000[1]) {
         return super.W();
      } else {
         NNuU var1 = NNuU.Nq();
         if ((NNNZg)var1.T[f8000[2]] != null) {
            NbK var2 = ((NNNZg)var1.T[f8000[3]]).method_8469((Integer)this.f4000[f8000[4]]);
            if (var2 != null) {
               return new NXi(IlkOns.m26000(var2), IlkOns.m34000(var2) + var2.method_17682() / f5000[0], IlkOns.m4000(var2));
            }
         }

         return super.W();
      }
   }

   public int m32000() {
      this.m20000();
      return (Integer)this.f4000[f7000[3]];
   }

   public Class<? extends OlqsjOqn<?>> m34000() {
      return C0963.class;
   }

   public boolean m40000() {
      this.m20000();
      return this.f4000[f8000[0]] != f3000[0] ? f9000[0] : f9000[1];
   }

   private static void m42000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = Float.intBitsToFloat(1073741824);
   }
}
