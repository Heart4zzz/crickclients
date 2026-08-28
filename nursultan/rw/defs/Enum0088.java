package rw.defs;

import KDFzREm.NNBj;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Optional;
import rw.setting.C0161;

public enum Enum0088 {
   public Object[] f1000;
   private static short[] f2000;
   public static Object[] f3000;
   private static boolean[] f4000;
   private static String[] f5000;
   private static byte[] f6000;
   private static byte[] f7000;

   private static void m2000() {
      short[] var128 = new short[8];
      f2000[(0 | -0) >>> 31] = 4;
      f2000[(1 | -1) >>> 31] = (short)((0 | -0) >>> 31);
      f2000[2] = (short)((0 | -0) >>> 31);
      f2000[3] = (short)((0 | -0) >>> 31);
      f2000[4] = (short)((0 | -0) >>> 31);
      f2000[5] = (short)((1 | -1) >>> 31);
      f2000[6] = 2;
      f2000[7] = 3;
   }

   private static void m8000() {
      boolean[] var128 = new boolean[7];
      f4000[(0 | -0) >>> 31] = (boolean)((0 | -0) >>> 31);
      f4000[(1 | -1) >>> 31] = (boolean)((1 | -1) >>> 31);
      f4000[2] = (boolean)((0 | -0) >>> 31);
      f4000[3] = (boolean)((0 | -0) >>> 31);
      f4000[4] = (boolean)((1 | -1) >>> 31);
      f4000[5] = (boolean)((1 | -1) >>> 31);
      f4000[6] = (boolean)((1 | -1) >>> 31);
   }

   private Enum0088(String var3) {
      this.m34000();
      this.f1000[f2000[1]] = var3;
   }

   static {
      ntfClinit();
   }

   public static Enum0088[] m12000() {
      return (Enum0088[])((Enum0088[])f3000[f2000[0]]).clone();
   }

   private static void m14000() {
      f3000 = new Object[f6000[1]];
   }

   private static void m24000() {
      byte[] var128 = new byte[8];
      f7000[(0 | -0) >>> 31] = 4;
      f7000[(1 | -1) >>> 31] = 2;
      f7000[2] = 3;
      f7000[3] = 2;
      f7000[4] = 2;
      f7000[5] = 3;
      f7000[6] = 3;
      f7000[7] = 4;
      byte[] var129 = new byte[(1 | -1) >>> 31];
      f6000[(0 | -0) >>> 31] = 5;
   }

   private static void m26000() {
      f5000 = new String[8];
      f5000[(0 | -0) >>> 31] = "ENABLE";
      f5000[(1 | -1) >>> 31] = "enable.ogg";
      f5000[2] = "DISABLE";
      f5000[3] = "disable.ogg";
      f5000[4] = "IRC";
      f5000[5] = "irc.ogg";
      f5000[6] = "PLAYER_PING";
      f5000[7] = "playerping.ogg";
   }

   private void m34000() {
      this.f1000 = new Object[f4000[6]];
   }

   public static Optional<Enum0088> m40000(String var0) {
      return Arrays.stream(m12000()).filter(var1 -> ((String)var1.f1000[f2000[3]]).startsWith(var0)).findFirst().or(Optional::empty);
   }

   public InputStream m44000() throws IOException {
      NNBj var1 = C0161.m6000("sounds/" + (String)this.f1000[f2000[2]]);
      return var1.method_14482();
   }
}
