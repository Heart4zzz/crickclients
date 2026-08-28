package rw.core;

import java.util.UUID;
import rw.defs.Enum0065;

public class OlsmIikp {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static short[] f5000;
   public Object[] f6000;
   public Object[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   private static short[] f11000;

   public int m2000() {
      return (Integer)this.f4000[6];
   }

   public OlsmIikp m6000(long var1) {
      Long var7 = var1;
      this.f4000[3] = var7;
      return this;
   }

   public Enum0065 m8000() {
      return (Enum0065)this.f4000[5];
   }

   private static void m12000() {
      f3000 = new short[]{1, 0, 1};
      f9000 = new short[]{0, 1, 2, 3, 4};
      f1000 = new short[]{5, 6};
      f10000 = new short[]{0, 1, 1, 0, 1};
      f5000 = new short[]{2, 3, 4, 5};
      f11000 = new short[]{6, 0};
      f2000 = new short[]{1, 0, 1, 0};
      f8000 = new short[]{1, 2, 3, 4, 5, 6, 0, 1};
   }

   public OlsmIikp(UUID var1, long var2, String var4, String var5, long var6, long var8, long var10, Enum0065 var12, int var13, boolean var14, byte[] var15) {
      this.m24000();
      this.f7000[0] = var1;
      Long var21 = var2;
      this.f7000[1] = var21;
      this.f4000[0] = var4;
      this.f4000[1] = var5;
      Long var24 = var6;
      this.f4000[2] = var24;
      Long var25 = var8;
      this.f4000[3] = var25;
      Long var26 = var10;
      this.f4000[4] = var26;
      this.f4000[5] = var12;
      Integer var28 = var13;
      this.f4000[6] = var28;
      Boolean var29 = var14;
      this.f6000[0] = var29;
      this.f6000[1] = var15;
   }

   static {
      ntfClinit();
   }

   public long m14000() {
      return (Long)this.f4000[f9000[2]];
   }

   public long m16000() {
      return (Long)this.f7000[1];
   }

   public String m22000() {
      return (String)this.f4000[f9000[0]];
   }

   private void m24000() {
      if (this.f7000 == null) {
         this.f7000 = new Object[2];
         Object[] var1 = this.f7000;
         var1[1] = 0L;
      }

      if (this.f4000 == null) {
         this.f4000 = new Object[7];
         Object[] var2 = this.f4000;
         var2[2] = 0L;
         var2[3] = 0L;
         var2[4] = 0L;
         var2[6] = 0;
      }

      if (this.f6000 == null) {
         this.f6000 = new Object[2];
         Object[] var3 = this.f6000;
         var3[0] = false;
      }
   }

   public byte[] m28000() {
      return (byte[])this.f6000[1];
   }

   public String m30000() {
      return (String)this.f4000[f9000[1]];
   }

   public UUID m32000() {
      return (UUID)this.f7000[0];
   }

   public OlsmIikp m36000(long var1) {
      Long var7 = var1;
      this.f4000[4] = var7;
      return this;
   }

   public OlsmIikp m40000(String var1) {
      this.f4000[1] = var1;
      return this;
   }

   public OlsmIikp m42000(long var1) {
      Long var7 = var1;
      this.f7000[1] = var7;
      return this;
   }

   public long m44000() {
      return (Long)this.f4000[f9000[3]];
   }

   public boolean m46000() {
      return (boolean)(this.f7000[1] <= 0L ? 1 : 0);
   }

   public OlsmIikp m48000(Enum0065 var1) {
      this.f4000[5] = var1;
      return this;
   }

   public boolean m50000() {
      return (Boolean)this.f6000[0];
   }

   public OlsmIikp m52000(boolean var1) {
      Boolean var6 = var1;
      this.f6000[0] = var6;
      return this;
   }

   public OlsmIikp m54000(int var1) {
      Integer var6 = var1;
      this.f4000[6] = var6;
      return this;
   }

   public OlsmIikp m56000(String var1) {
      this.f4000[0] = var1;
      return this;
   }

   public OlsmIikp m58000(long var1) {
      Long var7 = var1;
      this.f4000[2] = var7;
      return this;
   }

   public OlsmIikp m60000(byte[] var1) {
      this.f6000[1] = var1;
      return this;
   }

   public long m64000() {
      return (Long)this.f4000[f9000[4]];
   }
}
