package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Supplier;
import rw.api.Iface0196;

public record Rec0257() {
   public float f1000;
   public float f2000;
   public Iface0196<Boolean> f3000;
   public Consumer<Float> f4000;
   public float f5000;
   public float f6000;
   public Supplier<String> f7000;

   public float m2000() {
      return this.f1000 - this.f6000;
   }

   public Iface0196<Boolean> m4000() {
      return this.f3000;
   }

   public Rec0257(float var1, float var2, float var3, float var4, Supplier<String> var5, Consumer<Float> var6, Iface0196<Boolean> var7) {
      this.f5000 = var1;
      this.f6000 = var2;
      this.f1000 = var3;
      this.f2000 = var4;
      this.f7000 = var5;
      this.f4000 = var6;
      this.f3000 = var7;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0257,"value;min;max;increment;postfix;onChange;wasMove",Rec0257::f5000,Rec0257::f6000,Rec0257::f1000,Rec0257::f2000,Rec0257::f7000,Rec0257::f4000,Rec0257::f3000>(
         this, var1
      );
   }

   public float m8000() {
      return this.f5000;
   }

   public Consumer<Float> m10000() {
      return this.f4000;
   }

   public float m12000() {
      return this.f6000;
   }

   public Supplier<String> m14000() {
      return this.f7000;
   }

   public float m16000() {
      return this.f2000;
   }

   public float m18000() {
      return (this.f5000 - this.f6000) / this.m2000();
   }

   public float m20000() {
      return this.f1000;
   }
}
