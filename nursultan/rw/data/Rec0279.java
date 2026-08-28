package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.function.IntConsumer;
import rw.api.Iface0196;

public record Rec0279() {
   public Iface0196<Boolean> f1000;
   public boolean f2000;
   public IntConsumer f3000;
   public int f4000;
   public boolean f5000;

   public boolean m2000() {
      return this.f5000;
   }

   public Rec0279(int var1, Iface0196<Boolean> var2, IntConsumer var3, boolean var4, boolean var5) {
      this.f4000 = var1;
      this.f1000 = var2;
      this.f3000 = var3;
      this.f2000 = var4;
      this.f5000 = var5;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0279,"color;opened;onChange;alphaAllowed;pastel",Rec0279::f4000,Rec0279::f1000,Rec0279::f3000,Rec0279::f2000,Rec0279::f5000>(
         this, var1
      );
   }

   public IntConsumer m6000() {
      return this.f3000;
   }

   public boolean m8000() {
      return this.f2000;
   }

   public int m10000() {
      return this.f4000;
   }

   public Iface0196<Boolean> m12000() {
      return this.f1000;
   }
}
