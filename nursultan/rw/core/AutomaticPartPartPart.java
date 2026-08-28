package rw.core;

import KDFzREm.NXi;
import java.time.Duration;
import rw.NursultanClient;

public class AutomaticPartPartPart extends WaypointXPart {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;

   private static void m4000() {
      boolean[] var128 = new boolean[6];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[2] = (boolean)((0 | -0) >>> 31);
      f1000[3] = (boolean)((1 | -1) >>> 31);
      f1000[4] = (boolean)((0 | -0) >>> 31);
      f1000[5] = (boolean)((0 | -0) >>> 31);
   }

   public AutomaticPartPartPart(String var1, NXi var2, Duration var3, String var4) {
      super(var1, var2, var4);
      this.m10000();
      Integer var9 = NursultanClient.m74000().m10000() + C0954.m20000((int)var3.getSeconds());
      this.f2000[f3000[0]] = var9;
   }

   static {
      ntfClinit();
   }

   public int m2000() {
      this.m10000();
      return (Integer)this.f2000[f3000[2]];
   }

   public boolean m6000() {
      return f1000[0];
   }

   @Override
   public boolean m8000() {
      this.m10000();
      return !super.m22000() && NursultanClient.m74000().m10000() <= this.f2000[f3000[1]] ? f1000[2] : f1000[1];
   }

   private void m10000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[3]];
         Object[] var1 = this.f2000;
         var1[f1000[4]] = Integer.valueOf(f1000[5]);
      }
   }

   private static void m12000() {
      short[] var128 = new short[3];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
   }
}
