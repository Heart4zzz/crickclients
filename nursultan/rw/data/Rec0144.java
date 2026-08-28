package rw.data;

import KDFzREm.NNNjL;
import java.lang.runtime.ObjectMethods;

public record Rec0144() implements NNNjL {
   private final int f1000;
   private final int f2000;
   private final int f3000;

   public int m2000() {
      return this.f2000;
   }

   public Rec0144(int var1, int var2, int var3) {
      this.f1000 = var1;
      this.f2000 = var2;
      this.f3000 = var3;
   }

   public final boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0144,"blockX;blockY;blockZ",Rec0144::f1000,Rec0144::f2000,Rec0144::f3000>(this, var1);
   }

   public int m6000() {
      return this.f3000;
   }

   public int m8000() {
      return this.f1000;
   }
}
