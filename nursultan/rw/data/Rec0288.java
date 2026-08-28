package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0641;

public record Rec0288() {
   public Iface0641 f1000;
   public boolean f2000;
   public boolean f3000;
   public boolean f4000;
   public int f5000;
   public boolean f6000;
   public double f7000;
   public boolean f8000;

   public boolean m2000() {
      return this.f4000;
   }

   public boolean m4000() {
      return this.f2000;
   }

   public Rec0288(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, double var6, int var8, Iface0641 var9) {
      this.f2000 = var1;
      this.f6000 = var2;
      this.f3000 = var3;
      this.f4000 = var4;
      this.f8000 = var5;
      this.f7000 = var6;
      this.f5000 = var8;
      this.f1000 = var9;
   }

   static {
      ntfClinit();
   }

   public boolean m6000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0288,"sneaking;sprinting;jumping;water;ground;fallDistance;jumpingCooldown;clientEntity",Rec0288::f2000,Rec0288::f6000,Rec0288::f3000,Rec0288::f4000,Rec0288::f8000,Rec0288::f7000,Rec0288::f5000,Rec0288::f1000>(
         this, var1
      );
   }

   public boolean m8000() {
      return this.f8000;
   }

   public double m10000() {
      return this.f7000;
   }

   public Iface0641 m12000() {
      return this.f1000;
   }

   public boolean m14000() {
      return this.f6000;
   }

   public int m16000() {
      return this.f5000;
   }

   public boolean m20000() {
      return this.f3000;
   }
}
