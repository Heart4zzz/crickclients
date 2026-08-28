package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0606;

public record Rec0174() {
   public Iface0606 f1000;
   public boolean f2000;
   public int f3000;
   public int f4000;

   public int m2000() {
      return this.f3000;
   }

   Rec0174(Iface0606 var1, int var2, boolean var3, int var4) {
      this.f1000 = var1;
      this.f3000 = var2;
      this.f2000 = var3;
      this.f4000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0174,"filter;pitch;jump;delayAfter",Rec0174::f1000,Rec0174::f3000,Rec0174::f2000,Rec0174::f4000>(this, var1);
   }

   public int m6000() {
      return this.f4000;
   }

   public Iface0606 m8000() {
      return this.f1000;
   }

   public boolean m10000() {
      return this.f2000;
   }
}
