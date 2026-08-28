package rw.setting;

import KDFzREm.NxU;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.Supplier;
import rw.api.Iface0595;
import rw.core.NsVe;

public record Rec0097<C>() implements Iface0595<C> {
   public Supplier<NxU> f1000;
   private static String[] f2000;
   public boolean f3000;

   public boolean m2000() {
      return this.f3000;
   }

   Rec0097(Supplier<NxU> var1, boolean var2) {
      this.f1000 = Objects.requireNonNull(var1, f2000[0]);
      this.f3000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0097,"framebuffer;viewport",Rec0097::f1000,Rec0097::f3000>(this, var1);
   }

   private static void m6000() {
      f2000 = new String[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = "framebuffer";
   }

   public Supplier<NxU> m8000() {
      return this.f1000;
   }

   public void m14000(C var1, NsVe var2, rw.core.C0013 var3) {
      var3.m40000(this.f1000.get(), this.f3000);
   }
}
