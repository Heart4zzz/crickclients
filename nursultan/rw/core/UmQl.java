package rw.core;

public class UmQl {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
         var1[2] = 0;
      }
   }

   public UmQl() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "RenderType.RenderTypeBuilder(pipeline="
         + (C0825)this.f1000[0]
         + ", mesh="
         + (C0830)this.f1000[1]
         + ", verticesPerInstance="
         + (Integer)this.f1000[2]
         + ")";
   }

   public UmQl m16000(C0825 var1) {
      this.f1000[0] = var1;
      return this;
   }

   public UmQl m18000(int var1) {
      Integer var6 = var1;
      this.f1000[2] = var6;
      return this;
   }

   public C0805 m20000() {
      return new C0805((C0825)this.f1000[0], (C0830)this.f1000[1], (Integer)this.f1000[2]);
   }

   public UmQl m22000(C0830 var1) {
      this.f1000[1] = var1;
      return this;
   }
}
