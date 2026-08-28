package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.PermittedSubclassesX;
import rw.net.PacketBuf;

public non-sealed record OllIrksj() implements PermittedSubclassesX {
   public long f1000;

   public OllIrksj(long var1) {
      this.f1000 = var1;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",OllIrksj,"id",OllIrksj::f1000>(this, var1);
   }

   public void m4000(PacketBuf var1) {
      var1.m84000(this.f1000);
   }

   public static OllIrksj m6000(PacketBuf var0) {
      return new OllIrksj(var0.m8000());
   }

   public long m8000() {
      return this.f1000;
   }
}
