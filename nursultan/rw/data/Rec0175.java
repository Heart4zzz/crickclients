package rw.data;

import KDFzREm.NbL;
import java.lang.runtime.ObjectMethods;

public record Rec0175() {
   public NbL f1000;
   public int f2000;
   public boolean f3000;
   public int f4000;
   public int f5000;
   public int f6000;

   public NbL m2000() {
      return this.f1000;
   }

   Rec0175(int var1, int var2, NbL var3, int var4, boolean var5, int var6) {
      this.f5000 = var1;
      this.f4000 = var2;
      this.f1000 = var3;
      this.f2000 = var4;
      this.f3000 = var5;
      this.f6000 = var6;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0175,"hotbarSlot;inventorySlot;hand;pitch;jump;delayAfter",Rec0175::f5000,Rec0175::f4000,Rec0175::f1000,Rec0175::f2000,Rec0175::f3000,Rec0175::f6000>(
         this, var1
      );
   }

   public int m6000() {
      return this.f5000;
   }

   public int m8000() {
      return this.f4000;
   }

   public boolean m10000() {
      return this.f3000;
   }

   public int m12000() {
      return this.f2000;
   }

   public int m14000() {
      return this.f6000;
   }
}
