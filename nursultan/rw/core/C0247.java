package rw.core;

import KDFzREm.NNNG;
import KDFzREm.NNNNBK;
import KDFzREm.NNNNBR;
import KDFzREm.aJ;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

class C0247<T, C, P> extends NNNNBR<NNNNBK<T, C, P>, C> {
   C0247(aJ<StringReader, NNNG> var1, NNNNBK<T, C, P> var2) {
      super(var1, var2);
   }

   public Stream<NNNG> m2000() {
      return ((NNNNBK)this.N).L();
   }

   protected C m4000(ImmutableStringReader var1, NNNG var2) throws Exception {
      return (C)((NNNNBK)this.N).R(var1, var2);
   }
}
