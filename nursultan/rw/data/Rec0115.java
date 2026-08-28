package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0214;

public record Rec0115() implements Iface0214 {
   private final String f1000;
   private final float f2000;
   private final float f3000;
   private final float f4000;
   private final float f5000;
   private final int f6000;
   private final Rec0068 f7000;

   public float m2000() {
      return this.f3000;
   }

   public Rec0068 m4000() {
      return this.f7000;
   }

   public Rec0115(String var1, float var2, float var3, float var4, float var5, int var6) {
      this(var1, var2, var3, var4, var5, var6, Rec0068.f5000);
   }

   public Rec0115(String var1, float var2, float var3, float var4, float var5, int var6, Rec0068 var7) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0115,"textureRef;x;y;width;height;color;uv",Rec0115::f1000,Rec0115::f2000,Rec0115::f3000,Rec0115::f4000,Rec0115::f5000,Rec0115::f6000,Rec0115::f7000>(
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

   public String m14000() {
      return this.f1000;
   }

   public int m16000() {
      return this.f6000;
   }
}
