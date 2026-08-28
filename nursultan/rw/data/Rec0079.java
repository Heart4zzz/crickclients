package rw.data;

import java.lang.runtime.ObjectMethods;

public record Rec0079() {
   private final boolean f1000;
   private final boolean f2000;
   public static final Rec0079 f3000;
   private static final Rec0079 f4000;
   private static final Rec0079 f5000;
   private static final Rec0079 f6000;

   public Rec0079(boolean var1, boolean var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0079,"changed;layoutChanged",Rec0079::f1000,Rec0079::f2000>(this, var1);
   }

   public boolean m4000() {
      return this.f2000;
   }

   public boolean m6000() {
      return this.f1000;
   }

   public static Rec0079 m8000(boolean var0, boolean var1) {
      if (var0) {
         return var1 ? f5000 : f4000;
      } else {
         return var1 ? f6000 : f3000;
      }
   }
}
