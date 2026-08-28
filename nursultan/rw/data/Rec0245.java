package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0245() {
   public int f1000;
   public byte[] f2000;
   public int f3000;

   public int m2000() {
      return this.f1000;
   }

   Rec0245(int var1, int var2, byte[] var3) {
      this.f3000 = var1;
      this.f1000 = var2;
      this.f2000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0245,"width;height;pixels",Rec0245::f3000,Rec0245::f1000,Rec0245::f2000>(this, var1);
   }

   public byte[] m6000() {
      return this.f2000;
   }

   public int m8000() {
      return this.f3000;
   }
}
