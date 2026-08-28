package rw.core;

import rw.api.Iface0027;
import rw.data.IltrpOnqk;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0110 implements PacketHandlers<Iface0027> {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;

   private static void m2000() {
      short[] var128 = new short[6];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[2] = (short)((0 | -0) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
      f3000[5] = (short)((0 | -0) >>> 31);
   }

   public C0110() {
      this.m4000();
   }

   public C0110(IltrpOnqk[] var1) {
      this.m4000();
      this.f2000[f3000[5]] = var1;
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[2]];
         Object[] var1 = this.f2000;
      }
   }

   private static void m6000() {
      boolean[] var128 = new boolean[3];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[2] = (boolean)((1 | -1) >>> 31);
   }

   public void m10000(PacketBuf var1) {
      int var2 = var1.m94000();
      IltrpOnqk[] var11 = new IltrpOnqk[var2];
      this.f2000[f3000[0]] = var11;

      for (int var3 = f1000[0]; var3 < var2; var3++) {
         String var4 = var1.m10000();
         String var5 = var1.m10000();
         boolean var6 = var1.m16000();
         ((IltrpOnqk[])this.f2000[f3000[1]])[var3] = new IltrpOnqk(var4, var5, var6);
      }
   }

   public void m12000(Iface0027 var1) {
      var1.m14000(this);
   }

   public IltrpOnqk[] m16000() {
      return (IltrpOnqk[])this.f2000[f3000[4]];
   }

   public void m20000(PacketBuf var1) {
      var1.m56000(((IltrpOnqk[])this.f2000[f3000[2]]).length);
      IltrpOnqk[] var2 = (IltrpOnqk[])this.f2000[f3000[3]];
      int var3 = var2.length;

      for (int var4 = f1000[1]; var4 < var3; var4++) {
         IltrpOnqk var5 = var2[var4];
         var1.m70000(var5.m8000());
         var1.m70000(var5.m12000());
         var1.m62000(var5.m2000());
      }
   }
}
