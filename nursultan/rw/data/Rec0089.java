package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0089() {
   private final boolean f1000;
   private final boolean f2000;
   public static final Rec0089 f3000;

   public static Rec0089 m2000() {
      return new Rec0089(true, true);
   }

   public Rec0089(boolean var1, boolean var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0089,"layoutRebuilds;drawCommandRebuilds",Rec0089::f1000,Rec0089::f2000>(this, var1);
   }

   public boolean m6000() {
      return this.f2000;
   }

   public boolean m8000() {
      return this.f1000;
   }

   public static Rec0089 m10000() {
      return new Rec0089(false, true);
   }

   public static Rec0089 m12000() {
      return new Rec0089(true, false);
   }
}
