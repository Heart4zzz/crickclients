package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import rw.api.PermittedSubclassesX;
import rw.net.PacketBuf;

public non-sealed record Rec0049() implements PermittedSubclassesX {
   public UUID f1000;
   public int f2000;
   public long f3000;

   public int m2000() {
      return this.f2000;
   }

   public Rec0049(long var1, UUID var3, int var4) {
      this.f3000 = var1;
      this.f1000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0049,"id;clientId;errorCode",Rec0049::f3000,Rec0049::f1000,Rec0049::f2000>(this, var1);
   }

   public void m6000(PacketBuf var1) {
      var1.m84000(this.f3000);
      var1.m78000(this.f1000);
      var1.m56000(this.f2000);
   }

   public long m8000() {
      return this.f3000;
   }

   public UUID m10000() {
      return this.f1000;
   }

   public static Rec0049 m12000(PacketBuf var0) {
      return new Rec0049(var0.m8000(), var0.m40000(), var0.m94000());
   }
}
