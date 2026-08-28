package rw.core;

import org.joml.Vector3d;

public class C0130 {
   private static short[] f1000;
   public Object[] f2000;
   private static byte[] f3000;
   private static long[] f4000;
   private static boolean[] f5000;
   private static short[] f6000;

   public String m2000() {
      return (String)this.f2000[f1000[6]];
   }

   private static void m6000() {
      long[] var128 = new long[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = 0L;
   }

   public C0130(String var1, String var2, Vector3d var3) {
      this.m12000();
      this.f2000[f1000[0]] = var1;
      this.f2000[f1000[1]] = var2;
      Vector3d var10 = new Vector3d(var3);
      this.f2000[f1000[2]] = var10;
      Vector3d var11 = new Vector3d(var3);
      this.f2000[f1000[3]] = var11;
      Long var12 = System.currentTimeMillis();
      this.f2000[f1000[4]] = var12;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      if (var1 == this) {
         return f5000[0];
      } else if (!(var1 instanceof C0130 var2)) {
         return f5000[1];
      } else {
         String var3 = this.m18000();
         String var4 = var2.m18000();
         return (var3 == null ? var4 == null : var3.equals(var4)) ? f5000[3] : f5000[2];
      }
   }

   @Override
   public int hashCode() {
      byte var1 = f3000[0];
      byte var2 = f5000[4];
      String var3 = this.m18000();
      return var2 * f3000[1] + (var3 == null ? f3000[2] : var3.hashCode());
   }

   private static void m10000() {
      boolean[] var128 = new boolean[5];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f5000[2] = (boolean)((0 | -0) >>> 31);
      f5000[3] = (boolean)((1 | -1) >>> 31);
      f5000[4] = (boolean)((1 | -1) >>> 31);
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f3000[3]];
         Object[] var1 = this.f2000;
         var1[f3000[4]] = f4000[0];
      }
   }

   public Vector3d m14000() {
      return (Vector3d)this.f2000[f6000[1]];
   }

   private static void m16000() {
      short[] var128 = new short[8];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f1000[2] = 4;
      f1000[3] = 3;
      f1000[4] = 2;
      f1000[5] = (short)((0 | -0) >>> 31);
      f1000[6] = (short)((1 | -1) >>> 31);
      f1000[7] = 2;
      short[] var129 = new short[3];
      f6000[(0 | -0) >>> 31] = 3;
      f6000[(1 | -1) >>> 31] = 4;
      f6000[2] = 2;
   }

   public String m18000() {
      return (String)this.f2000[f1000[5]];
   }

   public long m22000() {
      return (Long)this.f2000[f1000[7]];
   }

   public C0130 m30000(long var1) {
      Long var7 = var1;
      this.f2000[f6000[2]] = var7;
      return this;
   }

   public Vector3d m32000() {
      return (Vector3d)this.f2000[f6000[0]];
   }

   private static void m34000() {
      byte[] var128 = new byte[5];
      f3000[(0 | -0) >>> 31] = 59;
      f3000[(1 | -1) >>> 31] = 59;
      f3000[2] = 43;
      f3000[3] = 5;
      f3000[4] = 2;
   }
}
