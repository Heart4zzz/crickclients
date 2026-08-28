package rw.core;

import KDFzREm.NxU;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import rw.api.Iface0596;
import rw.api.Iface0597;
import rw.setting.IlrmOrp;
import rw.setting.Rec0093;
import rw.setting.Rec0094;

public class C0826<C> {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public C0826<C> m4000(Supplier<NxU> var1) {
      return this.m6000(var1, true);
   }

   public C0826<C> m6000(Supplier<NxU> var1, boolean var2) {
      ((rw.setting.C0095)this.f1000[1]).m32000(new Rec0093(var1, var2));
      return this;
   }

   public C0826<C> m10000(C0012 var1) {
      return this.m48000(33984, var1);
   }

   C0826(C0812<C> var1, rw.setting.C0095<C> var2) {
      this.m2000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
   }

   static {
      ntfClinit();
   }

   public C0826<C> m18000(C0012 var1, boolean var2) {
      ((rw.setting.C0095)this.f1000[1]).m32000(new rw.setting.C0092(var1, var2));
      return this;
   }

   public C0812<C> m22000(Supplier<NxU> var1) {
      return ((C0812)this.f1000[0]).m20000(var1);
   }

   public C0826<C> m26000(Supplier<NxU> var1, boolean var2) {
      ((rw.setting.C0095)this.f1000[1]).m32000(new Rec0093(var1, var2));
      ((rw.setting.C0095)this.f1000[1]).m26000((boolean)1);
      return this;
   }

   public C0826<C> m28000(C0012 var1) {
      return this.m42000(var1, true);
   }

   public C0826<C> m30000(Iface0596<C> var1) {
      ((rw.setting.C0095)this.f1000[1]).m20000(var1);
      return this;
   }

   public C0826<C> m32000(Iface0597<C> var1) {
      return ((C0812)this.f1000[0]).m18000(var1);
   }

   public C0826<C> m34000(Iface0596<C> var1) {
      ((rw.setting.C0095)this.f1000[1]).m36000(var1);
      return this;
   }

   public C0826<C> m36000(C0012 var1) {
      return this.m18000(var1, true);
   }

   public C0826<C> m38000(Supplier<NxU> var1) {
      return this.m26000(var1, true);
   }

   public C0826<C> m42000(C0012 var1, boolean var2) {
      ((rw.setting.C0095)this.f1000[1]).m32000(new rw.setting.C0092(var1, var2));
      ((rw.setting.C0095)this.f1000[1]).m26000((boolean)1);
      return this;
   }

   public C0812<C> m44000(Supplier<NxU> var1, boolean var2) {
      return ((C0812)this.f1000[0]).m16000(var1, var2);
   }

   public C0826<C> m46000(int var1, IntSupplier var2) {
      ((rw.setting.C0095)this.f1000[1]).m42000(new Rec0094(var1, var2));
      return this;
   }

   public C0826<C> m48000(int var1, C0012 var2) {
      ((rw.setting.C0095)this.f1000[1]).m42000(new IlrmOrp(var1, var2));
      return this;
   }

   public C0826<C> m50000(IntSupplier var1) {
      return this.m46000(33984, var1);
   }

   public IlksOmts<C> m52000() {
      return ((C0812)this.f1000[0]).m22000();
   }
}
