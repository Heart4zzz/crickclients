package rw.module;

import KDFzREm.NAC;
import KDFzREm.NFU;
import rw.Module;

public class AutoAccept extends Module {
   private static byte[] f1000;
   private static short[] f2000;
   public Object[] f3000;

   public NFU m2000() {
      this.m4000();
      return (NFU)this.f3000[f2000[1]];
   }

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f1000[0]];
         Object[] var1 = this.f3000;
      }
   }

   public AutoAccept(NAC<?> var1, NFU var2) {
      this.m4000();
      this.f3000[f2000[2]] = var1;
      this.f3000[f2000[3]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m2000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 2;
   }

   public NAC<?> m6000() {
      this.m4000();
      return (NAC<?>)this.f3000[f2000[0]];
   }

   private static void m8000() {
      short[] var128 = new short[4];
      f2000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((1 | -1) >>> 31);
   }
}
