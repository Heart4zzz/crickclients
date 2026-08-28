package rw.core;

import rw.api.Iface0656;
import rw.api.Iface0657;
import rw.api.Iface0658;

public class C1161 {
   public Object[] f1000;
   public Object[] f2000;

   public Iface0656 m6000() {
      return (Iface0656)this.f1000[1];
   }

   public long m8000() {
      return (Long)this.f1000[3];
   }

   private void m12000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[3];
         Object[] var1 = this.f2000;
         var1[1] = 0;
         var1[2] = 0L;
      }

      if (this.f1000 == null) {
         this.f1000 = new Object[8];
         Object[] var2 = this.f1000;
         var2[3] = 0L;
         var2[4] = false;
         var2[5] = 0L;
         var2[6] = false;
         var2[7] = 0L;
      }
   }

   public C1161(OlOqjil var1, int var2, Iface0658 var3, Iface0656 var4, Iface0657 var5, long var6, boolean var8) {
      this.m12000();
      this.f2000[0] = var1;
      Integer var14 = var2;
      this.f2000[1] = var14;
      Long var15 = System.currentTimeMillis();
      this.f2000[2] = var15;
      this.f1000[0] = var3;
      this.f1000[1] = var4;
      this.f1000[2] = var5;
      Long var19 = var6;
      this.f1000[3] = var19;
      Boolean var20 = var8;
      this.f1000[4] = var20;
      Long var21 = m54000((Long)this.f2000[2], var6);
      this.f1000[5] = var21;
   }

   static {
      ntfClinit();
   }

   public Iface0658 m14000() {
      return (Iface0658)this.f1000[0];
   }

   public long m16000() {
      return (Long)this.f1000[5];
   }

   public long m18000() {
      return (Long)this.f2000[2];
   }

   public boolean m26000() {
      return (Boolean)this.f1000[6];
   }

   public long m28000() {
      return this.f1000[6] ? (Long)this.f1000[7] : (Long)this.f1000[5];
   }

   public C1161 m32000() {
      Long var5 = m54000(System.currentTimeMillis(), (Long)this.f1000[3]);
      this.f1000[5] = var5;
      return this;
   }

   public C1161 m34000(Iface0657 var1) {
      return this.m52000(var1).m32000();
   }

   public C1161 m36000(long var1) {
      Long var7 = var1;
      this.f1000[3] = var7;
      return this;
   }

   public Iface0657 m38000() {
      return (Iface0657)this.f1000[2];
   }

   public boolean m42000() {
      return (boolean)(!this.f1000[6] && System.currentTimeMillis() < this.f1000[5] ? 1 : 0);
   }

   public C1161 m44000(Iface0658 var1) {
      this.f1000[0] = var1;
      return this;
   }

   public C1161 m46000(long var1) {
      Long var7 = var1;
      this.f1000[5] = var7;
      return this;
   }

   public C1161 m48000(Iface0656 var1) {
      this.f1000[1] = var1;
      return this;
   }

   public C1161 m52000(Iface0657 var1) {
      this.f1000[2] = var1;
      return this;
   }

   private static long m54000(long var0, long var2) {
      return var2 <= 0L ? Long.MAX_VALUE : var0 + var2;
   }

   public int m56000() {
      return (Integer)this.f2000[1];
   }

   public boolean m58000() {
      return (Boolean)this.f1000[4];
   }

   public void m60000() {
      if (!(Boolean)this.f1000[6] && !(Boolean)this.f1000[4]) {
         Boolean var5 = true;
         this.f1000[6] = var5;
         Long var6 = System.currentTimeMillis();
         this.f1000[7] = var6;
         ((OlOqjil)this.f2000[0]).m2000();
      }
   }
}
