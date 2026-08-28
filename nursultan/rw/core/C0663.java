package rw.core;

import KDFzREm.NuD;
import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

class C0663 extends NuD {
   C0663(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.f1000 = var3;
   }

   protected String m2000(String var1) {
      return (String)this.f1000.apply(var1);
   }
}
