package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.PermittedSubclassesX;
import rw.net.PacketBuf;

public non-sealed record Rec0040() implements PermittedSubclassesX {
   public Rec0256 f1000;

   public Rec0040(Rec0256 var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0040,"preset",Rec0040::f1000>(this, var1);
   }

   public void m4000(PacketBuf var1) {
      this.f1000.m14000(var1);
   }

   public Rec0256 m6000() {
      return this.f1000;
   }

   public static Rec0040 m8000(PacketBuf var0) {
      return new Rec0040(Rec0256.m12000(var0));
   }
}
