package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0663;
import rw.net.PacketBuf;

public non-sealed record Rec0058() implements Iface0663 {
   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0058,"">(this, var1);
   }

   public static Rec0058 m4000(PacketBuf var0) {
      return new Rec0058();
   }

   public void m6000(PacketBuf var1) {
   }
}
