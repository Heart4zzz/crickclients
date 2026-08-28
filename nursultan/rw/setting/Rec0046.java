package rw.setting;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;
import rw.api.Iface0216;

public record Rec0046() implements Iface0216 {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private final List<Iface0216> f5000;

   public float m2000() {
      return this.f3000;
   }

   public Rec0046(float var1, float var2, float var3, float var4, List<Iface0216> var5) {
      Objects.requireNonNull(var5, "children");
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0046,"x;y;width;height;children",Rec0046::f1000,Rec0046::f2000,Rec0046::f3000,Rec0046::f4000,Rec0046::f5000>(
         this, var1
      );
   }

   public List<Iface0216> m6000() {
      return this.f5000;
   }

   public float m8000() {
      return this.f4000;
   }

   public float m10000() {
      return this.f2000;
   }

   public float m12000() {
      return this.f1000;
   }
}
