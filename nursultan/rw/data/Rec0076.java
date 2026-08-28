package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0192;
import rw.defs.StepStart;

public record Rec0076() implements Iface0192 {
   private final float f1000;
   private final StepStart f2000;
   private final float f3000;

   public float m2000() {
      return this.f3000;
   }

   public Rec0076(float var1, StepStart var2, float var3) {
      var1 = Float.isFinite(var1) ? Math.max(0.0F, var1) : 0.0F;
      var2 = var2 == null ? StepStart.f2000 : var2;
      var3 = Float.isFinite(var3) ? Math.max(0.0F, var3) : 0.0F;
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public Rec0076(float var1, StepStart var2) {
      this(var1, var2, 0.0F);
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0076,"durationSeconds;easing;delaySeconds",Rec0076::f1000,Rec0076::f2000,Rec0076::f3000>(this, var1);
   }

   public boolean m6000() {
      return this.f1000 > 0.0F;
   }

   public StepStart m8000() {
      return this.f2000;
   }

   public float m10000() {
      return this.f1000;
   }

   public Rec0076 m12000(float var1) {
      return new Rec0076(this.f1000, this.f2000, var1);
   }
}
