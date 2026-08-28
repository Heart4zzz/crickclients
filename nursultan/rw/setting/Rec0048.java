package rw.setting;

import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;
import rw.api.Iface0216;

public record Rec0048() implements Iface0216 {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private final float f5000;
   private final float f6000;
   private final List<Iface0216> f7000;

   public float m2000() {
      return this.f3000;
   }

   public List<Iface0216> m4000() {
      return this.f7000;
   }

   public Rec0048(float var1, float var2, float var3, float var4, float var5, float var6, List<Iface0216> var7) {
      Objects.requireNonNull(var7, "children");
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0048,"translateX;translateY;pivotX;pivotY;scale;rotationDegrees;children",Rec0048::f1000,Rec0048::f2000,Rec0048::f3000,Rec0048::f4000,Rec0048::f5000,Rec0048::f6000,Rec0048::f7000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f5000;
   }

   public float m10000() {
      return this.f4000;
   }

   public float m12000() {
      return this.f2000;
   }

   public static Rec0048 m14000(float var0, float var1, List<Iface0216> var2) {
      return new Rec0048(var0, var1, 0.0F, 0.0F, 1.0F, 0.0F, var2);
   }

   public float m16000() {
      return this.f1000;
   }

   public float m18000() {
      return this.f6000;
   }
}
