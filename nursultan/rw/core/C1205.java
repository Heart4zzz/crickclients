package rw.core;

import rw.api.Iface0029;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C1205 implements PacketHandlers<Iface0029> {
   public Object[] f1000;

   public char m2000() {
      return (Character)this.f1000[0];
   }

   public C1205() {
      this.m10000();
   }

   public C1205(char var1, int var2, String var3, String var4, boolean var5, boolean var6) {
      this.m10000();
      Character var11 = var1;
      this.f1000[0] = var11;
      Integer var12 = var2;
      this.f1000[1] = var12;
      this.f1000[2] = var3;
      this.f1000[3] = var4;
      Boolean var15 = var5;
      this.f1000[4] = var15;
      Boolean var16 = var6;
      this.f1000[5] = var16;
   }

   static {
      ntfClinit();
   }

   private void m10000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[6];
         Object[] var1 = this.f1000;
         var1[0] = '\u0000';
         var1[1] = 0;
         var1[4] = false;
         var1[5] = false;
      }
   }

   public String m12000() {
      return (String)this.f1000[3];
   }

   public int m16000() {
      return (Integer)this.f1000[1];
   }

   public void m18000(PacketBuf var1) {
      Character var6 = var1.m48000();
      this.f1000[0] = var6;
      Integer var7 = Integer.valueOf(var1.m58000());
      this.f1000[1] = var7;
      String var8 = var1.m10000();
      this.f1000[2] = var8;
      String var9 = var1.m10000();
      this.f1000[3] = var9;
      Boolean var10 = var1.m16000();
      this.f1000[4] = var10;
      Boolean var11 = var1.m16000();
      this.f1000[5] = var11;
   }

   public boolean m22000() {
      return (Boolean)this.f1000[4];
   }

   public String m24000() {
      return (String)this.f1000[2];
   }

   public void m28000(Iface0029 var1) {
      var1.m20000(this);
   }

   public void m32000(PacketBuf var1) {
      var1.m86000((Character)this.f1000[0]);
      var1.m2000((Integer)this.f1000[1]);
      var1.m70000((String)this.f1000[2]);
      var1.m70000((String)this.f1000[3]);
      var1.m62000((Boolean)this.f1000[4]);
      var1.m62000((Boolean)this.f1000[5]);
   }

   public boolean m34000() {
      return (Boolean)this.f1000[5];
   }
}
