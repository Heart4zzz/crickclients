package rw.core;

import java.util.function.Function;

public class C0097 {
   public Object[] f1000;

   private void m2000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[3];
         Object[] var1 = this.f1000;
      }
   }

   private C0097(Function<OlIrtqjti, rw.setting.C0056> var1) {
      this.m2000();
      this.f1000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public rw.setting.C0056 m8000(OlIrtqjti var1) {
      if (var1 != (OlIrtqjti)this.f1000[1]) {
         this.f1000[1] = var1;
         rw.setting.C0056 var7 = (rw.setting.C0056)((Function)this.f1000[0]).apply(var1);
         this.f1000[2] = var7;
      }

      return (rw.setting.C0056)this.f1000[2];
   }

   public static C0097 m12000(Function<OlIrtqjti, rw.setting.C0056> var0) {
      return new C0097(var0);
   }
}
