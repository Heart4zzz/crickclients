package rw.core;

import KDFzREm.NNNG;
import KDFzREm.NNXk;
import KDFzREm.NNpQ;
import KDFzREm.NOp;
import KDFzREm.Nkb;
import KDFzREm.Noj;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;

public class C0634 {
   private int f1000;
   private final Builder<NNpQ<NNXk>> f2000 = ImmutableList.builder();
   private final Builder<NNpQ<NOp<?>>> f3000 = ImmutableList.builder();
   private Optional<NNNG> f4000 = Optional.empty();

   public static C0634 m2000(NNpQ<NOp<?>> var0) {
      return new C0634().m4000(var0);
   }

   public C0634 m4000(NNpQ<NOp<?>> var1) {
      this.f3000.add(var1);
      return this;
   }

   public C0634 m6000(NNNG var1) {
      this.f4000 = Optional.of(var1);
      return this;
   }

   public C0634 m8000(int var1) {
      this.f1000 += var1;
      return this;
   }

   public C0634 m10000(NNpQ<NNXk> var1) {
      this.f2000.add(var1);
      return this;
   }

   public Nkb m12000() {
      return new Nkb(this.f1000, this.f2000.build(), this.f3000.build(), this.f4000.map(Noj::new));
   }

   public static C0634 m14000(NNpQ<NNXk> var0) {
      return new C0634().m10000(var0);
   }

   public static C0634 m16000(NNNG var0) {
      return new C0634().m6000(var0);
   }

   public static C0634 m18000(int var0) {
      return new C0634().m8000(var0);
   }
}
