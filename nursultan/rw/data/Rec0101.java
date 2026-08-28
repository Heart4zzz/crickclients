package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Enum0028;
import rw.setting.C0059;

public record Rec0101() {
   private final C0059 f1000;
   private final Enum0028 f2000;
   private final float f3000;
   public static final Rec0101 f4000;

   public C0059 m2000() {
      return this.f1000;
   }

   public Rec0101(C0059 var1, Enum0028 var2, float var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0101,"element;scrollbarPart;accumulatedOffsetY",Rec0101::f1000,Rec0101::f2000,Rec0101::f3000>(this, var1);
   }

   public float m6000() {
      return this.f3000;
   }

   public Enum0028 m8000() {
      return this.f2000;
   }

   public boolean m10000() {
      return this.f1000 == null;
   }

   public boolean m12000() {
      return this.f2000 != Enum0028.f1000;
   }
}
