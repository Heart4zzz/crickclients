package rw.core;

import KDFzREm.NNLw;
import KDFzREm.NNio;
import KDFzREm.NaK;
import KDFzREm.Not;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

class C0211 extends NNLw {
   C0211(NNio var1) {
      this.f1000 = var1;
   }

   protected NaK m2000(CommandContext<Not> var1) throws CommandSyntaxException {
      return this.f1000.N(var1).N();
   }
}
