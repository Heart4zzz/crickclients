package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0119 implements PacketHandlers<Iface0027> {
   private static short[] f1000;
   private static boolean[] f2000;
   public Object[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0119(String var1) {
      this.m4000();
      this.f3000[f1000[3]] = var1;
   }

   public C0119() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f3000 == null) {
         this.f3000 = new Object[f2000[0]];
         Object[] var1 = this.f3000;
      }
   }

   public void m6000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f3000[f1000[0]] = var6;
   }

   private static void m8000() {
      short[] var128 = new short[4];
      f1000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f1000[2] = (short)((0 | -0) >>> 31);
      f1000[3] = (short)((0 | -0) >>> 31);
   }

   public void m12000(PacketBuf var1) {
      var1.m70000((String)this.f3000[f1000[1]]);
   }

   public String m14000() {
      return (String)this.f3000[f1000[2]];
   }

   public void m18000(Iface0027 var1) {
      var1.m16000(this);
   }
}
