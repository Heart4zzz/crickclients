package rw.api;

import rw.core.C0007;
import rw.data.Rec0003;

public interface NestMembersX {
   Iface0006 m2000(int var1, int var2, int var3);

   static NestMembersX m4000() {
      return (NestMembersX)C0007.f1000[0];
   }

   Iface0003 m6000(Rec0003 var1);

   void m8000(int var1, Iface0003 var2);

   Iface0006 m10000(Iface0003 var1, Iface0003 var2, String var3);

   void m12000(Iface0006 var1, Iface0006 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);
}
