package rw.core;

import KDFzREm.NKL;
import KDFzREm.NKi;
import KDFzREm.NNEI;
import KDFzREm.NNEo;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public final class C0192 {
   private final List<NNEo> f1000;
   private final Map<NKi, List<NNEo>> f2000 = Maps.newHashMap();
   @Nullable
   private List<NNEI> f3000;

   C0192(List<NNEo> var1) {
      this.f1000 = var1;
   }

   public List<NNEo> m4000() {
      return this.f1000;
   }

   public List<NNEo> m8000(NKi var1) {
      return this.f2000.computeIfAbsent(var1, var1x -> this.f1000.stream().filter(var1xx -> var1xx.y.N(var1x)).collect(Collectors.toList()));
   }

   public List<NNEI> m10000() {
      if (this.f3000 == null) {
         this.f3000 = this.m8000(NKL.sr).stream().<NNEI>map(NNEI::N).toList();
      }

      return this.f3000;
   }
}
