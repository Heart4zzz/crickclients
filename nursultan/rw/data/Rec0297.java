package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0664;
import rw.net.PacketBuf;

public non-sealed record Rec0297() implements Iface0664 {
   public String f1000;
   public long f2000;

   public Rec0297(long var1, String var3) {
      this.f2000 = var1;
      this.f1000 = var3;
   }

   static {
      ntfClinit();
   }

   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0297,"id;newName",Rec0297::f2000,Rec0297::f1000>(this, var1);
   }

   public long m4000() {
      return this.f2000;
   }

   public static Rec0297 m6000(PacketBuf var0) {
      return new Rec0297(var0.m8000(), var0.m10000());
   }

   public void m8000(PacketBuf var1) {
      var1.m84000(this.f2000);
      var1.m70000(this.f1000);
   }

   public String m10000() {
      return this.f1000;
   }
}
