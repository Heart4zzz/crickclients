package rw.setting;

import KDFzREm.NxU;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.Supplier;
import rw.api.Iface0599;
import rw.core.NsVe;

public record Rec0093() implements Iface0599 {
   private static String[] f1000;
   public boolean f2000;
   public Supplier<NxU> f3000;

   public Supplier<NxU> m2000() {
      return this.f3000;
   }

   Rec0093(Supplier<NxU> var1, boolean var2) {
      Objects.requireNonNull(var1, f1000[0]);
      this.f3000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0093,"framebuffer;viewport",Rec0093::f3000,Rec0093::f2000>(this, var1);
   }

   private static void m6000() {
      f1000 = new String[]{"framebuffer"};
   }

   public boolean m10000() {
      return this.f2000;
   }

   public boolean m14000(NsVe var1) {
      return (boolean)1;
   }

   public void m16000(NsVe var1, rw.core.C0013 var2) {
      var2.m40000(this.f3000.get(), this.f2000);
   }
}
