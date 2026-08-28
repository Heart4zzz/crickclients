package rw.core;

import KDFzREm.NNNwS;
import KDFzREm.NNWE;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NcV;
import org.joml.Vector2f;
import rw.defs.Enum0074;
import rw.defs.Enum0075;

public class C0983 {
   private static short[] f1000;
   private static short[] f2000;
   public Object[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static boolean[] f7000;
   private static float[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;
   public Object[] f12000;
   private static byte[] f13000;
   private static short[] f14000;
   private static double[] f15000;

   public C0983 m2000(boolean var1) {
      Boolean var6 = var1;
      this.f3000[f1000[1]] = var6;
      return this;
   }

   public NcV m4000() {
      return new NcV(this.m38000(), this.m68000());
   }

   public Vector2f m8000() {
      return new Vector2f(this.m38000(), this.m68000());
   }

   private static void m10000() {
      double[] var128 = new double[2];
      f15000[(0 | -0) >>> 31] = Double.longBitsToDouble(-4616189618054758400L);
      f15000[(1 | -1) >>> 31] = Double.longBitsToDouble(4607182418800017408L);
   }

   private static void m12000() {
      boolean[] var128 = new boolean[6];
      f7000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f7000[2] = (boolean)((0 | -0) >>> 31);
      f7000[3] = (boolean)((0 | -0) >>> 31);
      f7000[4] = (boolean)((1 | -1) >>> 31);
      f7000[5] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[5];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((1 | -1) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
   }

   public C0983(float var1, float var2) {
      this(var1, var2, f7000[0], f7000[1], f7000[2], (Enum0074)Enum0074.f2000[f14000[0]]);
   }

   public C0983(float var1, float var2, boolean var3, boolean var4, boolean var5, Enum0074 var6) {
      this.m22000();
      NNuU var11 = NNuU.Nq();
      this.f3000[f14000[1]] = var11;
      Float var12 = var1;
      this.f3000[f14000[2]] = var12;
      Float var13 = var2;
      this.f3000[f14000[3]] = var13;
      Boolean var14 = var4;
      this.f3000[f10000[0]] = var14;
      Boolean var15 = var3;
      this.f3000[f10000[1]] = var15;
      this.f12000[f10000[2]] = var6;
      Enum0075 var17 = (Enum0075)Enum0075.f4000[f10000[3]];
      this.f12000[f11000[0]] = var17;
      Boolean var18 = var5;
      this.f12000[f11000[1]] = var18;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Yaw: " + this.m38000() + ", Pitch: " + this.m68000();
   }

   public boolean m14000() {
      return (Boolean)this.f3000[f9000[1]];
   }

   public NNuU m16000() {
      return (NNuU)this.f3000[f9000[0]];
   }

   public boolean m18000() {
      return (Boolean)this.f12000[f6000[0]];
   }

   private void m22000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f13000[0]];
         Object[] var1 = this.f3000;
         var1[f7000[3]] = f8000[2];
         var1[f7000[4]] = f8000[3];
         var1[f13000[1]] = f7000[5];
         var1[f13000[2]] = f4000[0];
      }

      if (this.f12000 == null) {
         this.f12000 = new Object[f13000[3]];
         Object[] var2 = this.f12000;
         var2[f4000[1]] = f4000[2];
         var2[f4000[3]] = f4000[4];
      }
   }

   private static void m24000() {
      float[] var128 = new float[4];
      f8000[(0 | -0) >>> 31] = Float.intBitsToFloat(-1028390912);
      f8000[(1 | -1) >>> 31] = Float.intBitsToFloat(1119092736);
      f8000[2] = Float.intBitsToFloat(0);
      f8000[3] = Float.intBitsToFloat(0);
   }

   private static void m26000() {
      byte[] var128 = new byte[4];
      f13000[(0 | -0) >>> 31] = 5;
      f13000[(1 | -1) >>> 31] = 3;
      f13000[2] = 4;
      f13000[3] = 4;
   }

   public NXi m28000() {
      return NXi.N(this.m68000(), this.m38000());
   }

   public Enum0074 m30000() {
      return (Enum0074)this.f12000[f6000[1]];
   }

   public C0983 m32000(boolean var1) {
      Boolean var6 = var1;
      this.f12000[f1000[3]] = var6;
      return this;
   }

