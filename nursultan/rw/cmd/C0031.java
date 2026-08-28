package rw.cmd;

import KDFzREm.NNRc;
import KDFzREm.NVk;
import KDFzREm.NoS;
import KDFzREm.NoX;
import KDFzREm.Not;
import KDFzREm.hr;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C0031 implements NoS {
   private final NVk f1000;

   public C0031(NVk var1) {
      this.f1000 = var1;
   }

   public Collection<hr> getNames(Not var1) throws CommandSyntaxException {
      List var2 = this.f1000.u(var1);
      if (var2.isEmpty()) {
         throw NoX.i.create();
      } else {
         ArrayList var3 = new ArrayList();

         for (NNRc var5 : var2) {
            var3.add(var5.method_72498());
         }

         return var3;
      }
   }
}
