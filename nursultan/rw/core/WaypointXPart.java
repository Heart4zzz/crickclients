package rw.core;

import KDFzREm.NXi;

public class WaypointXPart {
   private static byte[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   private static short[] f5000;
   private static boolean[] f6000;
   private static short[] f7000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[3]];
         Object[] var1 = this.f2000;
         var1[f1000[4]] = Integer.valueOf(f4000[3]);
         var1[f1000[5]] = f4000[4];
         var1[f1000[6]] = f4000[5];
      }
   }

   public void m6000() {
      Boolean var5 = f6000[1];
      this.f2000[f3000[4]] = var5;
   }

   public boolean m8000() {
      return (Boolean)this.f2000[f5000[4]];
   }

   public WaypointXPart(String var1, NXi var2, String var3) {
      this.m4000();
      this.f2000[f3000[0]] = var1;
      this.f2000[f3000[1]] = var2;
      this.f2000[f3000[2]] = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m10000(Object var1) {
      if (var1 == this) {
         return f6000[2];
      } else if (!(var1 instanceof WaypointXPart var2)) {
         return f6000[3];
      } else if (!var2.m40000(this)) {
         return f6000[4];
      } else {
         String var3 = this.m18000();
         String var4 = var2.m18000();
         return (var3 == null ? var4 == null : var3.equals(var4)) ? f4000[1] : f4000[0];
      }
   }

   @Override
   public int hashCode() {
      byte var1 = f1000[0];
      byte var2 = f4000[2];
      String var3 = this.m18000();
      return var2 * f1000[1] + (var3 == null ? f1000[2] : var3.hashCode());
   }

   private static void m12000() {
      short[] var128 = new short[6];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = 2;
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = 5;
      f3000[4] = 5;
      f3000[5] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[8];
      f5000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 3;
      f5000[3] = 4;
      f5000[4] = 5;
      f5000[5] = 2;
      f5000[6] = 3;
      f5000[7] = 4;
      short[] var130 = new short[(1 | -1) >>> 31];
      f7000[(0 | -0) >>> 31] = 5;
   }

   public boolean m14000() {
      return (Boolean)this.f2000[f5000[3]];
   }

   public String m16000() {
      return (String)this.f2000[f5000[0]];
   }

   public String m18000() {
      return (String)this.f2000[f3000[5]];
   }

   public boolean m20000() {
      return f6000[0];
   }

   public boolean m22000() {
      return (Boolean)this.f2000[f3000[3]];
   }

   private static void m26000() {
      byte[] var128 = new byte[7];
      f1000[(0 | -0) >>> 31] = 59;
      f1000[(1 | -1) >>> 31] = 59;
      f1000[2] = 43;
      f1000[3] = 6;
      f1000[4] = 3;
      f1000[5] = 4;
      f1000[6] = 5;
   }

   public WaypointXPart m30000(boolean var1) {
      Boolean var6 = var1;
      this.f2000[f5000[7]] = var6;
      return this;
   }

   private static void m32000() {
      boolean[] var128 = new boolean[5];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
      f6000[3] = (boolean)((0 | -0) >>> 31);
      f6000[4] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[6];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((1 | -1) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((0 | -0) >>> 31);
      f4000[5] = (boolean)((0 | -0) >>> 31);
   }

   public int m34000() {
      return (Integer)this.f2000[f5000[2]];
   }

   public WaypointXPart m36000(int var1) {
      Integer var6 = var1;
      this.f2000[f5000[6]] = var6;
      return this;
   }

   public WaypointXPart m38000(boolean var1) {
      Boolean var6 = var1;
      this.f2000[f7000[0]] = var6;
      return this;
   }

   public boolean m40000(Object var1) {
      return var1 instanceof WaypointXPart;
   }

   public WaypointXPart m42000(NXi var1) {
      this.f2000[f5000[5]] = var1;
      return this;
   }

   public Class<? extends OlqsjOqn<?>> m44000() {
      return C0971.class;
   }

   public NXi m46000() {
      return (NXi)this.f2000[f5000[1]];
   }
}
