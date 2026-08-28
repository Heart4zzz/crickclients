package rw.core;

import java.util.List;
import org.joml.Vector3i;
import rw.data.IlsImt;

public class OlpkOsimj extends Base1018 {
   public OlpkOsimj(String var1, int var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   public boolean m2000(List<IlsImt> var1, Vector3i var2, Vector3i var3) {
      return this.N(var3.x, var3.z, var3.y);
   }
}
