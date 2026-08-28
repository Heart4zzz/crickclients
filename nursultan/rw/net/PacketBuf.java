package rw.net;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public record PacketBuf() {
   public ByteBuf f1000;
   private static String[] f2000;
   public short f3000;
   public static Object[] f4000;

   public void m2000(int var1) {
      this.f1000.writeByte(var1);
   }

   public short m4000() {
      return this.f1000.readShort();
   }

   public long m8000() {
      return this.f1000.readLong();
   }

   public String m10000() {
      return this.m24000(32767);
   }

   private static void m12000() {
      f4000 = new Object[]{32767};
   }

   public PacketBuf(ByteBuf var1) {
      this(var1, (short)16);
   }

   public PacketBuf(ByteBuf var1, short var2) {
      this.f1000 = var1;
      this.f3000 = var2;
   }

   static {
      ntfClinit();
   }

   public boolean m14000(Object var1) {
      return ObjectMethods.bootstrap<"equals",PacketBuf,"parent;protocolVersion",PacketBuf::f1000,PacketBuf::f3000>(this, var1);
   }

   public boolean m16000() {
      return this.f1000.readBoolean();
   }

   public float m20000() {
      return this.f1000.readFloat();
   }

   public String m24000(int var1) {
      return C0011.m8000(this.f1000, var1);
   }

   public double m26000() {
      return this.f1000.readDouble();
   }

   public void m30000() {
      this.f1000.release();
   }

   public byte[] m34000() {
      int var1 = this.m94000();
      byte[] var2 = new byte[var1];
      this.f1000.readBytes(var2);
      return var2;
   }

   private static void m36000() {
      f2000 = new String[]{"The received byte array length is less than zero! Weird length!"};
   }

   public UUID m40000() {
      long var1 = this.m8000();
      long var3 = this.m8000();
      return new UUID(var1, var3);
   }

   public short m42000() {
      return this.f3000;
   }

   public byte[] m46000(int var1) {
      int var2 = this.m94000();
      if (var2 < 0) {
         throw new DecoderException(f2000[0]);
      } else if (var2 > var1) {
         throw new DecoderException("The received byte array length is longer than maximum allowed (" + var2 + " > " + var1 + ")");
      } else {
         int var3 = this.f1000.readableBytes();
         if (var2 > var3) {
            throw new DecoderException("Not enough bytes in buffer, expected " + var2 + ", but got " + var3);
         } else {
            byte[] var4 = new byte[var2];
            this.f1000.readBytes(var4);
            return var4;
         }
      }
   }

   public char m48000() {
      return this.f1000.readChar();
   }

   public int m50000() {
      return this.f1000.readableBytes();
   }

   public PacketBuf m52000(ByteBuf var1) {
      return this.f1000 == var1 ? this : new PacketBuf(var1, this.f3000);
   }

   public void m56000(int var1) {
      this.f1000.writeInt(var1);
   }

   public byte m58000() {
      return this.f1000.readByte();
   }

   public void m60000(ByteBuf var1) {
      this.f1000.writeBytes(var1);
   }

   public void m62000(boolean var1) {
      this.f1000.writeBoolean(var1);
   }

   public void m64000(float var1) {
      this.f1000.writeFloat(var1);
   }

   public void m66000(short var1) {
      this.f1000.writeShort(var1);
   }

   public void m68000(ByteBuf var1, int var2, int var3) {
      this.f1000.writeBytes(var1, var2, var3);
   }

   public PacketBuf m70000(String var1) {
      C0011.m10000(this.f1000, var1, 32767);
      return this;
   }

   public ByteBuf m72000(int var1) {
      return this.f1000.readBytes(var1);
   }

   public void m74000(byte[] var1) {
      this.m56000(var1.length);
      this.f1000.writeBytes(var1);
   }

   public String[] m76000() {
      int var1 = this.m94000();
      String[] var2 = new String[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = this.m10000();
      }

      return var2;
   }

   public void m78000(UUID var1) {
      this.m84000(var1.getMostSignificantBits());
      this.m84000(var1.getLeastSignificantBits());
   }

   public void m80000(Enum<?> var1) {
      this.m56000(var1.ordinal());
   }

   public void m82000(String[] var1) {
      this.m56000(var1.length);

      for (String var5 : var1) {
         this.m70000(var5);
      }
   }

   public void m84000(long var1) {
      this.f1000.writeLong(var1);
   }

   public void m86000(char var1) {
      this.f1000.writeChar(var1);
   }

   public <T extends Enum<T>> T m88000(Class<T> var1) {
      int var2 = this.m94000();
      return (T)var1.getEnumConstants()[var2];
   }

   public void m90000(double var1) {
      this.f1000.writeDouble(var1);
   }

   public ByteBuf m92000() {
      return this.f1000;
   }

   public int m94000() {
      return this.f1000.readInt();
   }
}
