package net.minecraft.util.parsing.packrat.commands;

import KDFzREm.NNNNBE;
import it.unimi.dsi.fastutil.chars.CharList;

class StringReaderTerms$2 extends NNNNBE {
   StringReaderTerms$2(CharList var1, char var2, char var3) {
      super(var1);
      this.N = var2;
      this.y = var3;
   }

   protected boolean val$v1(char var1) {
      return var1 == this.N || var1 == this.y;
   }
}
