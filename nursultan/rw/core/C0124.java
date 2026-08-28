package rw.core;

import rw.api.Iface0028;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0124 implements PacketHandlers<Iface0028> {
   public Object[] f1000;
   private static boolean[] f2000;
   private static short[] f3000;

   private static void m2000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   public C0124() {
      this.m4000();
   }

   public C0124(String var1) {
      this.m4000();
      this.f1000[f3000[3]] = var1;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[f2000[0]];
         Object[] var1 = this.f1000;
      }
   }

   public void m6000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f1000[f3000[0]] = var6;
   }

   private static void m10000() {
      short[] var128 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
   }

   public void m12000(PacketBuf var1) {
      var1.m70000((String)this.f1000[f3000[1]]);
   }

   public String m14000() {
      return (String)this.f1000[f3000[2]];
   }

   public void m20000(Iface0028 var1) {
      var1.m4000(this);
   }
}
