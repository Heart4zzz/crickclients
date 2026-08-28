package rw.data;

import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import rw.net.PacketBuf;

public record Rec0256() {
   public UUID f1000;
   public long f2000;
   public String f3000;
   public String f4000;
   public long f5000;
   public long f6000;

   public String m2000() {
      return this.f4000;
   }

   public Rec0256(long var1, UUID var3, String var4, String var5, long var6, long var8) {
      this.f2000 = var1;
      this.f1000 = var3;
      this.f4000 = var4;
      this.f3000 = var5;
      this.f6000 = var6;
      this.f5000 = var8;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0256,"id;clientId;name;creator;lastUpdate;rowVersion",Rec0256::f2000,Rec0256::f1000,Rec0256::f4000,Rec0256::f3000,Rec0256::f6000,Rec0256::f5000>(
         this, var1
      );
   }

   public long m6000() {
      return this.f5000;
   }

   public UUID m8000() {
      return this.f1000;
   }

   public String m10000() {
      return this.f3000;
   }

   public static Rec0256 m12000(PacketBuf var0) {
      return new Rec0256(var0.m8000(), var0.m40000(), var0.m10000(), var0.m10000(), var0.m8000(), var0.m8000());
   }

   public void m14000(PacketBuf var1) {
      var1.m84000(this.f2000);
      var1.m78000(this.f1000);
      var1.m70000(this.f4000);
      var1.m70000(this.f3000);
      var1.m84000(this.f6000);
      var1.m84000(this.f5000);
   }

   public long m16000() {
      return this.f6000;
   }

   public long m18000() {
      return this.f2000;
   }
}
