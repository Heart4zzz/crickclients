package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0115 implements PacketHandlers<Iface0027> {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;

   private void m2000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[0]];
         Object[] var1 = this.f2000;
      }
   }

   public C0115() {
      this.m2000();
   }

   public C0115(String[] var1) {
      this.m2000();
      this.f2000[f3000[3]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
   }

   public void m6000(PacketBuf var1) {
      String[] var6 = var1.m76000();
      this.f2000[f3000[0]] = var6;
   }

   private static void m10000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public String[] m12000() {
      return (String[])this.f2000[f3000[2]];
   }

   public void m18000(PacketBuf var1) {
      var1.m82000((String[])this.f2000[f3000[1]]);
   }

   public void m20000(Iface0027 var1) {
      var1.m2000(this);
   }
}
