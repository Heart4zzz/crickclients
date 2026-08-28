package rw.data;

import java.lang.runtime.ObjectMethods;
import org.joml.Vector4fc;
import rw.api.Iface0214;
import rw.defs.Enum0038;

public record Rec0120() implements Iface0214 {
   private final float f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private final Vector4fc f5000;
   private final int f6000;
   private final int f7000;
   private final float f8000;
   private final Enum0038 f9000;
   private final int f10000;
   private final float f11000;

   public float m2000() {
      return this.f3000;
   }

   public int m4000() {
      return this.f7000;
   }

   public Rec0120(float var1, float var2, float var3, float var4, Vector4fc var5, int var6, int var7, float var8, Enum0038 var9, int var10, float var11) {
      if (var9 == null) {
         var9 = Enum0038.f1000;
      }

      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
      this.f8000 = var8;
      this.f9000 = var9;
      this.f10000 = var10;
      this.f11000 = var11;
   }

   public Rec0120(float var1, float var2, float var3, float var4, Vector4fc var5, int var6, int var7, float var8, int var9, float var10) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, Enum0038.f1000, var9, var10);
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0120,"x;y;width;height;borderRadius;fillColor;borderColor;borderThickness;borderPosition;shadowColor;shadowRadius",Rec0120::f1000,Rec0120::f2000,Rec0120::f3000,Rec0120::f4000,Rec0120::f5000,Rec0120::f6000,Rec0120::f7000,Rec0120::f8000,Rec0120::f9000,Rec0120::f10000,Rec0120::f11000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f8000;
   }

   public Enum0038 m10000() {
      return this.f9000;
   }

   public Vector4fc m12000() {
      return this.f5000;
   }

   public float m14000() {
      return this.f11000;
   }

   public int m16000() {
      return this.f10000;
   }

   public float m18000() {
      return this.f4000;
   }

   public float m20000() {
      return this.f2000;
   }

   public float m22000() {
      return this.f1000;
   }

   public int m24000() {
      return this.f6000;
   }
}
