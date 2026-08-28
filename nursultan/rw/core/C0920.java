package rw.core;

import com.mojang.authlib.properties.Property;

public class C0920 {
   private static boolean[] f1000;
   public Object[] f2000;
   private static short[] f3000;

   private static void m2000() {
      short[] var128 = new short[2];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
   }

   public C0920(Property var1) {
      this.m6000();
      this.f2000[f3000[1]] = var1;
   }

   static {
      ntfClinit();
   }

   private static void m4000() {
      boolean[] var128 = new boolean[(1 | -1) >>> 31];
      f1000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
   }

   private void m6000() {
      if (this.f2000 == null) {
         this.f2000 = new Object[f1000[0]];
         Object[] var1 = this.f2000;
      }
   }

   public Property m12000() {
      return (Property)this.f2000[f3000[0]];
   }
}
