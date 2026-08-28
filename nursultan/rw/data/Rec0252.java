package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import rw.api.Iface0651;
import rw.defs.Enum0081;
import rw.net.PacketListener;

public record Rec0252<T>() implements Iface0651 {
   public boolean f1000;
   public Class<?> f2000;
   public PacketListener<T> f3000;
   public Enum0081 f4000;

   @Override
   public Enum0081 m2000() {
      return this.f4000;
   }

   public Rec0252(Class<?> var1, Enum0081 var2, boolean var3, PacketListener<T> var4) {
      this.f2000 = var1;
      this.f4000 = var2;
      this.f1000 = var3;
      this.f3000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0252,"eventType;priority;ignoreCancelled;eventListener",Rec0252::f2000,Rec0252::f4000,Rec0252::f1000,Rec0252::f3000>(
         this, var1
      );
   }

   public Class<?> m6000() {
      return this.f2000;
   }

   public PacketListener<T> m8000() {
      return this.f3000;
   }

   public boolean m10000() {
      return this.f1000;
   }

   public Class<?> m12000() {
      return this.f2000;
   }

   public Consumer<Object> m16000() {
      return var1 -> this.f3000.m2000((T)var1);
   }
}
