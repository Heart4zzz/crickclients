package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import rw.net.PacketHandlers;

public record Rec0294() {
   public int f1000;
   public Supplier<? extends PacketHandlers<?>> f2000;
   public int f3000;

   public int m2000() {
      return this.f3000;
   }

   Rec0294(Supplier<? extends PacketHandlers<?>> var1, int var2, int var3) {
      this.f2000 = var1;
      this.f1000 = var2;
      this.f3000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0294,"supplier;since;untilExclusive",Rec0294::f2000,Rec0294::f1000,Rec0294::f3000>(this, var1);
   }

   public int m8000() {
      return this.f1000;
   }

   boolean m10000(int var1) {
      return (boolean)(var1 >= this.f1000 && var1 < this.f3000 ? 1 : 0);
   }

   public Supplier<? extends PacketHandlers<?>> m14000() {
      return this.f2000;
   }
}
