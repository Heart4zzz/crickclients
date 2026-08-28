package rw.setting;

import java.util.Objects;
import rw.data.Rec0131;
import rw.defs.Enum0034;
import rw.defs.Enum0035;

public final class C0055 {
   private final Enum0035 f1000;
   private final Enum0034 f2000;
   private final Enum0034 f3000;
   private final Rec0131 f4000;

   public static C0055 m2000(float var0) {
      return m18000().m8000(var0);
   }

   public C0055 m4000() {
      return this.m22000(Rec0131.m14000());
   }

   public Rec0131 m6000() {
      return this.f4000;
   }

   private C0055(Enum0035 var1, Enum0034 var2, Enum0034 var3, Rec0131 var4) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
   }

   public C0055 m8000(float var1) {
      return this.m22000(Rec0131.m16000(var1));
   }

   public Enum0034 m10000() {
      return this.f2000;
   }

   public static C0055 m12000(float var0) {
      return m2000(var0).m28000(Enum0034.f2000).m16000(Enum0034.f2000);
   }

   public Enum0035 m14000() {
      return this.f1000;
   }

   public C0055 m16000(Enum0034 var1) {
      return new C0055(this.f1000, this.f2000, var1, this.f4000);
   }

   public static C0055 m18000() {
      return new C0055(Enum0035.f2000, null, null, null);
   }

   public static C0055 m20000(float var0) {
      return m24000(var0).m28000(Enum0034.f2000).m16000(Enum0034.f2000);
   }

   public C0055 m22000(Rec0131 var1) {
      return new C0055(this.f1000, this.f2000, this.f3000, Objects.requireNonNull(var1, "value"));
   }

   public static C0055 m24000(float var0) {
      return m26000().m8000(var0);
   }

   public static C0055 m26000() {
      return new C0055(Enum0035.f1000, null, null, null);
   }

   public C0055 m28000(Enum0034 var1) {
      return new C0055(this.f1000, var1, this.f3000, this.f4000);
   }

   public Enum0034 m30000() {
      return this.f3000;
   }
}
