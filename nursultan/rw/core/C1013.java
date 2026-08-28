package rw.core;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import rw.data.Rec0312;

public class C1013 {
   public Object[] f1000;

   public void m6000(boolean var1) {
      Boolean var6 = var1;
      this.f1000[3] = var6;
      ((Consumer)this.f1000[2]).accept(this);
   }

   public C1013(String var1, boolean var2, Consumer<C1013> var3) {
      this.m18000();
      Supplier var8 = () -> null;
      this.f1000[4] = var8;
      Rec0312 var9 = C1244.m10000(var1);
      this.f1000[0] = var9;
      Boolean var10 = var2;
      this.f1000[1] = var10;
      Boolean var11 = var2;
      this.f1000[3] = var11;
      this.f1000[2] = var3;
   }

   public C1013(String var1, boolean var2) {
      this(var1, var2, var0 -> {});
   }

   static {
      ntfClinit();
   }

   public boolean m8000(Object var1) {
      if (var1 != null && this.getClass() == var1.getClass()) {
         C1013 var2 = (C1013)var1;
         return Objects.equals(((Rec0312)this.f1000[0]).m10000(), ((Rec0312)var2.f1000[0]).m10000());
      } else {
         return (boolean)0;
      }
   }

   @Override
   public String toString() {
      return ((Rec0312)this.f1000[0]).m10000();
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(((Rec0312)this.f1000[0]).m10000());
   }

   public Consumer<C1013> m10000() {
      return (Consumer<C1013>)this.f1000[2];
   }

   public boolean m14000() {
      Boolean var1 = (Boolean)((Supplier)this.f1000[4]).get();
      return var1 != null ? var1 : (Boolean)this.f1000[3];
   }

   public boolean m16000() {
      return (Boolean)this.f1000[1];
   }

   private void m18000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[5];
         Object[] var1 = this.f1000;
         var1[1] = false;
         var1[3] = false;
      }
   }

   public Rec0312 m22000() {
      return (Rec0312)this.f1000[0];
   }

   public void m30000(Supplier<Boolean> var1) {
      this.f1000[4] = var1;
   }

   public void b_() {
      this.m6000((boolean)(!this.f1000[3] ? 1 : 0));
   }
}
