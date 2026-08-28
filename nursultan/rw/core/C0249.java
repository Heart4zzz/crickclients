package rw.core;

import KDFzREm.NNJg;
import KDFzREm.NNuU;
import KDFzREm.NYZ;
import KDFzREm.NYb;
import KDFzREm.NYj;
import KDFzREm.NkF;
import KDFzREm.Nkq;
import java.util.List;
import rw.api.Iface0177;
import rw.api.Iface0179;
import rw.api.Iface0181;
import rw.api.Iface0183;
import rw.defs.Enum0016;

public class C0249 implements Iface0179 {
   NNuU f1000 = NNuU.Nq();
   private final NNJg f2000;
   private final Iface0177 f3000;

   @Override
   public List<NYj> m2000() {
      return this.f2000.E().T;
   }

   public C0249(NNJg var1) {
      this.f2000 = var1;
      this.f3000 = (Iface0177)var1;
   }

   @Override
   public boolean m4000() {
      this.f3000.m8000(true);
      if (this.f3000.m4000() && this.f3000.m2000() == 1) {
         this.f3000.m12000(false);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean m6000(NYj var1) {
      return false;
   }

   @Override
   public boolean m8000() {
      return this.f2000.getClass().isAnnotationPresent(Iface0183.class);
   }

   public NYj m10000(double var1, double var3) {
      return this.f3000.m10000(var1, var3);
   }

   @Override
   public boolean m12000(NYj var1) {
      return var1 instanceof NYb || var1 instanceof NkF || var1 instanceof NYZ;
   }

   @Override
   public void m14000(NYj var1, Enum0016 var2, boolean var3) {
      this.f3000.m6000(var1, var1.u, var2.m8000(), var3 ? Nkq.field_7794 : Nkq.field_7790);
   }

   public boolean m16000() {
      return this.f2000.getClass().isAnnotationPresent(Iface0181.class);
   }
}
