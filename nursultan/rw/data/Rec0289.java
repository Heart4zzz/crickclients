package rw.data;

import java.lang.runtime.ObjectMethods;
import rw.api.Iface0664;
import rw.net.PacketBuf;

public non-sealed record Rec0289() implements Iface0664 {
   public boolean m2000(Object var1) {
      return ObjectMethods.bootstrap<"equals",Rec0289,"">(this, var1);
   }

   public static Rec0289 m4000(PacketBuf var0) {
      return new Rec0289();
   }

   public void m6000(PacketBuf var1) {
   }
}
