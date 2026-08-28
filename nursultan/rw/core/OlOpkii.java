package rw.core;

import java.util.List;
import org.joml.Vector3i;
import rw.data.IlsImt;

public class OlOpkii extends Base1018 {
   private static boolean[] f1000;

   private static void m2000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public OlOpkii(String var1, int var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   public boolean m4000(List<IlsImt> var1, Vector3i var2, Vector3i var3) {
      return !this.N(var3.x, var3.y, var3.z) && !this.N(var3.z, var3.y, var3.x) ? f1000[1] : f1000[0];
   }
}
