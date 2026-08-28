package rw.core;

import KDFzREm.NxU;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import rw.api.Iface0595;
import rw.api.Iface0597;
import rw.setting.Rec0097;

public class C0812<C> {
   public Object[] f1000;

   C0812(C0013 var1) {
      this.m10000();
      ArrayList var6 = new ArrayList();
      this.f1000[0] = var6;
      this.f1000[1] = var1;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public C0812<C> m16000(Supplier<NxU> var1, boolean var2) {
      ((List)this.f1000[0]).add(new Rec0097(var1, var2));
      return this;
   }

   public C0826<C> m18000(Iface0597<C> var1) {
      rw.setting.C0095 var2 = new rw.setting.C0095(var1);
      ((List)this.f1000[0]).add(var2);
      return new C0826<>(this, var2);
   }

   public C0812<C> m20000(Supplier<NxU> var1) {
      return this.m16000(var1, true);
   }

   public IlksOmts<C> m22000() {
      ((List)this.f1000[0]).forEach(Iface0595::m8000);
      return new IlksOmts<>(List.copyOf((List)this.f1000[0]), (C0013)this.f1000[1]);
   }
}
