package rw.core;

import KDFzREm.NYj;
import KDFzREm.Nkq;
import java.util.List;
import rw.api.Iface0179;
import rw.api.Iface0180;
import rw.defs.Enum0016;

public class C0254 implements Iface0179 {
   private final Iface0180 f1000;

   @Override
   public List<NYj> m2000() {
      return this.f1000.m2000();
   }

   public C0254(Iface0180 var1) {
      this.f1000 = var1;
   }

   @Override
   public boolean m4000() {
      return this.f1000.m4000();
   }

   @Override
   public boolean m6000(NYj var1) {
      return this.f1000.m6000(var1);
   }

   @Override
   public boolean m8000() {
      return this.f1000.m8000();
   }

   public NYj m10000(double var1, double var3) {
      return this.f1000.m14000(var1, var3);
   }

   @Override
   public boolean m12000(NYj var1) {
      return this.f1000.m12000(var1);
   }

   @Override
   public void m14000(NYj var1, Enum0016 var2, boolean var3) {
      this.f1000.m10000(var1, var2.m8000(), var3 ? Nkq.field_7794 : Nkq.field_7790);
   }

   public boolean m16000() {
      return this.f1000.m16000();
   }
}
