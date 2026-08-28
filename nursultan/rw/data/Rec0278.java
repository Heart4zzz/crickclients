package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Supplier;
import rw.api.Iface0196;
import rw.core.C0979;

public record Rec0278() {
   public C0979 f1000;
   public Consumer<C0979> f2000;
   public C0979 f3000;
   public float f4000;
   public Iface0196<Boolean> f5000;
   public Supplier<String> f6000;

   public float m2000() {
      return this.m22000() - this.m18000();
   }

   public float m4000() {
      return this.f4000;
   }

   public Rec0278(C0979 var1, C0979 var2, float var3, Supplier<String> var4, Consumer<C0979> var5, Iface0196<Boolean> var6) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f4000 = var3;
      this.f6000 = var4;
      this.f2000 = var5;
      this.f5000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0278,"value;minMax;increment;postfix;onChange;wasMove",Rec0278::f1000,Rec0278::f3000,Rec0278::f4000,Rec0278::f6000,Rec0278::f2000,Rec0278::f5000>(
         this, var1
      );
   }

   public C0979 m8000() {
      return this.f1000;
   }

   public Supplier<String> m10000() {
      return this.f6000;
   }

   public Iface0196<Boolean> m12000() {
      return this.f5000;
   }

   public float m14000() {
      return (this.f1000.m32000() - this.m18000()) / this.m2000();
   }

   public C0979 m16000() {
      return this.f3000;
   }

   public float m18000() {
      return this.f3000.m32000();
   }

   public float m20000() {
      return (this.f1000.m2000() - this.m18000()) / this.m2000();
   }

   public float m22000() {
      return this.f3000.m2000();
   }

   public Consumer<C0979> m24000() {
      return this.f2000;
   }
}
