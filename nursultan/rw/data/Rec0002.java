package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0002() {
   public int f1000;
   public boolean f2000;
   public int f3000;
   public int f4000;

   public boolean m2000() {
      return this.f2000;
   }

   public int m6000() {
      return this.f4000;
   }

   public Rec0002(int var1, int var2, boolean var3, int var4) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
      this.f4000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0002,"count;glType;normalized;divisor",Rec0002::f1000,Rec0002::f3000,Rec0002::f2000,Rec0002::f4000>(this, var1);
   }

   public int m16000() {
      return this.f3000;
   }

   public int m22000() {
      return this.f1000;
   }

   public static Rec0002 m24000(int var0) {
      return new Rec0002(var0, 5124, false, 0);
   }

   public static Rec0002 m26000() {
      return new Rec0002(4, 5121, true, 0);
   }

   public static Rec0002 m28000(int var0) {
      return new Rec0002(var0, 5126, false, 0);
   }

   public int m30000() {
      return this.f1000 * switch (this.f3000) {
         case 5120, 5121 -> 1;
         case 5122, 5123 -> 2;
         case 5124, 5125, 5126 -> 4;
         default -> throw new IllegalArgumentException("Unsupported GL type: " + this.f3000);
      };
   }

   public Rec0002 m32000() {
      return new Rec0002(this.f1000, this.f3000, this.f2000, 1);
   }
}
