package net.minecraft.server.commands;

import KDFzREm.NNLj;
import KDFzREm.NNLw;
import KDFzREm.NNio;
import KDFzREm.NaK;
import KDFzREm.Not;
import KDFzREm.NqB;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

class FunctionCommand$2 extends NNLw {
   FunctionCommand$2(NNio var1) {
      this.N = var1;
   }

   protected NaK N(CommandContext<Not> var1) throws CommandSyntaxException {
      return NNLj.N(NqB.N(var1, "path"), this.N.N(var1));
   }
}
