package rw;

public class Module {
   public Object[] f1000;

   public Module() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[1];
         Object[] var1 = this.f1000;
         var1[0] = false;
      }
   }

   public boolean m10000() {
      return (Boolean)this.f1000[0];
   }

   public Module m12000(boolean var1) {
      Boolean var6 = var1;
      this.f1000[0] = var6;
      return this;
   }

   public void m16000() {
      Boolean var5 = true;
      this.f1000[0] = var5;
   }
}
