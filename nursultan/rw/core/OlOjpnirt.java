package rw.core;

import KDFzREm.NxU;

public class OlOjpnirt {
   public static Object[] f1000;
   public Object[] f2000;

   public OlOjpnirt() {
      this.m14000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      f1000 = new Object[]{null};
   }

   public void m12000(NxU var1) {
      this.f2000[0] = var1;
   }

   private void m14000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[1];
         Object[] var1 = this.f2000;
      }
   }

   public static OlOjpnirt m16000(NxU var0) {
      ((OlOjpnirt)f1000[0]).f2000[0] = var0;
      return (OlOjpnirt)f1000[0];
   }

   public NxU m18000() {
      return (NxU)this.f2000[0];
   }
}
