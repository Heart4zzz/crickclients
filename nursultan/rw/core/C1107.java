package rw.core;

import java.util.Map;
import java.util.UUID;
import rw.data.Rec0222;
import rw.defs.Enum0004;

public class C1107 {
   private static String[] f1000;
   private static byte[] f2000;
   private static boolean[] f3000;
   private static short[] f4000;
   public static Object[] f5000;

   public static void m2000(UUID var0) {
      ((Map)f5000[f4000[4]]).remove(var0);
   }

   private static void m4000() {
      boolean[] var128 = new boolean[3];
      f3000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[(1 | -1) >>> 31] = (boolean)((0 | -0) >>> 31);
      f3000[2] = (boolean)((1 | -1) >>> 31);
   }

   private C1107() {
      throw new UnsupportedOperationException(f1000[1]);
   }

   static {
      ntfClinit();
   }

   private static void m8000() {
      short[] var128 = new short[7];
      f4000[(0 | -0) >>> 31] = (short)((1 | -1) >>> 31);
      f4000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f4000[2] = (short)((1 | -1) >>> 31);
      f4000[3] = (short)((1 | -1) >>> 31);
      f4000[4] = (short)((1 | -1) >>> 31);
      f4000[5] = (short)((1 | -1) >>> 31);
      f4000[6] = 2;
   }

   private static void m14000() {
      byte[] var128 = new byte[(1 | -1) >>> 31];
      f2000[(0 | -0) >>> 31] = 2;
   }

   public static Rec0222 m20000(UUID var0) {
      return (Rec0222)((Map)f5000[f4000[0]]).getOrDefault(var0, (Rec0222)f5000[f4000[1]]);
   }

   private static void m22000() {
      f1000 = new String[2];
      f1000[(0 | -0) >>> 31] = "account.modal.microsoft.processing";
      f1000[(1 | -1) >>> 31] = "This is a utility class and cannot be instantiated";
   }

   public static void m24000(UUID var0, String var1) {
      ((Map)f5000[f4000[5]]).put(var0, new Rec0222((Enum0004)Enum0004.f5000[f4000[6]], var1));
   }

   private static void m26000() {
      f5000 = new Object[f2000[1]];
   }

   public static void m30000(UUID var0) {
      ((Map)f5000[f4000[2]]).put(var0, new Rec0222((Enum0004)Enum0004.f5000[f4000[3]], f1000[0]));
   }
}
