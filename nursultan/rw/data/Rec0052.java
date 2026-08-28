package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.PermittedSubclassesX;
import rw.net.PacketBuf;

public non-sealed record Rec0052() implements PermittedSubclassesX {
   public Rec0256 f1000;

   public Rec0052(Rec0256 var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0052,"preset",Rec0052::f1000>(this, var1);
   }

   public void m4000(PacketBuf var1) {
      this.f1000.m14000(var1);
   }

   public static Rec0052 m6000(PacketBuf var0) {
      return new Rec0052(Rec0256.m12000(var0));
   }

   public Rec0256 m8000() {
      return this.f1000;
   }
}
