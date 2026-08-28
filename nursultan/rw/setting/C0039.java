package rw.setting;

import java.util.Objects;
import rw.api.Iface0197;
import rw.api.Iface0202;
import rw.core.C0346;
import rw.defs.Enum0024;
import rw.gui.Rec0015;

public final class C0039<P> {
   private final C0035 f1000;
   private final Iface0197<P> f2000;
   private final C0044 f3000;
   private C0038 f4000;
   private P f5000;
   private boolean f6000;
   private Rec0015 f7000 = Rec0015.m8000();

   private void m2000() {
      C0031 var1 = this.m24000();

      try {
         this.f4000 = this.f1000.m22000(var1);
         this.f3000.m2000();
         this.f6000 = false;
      } catch (RuntimeException var3) {
         this.f3000.m6000();
         throw var3;
      }
   }

   private C0039(C0035 var1, String var2, Iface0197<P> var3, P var4) {
      this.f1000 = Objects.requireNonNull(var1, "engine");
      this.f2000 = Objects.requireNonNull(var3, "root");
      C0043 var5 = C0043.m8000(var1.m24000());
      this.f3000 = new C0044(var5, this::m8000, var2);
      this.f5000 = (P)var4;
   }

   private void m4000() {
      if (!this.f6000 && this.f3000.m4000()) {
         this.m8000();
      }
   }

   private void m6000() {
      if (this.f6000) {
         C0031 var1 = this.m24000();
         Rec0015 var2 = this.f7000;

         try {
            this.f4000.m44000(var1, var2);
            this.f3000.m2000();
            this.f6000 = false;
            this.f7000 = Rec0015.m8000();
         } catch (RuntimeException var4) {
            this.f3000.m6000();
            throw var4;
         }
      }
   }

   public void m8000() {
      this.m22000(Rec0015.m8000());
   }

   public C0346 m10000(int var1, int var2, float var3) {
      this.m4000();
      this.m6000();
      return this.f1000.m28000(this.f4000, var1, var2, var3);
   }

   public void m12000(P var1) {
      this.f5000 = (P)var1;
      this.m8000();
   }

   private static Rec0015 m14000(Rec0015 var0, Rec0015 var1) {
      Objects.requireNonNull(var0, "current");
      Objects.requireNonNull(var1, "next");
      return var0.m2000() != Enum0024.f2000 && var1.m2000() != Enum0024.f2000 ? Rec0015.m8000() : Rec0015.m6000();
   }

   public static <P> C0039<P> m16000(C0035 var0, String var1, Iface0197<P> var2, P var3) {
      C0039 var4 = new C0039<>(var0, var1, var2, var3);
      var4.m2000();
      return var4;
   }

   public C0038 m18000() {
      return this.f4000;
   }

   public void m20000(P var1, Rec0015 var2) {
      Objects.requireNonNull(var2, "renderOptions");
      this.f5000 = (P)var1;
      this.m22000(var2);
   }

   public void m22000(Rec0015 var1) {
      Objects.requireNonNull(var1, "renderOptions");
      this.f6000 = true;
      this.f7000 = m14000(this.f7000, var1);
   }

   private C0031 m24000() {
      this.f3000.m38000();

      try {
         Iface0202 var1 = this.f3000.m10000();
         C0031 var2 = this.f2000.m2000(this.f5000, var1);
         return Objects.requireNonNull(var2, "Root stateful component returned null");
      } catch (RuntimeException var3) {
         this.f3000.m6000();
         throw var3;
      }
   }
}
