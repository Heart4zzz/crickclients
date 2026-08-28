package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0214;
import rw.setting.Rec0036;

public record Rec0121() implements Iface0214 {
   private final String f1000;
   private final float f2000;
   private final float f3000;
   private final int f4000;
   private final float f5000;
   private final Rec0036 f6000;
   private final int f7000;
   private final float f8000;

   public float m2000() {
      return this.f3000;
   }

   public int m4000() {
      return this.f7000;
   }

   public Rec0121(String var1, float var2, float var3, int var4, float var5, Rec0036 var6, int var7, float var8) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f5000 = var5;
      this.f6000 = var6;
      this.f7000 = var7;
      this.f8000 = var8;
   }

   public final boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0121,"text;x;y;color;fontSize;fontSpec;outlineColor;outlineWidth",Rec0121::f1000,Rec0121::f2000,Rec0121::f3000,Rec0121::f4000,Rec0121::f5000,Rec0121::f6000,Rec0121::f7000,Rec0121::f8000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f8000;
   }

   public float m10000() {
      return this.f5000;
   }

   public int m12000() {
      return this.f4000;
   }

   public float m14000() {
      return this.f2000;
   }

   public String m16000() {
      return this.f1000;
   }

   public Rec0036 m18000() {
      return this.f6000;
   }
}
