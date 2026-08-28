package rw.data;

import java.lang.runtime.ObjectMethods;

record Rec0100() {
   private final boolean f1000;
   private final boolean f2000;
   private final boolean f3000;
   private final boolean f4000;

   public boolean m2000() {
      return this.f3000;
   }

   Rec0100(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0100,"shouldRunFullLayout;shouldRunPositionUpdate;hasScrollDirty;viewportChanged",Rec0100::f1000,Rec0100::f2000,Rec0100::f3000,Rec0100::f4000>(
         this, var1
      );
   }

   public boolean m6000() {
      return this.f4000;
   }

   public boolean m8000() {
      return this.f2000;
   }

   public boolean m10000() {
      return this.f1000;
   }
}