   public boolean m36000() {
      return (Boolean)this.f3000[f9000[2]];
   }

   public float m38000() {
      return this.f12000[f2000[2]]
         ? C0877.m34000(((NNNwS)((NNuU)this.f3000[f2000[3]]).T[f2000[4]]).field_5982, (Float)this.f3000[f2000[5]])
         : (Float)this.f3000[f2000[6]];
   }

   public C0983 m40000(boolean var1) {
      Boolean var6 = var1;
      this.f3000[f1000[2]] = var6;
      return this;
   }

   public C0983 m44000(C0983 var1) {
      return new C0984(NNWE.R(this.m38000() - var1.m38000()), this.m68000() - var1.m68000());
   }

   public boolean m46000() {
      return (Boolean)this.f12000[f9000[3]];
   }

   public float m48000(NXi var1) {
      NXi var2 = var1.u(((NNNwS)((NNuU)this.f3000[f11000[2]]).T[f11000[3]]).method_33571()).u();
      double var3 = ((NNNwS)((NNuU)this.f3000[f11000[4]]).T[f11000[5]]).method_5631(this.m68000(), this.m38000()).y(var2);
      var3 = NNWE.N(var3, f15000[0], f15000[1]);
      double var5 = Math.acos(var3);
      return (float)Math.toDegrees(var5);
   }

   public C0983 m52000(Enum0075 var1) {
      this.f12000[f1000[6]] = var1;
      return this;
   }

   public C0983 m54000(boolean var1) {
      Boolean var6 = var1;
      this.f12000[f1000[4]] = var6;
      return this;
   }

   public Enum0075 m56000() {
      return (Enum0075)this.f12000[f1000[0]];
   }

   public C0983 m60000(Enum0074 var1) {
      this.f12000[f1000[5]] = var1;
      return this;
   }

   public C0983 m62000(C0983 var1) {
      return new C0983(this.m38000() + var1.m38000(), this.m68000() + var1.m68000());
   }

   public C0983 m64000(float var1, float var2) {
      return this.m62000(new C0984(var1, var2));
   }

   private static void m66000() {
      short[] var128 = new short[4];
      f14000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f14000[(1 | -1) >>> 31] = 2;
      f14000[2] = (short)((0 | -0) >>> 31);
      f14000[3] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[4];
      f10000[(0 | -0) >>> 31] = 4;
      f10000[(1 | -1) >>> 31] = 3;
      f10000[2] = 2;
      f10000[3] = (short)((0 | -0) >>> 31);
      short[] var130 = new short[6];
      f11000[(0 | -0) >>> 31] = 3;
      f11000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f11000[2] = 2;
      f11000[3] = 4;
      f11000[4] = 2;
      f11000[5] = 4;
      short[] var131 = new short[2];
      f5000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      short[] var132 = new short[7];
      f2000[(0 | -0) >>> 31] = 2;
      f2000[(1 | -1) >>> 31] = 4;
      f2000[2] = (short)((1 | -1) >>> 31);
      f2000[3] = 2;
      f2000[4] = 4;
      f2000[5] = (short)((0 | -0) >>> 31);
      f2000[6] = (short)((0 | -0) >>> 31);
      short[] var133 = new short[4];
      f9000[(0 | -0) >>> 31] = 2;
      f9000[(1 | -1) >>> 31] = 3;
      f9000[2] = 4;
      f9000[3] = (short)((0 | -0) >>> 31);
      short[] var134 = new short[2];
      f6000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = 2;
      short[] var135 = new short[7];
      f1000[(0 | -0) >>> 31] = 3;
      f1000[(1 | -1) >>> 31] = 3;
      f1000[2] = 4;
      f1000[3] = (short)((0 | -0) >>> 31);
      f1000[4] = (short)((1 | -1) >>> 31);
      f1000[5] = 2;
      f1000[6] = 3;
   }

   public float m68000() {
      float var1 = (Float)this.f3000[f5000[0]];
      if ((Boolean)this.f12000[f5000[1]]) {
         var1 = C0877.m34000(((NNNwS)((NNuU)this.f3000[f2000[0]]).T[f2000[1]]).field_6004, var1);
      }

      return Math.clamp(var1, f8000[0], f8000[1]);
   }
}
