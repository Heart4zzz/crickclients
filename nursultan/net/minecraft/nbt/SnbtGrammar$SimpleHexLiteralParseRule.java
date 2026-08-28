package net.minecraft.nbt;

import KDFzREm.ae;
import KDFzREm.ag;
import KDFzREm.pf;

class SnbtGrammar$SimpleHexLiteralParseRule extends ae {
   public SnbtGrammar$SimpleHexLiteralParseRule(int var1) {
      super(var1, var1, ag.N(pf.N, String.valueOf(var1)));
   }

   protected boolean isAccepted(char var1) {
      return switch (var1) {
         case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
         default -> false;
      };
   }
}
