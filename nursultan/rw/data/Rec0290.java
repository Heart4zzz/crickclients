package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0664;
import rw.net.PacketBuf;

public non-sealed record Rec0290() implements Iface0664 {
   public int f1000;
   public byte[] f2000;
   public long f3000;

   public long m2000() {
      return this.f3000;
   }

   public Rec0290(long var1, int var3, byte[] var4) {
      this.f3000 = var1;
      this.f1000 = var3;
      this.f2000 = var4;
   }

   static {
      ntfClinit();
   }

   public boolean m4000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0290,"id;formatVersion;data",Rec0290::f3000,Rec0290::f1000,Rec0290::f2000>(this, var1);
   }

   public byte[] m8000() {
      return this.f2000;
   }

   public static Rec0290 m10000(PacketBuf var0) {
      return new Rec0290(var0.m8000(), var0.m94000(), var0.m46000(1048576));
   }

   public void m14000(PacketBuf var1) {
      var1.m84000(this.f3000);
      var1.m56000(this.f1000);
      var1.m74000(this.f2000);
   }

   public int m16000() {
      return this.f1000;
   }
}
