package rw.core;

import KDFzREm.NAC;
import KDFzREm.Nxl;

public class IljmOsjqm extends Base1173 {
   private static boolean[] f1000;
   private static String[] f2000;

   static {
      ntfClinit();
   }

   private static void m12000() {
      f2000 = new String[5];
      f2000[(0 | -0) >>> 31] = "\n";
      f2000[(1 | -1) >>> 31] = m2000("");
      f2000[2] = " ";
      f2000[3] = m6000("");
      f2000[4] = "╔════╗⚡FunTime.su⚡Режим:Гриферский-";
   }

   private static void m18000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   @Override
   public boolean m2000(NAC<?> var1) {
      return var1 instanceof Nxl var2 ? var2.N().getString().replace(f2000[0], f2000[1]).replace(f2000[2], f2000[3]).startsWith(f2000[4]) : f1000[0];
   }
}
