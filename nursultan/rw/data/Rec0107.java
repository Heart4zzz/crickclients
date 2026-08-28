package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0107() {
   private final boolean f1000;
   private final boolean f2000;
   private final boolean f3000;
   public static final Rec0107 f4000;

   public static Rec0107 m2000() {
      return new Rec0107(false, false, true);
   }

   public Rec0107(boolean var1, boolean var2, boolean var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0107,"capture;once;passive",Rec0107::f1000,Rec0107::f2000,Rec0107::f3000>(this, var1);
   }

   public boolean m6000() {
      return this.f2000;
   }

   public boolean m8000() {
      return this.f1000;
   }

   public static Rec0107 m10000() {
      return new Rec0107(false, true, false);
   }

   public static Rec0107 m12000() {
      return new Rec0107(true, false, false);
   }

   public boolean m14000() {
      return this.f3000;
   }
}
