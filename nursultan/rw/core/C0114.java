package rw.core;

import rw.api.Iface0027;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0114 implements PacketHandlers<Iface0027> {
   private static byte[] f1000;
   private static float[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static boolean[] f5000;

   private void m2000() {
      if (this.f4000 == null) {
         this.f4000 = new Object[f1000[0]];
         Object[] var1 = this.f4000;
         var1[f5000[0]] = f2000[0];
      }
   }

   private static void m6000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = 2;
   }

   public C0114(String var1, float var2) {
      this.m2000();
      this.f4000[f3000[6]] = var1;
      Float var8 = var2;
      this.f4000[f3000[7]] = var8;
   }

   public C0114() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f5000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private static void m12000() {
      float[] var128 = new float[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = Float.intBitsToFloat(0);
   }

   public void m14000(PacketBuf var1) {
      String var6 = var1.m10000();
      this.f4000[f3000[0]] = var6;
      Float var7 = var1.m20000();
      this.f4000[f3000[1]] = var7;
   }

   public String m16000() {
      return (String)this.f4000[f3000[4]];
   }

   public float m20000() {
      return (Float)this.f4000[f3000[5]];
   }

   public void m22000(Iface0027 var1) {
      var1.m20000(this);
   }

   public void m26000(PacketBuf var1) {
      var1.m70000((String)this.f4000[f3000[2]]);
      var1.m64000((Float)this.f4000[f3000[3]]);
   }

   private static void m30000() {
      short[] var128 = new short[8];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
      f3000[5] = (short)((1 | -1) >>> 31);
      f3000[6] = (short)((0 | -0) >>> 31);
      f3000[7] = (short)((1 | -1) >>> 31);
   }
}
