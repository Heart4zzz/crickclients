package rw.data;

import java.lang.runtime.ObjectMethods;
import net.minecraft.server.network.FilteredText;

record Rec0118() {
   private final FilteredText f1000;
   private final boolean f2000;
   static final Rec0118 f3000;

   Rec0118(FilteredText var1, boolean var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0118,"textSnapshot;caretVisible",Rec0118::f1000,Rec0118::f2000>(this, var1);
   }

   public boolean m4000() {
      return this.f2000;
   }

   public FilteredText m6000() {
      return this.f1000;
   }
}
