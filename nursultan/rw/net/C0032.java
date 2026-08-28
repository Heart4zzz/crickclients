package rw.net;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import rw.api.Iface0029;

public class C0032 implements PacketHandlers<Iface0029> {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;
   private static String[] f4000;
   private static short[] f5000;
   private static byte[] f6000;

   private void m4000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f6000[0]];
         Object[] var1 = this.f2000;
         var1[f1000[0]] = Integer.valueOf(f1000[1]);
      }
   }

   private static void m6000() {
      f4000 = new String[(1 | -1) >>> 31];
      f4000[(0 | -0) >>> 31] = "Payload may not be larger than 32767 bytes";
   }

   public C0032() {
      this.m4000();
   }

   public C0032(int var1, PacketBuf var2) {
      this.m4000();
      Integer var7 = var1;
      this.f2000[f3000[6]] = var7;
      this.f2000[f3000[7]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f6000[(0 | -0) >>> 31] = 2;
   }

   private static void m12000() {
      boolean[] var128 = new boolean[2];
      f1000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f1000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   public int m14000() {
      return (Integer)this.f2000[f3000[4]];
   }

   public void m16000(PacketBuf var1) throws IOException {
      Integer var7 = Integer.valueOf(var1.m58000());
      this.f2000[f5000[0]] = var7;
      int var2 = var1.m50000();
      if (var2 >= 0 && var2 <= f5000[1]) {
         PacketBuf var8 = new PacketBuf(var1.m72000(var2), var1.m42000());
         this.f2000[f5000[2]] = var8;
      } else {
         throw new IOException(f4000[0]);
      }
   }

   public PacketBuf m26000() {
      return (PacketBuf)this.f2000[f3000[5]];
   }

   public void m28000(PacketBuf var1) {
      var1.m2000((Integer)this.f2000[f5000[3]]);
      ByteBuf var2 = ((PacketBuf)this.f2000[f5000[4]]).m92000();
      var1.m68000(var2, var2.readerIndex(), var2.readableBytes());
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void m30000(Iface0029 var1) {
      boolean var4 = false /* VF: Semaphore variable */;

      try {
         var4 = true;
         var1.m6000(this);
         var4 = false;
      } finally {
         if (var4) {
            if ((PacketBuf)this.f2000[f3000[1]] != null && ((PacketBuf)this.f2000[f3000[2]]).m92000().refCnt() > 0) {
               ((PacketBuf)this.f2000[f3000[3]]).m30000();
            }
         }
      }

      if ((PacketBuf)this.f2000[f5000[5]] != null && ((PacketBuf)this.f2000[f5000[6]]).m92000().refCnt() > 0) {
         ((PacketBuf)this.f2000[f3000[0]]).m30000();
      }
   }

   private static void m32000() {
      short[] var128 = new short[7];
      f5000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f5000[(1 | -1) >>> 31] = 32767;
      f5000[2] = (short)((1 | -1) >>> 31);
      f5000[3] = (short)((0 | -0) >>> 31);
      f5000[4] = (short)((1 | -1) >>> 31);
      f5000[5] = (short)((1 | -1) >>> 31);
      f5000[6] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[8];
      f3000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = (short)((1 | -1) >>> 31);
      f3000[4] = (short)((0 | -0) >>> 31);
      f3000[5] = (short)((1 | -1) >>> 31);
      f3000[6] = (short)((0 | -0) >>> 31);
      f3000[7] = (short)((1 | -1) >>> 31);
   }
}
