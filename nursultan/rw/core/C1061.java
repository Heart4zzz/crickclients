package rw.core;

import rw.api.Iface0625;
import rw.api.Iface0626;

public class C1061 implements Iface0625<Iface0626> {
   public static Object[] f1000;
   private static boolean[] f2000;

   @Override
   public void m2000(Base0315 var1, Iface0626 var2) {
   }

   private C1061() {
   }

   static {
      ntfClinit();
   }

   @Override
   public void m4000(Base0315 var1, Iface0626 var2) {
   }

   private static void m6000() {
      f1000 = new Object[f2000[1]];
   }

   public void m12000(Base0315 var1, Iface0626 var2) {
   }

   private static void m14000() {
      boolean[] var128 = new boolean[2];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
   }
}
