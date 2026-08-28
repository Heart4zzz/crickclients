package rw.net;

import java.io.IOException;
import rw.api.Iface0033;

public interface PacketHandlers<T extends Iface0033> {
   void m2000(PacketBuf var1) throws IOException;

   void m4000(PacketBuf var1);

   void m6000(T var1);
}
