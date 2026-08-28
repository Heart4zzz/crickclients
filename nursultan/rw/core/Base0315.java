package rw.core;

import rw.api.Iface0212;
import rw.defs.Enum0026;
import rw.defs.Enum0029;

public abstract class Base0315 {
   private final Enum0026 f1000;
   private final rw.setting.C0038 f2000;
   private final Iface0212 f3000;
   private final boolean f4000;
   private final boolean f5000;
   private Iface0212 f6000;
   private Enum0029 f7000 = Enum0029.f2000;
   private boolean f8000;
   private boolean f9000;
   private boolean f10000;
   private boolean f11000;
   private boolean f12000;

   public final rw.setting.C0038 m2000() {
      return this.f2000;
   }

   public final boolean m4000() {
      return this.f12000;
   }

   public void m6000() {
      this.f8000 = true;
   }

   protected Base0315(Enum0026 var1, Iface0212 var2) {
      this(var1, var2, var1 != null && var1.m8000(), var1 != null && var1.m6000());
   }

   protected Base0315(Enum0026 var1, Iface0212 var2, boolean var3, boolean var4) {
      this.f1000 = var1;
      this.f2000 = var2 == null ? null : var2.m10000();
      this.f3000 = var2;
      this.f4000 = var3;
      this.f5000 = var4;
   }

   public final boolean m8000() {
      return this.f4000;
   }

   public final boolean m10000() {
      return this.f5000;
   }

   public final Enum0026 m12000() {
      return this.f1000;
   }

   public void m14000() {
      this.f9000 = true;
      this.f8000 = true;
   }

   public void m16000() {
      this.f12000 = true;
      this.m6000();
   }

   public final boolean m18000() {
      return this.f10000;
   }

   public void m20000() {
      this.f11000 = false;
   }

   public void m22000() {
      if (this.f5000 && !this.f11000) {
         this.f10000 = true;
      }
   }

   public final Enum0029 m24000() {
      return this.f7000;
   }

   public final Iface0212 m26000() {
      return this.f6000;
   }

   public final boolean m28000() {
      return this.f8000;
   }

   void m30000(Enum0029 var1) {
      this.f7000 = var1;
   }

   public void m32000(boolean var1) {
      this.f11000 = var1;
   }

   void m34000(Iface0212 var1) {
      this.f6000 = var1;
   }

   public final boolean m36000() {
      return this.f9000;
   }

   public final Iface0212 m38000() {
      return this.f3000;
   }
}
