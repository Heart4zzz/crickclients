package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.defs.Nuker;
import rw.net.PacketBuf;

public record Rec0168() {
   public int f1000;
   public long f2000;

   public int m2000() {
      return this.f1000;
   }

   public Rec0168(int var1, long var2) {
      this.f1000 = var1;
      this.f2000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0168,"kindId;updatedAt",Rec0168::f1000,Rec0168::f2000>(this, var1);
   }

   public static Rec0168 m6000(PacketBuf var0) {
      return new Rec0168(var0.m94000(), var0.m8000());
   }

   public long m8000() {
      return this.f2000;
   }

   public void m10000(PacketBuf var1) {
      var1.m56000(this.f1000);
      var1.m84000(this.f2000);
   }

   public Nuker m12000() {
      return Nuker.m34000(this.f1000);
   }
}
