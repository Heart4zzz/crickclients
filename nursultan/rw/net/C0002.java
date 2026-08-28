package rw.net;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import rw.api.Iface0027;

public class C0002 implements PacketHandlers<Iface0027> {
   private static String[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   private static boolean[] f4000;
   public Object[] f5000;
   private static short[] f6000;

   private void m2000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[f2000[0]];
         Object[] var1 = this.f5000;
         var1[f4000[0]] = Byte.valueOf(f4000[1]);
      }
   }

   private static void m6000() {
      short[] var128 = new short[8];
      f6000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f6000[(1 | -1) >>> 31] = 32767;
      f6000[2] = (short)((1 | -1) >>> 31);
      f6000[3] = (short)((0 | -0) >>> 31);
      f6000[4] = (short)((1 | -1) >>> 31);
      f6000[5] = (short)((1 | -1) >>> 31);
      f6000[6] = (short)((1 | -1) >>> 31);
      f6000[7] = (short)((1 | -1) >>> 31);
      short[] var129 = new short[7];
      f3000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = (short)((1 | -1) >>> 31);
      f3000[3] = (short)((0 | -0) >>> 31);
      f3000[4] = (short)((1 | -1) >>> 31);
      f3000[5] = (short)((0 | -0) >>> 31);
      f3000[6] = (short)((1 | -1) >>> 31);
   }

   public C0002(byte var1, PacketBuf var2) {
      this.m2000();
      Byte var7 = var1;
      this.f5000[f3000[5]] = var7;
      this.f5000[f3000[6]] = var2;
   }

   public C0002() {
      this.m2000();
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      boolean[] var128 = new boolean[2];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
   }

   private static void m12000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public byte m16000() {
      return (Byte)this.f5000[f3000[3]];
   }

   public void m18000(PacketBuf var1) throws IOException {
      Byte var7 = var1.m58000();
      this.f5000[f6000[0]] = var7;
      int var2 = var1.m50000();
      if (var2 >= 0 && var2 <= f6000[1]) {
         PacketBuf var8 = new PacketBuf(var1.m72000(var2), var1.m42000());
         this.f5000[f6000[2]] = var8;
      } else {
         throw new IOException(f1000[0]);
      }
   }

   public PacketBuf m26000() {
      return (PacketBuf)this.f5000[f3000[4]];
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void m28000(Iface0027 var1) {
      boolean var4 = false /* VF: Semaphore variable */;

      try {
         var4 = true;
         var1.m30000(this);
         var4 = false;
      } finally {
         if (var4) {
            if ((PacketBuf)this.f5000[f3000[0]] != null && ((PacketBuf)this.f5000[f3000[1]]).m92000().refCnt() > 0) {
               ((PacketBuf)this.f5000[f3000[2]]).m30000();
            }
         }
      }

      if ((PacketBuf)this.f5000[f6000[5]] != null && ((PacketBuf)this.f5000[f6000[6]]).m92000().refCnt() > 0) {
         ((PacketBuf)this.f5000[f6000[7]]).m30000();
      }
   }

   public void m30000(PacketBuf var1) {
      var1.m2000((Byte)this.f5000[f6000[3]]);
      ByteBuf var2 = ((PacketBuf)this.f5000[f6000[4]]).m92000();
      var1.m68000(var2, var2.readerIndex(), var2.readableBytes());
   }

   private static void m32000() {
      f1000 = new String[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = "Payload may not be larger than 32767 bytes";
   }
}
