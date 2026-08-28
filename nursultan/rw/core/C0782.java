package rw.core;

import KDFzREm.NjL;

public class C0782 extends Base0785 {
   public C0782(String var1) {
      super(var1, (boolean)0);
   }

   static {
      ntfClinit();
   }

   public int m4000(NjL var1, NjL var2) {
      float var3 = C0989.m26000(C0989.m4000(), var1.method_73189()).m8000().lengthSquared();
      float var4 = C0989.m26000(C0989.m4000(), var2.method_73189()).m8000().lengthSquared();
      return Float.compare(var3, var4);
   }
}
