package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0287() {
   public int f1000;
   public int f2000;
   public byte[] f3000;

   public int m2000() {
      return this.f2000;
   }

   Rec0287(int var1, int var2, byte[] var3) {
      this.f2000 = var1;
      this.f1000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0287,"width;height;pixels",Rec0287::f2000,Rec0287::f1000,Rec0287::f3000>(this, var1);
   }

   public byte[] m6000() {
      return this.f3000;
   }

   public int m8000() {
      return this.f1000;
   }
}
