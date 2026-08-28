package rw.api;

import rw.data.Iltnotrs;
import rw.data.Rec0044;
import rw.data.Rec0045;
import rw.data.Rec0051;
import rw.net.PacketBuf;

public sealed interface PermittedSubclasses permits Rec0045, Iltnotrs, Rec0051, Rec0044 {
   void m2000(PacketBuf var1);
}
