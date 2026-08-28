package rw.core;

import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import rw.api.Iface0619;
import rw.api.Iface0620;
import rw.data.Rec0312;

public abstract class Base1014<T> extends Base0995 {
   public Object[] f1000;
   public Object[] f2000;

   public void m2000(T var1) {
      this.m2000();
      this.f1000[1] = var1;
      ((Iface0620)this.f1000[5]).valueChanged(this, (T)var1);
      this.m18000();
   }

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var1 = this.f1000;
         var1[3] = false;
      }

      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var2 = this.f2000;
      }
   }

   public Rec0312 m6000() {
      this.m2000();
      return (Rec0312)this.f1000[0];
   }

   public Base1014(Rec0312 var1, T var2) {
      this.m2000();
      this.f1000[0] = var1;
      Object var8;
      Object var10001 = var8 = var2;
      this.f1000[2] = var8;
      Object var9 = var10001;
      this.f1000[1] = var9;
      Boolean var10 = true;
      this.f1000[3] = var10;
      Predicate var11 = var0 -> (boolean)1;
      this.f1000[4] = var11;
      Iface0620 var12 = (var0, var1x) -> {};
      this.f1000[5] = var12;
      Iface0619 var13 = (var0, var1x) -> {};
      this.f2000[0] = var13;
   }

   static {
      ntfClinit();
   }

   public Iface0619 m10000() {
      this.m2000();
      return (Iface0619)this.f2000[0];
   }

   public Predicate<Base1014<T>> m12000() {
      this.m2000();
      return (Predicate<Base1014<T>>)this.f1000[4];
   }

   public T m14000() {
      this.m2000();
      return (T)((BooleanSupplier)this.f2000[1] != null && ((BooleanSupplier)this.f2000[1]).getAsBoolean() ? this.f2000[2] : this.f1000[1]);
   }

   public void m16000() {
      if (this.c_()) {
         this.m6000();
      }
   }

   public void m18000() {
      this.m2000();
      boolean var1 = (Boolean)this.f1000[3];
      Boolean var6 = ((Predicate)this.f1000[4]).test(this);
      this.f1000[3] = var6;
      if (var1 != (Boolean)this.f1000[3]) {
         ((Iface0619)this.f2000[0]).visibilityChanged(this, (Boolean)this.f1000[3]);
      }
   }

   public T m20000() {
      this.m2000();
      return (T)this.f1000[2];
   }

   public Iface0620<T> m22000() {
      this.m2000();
      return (Iface0620<T>)this.f1000[5];
   }

   public void m6000() {
      this.m2000();
      this.m2000((T)this.f1000[2]);
   }

   public Base1014<T> m24000(T var1) {
      this.m2000();
      this.f1000[2] = var1;
      return this;
   }

   public boolean m28000() {
      this.m2000();
      return (Boolean)this.f1000[3];
   }

   public <E extends Base1014<T>> E m30000(Predicate<Base1014<T>> var1) {
      this.m2000();
      this.f1000[4] = var1;
      return (E)this;
   }

   public <E extends Base1014<T>> E m32000(BooleanSupplier var1, T var2) {
      this.m2000();
      this.f2000[1] = var1;
      this.f2000[2] = var2;
      return (E)this;
   }

   public void m34000(T var1) {
      this.m2000((T)var1);
   }

   public boolean m36000() {
      return (boolean)0;
   }

   public Rec0312 m12000(String var1) {
      this.m2000();
      return ((Rec0312)this.f1000[0]).m12000(var1);
   }

   public <E extends Base1014<T>> E m42000(Iface0620<T> var1) {
      this.m2000();
      this.f1000[5] = var1;
      return (E)this;
   }

   public Base1014<T> m44000(Iface0619 var1) {
      this.m2000();
      this.f2000[0] = var1;
      return this;
   }

   public T m46000() {
      this.m2000();
      return (T)this.f1000[1];
   }

   public boolean c_() {
      this.m2000();
      return (boolean)(!Objects.equals(this.f1000[1], this.f1000[2]) ? 1 : 0);
   }
}
