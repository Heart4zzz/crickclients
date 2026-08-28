package rw.data;

import java.lang.runtime.ObjectMethods;
import org.joml.Vector4fc;
import rw.api.Iface0215;

public record Rec0111() implements Iface0215 {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private final Vector4fc f5000;

   public float m2000() {
      return this.f3000;
   }

   public Rec0111(float var1, float var2, float var3, float var4, Vector4fc var5) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0111,"x;y;width;height;borderRadius",Rec0111::f1000,Rec0111::f2000,Rec0111::f3000,Rec0111::f4000,Rec0111::f5000>(
         this, var1
      );
   }

   public Vector4fc m6000() {
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
