package rw.api;

import rw.data.IlmiOt;
import rw.data.OllIrksj;
import rw.data.Rec0040;
import rw.data.Rec0041;
import rw.data.Rec0047;
import rw.data.Rec0049;
import rw.data.Rec0052;
import rw.net.PacketBuf;

public sealed interface PermittedSubclassesX permits Rec0047, Rec0052, IlmiOt, Rec0041, OllIrksj, Rec0040, Rec0049 {
   void m2000(PacketBuf var1);
}
