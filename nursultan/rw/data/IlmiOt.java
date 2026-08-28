package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.PermittedSubclassesX;
import rw.net.PacketBuf;

public non-sealed record IlmiOt() implements PermittedSubclassesX {
   public byte[] f1000;
   public Rec0256 f2000;
   public int f3000;

   public int m2000() {
      return this.f3000;
   }

   public IlmiOt(Rec0256 var1, int var2, byte[] var3) {
      this.f2000 = var1;
      this.f3000 = var2;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",IlmiOt,"preset;formatVersion;data",IlmiOt::f2000,IlmiOt::f3000,IlmiOt::f1000>(this, var1);
   }

   public byte[] m8000() {
      return this.f1000;
   }

   public void m10000(PacketBuf var1) {
      this.f2000.m14000(var1);
      var1.m56000(this.f3000);
      var1.m74000(this.f1000);
   }

   public static IlmiOt m12000(PacketBuf var0) {
      return new IlmiOt(Rec0256.m12000(var0), var0.m94000(), var0.m46000(1048576));
   }

   public Rec0256 m14000() {
      return this.f2000;
   }
}
