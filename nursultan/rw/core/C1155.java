package rw.core;

import KDFzREm.NbK;
import rw.api.Iface0649;

public class C1155 implements Iface0649 {
   public Object[] f1000;

   public C1155() {
      this.m6000();
      C1158 var5 = new C1158(null);
      this.f1000[0] = var5;
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
      }
   }

   public C1158<NbK> m12000() {
      return (C1158<NbK>)this.f1000[0];
   }
}
