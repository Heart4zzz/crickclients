package rw.core;

import KDFzREm.NAC;
import KDFzREm.Nxl;

public class IlnmistOi extends Base1173 {
   private static String[] f1000;
   private static boolean[] f2000;

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   @Override
   public boolean m2000(NAC<?> var1) {
      return var1 instanceof Nxl var2 ? var2.N().getString().replace(f1000[0], f1000[1]).replace(f1000[2], f1000[3]).startsWith(f1000[4]) : f2000[0];
   }

   private static void m16000() {
      f1000 = new String[5];
      f1000[(0 | -0) >>> 31] = "\n";
      f1000[(1 | -1) >>> 31] = m6000("");
      f1000[2] = " ";
      f1000[3] = m10000("");
      f1000[4] = "╔════╗⚡FunTime.su⚡Режим:Хаб#";
   }
}
