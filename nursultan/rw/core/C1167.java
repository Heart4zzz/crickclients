package rw.core;

import rw.api.Iface0656;
import rw.api.Iface0657;
import rw.api.Iface0658;

public class C1167 {
   private static short[] f1000;
   public static Object[] f2000;
   private static long[] f3000;
   private static short[] f4000;
   public Object[] f5000;

   public C1167 m4000() {
      return this.m42000(Iface0658.f2000);
   }

   public C1167 m6000() {
      return this.m38000(0L);
   }

   public C1167(OlOqjil var1) {
      this.m10000();
      Iface0658 var6 = Iface0658.f1000;
      this.f5000[1] = var6;
      Long var7 = 5000L;
      this.f5000[4] = var7;
      this.f5000[0] = var1;
   }

   static {
      ntfClinit();
   }

   public C1167 m8000() {
      return this.m42000(Iface0658.f1000);
   }

   private void m10000() {
      if (this.f5000 == null) {
         this.f5000 = new Object[6];
         Object[] var1 = this.f5000;
         var1[4] = 0L;
         var1[5] = false;
      }
   }

   public C1161 m14000() {
      return this.m40000(0);
   }

   private static void m20000() {
      f1000 = new short[]{1, 4, 0, 0, 0, 1, 2, 3};
      f4000 = new short[]{4, 5, 1, 2, 3, 4, 5};
   }

   public C1167 m24000() {
      return this.m42000(Iface0658.f4000);
   }

   public C1167 m26000() {
      return this.m42000(Iface0658.f3000);
   }

   private static void m32000() {
      f3000 = new long[]{5000L, 0L, 0L, 0L, 5000L};
   }

   public C1167 m34000(Iface0657 var1) {
      this.f5000[3] = var1;
      return this;
   }

   public C1167 m36000(boolean var1) {
      Boolean var6 = var1;
      this.f5000[5] = var6;
      return this;
   }

   public C1167 m38000(long var1) {
      Long var7 = var1;
      this.f5000[4] = var7;
      return this;
   }

   public C1161 m40000(int var1) {
      return new C1161(
         (OlOqjil)this.f5000[0],
         var1,
         (Iface0658)this.f5000[1],
         (Iface0656)this.f5000[2],
         (Iface0657)this.f5000[3],
         (Long)this.f5000[4],
         (Boolean)this.f5000[5]
      );
   }

   public C1167 m42000(Iface0658 var1) {
      this.f5000[1] = var1;
      return this;
   }

   public int m44000() {
      return ((OlOqjil)this.f5000[0]).m34000(this);
   }

   public C1167 m46000(Iface0656 var1) {
      this.f5000[2] = var1;
      return this;
   }

   private static void m48000() {
      f2000 = new Object[]{5000L};
   }

   public C1167 m52000() {
      return this.m36000(true).m38000(0L);
   }
}
