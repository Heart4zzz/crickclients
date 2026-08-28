package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0214;
import rw.setting.Rec0036;

public record Rec0114() implements Iface0214 {
   private final String f1000;
   private final float f2000;
   private final float f3000;
   private final int f4000;
   private final float f5000;
   private final Rec0036 f6000;

   public float m2000() {
      return this.f3000;
   }

   public Rec0114(String var1, float var2, float var3, int var4, float var5, Rec0036 var6) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0114,"text;x;y;color;fontSize;fontSpec",Rec0114::f1000,Rec0114::f2000,Rec0114::f3000,Rec0114::f4000,Rec0114::f5000,Rec0114::f6000>(
         this, var1
      );
   }

   public float m6000() {
      return this.f5000;
   }

   public int m8000() {
      return this.f4000;
   }

   public float m10000() {
      return this.f2000;
   }

   public String m12000() {
      return this.f1000;
   }

   public Rec0036 m14000() {
      return this.f6000;
   }
}
