package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0197() {
   public int f1000;
   public int f2000;
   public int f3000;

   public int m2000() {
      return this.f2000;
   }

   public Rec0197(int var1, int var2, int var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0197,"internalFormat;format;type",Rec0197::f1000,Rec0197::f2000,Rec0197::f3000>(this, var1);
   }

   public int m6000() {
      return this.f1000;
   }

   public int m8000() {
      return this.f3000;
   }
}
