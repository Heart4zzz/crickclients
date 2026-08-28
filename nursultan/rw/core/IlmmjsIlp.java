package rw.core;

import KDFzREm.NHS;
import KDFzREm.NNNZg;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import java.util.List;
import org.joml.Vector3d;

public class IlmmjsIlp {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static double[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;
   private static short[] f7000;
   public static Object[] f8000;
   private static float[] f9000;
   private static short[] f10000;
   private static boolean[] f11000;
   private static short[] f12000;
   private static float[] f13000;
   private static double[] f14000;
   private static double[] f15000;
   private static short[] f16000;
   private static double[] f17000;
   private static double[] f18000;
   private static short[] f19000;
   public Object[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static byte[] f23000;
   private static short[] f24000;
   private static double[] f25000;
   public Object[] f26000;
   private static short[] f27000;
   private static short[] f28000;
   private static short[] f29000;
   public Object[] f30000;
   public Object[] f31000;
   private static short[] f32000;
   private static short[] f33000;
   private static short[] f34000;
   private static short[] f35000;
   private static short[] f36000;
   private static float[] f37000;
   private static byte[] f38000;
   private static short[] f39000;
   private static byte[] f40000;
   private static double[] f41000;
   private static double[] f42000;

   private void m4000(double var1, double var3, double var5) {
      if (!(Boolean)this.f31000[f22000[1]]) {
         double var7 = var1;
         double var9 = var3;
         double var11 = var5;
         if (!(Boolean)this.f31000[f27000[0]]
            && (var1 != f18000[1] || var3 != f25000[0] || var5 != f25000[1])
            && NNWE.E(var1) + NNWE.E(var3) + NNWE.E(var5) < (Double)f8000[f27000[1]]) {
            NXi var13 = NbK.method_20736(null, new NXi(var1, var3, var5), (NHS)this.f31000[f27000[2]], (NNNZg)((NNuU)f8000[f27000[3]]).T[f21000[0]], List.of());
            var1 = var13.M;
            var3 = var13.B;
            var5 = var13.Z;
         }

         if (var1 != f25000[2] || var3 != f17000[0] || var5 != f17000[1]) {
            NHS var18 = ((NHS)this.f31000[f21000[1]]).u(var1, var3, var5);
            this.f31000[f21000[2]] = var18;
            this.m34000();
         }

         if (Math.abs(var9) >= f17000[2] && Math.abs(var3) < f17000[3]) {
            Boolean var19 = f6000[3];
            this.f31000[f21000[3]] = var19;
         }

         Boolean var20 = var9 != var3 && var9 < f17000[4] ? f6000[4] : f6000[5];
         this.f20000[f21000[4]] = var20;
         if (var7 != var1) {
            ((Vector3d)this.f2000[f21000[5]]).x = f41000[0];
         }

         if (var11 != var5) {
            ((Vector3d)this.f2000[f21000[6]]).z = f41000[1];
         }
      }
   }

   public int m6000() {
      return (Integer)this.f2000[f34000[1]];
   }

   public Vector3d m10000() {
      return (Vector3d)this.f2000[f24000[5]];
   }

   private static void m12000() {
      byte[] var128 = new byte[7];
      f38000[(0 | -0) >>> 31] = 100;
      f38000[(1 | -1) >>> 31] = 2;
      f38000[2] = 2;
      f38000[3] = 2;
      f38000[4] = 6;
      f38000[5] = 2;
      f38000[6] = 3;
      byte[] var129 = new byte[7];
      f40000[(0 | -0) >>> 31] = 4;
      f40000[(1 | -1) >>> 31] = 5;
      f40000[2] = 8;
      f40000[3] = 2;
      f40000[4] = 3;
      f40000[5] = 4;
      f40000[6] = 5;
      byte[] var130 = new byte[2];
      f23000[(0 | -0) >>> 31] = 7;
      f23000[(1 | -1) >>> 31] = 3;
   }

   private static void m14000() {
      f8000 = new Object[f23000[(1 | -1) >>> 31]];
      f8000[f1000[7]] = f15000[0];
   }

   public IlmmjsIlp(int var1, int var2) {
      this.m26000();
      Integer var8 = var1;
      this.f30000[f7000[0]] = var8;
      Integer var9 = var2;
      this.f30000[f7000[1]] = var9;
      Float var10 = f13000[0];
      this.f2000[f7000[2]] = var10;
      Float var11 = C1183.m18000(f13000[1], f13000[2]);
      this.f2000[f7000[3]] = var11;
      Float var12 = (Float)this.f2000[f7000[4]];
      this.f2000[f7000[5]] = var12;
      float var3 = C1183.m18000(f37000[0], f37000[1]);
      Float var13 = C1183.m18000(f37000[2], f37000[3]) < f37000[4] ? -var3 : var3;
      this.f31000[f7000[6]] = var13;
      Boolean var14 = f6000[0];
      this.f31000[f7000[7]] = var14;
      Vector3d var15 = new Vector3d();
      this.f2000[f12000[0]] = var15;
      Vector3d var16 = new Vector3d();
      this.f26000[f12000[1]] = var16;
      Vector3d var17 = new Vector3d();
      this.f26000[f12000[2]] = var17;
      Vector3d var18 = new Vector3d(f14000[0], f14000[1], f14000[2]);
      this.f2000[f39000[0]] = var18;
      Double var19 = f42000[0];
      this.f31000[f39000[1]] = var19;
      NHS var20 = (NHS)f8000[f39000[2]];
      this.f31000[f39000[3]] = var20;
   }

   static {
      ntfClinit();
   }

   public Vector3d m18000() {
      return (Vector3d)this.f26000[f24000[2]];
   }

   public Vector3d m20000() {
      return (Vector3d)this.f2000[f24000[4]];
   }

   public int m24000() {
      return (Integer)this.f31000[f35000[2]];
   }

   private void m26000() {
      if (this.f30000 == null) {
         this.f30000 = new Object[f38000[2]];
         Object[] var1 = this.f30000;
         var1[f11000[1]] = Integer.valueOf(f11000[2]);
         var1[f11000[3]] = Integer.valueOf(f11000[4]);
      }

      if (this.f26000 == null) {
         this.f26000 = new Object[f38000[3]];
         Object[] var2 = this.f26000;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[f38000[4]];
         Object[] var3 = this.f2000;
         var3[f38000[5]] = f37000[5];
         var3[f38000[6]] = Integer.valueOf(f11000[5]);
         var3[f40000[0]] = f37000[6];
         var3[f40000[1]] = f9000[0];
      }

      if (this.f31000 == null) {
         this.f31000 = new Object[f40000[2]];
         Object[] var4 = this.f31000;
         var4[f11000[6]] = f9000[1];
         var4[f11000[7]] = f4000[6];
         var4[f40000[3]] = f1000[0];
         var4[f40000[4]] = Integer.valueOf(f1000[1]);
         var4[f40000[5]] = f1000[2];
         var4[f40000[6]] = f4000[7];
         var4[f23000[0]] = f1000[3];
      }

      if (this.f20000 == null) {
         this.f20000 = new Object[f1000[4]];
         Object[] var5 = this.f20000;
         var5[f1000[5]] = f1000[6];
      }
   }

   private static void m28000() {
      float[] var128 = new float[3];
      f13000[(0 | -0) >>> 31] = Float.intBitsToFloat(1065353216);
      f13000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
      f13000[2] = Float.intBitsToFloat(1086918619);
      float[] var129 = new float[7];
      f37000[(0 | -0) >>> 31] = Float.intBitsToFloat(1022739087);
      f37000[(1 | -1) >>> 31] = Float.intBitsToFloat(1045220557);
      f37000[2] = Float.intBitsToFloat(0);
      f37000[3] = Float.intBitsToFloat(1065353216);
      f37000[4] = Float.intBitsToFloat(1056964608);
      f37000[5] = Float.intBitsToFloat(0);
      f37000[6] = Float.intBitsToFloat(0);
      float[] var130 = new float[2];
      f9000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
      f9000[(1 | -1) >>> 31] = Float.intBitsToFloat(0);
   }

   private static void m30000() {
      double[] var128 = new double[3];
      f14000[(0 | -0) >>> 31] = Double.longBitsToDouble(4591870180174331904L);
      f14000[(1 | -1) >>> 31] = Double.longBitsToDouble(4591870180174331904L);
      f14000[2] = Double.longBitsToDouble(4591870180174331904L);
      double[] var129 = new double[3];
      f42000[(0 | -0) >>> 31] = Double.longBitsToDouble(4607002274986721280L);
      f42000[(1 | -1) >>> 31] = Double.longBitsToDouble(4585925428558828667L);
      f42000[2] = Double.longBitsToDouble(4604480258916220928L);
      double[] var130 = new double[2];
      f18000[(0 | -0) >>> 31] = Double.longBitsToDouble(4604480258916220928L);
      f18000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      double[] var131 = new double[3];
      f25000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f25000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f25000[2] = Double.longBitsToDouble(0L);
      double[] var132 = new double[5];
      f17000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f17000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f17000[2] = Double.longBitsToDouble(4532020583461814272L);
      f17000[3] = Double.longBitsToDouble(4532020583461814272L);
      f17000[4] = Double.longBitsToDouble(0L);
      double[] var133 = new double[4];
      f41000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f41000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f41000[2] = Double.longBitsToDouble(4611686018427387904L);
      f41000[3] = Double.longBitsToDouble(4611686018427387904L);
      double[] var134 = new double[8];
      f4000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
      f4000[(1 | -1) >>> 31] = Double.longBitsToDouble(0L);
      f4000[2] = Double.longBitsToDouble(0L);
      f4000[3] = Double.longBitsToDouble(0L);
      f4000[4] = Double.longBitsToDouble(0L);
      f4000[5] = Double.longBitsToDouble(0L);
      f4000[6] = Double.longBitsToDouble(0L);
      f4000[7] = Double.longBitsToDouble(0L);
      double[] var135 = new double[(1 | -1) >>> 31];
      f15000[(0 | -0) >>> 31] = Double.longBitsToDouble(0L);
   }

   public float m32000() {
      return (Float)this.f2000[f34000[4]];
   }

   private void m34000() {
      ((Vector3d)this.f26000[f21000[7]])
         .set(
            (((NHS)this.f31000[f16000[0]]).N + ((NHS)this.f31000[f16000[1]]).u) / f41000[2],
            ((NHS)this.f31000[f16000[2]]).y,
            (((NHS)this.f31000[f16000[3]]).L + ((NHS)this.f31000[f16000[4]]).R) / f41000[3]
         );
   }

   private static void m36000() {
      short[] var128 = new short[8];
      f7000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f7000[2] = 2;
      f7000[3] = 4;
      f7000[4] = 4;
      f7000[5] = 5;
      f7000[6] = (short)((0 | -0) >>> 31);
      f7000[7] = 2;
      short[] var129 = new short[3];
      f12000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f12000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f12000[2] = (short)((1 | -1) >>> 31);
      short[] var130 = new short[7];
      f39000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f39000[(1 | -1) >>> 31] = 5;
      f39000[2] = 2;
      f39000[3] = 6;
      f39000[4] = (short)((0 | -0) >>> 31);
      f39000[5] = (short)((1 | -1) >>> 31);
      f39000[6] = 4;
      short[] var131 = new short[2];
      f19000[(0 | -0) >>> 31] = 5;
      f19000[(1 | -1) >>> 31] = 4;
      short[] var132 = new short[3];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = 4;
      f5000[2] = 3;
      short[] var133 = new short[2];
      f3000[(0 | -0) >>> 31] = 3;
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var134 = new short[7];
      f10000[(0 | -0) >>> 31] = 4;
      f10000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f10000[2] = (short)((1 | -1) >>> 31);
      f10000[3] = (short)((1 | -1) >>> 31);
      f10000[4] = (short)((1 | -1) >>> 31);
      f10000[5] = (short)((1 | -1) >>> 31);
      f10000[6] = (short)((1 | -1) >>> 31);
      short[] var135 = new short[6];
      f36000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f36000[(1 | -1) >>> 31] = 5;
      f36000[2] = (short)((1 | -1) >>> 31);
      f36000[3] = 5;
      f36000[4] = (short)((1 | -1) >>> 31);
      f36000[5] = 5;
      short[] var136 = new short[3];
      f29000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f29000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f29000[2] = (short)((1 | -1) >>> 31);
      short[] var137 = new short[2];
      f28000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f28000[(1 | -1) >>> 31] = 3;
      short[] var138 = new short[7];
      f32000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f32000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f32000[2] = (short)((1 | -1) >>> 31);
      f32000[3] = (short)((0 | -0) >>> 31);
      f32000[4] = (short)((0 | -0) >>> 31);
      f32000[5] = (short)((0 | -0) >>> 31);
      f32000[6] = (short)((0 | -0) >>> 31);
      short[] var139 = new short[2];
      f33000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f33000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      short[] var140 = new short[2];
      f22000[(0 | -0) >>> 31] = 6;
      f22000[(1 | -1) >>> 31] = 7;
      short[] var141 = new short[4];
      f27000[(0 | -0) >>> 31] = 2;
      f27000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f27000[2] = 6;
      f27000[3] = (short)((1 | -1) >>> 31);
      short[] var142 = new short[8];
      f21000[(0 | -0) >>> 31] = 3;
      f21000[(1 | -1) >>> 31] = 6;
      f21000[2] = 6;
      f21000[3] = 7;
      f21000[4] = (short)((0 | -0) >>> 31);
      f21000[5] = (short)((1 | -1) >>> 31);
      f21000[6] = (short)((1 | -1) >>> 31);
      f21000[7] = (short)((1 | -1) >>> 31);
      short[] var143 = new short[5];
      f16000[(0 | -0) >>> 31] = 6;
      f16000[(1 | -1) >>> 31] = 6;
      f16000[2] = 6;
      f16000[3] = 6;
      f16000[4] = 6;
      short[] var144 = new short[7];
      f24000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f24000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f24000[2] = (short)((0 | -0) >>> 31);
      f24000[3] = (short)((1 | -1) >>> 31);
      f24000[4] = (short)((0 | -0) >>> 31);
      f24000[5] = (short)((1 | -1) >>> 31);
      f24000[6] = 2;
      short[] var145 = new short[7];
      f34000[(0 | -0) >>> 31] = 2;
      f34000[(1 | -1) >>> 31] = 3;
      f34000[2] = 3;
      f34000[3] = 4;
      f34000[4] = 5;
      f34000[5] = (short)((0 | -0) >>> 31);
      f34000[6] = (short)((0 | -0) >>> 31);
      short[] var146 = new short[5];
      f35000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f35000[(1 | -1) >>> 31] = 2;
      f35000[2] = 3;
      f35000[3] = 4;
      f35000[4] = 5;
   }

   private static void m38000() {
      boolean[] var128 = new boolean[7];
      f6000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((1 | -1) >>> 31);
      f6000[4] = (boolean)((1 | -1) >>> 31);
      f6000[5] = (boolean)((0 | -0) >>> 31);
      f6000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[8];
      f11000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f11000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f11000[2] = (boolean)((0 | -0) >>> 31);
      f11000[3] = (boolean)((1 | -1) >>> 31);
      f11000[4] = (boolean)((0 | -0) >>> 31);
      f11000[5] = (boolean)((0 | -0) >>> 31);
      f11000[6] = (boolean)((0 | -0) >>> 31);
      f11000[7] = (boolean)((1 | -1) >>> 31);
      boolean[] var130 = new boolean[8];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((0 | -0) >>> 31);
      f1000[4] = (boolean)((1 | -1) >>> 31);
      f1000[5] = (boolean)((0 | -0) >>> 31);
      f1000[6] = (boolean)((0 | -0) >>> 31);
      f1000[7] = (boolean)((0 | -0) >>> 31);
   }

   public boolean m40000() {
      return (Boolean)this.f31000[f35000[3]];
   }

   public float m42000() {
      return (Float)this.f31000[f34000[5]];
   }

   public int m46000() {
      return (Integer)this.f30000[f24000[0]];
   }

   public IlmmjsIlp m48000(float var1) {
      Float var6 = var1;
      this.f2000[f34000[0]] = var6;
      return this;
   }

   public void m50000(double var1, double var3, double var5) {
      ((Vector3d)this.f26000[f32000[2]]).set(var1, var3, var5);
      ((Vector3d)this.f26000[f32000[3]]).set(var1, var3, var5);
      NHS var11 = new NHS(
         var1 - ((Vector3d)this.f2000[f32000[4]]).x,
         var3,
         var5 - ((Vector3d)this.f2000[f32000[5]]).z,
         var1 + ((Vector3d)this.f2000[f32000[6]]).x,
         var3 + ((Vector3d)this.f2000[f33000[0]]).y,
         var5 + ((Vector3d)this.f2000[f33000[1]]).z
      );
      this.f31000[f22000[0]] = var11;
   }

   public IlmmjsIlp m52000(int var1) {
      Integer var6 = var1;
      this.f2000[f34000[2]] = var6;
      return this;
   }

   public float m54000() {
      return (Float)this.f2000[f34000[3]];
   }

   public void m56000(Vector3d var1) {
      this.m50000(var1.x, var1.y, var1.z);
   }

   public void m58000(NXi var1) {
      this.m76000(var1.M, var1.B, var1.Z);
   }

   public IlmmjsIlp m60000(double var1) {
      Double var7 = var1;
      this.f31000[f35000[4]] = var7;
      return this;
   }

   public void m62000() {
      ((Vector3d)this.f26000[f39000[4]]).set((Vector3d)this.f26000[f39000[5]]);
      Float var5 = (Float)this.f2000[f39000[6]];
      this.f2000[f19000[0]] = var5;
      Float var6 = (Float)this.f2000[f19000[1]] + (Float)this.f31000[f5000[0]];
      this.f2000[f5000[1]] = var6;
      int var10002 = (Integer)this.f31000[f5000[2]];
      Integer var7 = var10002 + f6000[1];
      this.f31000[f3000[0]] = var7;
      if (var10002 >= (Integer)this.f30000[f3000[1]]) {
         Boolean var8 = f6000[2];
         this.f31000[f10000[0]] = var8;
      } else {
         ((Vector3d)this.f2000[f10000[1]]).y = ((Vector3d)this.f2000[f10000[1]]).y - f42000[1] * (Double)this.f31000[f10000[2]];
         this.m4000(((Vector3d)this.f2000[f10000[3]]).x, ((Vector3d)this.f2000[f10000[4]]).y, ((Vector3d)this.f2000[f10000[5]]).z);
         ((Vector3d)this.f2000[f10000[6]])
            .set(
               ((Vector3d)this.f2000[f36000[0]]).x * (Double)this.f31000[f36000[1]],
               ((Vector3d)this.f2000[f36000[2]]).y * (Double)this.f31000[f36000[3]],
               ((Vector3d)this.f2000[f36000[4]]).z * (Double)this.f31000[f36000[5]]
            );
         if ((Boolean)this.f20000[f29000[0]]) {
            ((Vector3d)this.f2000[f29000[1]]).x = ((Vector3d)this.f2000[f29000[1]]).x * f42000[2];
            ((Vector3d)this.f2000[f29000[2]]).z = ((Vector3d)this.f2000[f29000[2]]).z * f18000[0];
         }
      }
   }

   public IlmmjsIlp m64000(double var1) {
      Double var7 = var1;
      this.f31000[f35000[0]] = var7;
      return this;
   }

   public void m66000(Vector3d var1) {
      this.m76000(var1.x, var1.y, var1.z);
   }

   public IlmmjsIlp m68000(float var1) {
      Float var6 = var1;
      this.f31000[f34000[6]] = var6;
      return this;
   }

   public void m70000(NXi var1) {
      this.m50000(var1.M, var1.B, var1.Z);
   }

   public float m72000() {
      return (Float)this.f2000[f24000[6]];
   }

   public void m74000(int var1) {
      Integer var6 = Math.min((Integer)this.f30000[f28000[0]], (Integer)this.f31000[f28000[1]] + var1);
      this.f30000[f32000[0]] = var6;
   }

   public void m76000(double var1, double var3, double var5) {
      ((Vector3d)this.f2000[f32000[1]]).set(var1, var3, var5);
   }

   public IlmmjsIlp m80000(boolean var1) {
      Boolean var6 = var1;
      this.f31000[f35000[1]] = var6;
      return this;
   }

   public Vector3d m82000() {
      return (Vector3d)this.f26000[f24000[3]];
   }

   public int m84000() {
      return (Integer)this.f30000[f24000[1]];
   }
}
