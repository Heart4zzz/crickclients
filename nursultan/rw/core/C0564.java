package rw.core;

import KDFzREm.NNmP;
import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

class C0564 extends NNmP {
   C0564(Schema var1, String var2, Function var3) {
      super(var1, var2);
      this.f1000 = var3;
   }

   protected String m2000(String var1) {
      return (String)this.f1000.apply(var1);
   }
}
