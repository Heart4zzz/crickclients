package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0092() {
   private final int f1000;
   private final String f2000;
   private final boolean f3000;

   public String m2000() {
      return this.f2000;
   }

   public Rec0092(int var1, String var2, boolean var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0092,"maxDepth;subtreeKey;fullStyle",Rec0092::f1000,Rec0092::f2000,Rec0092::f3000>(this, var1);
   }

   public boolean m6000() {
      return this.f3000;
   }

   public int m8000() {
      return this.f1000;
   }

   public static Rec0092 m10000() {
      return new Rec0092(Integer.MAX_VALUE, null, false);
   }

   public Rec0092 m12000(boolean var1) {
      return new Rec0092(this.f1000, this.f2000, var1);
   }

   public Rec0092 m14000(int var1) {
      return new Rec0092(var1, this.f2000, this.f3000);
   }

   public Rec0092 m16000(String var1) {
      return new Rec0092(this.f1000, var1, this.f3000);
   }
}
