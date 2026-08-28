package rw.core;

import rw.NursultanClient;
import rw.api.Iface0204;
import rw.gui.Huddumped;

public class C1130 implements Iface0204 {
   private static boolean[] f1000;

   private C1130() {
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
   }

   public boolean m6000() {
      return NursultanClient.m70000().m46000().isEmpty() && !Huddumped.m40000() ? f1000[1] : f1000[0];
   }

   public boolean m8000(float var1) {
      return f1000[2];
   }
}
