package rw.core;

public class C0833 {
   public Object[] f1000;

   public static C0833 m2000() {
      return new C0833(false);
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   private C0833(boolean var1) {
      this.m6000();
      C0145 var6 = new C0145(34962);
      this.f1000[0] = var6;
      C0145 var7 = var1 ? new C0145(34963) : null;
      this.f1000[1] = var7;
   }

   static {
      ntfClinit();
   }

   public C0145 m12000() {
      return (C0145)this.f1000[0];
   }

   public C0145 m18000() {
      return (C0145)this.f1000[1];
   }

   public boolean m22000() {
      return (boolean)((C0145)this.f1000[1] != null ? 1 : 0);
   }

   public static C0833 m26000() {
      return new C0833(true);
   }
}
