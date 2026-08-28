package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0132() {
   private final String f1000;
   private final float f2000;
   private final float f3000;
   private final int f4000;

   public float m2000() {
      return this.f3000;
   }

   Rec0132(String var1, float var2, float var3, int var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0132,"text;width;height;lineCount",Rec0132::f1000,Rec0132::f2000,Rec0132::f3000,Rec0132::f4000>(this, var1);
   }

   public int m6000() {
      return this.f4000;
   }

   public float m8000() {
      return this.f2000;
   }

   public String m10000() {
      return this.f1000;
   }
}
