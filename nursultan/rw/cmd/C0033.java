package rw.cmd;

import KDFzREm.NNNDJ;
import KDFzREm.NVk;
import KDFzREm.NoX;
import KDFzREm.Not;
import KDFzREm.NqH;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class C0033 implements NqH {
   private final NVk f1000;

   public C0033(NVk var1) {
      this.f1000 = var1;
   }

   public Collection<NNNDJ> getNames(Not var1, Supplier<Collection<NNNDJ>> var2) throws CommandSyntaxException {
      List var3 = this.f1000.y(var1);
      if (var3.isEmpty()) {
         throw NoX.u.create();
      } else {
         return List.copyOf(var3);
      }
   }
}
