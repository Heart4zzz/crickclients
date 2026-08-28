package rw.core;

import KDFzREm.NNNG;
import KDFzREm.NNNNBK;
import KDFzREm.NNNNBR;
import KDFzREm.aJ;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

class C0244<T, C, P> extends NNNNBR<NNNNBK<T, C, P>, T> {
   C0244(aJ<StringReader, NNNG> var1, NNNNBK<T, C, P> var2) {
      super(var1, var2);
   }

   public Stream<NNNG> m2000() {
      return ((NNNNBK)this.N).N();
   }

   protected T m4000(ImmutableStringReader var1, NNNG var2) throws Exception {
      return (T)((NNNNBK)this.N).B(var1, var2);
   }
}
