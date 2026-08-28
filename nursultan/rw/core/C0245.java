package rw.core;

import KDFzREm.NNNG;
import KDFzREm.NNNNBK;
import KDFzREm.NNNNBR;
import KDFzREm.aJ;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

class C0245<T, C, P> extends NNNNBR<NNNNBK<T, C, P>, P> {
   C0245(aJ<StringReader, NNNG> var1, NNNNBK<T, C, P> var2) {
      super(var1, var2);
   }

   public Stream<NNNG> m2000() {
      return ((NNNNBK)this.N).u();
   }

   protected P m4000(ImmutableStringReader var1, NNNG var2) throws Exception {
      return (P)((NNNNBK)this.N).i(var1, var2);
   }
}
