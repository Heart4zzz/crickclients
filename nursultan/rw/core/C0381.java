package rw.core;

import rw.data.Rec0126;

public final class C0381 {
   private final Float f1000;
   private final Integer f2000;
   private final Rec0126 f3000;

   public Rec0126 m2000() {
      return this.f3000;
   }

   private C0381(Float var1, Integer var2, Rec0126 var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public Integer m4000() {
      return this.f2000;
   }

   public C0381 m6000(Rec0126 var1) {
      return new C0381(this.f1000, this.f2000, var1);
   }

   public Float m8000() {
      return this.f1000;
   }

   public static C0381 m10000(float var0, int var1) {
      return new C0381(Math.max(0.0F, var0), var1, null);
   }

   public C0381 m12000(float var1) {
      return new C0381(this.f1000, this.f2000, Rec0126.m16000(var1));
   }
}
