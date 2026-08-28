package rw.data;

import KDFzREm.NNNpI;
import KDFzREm.Ngq;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public record Rec0145() implements NNNpI {
   private final Ngq f1000;
   private final int f2000;

   int m2000() {
      return this.f1000.B + this.f2000 + 1;
   }

   public Rec0145(Ngq var1, int var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0145,"center;viewDistance",Rec0145::f1000,Rec0145::f2000>(this, var1);
   }

   public Ngq m6000() {
      return this.f1000;
   }

   int m8000() {
      return this.f1000.Z + this.f2000 + 1;
   }

   int m10000() {
      return this.f1000.Z - this.f2000 - 1;
   }

   int m12000() {
      return this.f1000.B - this.f2000 - 1;
   }

   protected boolean m14000(Rec0145 var1) {
      return this.m12000() <= var1.m2000() && this.m2000() >= var1.m12000() && this.m10000() <= var1.m8000() && this.m8000() >= var1.m10000();
   }

   public boolean m16000(int var1, int var2, boolean var3) {
      return NNNpI.N(this.f1000.B, this.f1000.Z, this.f2000, var1, var2, var3);
   }

   public void m18000(Consumer<Ngq> var1) {
      for (int var2 = this.m12000(); var2 <= this.m2000(); var2++) {
         for (int var3 = this.m10000(); var3 <= this.m8000(); var3++) {
            if (this.N(var2, var3)) {
               var1.accept(new Ngq(var2, var3));
            }
         }
      }
   }

   public int m20000() {
      return this.f2000;
   }
}
