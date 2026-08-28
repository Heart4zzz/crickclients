package rw.defs;

import KDFzREm.NAC;
import java.util.function.Consumer;
import rw.core.Base1173;

public enum Enum0091 {
   private static String[] f1000;
   private static byte[] f2000;
   private static short[] f3000;
   public Object[] f4000;
   private static byte[] f5000;
   private static boolean[] f6000;
   private static short[] f7000;
   private static boolean[] f8000;
   public static Object[] f9000;

   private static void m6000() {
      byte[] var128 = new byte[8];
      f5000[(0 | -0) >>> 31] = 4;
      f5000[(1 | -1) >>> 31] = 2;
      f5000[2] = 3;
      f5000[3] = 2;
      f5000[4] = 2;
      f5000[5] = 3;
      f5000[6] = 3;
      f5000[7] = 4;
      byte[] var129 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 5;
   }

   private void m8000() {
      this.f4000 = new Object[f6000[2]];
   }

   private Enum0091(Base1173 var3) {
      this.m8000();
      this.f4000[f7000[4]] = var3;
   }

   static {
      ntfClinit();
   }

   public static Enum0091[] m10000() {
      return (Enum0091[])((Enum0091[])f9000[f7000[0]]).clone();
   }

   private static void m12000() {
      short[] var128 = new short[6];
      f7000[(0 | -0) >>> 31] = 4;
      f7000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f7000[2] = 3;
      f7000[3] = (short)((0 | -0) >>> 31);
      f7000[4] = (short)((0 | -0) >>> 31);
      f7000[5] = (short)((0 | -0) >>> 31);
      short[] var129 = new short[4];
      f3000[(0 | -0) >>> 31] = (short)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (short)((1 | -1) >>> 31);
      f3000[2] = 2;
      f3000[3] = 3;
   }

   private static void m14000() {
      f1000 = new String[4];
      f1000[(0 | -0) >>> 31] = "HUB";
      f1000[(1 | -1) >>> 31] = "GRIEF";
      f1000[2] = "ANARCHY";
      f1000[3] = "NONE";
   }

   private static void m18000() {
      boolean[] var128 = new boolean[7];
      f8000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f8000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f8000[2] = (boolean)((0 | -0) >>> 31);
      f8000[3] = (boolean)((0 | -0) >>> 31);
      f8000[4] = (boolean)((1 | -1) >>> 31);
      f8000[5] = (boolean)((0 | -0) >>> 31);
      f8000[6] = (boolean)((0 | -0) >>> 31);
      boolean[] var129 = new boolean[3];
      f6000[(0 | -0) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f6000[2] = (boolean)((1 | -1) >>> 31);
   }

   private static void m20000() {
      f9000 = new Object[f2000[1]];
   }

   public Base1173 m30000() {
      return (Base1173)this.f4000[f7000[5]];
   }

   public static void m34000(NAC<?> var0, Consumer<Enum0091> var1) {
      Enum0091[] var2 = m10000();
      int var3 = var2.length;

      for (int var4 = f8000[2]; var4 < var3; var4++) {
         Enum0091 var5 = var2[var4];
         if (var5 != (Enum0091)f9000[f7000[2]] && ((Base1173)var5.f4000[f7000[3]]).m2000(var0)) {
            var1.accept(var5);
            break;
         }
      }
   }

   public boolean m36000() {
      return this == (Enum0091)f9000[f7000[1]] ? f8000[0] : f8000[1];
   }
}
