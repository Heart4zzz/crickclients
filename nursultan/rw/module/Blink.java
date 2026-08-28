package rw.module;

import KDFzREm.NAC;
import rw.Module;

public class Blink extends Module {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;

   public NAC<?> m2000() {
      this.m2000();
      return (NAC<?>)this.f2000[f3000[0]];
   }

   public Blink(NAC<?> var1) {
      this.m2000();
      this.f2000[f3000[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[0]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m4000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m4000() {
      short[] var128 = new short[2];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }
}
