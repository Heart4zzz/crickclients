package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0665;
import rw.net.PacketBuf;

public non-sealed record Rec0292() implements Iface0665 {
   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0292,"">(this, var1);
   }

   public static Rec0292 m4000(PacketBuf var0) {
      return new Rec0292();
   }

   public void m6000(PacketBuf var1) {
   }
}
