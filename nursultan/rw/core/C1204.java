package rw.core;

import rw.api.Iface0025;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C1204 implements PacketHandlers<Iface0025> {
   public Object[] f1000;
   public static Object[] f2000;
   private static byte[] f3000;

   public String m4000() {
      return (String)this.f1000[7];
   }

   public short m6000() {
      return (Short)this.f1000[0];
   }

   public C1204(short var1, byte var2, String var3, String var4, int var5, String var6, String var7, String var8) {
      this.m14000();
      Short var13 = var1;
      this.f1000[0] = var13;
      Byte var14 = var2;
      this.f1000[1] = var14;
      this.f1000[2] = var3;
      this.f1000[3] = var4;
      Integer var17 = var5;
      this.f1000[4] = var17;
      this.f1000[5] = var6;
      this.f1000[6] = var7;
      this.f1000[7] = var8;
   }

   public C1204() {
      this.m14000();
   }

   static {
      ntfClinit();
   }

   public String m8000() {
      return (String)this.f1000[6];
   }

   private static void m10000() {
      f2000 = new Object[]{(byte)1, (byte)2};
   }

   public int m12000() {
      return (Integer)this.f1000[4];
   }

   private void m14000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f3000[0]];
         Object[] var1 = this.f1000;
         var1[0] = (short)0;
         var1[1] = (byte)0;
         var1[f3000[1]] = 0;
      }
   }

   public String m18000() {
      return (String)this.f1000[3];
   }

   public String m24000() {
      return (String)this.f1000[2];
   }

   public void m26000(PacketBuf var1) {
      Short var6 = var1.m4000();
      this.f1000[0] = var6;
      Byte var7 = var1.m58000();
      this.f1000[1] = var7;
      String var8 = var1.m10000();
      this.f1000[2] = var8;
      String var9 = var1.m10000();
      this.f1000[3] = var9;
      Integer var10 = var1.m94000();
      this.f1000[4] = var10;
      String var11 = var1.m10000();
      this.f1000[5] = var11;
      String var12 = var1.m10000();
      this.f1000[6] = var12;
      String var13 = var1.m10000();
      this.f1000[7] = var13;
   }

   private static void m28000() {
      f3000 = new byte[]{8, 4, 2, 2};
   }

   public void m34000(PacketBuf var1) {
      var1.m66000((Short)this.f1000[0]);
      var1.m2000((Byte)this.f1000[1]);
      var1.m70000((String)this.f1000[2]);
      var1.m70000((String)this.f1000[3]);
      var1.m56000((Integer)this.f1000[4]);
      var1.m70000((String)this.f1000[5]);
      var1.m70000((String)this.f1000[6]);
      var1.m70000((String)this.f1000[7]);
   }

   public void m36000(Iface0025 var1) {
      var1.m2000(this);
   }

   public String m38000() {
      return (String)this.f1000[5];
   }

   public byte m42000() {
      return (Byte)this.f1000[1];
   }
}
